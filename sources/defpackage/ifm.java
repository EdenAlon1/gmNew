package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifm implements ifr {
    public final ifk a = new ifk(ifp.a, kah.a, ift.a);
    public final ifl b = new ifl(this);
    private ict c;
    private ict d;

    private final ict J(ibq ibqVar, ifs ifsVar, float f, ibx ibxVar, int i, int i2) {
        ict K = K(ifsVar);
        if (ibqVar != null) {
            ibqVar.a(ifq.b(this), K, f);
        } else {
            if (((iba) K).c != null) {
                K.n(null);
            }
            long g = K.g();
            long j = ibw.a;
            if (!ffcp.a(g, j)) {
                K.k(j);
            }
            if (K.a() != f) {
                K.i(f);
            }
        }
        iba ibaVar = (iba) K;
        if (!ffkj.e(ibaVar.d, ibxVar)) {
            K.l(ibxVar);
        }
        if (!ibk.b(ibaVar.b, i)) {
            K.j(i);
        }
        if (!icd.a(K.d(), i2)) {
            K.m(i2);
        }
        return K;
    }

    private final ict K(ifs ifsVar) {
        if (ffkj.e(ifsVar, ifu.a)) {
            ict ictVar = this.c;
            if (ictVar != null) {
                return ictVar;
            }
            iba ibaVar = new iba();
            ibaVar.s(0);
            this.c = ibaVar;
            return ibaVar;
        }
        if (!(ifsVar instanceof ifv)) {
            throw new ffcd();
        }
        ict p = p();
        float c = p.c();
        ifv ifvVar = (ifv) ifsVar;
        float f = ifvVar.a;
        if (c != f) {
            p.r(f);
        }
        int e = p.e();
        int i = ifvVar.c;
        if (!idm.a(e, i)) {
            p.o(i);
        }
        float b = p.b();
        float f2 = ifvVar.b;
        if (b != f2) {
            p.q(f2);
        }
        int f3 = p.f();
        int i2 = ifvVar.d;
        if (!idn.a(f3, i2)) {
            p.p(i2);
        }
        if (!ffkj.e(null, null)) {
            p.t();
        }
        return p;
    }

    private static final long L(long j, float f) {
        long f2;
        if (f == 1.0f) {
            return j;
        }
        f2 = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), ibw.a(j) * f, ibw.f(j));
        return f2;
    }

    static /* synthetic */ ict u(ifm ifmVar, long j, ifs ifsVar, float f, ibx ibxVar, int i) {
        ict K = ifmVar.K(ifsVar);
        long L = L(j, f);
        long g = K.g();
        long j2 = ibw.a;
        if (!ffcp.a(g, L)) {
            K.k(L);
        }
        iba ibaVar = (iba) K;
        if (ibaVar.c != null) {
            K.n(null);
        }
        if (!ffkj.e(ibaVar.d, ibxVar)) {
            K.l(ibxVar);
        }
        if (!ibk.b(ibaVar.b, i)) {
            K.j(i);
        }
        if (!icd.a(K.d(), 1)) {
            K.m(1);
        }
        return K;
    }

    public static /* synthetic */ ict v(ifm ifmVar, ibq ibqVar, ifs ifsVar, float f, ibx ibxVar, int i) {
        return ifmVar.J(ibqVar, ifsVar, f, ibxVar, i, 1);
    }

    @Override // defpackage.ifr
    public final void A(long j, float f, float f2, long j2, long j3, ifs ifsVar) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, u(this, j, ifsVar, 1.0f, null, 3));
    }

    @Override // defpackage.ifr
    public final void B(ibq ibqVar, float f, long j, ifs ifsVar) {
        this.a.c.d(j, f, v(this, ibqVar, ifsVar, 1.0f, null, 3));
    }

    @Override // defpackage.ifr
    public final void C(ich ichVar, long j, long j2, float f, ifs ifsVar, ibx ibxVar, int i, int i2) {
        this.a.c.u(ichVar, j, j2, J(null, ifsVar, f, ibxVar, i, i2));
    }

    @Override // defpackage.ifr
    public final void D(ich ichVar, ifs ifsVar, ibx ibxVar) {
        throw null;
    }

    @Override // defpackage.ifr
    public final void E(ibq ibqVar, long j, long j2, float f, float f2) {
        throw null;
    }

    @Override // defpackage.ifr
    public final void F(long j, long j2, long j3, float f, float f2, int i) {
        ibt ibtVar = this.a.c;
        ict p = p();
        long L = L(j, f2);
        long g = p.g();
        long j4 = ibw.a;
        if (!ffcp.a(g, L)) {
            p.k(L);
        }
        iba ibaVar = (iba) p;
        if (ibaVar.c != null) {
            p.n(null);
        }
        if (!ffkj.e(ibaVar.d, null)) {
            p.l(null);
        }
        if (!ibk.b(ibaVar.b, i)) {
            p.j(i);
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
        ibtVar.e(j2, j3, p);
    }

    @Override // defpackage.ifr
    public final void G(icv icvVar, long j, float f, ifs ifsVar) {
        this.a.c.f(icvVar, u(this, j, ifsVar, f, null, 3));
    }

    @Override // defpackage.ifr
    public final void H(ibq ibqVar, long j, long j2, long j3, float f, ifs ifsVar) {
        throw null;
    }

    @Override // defpackage.ifr
    public final void I(long j, long j2, long j3, long j4, ifs ifsVar, float f) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), u(this, j, ifsVar, f, null, 3));
    }

    @Override // defpackage.ifr
    public final /* synthetic */ long a() {
        return ifq.a(this);
    }

    @Override // defpackage.ifr
    public final /* synthetic */ long b() {
        return ifq.b(this);
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.a.a.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.a.a.ed();
    }

    @Override // defpackage.jzx
    public final /* synthetic */ float ef(long j) {
        return jzw.a(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float eg(float f) {
        return jzm.a(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float ek(int i) {
        return jzm.b(this, i);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float el(long j) {
        return jzm.c(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float em(float f) {
        return jzm.d(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int en(long j) {
        return jzm.e(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int eo(float f) {
        return jzm.f(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long ep(long j) {
        return jzm.g(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long eq(long j) {
        return jzm.h(this, j);
    }

    @Override // defpackage.jzx
    public final /* synthetic */ long er(float f) {
        return jzw.b(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long es(float f) {
        return jzm.i(this, f);
    }

    public final ict p() {
        ict ictVar = this.d;
        if (ictVar != null) {
            return ictVar;
        }
        iba ibaVar = new iba();
        ibaVar.s(1);
        this.d = ibaVar;
        return ibaVar;
    }

    @Override // defpackage.ifr
    public final kah q() {
        return this.a.b;
    }

    @Override // defpackage.ifr
    public final void r(long j, long j2, long j3, float f, ifs ifsVar, ibx ibxVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.g(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L)), u(this, j, ifsVar, f, ibxVar, i));
    }

    @Override // defpackage.ifr
    public final /* synthetic */ void s(iga igaVar, long j, ffji ffjiVar) {
        throw null;
    }

    @Override // defpackage.ifr
    public final ifl t() {
        return this.b;
    }

    @Override // defpackage.ifr
    public final void w(long j, float f, long j2, float f2, ifs ifsVar, int i) {
        this.a.c.d(j2, f, u(this, j, ifsVar, f2, null, i));
    }

    @Override // defpackage.ifr
    public final void x(icv icvVar, ibq ibqVar, float f, ifs ifsVar, int i) {
        this.a.c.f(icvVar, v(this, ibqVar, ifsVar, f, null, i));
    }

    @Override // defpackage.ifr
    public final void y(ibq ibqVar, long j, long j2, float f, ifs ifsVar, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = (int) (j >> 32);
        this.a.c.g(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 & 4294967295L)), v(this, ibqVar, ifsVar, f, null, i));
    }

    @Override // defpackage.ifr
    public final void z(ibq ibqVar, float f, long j, long j2, ifs ifsVar) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        this.a.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)), 270.0f, f, v(this, ibqVar, ifsVar, 1.0f, null, 3));
    }
}
