package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iul implements ifr, ifo {
    public itg a;
    private final ifm b;

    public iul() {
        this(null);
    }

    @Override // defpackage.ifr
    public final void A(long j, float f, float f2, long j2, long j3, ifs ifsVar) {
        this.b.A(j, f, f2, j2, j3, ifsVar);
    }

    @Override // defpackage.ifr
    public final void B(ibq ibqVar, float f, long j, ifs ifsVar) {
        this.b.B(ibqVar, f, j, ifsVar);
    }

    @Override // defpackage.ifr
    public final void C(ich ichVar, long j, long j2, float f, ifs ifsVar, ibx ibxVar, int i, int i2) {
        this.b.C(ichVar, j, j2, f, ifsVar, ibxVar, i, i2);
    }

    @Override // defpackage.ifr
    public final void D(ich ichVar, ifs ifsVar, ibx ibxVar) {
        ifm ifmVar = this.b;
        ifmVar.a.c.t(ichVar, ifm.v(ifmVar, null, ifsVar, 1.0f, ibxVar, 3));
    }

    @Override // defpackage.ifr
    public final void E(ibq ibqVar, long j, long j2, float f, float f2) {
        ifm ifmVar = this.b;
        ibt ibtVar = ifmVar.a.c;
        ict p = ifmVar.p();
        if (ibqVar != null) {
            ibqVar.a(ifq.b(ifmVar), p, f2);
        } else if (p.a() != f2) {
            p.i(f2);
        }
        iba ibaVar = (iba) p;
        if (!ffkj.e(ibaVar.d, null)) {
            p.l(null);
        }
        if (!ibk.b(ibaVar.b, 3)) {
            p.j(3);
        }
        if (p.c() != f) {
            p.r(f);
        }
        if (p.b() != 4.0f) {
            p.q(4.0f);
        }
        if (!idm.a(p.e(), 0)) {
            p.o(0);
        }
        if (!idn.a(p.f(), 0)) {
            p.p(0);
        }
        if (!ffkj.e(null, null)) {
            p.t();
        }
        if (!icd.a(p.d(), 1)) {
            p.m(1);
        }
        ibtVar.e(j, j2, p);
    }

    @Override // defpackage.ifr
    public final void F(long j, long j2, long j3, float f, float f2, int i) {
        this.b.F(j, j2, j3, f, f2, i);
    }

    @Override // defpackage.ifr
    public final void G(icv icvVar, long j, float f, ifs ifsVar) {
        this.b.G(icvVar, j, f, ifsVar);
    }

    @Override // defpackage.ifr
    public final void H(ibq ibqVar, long j, long j2, long j3, float f, ifs ifsVar) {
        int i = (int) (j & 4294967295L);
        ifm ifmVar = this.b;
        int i2 = (int) (j >> 32);
        ifmVar.a.c.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), ifm.v(ifmVar, ibqVar, ifsVar, f, null, 3));
    }

    @Override // defpackage.ifr
    public final void I(long j, long j2, long j3, long j4, ifs ifsVar, float f) {
        this.b.I(j, j2, j3, j4, ifsVar, f);
    }

    @Override // defpackage.ifr
    public final long a() {
        return ifq.a(this.b);
    }

    @Override // defpackage.ifr
    public final long b() {
        return ifq.b(this.b);
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.b.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.b.ed();
    }

    @Override // defpackage.jzx
    public final float ef(long j) {
        return jzw.a(this.b, j);
    }

    @Override // defpackage.jzn
    public final float eg(float f) {
        return jzm.a(this.b, f);
    }

    @Override // defpackage.jzn
    public final float ek(int i) {
        return jzm.b(this.b, i);
    }

    @Override // defpackage.jzn
    public final float el(long j) {
        return jzm.c(this.b, j);
    }

    @Override // defpackage.jzn
    public final float em(float f) {
        return jzm.d(this.b, f);
    }

    @Override // defpackage.jzn
    public final int en(long j) {
        return jzm.e(this.b, j);
    }

    @Override // defpackage.jzn
    public final int eo(float f) {
        return jzm.f(this.b, f);
    }

    @Override // defpackage.jzn
    public final long ep(long j) {
        return jzm.g(this.b, j);
    }

    @Override // defpackage.jzn
    public final long eq(long j) {
        return jzm.h(this.b, j);
    }

    @Override // defpackage.jzx
    public final long er(float f) {
        return jzw.b(this.b, f);
    }

    @Override // defpackage.jzn
    public final long es(float f) {
        return jzm.i(this.b, f);
    }

    @Override // defpackage.ifo
    public final void p() {
        ibt b = t().b();
        itg itgVar = this.a;
        if (itgVar == null) {
            imn.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new ffbx();
        }
        hvh hvhVar = itgVar.C().t;
        if (hvhVar != null && (hvhVar.r & 4) != 0) {
            while (hvhVar != null) {
                int i = hvhVar.q;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    hvhVar = hvhVar.t;
                }
            }
        }
        hvhVar = null;
        if (hvhVar == null) {
            iwi e = isx.e(itgVar, 4);
            if (e.B() == itgVar.C()) {
                e = e.u;
                e.getClass();
            }
            e.F(b, t().a);
            return;
        }
        hne hneVar = null;
        while (hvhVar != null) {
            if (hvhVar instanceof itg) {
                itg itgVar2 = (itg) hvhVar;
                iga igaVar = t().a;
                iwi e2 = isx.e(itgVar2, 4);
                e2.r.v().u(b, kag.d(e2.c), e2, itgVar2, igaVar);
            } else if ((hvhVar.q & 4) != 0 && (hvhVar instanceof isz)) {
                int i2 = 0;
                for (hvh hvhVar2 = ((isz) hvhVar).n; hvhVar2 != null; hvhVar2 = hvhVar2.t) {
                    if ((hvhVar2.q & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            hvhVar = hvhVar2;
                        } else {
                            if (hneVar == null) {
                                hneVar = new hne(new hvh[16]);
                            }
                            if (hvhVar != null) {
                                hneVar.n(hvhVar);
                            }
                            hneVar.n(hvhVar2);
                            hvhVar = null;
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            hvhVar = isx.a(hneVar);
        }
    }

    @Override // defpackage.ifr
    public final kah q() {
        return this.b.q();
    }

    @Override // defpackage.ifr
    public final void r(long j, long j2, long j3, float f, ifs ifsVar, ibx ibxVar, int i) {
        this.b.r(j, j2, j3, f, ifsVar, ibxVar, i);
    }

    @Override // defpackage.ifr
    public final void s(iga igaVar, long j, ffji ffjiVar) {
        igaVar.g(this, q(), j, new iuk(this, this.a, ffjiVar));
    }

    @Override // defpackage.ifr
    public final ifl t() {
        return this.b.b;
    }

    public final void u(ibt ibtVar, long j, iwi iwiVar, itg itgVar, iga igaVar) {
        itg itgVar2 = this.a;
        this.a = itgVar;
        ifm ifmVar = this.b;
        ifl iflVar = ifmVar.b;
        kah q = iwiVar.q();
        jzn c = ifmVar.b.c();
        kah d = iflVar.d();
        ibt b = iflVar.b();
        long a = iflVar.a();
        iga igaVar2 = iflVar.a;
        iflVar.f(iwiVar);
        iflVar.g(q);
        iflVar.e(ibtVar);
        iflVar.h(j);
        iflVar.a = igaVar;
        ibtVar.l();
        try {
            itgVar.s(this);
            ibtVar.j();
            ifl iflVar2 = ifmVar.b;
            iflVar2.f(c);
            iflVar2.g(d);
            iflVar2.e(b);
            iflVar2.h(a);
            iflVar2.a = igaVar2;
            this.a = itgVar2;
        } catch (Throwable th) {
            ibtVar.j();
            ifl iflVar3 = ifmVar.b;
            iflVar3.f(c);
            iflVar3.g(d);
            iflVar3.e(b);
            iflVar3.h(a);
            iflVar3.a = igaVar2;
            throw th;
        }
    }

    @Override // defpackage.ifr
    public final void w(long j, float f, long j2, float f2, ifs ifsVar, int i) {
        this.b.w(j, f, j2, f2, ifsVar, i);
    }

    @Override // defpackage.ifr
    public final void x(icv icvVar, ibq ibqVar, float f, ifs ifsVar, int i) {
        this.b.x(icvVar, ibqVar, f, ifsVar, i);
    }

    @Override // defpackage.ifr
    public final void y(ibq ibqVar, long j, long j2, float f, ifs ifsVar, int i) {
        this.b.y(ibqVar, j, j2, f, ifsVar, i);
    }

    @Override // defpackage.ifr
    public final void z(ibq ibqVar, float f, long j, long j2, ifs ifsVar) {
        this.b.z(ibqVar, f, j, j2, ifsVar);
    }

    public /* synthetic */ iul(byte[] bArr) {
        this.b = new ifm();
    }
}
