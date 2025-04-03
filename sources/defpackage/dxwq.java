package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxwq implements dxwg {
    public final Executor a;
    public final emxc b;
    public final emyl c;
    final dxvi d;
    final dxvi e;

    public dxwq(Context context, emxc emxcVar, Executor executor, emxc emxcVar2, emyl emylVar) {
        this.a = executor;
        this.b = emxcVar2;
        this.c = emylVar;
        this.d = dxvi.a(executor);
        this.e = new dxvi(executor, new dxwp(emxcVar, context));
    }

    private final ListenableFuture c(final String str) {
        return elfr.k(this.e.c(str), new eroh() { // from class: dxwm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                dxwq dxwqVar = dxwq.this;
                return (booleanValue ? dxwqVar.e : dxwqVar.d).d(str);
            }
        }, this.a);
    }

    @Override // defpackage.dxwg
    public final ListenableFuture a(final dxwe dxweVar) {
        dxvz dxvzVar = (dxvz) dxweVar;
        dxth.c("%s: download for Uri = %s", "DownloaderImp", dxvzVar.a.toString());
        int i = eodh.a;
        eodd f = eodf.a.f();
        f.l(dxvzVar.a.toString());
        f.l("|");
        final dxbp dxbpVar = new dxbp(2, f.q().toString());
        return elfr.k(c(dxbpVar.a), new eroh() { // from class: dxwi
            /* JADX WARN: Type inference failed for: r2v9, types: [dxwr, java.lang.Object] */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                emxc emxcVar = (emxc) obj;
                if (emxcVar.g()) {
                    return (ListenableFuture) emxcVar.c();
                }
                final dxwe dxweVar2 = dxweVar;
                final dxwq dxwqVar = dxwq.this;
                dxvz dxvzVar2 = (dxvz) dxweVar2;
                if (dxvzVar2.d.g()) {
                    if (dxwqVar.b.g()) {
                        emxc emxcVar2 = dxwqVar.b;
                        emxcVar2.c().g(dxvzVar2.a, (cbka) dxvzVar2.d.c());
                    } else {
                        dxth.n("%s: download request included DownloadListener, but DownloadMonitor is not present! DownloadListener will only be invoked for complete/failure.", "DownloaderImp");
                    }
                }
                dxbq dxbqVar = dxbpVar;
                final errj errjVar = new errj(new Callable() { // from class: dxwj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                });
                final ListenableFuture k = elfr.k(errjVar, new eroh() { // from class: dxwk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dxvz dxvzVar3 = (dxvz) dxweVar2;
                        Uri uri = dxvzVar3.a;
                        dxbb h = dxbc.h();
                        h.g(uri);
                        h.e(dxvzVar3.c);
                        h.i(dxvzVar3.b);
                        h.f(dxvzVar3.f);
                        h.h(dxvzVar3.e);
                        h.d(dxvzVar3.g);
                        try {
                            return ((dxbd) dxwq.this.c.get()).b(h.j());
                        } catch (RuntimeException e) {
                            dwql a = dwqn.a();
                            a.a = dwqm.UNKNOWN_ERROR;
                            a.c = e;
                            return erqt.h(a.a());
                        }
                    }
                }, dxwqVar.a);
                elfr.l(k, new dxwo(dxwqVar, dxweVar2, dxbqVar), erpp.a);
                return elfr.k(dxwqVar.d.b(((dxbp) dxbqVar).a, k), new eroh() { // from class: dxwl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        errj.this.run();
                        return k;
                    }
                }, dxwqVar.a);
            }
        }, this.a);
    }

    @Override // defpackage.dxwg
    public final void b(final String str) {
        dxth.c("%s: CancelForegroundDownload for Uri = %s", "DownloaderImp", str);
        elfr.k(c(str), new eroh() { // from class: dxwh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                emxc emxcVar = (emxc) obj;
                if (emxcVar.g()) {
                    dxth.l("%s: CancelForegroundDownload future found for key = %s, cancelling...", "DownloaderImp", str);
                    ((ListenableFuture) emxcVar.c()).cancel(false);
                }
                return erre.a;
            }
        }, this.a);
    }
}
