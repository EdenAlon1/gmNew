package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwc implements efej, eaew, dxwr {
    public final Executor a;
    public final HashMap b = new HashMap();
    public final dxbv c;

    public dxwc(dxbv dxbvVar, Executor executor) {
        this.c = dxbvVar;
        this.a = new ersb(executor);
    }

    @Override // defpackage.efej
    public final efei a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.efej
    public final efei b(Uri uri) {
        synchronized (dxwc.class) {
            if (this.b.get(uri) == null) {
                return null;
            }
            return (efei) this.b.get(uri);
        }
    }

    @Override // defpackage.eaew
    public final void e() {
        synchronized (dxwc.class) {
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                cbka cbkaVar = ((dxwb) it.next()).c;
                csjb c = cbkc.a.c();
                c.I("onPausedForConnectivity");
                c.N("url", cbkaVar.c);
                c.r();
            }
        }
    }

    @Override // defpackage.dxwr
    public final void f(Uri uri) {
        synchronized (dxwc.class) {
            this.b.remove(uri);
        }
    }

    @Override // defpackage.dxwr
    public final void g(Uri uri, cbka cbkaVar) {
        synchronized (dxwc.class) {
            if (!this.b.containsKey(uri)) {
                this.b.put(uri, new dxwb(this, uri, cbkaVar));
            }
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
