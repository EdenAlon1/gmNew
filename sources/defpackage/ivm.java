package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivm extends iqk implements ipl, isb, ivq {
    public float A;
    public boolean B;
    public ffji C;
    public iga D;
    public float F;
    private boolean H;
    private boolean M;
    public final iun f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public ffji n;
    public iga o;
    public float p;
    public Object r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean y;
    public int h = Alert.DURATION_SHOW_INDEFINITELY;
    public int i = Alert.DURATION_SHOW_INDEFINITELY;
    public int G = 3;
    public long m = 0;
    public boolean q = true;
    public final isa w = new iuj(this);
    private final hne I = new hne(new ivm[16]);
    public boolean x = true;
    public long z = jzl.k(0, 0, 0, 15);
    private final ffix J = new ivj(this);
    private final ffix K = new ivi(this);
    public long E = 0;
    private final ffix L = new ivk(this);

    public ivm(iun iunVar) {
        this.f = iunVar;
    }

    private final ivd F() {
        return this.f.p;
    }

    private final void G() {
        boolean z = this.s;
        this.s = true;
        iui o = o();
        if (!z) {
            o.y().an();
            if (o.ao()) {
                iui.az(o, true, 6);
            } else if (o.an()) {
                iui.ax(o, true, 6);
            }
        }
        iwi iwiVar = o.y().u;
        for (iwi z2 = o.z(); !ffkj.e(z2, iwiVar) && z2 != null; z2 = z2.u) {
            if (z2.B) {
                z2.ah();
            }
        }
        hne s = o.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar = (iui) objArr[i2];
            if (iuiVar.o() != Integer.MAX_VALUE) {
                iuiVar.x().G();
                o.af(iuiVar);
            }
        }
    }

    private final void H() {
        int i;
        iui.az(o(), false, 7);
        iui u = o().u();
        if (u == null || o().E != 3) {
            return;
        }
        iui o = o();
        int aD = u.aD();
        int i2 = aD - 1;
        if (aD == 0) {
            throw null;
        }
        if (i2 != 0) {
            i = 2;
            if (i2 != 2) {
                i = u.E;
            }
        } else {
            i = 1;
        }
        o.E = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r2.B() == true) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I(long r9, float r11, defpackage.ffji r12, defpackage.iga r13) {
        /*
            r8 = this;
            iui r1 = r8.o()
            r0 = 1
            r8.t = r0     // Catch: java.lang.Throwable -> La6
            long r2 = r8.m     // Catch: java.lang.Throwable -> La6
            boolean r2 = defpackage.kaa.f(r9, r2)     // Catch: java.lang.Throwable -> La6
            r3 = 0
            if (r2 == 0) goto L14
            boolean r2 = r8.M     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L29
        L14:
            iun r2 = r8.f     // Catch: java.lang.Throwable -> La6
            boolean r4 = r2.j     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L22
            boolean r2 = r2.i     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto L22
            boolean r2 = r8.M     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L26
        L22:
            r8.v = r0     // Catch: java.lang.Throwable -> La6
            r8.M = r3     // Catch: java.lang.Throwable -> La6
        L26:
            r8.u()     // Catch: java.lang.Throwable -> La6
        L29:
            ivd r2 = r8.F()     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L8e
            iui r4 = r2.o()     // Catch: java.lang.Throwable -> La6
            boolean r4 = defpackage.iuo.a(r4)     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto L3a
            goto L4d
        L3a:
            int r4 = r2.x     // Catch: java.lang.Throwable -> La6
            r5 = 3
            if (r4 != r5) goto L47
            iun r4 = r2.f     // Catch: java.lang.Throwable -> La6
            boolean r5 = r4.b     // Catch: java.lang.Throwable -> La6
            if (r5 != 0) goto L47
            r4.c = r0     // Catch: java.lang.Throwable -> La6
        L47:
            boolean r2 = r2.B()     // Catch: java.lang.Throwable -> La6
            if (r2 != r0) goto L8e
        L4d:
            iwi r0 = r8.p()     // Catch: java.lang.Throwable -> La6
            iwi r0 = r0.v     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L59
            iqj r0 = r0.l     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L69
        L59:
            iui r0 = r8.o()     // Catch: java.lang.Throwable -> La6
            iwx r0 = defpackage.ium.a(r0)     // Catch: java.lang.Throwable -> La6
            ffji r2 = defpackage.iqm.a     // Catch: java.lang.Throwable -> La6
            iqf r2 = new iqf     // Catch: java.lang.Throwable -> La6
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La6
            r0 = r2
        L69:
            ivd r2 = r8.F()     // Catch: java.lang.Throwable -> La6
            r2.getClass()     // Catch: java.lang.Throwable -> La6
            iui r4 = r8.o()     // Catch: java.lang.Throwable -> La6
            iui r4 = r4.u()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto L7e
            iun r4 = r4.y     // Catch: java.lang.Throwable -> La6
            r4.g = r3     // Catch: java.lang.Throwable -> La6
        L7e:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.i = r3     // Catch: java.lang.Throwable -> La6
            int r3 = defpackage.kaa.a(r9)     // Catch: java.lang.Throwable -> La6
            int r4 = defpackage.kaa.b(r9)     // Catch: java.lang.Throwable -> La6
            defpackage.iqj.k(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> La6
        L8e:
            ivd r0 = r8.F()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L9d
            boolean r0 = r0.k     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L9d
            java.lang.String r0 = "Error: Placement happened before lookahead."
            defpackage.imn.c(r0)     // Catch: java.lang.Throwable -> La6
        L9d:
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.B(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> La6
            return
        La6:
            r0 = move-exception
            r9 = r0
            r1.aA(r9)
            ffbx r9 = new ffbx
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivm.I(long, float, ffji, iga):void");
    }

    public final void A() {
        this.B = true;
        iui u = o().u();
        float f = i().y;
        iui o = o();
        iwi y = o.y();
        for (iwi z = o.z(); z != y; z = z.u) {
            z.getClass();
            f += ((itx) z).y;
        }
        if (f != this.A) {
            this.A = f;
            if (u != null) {
                u.Z();
            }
            if (u != null) {
                u.Q();
            }
        }
        if (this.s) {
            o().y().an();
        } else {
            if (u != null) {
                u.Q();
            }
            G();
            if (this.g && u != null) {
                u.ae(false);
            }
        }
        if (u == null) {
            this.i = 0;
        } else if (!this.g && u.aD() == 3) {
            if (this.i != Integer.MAX_VALUE) {
                imn.c("Place was called on a node which was placed already");
            }
            iun iunVar = u.y;
            int i = iunVar.h;
            this.i = i;
            iunVar.h = i + 1;
        }
        k();
    }

    public final void B(long j, float f, ffji ffjiVar, iga igaVar) {
        if (o().D) {
            imn.b("place is called on a deactivated node");
        }
        E(3);
        boolean z = !this.k;
        this.m = j;
        this.p = f;
        this.n = ffjiVar;
        this.o = igaVar;
        this.k = true;
        this.B = false;
        AndroidComposeView androidComposeView = (AndroidComposeView) ium.a(o());
        androidComposeView.k.e(o(), j, z);
        if (this.v || !this.s) {
            this.w.g = false;
            this.f.i(false);
            this.C = ffjiVar;
            this.E = j;
            this.F = f;
            this.D = igaVar;
            androidComposeView.v.a(o(), false, this.L);
        } else {
            iwi p = p();
            p.aq(kaa.d(j, p.e), f, ffjiVar, igaVar);
            A();
        }
        E(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:3:0x0004, B:5:0x000c, B:6:0x0011, B:9:0x0031, B:13:0x0039, B:15:0x0045, B:18:0x004e, B:21:0x005d, B:23:0x0078, B:24:0x007d, B:26:0x009f, B:27:0x00a5, B:29:0x00b1, B:31:0x00bb, B:33:0x00c6), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:3:0x0004, B:5:0x000c, B:6:0x0011, B:9:0x0031, B:13:0x0039, B:15:0x0045, B:18:0x004e, B:21:0x005d, B:23:0x0078, B:24:0x007d, B:26:0x009f, B:27:0x00a5, B:29:0x00b1, B:31:0x00bb, B:33:0x00c6), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r8) {
        /*
            r7 = this;
            iui r0 = r7.o()
            iui r1 = r7.o()     // Catch: java.lang.Throwable -> Le2
            boolean r1 = r1.D     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L11
            java.lang.String r1 = "measure is called on a deactivated node"
            defpackage.imn.b(r1)     // Catch: java.lang.Throwable -> Le2
        L11:
            iui r1 = r7.o()     // Catch: java.lang.Throwable -> Le2
            iwx r1 = defpackage.ium.a(r1)     // Catch: java.lang.Throwable -> Le2
            iui r2 = r7.o()     // Catch: java.lang.Throwable -> Le2
            iui r2 = r2.u()     // Catch: java.lang.Throwable -> Le2
            iui r3 = r7.o()     // Catch: java.lang.Throwable -> Le2
            iui r4 = r7.o()     // Catch: java.lang.Throwable -> Le2
            boolean r4 = r4.w     // Catch: java.lang.Throwable -> Le2
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L38
            if (r2 == 0) goto L36
            boolean r2 = r2.w     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto L36
            goto L38
        L36:
            r2 = r5
            goto L39
        L38:
            r2 = r6
        L39:
            r3.w = r2     // Catch: java.lang.Throwable -> Le2
            iui r2 = r7.o()     // Catch: java.lang.Throwable -> Le2
            boolean r2 = r2.ao()     // Catch: java.lang.Throwable -> Le2
            if (r2 != 0) goto L5d
            long r2 = r7.d     // Catch: java.lang.Throwable -> Le2
            boolean r2 = defpackage.jzk.g(r2, r8)     // Catch: java.lang.Throwable -> Le2
            if (r2 != 0) goto L4e
            goto L5d
        L4e:
            iui r8 = r7.o()     // Catch: java.lang.Throwable -> Le2
            r1.p(r8, r5)     // Catch: java.lang.Throwable -> Le2
            iui r8 = r7.o()     // Catch: java.lang.Throwable -> Le2
            r8.ag()     // Catch: java.lang.Throwable -> Le2
            return r5
        L5d:
            isa r1 = r7.w     // Catch: java.lang.Throwable -> Le2
            r1.f = r5     // Catch: java.lang.Throwable -> Le2
            ivl r1 = defpackage.ivl.a     // Catch: java.lang.Throwable -> Le2
            r7.j(r1)     // Catch: java.lang.Throwable -> Le2
            r7.j = r6     // Catch: java.lang.Throwable -> Le2
            iwi r1 = r7.p()     // Catch: java.lang.Throwable -> Le2
            long r1 = r1.c     // Catch: java.lang.Throwable -> Le2
            r7.z(r8)     // Catch: java.lang.Throwable -> Le2
            int r3 = r7.D()     // Catch: java.lang.Throwable -> Le2
            r4 = 5
            if (r3 == r4) goto L7d
            java.lang.String r3 = "layout state is not idle before measure starts"
            defpackage.imn.c(r3)     // Catch: java.lang.Throwable -> Le2
        L7d:
            r7.z = r8     // Catch: java.lang.Throwable -> Le2
            r7.E(r6)     // Catch: java.lang.Throwable -> Le2
            r7.u = r5     // Catch: java.lang.Throwable -> Le2
            iui r8 = r7.o()     // Catch: java.lang.Throwable -> Le2
            iwx r8 = defpackage.ium.a(r8)     // Catch: java.lang.Throwable -> Le2
            androidx.compose.ui.platform.AndroidComposeView r8 = (androidx.compose.ui.platform.AndroidComposeView) r8     // Catch: java.lang.Throwable -> Le2
            ixh r8 = r8.v     // Catch: java.lang.Throwable -> Le2
            iui r9 = r7.o()     // Catch: java.lang.Throwable -> Le2
            ffix r3 = r7.J     // Catch: java.lang.Throwable -> Le2
            r8.c(r9, r5, r3)     // Catch: java.lang.Throwable -> Le2
            int r8 = r7.D()     // Catch: java.lang.Throwable -> Le2
            if (r8 != r6) goto La5
            r7.r()     // Catch: java.lang.Throwable -> Le2
            r7.E(r4)     // Catch: java.lang.Throwable -> Le2
        La5:
            iwi r8 = r7.p()     // Catch: java.lang.Throwable -> Le2
            long r8 = r8.c     // Catch: java.lang.Throwable -> Le2
            boolean r8 = defpackage.kaf.e(r8, r1)     // Catch: java.lang.Throwable -> Le2
            if (r8 == 0) goto Lc5
            iwi r8 = r7.p()     // Catch: java.lang.Throwable -> Le2
            int r8 = r8.a     // Catch: java.lang.Throwable -> Le2
            int r9 = r7.a     // Catch: java.lang.Throwable -> Le2
            if (r8 != r9) goto Lc5
            iwi r8 = r7.p()     // Catch: java.lang.Throwable -> Le2
            int r8 = r8.b     // Catch: java.lang.Throwable -> Le2
            int r9 = r7.b     // Catch: java.lang.Throwable -> Le2
            if (r8 == r9) goto Lc6
        Lc5:
            r5 = r6
        Lc6:
            iwi r8 = r7.p()     // Catch: java.lang.Throwable -> Le2
            int r8 = r8.a     // Catch: java.lang.Throwable -> Le2
            iwi r9 = r7.p()     // Catch: java.lang.Throwable -> Le2
            int r9 = r9.b     // Catch: java.lang.Throwable -> Le2
            long r1 = (long) r8     // Catch: java.lang.Throwable -> Le2
            long r8 = (long) r9     // Catch: java.lang.Throwable -> Le2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            r3 = 32
            long r1 = r1 << r3
            long r8 = r8 | r1
            r7.y(r8)     // Catch: java.lang.Throwable -> Le2
            return r5
        Le2:
            r8 = move-exception
            r0.aA(r8)
            ffbx r8 = new ffbx
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivm.C(long):boolean");
    }

    public final int D() {
        return this.f.q;
    }

    public final void E(int i) {
        this.f.q = i;
    }

    @Override // defpackage.ivq
    public final void R(boolean z) {
        if (z != p().i) {
            p().i = z;
            this.M = true;
        }
    }

    @Override // defpackage.inx
    public final int a(int i) {
        if (!iuo.a(o())) {
            H();
            return p().a(i);
        }
        ivd F = F();
        F.getClass();
        return F.a(i);
    }

    @Override // defpackage.inx
    public final int b(int i) {
        if (!iuo.a(o())) {
            H();
            return p().b(i);
        }
        ivd F = F();
        F.getClass();
        return F.b(i);
    }

    @Override // defpackage.inx
    public final int c(int i) {
        if (!iuo.a(o())) {
            H();
            return p().c(i);
        }
        ivd F = F();
        F.getClass();
        return F.c(i);
    }

    @Override // defpackage.inx
    public final int d(int i) {
        if (!iuo.a(o())) {
            H();
            return p().d(i);
        }
        ivd F = F();
        F.getClass();
        return F.d(i);
    }

    @Override // defpackage.ipl
    public final iqk e(long j) {
        int i = 3;
        if (o().E == 3) {
            o().K();
        }
        if (iuo.a(o())) {
            ivd F = F();
            F.getClass();
            F.w = 3;
            F.e(j);
        }
        iui o = o();
        iui u = o.u();
        if (u != null) {
            if (this.G != 3 && !o.w) {
                imn.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int aD = u.aD();
            int i2 = aD - 1;
            if (aD == 0) {
                throw null;
            }
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 != 2) {
                    int aD2 = u.aD();
                    Objects.toString(iue.a(aD2));
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(iue.a(aD2)));
                }
                i = 2;
            }
        }
        this.G = i;
        C(j);
        return this;
    }

    @Override // defpackage.iqk
    protected final void ee(long j, float f, ffji ffjiVar) {
        I(j, f, ffjiVar, null);
    }

    @Override // defpackage.ipr
    public final int eh(imq imqVar) {
        iui u = o().u();
        if (u == null || u.aD() != 1) {
            iui u2 = o().u();
            if (u2 != null && u2.aD() == 3) {
                this.w.d = true;
            }
        } else {
            this.w.c = true;
        }
        this.l = true;
        int eh = p().eh(imqVar);
        this.l = false;
        return eh;
    }

    @Override // defpackage.iqk, defpackage.inx
    public final Object f() {
        return this.r;
    }

    @Override // defpackage.isb
    public final isa g() {
        return this.w;
    }

    @Override // defpackage.isb
    public final isb h() {
        iun iunVar;
        iui u = o().u();
        if (u == null || (iunVar = u.y) == null) {
            return null;
        }
        return iunVar.o;
    }

    @Override // defpackage.isb
    public final iwi i() {
        return o().y();
    }

    @Override // defpackage.isb
    public final void j(ffji ffjiVar) {
        hne s = o().s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            ffjiVar.invoke(((iui) objArr[i2]).y.o);
        }
    }

    @Override // defpackage.isb
    public final void k() {
        boolean as;
        this.y = true;
        this.w.g();
        if (this.v) {
            hne s = o().s();
            Object[] objArr = s.a;
            int i = s.b;
            for (int i2 = 0; i2 < i; i2++) {
                iui iuiVar = (iui) objArr[i2];
                if (iuiVar.ao() && iuiVar.aE() == 1) {
                    as = iuiVar.as(iuiVar.y.b());
                    if (as) {
                        iui.az(o(), false, 7);
                    }
                }
            }
        }
        if (this.H || (!this.l && !i().k && this.v)) {
            this.v = false;
            int D = D();
            E(3);
            this.f.j(false);
            iui o = o();
            ((AndroidComposeView) ium.a(o)).v.b(o, false, this.K);
            E(D);
            if (i().k && this.f.i) {
                l();
            }
            this.H = false;
        }
        isa isaVar = this.w;
        if (isaVar.d) {
            isaVar.e = true;
        }
        if (isaVar.b && isaVar.j()) {
            this.w.f();
        }
        this.y = false;
    }

    @Override // defpackage.isb
    public final void l() {
        o().ae(false);
    }

    @Override // defpackage.isb
    public final void m() {
        iui.az(o(), false, 7);
    }

    @Override // defpackage.isb
    public final boolean n() {
        return this.s;
    }

    public final iui o() {
        return this.f.a;
    }

    public final iwi p() {
        return this.f.a();
    }

    public final List q() {
        o().aj();
        if (!this.x) {
            return this.I.e();
        }
        iui o = o();
        hne hneVar = this.I;
        hne s = o.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar = (iui) objArr[i2];
            if (hneVar.b <= i2) {
                hneVar.n(iuiVar.y.o);
            } else {
                hneVar.d(i2, iuiVar.y.o);
            }
        }
        hneVar.h(o.G().size(), hneVar.b);
        this.x = false;
        return this.I.e();
    }

    public final void r() {
        this.v = true;
        this.H = true;
    }

    public final void s() {
        this.u = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [hvh] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    public final void t() {
        hvh hvhVar;
        if (this.s) {
            this.s = false;
            iui o = o();
            iwi iwiVar = o.y().u;
            for (iwi z = o.z(); !ffkj.e(z, iwiVar) && z != null; z = z.u) {
                if (z.av(1048576)) {
                    boolean h = iwk.h(1048576);
                    if (h) {
                        hvhVar = z.B();
                    } else {
                        hvhVar = z.B().s;
                        if (hvhVar == null) {
                        }
                    }
                    for (hvh Y = z.Y(h); Y != null && (Y.r & 1048576) != 0; Y = Y.t) {
                        if ((Y.q & 1048576) != 0) {
                            isz iszVar = Y;
                            ?? r8 = 0;
                            while (iszVar != 0) {
                                if (iszVar instanceof iwt) {
                                    ((iwt) iszVar).a();
                                } else if ((iszVar.q & 1048576) != 0 && (iszVar instanceof isz)) {
                                    hvh hvhVar2 = iszVar.n;
                                    int i = 0;
                                    iszVar = iszVar;
                                    r8 = r8;
                                    while (hvhVar2 != null) {
                                        if ((hvhVar2.q & 1048576) != 0) {
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
                        if (Y != hvhVar) {
                        }
                    }
                }
                z.as();
            }
            hne s = o().s();
            Object[] objArr = s.a;
            int i2 = s.b;
            for (int i3 = 0; i3 < i2; i3++) {
                ((iui) objArr[i3]).x().t();
            }
        }
    }

    public final void u() {
        if (this.f.k > 0) {
            hne s = o().s();
            Object[] objArr = s.a;
            int i = s.b;
            for (int i2 = 0; i2 < i; i2++) {
                iui iuiVar = (iui) objArr[i2];
                iun iunVar = iuiVar.y;
                if ((iunVar.i || iunVar.j) && !iunVar.n()) {
                    iuiVar.ae(false);
                }
                iunVar.o.u();
            }
        }
    }

    @Override // defpackage.iqk
    public final int v() {
        return p().v();
    }

    @Override // defpackage.iqk
    public final int w() {
        return p().w();
    }

    @Override // defpackage.iqk
    public final void x(long j, float f, iga igaVar) {
        I(j, f, null, igaVar);
    }
}
