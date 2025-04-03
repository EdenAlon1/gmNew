package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.aah;
import defpackage.kxr;
import defpackage.kxu;
import defpackage.ts;
import defpackage.ub;
import defpackage.uc;
import defpackage.ud;
import defpackage.uf;
import defpackage.ug;
import defpackage.uy;
import defpackage.vk;
import defpackage.vw;
import defpackage.vx;
import defpackage.vy;
import defpackage.wf;
import defpackage.wm;
import defpackage.wo;
import defpackage.wr;
import defpackage.wz;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends vx implements aah, wm {
    private ud a;
    private boolean b;
    private boolean c;
    private final uc d;
    private int e;
    private int[] f;
    public int k;
    uy l;
    public boolean m;
    boolean n;
    public boolean o;
    int p;
    int q;
    uf r;
    final ub s;

    public LinearLayoutManager() {
        this(1);
    }

    private final int bM(wo woVar) {
        if (at() == 0) {
            return 0;
        }
        X();
        return wz.c(woVar, this.l, ap(!this.c), ao(!this.c), this, this.c);
    }

    private final int bN(int i, wf wfVar, wo woVar, boolean z) {
        int f;
        int f2 = this.l.f() - i;
        if (f2 <= 0) {
            return 0;
        }
        int i2 = -P(-f2, wfVar, woVar);
        int i3 = i + i2;
        if (!z || (f = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(f);
        return f + i2;
    }

    private final int bO(int i, wf wfVar, wo woVar, boolean z) {
        int j;
        int j2 = i - this.l.j();
        if (j2 <= 0) {
            return 0;
        }
        int i2 = -P(j2, wfVar, woVar);
        int i3 = i + i2;
        if (!z || (j = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-j);
        return i2 - j;
    }

    private final View bP() {
        return S(0, at());
    }

    private final View bQ() {
        return S(at() - 1, -1);
    }

    private final View bR() {
        return aH(this.n ? 0 : at() - 1);
    }

    private final View bS() {
        return aH(this.n ? at() - 1 : 0);
    }

    private final void bT(wf wfVar, ud udVar) {
        if (!udVar.a || udVar.m) {
            return;
        }
        int i = udVar.g;
        int i2 = udVar.i;
        if (udVar.f == -1) {
            int at = at();
            if (i >= 0) {
                int e = (this.l.e() - i) + i2;
                if (this.n) {
                    for (int i3 = 0; i3 < at; i3++) {
                        View aH = aH(i3);
                        if (this.l.d(aH) < e || this.l.m(aH) < e) {
                            bU(wfVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = at - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View aH2 = aH(i5);
                    if (this.l.d(aH2) < e || this.l.m(aH2) < e) {
                        bU(wfVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int at2 = at();
            if (!this.n) {
                for (int i7 = 0; i7 < at2; i7++) {
                    View aH3 = aH(i7);
                    if (this.l.a(aH3) > i6 || this.l.l(aH3) > i6) {
                        bU(wfVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = at2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View aH4 = aH(i9);
                if (this.l.a(aH4) > i6 || this.l.l(aH4) > i6) {
                    bU(wfVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bU(wf wfVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                bc(i, wfVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    bc(i2, wfVar);
                }
            }
        }
    }

    private final void bV() {
        this.n = (this.k == 1 || !ai()) ? this.m : !this.m;
    }

    private final void bW(int i, int i2, boolean z, wo woVar) {
        int j;
        this.a.m = ak();
        this.a.f = i;
        int[] iArr = this.f;
        iArr[0] = 0;
        iArr[1] = 0;
        W(woVar, iArr);
        int max = Math.max(0, this.f[0]);
        int max2 = Math.max(0, this.f[1]);
        int i3 = i == 1 ? max2 : max;
        ud udVar = this.a;
        udVar.h = i3;
        if (i != 1) {
            max = max2;
        }
        udVar.i = max;
        if (i == 1) {
            udVar.h = i3 + this.l.g();
            View bR = bR();
            ud udVar2 = this.a;
            udVar2.e = true == this.n ? -1 : 1;
            int bv = bv(bR);
            ud udVar3 = this.a;
            udVar2.d = bv + udVar3.e;
            udVar3.b = this.l.a(bR);
            j = this.l.a(bR) - this.l.f();
        } else {
            View bS = bS();
            this.a.h += this.l.j();
            ud udVar4 = this.a;
            udVar4.e = true != this.n ? -1 : 1;
            int bv2 = bv(bS);
            ud udVar5 = this.a;
            udVar4.d = bv2 + udVar5.e;
            udVar5.b = this.l.d(bS);
            j = (-this.l.d(bS)) + this.l.j();
        }
        ud udVar6 = this.a;
        udVar6.c = i2;
        if (z) {
            udVar6.c = i2 - j;
        }
        udVar6.g = j;
    }

    private final void bX(ub ubVar) {
        bY(ubVar.b, ubVar.c);
    }

    private final void bY(int i, int i2) {
        this.a.c = this.l.f() - i2;
        ud udVar = this.a;
        udVar.e = true != this.n ? 1 : -1;
        udVar.d = i;
        udVar.f = 1;
        udVar.b = i2;
        udVar.g = Integer.MIN_VALUE;
    }

    private final void bZ(ub ubVar) {
        ca(ubVar.b, ubVar.c);
    }

    private final int c(wo woVar) {
        if (at() == 0) {
            return 0;
        }
        X();
        return wz.a(woVar, this.l, ap(!this.c), ao(!this.c), this, this.c);
    }

    private final void ca(int i, int i2) {
        this.a.c = i2 - this.l.j();
        ud udVar = this.a;
        udVar.d = i;
        udVar.e = true != this.n ? -1 : 1;
        udVar.f = -1;
        udVar.b = i2;
        udVar.g = Integer.MIN_VALUE;
    }

    private final int r(wo woVar) {
        if (at() == 0) {
            return 0;
        }
        X();
        return wz.b(woVar, this.l, ap(!this.c), ao(!this.c), this, this.c, this.n);
    }

    @Override // defpackage.vx
    public final int C(wo woVar) {
        return c(woVar);
    }

    @Override // defpackage.vx
    public final int D(wo woVar) {
        return r(woVar);
    }

    @Override // defpackage.vx
    public final int E(wo woVar) {
        return bM(woVar);
    }

    @Override // defpackage.vx
    public final int F(wo woVar) {
        return c(woVar);
    }

    @Override // defpackage.vx
    public final int G(wo woVar) {
        return r(woVar);
    }

    @Override // defpackage.vx
    public final int H(wo woVar) {
        return bM(woVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int I(int r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 == r1) goto L36
            r2 = 2
            if (r6 == r2) goto L29
            r2 = 17
            r3 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r2) goto L22
            r2 = 33
            if (r6 == r2) goto L23
            r0 = 66
            if (r6 == r0) goto L21
            r0 = 130(0x82, float:1.82E-43)
            if (r6 == r0) goto L1b
            return r4
        L1b:
            int r6 = r5.k
            if (r6 != r1) goto L20
            return r1
        L20:
            return r4
        L21:
            r0 = r1
        L22:
            r1 = r3
        L23:
            int r6 = r5.k
            if (r6 != r1) goto L28
            return r0
        L28:
            return r4
        L29:
            int r6 = r5.k
            if (r6 != r1) goto L2e
            return r1
        L2e:
            boolean r6 = r5.ai()
            if (r6 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            int r6 = r5.k
            if (r6 != r1) goto L3b
            return r0
        L3b:
            boolean r6 = r5.ai()
            if (r6 == 0) goto L42
            return r1
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.I(int):int");
    }

    final int J(wf wfVar, ud udVar, wo woVar, boolean z) {
        int i = udVar.c;
        int i2 = udVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                udVar.g = i2 + i;
            }
            bT(wfVar, udVar);
        }
        int i3 = udVar.c + udVar.h;
        uc ucVar = this.d;
        while (true) {
            if ((!udVar.m && i3 <= 0) || !udVar.d(woVar)) {
                break;
            }
            ucVar.a = 0;
            ucVar.b = false;
            ucVar.c = false;
            ucVar.d = false;
            k(wfVar, woVar, udVar, ucVar);
            if (!ucVar.b) {
                int i4 = udVar.b;
                int i5 = ucVar.a;
                udVar.b = i4 + (udVar.f * i5);
                if (!ucVar.c || udVar.l != null || !woVar.g) {
                    udVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = udVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    udVar.g = i7;
                    int i8 = udVar.c;
                    if (i8 < 0) {
                        udVar.g = i7 + i8;
                    }
                    bT(wfVar, udVar);
                }
                if (z && ucVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - udVar.c;
    }

    public final int K() {
        View T = T(0, at(), true, false);
        if (T == null) {
            return -1;
        }
        return bv(T);
    }

    public final int L() {
        View T = T(0, at(), false, true);
        if (T == null) {
            return -1;
        }
        return bv(T);
    }

    public final int M() {
        View T = T(at() - 1, -1, true, false);
        if (T == null) {
            return -1;
        }
        return bv(T);
    }

    public final int N() {
        View T = T(at() - 1, -1, false, true);
        if (T == null) {
            return -1;
        }
        return bv(T);
    }

    @Deprecated
    protected int O(wo woVar) {
        if (woVar.a != -1) {
            return this.l.k();
        }
        return 0;
    }

    final int P(int i, wf wfVar, wo woVar) {
        if (at() != 0 && i != 0) {
            X();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            bW(i2, abs, true, woVar);
            ud udVar = this.a;
            int J = udVar.g + J(wfVar, udVar, woVar, false);
            if (J >= 0) {
                if (abs > J) {
                    i = i2 * J;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.wm
    public final PointF Q(int i) {
        if (at() == 0) {
            return null;
        }
        float f = (i < bv(aH(0))) != this.n ? -1 : 1;
        return this.k == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.vx
    public final Parcelable R() {
        uf ufVar = this.r;
        if (ufVar != null) {
            return new uf(ufVar);
        }
        uf ufVar2 = new uf();
        if (at() <= 0) {
            ufVar2.a();
            return ufVar2;
        }
        X();
        boolean z = this.b ^ this.n;
        ufVar2.c = z;
        if (z) {
            View bR = bR();
            ufVar2.b = this.l.f() - this.l.a(bR);
            ufVar2.a = bv(bR);
            return ufVar2;
        }
        View bS = bS();
        ufVar2.a = bv(bS);
        ufVar2.b = this.l.d(bS) - this.l.j();
        return ufVar2;
    }

    final View S(int i, int i2) {
        X();
        if (i2 <= i && i2 >= i) {
            return aH(i);
        }
        int d = this.l.d(aH(i));
        int j = this.l.j();
        int i3 = d < j ? 16388 : 4097;
        int i4 = d < j ? 16644 : 4161;
        return this.k == 0 ? this.v.a(i, i2, i4, i3) : this.w.a(i, i2, i4, i3);
    }

    final View T(int i, int i2, boolean z, boolean z2) {
        X();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        int i5 = true != z2 ? 0 : 320;
        return i3 == 0 ? this.v.a(i, i2, i4, i5) : this.w.a(i, i2, i4, i5);
    }

    @Override // defpackage.vx
    public final View U(int i) {
        int at = at();
        if (at == 0) {
            return null;
        }
        int bv = i - bv(aH(0));
        if (bv >= 0 && bv < at) {
            View aH = aH(bv);
            if (bv(aH) == i) {
                return aH;
            }
        }
        return super.U(i);
    }

    @Override // defpackage.vx
    public final void V(String str) {
        if (this.r == null) {
            super.V(str);
        }
    }

    protected void W(wo woVar, int[] iArr) {
        int O = O(woVar);
        int i = this.a.f;
        int i2 = i == -1 ? 0 : O;
        if (i != -1) {
            O = 0;
        }
        iArr[0] = O;
        iArr[1] = i2;
    }

    final void X() {
        if (this.a == null) {
            this.a = new ud();
        }
    }

    @Override // defpackage.vx
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (at() > 0) {
            accessibilityEvent.setFromIndex(L());
            accessibilityEvent.setToIndex(N());
        }
    }

    @Override // defpackage.vx
    public final void aa(Parcelable parcelable) {
        if (parcelable instanceof uf) {
            uf ufVar = (uf) parcelable;
            this.r = ufVar;
            if (this.p != -1) {
                ufVar.a();
            }
            be();
        }
    }

    @Override // defpackage.vx
    public final void ab(int i) {
        this.p = i;
        this.q = Integer.MIN_VALUE;
        uf ufVar = this.r;
        if (ufVar != null) {
            ufVar.a();
        }
        be();
    }

    public final void ac(int i, int i2) {
        this.p = i;
        this.q = i2;
        uf ufVar = this.r;
        if (ufVar != null) {
            ufVar.a();
        }
        be();
    }

    public final void ad(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.h(i, "invalid orientation:"));
        }
        V(null);
        if (i != this.k || this.l == null) {
            uy p = uy.p(this, i);
            this.l = p;
            this.s.a = p;
            this.k = i;
            be();
        }
    }

    public final void ae(boolean z) {
        V(null);
        if (z == this.m) {
            return;
        }
        this.m = z;
        be();
    }

    @Override // defpackage.vx
    public boolean af() {
        return this.k == 0;
    }

    @Override // defpackage.vx
    public boolean ag() {
        return this.k == 1;
    }

    @Override // defpackage.vx
    public final boolean ah() {
        return true;
    }

    protected final boolean ai() {
        return aw() == 1;
    }

    @Override // defpackage.vx
    public final boolean aj() {
        return this.m;
    }

    final boolean ak() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.vx
    public final boolean al() {
        if (this.G != 1073741824 && this.F != 1073741824) {
            int at = at();
            for (int i = 0; i < at; i++) {
                ViewGroup.LayoutParams layoutParams = aH(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vx
    public final void am(int i, int i2, wo woVar, ts tsVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (at() == 0 || i == 0) {
            return;
        }
        X();
        bW(i > 0 ? 1 : -1, Math.abs(i), true, woVar);
        w(woVar, this.a, tsVar);
    }

    @Override // defpackage.vx
    public final void an(int i, ts tsVar) {
        boolean z;
        int i2;
        uf ufVar = this.r;
        if (ufVar == null || !ufVar.b()) {
            bV();
            z = this.n;
            i2 = this.p;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = ufVar.c;
            i2 = ufVar.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.e && i2 >= 0 && i2 < i; i4++) {
            tsVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View ao(boolean z) {
        return this.n ? T(0, at(), z, true) : T(at() - 1, -1, z, true);
    }

    final View ap(boolean z) {
        return this.n ? T(at() - 1, -1, z, true) : T(0, at(), z, true);
    }

    @Override // defpackage.aah
    public final void aq(View view, View view2) {
        V("Cannot drop a view during a scroll or layout calculation");
        X();
        bV();
        int bv = bv(view);
        int bv2 = bv(view2);
        boolean z = this.n;
        char c = bv < bv2 ? (char) 1 : (char) 65535;
        if (z) {
            if (c == 1) {
                ac(bv2, this.l.f() - (this.l.d(view2) + this.l.b(view)));
                return;
            } else {
                ac(bv2, this.l.f() - this.l.a(view2));
                return;
            }
        }
        if (c == 65535) {
            ac(bv2, this.l.d(view2));
        } else {
            ac(bv2, this.l.a(view2) - this.l.b(view));
        }
    }

    @Override // defpackage.vx
    public void ar(RecyclerView recyclerView, int i) {
        ug ugVar = new ug(recyclerView.getContext());
        ugVar.g = i;
        bl(ugVar);
    }

    @Override // defpackage.vx
    public View ce(View view, int i, wf wfVar, wo woVar) {
        int I;
        View bP;
        bV();
        if (at() == 0 || (I = I(i)) == Integer.MIN_VALUE) {
            return null;
        }
        X();
        bW(I, (int) (this.l.k() * 0.33333334f), false, woVar);
        ud udVar = this.a;
        udVar.g = Integer.MIN_VALUE;
        udVar.a = false;
        J(wfVar, udVar, woVar, true);
        if (I == -1) {
            bP = this.n ? bQ() : bP();
            I = -1;
        } else {
            bP = this.n ? bP() : bQ();
        }
        View bS = I == -1 ? bS() : bR();
        if (!bS.hasFocusable()) {
            return bP;
        }
        if (bP == null) {
            return null;
        }
        return bS;
    }

    @Override // defpackage.vx
    public void cf(wf wfVar, wo woVar, kxu kxuVar) {
        super.cf(wfVar, woVar, kxuVar);
        vk vkVar = this.u.n;
        if (vkVar == null || vkVar.a() <= 0) {
            return;
        }
        kxuVar.i(kxr.i);
    }

    @Override // defpackage.vx
    public boolean ci(int i, Bundle bundle) {
        int min;
        if (super.ci(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.u;
                min = Math.min(i2, cc(recyclerView.e, recyclerView.O) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.u;
                min = Math.min(i3, cb(recyclerView2.e, recyclerView2.O) - 1);
            }
            if (min >= 0) {
                ac(min, 0);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vx
    public boolean cj() {
        return this.r == null && this.b == this.o;
    }

    @Override // defpackage.vx
    public int d(int i, wf wfVar, wo woVar) {
        if (this.k == 1) {
            return 0;
        }
        return P(i, wfVar, woVar);
    }

    @Override // defpackage.vx
    public int e(int i, wf wfVar, wo woVar) {
        if (this.k == 0) {
            return 0;
        }
        return P(i, wfVar, woVar);
    }

    @Override // defpackage.vx
    public vy f() {
        return new vy(-2, -2);
    }

    public View i(wf wfVar, wo woVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        X();
        int at = at();
        if (z2) {
            i = -1;
            i3 = at() - 1;
            i2 = -1;
        } else {
            i = at;
            i2 = 1;
            i3 = 0;
        }
        int a = woVar.a();
        int j = this.l.j();
        int f = this.l.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i) {
            View aH = aH(i3);
            int bv = bv(aH);
            int d = this.l.d(aH);
            int a2 = this.l.a(aH);
            if (bv >= 0 && bv < a) {
                if (!((vy) aH.getLayoutParams()).c()) {
                    boolean z3 = a2 <= j && d < j;
                    boolean z4 = d >= f && a2 > f;
                    if (!z3 && !z4) {
                        return aH;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = aH;
                        }
                        view2 = aH;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = aH;
                        }
                        view2 = aH;
                    }
                } else if (view3 == null) {
                    view3 = aH;
                }
            }
            i3 += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public void k(wf wfVar, wo woVar, ud udVar, uc ucVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View a = udVar.a(wfVar);
        if (a == null) {
            ucVar.b = true;
            return;
        }
        vy vyVar = (vy) a.getLayoutParams();
        if (udVar.l == null) {
            if (this.n == (udVar.f == -1)) {
                aL(a);
            } else {
                aM(a, 0);
            }
        } else {
            if (this.n == (udVar.f == -1)) {
                aJ(a);
            } else {
                aK(a, 0);
            }
        }
        bB(a);
        ucVar.a = this.l.b(a);
        if (this.k == 1) {
            if (ai()) {
                i4 = this.H - aC();
                i = i4 - this.l.c(a);
            } else {
                i = aB();
                i4 = this.l.c(a) + i;
            }
            if (udVar.f == -1) {
                i2 = udVar.b;
                i3 = i2 - ucVar.a;
            } else {
                i3 = udVar.b;
                i2 = ucVar.a + i3;
            }
        } else {
            int aE = aE();
            int c = this.l.c(a) + aE;
            if (udVar.f == -1) {
                int i5 = udVar.b;
                int i6 = i5 - ucVar.a;
                i4 = i5;
                i2 = c;
                i = i6;
                i3 = aE;
            } else {
                int i7 = udVar.b;
                int i8 = ucVar.a + i7;
                i = i7;
                i2 = c;
                i3 = aE;
                i4 = i8;
            }
        }
        bA(a, i, i3, i4, i2);
        if (vyVar.c() || vyVar.b()) {
            ucVar.c = true;
        }
        ucVar.d = a.hasFocusable();
    }

    @Override // defpackage.vx
    public void o(wf wfVar, wo woVar) {
        View i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int bN;
        int i7;
        View U;
        int d;
        int i8;
        int i9 = -1;
        if (!(this.r == null && this.p == -1) && woVar.a() == 0) {
            aZ(wfVar);
            return;
        }
        uf ufVar = this.r;
        if (ufVar != null && ufVar.b()) {
            this.p = ufVar.a;
        }
        X();
        this.a.a = false;
        bV();
        View aI = aI();
        ub ubVar = this.s;
        if (!ubVar.e || this.p != -1 || this.r != null) {
            ubVar.d();
            ub ubVar2 = this.s;
            ubVar2.d = this.n ^ this.o;
            if (!woVar.g && (i2 = this.p) != -1) {
                if (i2 < 0 || i2 >= woVar.a()) {
                    this.p = -1;
                    this.q = Integer.MIN_VALUE;
                } else {
                    int i10 = this.p;
                    ubVar2.b = i10;
                    uf ufVar2 = this.r;
                    if (ufVar2 != null && ufVar2.b()) {
                        boolean z = ufVar2.c;
                        ubVar2.d = z;
                        if (z) {
                            ubVar2.c = this.l.f() - this.r.b;
                        } else {
                            ubVar2.c = this.l.j() + this.r.b;
                        }
                    } else if (this.q == Integer.MIN_VALUE) {
                        View U2 = U(i10);
                        if (U2 == null) {
                            if (at() > 0) {
                                ubVar2.d = (this.p < bv(aH(0))) == this.n;
                            }
                            ubVar2.a();
                        } else if (this.l.b(U2) > this.l.k()) {
                            ubVar2.a();
                        } else if (this.l.d(U2) - this.l.j() < 0) {
                            ubVar2.c = this.l.j();
                            ubVar2.d = false;
                        } else if (this.l.f() - this.l.a(U2) < 0) {
                            ubVar2.c = this.l.f();
                            ubVar2.d = true;
                        } else {
                            ubVar2.c = ubVar2.d ? this.l.a(U2) + this.l.o() : this.l.d(U2);
                        }
                    } else {
                        boolean z2 = this.n;
                        ubVar2.d = z2;
                        if (z2) {
                            ubVar2.c = this.l.f() - this.q;
                        } else {
                            ubVar2.c = this.l.j() + this.q;
                        }
                    }
                    this.s.e = true;
                }
            }
            if (at() != 0) {
                View aI2 = aI();
                if (aI2 != null) {
                    vy vyVar = (vy) aI2.getLayoutParams();
                    if (!vyVar.c() && vyVar.a() >= 0 && vyVar.a() < woVar.a()) {
                        ubVar2.c(aI2, bv(aI2));
                        this.s.e = true;
                    }
                }
                boolean z3 = this.b;
                boolean z4 = this.o;
                if (z3 == z4 && (i = i(wfVar, woVar, ubVar2.d, z4)) != null) {
                    ubVar2.b(i, bv(i));
                    if (!woVar.g && cj()) {
                        int d2 = this.l.d(i);
                        int a = this.l.a(i);
                        int j = this.l.j();
                        int f = this.l.f();
                        boolean z5 = a <= j && d2 < j;
                        boolean z6 = d2 >= f && a > f;
                        if (z5 || z6) {
                            if (true == ubVar2.d) {
                                j = f;
                            }
                            ubVar2.c = j;
                        }
                    }
                    this.s.e = true;
                }
            }
            ubVar2.a();
            ubVar2.b = this.o ? woVar.a() - 1 : 0;
            this.s.e = true;
        } else if (aI != null && (this.l.d(aI) >= this.l.f() || this.l.a(aI) <= this.l.j())) {
            this.s.c(aI, bv(aI));
        }
        ud udVar = this.a;
        udVar.f = udVar.k >= 0 ? 1 : -1;
        int[] iArr = this.f;
        iArr[0] = 0;
        iArr[1] = 0;
        W(woVar, iArr);
        int max = Math.max(0, this.f[0]) + this.l.j();
        int max2 = Math.max(0, this.f[1]) + this.l.g();
        if (woVar.g && (i7 = this.p) != -1 && this.q != Integer.MIN_VALUE && (U = U(i7)) != null) {
            if (this.n) {
                i8 = this.l.f() - this.l.a(U);
                d = this.q;
            } else {
                d = this.l.d(U) - this.l.j();
                i8 = this.q;
            }
            int i11 = i8 - d;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        ub ubVar3 = this.s;
        if (!ubVar3.d ? true != this.n : true == this.n) {
            i9 = 1;
        }
        l(wfVar, woVar, ubVar3, i9);
        aO(wfVar);
        this.a.m = ak();
        ud udVar2 = this.a;
        udVar2.j = woVar.g;
        udVar2.i = 0;
        ub ubVar4 = this.s;
        if (ubVar4.d) {
            bZ(ubVar4);
            ud udVar3 = this.a;
            udVar3.h = max;
            J(wfVar, udVar3, woVar, false);
            ud udVar4 = this.a;
            i4 = udVar4.b;
            int i12 = udVar4.d;
            int i13 = udVar4.c;
            if (i13 > 0) {
                max2 += i13;
            }
            bX(this.s);
            ud udVar5 = this.a;
            udVar5.h = max2;
            udVar5.d += udVar5.e;
            J(wfVar, udVar5, woVar, false);
            ud udVar6 = this.a;
            i3 = udVar6.b;
            int i14 = udVar6.c;
            if (i14 > 0) {
                ca(i12, i4);
                ud udVar7 = this.a;
                udVar7.h = i14;
                J(wfVar, udVar7, woVar, false);
                i4 = this.a.b;
            }
        } else {
            bX(ubVar4);
            ud udVar8 = this.a;
            udVar8.h = max2;
            J(wfVar, udVar8, woVar, false);
            ud udVar9 = this.a;
            i3 = udVar9.b;
            int i15 = udVar9.d;
            int i16 = udVar9.c;
            if (i16 > 0) {
                max += i16;
            }
            bZ(this.s);
            ud udVar10 = this.a;
            udVar10.h = max;
            udVar10.d += udVar10.e;
            J(wfVar, udVar10, woVar, false);
            ud udVar11 = this.a;
            i4 = udVar11.b;
            int i17 = udVar11.c;
            if (i17 > 0) {
                bY(i15, i3);
                ud udVar12 = this.a;
                udVar12.h = i17;
                J(wfVar, udVar12, woVar, false);
                i3 = this.a.b;
            }
        }
        if (at() > 0) {
            if (this.n ^ this.o) {
                int bN2 = bN(i3, wfVar, woVar, true);
                i5 = i4 + bN2;
                i6 = i3 + bN2;
                bN = bO(i5, wfVar, woVar, false);
            } else {
                int bO = bO(i4, wfVar, woVar, true);
                i5 = i4 + bO;
                i6 = i3 + bO;
                bN = bN(i6, wfVar, woVar, false);
            }
            i4 = i5 + bN;
            i3 = i6 + bN;
        }
        if (woVar.k && at() != 0 && !woVar.g && cj()) {
            List list = wfVar.d;
            int size = list.size();
            int bv = bv(aH(0));
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < size; i20++) {
                wr wrVar = (wr) list.get(i20);
                if (!wrVar.v()) {
                    if ((wrVar.gz() < bv) != this.n) {
                        i18 += this.l.b(wrVar.a);
                    } else {
                        i19 += this.l.b(wrVar.a);
                    }
                }
            }
            this.a.l = list;
            if (i18 > 0) {
                ca(bv(bS()), i4);
                ud udVar13 = this.a;
                udVar13.h = i18;
                udVar13.c = 0;
                udVar13.b();
                J(wfVar, this.a, woVar, false);
            }
            if (i19 > 0) {
                bY(bv(bR()), i3);
                ud udVar14 = this.a;
                udVar14.h = i19;
                udVar14.c = 0;
                udVar14.b();
                J(wfVar, this.a, woVar, false);
            }
            this.a.l = null;
        }
        if (woVar.g) {
            this.s.d();
        } else {
            uy uyVar = this.l;
            uyVar.b = uyVar.k();
        }
        this.b = this.o;
    }

    @Override // defpackage.vx
    public void p(wo woVar) {
        this.r = null;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.s.d();
    }

    public void s(boolean z) {
        V(null);
        if (this.o == z) {
            return;
        }
        this.o = z;
        be();
    }

    public void w(wo woVar, ud udVar, ts tsVar) {
        int i = udVar.d;
        if (i < 0 || i >= woVar.a()) {
            return;
        }
        tsVar.a(i, Math.max(0, udVar.g));
    }

    public LinearLayoutManager(int i) {
        this.k = 1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = null;
        this.s = new ub();
        this.d = new uc();
        this.e = 2;
        this.f = new int[2];
        ad(i);
        ae(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = null;
        this.s = new ub();
        this.d = new uc();
        this.e = 2;
        this.f = new int[2];
        vw aF = aF(context, attributeSet, i, i2);
        ad(aF.a);
        ae(aF.c);
        s(aF.d);
    }

    @Override // defpackage.vx
    public void Y(RecyclerView recyclerView, wf wfVar) {
    }

    public void l(wf wfVar, wo woVar, ub ubVar, int i) {
    }
}
