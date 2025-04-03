package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxc implements efej, eaew, dxwr {
    public final Executor a;
    public final HashMap b;
    public final HashMap c;
    public final dxbv d;
    private final dxwc e;

    public dxxc(dlpw dlpwVar, Executor executor) {
        dxbv dxbvVar = new dxbv(dlpwVar);
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = dxbvVar;
        this.a = new ersb(executor);
        this.e = new dxwc(dxbvVar, executor);
    }

    @Override // defpackage.efej
    public final efei a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.efej
    public final efei b(Uri uri) {
        synchronized (dxxc.class) {
            String str = (String) this.b.get(uri);
            if (str == null) {
                return this.e.b(uri);
            }
            if (this.c.get(str) == null) {
                dxth.c("%s: Can't find file group for uri: %s. DownloadListener was not added.", "DownloadProgressMonitor", uri);
                return null;
            }
            return (efei) this.c.get(str);
        }
    }

    @Override // defpackage.eaew
    public final void e() {
        synchronized (dxxc.class) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                ((dxxb) ((efdm) it.next()).a).a.b();
            }
            this.e.e();
        }
    }

    @Override // defpackage.dxwr
    public final void f(Uri uri) {
        this.e.f(uri);
    }

    @Override // defpackage.dxwr
    public final void g(Uri uri, cbka cbkaVar) {
        this.e.g(uri, cbkaVar);
    }

    public final void i(String str, long j) {
        synchronized (dxxc.class) {
            if (this.c.containsKey(str)) {
                ((efdm) this.c.get(str)).a.a(j);
            }
        }
    }

    public final void j(String str) {
        synchronized (dxxc.class) {
            this.c.remove(str);
        }
    }

    @Override // defpackage.eaew
    public final void c() {
    }

    @Override // defpackage.eaew
    public final void d() {
    }

    @Override // defpackage.efej
    public final void h() {
    }
}
