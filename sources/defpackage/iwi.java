package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iwi extends iuv implements ipl, ioc, iwy {
    public ibt A;
    public boolean B;
    public iwu C;
    private boolean D;
    private boolean E;
    private jzn F;
    private kah G;
    private ipo I;
    private cog J;
    private iah K;
    private itr L;
    private ffjm M;
    private iga O;
    public final iui r;
    public boolean s;
    public boolean t;
    public iwi u;
    public iwi v;
    public ffji w;
    public float y;
    public iga z;
    private static final ffji f = iwb.a;
    public static final ffji n = iwa.a;
    public static final idd o = new idd();
    private static final itr g = new itr();
    private static final float[] h = icm.e();
    public static final iwc p = new ivy();
    public static final iwc q = new ivz();
    private float H = 0.8f;
    public long x = 0;
    private final ffix N = new iwf(this);

    public iwi(iui iuiVar) {
        this.r = iuiVar;
        this.F = iuiVar.s;
        this.G = iuiVar.t;
    }

    private final ffjm G() {
        ffjm ffjmVar = this.M;
        if (ffjmVar != null) {
            return ffjmVar;
        }
        iwd iwdVar = new iwd(this, new iwe(this));
        this.M = iwdVar;
        return iwdVar;
    }

    private final void H(iwi iwiVar, iah iahVar, boolean z) {
        if (iwiVar == this) {
            return;
        }
        iwi iwiVar2 = this.v;
        if (iwiVar2 != null) {
            iwiVar2.H(iwiVar, iahVar, z);
        }
        long j = this.x;
        float a = kaa.a(j);
        iahVar.a -= a;
        iahVar.c -= a;
        float b = kaa.b(j);
        iahVar.b -= b;
        iahVar.d -= b;
        iwu iwuVar = this.C;
        if (iwuVar != null) {
            iwuVar.e(iahVar, true);
            if (this.E && z) {
                long j2 = this.c;
                iahVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    static /* synthetic */ boolean aB(iwi iwiVar) {
        return iwiVar.aG(true);
    }

    private final void aC(hvh hvhVar, iwc iwcVar, long j, itl itlVar, int i, boolean z) {
        if (hvhVar == null) {
            E(iwcVar, j, itlVar, i, z);
            return;
        }
        int i2 = itlVar.c;
        itlVar.d(i2 + 1, itlVar.a());
        itlVar.c++;
        itlVar.a.h(hvhVar);
        itlVar.b.b(itm.a(-1.0f, z, false));
        aC(iwj.a(hvhVar, iwcVar.a()), iwcVar, j, itlVar, i, z);
        itlVar.c = i2;
    }

    private final void aD(hvh hvhVar, iwc iwcVar, long j, itl itlVar, int i, boolean z, float f2) {
        if (hvhVar == null) {
            E(iwcVar, j, itlVar, i, z);
            return;
        }
        int i2 = itlVar.c;
        itlVar.d(i2 + 1, itlVar.a());
        itlVar.c++;
        itlVar.a.h(hvhVar);
        itlVar.b.b(itm.a(f2, z, false));
        ap(iwj.a(hvhVar, iwcVar.a()), iwcVar, j, itlVar, i, z, f2, true);
        itlVar.c = i2;
    }

    private final void aE(iwi iwiVar, float[] fArr) {
        if (ffkj.e(iwiVar, this)) {
            return;
        }
        iwi iwiVar2 = this.v;
        iwiVar2.getClass();
        iwiVar2.aE(iwiVar, fArr);
        if (!kaa.f(this.x, 0L)) {
            float[] fArr2 = h;
            icm.c(fArr2);
            long j = this.x;
            icm.f(fArr2, -kaa.a(j), -kaa.b(j));
            icm.d(fArr, fArr2);
        }
        iwu iwuVar = this.C;
        if (iwuVar != null) {
            iwuVar.d(fArr);
        }
    }

    private final void aF(iwi iwiVar, float[] fArr) {
        iwi iwiVar2 = this;
        while (!ffkj.e(iwiVar2, iwiVar)) {
            iwu iwuVar = iwiVar2.C;
            if (iwuVar != null) {
                iwuVar.i(fArr);
            }
            if (!kaa.f(iwiVar2.x, 0L)) {
                float[] fArr2 = h;
                icm.c(fArr2);
                icm.f(fArr2, kaa.a(r1), kaa.b(r1));
                icm.d(fArr, fArr2);
            }
            iwiVar2 = iwiVar2.v;
            iwiVar2.getClass();
        }
    }

    private final boolean aG(boolean z) {
        iui iuiVar;
        iwx iwxVar;
        boolean z2 = false;
        if (this.O != null) {
            return false;
        }
        iwu iwuVar = this.C;
        if (iwuVar == null) {
            if (this.w != null) {
                imn.c("null layer with a non-null layerBlock");
            }
            return false;
        }
        ffji ffjiVar = this.w;
        if (ffjiVar == null) {
            imn.a("updateLayerParameters requires a non-null layerBlock");
            throw new ffbx();
        }
        idd iddVar = o;
        iddVar.x(1.0f);
        iddVar.y(1.0f);
        iddVar.a(1.0f);
        iddVar.D(0.0f);
        iddVar.E(0.0f);
        iddVar.z(0.0f);
        iddVar.b(icg.a);
        iddVar.B(icg.a);
        iddVar.u(0.0f);
        iddVar.v(0.0f);
        iddVar.w(0.0f);
        iddVar.q(8.0f);
        iddVar.C(idr.a);
        iddVar.A(idb.a);
        iddVar.r(false);
        iddVar.t(null);
        iddVar.F();
        iddVar.p(3);
        iddVar.s(0);
        iddVar.r = 9205357640488583168L;
        iddVar.x = null;
        iddVar.a = 0;
        iui iuiVar2 = this.r;
        iddVar.s = iuiVar2.s;
        iddVar.t = iuiVar2.t;
        iddVar.r = kag.d(this.c);
        ac().d(this, f, new iwh(ffjiVar));
        itr itrVar = this.L;
        if (itrVar == null) {
            itrVar = new itr();
            this.L = itrVar;
        }
        itr itrVar2 = g;
        itrVar2.a = itrVar.a;
        itrVar2.b = itrVar.b;
        itrVar2.c = itrVar.c;
        itrVar2.d = itrVar.d;
        itrVar2.e = itrVar.e;
        itrVar2.f = itrVar.f;
        itrVar2.g = itrVar.g;
        itrVar2.h = itrVar.h;
        itrVar2.i = itrVar.i;
        itrVar.a = iddVar.b;
        itrVar.b = iddVar.c;
        itrVar.c = iddVar.e;
        itrVar.d = iddVar.f;
        itrVar.e = iddVar.j;
        itrVar.f = iddVar.k;
        itrVar.g = iddVar.l;
        itrVar.h = iddVar.m;
        itrVar.i = iddVar.n;
        iwuVar.k(iddVar);
        boolean z3 = this.E;
        boolean z4 = iddVar.p;
        this.E = z4;
        this.H = iddVar.d;
        if (itrVar2.a == itrVar.a && itrVar2.b == itrVar.b && itrVar2.c == itrVar.c && itrVar2.d == itrVar.d && itrVar2.e == itrVar.e && itrVar2.f == itrVar.f && itrVar2.g == itrVar.g && itrVar2.h == itrVar.h && idr.d(itrVar2.i, itrVar.i)) {
            z2 = true;
        }
        boolean z5 = !z2;
        if (z && ((!z2 || z3 != z4) && (iwxVar = (iuiVar = this.r).l) != null)) {
            iwxVar.u(iuiVar);
        }
        return z5;
    }

    private final long aH(iwi iwiVar, long j) {
        if (iwiVar == this) {
            return j;
        }
        iwi iwiVar2 = this.v;
        return (iwiVar2 == null || ffkj.e(iwiVar, iwiVar2)) ? ay(j) : ay(iwiVar2.aH(iwiVar, j));
    }

    private static final iwi aI(ioc iocVar) {
        iwi a;
        ipc ipcVar = iocVar instanceof ipc ? (ipc) iocVar : null;
        if (ipcVar != null && (a = ipcVar.a()) != null) {
            return a;
        }
        iocVar.getClass();
        return (iwi) iocVar;
    }

    @Override // defpackage.iwy
    public final boolean A() {
        return (this.C == null || this.D || !this.r.e()) ? false : true;
    }

    public abstract hvh B();

    public abstract iuw C();

    public abstract void D();

    public void E(iwc iwcVar, long j, itl itlVar, int i, boolean z) {
        iwi iwiVar = this.u;
        if (iwiVar != null) {
            iwiVar.ag(iwcVar, iwiVar.ay(j), itlVar, i, z);
        }
    }

    public void F(ibt ibtVar, iga igaVar) {
        throw null;
    }

    @Override // defpackage.iuv
    public final long I() {
        return this.x;
    }

    @Override // defpackage.iuv
    public final ipo K() {
        ipo ipoVar = this.I;
        if (ipoVar != null) {
            return ipoVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.iuv, defpackage.ivn
    public final iui L() {
        return this.r;
    }

    @Override // defpackage.iuv
    public final iuv M() {
        return this.u;
    }

    @Override // defpackage.iuv
    public final iuv N() {
        return this.v;
    }

    @Override // defpackage.iuv
    public final void Q() {
        iga igaVar = this.O;
        if (igaVar != null) {
            x(this.x, this.y, igaVar);
        } else {
            ee(this.x, this.y, this.w);
        }
    }

    @Override // defpackage.iuv
    public final boolean S() {
        return this.I != null;
    }

    protected final float U(long j, long j2) {
        if (w() >= Float.intBitsToFloat((int) (j2 >> 32)) && v() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long V = V(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (V >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (V & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - w());
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        float max2 = Math.max(0.0f, intBitsToFloat4 < 0.0f ? -intBitsToFloat4 : intBitsToFloat4 - v());
        long floatToRawIntBits = Float.floatToRawIntBits(max) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(max2) & 4294967295L;
        if (intBitsToFloat <= 0.0f && intBitsToFloat2 <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        long j3 = floatToRawIntBits2 | floatToRawIntBits;
        int i = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i) > intBitsToFloat) {
            return Float.POSITIVE_INFINITY;
        }
        int i2 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i2) > intBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat5 = Float.intBitsToFloat(i);
        float intBitsToFloat6 = Float.intBitsToFloat(i2);
        return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat6 * intBitsToFloat6);
    }

    public final long V(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - w();
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) - v()) / 2.0f;
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final long W() {
        return this.F.eq(this.r.u.g());
    }

    public final hvh X(int i) {
        hvh hvhVar;
        boolean h2 = iwk.h(i);
        if (h2) {
            hvhVar = B();
        } else {
            hvhVar = B().s;
            if (hvhVar == null) {
                return null;
            }
        }
        for (hvh Y = Y(h2); Y != null && (Y.r & i) != 0; Y = Y.t) {
            if ((Y.q & i) != 0) {
                return Y;
            }
            if (Y == hvhVar) {
                return null;
            }
        }
        return null;
    }

    public final hvh Y(boolean z) {
        hvh B;
        if (this.r.z() == this) {
            return this.r.x.e;
        }
        if (!z) {
            iwi iwiVar = this.v;
            if (iwiVar == null) {
                return null;
            }
            return iwiVar.B();
        }
        iwi iwiVar2 = this.v;
        if (iwiVar2 == null || (B = iwiVar2.B()) == null) {
            return null;
        }
        return B.t;
    }

    public final iah Z() {
        iah iahVar = this.K;
        if (iahVar != null) {
            return iahVar;
        }
        iah iahVar2 = new iah();
        this.K = iahVar2;
        return iahVar2;
    }

    public final isb aa() {
        return this.r.y.o;
    }

    public final iwi ab(iwi iwiVar) {
        iui iuiVar = iwiVar.r;
        iui iuiVar2 = this.r;
        if (iuiVar == iuiVar2) {
            hvh B = iwiVar.B();
            hvh B2 = B();
            if (!B2.C().z) {
                imn.c("visitLocalAncestors called on an unattached node");
            }
            hvh C = B2.C();
            while (true) {
                C = C.s;
                if (C == null) {
                    break;
                }
                if ((C.q & 2) != 0 && C == B) {
                    break;
                }
            }
            return iwiVar;
        }
        while (iuiVar.n > iuiVar2.n) {
            iuiVar = iuiVar.u();
            iuiVar.getClass();
        }
        while (iuiVar2.n > iuiVar.n) {
            iuiVar2 = iuiVar2.u();
            iuiVar2.getClass();
        }
        while (iuiVar != iuiVar2) {
            iuiVar = iuiVar.u();
            iuiVar2 = iuiVar2.u();
            if (iuiVar == null || iuiVar2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (iuiVar2 != this.r) {
            if (iuiVar != iwiVar.r) {
                return iuiVar.y();
            }
            return iwiVar;
        }
        return this;
    }

    public final ixh ac() {
        return ((AndroidComposeView) ium.a(this.r)).v;
    }

    public final void ad(ibt ibtVar, iga igaVar) {
        iwu iwuVar = this.C;
        if (iwuVar != null) {
            iwuVar.c(ibtVar, igaVar);
            return;
        }
        long j = this.x;
        float a = kaa.a(j);
        float b = kaa.b(j);
        ibtVar.o(a, b);
        af(ibtVar, igaVar);
        ibtVar.o(-a, -b);
    }

    protected final void ae(ibt ibtVar, ict ictVar) {
        long j = this.c;
        ibtVar.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, ictVar);
    }

    public final void af(ibt ibtVar, iga igaVar) {
        ibt ibtVar2;
        iga igaVar2;
        hvh X = X(4);
        if (X == null) {
            F(ibtVar, igaVar);
            return;
        }
        iul v = this.r.v();
        long d = kag.d(this.c);
        hne hneVar = null;
        while (X != null) {
            if (X instanceof itg) {
                ibtVar2 = ibtVar;
                igaVar2 = igaVar;
                v.u(ibtVar2, d, this, (itg) X, igaVar2);
            } else {
                ibtVar2 = ibtVar;
                igaVar2 = igaVar;
                if ((X.q & 4) != 0 && (X instanceof isz)) {
                    int i = 0;
                    for (hvh hvhVar = ((isz) X).n; hvhVar != null; hvhVar = hvhVar.t) {
                        if ((hvhVar.q & 4) != 0) {
                            i++;
                            if (i == 1) {
                                X = hvhVar;
                            } else {
                                if (hneVar == null) {
                                    hneVar = new hne(new hvh[16]);
                                }
                                if (X != null) {
                                    hneVar.n(X);
                                }
                                hneVar.n(hvhVar);
                                X = null;
                            }
                        }
                    }
                    if (i == 1) {
                        ibtVar = ibtVar2;
                        igaVar = igaVar2;
                    }
                }
            }
            X = isx.a(hneVar);
            ibtVar = ibtVar2;
            igaVar = igaVar2;
        }
    }

    public final void ag(iwc iwcVar, long j, itl itlVar, int i, boolean z) {
        iwi iwiVar;
        boolean z2;
        float f2;
        boolean z3;
        hvh X = X(iwcVar.a());
        if (!ax(j)) {
            if (ilq.b(i, 1)) {
                float U = U(j, W());
                if ((Float.floatToRawIntBits(U) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || !itlVar.e(U, false)) {
                    return;
                }
                aD(X, iwcVar, j, itlVar, i, false, U);
                return;
            }
            return;
        }
        if (X == null) {
            E(iwcVar, j, itlVar, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < w() && intBitsToFloat2 < v()) {
            aC(X, iwcVar, j, itlVar, i, z);
            return;
        }
        float U2 = !ilq.b(i, 1) ? Float.POSITIVE_INFINITY : U(j, W());
        if ((Float.floatToRawIntBits(U2) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            z2 = z;
            if (itlVar.e(U2, z2)) {
                iwiVar = this;
                f2 = U2;
                z3 = true;
                iwiVar.ap(X, iwcVar, j, itlVar, i, z2, f2, z3);
            }
            iwiVar = this;
        } else {
            iwiVar = this;
            z2 = z;
        }
        f2 = U2;
        z3 = false;
        iwiVar.ap(X, iwcVar, j, itlVar, i, z2, f2, z3);
    }

    public final void ah() {
        iwu iwuVar = this.C;
        if (iwuVar != null) {
            iwuVar.invalidate();
            return;
        }
        iwi iwiVar = this.v;
        if (iwiVar != null) {
            iwiVar.ah();
        }
    }

    public final void ai() {
        if (this.C != null || this.w == null) {
            return;
        }
        iwu a = iwv.a(ium.a(this.r), G(), this.N, this.O, false, 8);
        a.g(this.c);
        a.f(this.x);
        a.invalidate();
        this.C = a;
    }

    public final void aj() {
        this.r.y.f();
    }

    public final void ak() {
        iwu iwuVar = this.C;
        if (iwuVar != null) {
            iwuVar.b();
        }
        this.C = null;
    }

    public final void al() {
        iwu iwuVar = this.C;
        if (iwuVar != null) {
            iwuVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [hvh] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [hvh] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void am() {
        hvh hvhVar;
        if (av(128)) {
            hrw a = hrv.a();
            ffji k = a != null ? a.k() : null;
            hrw b = hrv.b(a);
            try {
                boolean h2 = iwk.h(128);
                if (h2) {
                    hvhVar = B();
                } else {
                    hvhVar = B().s;
                    if (hvhVar == null) {
                    }
                }
                for (hvh Y = Y(h2); Y != null; Y = Y.t) {
                    if ((Y.r & 128) == 0) {
                        break;
                    }
                    if ((Y.q & 128) != 0) {
                        ?? r8 = 0;
                        isz iszVar = Y;
                        while (iszVar != 0) {
                            if (iszVar instanceof its) {
                                ((its) iszVar).i(this.c);
                            } else if ((iszVar.q & 128) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar2 = iszVar.n;
                                int i = 0;
                                iszVar = iszVar;
                                r8 = r8;
                                while (hvhVar2 != null) {
                                    if ((hvhVar2.q & 128) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            iszVar = hvhVar2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r8.n(iszVar);
                                            }
                                            r8.n(hvhVar2);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar2 = hvhVar2.t;
                                    iszVar = iszVar;
                                    r8 = r8;
                                }
                                if (i != 1) {
                                }
                            }
                            iszVar = isx.a(r8);
                        }
                    }
                    if (Y == hvhVar) {
                        break;
                    }
                }
            } finally {
                hrv.e(a, b, k);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void an() {
        hvh hvhVar;
        boolean h2 = iwk.h(128);
        if (h2) {
            hvhVar = B();
        } else {
            hvhVar = B().s;
            if (hvhVar == null) {
                return;
            }
        }
        for (hvh Y = Y(h2); Y != null && (Y.r & 128) != 0; Y = Y.t) {
            if ((Y.q & 128) != 0) {
                isz iszVar = Y;
                ?? r5 = 0;
                while (iszVar != 0) {
                    if (iszVar instanceof its) {
                        ((its) iszVar).dY(this);
                    } else if ((iszVar.q & 128) != 0 && (iszVar instanceof isz)) {
                        hvh hvhVar2 = iszVar.n;
                        int i = 0;
                        iszVar = iszVar;
                        r5 = r5;
                        while (hvhVar2 != null) {
                            if ((hvhVar2.q & 128) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    iszVar = hvhVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new hne(new hvh[16]);
                                    }
                                    if (iszVar != 0) {
                                        r5.n(iszVar);
                                    }
                                    r5.n(hvhVar2);
                                    iszVar = 0;
                                }
                            }
                            hvhVar2 = hvhVar2.t;
                            iszVar = iszVar;
                            r5 = r5;
                        }
                        if (i != 1) {
                        }
                    }
                    iszVar = isx.a(r5);
                }
            }
            if (Y == hvhVar) {
                return;
            }
        }
    }

    public final void ao() {
        this.D = true;
        this.N.invoke();
        as();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [hvh] */
    /* JADX WARN: Type inference failed for: r1v24 */
    public final void ap(hvh hvhVar, iwc iwcVar, long j, itl itlVar, int i, boolean z, float f2, boolean z2) {
        hvh a;
        if (hvhVar == null) {
            E(iwcVar, j, itlVar, i, z);
            return;
        }
        int i2 = i;
        if (ilq.b(i2, 3) || ilq.b(i2, 4)) {
            isz iszVar = hvhVar;
            hne hneVar = null;
            while (true) {
                if (iszVar == 0) {
                    break;
                }
                if (iszVar instanceof ixl) {
                    long a2 = ((ixl) iszVar).a();
                    int i3 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i3) >= (-(q() == kah.a ? ixt.b(a2) : ixt.a(a2)))) {
                        if (Float.intBitsToFloat(i3) < w() + (q() == kah.a ? ixt.a(a2) : ixt.b(a2))) {
                            int i4 = (int) (4294967295L & j);
                            if (Float.intBitsToFloat(i4) >= (-ixs.a(a2, 1)) && Float.intBitsToFloat(i4) < v() + ixs.a(a2, 3)) {
                                iwg iwgVar = new iwg(this, hvhVar, iwcVar, j, itlVar, i2, z, f2, z2);
                                if (itlVar.c == ffdx.e(itlVar)) {
                                    int i5 = itlVar.c;
                                    itlVar.d(i5 + 1, itlVar.a());
                                    itlVar.c++;
                                    itlVar.a.h(hvhVar);
                                    itlVar.b.b(itm.a(0.0f, z, true));
                                    iwgVar.invoke();
                                    itlVar.c = i5;
                                    return;
                                }
                                long b = itlVar.b();
                                int i6 = itlVar.c;
                                if (!ite.c(b)) {
                                    if (ite.a(b) > 0.0f) {
                                        int i7 = itlVar.c;
                                        itlVar.d(i7 + 1, itlVar.a());
                                        itlVar.c++;
                                        itlVar.a.h(hvhVar);
                                        itlVar.b.b(itm.a(0.0f, z, true));
                                        iwgVar.invoke();
                                        itlVar.c = i7;
                                        return;
                                    }
                                    return;
                                }
                                int e = ffdx.e(itlVar);
                                itlVar.c = e;
                                itlVar.d(e + 1, itlVar.a());
                                itlVar.c++;
                                itlVar.a.h(hvhVar);
                                itlVar.b.b(itm.a(0.0f, z, true));
                                iwgVar.invoke();
                                itlVar.c = e;
                                if (ite.a(itlVar.b()) < 0.0f) {
                                    itlVar.d(i6 + 1, itlVar.c + 1);
                                }
                                itlVar.c = i6;
                                return;
                            }
                        }
                    }
                } else {
                    if ((iszVar.q & 16) != 0 && (iszVar instanceof isz)) {
                        hvh hvhVar2 = iszVar.n;
                        int i8 = 0;
                        a = iszVar;
                        hneVar = hneVar;
                        while (hvhVar2 != null) {
                            if ((hvhVar2.q & 16) != 0) {
                                i8++;
                                hneVar = hneVar;
                                if (i8 == 1) {
                                    a = hvhVar2;
                                } else {
                                    if (hneVar == null) {
                                        hneVar = new hne(new hvh[16]);
                                    }
                                    if (a != null) {
                                        hneVar.n(a);
                                    }
                                    hneVar.n(hvhVar2);
                                    a = null;
                                }
                            }
                            hvhVar2 = hvhVar2.t;
                            a = a;
                            hneVar = hneVar;
                        }
                        if (i8 == 1) {
                            i2 = i;
                            iszVar = a;
                            hneVar = hneVar;
                        }
                    }
                    a = isx.a(hneVar);
                    i2 = i;
                    iszVar = a;
                    hneVar = hneVar;
                }
            }
        }
        if (z2) {
            aD(hvhVar, iwcVar, j, itlVar, i, z, f2);
        } else {
            iwcVar.d(hvhVar);
            ap(iwj.a(hvhVar, iwcVar.a()), iwcVar, j, itlVar, i, z, f2, false);
        }
    }

    public final void aq(long j, float f2, ffji ffjiVar, iga igaVar) {
        if (igaVar != null) {
            if (ffjiVar != null) {
                imn.b("both ways to create layers shouldn't be used together");
            }
            if (this.O != igaVar) {
                this.O = null;
                au(null, false);
                this.O = igaVar;
            }
            if (this.C == null) {
                iwu a = iwv.a(ium.a(this.r), G(), this.N, igaVar, false, 8);
                a.g(this.c);
                a.f(j);
                this.C = a;
                this.r.aB();
                this.N.invoke();
            }
        } else {
            if (this.O != null) {
                this.O = null;
                au(null, false);
            }
            au(ffjiVar, false);
        }
        if (!kaa.f(this.x, j)) {
            this.x = j;
            this.r.y.o.u();
            iwu iwuVar = this.C;
            if (iwuVar != null) {
                iwuVar.f(j);
            } else {
                iwi iwiVar = this.v;
                if (iwiVar != null) {
                    iwiVar.ah();
                }
            }
            T(this);
            iui iuiVar = this.r;
            iwx iwxVar = iuiVar.l;
            if (iwxVar != null) {
                iwxVar.u(iuiVar);
            }
        }
        this.y = f2;
        if (this.k) {
            return;
        }
        P(K());
    }

    public final void ar(iah iahVar, boolean z, boolean z2) {
        iwu iwuVar = this.C;
        if (iwuVar != null) {
            if (this.E) {
                if (z2) {
                    long W = W();
                    float intBitsToFloat = Float.intBitsToFloat((int) (W >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (W & 4294967295L)) / 2.0f;
                    long j = this.c;
                    iahVar.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (4294967295L & j)) + intBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    iahVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (iahVar.c()) {
                    return;
                }
            }
            iwuVar.e(iahVar, false);
        }
        long j3 = this.x;
        float a = kaa.a(j3);
        iahVar.a += a;
        iahVar.c += a;
        float b = kaa.b(j3);
        iahVar.b += b;
        iahVar.d += b;
    }

    public final void as() {
        if (this.C != null) {
            if (this.O != null) {
                this.O = null;
            }
            au(null, false);
            this.r.ae(false);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v1 hvh, still in use, count: 2, list:
          (r6v1 hvh) from 0x0069: IF  (r6v1 hvh) == (null hvh)  -> B:113:0x00cb A[HIDDEN] (LINE:106)
          (r6v1 hvh) from 0x006d: PHI (r6v2 hvh) = (r6v1 hvh) binds: [B:119:0x0069] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [hne] */
    public final void at(defpackage.ipo r21) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwi.at(ipo):void");
    }

    public final void au(ffji ffjiVar, boolean z) {
        iwx iwxVar;
        if (ffjiVar != null && this.O != null) {
            imn.b("layerBlock can't be provided when explicitLayer is provided");
        }
        iui iuiVar = this.r;
        boolean z2 = true;
        if (!z && this.w == ffjiVar && ffkj.e(this.F, iuiVar.s) && this.G == iuiVar.t) {
            z2 = false;
        }
        this.F = iuiVar.s;
        this.G = iuiVar.t;
        if (!iuiVar.e() || ffjiVar == null) {
            this.w = null;
            iwu iwuVar = this.C;
            if (iwuVar != null) {
                iwuVar.b();
                iuiVar.aB();
                this.N.invoke();
                if (t() && iuiVar.g() && (iwxVar = iuiVar.l) != null) {
                    iwxVar.u(iuiVar);
                }
            }
            this.C = null;
            this.B = false;
            return;
        }
        this.w = ffjiVar;
        if (this.C != null) {
            if (z2 && aB(this)) {
                ((AndroidComposeView) ium.a(iuiVar)).k.d(iuiVar);
                return;
            }
            return;
        }
        iwu a = iwv.a(ium.a(iuiVar), G(), this.N, null, iuiVar.i, 4);
        a.g(this.c);
        a.f(this.x);
        this.C = a;
        aB(this);
        iuiVar.aB();
        this.N.invoke();
    }

    public final boolean av(int i) {
        hvh Y = Y(iwk.h(i));
        return (Y == null || (i & Y.C().r) == 0) ? false : true;
    }

    public final boolean aw() {
        if (this.C != null && this.H <= 0.0f) {
            return true;
        }
        iwi iwiVar = this.v;
        if (iwiVar != null) {
            return iwiVar.aw();
        }
        return false;
    }

    protected final boolean ax(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        iwu iwuVar = this.C;
        return iwuVar == null || !this.E || iwuVar.l(j);
    }

    public final long ay(long j) {
        long j2 = this.x;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - kaa.a(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - kaa.b(j2);
        long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
        iwu iwuVar = this.C;
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (floatToRawIntBits << 32);
        return iwuVar != null ? iwuVar.a(floatToRawIntBits2, true) : floatToRawIntBits2;
    }

    public final long az(long j) {
        iwu iwuVar = this.C;
        if (iwuVar != null) {
            j = iwuVar.a(j, false);
        }
        return kab.b(j, this.x);
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.r.s.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.r.s.ed();
    }

    @Override // defpackage.iqk
    protected void ee(long j, float f2, ffji ffjiVar) {
        if (!this.s) {
            aq(j, f2, ffjiVar, null);
            return;
        }
        iuw C = C();
        C.getClass();
        aq(C.h, f2, ffjiVar, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ike, iwx] */
    @Override // defpackage.ioc
    public final void ej(float[] fArr) {
        ?? a = ium.a(this.r);
        aF(aI(iod.f(this)), fArr);
        a.g(fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.iqk, defpackage.inx
    public final Object f() {
        if (!this.r.x.j(64)) {
            return null;
        }
        B();
        fflb fflbVar = new fflb();
        for (hvh hvhVar = this.r.x.d; hvhVar != null; hvhVar = hvhVar.s) {
            if ((hvhVar.q & 64) != 0) {
                ?? r5 = 0;
                isz iszVar = hvhVar;
                while (iszVar != 0) {
                    if (iszVar instanceof ixi) {
                        jzn jznVar = this.r.s;
                        fflbVar.a = ((ixi) iszVar).eb(fflbVar.a);
                    } else if ((iszVar.q & 64) != 0 && (iszVar instanceof isz)) {
                        hvh hvhVar2 = iszVar.n;
                        int i = 0;
                        iszVar = iszVar;
                        r5 = r5;
                        while (hvhVar2 != null) {
                            if ((hvhVar2.q & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    iszVar = hvhVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new hne(new hvh[16]);
                                    }
                                    if (iszVar != 0) {
                                        r5.n(iszVar);
                                    }
                                    r5.n(hvhVar2);
                                    iszVar = 0;
                                }
                            }
                            hvhVar2 = hvhVar2.t;
                            iszVar = iszVar;
                            r5 = r5;
                        }
                        if (i != 1) {
                        }
                    }
                    iszVar = isx.a(r5);
                }
            }
        }
        return fflbVar.a;
    }

    @Override // defpackage.ioc
    public final long g() {
        return this.c;
    }

    @Override // defpackage.ioc
    public final long h(ioc iocVar, long j) {
        return u(iocVar, j);
    }

    @Override // defpackage.ioc
    public final long i(long j) {
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        aj();
        for (iwi iwiVar = this; iwiVar != null; iwiVar = iwiVar.v) {
            j = iwiVar.az(j);
        }
        return j;
    }

    @Override // defpackage.ioc
    public final long j(long j) {
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ium.a(this.r).h(i(j));
    }

    @Override // defpackage.ioc
    public final long k(long j) {
        iui iuiVar = this.r;
        long i = i(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) ium.a(iuiVar);
        androidComposeView.J();
        return icm.a(androidComposeView.z, i);
    }

    @Override // defpackage.ioc
    public final long l(long j) {
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return u(iod.f(this), ium.a(this.r).i(j));
    }

    @Override // defpackage.ioc
    public final long m(long j) {
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ioc f2 = iod.f(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) ium.a(this.r);
        androidComposeView.J();
        return u(f2, iak.e(icm.a(androidComposeView.A, j), iod.a(f2)));
    }

    @Override // defpackage.ioc
    public final iam n(ioc iocVar, boolean z) {
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!iocVar.t()) {
            imn.c(a.i(iocVar, "LayoutCoordinates ", " is not attached!"));
        }
        iwi aI = aI(iocVar);
        aI.aj();
        iwi ab = ab(aI);
        iah Z = Z();
        Z.a = 0.0f;
        Z.b = 0.0f;
        Z.c = (int) (iocVar.g() >> 32);
        Z.d = (int) (iocVar.g() & 4294967295L);
        while (aI != ab) {
            aI.ar(Z, z, false);
            if (Z.c()) {
                return iam.a;
            }
            aI = aI.v;
            aI.getClass();
        }
        H(ab, Z, z);
        return iai.a(Z);
    }

    @Override // defpackage.ioc
    public final ioc o() {
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        aj();
        return this.v;
    }

    @Override // defpackage.ioc
    public final ioc p() {
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        aj();
        return this.r.z().v;
    }

    @Override // defpackage.iny
    public final kah q() {
        return this.r.t;
    }

    @Override // defpackage.ioc
    public final void r(ioc iocVar, float[] fArr) {
        iwi aI = aI(iocVar);
        aI.aj();
        iwi ab = ab(aI);
        icm.c(fArr);
        aI.aF(ab, fArr);
        aE(ab, fArr);
    }

    @Override // defpackage.ioc
    public final boolean t() {
        return B().z;
    }

    @Override // defpackage.ioc
    public final long u(ioc iocVar, long j) {
        if (iocVar instanceof ipc) {
            ((ipc) iocVar).a().aj();
            return iocVar.u(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        iwi aI = aI(iocVar);
        aI.aj();
        iwi ab = ab(aI);
        while (aI != ab) {
            j = aI.az(j);
            aI = aI.v;
            aI.getClass();
        }
        return aH(ab, j);
    }

    @Override // defpackage.iqk
    public void x(long j, float f2, iga igaVar) {
        if (!this.s) {
            aq(j, f2, null, igaVar);
            return;
        }
        iuw C = C();
        C.getClass();
        aq(C.h, f2, null, igaVar);
    }

    @Override // defpackage.iuv
    public final ioc J() {
        return this;
    }
}
