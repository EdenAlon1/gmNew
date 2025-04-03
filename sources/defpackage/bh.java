package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bh {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    bh ab;
    bh ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final bg i;
    final bg j;
    final bg k;
    final bg l;
    final bg m;
    final bg n;
    final bg o;
    final bg p;
    protected final ArrayList q;
    public bh r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public bh() {
        bg bgVar = new bg(this, 2);
        this.i = bgVar;
        bg bgVar2 = new bg(this, 3);
        this.j = bgVar2;
        bg bgVar3 = new bg(this, 4);
        this.k = bgVar3;
        bg bgVar4 = new bg(this, 5);
        this.l = bgVar4;
        bg bgVar5 = new bg(this, 6);
        this.m = bgVar5;
        bg bgVar6 = new bg(this, 8);
        this.n = bgVar6;
        bg bgVar7 = new bg(this, 9);
        this.o = bgVar7;
        this.p = new bg(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(bgVar);
        arrayList.add(bgVar2);
        arrayList.add(bgVar3);
        arrayList.add(bgVar4);
        arrayList.add(bgVar6);
        arrayList.add(bgVar7);
        arrayList.add(bgVar5);
    }

    private final void A(bc bcVar, boolean z, boolean z2, bg bgVar, bg bgVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        be e = bcVar.e(bgVar);
        be e2 = bcVar.e(bgVar2);
        be e3 = bcVar.e(bgVar.b);
        be e4 = bcVar.e(bgVar2.b);
        int a = bgVar.a();
        int a2 = bgVar2.a();
        int i8 = this.K;
        boolean z5 = i8 != 8;
        int i9 = i8 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (e3 == null && e4 == null) {
            az a3 = bcVar.a();
            a3.g(e, i);
            bcVar.g(a3);
            if (z3) {
                return;
            }
            if (z) {
                bcVar.g(bc.c(bcVar, e2, e, i4, true));
                return;
            } else {
                if (z6) {
                    bcVar.g(bc.c(bcVar, e2, e, i9, false));
                    return;
                }
                az a4 = bcVar.a();
                a4.g(e2, i2);
                bcVar.g(a4);
                return;
            }
        }
        if (e3 != null && e4 == null) {
            az a5 = bcVar.a();
            a5.h(e, e3, a);
            bcVar.g(a5);
            if (z) {
                bcVar.g(bc.c(bcVar, e2, e, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                az a6 = bcVar.a();
                a6.h(e2, e, i9);
                bcVar.g(a6);
                return;
            } else {
                az a7 = bcVar.a();
                a7.g(e2, i2);
                bcVar.g(a7);
                return;
            }
        }
        if (e3 == null) {
            az a8 = bcVar.a();
            a8.h(e2, e4, -a2);
            bcVar.g(a8);
            if (z) {
                bcVar.g(bc.c(bcVar, e2, e, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                az a9 = bcVar.a();
                a9.h(e2, e, i9);
                bcVar.g(a9);
                return;
            } else {
                az a10 = bcVar.a();
                a10.g(e, i);
                bcVar.g(a10);
                return;
            }
        }
        if (!z6) {
            int i10 = i6;
            if (z3) {
                bcVar.i(e, e3, a, 3);
                bcVar.j(e2, e4, -a2, 3);
                bcVar.g(bc.b(bcVar, e, e3, a, f, e4, e2, a2, true));
                return;
            }
            if (z4) {
                return;
            }
            int i11 = -a2;
            if (i5 == 1) {
                if (i10 <= i9) {
                    i10 = i9;
                }
                if (i7 > 0) {
                    if (i7 < i10) {
                        i10 = i7;
                    } else {
                        bcVar.j(e2, e, i7, 3);
                    }
                }
                bcVar.n(e2, e, i10, 3);
                bcVar.i(e, e3, a, 2);
                bcVar.j(e2, e4, i11, 2);
                bcVar.m(e, e3, a, f, e4, e2, a2);
                return;
            }
            if (i10 != 0 || i7 != 0) {
                if (i7 > 0) {
                    bcVar.j(e2, e, i7, 3);
                }
                bcVar.i(e, e3, a, 2);
                bcVar.j(e2, e4, i11, 2);
                bcVar.m(e, e3, a, f, e4, e2, a2);
                return;
            }
            az a11 = bcVar.a();
            a11.h(e, e3, a);
            bcVar.g(a11);
            az a12 = bcVar.a();
            a12.h(e2, e4, i11);
            bcVar.g(a12);
            return;
        }
        if (z) {
            bcVar.g(bc.c(bcVar, e2, e, i4, true));
        } else {
            az a13 = bcVar.a();
            a13.h(e2, e, i9);
            bcVar.g(a13);
        }
        int i12 = bgVar.h;
        if (i12 != bgVar2.h) {
            int i13 = -a2;
            if (i12 == 2) {
                az a14 = bcVar.a();
                a14.h(e, e3, a);
                bcVar.g(a14);
                be f2 = bcVar.f();
                az a15 = bcVar.a();
                a15.j(e2, e4, f2, i13);
                bcVar.g(a15);
                return;
            }
            be f3 = bcVar.f();
            az a16 = bcVar.a();
            a16.i(e, e3, f3, a);
            bcVar.g(a16);
            az a17 = bcVar.a();
            a17.h(e2, e4, i13);
            bcVar.g(a17);
            return;
        }
        if (e3 == e4) {
            bcVar.g(bc.b(bcVar, e, e3, 0, 0.5f, e4, e2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -a2;
        int i15 = bgVar.i;
        be f4 = bcVar.f();
        az a18 = bcVar.a();
        a18.i(e, e3, f4, a);
        if (i15 != 2) {
            bcVar.k(a18, (int) (-a18.d.a(f4)));
        }
        bcVar.g(a18);
        int i16 = bgVar2.i;
        be f5 = bcVar.f();
        az a19 = bcVar.a();
        a19.j(e2, e4, f5, i14);
        if (i16 != 2) {
            bcVar.k(a19, (int) (-a19.d.a(f5)));
        }
        bcVar.g(a19);
        bcVar.g(bc.b(bcVar, e, e3, a, f, e4, e2, a2, false));
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int i = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                i = Math.max(this.g, i);
            } else {
                i = this.g;
                if (i > 0) {
                    this.t = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.h;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int f() {
        int i = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                i = Math.max(this.e, i);
            } else {
                i = this.e;
                if (i > 0) {
                    this.s = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.f;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public void j(ba baVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }

    public final void k(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void l(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void n(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void o(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void p(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void q(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void r() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.af = i;
        this.ag = i2;
        this.y = i3 - i;
        this.z = i4 - i2;
    }

    public final boolean s() {
        return this.C > 0;
    }

    public final boolean t() {
        return this.r == null;
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public bg u(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final void v(int i, bh bhVar, int i2, int i3, int i4) {
        u(i).d(bhVar.u(i2), i3, i4, 2, 0, true);
    }

    public final void w(int i) {
        this.ad = i;
        if (i == 2) {
            q(this.F);
        }
    }

    public final void x(int i) {
        this.ae = i;
        if (i == 2) {
            k(this.G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01db, code lost:
    
        if (r14 == (-1)) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(defpackage.bc r40) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh.y(bc):void");
    }

    public void z() {
        int i;
        int i2;
        int p = bc.p(this.i);
        int p2 = bc.p(this.j);
        int p3 = bc.p(this.k) - p;
        int p4 = bc.p(this.l) - p2;
        this.w = p;
        this.x = p2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && p3 < (i2 = this.s)) {
            p3 = i2;
        }
        if (this.ae == 1 && p4 < (i = this.t)) {
            p4 = i;
        }
        this.s = p3;
        this.t = p4;
        int i3 = this.E;
        if (p4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (p3 < i4) {
            this.s = i4;
        }
    }
}
