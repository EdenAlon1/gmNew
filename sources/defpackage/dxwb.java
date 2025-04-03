package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxwb implements efei {
    public final AtomicLong a = new AtomicLong();
    final /* synthetic */ dxwc b;
    public final cbka c;
    private final Uri d;
    private long e;

    public dxwb(dxwc dxwcVar, Uri uri, cbka cbkaVar) {
        this.b = dxwcVar;
        this.d = uri;
        this.c = cbkaVar;
        this.e = dxwcVar.c.a();
    }

    @Override // defpackage.efei
    public final void a(int i) {
        long j = i;
        if (this.b.c.a() - this.e < 1000) {
            this.a.getAndAdd(j);
            dxth.m("%s: Received data for uri = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.d, Long.valueOf(j), Long.valueOf(this.a.get()));
            return;
        }
        synchronized (dxwc.class) {
            this.e = this.b.c.a();
            this.a.getAndAdd(j);
            dxth.m("%s: Received data for uri = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.d, Long.valueOf(j), Long.valueOf(this.a.get()));
            if (this.b.b.containsKey(this.d)) {
                this.b.a.execute(new Runnable() { // from class: dxwa
                    @Override // java.lang.Runnable
                    public final void run() {
                        dxwb dxwbVar = dxwb.this;
                        final long j2 = dxwbVar.a.get();
                        csjb c = cbkc.a.c();
                        c.I("Download progress, notifying callback");
                        cbka cbkaVar = dxwbVar.c;
                        final Uri uri = cbkaVar.c;
                        c.M(VCardConstants.PROPERTY_URL, uri.toString());
                        c.z("progress", j2);
                        final long j3 = cbkaVar.e;
                        c.z("expected size", j3);
                        c.r();
                        cbjw cbjwVar = cbkaVar.b;
                        try {
                            for (final cblo cbloVar : ((cbkt) cbjwVar).b) {
                                ((cbkt) cbjwVar).c(new Runnable() { // from class: cbkr
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        long j4 = j2;
                                        cblo cbloVar2 = cblo.this;
                                        Uri uri2 = uri;
                                        try {
                                            cbloVar2.c(uri2.toString(), j4, j3);
                                        } catch (RuntimeException e) {
                                            cbkt.a.s("Error while calling #onProgress", e);
                                        }
                                    }
                                });
                            }
                        } catch (RuntimeException e) {
                            csjb b = cbkc.a.b();
                            b.I("Download callback onProgress error");
                            b.s(e);
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.efei, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
