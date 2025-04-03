package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbe {
    public final dbe a;
    public final String b;
    public long f;
    private final dbt g;
    private final hho h = new hic(e(), hla.a);
    private final hho i = new hic(new dav(e(), e()), hla.a);
    private final hkb k = new hia(0);
    private final hkb l = new hia(Long.MIN_VALUE);
    public final hho c = new hic(false, hla.a);
    public final hss d = new hss();
    public final hss e = new hss();
    private final hho j = new hic(false, hla.a);

    public dbe(dbt dbtVar, dbe dbeVar, String str) {
        this.g = dbtVar;
        this.a = dbeVar;
        this.b = str;
        dbd dbdVar = new dbd(this);
        hqg hqgVar = hkg.a;
        new hgk(dbdVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void w() {
        hss hssVar = this.d;
        int a = hssVar.a();
        for (int i = 0; i < a; i++) {
            ((daw) hssVar.get(i)).h(-2.0f);
        }
        hss hssVar2 = this.e;
        int a2 = hssVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            ((dbe) hssVar2.get(i2)).w();
        }
    }

    private final void x(dau dauVar) {
        this.i.b(dauVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        hss hssVar = this.d;
        int a = hssVar.a();
        long j = 0;
        for (int i = 0; i < a; i++) {
            j = Math.max(j, ((daw) hssVar.get(i)).c());
        }
        hss hssVar2 = this.e;
        int a2 = hssVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            j = Math.max(j, ((dbe) hssVar2.get(i2)).a());
        }
        return j;
    }

    public final long b() {
        dbe dbeVar = this.a;
        return dbeVar != null ? dbeVar.b() : this.k.c();
    }

    public final long c() {
        return this.l.c();
    }

    public final dau d() {
        return (dau) this.i.a();
    }

    public final Object e() {
        return this.g.a();
    }

    public final Object f() {
        return this.h.a();
    }

    public final void g(Object obj, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1493585151);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(obj) : b.F(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(this) ? 16 : 32;
        }
        if (!b.J((i2 & 19) != 18, i2 & 1)) {
            b.s();
        } else if (t()) {
            b.v(1824822651);
            ((hfm) b).Z();
        } else {
            b.v(1823162043);
            q(obj);
            int i4 = i2 & 112;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 32 || R == hfc.a) {
                dbc dbcVar = new dbc(this);
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(dbcVar, null);
                hfmVar.ad(hgkVar);
                R = hgkVar;
            }
            if (((Boolean) ((hkx) R).a()).booleanValue()) {
                b.v(1823570158);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    R2 = hgs.a(ffhe.a, b);
                    hfmVar.ad(R2);
                }
                ffsk ffskVar = (ffsk) R2;
                boolean F = b.F(ffskVar) | (i4 == 32);
                Object R3 = hfmVar.R();
                if (F || R3 == hfc.a) {
                    R3 = new dba(ffskVar, this);
                    hfmVar.ad(R3);
                }
                hgs.b(ffskVar, this, (ffji) R3, b);
                hfmVar.Z();
            } else {
                b.v(1824812731);
                hfmVar.Z();
            }
            hfmVar.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new dbb(this, obj, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(long j, boolean z) {
        if (c() == Long.MIN_VALUE) {
            j(j);
        } else if (!((Boolean) this.g.a.a()).booleanValue()) {
            this.g.e(true);
        }
        p(false);
        hss hssVar = this.d;
        int a = hssVar.a();
        boolean z2 = true;
        for (int i = 0; i < a; i++) {
            daw dawVar = (daw) hssVar.get(i);
            if (!dawVar.l()) {
                long a2 = z ? dawVar.e().a() : j;
                dawVar.i(dawVar.e().d(a2));
                dawVar.a = dawVar.e().b(a2);
                if (cxp.a(dawVar.e(), a2)) {
                    dawVar.g(true);
                }
            }
            z2 &= dawVar.l();
        }
        hss hssVar2 = this.e;
        int a3 = hssVar2.a();
        for (int i2 = 0; i2 < a3; i2++) {
            dbe dbeVar = (dbe) hssVar2.get(i2);
            if (!ffkj.e(dbeVar.f(), dbeVar.e())) {
                dbeVar.h(j, z);
            }
            z2 &= ffkj.e(dbeVar.f(), dbeVar.e());
        }
        if (z2) {
            i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        n(Long.MIN_VALUE);
        dbt dbtVar = this.g;
        if (dbtVar instanceof czq) {
            dbtVar.c(f());
        }
        l(0L);
        this.g.e(false);
        hss hssVar = this.e;
        int a = hssVar.a();
        for (int i = 0; i < a; i++) {
            ((dbe) hssVar.get(i)).i();
        }
    }

    public final void j(long j) {
        n(j);
        this.g.e(true);
    }

    public final void k(daw dawVar) {
        this.d.remove(dawVar);
    }

    public final void l(long j) {
        if (this.a == null) {
            this.k.h(j);
        }
    }

    public final void m(boolean z) {
        this.j.b(Boolean.valueOf(z));
    }

    public final void n(long j) {
        this.l.h(j);
    }

    public final void o(Object obj) {
        this.h.b(obj);
    }

    public final void p(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    public final void q(Object obj) {
        if (ffkj.e(f(), obj)) {
            return;
        }
        x(new dav(f(), obj));
        if (!ffkj.e(e(), f())) {
            this.g.c(f());
        }
        o(obj);
        if (!s()) {
            p(true);
        }
        w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        hss hssVar = this.d;
        int a = hssVar.a();
        for (int i = 0; i < a; i++) {
        }
        hss hssVar2 = this.e;
        int a2 = hssVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            if (((dbe) hssVar2.get(i2)).r()) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        return c() != Long.MIN_VALUE;
    }

    public final boolean t() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        hss hssVar = this.d;
        int a = hssVar.a();
        String str = "Transition animation values: ";
        for (int i = 0; i < a; i++) {
            str = str + ((daw) hssVar.get(i)) + ", ";
        }
        return str;
    }

    public final void u(daw dawVar) {
        this.d.add(dawVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(Object obj, Object obj2) {
        n(Long.MIN_VALUE);
        this.g.e(false);
        if (!t() || !ffkj.e(e(), obj) || !ffkj.e(f(), obj2)) {
            if (!ffkj.e(e(), obj)) {
                dbt dbtVar = this.g;
                if (dbtVar instanceof czq) {
                    dbtVar.c(obj);
                }
            }
            o(obj2);
            m(true);
            x(new dav(obj, obj2));
        }
        hss hssVar = this.e;
        int a = hssVar.a();
        for (int i = 0; i < a; i++) {
            dbe dbeVar = (dbe) hssVar.get(i);
            dbeVar.getClass();
            if (dbeVar.t()) {
                dbeVar.v(dbeVar.e(), dbeVar.f());
            }
        }
        hss hssVar2 = this.d;
        int a2 = hssVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            ((daw) hssVar2.get(i2)).m();
        }
        this.f = 0L;
    }
}
