package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.aak;
import defpackage.egyv;
import defpackage.ehaw;
import defpackage.ehax;
import defpackage.ehay;
import defpackage.ehba;
import defpackage.ehbb;
import defpackage.ehbc;
import defpackage.ehbe;
import defpackage.ehbg;
import defpackage.ehbq;
import defpackage.ehjl;
import defpackage.ehjr;
import defpackage.ehjs;
import defpackage.ehmq;
import defpackage.ehop;
import defpackage.ehow;
import defpackage.kkt;
import defpackage.kkw;
import defpackage.kvo;
import defpackage.kxr;
import defpackage.laa;
import defpackage.lab;
import defpackage.ljm;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class BottomSheetBehavior<V extends View> extends kkt<V> implements ehjl {
    public int A;
    public WeakReference B;
    public WeakReference C;
    public final ArrayList D;
    ehjs E;
    public int F;
    public boolean G;
    final SparseIntArray H;
    private int I;
    private float J;
    private int K;
    private int L;
    private ColorStateList M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private ehow S;
    private boolean T;
    private final ehbg U;
    private ValueAnimator V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    public boolean a;
    private boolean aa;
    private final float ab;
    private int ac;
    private VelocityTracker ad;
    private int ae;
    private Map af;
    private final laa ag;
    public int b;
    public int c;
    public boolean d;
    public ehop e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    int o;
    public int p;
    public int q;
    float r;
    public int s;
    float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public lab y;
    int z;

    public BottomSheetBehavior() {
        this.I = 0;
        this.a = true;
        this.N = -1;
        this.O = -1;
        this.U = new ehbg(this);
        this.r = 0.5f;
        this.t = -1.0f;
        this.w = true;
        this.W = true;
        this.x = 4;
        this.ab = 0.1f;
        this.D = new ArrayList();
        this.ae = -1;
        this.H = new SparseIntArray();
        this.ag = new ehba(this);
    }

    private final float L() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.e == null || (weakReference = this.B) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.B.get();
        if (!V() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float w = this.e.w();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float X = X(w, roundedCorner);
        float x = this.e.x();
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(X, X(x, roundedCorner2));
    }

    private final int M() {
        int i;
        return this.d ? Math.min(Math.max(this.K, this.A - ((this.z * 9) / 16)), this.ac) + this.m : (this.P || this.g || (i = this.f) <= 0) ? this.c + this.m : Math.max(this.c, i + this.L);
    }

    private final int N(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.q : this.A : this.s : t();
    }

    private final void O() {
        int M = M();
        if (this.a) {
            this.s = Math.max(this.A - M, this.p);
        } else {
            this.s = this.A - M;
        }
    }

    private final void P() {
        this.q = (int) (this.A * (1.0f - this.r));
    }

    private final void Q(View view, kxr kxrVar, int i) {
        kvo.y(view, kxrVar, new ehbb(this, i));
    }

    private final void R() {
        this.F = -1;
        this.ae = -1;
        VelocityTracker velocityTracker = this.ad;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ad = null;
        }
    }

    private final void S() {
        View view;
        int i;
        WeakReference weakReference = this.B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        kvo.n(view, 524288);
        kvo.n(view, 262144);
        kvo.n(view, 1048576);
        int i2 = this.H.get(0, -1);
        if (i2 != -1) {
            kvo.n(view, i2);
            this.H.delete(0);
        }
        if (!this.a && this.x != 6) {
            SparseIntArray sparseIntArray = this.H;
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            ehbb ehbbVar = new ehbb(this, 6);
            List i3 = kvo.i(view);
            int i4 = 0;
            while (true) {
                if (i4 >= i3.size()) {
                    int i5 = -1;
                    for (int i6 = 0; i6 < 32 && i5 == -1; i6++) {
                        i5 = kvo.a[i6];
                        boolean z = true;
                        for (int i7 = 0; i7 < i3.size(); i7++) {
                            z &= ((kxr) i3.get(i7)).a() != i5;
                        }
                        if (true != z) {
                            i5 = -1;
                        }
                    }
                    i = i5;
                } else {
                    if (TextUtils.equals(string, ((kxr) i3.get(i4)).b())) {
                        i = ((kxr) i3.get(i4)).a();
                        break;
                    }
                    i4++;
                }
            }
            if (i != -1) {
                kvo.j(view, new kxr(null, i, string, ehbbVar, null));
            }
            sparseIntArray.put(0, i);
        }
        if (this.u && this.x != 5) {
            Q(view, kxr.h, 5);
        }
        int i8 = this.x;
        if (i8 == 3) {
            Q(view, kxr.g, true == this.a ? 4 : 6);
            return;
        }
        if (i8 == 4) {
            Q(view, kxr.f, true == this.a ? 3 : 6);
        } else {
            if (i8 != 6) {
                return;
            }
            Q(view, kxr.g, 4);
            Q(view, kxr.f, 3);
        }
    }

    private final void T(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.x == 3 && (this.R || V());
        if (this.T == z2 || this.e == null) {
            return;
        }
        this.T = z2;
        if (!z || (valueAnimator = this.V) == null) {
            ValueAnimator valueAnimator2 = this.V;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.V.cancel();
            }
            this.e.P(this.T ? L() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.V.reverse();
        } else {
            this.V.setFloatValues(this.e.q.l, z2 ? L() : 1.0f);
            this.V.start();
        }
    }

    private final void U(boolean z) {
        WeakReference weakReference = this.B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.af != null) {
                    return;
                } else {
                    this.af = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.B.get() && z) {
                    this.af.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.af = null;
        }
    }

    private final boolean V() {
        WeakReference weakReference = this.B;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.B.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean W() {
        if (this.y != null) {
            return this.w || this.x == 1;
        }
        return false;
    }

    private static final float X(float f, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f2 = radius;
            if (f2 > 0.0f && f > 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    private static final int Y(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static BottomSheetBehavior v(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof kkw)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        kkt kktVar = ((kkw) layoutParams).a;
        if (kktVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) kktVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final void A(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.o = i;
        T(this.x, true);
    }

    public final void B(boolean z) {
        if (this.u != z) {
            this.u = z;
            if (!z && this.x == 5) {
                D(4);
            }
            S();
        }
    }

    public final void C(int i) {
        if (i == -1) {
            if (this.d) {
                return;
            } else {
                this.d = true;
            }
        } else {
            if (!this.d && this.c == i) {
                return;
            }
            this.d = false;
            this.c = Math.max(0, i);
        }
        K();
    }

    public final void D(int i) {
        if (!this.u && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && N(6) <= this.p) ? 3 : i;
        WeakReference weakReference = this.B;
        if (weakReference == null || weakReference.get() == null) {
            E(i);
            return;
        }
        View view = (View) this.B.get();
        ehaw ehawVar = new ehaw(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(ehawVar);
        } else {
            ehawVar.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r8 == 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(int r8) {
        /*
            r7 = this;
            int r0 = r7.x
            if (r0 != r8) goto L5
            goto L54
        L5:
            r7.x = r8
            r0 = 6
            r1 = 3
            r2 = 5
            r3 = 4
            if (r8 == r3) goto L18
            if (r8 == r1) goto L18
            if (r8 == r0) goto L18
            boolean r4 = r7.u
            if (r4 == 0) goto L18
            if (r8 != r2) goto L18
            r8 = r2
        L18:
            java.lang.ref.WeakReference r4 = r7.B
            if (r4 == 0) goto L54
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L54
            r5 = 0
            r6 = 1
            if (r8 != r1) goto L2c
            r7.U(r6)
            goto L38
        L2c:
            if (r8 == r0) goto L33
            if (r8 == r2) goto L33
            if (r8 != r3) goto L38
            goto L34
        L33:
            r3 = r8
        L34:
            r7.U(r5)
            r8 = r3
        L38:
            r7.T(r8, r6)
        L3b:
            java.util.ArrayList r0 = r7.D
            int r0 = r0.size()
            if (r5 >= r0) goto L51
            java.util.ArrayList r0 = r7.D
            java.lang.Object r0 = r0.get(r5)
            ehbc r0 = (defpackage.ehbc) r0
            r0.b(r4, r8)
            int r5 = r5 + 1
            goto L3b
        L51:
            r7.S()
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(int):void");
    }

    @Override // defpackage.ehjl
    public final void F(aak aakVar) {
        ehjs ehjsVar = this.E;
        if (ehjsVar == null) {
            return;
        }
        ehjsVar.e = aakVar;
    }

    public final void G(View view, int i, boolean z) {
        int N = N(i);
        lab labVar = this.y;
        if (labVar == null || (!z ? labVar.j(view, view.getLeft(), N) : labVar.h(view.getLeft(), N))) {
            E(i);
            return;
        }
        E(2);
        T(i, true);
        this.U.a(i);
    }

    @Override // defpackage.ehjl
    public final void H(aak aakVar) {
        ehjs ehjsVar = this.E;
        if (ehjsVar == null) {
            return;
        }
        ehjsVar.h(aakVar);
    }

    public final boolean I() {
        return this.u;
    }

    public final boolean J(View view, float f) {
        if (this.v) {
            return true;
        }
        if (view.getTop() < this.s) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.ab)) - ((float) this.s)) / ((float) M()) > 0.5f;
    }

    public final void K() {
        View view;
        if (this.B != null) {
            O();
            if (this.x != 4 || (view = (View) this.B.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.kkt
    public final void a(kkw kkwVar) {
        this.B = null;
        this.y = null;
        this.E = null;
    }

    @Override // defpackage.kkt
    public final void b() {
        this.B = null;
        this.y = null;
        this.E = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        if (r1 == false) goto L36;
     */
    @Override // defpackage.kkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6, int r7, int r8, int[] r9, int r10) {
        /*
            r3 = this;
            r4 = 1
            if (r10 != r4) goto L5
            goto La2
        L5:
            java.lang.ref.WeakReference r7 = r3.C
            if (r7 == 0) goto L10
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L11
        L10:
            r7 = 0
        L11:
            if (r6 != r7) goto La2
            int r10 = r5.getTop()
            int r0 = r10 - r8
            if (r8 <= 0) goto L53
            boolean r1 = r3.aa
            if (r1 != 0) goto L2b
            boolean r1 = r3.W
            if (r1 != 0) goto L2b
            if (r6 != r7) goto L2b
            boolean r6 = r6.canScrollVertically(r4)
            if (r6 != 0) goto L67
        L2b:
            int r6 = r3.t()
            if (r0 >= r6) goto L43
            int r6 = r3.t()
            int r10 = r10 - r6
            r9[r4] = r10
            int[] r6 = defpackage.kvo.a
            int r6 = -r10
            r5.offsetTopAndBottom(r6)
            r6 = 3
            r3.E(r6)
            goto L94
        L43:
            boolean r6 = r3.w
            if (r6 == 0) goto La2
            r9[r4] = r8
            int r6 = -r8
            int[] r7 = defpackage.kvo.a
            r5.offsetTopAndBottom(r6)
            r3.E(r4)
            goto L94
        L53:
            if (r8 >= 0) goto L94
            r1 = -1
            boolean r1 = r6.canScrollVertically(r1)
            boolean r2 = r3.aa
            if (r2 != 0) goto L6a
            boolean r2 = r3.W
            if (r2 != 0) goto L6a
            if (r6 != r7) goto L6a
            if (r1 != 0) goto L67
            goto L6c
        L67:
            r3.X = r4
            return
        L6a:
            if (r1 != 0) goto L94
        L6c:
            int r6 = r3.s
            if (r0 <= r6) goto L85
            boolean r7 = r3.I()
            if (r7 == 0) goto L77
            goto L85
        L77:
            int r10 = r10 - r6
            r9[r4] = r10
            int[] r6 = defpackage.kvo.a
            int r6 = -r10
            r5.offsetTopAndBottom(r6)
            r6 = 4
            r3.E(r6)
            goto L94
        L85:
            boolean r6 = r3.w
            if (r6 == 0) goto La2
            r9[r4] = r8
            int r6 = -r8
            int[] r7 = defpackage.kvo.a
            r5.offsetTopAndBottom(r6)
            r3.E(r4)
        L94:
            int r5 = r5.getTop()
            r3.y(r5)
            r3.Z = r8
            r3.aa = r4
            r4 = 0
            r3.X = r4
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.q) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (java.lang.Math.abs(r3 - r2.p) < java.lang.Math.abs(r3 - r2.s)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.s)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.s)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        if (java.lang.Math.abs(r3 - r2.q) < java.lang.Math.abs(r3 - r2.s)) goto L20;
     */
    @Override // defpackage.kkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.t()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.E(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.C
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb6
            boolean r3 = r2.aa
            if (r3 != 0) goto L1f
            goto Lb6
        L1f:
            int r3 = r2.Z
            r5 = 6
            if (r3 <= 0) goto L35
            boolean r3 = r2.a
            if (r3 == 0) goto L2a
            goto Lb0
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.q
            if (r3 <= r6) goto Lb0
        L32:
            r0 = r5
            goto Lb0
        L35:
            boolean r3 = r2.u
            if (r3 == 0) goto L56
            android.view.VelocityTracker r3 = r2.ad
            if (r3 != 0) goto L3f
            r3 = 0
            goto L4e
        L3f:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.J
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.ad
            int r6 = r2.F
            float r3 = r3.getYVelocity(r6)
        L4e:
            boolean r3 = r2.J(r4, r3)
            if (r3 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r3 = r2.Z
            r6 = 4
            if (r3 != 0) goto L94
            int r3 = r4.getTop()
            boolean r1 = r2.a
            if (r1 == 0) goto L75
            int r5 = r2.p
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L98
            goto Lb0
        L75:
            int r1 = r2.q
            if (r3 >= r1) goto L84
            int r6 = r2.s
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L32
            goto Lb0
        L84:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        L94:
            boolean r3 = r2.a
            if (r3 == 0) goto L9a
        L98:
            r0 = r6
            goto Lb0
        L9a:
            int r3 = r4.getTop()
            int r0 = r2.q
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        Lb0:
            r3 = 0
            r2.G(r4, r0, r3)
            r2.aa = r3
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.kkt
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        lab labVar;
        if (!view.isShown() || !this.w) {
            this.Y = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R();
            actionMasked = 0;
        }
        if (this.ad == null) {
            this.ad = VelocityTracker.obtain();
        }
        this.ad.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.ae = (int) motionEvent.getY();
            if (this.x != 2) {
                WeakReference weakReference = this.C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.k(view2, x, this.ae)) {
                    this.F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.G = true;
                }
            }
            this.Y = this.F == -1 && !coordinatorLayout.k(view, x, this.ae);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
            this.F = -1;
            if (this.Y) {
                this.Y = false;
                return false;
            }
        }
        if (!this.Y && (labVar = this.y) != null && labVar.i(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.C;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (actionMasked == 2 && view3 != null && !this.Y && this.x != 1 && !coordinatorLayout.k(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.y != null && (i = this.ae) != -1) {
            if (Math.abs(i - motionEvent.getY()) > this.y.a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    @Override // defpackage.kkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.kkt
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.Z = 0;
        this.aa = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.kkt
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.x == 1 && actionMasked == 0) {
            return true;
        }
        if (W()) {
            this.y.e(motionEvent);
        }
        if (actionMasked == 0) {
            R();
        }
        if (this.ad == null) {
            this.ad = VelocityTracker.obtain();
        }
        this.ad.addMovement(motionEvent);
        if (W() && actionMasked == 2 && !this.Y) {
            float abs = Math.abs(this.ae - motionEvent.getY());
            lab labVar = this.y;
            if (abs > labVar.a) {
                labVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Y;
    }

    @Override // defpackage.kkt
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(Y(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.N, marginLayoutParams.width), Y(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.O, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.kkt
    public final boolean o(View view, View view2, float f) {
        WeakReference weakReference = this.C;
        return (weakReference == null || view2 != weakReference.get() || this.x == 3 || this.X) ? false : true;
    }

    @Override // defpackage.kkt
    public final void q(View view, Parcelable parcelable) {
        ehbe ehbeVar = (ehbe) parcelable;
        int i = this.I;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = ehbeVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = ehbeVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.u = ehbeVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.v = ehbeVar.g;
            }
        }
        int i3 = ehbeVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.x = i2;
    }

    @Override // defpackage.kkt
    public final Parcelable r(View view) {
        return new ehbe(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final int t() {
        if (this.a) {
            return this.p;
        }
        return Math.max(this.o, this.Q ? 0 : this.n);
    }

    final View u(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View u = u(viewGroup.getChildAt(i));
                if (u != null) {
                    return u;
                }
            }
        }
        return null;
    }

    public final void w(ehbc ehbcVar) {
        if (this.D.contains(ehbcVar)) {
            return;
        }
        this.D.add(ehbcVar);
    }

    @Override // defpackage.ehjl
    public final void x() {
        ehjs ehjsVar = this.E;
        if (ehjsVar == null) {
            return;
        }
        ehjsVar.f();
    }

    public final void y(int i) {
        View view = (View) this.B.get();
        if (view == null || this.D.isEmpty()) {
            return;
        }
        int i2 = this.s;
        if (i <= i2 && i2 != t()) {
            t();
        }
        for (int i3 = 0; i3 < this.D.size(); i3++) {
            ((ehbc) this.D.get(i3)).c(view);
        }
    }

    @Override // defpackage.ehjl
    public final void z() {
        ehjs ehjsVar = this.E;
        if (ehjsVar == null) {
            return;
        }
        if (ehjsVar.c() == null || Build.VERSION.SDK_INT < 34) {
            D(true == this.u ? 5 : 4);
            return;
        }
        if (!this.u) {
            Animator e = this.E.e();
            e.setDuration(egyv.b(r2.b, r2.c, r0.b));
            e.start();
            D(4);
            return;
        }
        ehjs ehjsVar2 = this.E;
        ehax ehaxVar = new ehax(this);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ehjsVar2.a, (Property<View, Float>) View.TRANSLATION_Y, ehjsVar2.a.getHeight() * ehjsVar2.a.getScaleY());
        ofFloat.setInterpolator(new ljm());
        ofFloat.setDuration(egyv.b(ehjsVar2.b, ehjsVar2.c, r0.b));
        ofFloat.addListener(new ehjr(ehjsVar2));
        ofFloat.addListener(ehaxVar);
        ofFloat.start();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = 0;
        this.a = true;
        this.N = -1;
        this.O = -1;
        this.U = new ehbg(this);
        this.r = 0.5f;
        this.t = -1.0f;
        this.w = true;
        this.W = true;
        this.x = 4;
        this.ab = 0.1f;
        this.D = new ArrayList();
        this.ae = -1;
        this.H = new SparseIntArray();
        this.ag = new ehba(this);
        this.L = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehbq.a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.M = ehmq.c(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.S = new ehow(ehow.h(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.S != null) {
            ehop ehopVar = new ehop(this.S);
            this.e = ehopVar;
            ehopVar.K(context);
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.e.O(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(L(), 1.0f);
        this.V = ofFloat;
        ofFloat.setDuration(500L);
        this.V.addUpdateListener(new ehay(this));
        this.t = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.N = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.O = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && peekValue.data == -1) {
            C(peekValue.data);
        } else {
            C(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        B(obtainStyledAttributes.getBoolean(9, false));
        this.P = obtainStyledAttributes.getBoolean(14, false);
        boolean z = obtainStyledAttributes.getBoolean(7, true);
        if (this.a != z) {
            this.a = z;
            if (this.B != null) {
                O();
            }
            E((this.a && this.x == 6) ? 3 : this.x);
            T(this.x, true);
            S();
        }
        this.v = obtainStyledAttributes.getBoolean(13, false);
        this.w = obtainStyledAttributes.getBoolean(4, true);
        this.W = obtainStyledAttributes.getBoolean(5, true);
        this.I = obtainStyledAttributes.getInt(11, 0);
        float f = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.r = f;
            if (this.B != null) {
                P();
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                A(peekValue2.data);
            } else {
                A(obtainStyledAttributes.getDimensionPixelOffset(6, 0));
            }
            this.b = obtainStyledAttributes.getInt(12, 500);
            this.g = obtainStyledAttributes.getBoolean(18, false);
            this.h = obtainStyledAttributes.getBoolean(19, false);
            this.i = obtainStyledAttributes.getBoolean(20, false);
            this.Q = obtainStyledAttributes.getBoolean(21, true);
            this.j = obtainStyledAttributes.getBoolean(15, false);
            this.k = obtainStyledAttributes.getBoolean(16, false);
            this.l = obtainStyledAttributes.getBoolean(17, false);
            this.R = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.J = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.kkt
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }
}
