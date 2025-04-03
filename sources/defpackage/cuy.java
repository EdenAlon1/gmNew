package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuy extends hvh implements imx, itg, irt {
    public cvf a;
    public iga b;
    public final irr c;

    public cuy(cvf cvfVar) {
        this.a = cvfVar;
        this.b = cvfVar.f();
        this.c = iru.a(new ffcf(cva.a, cvfVar));
    }

    private final void y(iga igaVar) {
        if (igaVar == null) {
            iga igaVar2 = this.b;
            if (igaVar2 != null) {
                isx.k(this).b(igaVar2);
            }
        } else {
            this.a.j(igaVar);
        }
        this.b = igaVar;
    }

    @Override // defpackage.imx
    public final /* synthetic */ int a(imu imuVar, inx inxVar, int i) {
        iwi iwiVar = this.p.v;
        iwiVar.getClass();
        iuw C = iwiVar.C();
        C.getClass();
        if (!C.S()) {
            return inxVar.a(i);
        }
        return p(new imw(imuVar, imuVar.q()), new iwl(inxVar, 2, 2), jzl.k(0, i, 0, 13)).j();
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        iqk e = iplVar.e(j);
        float f = e.a;
        float f2 = e.b;
        ei = ipqVar.ei(e.a, e.b, ffem.a, new cuu(e, this, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
        return ei;
    }

    @Override // defpackage.hvh
    public final void dS() {
        iga igaVar = this.b;
        if (igaVar != null) {
            isx.k(this).b(igaVar);
        }
        y(isx.k(this).a());
    }

    @Override // defpackage.hvh
    public final void dT() {
        irs.b(this, cva.a, this.a);
        this.a.k = (cvf) irs.a(this, cva.a);
        y(isx.k(this).a());
        this.a.j = new cuv(this);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return itt.a(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int f(iny inyVar, inx inxVar, int i) {
        return itt.b(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int g(iny inyVar, inx inxVar, int i) {
        return itt.c(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int h(iny inyVar, inx inxVar, int i) {
        return itt.d(this, inyVar, inxVar, i);
    }

    @Override // defpackage.imx
    public final /* synthetic */ int i(imu imuVar, inx inxVar, int i) {
        iwi iwiVar = this.p.v;
        iwiVar.getClass();
        iuw C = iwiVar.C();
        C.getClass();
        if (!C.S()) {
            return inxVar.b(i);
        }
        return p(new imw(imuVar, imuVar.q()), new iwl(inxVar, 2, 1), jzl.k(0, 0, i, 7)).k();
    }

    @Override // defpackage.imx
    public final /* synthetic */ int j(imu imuVar, inx inxVar, int i) {
        iwi iwiVar = this.p.v;
        iwiVar.getClass();
        iuw C = iwiVar.C();
        C.getClass();
        if (!C.S()) {
            return inxVar.c(i);
        }
        return p(new imw(imuVar, imuVar.q()), new iwl(inxVar, 1, 2), jzl.k(0, i, 0, 13)).j();
    }

    @Override // defpackage.imx
    public final /* synthetic */ int k(imu imuVar, inx inxVar, int i) {
        iwi iwiVar = this.p.v;
        iwiVar.getClass();
        iuw C = iwiVar.C();
        C.getClass();
        if (!C.S()) {
            return inxVar.d(i);
        }
        return p(new imw(imuVar, imuVar.q()), new iwl(inxVar, 1, 1), jzl.k(0, 0, i, 7)).k();
    }

    public final csb l() {
        return this.a.c();
    }

    public final cvd m() {
        return this.a.d();
    }

    public final ioc n() {
        ioc iocVar = m().b.f;
        if (iocVar != null) {
            return iocVar;
        }
        ffkj.c("root");
        return null;
    }

    public final ioc o() {
        return this.a.d().b.dX(isx.b(this));
    }

    @Override // defpackage.imx
    public final ipo p(imy imyVar, ipl iplVar, long j) {
        ipo ei;
        ipo ei2;
        int i;
        if (m().i()) {
            iam c = l().c();
            if (c == null) {
                c = m().a();
            }
            if (c != null) {
                long c2 = kag.c(c.b());
                long j2 = c2 >> 32;
                long j3 = c2 & 4294967295L;
                int i2 = (int) j2;
                if (i2 == Integer.MAX_VALUE || (i = (int) j3) == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("Error: Infinite width/height is invalid. animated bounds: " + l().c() + ", current bounds: " + m().a());
                }
                j = jzj.c(ffmk.f(i2, 0), ffmk.f(i, 0));
            }
        }
        iqk e = iplVar.e(j);
        if (!m().i() || !m().b.a()) {
            ei = imyVar.ei(e.a, e.b, ffem.a, new cur(this, e));
            return ei;
        }
        long a = ((cvk) this.a.e.a()).a(o().g());
        ei2 = imyVar.ei((int) (a >> 32), (int) (a & 4294967295L), ffem.a, new cus(this, e));
        return ei2;
    }

    @Override // defpackage.irt
    public final irr q() {
        return this.c;
    }

    @Override // defpackage.irw
    public final /* synthetic */ Object r(irn irnVar) {
        return irs.a(this, irnVar);
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        cvf cvfVar = this.a;
        cvfVar.a = true;
        cvn e = this.a.e();
        m().a().getClass();
        isx.g(this);
        cvf cvfVar2 = e.b().k;
        cvn e2 = cvfVar2 != null ? cvfVar2.e() : null;
        if (e2 != null) {
            e2.b();
        }
        cvfVar.i = null;
        iga f = this.a.f();
        if (f == null) {
            throw new IllegalArgumentException("Error: Layer is null when accessed for shared bounds/element : " + m().a + ",target: " + this.a.c().f() + ", is attached: " + this.z);
        }
        cut cutVar = new cut(ifoVar);
        long b = ifoVar.b();
        ifoVar.s(f, (((int) Float.intBitsToFloat((int) (b & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (b >> 32))) << 32), cutVar);
        cvf cvfVar3 = this.a;
        if (!cvfVar3.d().i() || (!cvfVar3.l() && cvfVar3.k())) {
            ige.a(ifoVar, f);
        }
    }

    @Override // defpackage.hvh
    public final void t() {
        y(null);
        cvf cvfVar = this.a;
        cvfVar.k = null;
        cvfVar.j = cuw.a;
    }

    public final void v(ioc iocVar) {
        cvd m = m();
        long h = n().h(iocVar, 0L);
        long g = iocVar.g() >> 32;
        long g2 = iocVar.g() & 4294967295L;
        m.d(ian.a(h, (Float.floatToRawIntBits((int) g) << 32) | (Float.floatToRawIntBits((int) g2) & 4294967295L)));
    }

    @Override // defpackage.imx
    public final boolean w() {
        return m().i() && this.a.d().b.a();
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.imx
    public final /* synthetic */ void x() {
    }
}
