package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import defpackage.deua;
import defpackage.deub;
import defpackage.deuc;
import defpackage.deud;
import defpackage.deuf;
import defpackage.deuh;
import defpackage.deui;
import defpackage.deuk;
import defpackage.ug;
import defpackage.uw;
import defpackage.ux;
import defpackage.uy;
import defpackage.vw;
import defpackage.vx;
import defpackage.vy;
import defpackage.wf;
import defpackage.wm;
import defpackage.wo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FlexboxLayoutManager extends vx implements deua, wm {
    private static final Rect h = new Rect();
    private final Context L;
    private View M;
    public int a;
    public int b;
    public boolean c;
    public uy f;
    public uy g;
    private int i;
    private boolean k;
    private wf l;
    private wo m;
    private deui n;
    private deuk p;
    private final int j = -1;
    public List d = new ArrayList();
    public final deud e = new deud(this);
    private final deuf o = new deuf(this);
    private int q = -1;
    private int r = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;
    private int J = Integer.MIN_VALUE;
    private final SparseArray K = new SparseArray();
    private int N = -1;
    private final deuc O = new deuc();

    public FlexboxLayoutManager(Context context) {
        K(0);
        M();
        L();
        this.L = context;
    }

    private final int N(wo woVar) {
        if (at() == 0) {
            return 0;
        }
        int a = woVar.a();
        bN();
        View ad = ad(a);
        View ai = ai(a);
        if (woVar.a() == 0 || ad == null || ai == null) {
            return 0;
        }
        return Math.min(this.f.k(), this.f.a(ai) - this.f.d(ad));
    }

    private final int O(wo woVar) {
        if (at() == 0) {
            return 0;
        }
        int a = woVar.a();
        View ad = ad(a);
        View ai = ai(a);
        if (woVar.a() == 0 || ad == null || ai == null) {
            return 0;
        }
        int bv = bv(ad);
        int bv2 = bv(ai);
        int a2 = this.f.a(ai) - this.f.d(ad);
        deud deudVar = this.e;
        int abs = Math.abs(a2);
        int i = deudVar.a[bv];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (abs / ((this.e.a[bv2] - i) + 1))) + (this.f.j() - this.f.d(ad)));
    }

    private final int P(wo woVar) {
        if (at() != 0) {
            int a = woVar.a();
            View ad = ad(a);
            View ai = ai(a);
            if (woVar.a() != 0 && ad != null && ai != null) {
                View bW = bW(0, at());
                int bv = bW == null ? -1 : bv(bW);
                return (int) ((Math.abs(this.f.a(ai) - this.f.d(ad)) / ((w() - bv) + 1)) * woVar.a());
            }
        }
        return 0;
    }

    private final int S(wf wfVar, wo woVar, deui deuiVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = deuiVar.f;
        if (i10 != Integer.MIN_VALUE) {
            int i11 = deuiVar.a;
            if (i11 < 0) {
                deuiVar.f = i10 + i11;
            }
            bO(wfVar, deuiVar);
        }
        int i12 = deuiVar.a;
        boolean q = q();
        int i13 = i12;
        int i14 = 0;
        while (true) {
            if (i13 <= 0 && !this.n.b) {
                break;
            }
            List list = this.d;
            int i15 = deuiVar.d;
            if (i15 < 0 || i15 >= woVar.a() || (i = deuiVar.c) < 0 || i >= list.size()) {
                break;
            }
            deub deubVar = (deub) this.d.get(deuiVar.c);
            deuiVar.d = deubVar.k;
            if (q()) {
                int aB = aB();
                int aC = aC();
                int i16 = this.H;
                int i17 = deuiVar.e;
                if (deuiVar.i == -1) {
                    i17 -= deubVar.c;
                }
                int i18 = deuiVar.d;
                float f = this.o.d;
                float max = Math.max(0.0f, 0.0f);
                int i19 = deubVar.d;
                float f2 = (i16 - aC) - f;
                float f3 = aB - f;
                int i20 = i18;
                int i21 = 0;
                while (i20 < i18 + i19) {
                    int i22 = i19;
                    View J = J(i20);
                    int i23 = i12;
                    int i24 = i18;
                    if (deuiVar.i == 1) {
                        aN(J, h);
                        aL(J);
                    } else {
                        aN(J, h);
                        aM(J, i21);
                        i21++;
                    }
                    int i25 = i21;
                    boolean z2 = q;
                    long j = this.e.b[i20];
                    int i26 = (int) j;
                    int k = deud.k(j);
                    if (bV(J, i26, k, (deuh) J.getLayoutParams())) {
                        J.measure(i26, k);
                    }
                    float bu = f3 + r5.leftMargin + bu(J);
                    float bw = f2 - (r5.rightMargin + bw(J));
                    int bx = bx(J) + i17;
                    if (this.c) {
                        i8 = i20;
                        i9 = i22;
                        i7 = i25;
                        this.e.f(J, deubVar, Math.round(bw) - J.getMeasuredWidth(), bx, Math.round(bw), bx + J.getMeasuredHeight());
                    } else {
                        i7 = i25;
                        i8 = i20;
                        i9 = i22;
                        this.e.f(J, deubVar, Math.round(bu), bx, Math.round(bu) + J.getMeasuredWidth(), bx + J.getMeasuredHeight());
                    }
                    f3 = bu + J.getMeasuredWidth() + r5.rightMargin + bw(J) + max;
                    f2 = bw - (((J.getMeasuredWidth() + r5.leftMargin) + bu(J)) + max);
                    i20 = i8 + 1;
                    i12 = i23;
                    i18 = i24;
                    q = z2;
                    i19 = i9;
                    i21 = i7;
                }
                i2 = i12;
                z = q;
                deuiVar.c += this.n.i;
                i4 = deubVar.c;
            } else {
                i2 = i12;
                z = q;
                int aE = aE();
                int az = az();
                int i27 = this.I;
                int i28 = deuiVar.e;
                if (deuiVar.i == -1) {
                    int i29 = deubVar.c;
                    i3 = i28 + i29;
                    i28 -= i29;
                } else {
                    i3 = i28;
                }
                int i30 = deuiVar.d;
                int i31 = i27 - az;
                float f4 = this.o.d;
                float max2 = Math.max(0.0f, 0.0f);
                int i32 = deubVar.d;
                float f5 = i31 - f4;
                float f6 = aE - f4;
                int i33 = i30;
                int i34 = 0;
                while (i33 < i30 + i32) {
                    int i35 = i32;
                    View J2 = J(i33);
                    float f7 = f6;
                    long j2 = this.e.b[i33];
                    int i36 = (int) j2;
                    int k2 = deud.k(j2);
                    if (bV(J2, i36, k2, (deuh) J2.getLayoutParams())) {
                        J2.measure(i36, k2);
                    }
                    float bx2 = f7 + r4.topMargin + bx(J2);
                    float br = f5 - (r4.rightMargin + br(J2));
                    if (deuiVar.i == 1) {
                        aN(J2, h);
                        aL(J2);
                    } else {
                        aN(J2, h);
                        aM(J2, i34);
                        i34++;
                    }
                    int i37 = i34;
                    int bu2 = bu(J2) + i28;
                    int bw2 = i3 - bw(J2);
                    if (!this.c) {
                        i5 = i30;
                        i6 = i35;
                        if (this.k) {
                            this.e.g(J2, deubVar, false, bu2, Math.round(br) - J2.getMeasuredHeight(), bu2 + J2.getMeasuredWidth(), Math.round(br));
                        } else {
                            this.e.g(J2, deubVar, false, bu2, Math.round(bx2), bu2 + J2.getMeasuredWidth(), Math.round(bx2) + J2.getMeasuredHeight());
                        }
                    } else if (this.k) {
                        i6 = i35;
                        i5 = i30;
                        this.e.g(J2, deubVar, true, bw2 - J2.getMeasuredWidth(), Math.round(br) - J2.getMeasuredHeight(), bw2, Math.round(br));
                    } else {
                        i5 = i30;
                        i6 = i35;
                        this.e.g(J2, deubVar, true, bw2 - J2.getMeasuredWidth(), Math.round(bx2), bw2, Math.round(bx2) + J2.getMeasuredHeight());
                    }
                    f5 = br - (((J2.getMeasuredHeight() + r4.bottomMargin) + bx(J2)) + max2);
                    i33++;
                    f6 = bx2 + J2.getMeasuredHeight() + r4.topMargin + br(J2) + max2;
                    i34 = i37;
                    i32 = i6;
                    i30 = i5;
                }
                deuiVar.c += this.n.i;
                i4 = deubVar.c;
            }
            i14 += i4;
            if (z || !this.c) {
                deuiVar.e += deubVar.c * deuiVar.i;
            } else {
                deuiVar.e -= deubVar.c * deuiVar.i;
            }
            i13 -= deubVar.c;
            i12 = i2;
            q = z;
        }
        int i38 = i12;
        int i39 = deuiVar.a - i14;
        deuiVar.a = i39;
        int i40 = deuiVar.f;
        if (i40 != Integer.MIN_VALUE) {
            int i41 = i40 + i14;
            deuiVar.f = i41;
            if (i39 < 0) {
                deuiVar.f = i41 + i39;
            }
            bO(wfVar, deuiVar);
        }
        return i38 - deuiVar.a;
    }

    private final int T(int i, wf wfVar, wo woVar, boolean z) {
        int i2;
        int f;
        if (q() || !this.c) {
            int f2 = this.f.f() - i;
            if (f2 <= 0) {
                return 0;
            }
            i2 = -X(-f2, wfVar, woVar);
        } else {
            int j = i - this.f.j();
            if (j <= 0) {
                return 0;
            }
            i2 = X(j, wfVar, woVar);
        }
        int i3 = i + i2;
        if (!z || (f = this.f.f() - i3) <= 0) {
            return i2;
        }
        this.f.n(f);
        return f + i2;
    }

    private final int W(int i, wf wfVar, wo woVar, boolean z) {
        int i2;
        int j;
        if (q() || !this.c) {
            int j2 = i - this.f.j();
            if (j2 <= 0) {
                return 0;
            }
            i2 = -X(j2, wfVar, woVar);
        } else {
            int f = this.f.f() - i;
            if (f <= 0) {
                return 0;
            }
            i2 = X(-f, wfVar, woVar);
        }
        int i3 = i + i2;
        if (!z || (j = i3 - this.f.j()) <= 0) {
            return i2;
        }
        this.f.n(-j);
        return i2 - j;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int X(int r20, defpackage.wf r21, defpackage.wo r22) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.X(int, wf, wo):int");
    }

    private final int ac(int i) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        bN();
        boolean q = q();
        int width = q ? this.M.getWidth() : this.M.getHeight();
        int i2 = q ? this.H : this.I;
        if (aw() == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + this.o.d) - width, abs);
            }
            int i3 = this.o.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - this.o.d) - width, i);
            }
            int i4 = this.o.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    private final View ad(int i) {
        View ao = ao(0, at(), i);
        if (ao == null) {
            return null;
        }
        deud deudVar = this.e;
        int i2 = deudVar.a[bv(ao)];
        if (i2 != -1) {
            return ae(ao, (deub) this.d.get(i2));
        }
        return null;
    }

    private final View ae(View view, deub deubVar) {
        boolean q = q();
        int i = deubVar.d;
        for (int i2 = 1; i2 < i; i2++) {
            View aH = aH(i2);
            if (aH != null && aH.getVisibility() != 8) {
                if (!this.c || q) {
                    if (this.f.d(view) <= this.f.d(aH)) {
                    }
                    view = aH;
                } else {
                    if (this.f.a(view) >= this.f.a(aH)) {
                    }
                    view = aH;
                }
            }
        }
        return view;
    }

    private final View ai(int i) {
        View ao = ao(at() - 1, -1, i);
        if (ao == null) {
            return null;
        }
        return ak(ao, (deub) this.d.get(this.e.a[bv(ao)]));
    }

    private final View ak(View view, deub deubVar) {
        boolean q = q();
        int at = at() - deubVar.d;
        for (int at2 = at() - 2; at2 > at - 1; at2--) {
            View aH = aH(at2);
            if (aH != null && aH.getVisibility() != 8) {
                if (!this.c || q) {
                    if (this.f.a(view) >= this.f.a(aH)) {
                    }
                    view = aH;
                } else {
                    if (this.f.d(view) <= this.f.d(aH)) {
                    }
                    view = aH;
                }
            }
        }
        return view;
    }

    private final View ao(int i, int i2, int i3) {
        int bv;
        bN();
        bM();
        int j = this.f.j();
        int f = this.f.f();
        View view = null;
        int i4 = i;
        View view2 = null;
        while (i4 != i2) {
            View aH = aH(i4);
            if (aH != null && (bv = bv(aH)) >= 0 && bv < i3) {
                if (((vy) aH.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = aH;
                    }
                } else {
                    if (this.f.d(aH) >= j && this.f.a(aH) <= f) {
                        return aH;
                    }
                    if (view == null) {
                        view = aH;
                    }
                }
            }
            i4 += i2 > i ? 1 : -1;
        }
        return view != null ? view : view2;
    }

    private final View ap() {
        return aH(0);
    }

    private final void aq() {
        this.d.clear();
        this.o.b();
        this.o.d = 0;
    }

    private final void bM() {
        if (this.n == null) {
            this.n = new deui();
        }
    }

    private final void bN() {
        if (this.f != null) {
            return;
        }
        if (q()) {
            if (this.b == 0) {
                this.f = new uw(this);
                this.g = new ux(this);
                return;
            } else {
                this.f = new ux(this);
                this.g = new uw(this);
                return;
            }
        }
        if (this.b == 0) {
            this.f = new ux(this);
            this.g = new uw(this);
        } else {
            this.f = new uw(this);
            this.g = new ux(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bO(defpackage.wf r12, defpackage.deui r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.bO(wf, deui):void");
    }

    private final void bP(wf wfVar, int i, int i2) {
        while (i2 >= i) {
            bc(i2, wfVar);
            i2--;
        }
    }

    private final void bQ() {
        int i = q() ? this.G : this.F;
        deui deuiVar = this.n;
        boolean z = true;
        if (i != 0 && i != Integer.MIN_VALUE) {
            z = false;
        }
        deuiVar.b = z;
    }

    private final void bR(int i) {
        if (i >= w()) {
            return;
        }
        int at = at();
        this.e.d(at);
        this.e.e(at);
        this.e.c(at);
        if (i < this.e.a.length) {
            this.N = i;
            View ap = ap();
            if (ap != null) {
                this.q = bv(ap);
                if (q() || !this.c) {
                    this.r = this.f.d(ap) - this.f.j();
                } else {
                    this.r = this.f.a(ap) + this.f.g();
                }
            }
        }
    }

    private final void bS(deuf deufVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            bQ();
        } else {
            this.n.b = false;
        }
        if (q() || !this.c) {
            this.n.a = this.f.f() - deufVar.c;
        } else {
            this.n.a = deufVar.c - aC();
        }
        deui deuiVar = this.n;
        deuiVar.d = deufVar.a;
        deuiVar.h = 1;
        deui deuiVar2 = this.n;
        deuiVar2.i = 1;
        deuiVar2.e = deufVar.c;
        deuiVar2.f = Integer.MIN_VALUE;
        deuiVar2.c = deufVar.b;
        if (!z || this.d.size() <= 1 || (i = deufVar.b) < 0 || i >= this.d.size() - 1) {
            return;
        }
        deub deubVar = (deub) this.d.get(deufVar.b);
        deui deuiVar3 = this.n;
        deuiVar3.c++;
        deuiVar3.d += deubVar.d;
    }

    private final void bT(deuf deufVar, boolean z, boolean z2) {
        if (z2) {
            bQ();
        } else {
            this.n.b = false;
        }
        if (q() || !this.c) {
            this.n.a = deufVar.c - this.f.j();
        } else {
            this.n.a = (this.M.getWidth() - deufVar.c) - this.f.j();
        }
        deui deuiVar = this.n;
        deuiVar.d = deufVar.a;
        deuiVar.h = 1;
        deui deuiVar2 = this.n;
        deuiVar2.i = -1;
        deuiVar2.e = deufVar.c;
        deuiVar2.f = Integer.MIN_VALUE;
        deuiVar2.c = deufVar.b;
        if (!z || deufVar.b <= 0) {
            return;
        }
        int size = this.d.size();
        int i = deufVar.b;
        if (size > i) {
            deub deubVar = (deub) this.d.get(i);
            r4.c--;
            this.n.d -= deubVar.d;
        }
    }

    private static boolean bU(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private final boolean bV(View view, int i, int i2, vy vyVar) {
        return (!view.isLayoutRequested() && this.B && bU(view.getWidth(), i, vyVar.width) && bU(view.getHeight(), i2, vyVar.height)) ? false : true;
    }

    private final View bW(int i, int i2) {
        int i3 = i;
        while (i3 != i2) {
            View aH = aH(i3);
            int aB = aB();
            int aE = aE();
            int aC = this.H - aC();
            int az = this.I - az();
            int bI = bI(aH) - ((vy) aH.getLayoutParams()).leftMargin;
            int bK = bK(aH) - ((vy) aH.getLayoutParams()).topMargin;
            int bJ = bJ(aH) + ((vy) aH.getLayoutParams()).rightMargin;
            int bH = bH(aH) + ((vy) aH.getLayoutParams()).bottomMargin;
            int i4 = 1;
            boolean z = bI >= aC || bJ >= aB;
            boolean z2 = bK >= az || bH >= aE;
            if (z && z2) {
                return aH;
            }
            if (i2 <= i) {
                i4 = -1;
            }
            i3 += i4;
        }
        return null;
    }

    @Override // defpackage.vx
    public final void A(int i, int i2) {
        bR(i);
    }

    @Override // defpackage.vx
    public final void B(int i, int i2) {
        bD(i);
        bR(i);
    }

    @Override // defpackage.vx
    public final int C(wo woVar) {
        return N(woVar);
    }

    @Override // defpackage.vx
    public final int D(wo woVar) {
        return O(woVar);
    }

    @Override // defpackage.vx
    public final int E(wo woVar) {
        return P(woVar);
    }

    @Override // defpackage.vx
    public final int F(wo woVar) {
        return N(woVar);
    }

    @Override // defpackage.vx
    public final int G(wo woVar) {
        return O(woVar);
    }

    @Override // defpackage.vx
    public final int H(wo woVar) {
        return P(woVar);
    }

    public final int I(int i) {
        return this.e.a[i];
    }

    public final View J(int i) {
        View view = (View) this.K.get(i);
        return view != null ? view : this.l.c(i);
    }

    public final void K(int i) {
        if (this.a != i) {
            aY();
            this.a = i;
            this.f = null;
            this.g = null;
            aq();
            be();
        }
    }

    public final void L() {
        if (this.i != 4) {
            aY();
            aq();
            this.i = 4;
            be();
        }
    }

    public final void M() {
        if (this.b != 1) {
            aY();
            aq();
            this.b = 1;
            this.f = null;
            this.g = null;
            be();
        }
    }

    @Override // defpackage.wm
    public final PointF Q(int i) {
        View aH;
        if (at() == 0 || (aH = aH(0)) == null) {
            return null;
        }
        float f = i < bv(aH) ? -1 : 1;
        return q() ? new PointF(0.0f, f) : new PointF(f, 0.0f);
    }

    @Override // defpackage.vx
    public final Parcelable R() {
        deuk deukVar = this.p;
        if (deukVar != null) {
            return new deuk(deukVar);
        }
        deuk deukVar2 = new deuk();
        if (at() <= 0) {
            deukVar2.a();
            return deukVar2;
        }
        View ap = ap();
        deukVar2.a = bv(ap);
        deukVar2.b = this.f.d(ap) - this.f.j();
        return deukVar2;
    }

    @Override // defpackage.deua
    public final int a() {
        return this.i;
    }

    @Override // defpackage.vx
    public final void aV(RecyclerView recyclerView) {
        this.M = (View) recyclerView.getParent();
    }

    @Override // defpackage.vx
    public final void aa(Parcelable parcelable) {
        if (parcelable instanceof deuk) {
            this.p = (deuk) parcelable;
            be();
        }
    }

    @Override // defpackage.vx
    public final void ab(int i) {
        this.q = i;
        this.r = Integer.MIN_VALUE;
        deuk deukVar = this.p;
        if (deukVar != null) {
            deukVar.a();
        }
        be();
    }

    @Override // defpackage.vx
    public final boolean af() {
        if (this.b == 0) {
            return q();
        }
        if (!q()) {
            return true;
        }
        int i = this.H;
        View view = this.M;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // defpackage.vx
    public final boolean ag() {
        if (this.b == 0) {
            return !q();
        }
        if (!q()) {
            int i = this.I;
            View view = this.M;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vx
    public final boolean ah() {
        return true;
    }

    @Override // defpackage.vx
    public final void ar(RecyclerView recyclerView, int i) {
        ug ugVar = new ug(recyclerView.getContext());
        ugVar.g = i;
        bl(ugVar);
    }

    @Override // defpackage.deua
    public final int b(View view) {
        int bu;
        int bw;
        if (q()) {
            bu = bx(view);
            bw = br(view);
        } else {
            bu = bu(view);
            bw = bw(view);
        }
        return bu + bw;
    }

    @Override // defpackage.vx
    public final void bC() {
        aY();
    }

    @Override // defpackage.vx
    public final void bD(int i) {
        bR(i);
    }

    @Override // defpackage.deua
    public final int c() {
        return this.a;
    }

    @Override // defpackage.vx
    public final int d(int i, wf wfVar, wo woVar) {
        if (!q() || this.b == 0) {
            int X = X(i, wfVar, woVar);
            this.K.clear();
            return X;
        }
        int ac = ac(i);
        this.o.d += ac;
        this.g.n(-ac);
        return ac;
    }

    @Override // defpackage.vx
    public final int e(int i, wf wfVar, wo woVar) {
        if (q() || (this.b == 0 && !q())) {
            int X = X(i, wfVar, woVar);
            this.K.clear();
            return X;
        }
        int ac = ac(i);
        this.o.d += ac;
        this.g.n(-ac);
        return ac;
    }

    @Override // defpackage.vx
    public final vy f() {
        return new deuh();
    }

    @Override // defpackage.deua
    public final int g() {
        return this.m.a();
    }

    @Override // defpackage.vx
    public final vy h(Context context, AttributeSet attributeSet) {
        return new deuh(context, attributeSet);
    }

    @Override // defpackage.deua
    public final int i() {
        return this.b;
    }

    @Override // defpackage.deua
    public final int j() {
        if (this.d.size() == 0) {
            return 0;
        }
        int size = this.d.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((deub) this.d.get(i2)).a);
        }
        return i;
    }

    @Override // defpackage.deua
    public final int k() {
        return this.j;
    }

    @Override // defpackage.deua
    public final View l(int i) {
        return J(i);
    }

    @Override // defpackage.deua
    public final List m() {
        return this.d;
    }

    @Override // defpackage.deua
    public final void n(int i, View view) {
        this.K.put(i, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x002e, code lost:
    
        if (r5 == 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0038, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0036, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0031, code lost:
    
        if (r5 != 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0034, code lost:
    
        if (r5 == 1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021c  */
    @Override // defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(defpackage.wf r23, defpackage.wo r24) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.o(wf, wo):void");
    }

    @Override // defpackage.vx
    public final void p(wo woVar) {
        this.p = null;
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.N = -1;
        this.o.b();
        this.K.clear();
    }

    @Override // defpackage.deua
    public final boolean q() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // defpackage.deua
    public final int r(int i, int i2) {
        return au(this.I, this.G, i, i2, ag());
    }

    @Override // defpackage.deua
    public final int s(int i, int i2) {
        return au(this.H, this.F, i, i2, af());
    }

    @Override // defpackage.vx
    public final boolean t(vy vyVar) {
        return vyVar instanceof deuh;
    }

    @Override // defpackage.deua
    public final int u(View view) {
        int bx;
        int br;
        if (q()) {
            bx = bu(view);
            br = bw(view);
        } else {
            bx = bx(view);
            br = br(view);
        }
        return bx + br;
    }

    @Override // defpackage.deua
    public final void v(View view, deub deubVar) {
        aN(view, h);
        if (q()) {
            int bu = bu(view) + bw(view);
            deubVar.a += bu;
            deubVar.b += bu;
        } else {
            int bx = bx(view) + br(view);
            deubVar.a += bx;
            deubVar.b += bx;
        }
    }

    public final int w() {
        View bW = bW(at() - 1, -1);
        if (bW == null) {
            return -1;
        }
        return bv(bW);
    }

    @Override // defpackage.vx
    public final void x(int i, int i2) {
        bR(i);
    }

    @Override // defpackage.vx
    public final void z(int i, int i2) {
        bR(Math.min(i, i2));
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        vw aF = aF(context, attributeSet, i, i2);
        int i3 = aF.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (aF.c) {
                    K(3);
                } else {
                    K(2);
                }
            }
        } else if (aF.c) {
            K(1);
        } else {
            K(0);
        }
        M();
        L();
        this.L = context;
    }

    @Override // defpackage.vx
    public final void Y(RecyclerView recyclerView, wf wfVar) {
    }
}
