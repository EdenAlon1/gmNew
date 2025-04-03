package com.google.android.spannedgridlayoutmanager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dqcp;
import defpackage.dvvt;
import defpackage.eirl;
import defpackage.eirm;
import defpackage.eirn;
import defpackage.eiro;
import defpackage.eirp;
import defpackage.eirq;
import defpackage.eirr;
import defpackage.uw;
import defpackage.ux;
import defpackage.uy;
import defpackage.vx;
import defpackage.vy;
import defpackage.wf;
import defpackage.wo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SpannedGridLayoutManager extends vx {
    private int J;
    private boolean K;
    public eirr a;
    public eirm b;
    int[] c;
    public int d;
    public int e;
    public int f;
    int g;
    final ArrayList h;
    final ArrayList i;
    final ArrayList j;
    final ArrayList k;
    uy l;
    uy m;
    public dqcp n;
    private int o;
    private boolean p;
    private final Rect q;
    private final eirp r;
    private final eirq s;

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int[] iArr;
        this.g = 0;
        this.q = new Rect();
        this.r = new eirp();
        this.s = new eirq(this);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dvvt.a, i, i2);
        int i3 = obtainStyledAttributes.getInt(2, 1);
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        float[] fArr = null;
        if (resourceId != -1) {
            TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
            iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = obtainTypedArray.getDimensionPixelSize(i4, 0);
            }
            obtainTypedArray.recycle();
        } else {
            iArr = null;
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(3, -1);
        if (resourceId2 != -1) {
            TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(resourceId2);
            fArr = new float[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                fArr[i5] = obtainTypedArray2.getFloat(i5, 1.0f);
            }
            obtainTypedArray2.recycle();
        }
        this.b = new eirm(i3, fArr, iArr);
        int i6 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        O(i6);
        bG();
    }

    private final int L() {
        int[] iArr = this.c;
        return iArr[this.b.a] - iArr[0];
    }

    private final eirq M(int i, int i2, boolean z) {
        eirq eirqVar = this.s;
        eirqVar.d = i;
        eirqVar.e = i2;
        eirqVar.f = z;
        eirqVar.g = false;
        eirqVar.c = z ? this.o : this.f;
        eirqVar.h = false;
        return eirqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void N(eirq eirqVar) {
        int i;
        int intValue;
        int i2;
        boolean z = true;
        boolean z2 = true;
        while (true) {
            if (eirqVar.e <= 0 && !eirqVar.h) {
                return;
            }
            int i3 = -1;
            if (eirqVar.f && eirqVar.i.e >= eirqVar.b.a() - 1) {
                return;
            }
            if ((!eirqVar.f && eirqVar.i.d <= 0) || !z2) {
                return;
            }
            eirp eirpVar = this.r;
            int i4 = 0;
            eirpVar.a = 0;
            eirpVar.b = z;
            int a = this.a.a(eirqVar.c);
            int b = this.a.b(eirqVar.c);
            int i5 = b - a;
            int d = this.a.d(a);
            int i6 = 0;
            for (int i7 = a; i7 <= b; i7++) {
                i6 = Math.max(i6, (this.a.d(i7) - d) + this.a.e(i7).b);
            }
            int i8 = i5 + 1;
            X(this.h, i8);
            X(this.j, i8);
            X(this.i, i8);
            X(this.k, i6 + 1);
            View[] viewArr = new View[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + a;
                View c = eirqVar.a.c(i10);
                int i11 = i3;
                eiro eiroVar = (eiro) c.getLayoutParams();
                int i12 = i4;
                eirpVar.b = (!eirpVar.b || eiroVar.c()) ? i12 : z;
                eirn e = this.a.e(i10);
                viewArr[i9] = c;
                int[] iArr = this.c;
                int i13 = e.c;
                int i14 = i8;
                int i15 = i9;
                P(c, eiroVar, iArr[e.d + i13] - iArr[i13], this.J == 1 ? eiroVar.height : eiroVar.width, 0);
                this.i.set(i15, Integer.valueOf(this.l.b(c)));
                this.h.set(i15, Integer.valueOf(i12));
                this.j.set(i15, Integer.valueOf(e.b));
                i9 = i15 + 1;
                i8 = i14;
                i4 = i12;
                i3 = i11;
                viewArr = viewArr;
                z = true;
            }
            View[] viewArr2 = viewArr;
            int i16 = i3;
            int i17 = i4;
            int i18 = i8;
            for (int i19 = i17; i19 < i6; i19++) {
                this.k.set(i19, null);
            }
            int i20 = i17;
            while (i20 < i6) {
                int i21 = i17;
                int i22 = i16;
                int i23 = i22;
                while (i21 < i18) {
                    eirn e2 = this.a.e(i21 + a);
                    Integer num = (Integer) this.j.get(i21);
                    if (num.intValue() > 0) {
                        int intValue2 = ((Integer) this.i.get(i21)).intValue() / num.intValue();
                        int i24 = e2.b;
                        i2 = i20;
                        int i25 = i17;
                        while (i25 < i24) {
                            int i26 = i25;
                            int i27 = (i26 + e2.a) - d;
                            int i28 = i21;
                            if (this.k.get(i27) == null && intValue2 > i23) {
                                i22 = i27;
                                i23 = intValue2;
                            }
                            i25 = i26 + 1;
                            i21 = i28;
                        }
                    } else {
                        i2 = i20;
                    }
                    i21++;
                    i20 = i2;
                }
                int i29 = i20;
                this.k.set(i22, Integer.valueOf(i23));
                int i30 = i22 + d;
                int i31 = i17;
                while (i31 < i18) {
                    eirn e3 = this.a.e(i31 + a);
                    int i32 = e3.a;
                    if (i32 <= i30 && i32 + e3.b > i30) {
                        this.j.set(i31, Integer.valueOf(((Integer) r2.get(i31)).intValue() - 1));
                        ArrayList arrayList = this.i;
                        arrayList.set(i31, Integer.valueOf(Math.max(i17, ((Integer) arrayList.get(i31)).intValue() - i23)));
                        ArrayList arrayList2 = this.h;
                        arrayList2.set(i31, Integer.valueOf(((Integer) arrayList2.get(i31)).intValue() + i23));
                    }
                    i31++;
                    i17 = 0;
                }
                i20 = i29 + 1;
                i17 = 0;
            }
            if (eirqVar.f) {
                int i33 = eirqVar.d;
                int i34 = 0;
                while (i34 < i6) {
                    int intValue3 = ((Integer) this.k.get(i34)).intValue() + i33;
                    this.k.set(i34, Integer.valueOf(i33));
                    i34++;
                    i33 = intValue3;
                }
                this.k.set(i6, Integer.valueOf(i33));
                for (int i35 = 0; i35 < i18; i35++) {
                    eirn e4 = this.a.e(i35 + a);
                    int intValue4 = ((Integer) this.k.get(e4.a - d)).intValue();
                    View view = viewArr2[i35];
                    if (eirqVar.g) {
                        aJ(view);
                    } else {
                        aL(view);
                    }
                    J(e4, view, ((Integer) this.h.get(i35)).intValue(), intValue4, true);
                }
                i = ((Integer) this.k.get(i6)).intValue();
                intValue = eirqVar.d;
            } else {
                int i36 = eirqVar.d;
                while (i6 > 0) {
                    this.k.set(i6, Integer.valueOf(i36));
                    i6--;
                    i36 -= ((Integer) this.k.get(i6)).intValue();
                }
                this.k.set(0, Integer.valueOf(i36));
                while (i5 >= 0) {
                    eirn e5 = this.a.e(i5 + a);
                    int intValue5 = ((Integer) this.k.get((e5.a + e5.b) - d)).intValue();
                    View view2 = viewArr2[i5];
                    if (eirqVar.g) {
                        aK(view2, 0);
                    } else {
                        aM(view2, 0);
                    }
                    J(e5, view2, ((Integer) this.h.get(i5)).intValue(), intValue5, false);
                    i5--;
                }
                i = eirqVar.d;
                intValue = ((Integer) this.k.get(0)).intValue();
            }
            eirpVar.a = i - intValue;
            if (!eirqVar.g) {
                if (a < this.d) {
                    this.d = a;
                    this.f = this.a.d(a);
                }
                if (b > this.e) {
                    this.e = b;
                    this.o = this.a.d(b);
                }
            }
            eirp eirpVar2 = this.r;
            if (eirpVar2.b) {
                eirqVar.e -= eirpVar2.a;
            }
            int i37 = eirpVar2.a;
            if (eirqVar.f) {
                eirqVar.d += i37;
            } else {
                eirqVar.d -= i37;
            }
            z2 = eirqVar.a();
            z = true;
        }
    }

    private final void O(int i) {
        this.J = i;
        if (i == 1) {
            this.l = new ux(this);
            this.m = new uw(this);
        } else {
            this.l = new uw(this);
            this.m = new ux(this);
        }
    }

    private final void P(View view, eiro eiroVar, int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.J == 1) {
            i5 = au(i, 1073741824, 0, eiroVar.width, false);
            i4 = au(this.I, i3, 0, i2, true);
        } else {
            int au = au(i, 1073741824, 0, eiroVar.height, false);
            int au2 = au(this.H, i3, 0, i2, true);
            i4 = au;
            i5 = au2;
        }
        aN(view, this.q);
        view.measure(ac(i5, eiroVar.leftMargin + this.q.left, eiroVar.rightMargin + this.q.right), ac(i4, eiroVar.topMargin + this.q.top, eiroVar.bottomMargin + this.q.bottom));
    }

    private final void Q(int i, wf wfVar) {
        int a = this.a.a(i);
        int b = this.a.b(i);
        for (int i2 = b; i2 >= a; i2--) {
            bc(i2 - this.d, wfVar);
        }
        if (i == this.f) {
            int i3 = b + 1;
            this.d = i3;
            this.f = this.a.d(i3);
        }
        if (i == this.o) {
            int i4 = a - 1;
            this.e = i4;
            this.o = this.a.d(i4);
        }
    }

    private final void S() {
        int a = this.a.a(this.f);
        this.d = a;
        this.o = this.f;
        this.e = a;
    }

    private final void T(wf wfVar, wo woVar) {
        eirq eirqVar = this.s;
        eirqVar.a = wfVar;
        eirqVar.b = woVar;
    }

    private final boolean W() {
        if (at() == 0) {
            return false;
        }
        return this.l.d(aH(this.a.a(this.f) - this.d)) < this.l.j();
    }

    private static final void X(ArrayList arrayList, int i) {
        arrayList.ensureCapacity(i);
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(null);
        }
    }

    private static final int ac(int i, int i2, int i3) {
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
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
    }

    @Override // defpackage.vx
    public final int C(wo woVar) {
        return this.J == 1 ? l() : c();
    }

    @Override // defpackage.vx
    public final int D(wo woVar) {
        return this.J == 1 ? r() : i();
    }

    @Override // defpackage.vx
    public final int E(wo woVar) {
        return this.J == 1 ? s() : k();
    }

    @Override // defpackage.vx
    public final int F(wo woVar) {
        return this.J == 1 ? c() : l();
    }

    @Override // defpackage.vx
    public final int G(wo woVar) {
        return this.J == 1 ? i() : r();
    }

    @Override // defpackage.vx
    public final int H(wo woVar) {
        return this.J == 1 ? k() : s();
    }

    final int I(int i) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        int s = s();
        if (i < 0) {
            int i2 = this.g;
            if (i + i2 < 0) {
                i = -i2;
                this.g += i;
                this.m.n(-i);
                return i;
            }
        }
        if (i > 0) {
            int i3 = this.g;
            if (i + i3 > s) {
                i = s - i3;
            }
        }
        this.g += i;
        this.m.n(-i);
        return i;
    }

    final void J(eirn eirnVar, View view, int i, int i2, boolean z) {
        int i3;
        eiro eiroVar = (eiro) view.getLayoutParams();
        int[] iArr = this.c;
        int i4 = eirnVar.c;
        P(view, eiroVar, iArr[eirnVar.d + i4] - iArr[i4], i, 1073741824);
        int i5 = this.c[eirnVar.c] - this.g;
        int c = this.l.c(view) + i5;
        if (z) {
            i3 = this.l.b(view) + i2;
        } else {
            i3 = i2;
            i2 -= this.l.b(view);
        }
        if (this.J != 1) {
            bz(view, i2 + eiroVar.getMarginStart(), i5 - eiroVar.bottomMargin, i3 + eiroVar.getMarginStart(), c - eiroVar.bottomMargin);
        } else if (aw() == 1) {
            int i6 = this.c[r0.length - 1];
            bz(view, i6 - (c + eiroVar.getMarginEnd()), i2 + eiroVar.topMargin, i6 - (i5 + eiroVar.getMarginEnd()), i3 + eiroVar.topMargin);
        } else {
            bz(view, i5 + eiroVar.getMarginStart(), i2 + eiroVar.topMargin, c + eiroVar.getMarginStart(), i3 + eiroVar.topMargin);
        }
        eiroVar.a = eirnVar.d;
        eiroVar.b = eirnVar.b;
    }

    final boolean K() {
        return at() > 0 && L() > this.m.k();
    }

    @Override // defpackage.vx
    public final View U(int i) {
        int i2 = this.d;
        if (i < i2 || i > this.e) {
            return null;
        }
        return aH(i - i2);
    }

    @Override // defpackage.vx
    public final void ab(int i) {
        if (i >= av()) {
            i = av() - 1;
        }
        this.f = this.a.d(i);
        S();
        this.p = true;
        aY();
        be();
    }

    @Override // defpackage.vx
    public boolean af() {
        if (this.J == 1) {
            return K();
        }
        return true;
    }

    @Override // defpackage.vx
    public final boolean ag() {
        if (this.J == 1) {
            return true;
        }
        return K();
    }

    @Override // defpackage.vx
    public final void ar(RecyclerView recyclerView, int i) {
        if (i >= av()) {
            i = av() - 1;
        }
        eirl eirlVar = new eirl(this, recyclerView.getContext());
        eirlVar.g = i;
        bl(eirlVar);
    }

    @Override // defpackage.vx
    public final void bC() {
        aY();
        this.a = null;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.o = 0;
        this.p = false;
        this.g = 0;
    }

    final int c() {
        int i = 0;
        if (this.K && W()) {
            int i2 = this.f;
            i = (this.a.b(i2) - this.a.a(i2)) + 1;
        }
        return at() - i;
    }

    @Override // defpackage.vx
    public final vy cd(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new eiro((ViewGroup.MarginLayoutParams) layoutParams) : new eiro(layoutParams);
    }

    @Override // defpackage.vx
    public final boolean cj() {
        return true;
    }

    @Override // defpackage.vx
    public final int d(int i, wf wfVar, wo woVar) {
        return this.J == 1 ? I(i) : w(i, wfVar, woVar);
    }

    @Override // defpackage.vx
    public final int e(int i, wf wfVar, wo woVar) {
        return this.J == 1 ? w(i, wfVar, woVar) : I(i);
    }

    @Override // defpackage.vx
    public final vy f() {
        return new eiro();
    }

    @Override // defpackage.vx
    public final vy h(Context context, AttributeSet attributeSet) {
        return new eiro(context, attributeSet);
    }

    final int i() {
        if (at() == 0) {
            return 0;
        }
        if (this.K && W()) {
            int c = this.a.c(this.f);
            if (this.a.f(c)) {
                return this.a.a(c);
            }
        }
        return this.d;
    }

    final int k() {
        eirr eirrVar = this.a;
        if (eirrVar == null) {
            return 0;
        }
        return eirrVar.a;
    }

    final int l() {
        return this.m.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    @Override // defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(defpackage.wf r11, defpackage.wo r12) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.o(wf, wo):void");
    }

    final int r() {
        if (at() == 0) {
            return 0;
        }
        return this.g;
    }

    final int s() {
        if (at() == 0) {
            return 0;
        }
        return L() - this.m.k();
    }

    @Override // defpackage.vx
    public final boolean t(vy vyVar) {
        return vyVar instanceof eiro;
    }

    final int w(int i, wf wfVar, wo woVar) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        T(wfVar, woVar);
        int d = this.l.d(aH(0));
        if (i < 0) {
            if (this.f == 0) {
                i = Math.max(i, -(this.l.j() - d));
            }
            int i2 = d - i;
            if (i2 > 0) {
                eirq M = M(d, i2, false);
                if (M.a()) {
                    N(M);
                    i = Math.max(i, M.e + i);
                }
            }
            int d2 = this.l.d(aH(this.a.a(this.o) - this.d));
            while (d2 - i > this.l.k()) {
                Q(this.o, wfVar);
                d2 = this.l.d(aH(this.a.a(this.o) - this.d));
            }
        } else {
            int a = this.l.a(aH(at() - 1));
            if (this.e == av() - 1) {
                i = Math.min(i, Math.max(a - this.l.f(), 0));
            }
            int i3 = a - i;
            if (i3 < this.l.k()) {
                eirq M2 = M(this.l.a(aH(at() - 1)), this.l.k() - i3, true);
                if (M2.a()) {
                    N(M2);
                    i = Math.min(i, i - M2.e);
                }
            }
            int a2 = this.l.a(aH(this.a.b(this.f) - this.d));
            while (a2 - i < 0) {
                Q(this.f, wfVar);
                a2 = this.l.a(aH(this.a.b(this.f) - this.d));
            }
        }
        this.l.n(-i);
        return i;
    }

    public SpannedGridLayoutManager(dqcp dqcpVar, boolean z) {
        this.g = 0;
        this.q = new Rect();
        this.r = new eirp();
        this.s = new eirq(this);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.n = dqcpVar;
        this.b = new eirm();
        bG();
        O(1);
        this.K = z;
    }
}
