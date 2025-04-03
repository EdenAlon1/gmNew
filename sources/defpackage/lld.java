package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lld {
    static final Object b = new Object();
    private final afc a;
    final Object c;
    int d;
    public boolean e;
    volatile Object f;
    public int g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public lld() {
        this.c = new Object();
        this.a = new afc();
        this.d = 0;
        Object obj = b;
        this.f = obj;
        this.k = new lkz(this);
        this.h = obj;
        this.g = -1;
    }

    private final void b(llc llcVar) {
        if (llcVar.d) {
            if (!llcVar.ez()) {
                llcVar.d(false);
                return;
            }
            int i = llcVar.e;
            int i2 = this.g;
            if (i < i2) {
                llcVar.e = i2;
                llcVar.c.a(this.h);
            }
        }
    }

    static void d(String str) {
        if (!aer.a().c()) {
            throw new IllegalStateException(a.a(str, "Cannot invoke ", " on a background thread"));
        }
    }

    public Object a() {
        Object obj = this.h;
        if (obj != b) {
            return obj;
        }
        return null;
    }

    final void e(llc llcVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (llcVar != null) {
                b(llcVar);
            } else {
                aez e = this.a.e();
                while (e.hasNext()) {
                    b((llc) ((aey) e.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            llcVar = null;
        }
    }

    public final void f(lkr lkrVar, llh llhVar) {
        d("observe");
        if (lkrVar.P().a() == lkj.DESTROYED) {
            return;
        }
        llb llbVar = new llb(this, lkrVar, llhVar);
        llc llcVar = (llc) this.a.f(llhVar, llbVar);
        if (llcVar != null && !llcVar.c(lkrVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (llcVar != null) {
            return;
        }
        lkrVar.P().c(llbVar);
    }

    public final void g(llh llhVar) {
        d("observeForever");
        lla llaVar = new lla(this, llhVar);
        llc llcVar = (llc) this.a.f(llhVar, llaVar);
        if (llcVar instanceof llb) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (llcVar != null) {
            return;
        }
        llaVar.d(true);
    }

    public final void j(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.c) {
            obj2 = this.f;
            obj3 = b;
            this.f = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        aer.a().b(this.k);
    }

    public void k(llh llhVar) {
        d("removeObserver");
        llc llcVar = (llc) this.a.b(llhVar);
        if (llcVar == null) {
            return;
        }
        llcVar.b();
        llcVar.d(false);
    }

    public final void l(lkr lkrVar) {
        d("removeObservers");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            aey aeyVar = (aey) ((afa) it).next();
            if (((llc) aeyVar.b).c(lkrVar)) {
                k((llh) aeyVar.a);
            }
        }
    }

    protected void m(Object obj) {
        d("setValue");
        this.g++;
        this.h = obj;
        e(null);
    }

    public final boolean n() {
        return this.d > 0;
    }

    public final boolean o() {
        return this.a.e > 0;
    }

    public lld(Object obj) {
        this.c = new Object();
        this.a = new afc();
        this.d = 0;
        this.f = b;
        this.k = new lkz(this);
        this.h = obj;
        this.g = 0;
    }

    protected void h() {
    }

    protected void i() {
    }
}
