package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxss {
    public final Context a;
    public final emyl b;
    public final efbm c;
    public final dxxg d;
    public final emxc e;
    public final dxti f;
    public final Executor g;
    public final dwqy h;
    final HashMap i = new HashMap();
    private final dxvi j;

    public dxss(Context context, emyl emylVar, efbm efbmVar, dxxg dxxgVar, emxc emxcVar, dxti dxtiVar, Executor executor, dwqy dwqyVar) {
        this.a = context;
        this.b = emylVar;
        this.c = efbmVar;
        this.d = dxxgVar;
        this.e = emxcVar;
        this.f = dxtiVar;
        this.g = executor;
        this.h = dwqyVar;
        this.j = dxvi.a(executor);
    }

    public static void e(Context context, String str, long j, dwta dwtaVar, dwqy dwqyVar) {
        float min;
        if (dwqyVar.N()) {
            if (dxvk.h(str, new enpx("inlinefile")) && j == 0) {
                return;
            }
            StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
            long blockCount = statFs.getBlockCount();
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            long blockSize2 = statFs.getBlockSize();
            float f = blockCount * blockSize;
            double min2 = Math.min(dwqyVar.a() * f, dwqyVar.b());
            if (dwtaVar != null) {
                int a = dwsz.a(dwtaVar.c);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i == 1) {
                    min = Math.min(f * dwqyVar.a(), dwqyVar.d());
                } else if (i == 2) {
                    min = Math.min(f * dwqyVar.a(), dwqyVar.c());
                }
                min2 = min;
            }
            Long.signum(availableBlocks);
            if ((availableBlocks * blockSize2) - j > min2) {
                return;
            }
            dwql a2 = dwqn.a();
            a2.a = dwqm.LOW_DISK_ERROR;
            throw a2.a();
        }
    }

    public final ListenableFuture a(final String str, final Uri uri, final dxsr dxsrVar, eroh erohVar) {
        ListenableFuture b;
        final errj errjVar = new errj(new Callable() { // from class: dxsk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        });
        final dycd d = dycd.e(errjVar).g(erohVar, this.g).g(new eroh() { // from class: dxsl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dxsr.this.a(uri);
            }
        }, this.g).d(Exception.class, new eroh() { // from class: dxsm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwqn a;
                final Exception exc = (Exception) obj;
                if (exc instanceof dwqn) {
                    a = (dwqn) exc;
                } else {
                    dwql a2 = dwqn.a();
                    a2.c = exc;
                    a2.a = dwqm.UNKNOWN_ERROR;
                    a = a2.a();
                }
                return elfr.k(dxsrVar.b(a), new eroh() { // from class: dxsi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        throw exc;
                    }
                }, dxss.this.g);
            }
        }, this.g);
        if (this.h.F()) {
            b = this.j.b(str, d);
        } else {
            this.i.put(uri, d);
            b = erre.a;
        }
        dycd g = dycd.e(b).g(new eroh() { // from class: dxsn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                errj.this.run();
                return d;
            }
        }, this.g);
        g.b(new Runnable() { // from class: dxso
            @Override // java.lang.Runnable
            public final void run() {
                dxss.this.c(str, uri);
            }
        }, this.g);
        return g;
    }

    public final ListenableFuture b(String str, Uri uri) {
        return !this.h.F() ? erqt.i(emxc.i((ListenableFuture) this.i.get(uri))) : this.j.d(str);
    }

    public final ListenableFuture c(String str, Uri uri) {
        if (this.h.F()) {
            return this.j.e(str);
        }
        ListenableFuture listenableFuture = (ListenableFuture) this.i.remove(uri);
        return listenableFuture != null ? listenableFuture : erre.a;
    }

    public final ListenableFuture d(final String str, final dwtm dwtmVar, final int i, final long j, final String str2, final Uri uri, final String str3, final long j2, final dwta dwtaVar, final dxsr dxsrVar, final int i2, final List list, final eydq eydqVar) {
        return elfr.k(b(str, uri), new eroh() { // from class: dxsg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                emxc emxcVar = (emxc) obj;
                if (emxcVar.g()) {
                    return (ListenableFuture) emxcVar.c();
                }
                final eydq eydqVar2 = eydqVar;
                final List list2 = list;
                final int i3 = i2;
                final dwta dwtaVar2 = dwtaVar;
                final long j3 = j2;
                final String str4 = str3;
                final String str5 = str2;
                final long j4 = j;
                final int i4 = i;
                final dwtm dwtmVar2 = dwtmVar;
                dxsr dxsrVar2 = dxsrVar;
                final Uri uri2 = uri;
                String str6 = str;
                final dxss dxssVar = dxss.this;
                return dxssVar.a(str6, uri2, dxsrVar2, new eroh() { // from class: dxsq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        long j5;
                        int a;
                        String str7 = str4;
                        dxss dxssVar2 = dxss.this;
                        Uri uri3 = uri2;
                        long j6 = j3;
                        dwta dwtaVar3 = dwtaVar2;
                        if (str7.startsWith("http") && dxssVar2.h.B() && !str7.startsWith("https")) {
                            dxth.h("%s: File url = %s is not secure", "MddFileDownloader", str7);
                            dwql a2 = dwqn.a();
                            a2.a = dwqm.INSECURE_URL_ERROR;
                            return erqt.h(a2.a());
                        }
                        try {
                            j5 = dxssVar2.c.a(uri3);
                        } catch (IOException unused) {
                            j5 = 0;
                        }
                        try {
                            dxss.e(dxssVar2.a, str7, j6 - j5, dwtaVar3, dxssVar2.h);
                            dwtm dwtmVar3 = dwtmVar2;
                            if (dxssVar2.h.P()) {
                                int i5 = i4;
                                long j7 = j4;
                                String str8 = str5;
                                dxxg dxxgVar = dxssVar2.d;
                                dxti dxtiVar = dxssVar2.f;
                                dwtd dwtdVar = (dwtd) dwte.a.createBuilder();
                                dwtdVar.copyOnWrite();
                                dwte dwteVar = (dwte) dwtdVar.instance;
                                dwtmVar3.getClass();
                                dwteVar.c = dwtmVar3;
                                dwteVar.b |= 1;
                                dwtdVar.copyOnWrite();
                                dwte dwteVar2 = (dwte) dwtdVar.instance;
                                dwteVar2.b |= 2;
                                dwteVar2.d = j7;
                                dwtdVar.copyOnWrite();
                                dwte dwteVar3 = (dwte) dwtdVar.instance;
                                str8.getClass();
                                dwteVar3.b |= 4;
                                dwteVar3.e = str8;
                                dwtdVar.copyOnWrite();
                                dwte dwteVar4 = (dwte) dwtdVar.instance;
                                dwteVar4.b |= 8;
                                dwteVar4.f = i5;
                                dwte dwteVar5 = (dwte) dwtdVar.build();
                                synchronized (dxxgVar.b) {
                                    if (!dxxgVar.c.containsKey(dwteVar5)) {
                                        HashMap hashMap = dxxgVar.c;
                                        dxxf dxxfVar = new dxxf(dxxgVar.a, dxtiVar, dwteVar5);
                                        final dxbv dxbvVar = dxxgVar.e;
                                        hashMap.put(dwteVar5, new efdm(dxxfVar, new efdk() { // from class: dxxd
                                            @Override // defpackage.efdk
                                            public final long a() {
                                                return dxbv.this.a();
                                            }
                                        }, 10L, TimeUnit.SECONDS));
                                    }
                                    dxxgVar.d.put(uri3, (efdm) dxxgVar.c.get(dwteVar5));
                                }
                            } else {
                                dxth.n("%s: NetworkUsageMonitor is disabled", "MddFileDownloader");
                            }
                            if (dxssVar2.e.g()) {
                                dxxc dxxcVar = (dxxc) dxssVar2.e.c();
                                String str9 = dwtmVar3.c;
                                synchronized (dxxc.class) {
                                    dxxcVar.b.put(uri3, str9);
                                }
                            }
                            dxbb h = dxbc.h();
                            h.g(uri3);
                            h.i(str7);
                            if (dwtaVar3 == null || (a = dwsx.a(dwtaVar3.d)) == 0 || a != 2) {
                                h.e(dxba.b);
                            } else {
                                h.e(dxba.c);
                            }
                            int i6 = i3;
                            if (i6 > 0) {
                                h.h(i6);
                            }
                            List<dwtc> list3 = list2;
                            int i7 = engw.d;
                            engr engrVar = new engr();
                            for (dwtc dwtcVar : list3) {
                                engrVar.h(Pair.create(dwtcVar.b, dwtcVar.c));
                            }
                            eydq eydqVar3 = eydqVar2;
                            h.f(engrVar.g());
                            h.d(eydqVar3);
                            return ((dxbd) dxssVar2.b.get()).b(h.j());
                        } catch (dwqn e) {
                            dxth.h("%s: Not enough space to download file %s", "MddFileDownloader", str7);
                            return erqt.h(e);
                        }
                    }
                });
            }
        }, this.g);
    }

    public final void f(final String str, final Uri uri) {
        elfr.k(b(str, uri), new eroh() { // from class: dxsh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                emxc emxcVar = (emxc) obj;
                if (!emxcVar.g()) {
                    dxth.n("%s: stopDownloading on non-existent download", "MddFileDownloader");
                    return erre.a;
                }
                String str2 = str;
                Uri uri2 = uri;
                dxss dxssVar = dxss.this;
                dxth.c("%s: Cancel download file %s", "MddFileDownloader", uri2);
                ((ListenableFuture) emxcVar.c()).cancel(true);
                return dxssVar.c(str2, uri2);
            }
        }, this.g);
    }
}
