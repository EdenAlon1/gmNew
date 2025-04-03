package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivd extends iqk implements ipl, isb, ivq {
    public final iun f;
    public boolean g;
    public boolean j;
    public boolean k;
    public jzk l;
    public ffji n;
    public iga o;
    public boolean s;
    public boolean v;
    private boolean y;
    public int h = Alert.DURATION_SHOW_INDEFINITELY;
    public int i = Alert.DURATION_SHOW_INDEFINITELY;
    public int w = 3;
    public long m = 0;
    public int x = 3;
    public final isa p = new iuq(this);
    public final hne q = new hne(new ivd[16]);
    public boolean r = true;
    public boolean t = true;
    public Object u = p().r;

    public ivd(iun iunVar) {
        this.f = iunVar;
    }

    private final void G() {
        int i = this.x;
        if (B()) {
            this.x = 2;
        } else {
            this.x = 1;
        }
        if (i != 1 && this.f.d) {
            iui.ax(o(), true, 6);
        }
        hne s = o().s();
        Object[] objArr = s.a;
        int i2 = s.b;
        for (int i3 = 0; i3 < i2; i3++) {
            iui iuiVar = (iui) objArr[i3];
            ivd w = iuiVar.w();
            if (w == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (w.i != Integer.MAX_VALUE) {
                w.G();
                iuiVar.af(iuiVar);
            }
        }
    }

    private final void H() {
        int i;
        iui.ax(o(), false, 7);
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

    private final boolean I() {
        return this.f.e;
    }

    public final void A(boolean z) {
        this.f.f = z;
    }

    public final boolean B() {
        return this.f.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: all -> 0x00fe, TryCatch #0 {all -> 0x00fe, blocks: (B:3:0x0004, B:5:0x000c, B:6:0x0011, B:9:0x0029, B:13:0x0031, B:15:0x003d, B:18:0x0042, B:20:0x004a, B:22:0x0052, B:23:0x0059, B:26:0x0061, B:28:0x0078, B:29:0x0080, B:31:0x008c, B:32:0x0091, B:34:0x0097, B:36:0x00c7, B:37:0x00d6, B:38:0x00cf, B:39:0x00da, B:41:0x00f4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x00fe, TryCatch #0 {all -> 0x00fe, blocks: (B:3:0x0004, B:5:0x000c, B:6:0x0011, B:9:0x0029, B:13:0x0031, B:15:0x003d, B:18:0x0042, B:20:0x004a, B:22:0x0052, B:23:0x0059, B:26:0x0061, B:28:0x0078, B:29:0x0080, B:31:0x008c, B:32:0x0091, B:34:0x0097, B:36:0x00c7, B:37:0x00d6, B:38:0x00cf, B:39:0x00da, B:41:0x00f4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: all -> 0x00fe, TryCatch #0 {all -> 0x00fe, blocks: (B:3:0x0004, B:5:0x000c, B:6:0x0011, B:9:0x0029, B:13:0x0031, B:15:0x003d, B:18:0x0042, B:20:0x004a, B:22:0x0052, B:23:0x0059, B:26:0x0061, B:28:0x0078, B:29:0x0080, B:31:0x008c, B:32:0x0091, B:34:0x0097, B:36:0x00c7, B:37:0x00d6, B:38:0x00cf, B:39:0x00da, B:41:0x00f4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[Catch: all -> 0x00fe, TryCatch #0 {all -> 0x00fe, blocks: (B:3:0x0004, B:5:0x000c, B:6:0x0011, B:9:0x0029, B:13:0x0031, B:15:0x003d, B:18:0x0042, B:20:0x004a, B:22:0x0052, B:23:0x0059, B:26:0x0061, B:28:0x0078, B:29:0x0080, B:31:0x008c, B:32:0x0091, B:34:0x0097, B:36:0x00c7, B:37:0x00d6, B:38:0x00cf, B:39:0x00da, B:41:0x00f4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #0 {all -> 0x00fe, blocks: (B:3:0x0004, B:5:0x000c, B:6:0x0011, B:9:0x0029, B:13:0x0031, B:15:0x003d, B:18:0x0042, B:20:0x004a, B:22:0x0052, B:23:0x0059, B:26:0x0061, B:28:0x0078, B:29:0x0080, B:31:0x008c, B:32:0x0091, B:34:0x0097, B:36:0x00c7, B:37:0x00d6, B:38:0x00cf, B:39:0x00da, B:41:0x00f4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivd.C(long):boolean");
    }

    public final void D(long j, ffji ffjiVar, iga igaVar) {
        iui o = o();
        try {
            iui u = o().u();
            if (u != null && u.aD() == 4) {
                this.f.c = false;
            }
            if (o().D) {
                imn.b("place is called on a deactivated node");
            }
            F(4);
            this.k = true;
            this.v = false;
            if (!kaa.f(j, this.m)) {
                iun iunVar = this.f;
                if (iunVar.m || iunVar.l) {
                    u(true);
                }
                s();
            }
            iwx a = ium.a(o());
            if (I() || !n()) {
                this.f.k(false);
                this.p.g = false;
                ((AndroidComposeView) a).v.a(o(), true, new ivb(this, a, j));
            } else {
                iuw C = q().C();
                C.getClass();
                C.B(kaa.d(j, C.e));
                t();
            }
            this.m = j;
            this.n = ffjiVar;
            this.o = igaVar;
            F(5);
        } catch (Throwable th) {
            o.aA(th);
            throw new ffbx();
        }
    }

    public final int E() {
        return this.f.q;
    }

    public final void F(int i) {
        this.f.q = i;
    }

    @Override // defpackage.ivq
    public final void R(boolean z) {
        iuw C;
        iuw C2 = q().C();
        if (ffkj.e(Boolean.valueOf(z), C2 != null ? Boolean.valueOf(C2.i) : null) || (C = q().C()) == null) {
            return;
        }
        C.i = z;
    }

    @Override // defpackage.inx
    public final int a(int i) {
        H();
        iuw C = q().C();
        C.getClass();
        return C.a(i);
    }

    @Override // defpackage.inx
    public final int b(int i) {
        H();
        iuw C = q().C();
        C.getClass();
        return C.b(i);
    }

    @Override // defpackage.inx
    public final int c(int i) {
        H();
        iuw C = q().C();
        C.getClass();
        return C.c(i);
    }

    @Override // defpackage.inx
    public final int d(int i) {
        H();
        iuw C = q().C();
        C.getClass();
        return C.d(i);
    }

    @Override // defpackage.ipl
    public final iqk e(long j) {
        iui u;
        iui u2 = o().u();
        int i = 2;
        if ((u2 != null && u2.aD() == 2) || ((u = o().u()) != null && u.aD() == 4)) {
            this.f.b = false;
        }
        iui o = o();
        iui u3 = o.u();
        if (u3 != null) {
            if (this.w != 3 && !o.w) {
                imn.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int aD = u3.aD();
            int i2 = aD - 1;
            if (aD == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 1) {
                i = 1;
            } else if (i2 != 2 && i2 != 3) {
                int aD2 = u3.aD();
                Objects.toString(iue.a(aD2));
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(iue.a(aD2)));
            }
            this.w = i;
        } else {
            this.w = 3;
        }
        if (o().E == 3) {
            o().K();
        }
        C(j);
        return this;
    }

    @Override // defpackage.iqk
    protected final void ee(long j, float f, ffji ffjiVar) {
        D(j, ffjiVar, null);
    }

    @Override // defpackage.ipr
    public final int eh(imq imqVar) {
        iui u = o().u();
        if (u == null || u.aD() != 2) {
            iui u2 = o().u();
            if (u2 != null && u2.aD() == 4) {
                this.p.d = true;
            }
        } else {
            this.p.c = true;
        }
        this.j = true;
        iuw C = q().C();
        C.getClass();
        int eh = C.eh(imqVar);
        this.j = false;
        return eh;
    }

    @Override // defpackage.iqk, defpackage.inx
    public final Object f() {
        return this.u;
    }

    @Override // defpackage.isb
    public final isa g() {
        return this.p;
    }

    @Override // defpackage.isb
    public final isb h() {
        iun iunVar;
        iui u = o().u();
        if (u == null || (iunVar = u.y) == null) {
            return null;
        }
        return iunVar.p;
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
            ivd ivdVar = ((iui) objArr[i2]).y.p;
            ivdVar.getClass();
            ffjiVar.invoke(ivdVar);
        }
    }

    @Override // defpackage.isb
    public final void k() {
        this.s = true;
        this.p.g();
        if (I()) {
            hne s = o().s();
            Object[] objArr = s.a;
            int i = s.b;
            for (int i2 = 0; i2 < i; i2++) {
                iui iuiVar = (iui) objArr[i2];
                if (iuiVar.an() && iuiVar.aF() == 1) {
                    iun iunVar = iuiVar.y;
                    ivd ivdVar = iunVar.p;
                    ivdVar.getClass();
                    jzk c = iunVar.c();
                    c.getClass();
                    if (ivdVar.C(c.a)) {
                        iui.ax(o(), false, 7);
                    }
                }
            }
        }
        iuw iuwVar = ((ito) i()).g;
        iuwVar.getClass();
        if (this.f.f || (!this.j && !iuwVar.k && I())) {
            u(false);
            int E = E();
            F(4);
            iwx a = ium.a(o());
            this.f.l(false);
            ((AndroidComposeView) a).v.b(o(), true, new iuz(this, iuwVar));
            F(E);
            if (this.f.l && iuwVar.k) {
                l();
            }
            A(false);
        }
        isa isaVar = this.p;
        if (isaVar.d) {
            isaVar.e = true;
        }
        if (isaVar.b && isaVar.j()) {
            this.p.f();
        }
        this.s = false;
    }

    @Override // defpackage.isb
    public final void l() {
        o().ad(false);
    }

    @Override // defpackage.isb
    public final void m() {
        iui.ax(o(), false, 7);
    }

    @Override // defpackage.isb
    public final boolean n() {
        return this.x != 3;
    }

    public final iui o() {
        return this.f.a;
    }

    public final ivm p() {
        return this.f.o;
    }

    public final iwi q() {
        return this.f.a();
    }

    public final void r(boolean z) {
        if (z) {
            if (B()) {
                return;
            }
        } else if (!B()) {
            return;
        }
        this.x = 3;
        hne s = o().s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            ivd ivdVar = ((iui) objArr[i2]).y.p;
            ivdVar.getClass();
            ivdVar.r(true);
        }
    }

    public final void s() {
        if (this.f.n > 0) {
            hne s = o().s();
            Object[] objArr = s.a;
            int i = s.b;
            for (int i2 = 0; i2 < i; i2++) {
                iui iuiVar = (iui) objArr[i2];
                iun iunVar = iuiVar.y;
                if ((iunVar.l || iunVar.m) && !iunVar.e) {
                    iuiVar.ad(false);
                }
                ivd ivdVar = iunVar.p;
                if (ivdVar != null) {
                    ivdVar.s();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x001c, code lost:
    
        if (B() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r2 != 2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r4 = this;
            r0 = 1
            r4.v = r0
            iui r1 = r4.o()
            iui r1 = r1.u()
            int r2 = r4.x
            if (r2 == r0) goto L18
            boolean r3 = r4.B()
            if (r3 == 0) goto L1e
            r3 = 2
            if (r2 == r3) goto L2a
        L18:
            boolean r2 = r4.B()
            if (r2 == 0) goto L2a
        L1e:
            r4.G()
            boolean r2 = r4.g
            if (r2 == 0) goto L2a
            if (r1 == 0) goto L2a
            defpackage.iui.aw(r1)
        L2a:
            if (r1 == 0) goto L54
            boolean r2 = r4.g
            if (r2 != 0) goto L57
            int r2 = r1.aD()
            r3 = 3
            if (r2 == r3) goto L3e
            int r2 = r1.aD()
            r3 = 4
            if (r2 != r3) goto L57
        L3e:
            int r2 = r4.i
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L4a
            java.lang.String r2 = "Place was called on a node which was placed already"
            defpackage.imn.c(r2)
        L4a:
            iun r1 = r1.y
            int r2 = r1.g
            r4.i = r2
            int r2 = r2 + r0
            r1.g = r2
            goto L57
        L54:
            r0 = 0
            r4.i = r0
        L57:
            r4.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivd.t():void");
    }

    public final void u(boolean z) {
        this.f.e = z;
    }

    @Override // defpackage.iqk
    public final int v() {
        iuw C = q().C();
        C.getClass();
        return C.v();
    }

    @Override // defpackage.iqk
    public final int w() {
        iuw C = q().C();
        C.getClass();
        return C.w();
    }

    @Override // defpackage.iqk
    public final void x(long j, float f, iga igaVar) {
        D(j, null, igaVar);
    }
}
