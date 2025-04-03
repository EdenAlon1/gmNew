package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qqs implements ComponentCallbacks2, rgu {
    private static final rig e;
    private static final rig f;
    protected final qpt a;
    protected final Context b;
    final rgt c;
    public final CopyOnWriteArrayList d;
    private final rhd g;
    private final rhc h;
    private final rhk i;
    private final Runnable j;
    private final rgk k;
    private rig l;

    static {
        rig c = rig.c(Bitmap.class);
        c.aj();
        e = c;
        rig.c(rfp.class).aj();
        f = (rig) ((rig) rig.d(qvx.d).T(qqe.LOW)).ai();
    }

    public qqs(qpt qptVar, rgt rgtVar, rhc rhcVar, Context context) {
        rhd rhdVar = new rhd();
        rgm rgmVar = qptVar.g;
        this.i = new rhk();
        qqp qqpVar = new qqp(this);
        this.j = qqpVar;
        this.a = qptVar;
        this.c = rgtVar;
        this.h = rhcVar;
        this.g = rhdVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        qqr qqrVar = new qqr(this, rhdVar);
        int c = koa.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", c == 0 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        rgk rglVar = c == 0 ? new rgl(applicationContext, qqrVar) : new rgy();
        this.k = rglVar;
        synchronized (qptVar.e) {
            if (qptVar.e.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            qptVar.e.add(this);
        }
        if (rkh.m()) {
            rkh.k(qqpVar);
        } else {
            rgtVar.a(this);
        }
        rgtVar.a(rglVar);
        this.d = new CopyOnWriteArrayList(qptVar.c.d);
        s(qptVar.c.b());
    }

    public qqo a(Class cls) {
        return new qqo(this.a, this, cls, this.b);
    }

    public qqo b() {
        return a(Bitmap.class).q(e);
    }

    public qqo c() {
        return a(Drawable.class);
    }

    public qqo d() {
        return a(File.class).q(f);
    }

    public qqo e(Drawable drawable) {
        return c().h(drawable);
    }

    public qqo f(Uri uri) {
        return c().i(uri);
    }

    public qqo g(Integer num) {
        return c().j(num);
    }

    public qqo h(Object obj) {
        return c().k(obj);
    }

    public qqo i(String str) {
        return c().l(str);
    }

    final synchronized rig j() {
        return this.l;
    }

    public final void k(View view) {
        l(new qqq(view));
    }

    public final void l(rix rixVar) {
        if (rixVar == null) {
            return;
        }
        boolean v = v(rixVar);
        rib d = rixVar.d();
        if (v) {
            return;
        }
        qpt qptVar = this.a;
        synchronized (qptVar.e) {
            Iterator it = qptVar.e.iterator();
            while (it.hasNext()) {
                if (((qqs) it.next()).v(rixVar)) {
                    return;
                }
            }
            if (d != null) {
                rixVar.i(null);
                d.c();
            }
        }
    }

    @Override // defpackage.rgu
    public final synchronized void m() {
        this.i.m();
        Iterator it = rkh.h(this.i.a).iterator();
        while (it.hasNext()) {
            l((rix) it.next());
        }
        this.i.a.clear();
        rhd rhdVar = this.g;
        Iterator it2 = rkh.h(rhdVar.a).iterator();
        while (it2.hasNext()) {
            rhdVar.a((rib) it2.next());
        }
        rhdVar.b.clear();
        this.c.b(this);
        this.c.b(this.k);
        rkh.g().removeCallbacks(this.j);
        qpt qptVar = this.a;
        synchronized (qptVar.e) {
            if (!qptVar.e.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            qptVar.e.remove(this);
        }
    }

    @Override // defpackage.rgu
    public final synchronized void n() {
        r();
        this.i.n();
    }

    @Override // defpackage.rgu
    public final synchronized void o() {
        q();
        this.i.o();
    }

    public final synchronized void p() {
        rhd rhdVar = this.g;
        rhdVar.c = true;
        for (rib ribVar : rkh.h(rhdVar.a)) {
            if (ribVar.n() || ribVar.l()) {
                ribVar.c();
                rhdVar.b.add(ribVar);
            }
        }
    }

    public final synchronized void q() {
        rhd rhdVar = this.g;
        rhdVar.c = true;
        for (rib ribVar : rkh.h(rhdVar.a)) {
            if (ribVar.n()) {
                ribVar.f();
                rhdVar.b.add(ribVar);
            }
        }
    }

    public final synchronized void r() {
        rhd rhdVar = this.g;
        rhdVar.c = false;
        for (rib ribVar : rkh.h(rhdVar.a)) {
            if (!ribVar.l() && !ribVar.n()) {
                ribVar.b();
            }
        }
        rhdVar.b.clear();
    }

    protected synchronized void s(rig rigVar) {
        this.l = (rig) ((rig) rigVar.clone()).x();
    }

    final synchronized void t(rix rixVar, rib ribVar) {
        this.i.a.add(rixVar);
        rhd rhdVar = this.g;
        rhdVar.a.add(ribVar);
        if (!rhdVar.c) {
            ribVar.b();
            return;
        }
        ribVar.c();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        rhdVar.b.add(ribVar);
    }

    public final synchronized String toString() {
        rhc rhcVar;
        rhd rhdVar;
        rhcVar = this.h;
        rhdVar = this.g;
        return super.toString() + "{tracker=" + String.valueOf(rhdVar) + ", treeNode=" + String.valueOf(rhcVar) + "}";
    }

    public final synchronized boolean u() {
        return this.g.c;
    }

    final synchronized boolean v(rix rixVar) {
        rib d = rixVar.d();
        if (d == null) {
            return true;
        }
        if (!this.g.a(d)) {
            return false;
        }
        this.i.a.remove(rixVar);
        rixVar.i(null);
        return true;
    }

    public synchronized void w(rig rigVar) {
        s(rigVar);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
