package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwj implements qvm, rkn {
    public final qwm c;
    public final qwk d;
    public qtp e;
    public boolean f;
    public qwv g;
    qsy h;
    public boolean i;
    qwp j;
    public boolean k;
    qwn l;
    public volatile boolean m;
    private final kst n;
    private final qyr o;
    private final qyr p;
    private final qyr q;
    private boolean s;
    private qvq t;
    final qwi a = new qwi(new ArrayList(2));
    public final rkr b = new rkq();
    private final AtomicInteger r = new AtomicInteger();

    public qwj(qyr qyrVar, qyr qyrVar2, qyr qyrVar3, qwk qwkVar, qwm qwmVar, kst kstVar) {
        this.o = qyrVar;
        this.p = qyrVar2;
        this.q = qyrVar3;
        this.d = qwkVar;
        this.c = qwmVar;
        this.n = kstVar;
    }

    private final boolean j() {
        return this.k || this.i || this.m;
    }

    public final qyr b() {
        return this.s ? this.q : this.p;
    }

    public final synchronized void c(rih rihVar, Executor executor) {
        this.b.a();
        this.a.a.add(new qwh(rihVar, executor));
        if (this.i) {
            e(1);
            executor.execute(new qwg(this, rihVar));
        } else if (!this.k) {
            rkf.b(!this.m, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            e(1);
            executor.execute(new qwf(this, rihVar));
        }
    }

    final void d() {
        qwn qwnVar;
        synchronized (this) {
            this.b.a();
            rkf.b(j(), "Not yet complete!");
            int decrementAndGet = this.r.decrementAndGet();
            rkf.b(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qwnVar = this.l;
                f();
            } else {
                qwnVar = null;
            }
        }
        if (qwnVar != null) {
            qwnVar.f();
        }
    }

    final synchronized void e(int i) {
        qwn qwnVar;
        rkf.b(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) != 0 || (qwnVar = this.l) == null) {
            return;
        }
        qwnVar.d();
    }

    @Override // defpackage.rkn
    public final rkr eW() {
        return this.b;
    }

    public final synchronized void f() {
        if (this.e == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.e = null;
        this.l = null;
        this.g = null;
        this.k = false;
        this.m = false;
        this.i = false;
        qvq qvqVar = this.t;
        if (qvqVar.c.d()) {
            qvqVar.b();
        }
        this.t = null;
        this.j = null;
        this.h = null;
        this.n.b(this);
    }

    public final synchronized void g(rih rihVar) {
        this.b.a();
        this.a.a.remove(new qwh(rihVar, rjx.b));
        if (this.a.d()) {
            if (!j()) {
                this.m = true;
                qvq qvqVar = this.t;
                qvqVar.p = true;
                qvk qvkVar = qvqVar.o;
                if (qvkVar != null) {
                    qvkVar.a();
                }
                this.d.b(this, this.e);
            }
            if ((this.i || this.k) && this.r.get() == 0) {
                f();
            }
        }
    }

    public final synchronized void h(qvq qvqVar) {
        qyr qyrVar;
        this.t = qvqVar;
        int e = qvqVar.e(1);
        if (e != 2 && e != 3) {
            qyrVar = b();
            qyrVar.execute(qvqVar);
        }
        qyrVar = this.o;
        qyrVar.execute(qvqVar);
    }

    public final synchronized void i(qtp qtpVar, boolean z, boolean z2) {
        this.e = qtpVar;
        this.f = z;
        this.s = z2;
    }
}
