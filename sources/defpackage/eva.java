package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eva {
    public evw a;
    public jwj c;
    public ioc f;
    public jlm h;
    public final eut m;
    public final jdt t;
    public final hio u;
    public final jun b = new jun();
    public final hho d = new hic(false, hla.a);
    public final hho e = new hic(new jzq(0.0f), hla.a);
    public final hho g = new hic(null, hla.a);
    private final hho v = new hic(eug.a, hla.a);
    private final hho w = new hic(false, hla.a);
    public final hho i = new hic(false, hla.a);
    public final hho j = new hic(false, hla.a);
    public final hho k = new hic(false, hla.a);
    public boolean l = true;
    private final hho x = new hic(true, hla.a);
    public final hho n = new hic(false, hla.a);
    private final hho y = new hic(false, hla.a);
    public ffji o = euz.a;
    public final ffji p = new euy(this);
    public final ffji q = new eux(this);
    public final ict r = new iba();
    public long s = ibw.h;
    private final hho z = new hic(new jpm(jpm.a), hla.a);
    private final hho A = new hic(new jpm(jpm.a), hla.a);

    public eva(evw evwVar, hio hioVar, jdt jdtVar) {
        this.a = evwVar;
        this.u = hioVar;
        this.t = jdtVar;
        this.m = new eut(jdtVar);
    }

    public final long a() {
        return ((jpm) this.A.a()).b;
    }

    public final long b() {
        return ((jpm) this.z.a()).b;
    }

    public final eug c() {
        return (eug) this.v.a();
    }

    public final exq d() {
        return (exq) this.g.a();
    }

    public final ioc e() {
        ioc iocVar = this.f;
        if (iocVar == null || !iocVar.t()) {
            return null;
        }
        return iocVar;
    }

    public final void f(boolean z) {
        this.n.b(Boolean.valueOf(z));
    }

    public final void g(long j) {
        this.A.b(new jpm(j));
    }

    public final void h(eug eugVar) {
        this.v.b(eugVar);
    }

    public final void i(boolean z) {
        this.x.b(Boolean.valueOf(z));
    }

    public final void j(boolean z) {
        this.y.b(Boolean.valueOf(z));
    }

    public final void k(long j) {
        this.z.b(new jpm(j));
    }

    public final void l(boolean z) {
        this.k.b(Boolean.valueOf(z));
    }

    public final void m(boolean z) {
        this.w.b(Boolean.valueOf(z));
    }

    public final void n(boolean z) {
        this.j.b(Boolean.valueOf(z));
    }

    public final void o(boolean z) {
        this.i.b(Boolean.valueOf(z));
    }

    public final boolean p() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.y.a()).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    public final boolean s() {
        return ((Boolean) this.x.a()).booleanValue();
    }
}
