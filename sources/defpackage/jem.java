package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jem implements iwu {
    public ffjm a;
    private iga b;
    private final AndroidComposeView c;
    private ffix d;
    private boolean f;
    private float[] h;
    private boolean i;
    private int m;
    private icr o;
    private boolean p;
    private boolean q;
    private boolean s;
    private final iaw u;
    private long e = 9223372034707292159L;
    private final float[] g = icm.e();
    private jzn j = new jzo(1.0f);
    private kah k = kah.a;
    private final ifm l = new ifm();
    private long n = idr.a;
    private boolean r = true;
    private final ffji t = new jel(this);

    public jem(iga igaVar, iaw iawVar, AndroidComposeView androidComposeView, ffjm ffjmVar, ffix ffixVar) {
        this.b = igaVar;
        this.u = iawVar;
        this.c = androidComposeView;
        this.a = ffjmVar;
        this.d = ffixVar;
    }

    private final void n(boolean z) {
        if (z != this.i) {
            this.i = z;
            this.c.H(this, z);
        }
    }

    private final void o() {
        jhl.a(this.c);
    }

    private final float[] p() {
        float[] fArr = this.h;
        if (fArr == null) {
            fArr = icm.e();
            this.h = fArr;
        }
        if (this.q) {
            this.q = false;
            float[] q = q();
            if (this.r) {
                return q;
            }
            if (!jev.a(q, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    private final float[] q() {
        if (this.p) {
            iga igaVar = this.b;
            long j = igaVar.o;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = ias.b(kag.d(this.e));
            }
            float[] fArr = this.g;
            igd igdVar = igaVar.a;
            int i = (int) (4294967295L & j);
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            float i2 = igdVar.i();
            float j2 = igdVar.j();
            float c = igdVar.c();
            float d = igdVar.d();
            float e = igdVar.e();
            float f = igdVar.f();
            float g = igdVar.g();
            double d2 = c * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f2 = j2 * cos;
            float f3 = j2 * sin;
            double d3 = d * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d3);
            float cos2 = (float) Math.cos(d3);
            float f4 = i2 * cos2;
            float f5 = -i2;
            double d4 = e * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d4);
            float cos3 = (float) Math.cos(d4);
            float f6 = sin * sin2;
            float f7 = ((cos3 * cos2) + (sin3 * f6)) * f;
            float f8 = sin3 * cos * f;
            float f9 = sin * cos2;
            float f10 = -sin2;
            float f11 = ((cos3 * f10) + (sin3 * f9)) * f;
            float f12 = -sin3;
            float f13 = ((f12 * cos2) + (f6 * cos3)) * g;
            float f14 = cos * cos3 * g;
            float f15 = ((f12 * f10) + (cos3 * f9)) * g;
            fArr[0] = f7;
            fArr[1] = f8;
            fArr[2] = f11;
            fArr[3] = 0.0f;
            fArr[4] = f13;
            fArr[5] = f14;
            fArr[6] = f15;
            fArr[7] = 0.0f;
            fArr[8] = cos * sin2;
            fArr[9] = -sin;
            fArr[10] = cos * cos2;
            fArr[11] = 0.0f;
            float f16 = -intBitsToFloat;
            float f17 = f3 + cos;
            fArr[12] = ((f7 * f16) - (f13 * intBitsToFloat2)) + f4 + (f17 * sin2) + intBitsToFloat;
            fArr[13] = ((f8 * f16) - (intBitsToFloat2 * f14)) + (f2 - sin) + intBitsToFloat2;
            fArr[14] = ((f16 * f11) - (intBitsToFloat2 * f15)) + (f5 * sin2) + (f17 * cos2);
            fArr[15] = 1.0f;
            this.p = false;
            this.r = icn.a(this.g);
        }
        return this.g;
    }

    @Override // defpackage.iwu
    public final long a(long j, boolean z) {
        float[] q;
        if (z) {
            q = p();
            if (q == null) {
                return 9187343241974906880L;
            }
        } else {
            q = q();
        }
        return this.r ? j : icm.a(q, j);
    }

    @Override // defpackage.iwu
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        n(false);
        iaw iawVar = this.u;
        if (iawVar != null) {
            iawVar.b(this.b);
            this.c.R(this);
        }
    }

    @Override // defpackage.iwu
    public final void c(ibt ibtVar, iga igaVar) {
        j();
        this.s = this.b.b() > 0.0f;
        ifl iflVar = this.l.b;
        iflVar.e(ibtVar);
        iflVar.a = igaVar;
        ige.a(this.l, this.b);
    }

    @Override // defpackage.iwu
    public final void d(float[] fArr) {
        float[] p = p();
        if (p != null) {
            icm.d(fArr, p);
        }
    }

    @Override // defpackage.iwu
    public final void e(iah iahVar, boolean z) {
        float[] p = z ? p() : q();
        if (this.r) {
            return;
        }
        if (p == null) {
            iahVar.b(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            icm.b(p, iahVar);
        }
    }

    @Override // defpackage.iwu
    public final void f(long j) {
        iga igaVar = this.b;
        if (!kaa.f(igaVar.m, j)) {
            igaVar.m = j;
            igaVar.l(j, igaVar.n);
        }
        o();
    }

    @Override // defpackage.iwu
    public final void g(long j) {
        if (kaf.e(j, this.e)) {
            return;
        }
        this.e = j;
        invalidate();
    }

    @Override // defpackage.iwu
    public final void h(ffjm ffjmVar, ffix ffixVar) {
        iaw iawVar = this.u;
        if (iawVar == null) {
            imn.a("currently reuse is only supported when we manage the layer lifecycle");
            throw new ffbx();
        }
        if (!this.b.l) {
            imn.b("layer should have been released before reuse");
        }
        this.b = iawVar.a();
        this.f = false;
        this.a = ffjmVar;
        this.d = ffixVar;
        this.p = false;
        this.q = false;
        this.r = true;
        icm.c(this.g);
        float[] fArr = this.h;
        if (fArr != null) {
            icm.c(fArr);
        }
        this.n = idr.a;
        this.s = false;
        this.e = 9223372034707292159L;
        this.o = null;
        this.m = 0;
    }

    @Override // defpackage.iwu
    public final void i(float[] fArr) {
        icm.d(fArr, q());
    }

    @Override // defpackage.iwu
    public final void invalidate() {
        if (this.i || this.f) {
            return;
        }
        this.c.invalidate();
        n(true);
    }

    @Override // defpackage.iwu
    public final void j() {
        if (this.i) {
            if (!idr.d(this.n, idr.a)) {
                iga igaVar = this.b;
                if (!kaf.e(igaVar.n, this.e)) {
                    float a = idr.a(this.n) * ((int) (this.e >> 32));
                    float b = idr.b(this.n) * ((int) (this.e & 4294967295L));
                    igaVar.k((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(a) << 32));
                }
            }
            this.b.g(this.j, this.k, this.e, this.t);
            n(false);
        }
    }

    @Override // defpackage.iwu
    public final void k(idd iddVar) {
        ffix ffixVar;
        int i;
        ffix ffixVar2;
        int i2 = iddVar.a | this.m;
        this.k = iddVar.t;
        this.j = iddVar.s;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.n = iddVar.n;
        }
        if ((i2 & 1) != 0) {
            iga igaVar = this.b;
            float f = iddVar.b;
            igd igdVar = igaVar.a;
            if (igdVar.f() != f) {
                igdVar.G(f);
            }
        }
        if ((i2 & 2) != 0) {
            iga igaVar2 = this.b;
            float f2 = iddVar.c;
            igd igdVar2 = igaVar2.a;
            if (igdVar2.g() != f2) {
                igdVar2.H(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.b.i(iddVar.d);
        }
        if ((i2 & 8) != 0) {
            iga igaVar3 = this.b;
            float f3 = iddVar.e;
            igd igdVar3 = igaVar3.a;
            if (igdVar3.i() != f3) {
                igdVar3.K(f3);
            }
        }
        if ((i2 & 16) != 0) {
            iga igaVar4 = this.b;
            float f4 = iddVar.f;
            igd igdVar4 = igaVar4.a;
            if (igdVar4.j() != f4) {
                igdVar4.L(f4);
            }
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            iga igaVar5 = this.b;
            float f5 = iddVar.g;
            igd igdVar5 = igaVar5.a;
            if (igdVar5.h() != f5) {
                igdVar5.I(f5);
                igaVar5.d = true;
                igaVar5.d();
            }
            if (iddVar.g > 0.0f && !this.s && (ffixVar2 = this.d) != null) {
                ffixVar2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            iga igaVar6 = this.b;
            long j = iddVar.h;
            long m = igaVar6.a.m();
            long j2 = ibw.a;
            if (!ffcp.a(j, m)) {
                igaVar6.a.u(j);
            }
        }
        if ((i2 & 128) != 0) {
            iga igaVar7 = this.b;
            long j3 = iddVar.i;
            long n = igaVar7.a.n();
            long j4 = ibw.a;
            if (!ffcp.a(j3, n)) {
                igaVar7.a.J(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            iga igaVar8 = this.b;
            float f6 = iddVar.l;
            igd igdVar6 = igaVar8.a;
            if (igdVar6.e() != f6) {
                igdVar6.F(f6);
            }
        }
        if ((i2 & 256) != 0) {
            iga igaVar9 = this.b;
            float f7 = iddVar.j;
            igd igdVar7 = igaVar9.a;
            if (igdVar7.c() != f7) {
                igdVar7.D(f7);
            }
        }
        if ((i2 & 512) != 0) {
            iga igaVar10 = this.b;
            float f8 = iddVar.k;
            igd igdVar8 = igaVar10.a;
            if (igdVar8.d() != f8) {
                igdVar8.E(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            iga igaVar11 = this.b;
            float f9 = iddVar.m;
            if (igaVar11.a.b() != f9) {
                igaVar11.a.w(f9);
            }
        }
        if (i3 != 0) {
            if (idr.d(this.n, idr.a)) {
                this.b.k(9205357640488583168L);
            } else {
                iga igaVar12 = this.b;
                float a = idr.a(this.n) * ((int) (this.e >> 32));
                igaVar12.k((Float.floatToRawIntBits(idr.b(this.n) * ((int) (this.e & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(a) << 32));
            }
        }
        if ((i2 & 16384) != 0) {
            iga igaVar13 = this.b;
            boolean z2 = iddVar.p;
            if (igaVar13.p != z2) {
                igaVar13.p = z2;
                igaVar13.d = true;
                igaVar13.d();
            }
        }
        if ((131072 & i2) != 0) {
            iga igaVar14 = this.b;
            idc idcVar = iddVar.u;
            if (!ffkj.e(igaVar14.a.p(), idcVar)) {
                igaVar14.a.C(idcVar);
            }
        }
        if ((262144 & i2) != 0) {
            iga igaVar15 = this.b;
            ibx ibxVar = iddVar.v;
            igd igdVar9 = igaVar15.a;
            if (!ffkj.e(null, null)) {
                igaVar15.a.N();
            }
        }
        if ((524288 & i2) != 0) {
            iga igaVar16 = this.b;
            int i4 = iddVar.w;
            igd igdVar10 = igaVar16.a;
            if (!ibk.b(igdVar10.k(), i4)) {
                igdVar10.v(i4);
            }
        }
        if ((32768 & i2) != 0) {
            iga igaVar17 = this.b;
            int i5 = iddVar.q;
            if (icc.b(i5, 0)) {
                i = 0;
            } else if (icc.b(i5, 1)) {
                i = 1;
            } else {
                i = 2;
                if (!icc.b(i5, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            igd igdVar11 = igaVar17.a;
            if (!ifx.a(igdVar11.l(), i)) {
                igdVar11.y(i);
            }
        }
        if ((i2 & 7963) != 0) {
            this.p = true;
            this.q = true;
        }
        if (ffkj.e(this.o, iddVar.x)) {
            z = false;
        } else {
            icr icrVar = iddVar.x;
            this.o = icrVar;
            if (icrVar != null) {
                iga igaVar18 = this.b;
                if (icrVar instanceof icp) {
                    icp icpVar = (icp) icrVar;
                    iam iamVar = icpVar.a;
                    long floatToRawIntBits = Float.floatToRawIntBits(iamVar.b);
                    long floatToRawIntBits2 = Float.floatToRawIntBits(iamVar.c);
                    iam iamVar2 = icpVar.a;
                    igaVar18.m((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(iamVar2.d - iamVar2.b) << 32) | (Float.floatToRawIntBits(iamVar2.e - iamVar2.c) & 4294967295L), 0.0f);
                } else if (icrVar instanceof ico) {
                    igaVar18.j(((ico) icrVar).a);
                } else if (icrVar instanceof icq) {
                    icq icqVar = (icq) icrVar;
                    icv icvVar = icqVar.b;
                    if (icvVar != null) {
                        igaVar18.j(icvVar);
                    } else {
                        iao iaoVar = icqVar.a;
                        long floatToRawIntBits3 = Float.floatToRawIntBits(iaoVar.a);
                        float b = iaoVar.b();
                        float a2 = iaoVar.a();
                        igaVar18.m((Float.floatToRawIntBits(iaoVar.b) & 4294967295L) | (floatToRawIntBits3 << 32), (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(a2) & 4294967295L), Float.intBitsToFloat((int) (iaoVar.h >> 32)));
                    }
                }
                if ((icrVar instanceof ico) && Build.VERSION.SDK_INT < 33 && (ffixVar = this.d) != null) {
                    ffixVar.invoke();
                }
                z = true;
            }
        }
        this.m = iddVar.a;
        if (i2 != 0 || z) {
            o();
        }
    }

    @Override // defpackage.iwu
    public final boolean l(long j) {
        int i = (int) (4294967295L & j);
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i);
        iga igaVar = this.b;
        if (igaVar.p) {
            return jfv.a(igaVar.c(), intBitsToFloat, intBitsToFloat2);
        }
        return true;
    }

    @Override // defpackage.iwu
    public final float[] m() {
        return q();
    }
}
