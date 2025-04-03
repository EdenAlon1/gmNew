package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import defpackage.kxt;
import defpackage.kxu;
import defpackage.ty;
import defpackage.ug;
import defpackage.uy;
import defpackage.vw;
import defpackage.vx;
import defpackage.vy;
import defpackage.wf;
import defpackage.wm;
import defpackage.wo;
import defpackage.wz;
import defpackage.yb;
import defpackage.yc;
import defpackage.yd;
import defpackage.yf;
import defpackage.yg;
import defpackage.yi;
import defpackage.yj;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends vx implements wm {
    private final yc J;
    private boolean K;
    private final boolean L;
    private int[] M;
    private final Runnable N;
    yj[] a;
    public uy b;
    uy c;
    public int d;
    public boolean e;
    boolean f;
    public int g;
    public int h;
    public final yg i;
    public yi j;
    private int k;
    private int l;
    private final ty m;
    private BitSet n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private final Rect s;

    public StaggeredGridLayoutManager(int i) {
        this.k = -1;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.i = new yg();
        this.o = 2;
        this.s = new Rect();
        this.J = new yc(this);
        this.K = false;
        this.L = true;
        this.N = new yb(this);
        this.d = 1;
        J(i);
        this.m = new ty();
        ad();
    }

    private final int O(int i) {
        if (at() == 0) {
            return this.f ? 1 : -1;
        }
        return (i < c()) != this.f ? -1 : 1;
    }

    private final int P(wo woVar) {
        if (at() == 0) {
            return 0;
        }
        return wz.a(woVar, this.b, r(!this.L), l(!this.L), this, this.L);
    }

    private final int S(wo woVar) {
        if (at() == 0) {
            return 0;
        }
        return wz.b(woVar, this.b, r(!this.L), l(!this.L), this, this.L, this.f);
    }

    private final int T(wo woVar) {
        if (at() == 0) {
            return 0;
        }
        return wz.c(woVar, this.b, r(!this.L), l(!this.L), this, this.L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [int] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int W(defpackage.wf r22, defpackage.ty r23, defpackage.wo r24) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.W(wf, ty, wo):int");
    }

    private final int X(int i) {
        int d = this.a[0].d(i);
        for (int i2 = 1; i2 < this.k; i2++) {
            int d2 = this.a[i2].d(i);
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    private final int ac(int i) {
        int f = this.a[0].f(i);
        for (int i2 = 1; i2 < this.k; i2++) {
            int f2 = this.a[i2].f(i);
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    private final void ad() {
        this.b = uy.p(this, this.d);
        this.c = uy.p(this, 1 - this.d);
    }

    private final void ae(wf wfVar, wo woVar, boolean z) {
        int f;
        int i;
        int X = X(Integer.MIN_VALUE);
        if (X != Integer.MIN_VALUE && (f = this.b.f() - X) > 0) {
            int i2 = -k(-f, wfVar, woVar);
            if (!z || (i = f - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void ai(wf wfVar, wo woVar, boolean z) {
        int j;
        int ac = ac(Alert.DURATION_SHOW_INDEFINITELY);
        if (ac != Integer.MAX_VALUE && (j = ac - this.b.j()) > 0) {
            int k = j - k(j, wfVar, woVar);
            if (!z || k <= 0) {
                return;
            }
            this.b.n(-k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ak(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f
            if (r0 == 0) goto L9
            int r0 = r6.i()
            goto Ld
        L9:
            int r0 = r6.c()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            yg r4 = r6.i
            r4.i(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            yg r9 = r6.i
            r9.f(r7, r4)
            yg r7 = r6.i
            r7.e(r8, r4)
            goto L41
        L36:
            yg r9 = r6.i
            r9.f(r7, r8)
            goto L41
        L3c:
            yg r9 = r6.i
            r9.e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            goto L56
        L44:
            boolean r7 = r6.f
            if (r7 == 0) goto L4d
            int r7 = r6.c()
            goto L51
        L4d:
            int r7 = r6.i()
        L51:
            if (r3 > r7) goto L56
            r6.be()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ak(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x03e2, code lost:
    
        if (L() != false) goto L241;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ao(defpackage.wf r12, defpackage.wo r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ao(wf, wo, boolean):void");
    }

    private final void ap(wf wfVar, ty tyVar) {
        if (!tyVar.a || tyVar.i) {
            return;
        }
        if (tyVar.b == 0) {
            if (tyVar.e == -1) {
                aq(wfVar, tyVar.g);
                return;
            } else {
                bM(wfVar, tyVar.f);
                return;
            }
        }
        int i = 1;
        if (tyVar.e == -1) {
            int i2 = tyVar.f;
            int f = this.a[0].f(i2);
            while (i < this.k) {
                int f2 = this.a[i].f(i2);
                if (f2 > f) {
                    f = f2;
                }
                i++;
            }
            int i3 = i2 - f;
            aq(wfVar, i3 < 0 ? tyVar.g : tyVar.g - Math.min(i3, tyVar.b));
            return;
        }
        int i4 = tyVar.g;
        int d = this.a[0].d(i4);
        while (i < this.k) {
            int d2 = this.a[i].d(i4);
            if (d2 < d) {
                d = d2;
            }
            i++;
        }
        int i5 = d - tyVar.g;
        bM(wfVar, i5 < 0 ? tyVar.f : Math.min(i5, tyVar.b) + tyVar.f);
    }

    private final void aq(wf wfVar, int i) {
        int at = at();
        while (true) {
            at--;
            if (at < 0) {
                return;
            }
            View aH = aH(at);
            if (this.b.d(aH) < i || this.b.m(aH) < i) {
                return;
            }
            yd ydVar = (yd) aH.getLayoutParams();
            if (ydVar.b) {
                for (int i2 = 0; i2 < this.k; i2++) {
                    if (this.a[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.k; i3++) {
                    this.a[i3].m();
                }
            } else if (ydVar.a.a.size() == 1) {
                return;
            } else {
                ydVar.a.m();
            }
            bb(aH, wfVar);
        }
    }

    private final void bM(wf wfVar, int i) {
        while (at() > 0) {
            View aH = aH(0);
            if (this.b.a(aH) > i || this.b.l(aH) > i) {
                return;
            }
            yd ydVar = (yd) aH.getLayoutParams();
            if (ydVar.b) {
                for (int i2 = 0; i2 < this.k; i2++) {
                    if (this.a[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.k; i3++) {
                    this.a[i3].n();
                }
            } else if (ydVar.a.a.size() == 1) {
                return;
            } else {
                ydVar.a.n();
            }
            bb(aH, wfVar);
        }
    }

    private final void bN() {
        this.f = (this.d == 1 || !M()) ? this.e : !this.e;
    }

    private final void bO(int i) {
        ty tyVar = this.m;
        tyVar.e = i;
        tyVar.d = this.f != (i == -1) ? -1 : 1;
    }

    private final void bP(int i, int i2) {
        for (int i3 = 0; i3 < this.k; i3++) {
            if (!this.a[i3].a.isEmpty()) {
                bR(this.a[i3], i, i2);
            }
        }
    }

    private final void bQ(int i, wo woVar) {
        int i2;
        int i3;
        int i4;
        ty tyVar = this.m;
        boolean z = false;
        tyVar.b = 0;
        tyVar.c = i;
        if (!bo() || (i4 = woVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f == (i4 < i)) {
                i2 = this.b.k();
                i3 = 0;
            } else {
                i3 = this.b.k();
                i2 = 0;
            }
        }
        if (bm()) {
            this.m.f = this.b.j() - i3;
            this.m.g = this.b.f() + i2;
        } else {
            this.m.g = this.b.e() + i2;
            this.m.f = -i3;
        }
        ty tyVar2 = this.m;
        tyVar2.h = false;
        tyVar2.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        tyVar2.i = z;
    }

    private final void bR(yj yjVar, int i, int i2) {
        int i3 = yjVar.d;
        if (i == -1) {
            if (yjVar.e() + i3 <= i2) {
                this.n.set(yjVar.e, false);
            }
        } else if (yjVar.c() - i3 >= i2) {
            this.n.set(yjVar.e, false);
        }
    }

    private final boolean bS(int i) {
        int i2 = this.d;
        boolean z = i == -1;
        if (i2 == 0) {
            return z != this.f;
        }
        return (z == this.f) == M();
    }

    private final void bT(View view, int i, int i2) {
        aN(view, this.s);
        yd ydVar = (yd) view.getLayoutParams();
        int bU = bU(i, ydVar.leftMargin + this.s.left, ydVar.rightMargin + this.s.right);
        int bU2 = bU(i2, ydVar.topMargin + this.s.top, ydVar.bottomMargin + this.s.bottom);
        if (bq(view, bU, bU2, ydVar)) {
            view.measure(bU, bU2);
        }
    }

    private static final int bU(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 != 0) {
                i2 = 0;
            }
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                mode = 1073741824;
            }
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // defpackage.vx
    public final void A(int i, int i2) {
        ak(i, i2, 2);
    }

    @Override // defpackage.vx
    public final void B(int i, int i2) {
        ak(i, i2, 4);
    }

    @Override // defpackage.vx
    public final int C(wo woVar) {
        return P(woVar);
    }

    @Override // defpackage.vx
    public final int D(wo woVar) {
        return S(woVar);
    }

    @Override // defpackage.vx
    public final int E(wo woVar) {
        return T(woVar);
    }

    @Override // defpackage.vx
    public final int F(wo woVar) {
        return P(woVar);
    }

    @Override // defpackage.vx
    public final int G(wo woVar) {
        return S(woVar);
    }

    @Override // defpackage.vx
    public final int H(wo woVar) {
        return T(woVar);
    }

    public final void I(boolean z) {
        V(null);
        yi yiVar = this.j;
        if (yiVar != null && yiVar.h != z) {
            yiVar.h = z;
        }
        this.e = z;
        be();
    }

    public final void J(int i) {
        V(null);
        if (i != this.k) {
            this.i.c();
            be();
            this.k = i;
            this.n = new BitSet(i);
            this.a = new yj[this.k];
            for (int i2 = 0; i2 < this.k; i2++) {
                this.a[i2] = new yj(this, i2);
            }
            be();
        }
    }

    final void K(int i) {
        this.l = i / this.k;
        this.r = View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean L() {
        int c;
        int i;
        if (at() != 0 && this.o != 0 && this.z) {
            if (this.f) {
                c = i();
                i = c();
            } else {
                c = c();
                i = i();
            }
            if (c == 0) {
                if (s() != null) {
                    this.i.c();
                    bf();
                    be();
                    return true;
                }
                c = 0;
            }
            if (this.K) {
                int i2 = true != this.f ? 1 : -1;
                int i3 = i + 1;
                yf h = this.i.h(c, i3, i2);
                if (h == null) {
                    this.K = false;
                    this.i.g(i3);
                    return false;
                }
                yf h2 = this.i.h(c, h.a, -i2);
                if (h2 == null) {
                    this.i.g(h.a);
                } else {
                    this.i.g(h2.a + 1);
                }
                bf();
                be();
                return true;
            }
        }
        return false;
    }

    final boolean M() {
        return aw() == 1;
    }

    public final void N() {
        V(null);
        if (this.o == 2) {
            return;
        }
        this.o = 2;
        be();
    }

    @Override // defpackage.wm
    public final PointF Q(int i) {
        int O = O(i);
        PointF pointF = new PointF();
        if (O == 0) {
            return null;
        }
        float f = O;
        if (this.d == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    @Override // defpackage.vx
    public final Parcelable R() {
        int f;
        int j;
        int[] iArr;
        yi yiVar = this.j;
        if (yiVar != null) {
            return new yi(yiVar);
        }
        yi yiVar2 = new yi();
        yiVar2.h = this.e;
        yiVar2.i = this.p;
        yiVar2.j = this.q;
        yg ygVar = this.i;
        if (ygVar == null || (iArr = ygVar.a) == null) {
            yiVar2.e = 0;
        } else {
            yiVar2.f = iArr;
            yiVar2.e = yiVar2.f.length;
            yiVar2.g = ygVar.b;
        }
        if (at() <= 0) {
            yiVar2.a = -1;
            yiVar2.b = -1;
            yiVar2.c = 0;
            return yiVar2;
        }
        yiVar2.a = this.p ? i() : c();
        View l = this.f ? l(true) : r(true);
        yiVar2.b = l != null ? bv(l) : -1;
        int i = this.k;
        yiVar2.c = i;
        yiVar2.d = new int[i];
        for (int i2 = 0; i2 < this.k; i2++) {
            if (this.p) {
                f = this.a[i2].d(Integer.MIN_VALUE);
                if (f != Integer.MIN_VALUE) {
                    j = this.b.f();
                    f -= j;
                    yiVar2.d[i2] = f;
                } else {
                    yiVar2.d[i2] = f;
                }
            } else {
                f = this.a[i2].f(Integer.MIN_VALUE);
                if (f != Integer.MIN_VALUE) {
                    j = this.b.j();
                    f -= j;
                    yiVar2.d[i2] = f;
                } else {
                    yiVar2.d[i2] = f;
                }
            }
        }
        return yiVar2;
    }

    @Override // defpackage.vx
    public final void V(String str) {
        if (this.j == null) {
            super.V(str);
        }
    }

    @Override // defpackage.vx
    public void Y(RecyclerView recyclerView, wf wfVar) {
        bF(this.N);
        for (int i = 0; i < this.k; i++) {
            this.a[i].k();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.vx
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (at() > 0) {
            View r = r(false);
            View l = l(false);
            if (r == null || l == null) {
                return;
            }
            int bv = bv(r);
            int bv2 = bv(l);
            if (bv < bv2) {
                accessibilityEvent.setFromIndex(bv);
                accessibilityEvent.setToIndex(bv2);
            } else {
                accessibilityEvent.setFromIndex(bv2);
                accessibilityEvent.setToIndex(bv);
            }
        }
    }

    @Override // defpackage.vx
    public final void aT(int i) {
        super.aT(i);
        for (int i2 = 0; i2 < this.k; i2++) {
            this.a[i2].l(i);
        }
    }

    @Override // defpackage.vx
    public final void aU(int i) {
        super.aU(i);
        for (int i2 = 0; i2 < this.k; i2++) {
            this.a[i2].l(i);
        }
    }

    @Override // defpackage.vx
    public final void aX(int i) {
        if (i == 0) {
            L();
        }
    }

    @Override // defpackage.vx
    public final void aa(Parcelable parcelable) {
        if (parcelable instanceof yi) {
            yi yiVar = (yi) parcelable;
            this.j = yiVar;
            if (this.g != -1) {
                yiVar.a();
                this.j.b();
            }
            be();
        }
    }

    @Override // defpackage.vx
    public final void ab(int i) {
        yi yiVar = this.j;
        if (yiVar != null && yiVar.a != i) {
            yiVar.a();
        }
        this.g = i;
        this.h = Integer.MIN_VALUE;
        be();
    }

    @Override // defpackage.vx
    public final boolean af() {
        return this.d == 0;
    }

    @Override // defpackage.vx
    public final boolean ag() {
        return this.d == 1;
    }

    @Override // defpackage.vx
    public final boolean ah() {
        return this.o != 0;
    }

    @Override // defpackage.vx
    public final boolean aj() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r5.length < r4.k) goto L13;
     */
    @Override // defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void am(int r5, int r6, defpackage.wo r7, defpackage.ts r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.d
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.at()
            if (r6 == 0) goto L7a
            if (r5 != 0) goto Lf
            goto L7a
        Lf:
            r4.w(r5, r7)
            int[] r5 = r4.M
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.k
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.k
            int[] r5 = new int[r5]
            r4.M = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.k
            if (r5 >= r1) goto L54
            ty r1 = r4.m
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3a
            int r1 = r1.f
            yj[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            goto L48
        L3a:
            yj[] r2 = r4.a
            r2 = r2[r5]
            int r1 = r1.g
            int r1 = r2.d(r1)
            ty r2 = r4.m
            int r2 = r2.g
        L48:
            int r1 = r1 - r2
            if (r1 < 0) goto L51
            int[] r2 = r4.M
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.M
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L7a
            ty r5 = r4.m
            boolean r5 = r5.a(r7)
            if (r5 == 0) goto L7a
            ty r5 = r4.m
            int r5 = r5.c
            int[] r1 = r4.M
            r1 = r1[r6]
            r8.a(r5, r1)
            ty r5 = r4.m
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.am(int, int, wo, ts):void");
    }

    @Override // defpackage.vx
    public final void ar(RecyclerView recyclerView, int i) {
        ug ugVar = new ug(recyclerView.getContext());
        ugVar.g = i;
        bl(ugVar);
    }

    @Override // defpackage.vx
    public final void bC() {
        this.i.c();
        for (int i = 0; i < this.k; i++) {
            this.a[i].k();
        }
    }

    final int c() {
        if (at() == 0) {
            return 0;
        }
        return bv(aH(0));
    }

    @Override // defpackage.vx
    public final int cb(wf wfVar, wo woVar) {
        if (this.d == 1) {
            return Math.min(this.k, woVar.a());
        }
        return -1;
    }

    @Override // defpackage.vx
    public final int cc(wf wfVar, wo woVar) {
        if (this.d == 0) {
            return Math.min(this.k, woVar.a());
        }
        return -1;
    }

    @Override // defpackage.vx
    public final vy cd(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new yd((ViewGroup.MarginLayoutParams) layoutParams) : new yd(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0039, code lost:
    
        if (r9.d == 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x003e, code lost:
    
        if (r9.d == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x004b, code lost:
    
        if (M() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0058, code lost:
    
        if (M() == false) goto L41;
     */
    @Override // defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ce(android.view.View r10, int r11, defpackage.wf r12, defpackage.wo r13) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ce(android.view.View, int, wf, wo):android.view.View");
    }

    @Override // defpackage.vx
    public final void cf(wf wfVar, wo woVar, kxu kxuVar) {
        super.cf(wfVar, woVar, kxuVar);
        kxuVar.r("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.vx
    public final void cg(wf wfVar, wo woVar, View view, kxu kxuVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof yd)) {
            super.aW(view, kxuVar);
            return;
        }
        yd ydVar = (yd) layoutParams;
        if (this.d == 0) {
            kxuVar.u(kxt.a(ydVar.d(), ydVar.b ? this.k : 1, -1, -1, false));
        } else {
            kxuVar.u(kxt.a(-1, -1, ydVar.d(), ydVar.b ? this.k : 1, false));
        }
    }

    @Override // defpackage.vx
    public final void ch(Rect rect, int i, int i2) {
        int as;
        int as2;
        int aB = aB() + aC();
        int aE = aE() + az();
        if (this.d == 1) {
            as2 = as(i2, rect.height() + aE, ax());
            as = as(i, (this.l * this.k) + aB, ay());
        } else {
            as = as(i, rect.width() + aB, ay());
            as2 = as(i2, (this.l * this.k) + aE, ax());
        }
        bi(as, as2);
    }

    @Override // defpackage.vx
    public final boolean cj() {
        return this.j == null;
    }

    @Override // defpackage.vx
    public final int d(int i, wf wfVar, wo woVar) {
        return k(i, wfVar, woVar);
    }

    @Override // defpackage.vx
    public final int e(int i, wf wfVar, wo woVar) {
        return k(i, wfVar, woVar);
    }

    @Override // defpackage.vx
    public final vy f() {
        return this.d == 0 ? new yd(-2, -1) : new yd(-1, -2);
    }

    @Override // defpackage.vx
    public final vy h(Context context, AttributeSet attributeSet) {
        return new yd(context, attributeSet);
    }

    final int i() {
        int at = at();
        if (at == 0) {
            return 0;
        }
        return bv(aH(at - 1));
    }

    final int k(int i, wf wfVar, wo woVar) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        w(i, woVar);
        int W = W(wfVar, this.m, woVar);
        if (this.m.b >= W) {
            i = i < 0 ? -W : W;
        }
        this.b.n(-i);
        this.p = this.f;
        ty tyVar = this.m;
        tyVar.b = 0;
        ap(wfVar, tyVar);
        return i;
    }

    final View l(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        View view = null;
        for (int at = at() - 1; at >= 0; at--) {
            View aH = aH(at);
            int d = this.b.d(aH);
            int a = this.b.a(aH);
            if (a > j && d < f) {
                if (a <= f || !z) {
                    return aH;
                }
                if (view == null) {
                    view = aH;
                }
            }
        }
        return view;
    }

    @Override // defpackage.vx
    public final void o(wf wfVar, wo woVar) {
        ao(wfVar, woVar, true);
    }

    @Override // defpackage.vx
    public final void p(wo woVar) {
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.j = null;
        this.J.a();
    }

    final View r(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        int at = at();
        View view = null;
        for (int i = 0; i < at; i++) {
            View aH = aH(i);
            int d = this.b.d(aH);
            if (this.b.a(aH) > j && d < f) {
                if (d >= j || !z) {
                    return aH;
                }
                if (view == null) {
                    view = aH;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.view.View s() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.s():android.view.View");
    }

    @Override // defpackage.vx
    public final boolean t(vy vyVar) {
        return vyVar instanceof yd;
    }

    final void w(int i, wo woVar) {
        int c;
        int i2;
        if (i > 0) {
            c = i();
            i2 = 1;
        } else {
            c = c();
            i2 = -1;
        }
        this.m.a = true;
        bQ(c, woVar);
        bO(i2);
        ty tyVar = this.m;
        tyVar.c = c + tyVar.d;
        tyVar.b = Math.abs(i);
    }

    @Override // defpackage.vx
    public final void x(int i, int i2) {
        ak(i, i2, 1);
    }

    @Override // defpackage.vx
    public final void y() {
        this.i.c();
        be();
    }

    @Override // defpackage.vx
    public final void z(int i, int i2) {
        ak(i, i2, 8);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = -1;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.i = new yg();
        this.o = 2;
        this.s = new Rect();
        this.J = new yc(this);
        this.K = false;
        this.L = true;
        this.N = new yb(this);
        vw aF = aF(context, attributeSet, i, i2);
        int i3 = aF.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        V(null);
        if (i3 != this.d) {
            this.d = i3;
            uy uyVar = this.b;
            this.b = this.c;
            this.c = uyVar;
            be();
        }
        J(aF.b);
        I(aF.c);
        this.m = new ty();
        ad();
    }
}
