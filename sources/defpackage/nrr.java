package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrr implements npd {
    public final npc a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public volatile int d;
    private final Context e;
    private final nql f;
    private final ltm g;
    private nsb h;
    private int i;

    public nrr(Context context, nql nqlVar, npc npcVar, ltm ltmVar, boolean z) {
        lti.c(nqlVar.e != -9223372036854775807L);
        int i = nqlVar.f;
        lti.c(false);
        this.e = context;
        this.f = nqlVar;
        this.a = npcVar;
        this.g = ltmVar;
        this.b = z;
        this.c = Executors.newSingleThreadScheduledExecutor();
        this.i = 0;
    }

    public final void a(final Bitmap bitmap, final lqc lqcVar) {
        try {
            nsb nsbVar = this.h;
            if (nsbVar == null) {
                this.h = ((nsi) this.a).i(lqcVar);
                this.c.schedule(new Runnable() { // from class: nrm
                    @Override // java.lang.Runnable
                    public final void run() {
                        nrr.this.a(bitmap, lqcVar);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
                return;
            }
            nql nqlVar = this.f;
            long j = nqlVar.e;
            int i = nqlVar.f;
            if (((nsh) nsbVar).a.h(bitmap, new ltr(new ltr(j).a)) != 1) {
                this.c.schedule(new Runnable() { // from class: nrn
                    @Override // java.lang.Runnable
                    public final void run() {
                        nrr.this.a(bitmap, lqcVar);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            } else {
                this.d = 100;
                this.h.f();
            }
        } catch (RuntimeException e) {
            this.a.b(new nrd("Asset loader error", e, 1000));
        } catch (nrd e2) {
            this.a.b(e2);
        }
    }

    @Override // defpackage.npd
    public final int e(nrz nrzVar) {
        if (this.i == 2) {
            nrzVar.a = this.d;
        }
        return this.i;
    }

    @Override // defpackage.npd
    public final enhk f() {
        return enoz.a;
    }

    @Override // defpackage.npd
    public final void g() {
        this.i = 0;
        this.c.shutdownNow();
    }

    @Override // defpackage.npd
    public final void h() {
        ListenableFuture h;
        this.i = 2;
        this.a.a(this.f.e);
        this.a.c(1);
        String e = ntl.e(this.e, this.f.a);
        if (e == null || !lvf.W(e)) {
            h = erqt.h(new lrg("Attempted to load a Bitmap from unsupported MIME type: ".concat(String.valueOf(e)), null, false, 1));
        } else {
            ltm ltmVar = this.g;
            lqt lqtVar = this.f.a.b;
            lti.f(lqtVar);
            final lwq lwqVar = (lwq) ltmVar;
            final Uri uri = lqtVar.a;
            h = lwqVar.a.submit(new Callable() { // from class: lwp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    lwq lwqVar2 = lwq.this;
                    lwx a = ((lww) lwqVar2.b).a();
                    Uri uri2 = uri;
                    BitmapFactory.Options options = lwqVar2.c;
                    try {
                        a.b(new lwv(uri2, 1, null, Collections.EMPTY_MAP, 0L, 0));
                        byte[] bArr = new byte[1024];
                        int i = 0;
                        int i2 = 0;
                        while (i != -1) {
                            int length = bArr.length;
                            if (i2 == length) {
                                bArr = Arrays.copyOf(bArr, length + length);
                            }
                            i = a.a(bArr, i2, bArr.length - i2);
                            if (i != -1) {
                                i2 += i;
                            }
                        }
                        byte[] copyOf = Arrays.copyOf(bArr, i2);
                        return lwi.a(copyOf, copyOf.length, options, 4096);
                    } finally {
                        a.d();
                    }
                }
            });
        }
        erqt.r(h, new nrp(this), this.c);
    }
}
