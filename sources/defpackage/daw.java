package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daw implements hkx {
    public cyb a;
    final /* synthetic */ dbe b;
    private final dbv c;
    private final hho d;
    private final dac e;
    private final hho f;
    private final hho g;
    private final hho h;
    private boolean i;
    private final hho j;
    private boolean k;
    private final cyq l;
    private final hjx m;
    private final hkb n;

    public daw(dbe dbeVar, Object obj, cyb cybVar, dbv dbvVar) {
        this.b = dbeVar;
        this.c = dbvVar;
        this.d = new hic(obj, hla.a);
        Object obj2 = null;
        dac b = cxu.b(0.0f, 0.0f, null, 7);
        this.e = b;
        this.f = new hic(b, hla.a);
        this.g = new hic(new daq(d(), dbvVar, obj, n(), cybVar), hla.a);
        this.h = new hic(true, hla.a);
        this.m = new hhw(-1.0f);
        this.j = new hic(obj, hla.a);
        this.a = cybVar;
        this.n = new hia(e().a());
        Float f = (Float) ddh.b.get(dbvVar);
        if (f != null) {
            float floatValue = f.floatValue();
            cyb cybVar2 = (cyb) dbvVar.b().invoke(obj);
            int b2 = cybVar2.b();
            for (int i = 0; i < b2; i++) {
                cybVar2.e(i, floatValue);
            }
            obj2 = this.c.a().invoke(cybVar2);
        }
        this.l = cxu.b(0.0f, 0.0f, obj2, 3);
    }

    private final Object n() {
        return this.d.a();
    }

    private final void o(daq daqVar) {
        this.g.b(daqVar);
    }

    private final void p(cyq cyqVar) {
        this.f.b(cyqVar);
    }

    private final void q(Object obj) {
        this.d.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r(Object obj, boolean z) {
        if (ffkj.e(null, n())) {
            o(new daq(this.l, this.c, obj, obj, this.a.c()));
            this.i = true;
            f(e().a());
            return;
        }
        cxt d = (!z || this.k) ? d() : d() instanceof dac ? d() : this.l;
        long j = 0;
        o(new daq(this.b.b() > 0 ? new dad(d, this.b.b()) : d, this.c, obj, n(), this.a));
        f(e().a());
        this.i = false;
        dbe dbeVar = this.b;
        dbeVar.p(true);
        if (dbeVar.t()) {
            hss hssVar = dbeVar.d;
            int a = hssVar.a();
            for (int i = 0; i < a; i++) {
                daw dawVar = (daw) hssVar.get(i);
                j = Math.max(j, dawVar.c());
                long j2 = dbeVar.f;
                dawVar.m();
            }
            dbeVar.p(false);
        }
    }

    @Override // defpackage.hkx
    public final Object a() {
        return this.j.a();
    }

    public final float b() {
        return this.m.c();
    }

    public final long c() {
        return this.n.c();
    }

    public final cyq d() {
        return (cyq) this.f.a();
    }

    public final daq e() {
        return (daq) this.g.a();
    }

    public final void f(long j) {
        this.n.h(j);
    }

    public final void g(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void h(float f) {
        this.m.i(f);
    }

    public final void i(Object obj) {
        this.j.b(obj);
    }

    public final void j(Object obj, Object obj2, cyq cyqVar) {
        q(obj2);
        p(cyqVar);
        if (ffkj.e(e().b, obj) && ffkj.e(e().a, obj2)) {
            return;
        }
        r(obj, false);
    }

    public final void k(Object obj, cyq cyqVar) {
        if (this.i && ffkj.e(obj, null)) {
            return;
        }
        if (ffkj.e(n(), obj) && b() == -1.0f) {
            return;
        }
        q(obj);
        p(cyqVar);
        r(b() == -3.0f ? obj : a(), !l());
        g(b() == -3.0f);
        if (b() >= 0.0f) {
            i(e().d((long) (e().a() * b())));
        } else if (b() == -3.0f) {
            i(obj);
        }
        this.i = false;
        h(-1.0f);
    }

    public final boolean l() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final void m() {
        if (b() == -1.0f) {
            this.k = true;
            if (ffkj.e(e().a, e().b)) {
                i(e().a);
            } else {
                i(e().d(0L));
                this.a = e().b(0L);
            }
        }
    }

    public final String toString() {
        return "current value: " + a() + ", target: " + n() + ", spec: " + d();
    }
}
