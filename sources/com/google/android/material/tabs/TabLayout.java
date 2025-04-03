package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import defpackage.ehfy;
import defpackage.ehjg;
import defpackage.ehoq;
import defpackage.ehrl;
import defpackage.ehrm;
import defpackage.ehrn;
import defpackage.ehro;
import defpackage.ehrq;
import defpackage.ehrs;
import defpackage.ehrt;
import defpackage.ehru;
import defpackage.ehrw;
import defpackage.ehrx;
import defpackage.kst;
import defpackage.ksv;
import defpackage.kxs;
import defpackage.kxu;
import defpackage.pco;
import defpackage.pct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@pct
/* loaded from: classes5.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int H = 2132150817;
    private static final kst I = new ksv(16);
    int A;
    public boolean B;
    public ehrl C;
    public final TimeInterpolator D;
    public final ArrayList E;
    public ViewPager F;
    public int G;
    private ehrt J;
    private int K;
    private final int L;
    private final int M;
    private final int N;
    private int O;
    private ehro P;
    private ValueAnimator Q;
    private pco R;
    private DataSetObserver S;
    private ehru T;
    private ehrn U;
    private boolean V;
    private final kst W;
    public int a;
    public final ArrayList b;
    final ehrs c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public final int i;
    public int j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public PorterDuff.Mode o;
    public float p;
    public float q;
    public float r;
    public final int s;
    public int t;
    public int u;
    int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public TabLayout(Context context) {
        this(context, null);
    }

    private final int A() {
        int i = this.L;
        if (i != -1) {
            return i;
        }
        int i2 = this.x;
        if (i2 == 0 || i2 == 2) {
            return this.N;
        }
        return 0;
    }

    private final void B(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        ehrt e = e();
        CharSequence charSequence = tabItem.a;
        if (charSequence != null) {
            e.f(charSequence);
        }
        Drawable drawable = tabItem.b;
        if (drawable != null) {
            e.e(drawable);
        }
        int i = tabItem.c;
        if (i != 0) {
            e.f = LayoutInflater.from(e.i.getContext()).inflate(i, (ViewGroup) e.i, false);
            e.c();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            e.d(tabItem.getContentDescription());
        }
        g(e);
    }

    private final void C(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            ehrs ehrsVar = this.c;
            int childCount = ehrsVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (ehrsVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int z = z(i, 0.0f);
            if (scrollX != z) {
                if (this.Q == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.Q = valueAnimator;
                    valueAnimator.setInterpolator(this.D);
                    this.Q.setDuration(this.v);
                    this.Q.addUpdateListener(new ehrm(this));
                }
                this.Q.setIntValues(scrollX, z);
                this.Q.start();
            }
            ehrs ehrsVar2 = this.c;
            int i3 = this.v;
            ValueAnimator valueAnimator2 = ehrsVar2.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && ehrsVar2.b.a != i) {
                ehrsVar2.a.cancel();
            }
            ehrsVar2.d(true, i, i3);
            return;
        }
        x(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void D() {
        /*
            r4 = this;
            int r0 = r4.x
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r4.O
            int r3 = r4.d
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            ehrs r3 = r4.c
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.x
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 == r3) goto L25
            if (r0 == r1) goto L25
            goto L50
        L25:
            int r0 = r4.u
            if (r0 != r1) goto L2e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L2e:
            ehrs r0 = r4.c
            r0.setGravity(r3)
            goto L50
        L34:
            int r0 = r4.u
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3d
            if (r0 == r1) goto L48
            goto L50
        L3d:
            ehrs r0 = r4.c
            r0.setGravity(r3)
            goto L50
        L43:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L48:
            ehrs r0 = r4.c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L50:
            r4.v(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.D():void");
    }

    private final void E(int i) {
        int childCount = this.c.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                ehrs ehrsVar = this.c;
                boolean z = i2 == i;
                View childAt = ehrsVar.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof ehrw) {
                        ((ehrw) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void F() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((ehrt) this.b.get(i)).c();
        }
    }

    private final void G(LinearLayout.LayoutParams layoutParams) {
        if (this.x == 1 && this.u == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private final boolean H() {
        int i = this.x;
        return i == 0 || i == 2;
    }

    private final void I(ViewPager viewPager, boolean z) {
        List list;
        ViewPager viewPager2 = this.F;
        if (viewPager2 != null) {
            ehru ehruVar = this.T;
            if (ehruVar != null) {
                viewPager2.i(ehruVar);
            }
            ehrn ehrnVar = this.U;
            if (ehrnVar != null && (list = this.F.h) != null) {
                list.remove(ehrnVar);
            }
        }
        ehro ehroVar = this.P;
        if (ehroVar != null) {
            l(ehroVar);
            this.P = null;
        }
        if (viewPager != null) {
            this.F = viewPager;
            if (this.T == null) {
                this.T = new ehru(this);
            }
            ehru ehruVar2 = this.T;
            ehruVar2.b = 0;
            ehruVar2.a = 0;
            viewPager.d(ehruVar2);
            ehrx ehrxVar = new ehrx(viewPager);
            this.P = ehrxVar;
            f(ehrxVar);
            pco pcoVar = viewPager.b;
            if (pcoVar != null) {
                o(pcoVar, true);
            }
            if (this.U == null) {
                this.U = new ehrn(this);
            }
            ehrn ehrnVar2 = this.U;
            ehrnVar2.a = true;
            if (viewPager.h == null) {
                viewPager.h = new ArrayList();
            }
            viewPager.h.add(ehrnVar2);
            x(viewPager.c);
        } else {
            this.F = null;
            o(null, false);
        }
        this.V = z;
    }

    public static ColorStateList c(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final int z(int i, float f) {
        View childAt;
        int i2 = this.x;
        if ((i2 != 0 && i2 != 2) || (childAt = this.c.getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < this.c.getChildCount() ? this.c.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final int a() {
        ehrt ehrtVar = this.J;
        if (ehrtVar != null) {
            return ehrtVar.e;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        B(view);
    }

    public final int b() {
        return this.b.size();
    }

    public final ehrt d(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (ehrt) this.b.get(i);
    }

    public final ehrt e() {
        ehrt ehrtVar = (ehrt) I.a();
        if (ehrtVar == null) {
            ehrtVar = new ehrt();
        }
        ehrtVar.h = this;
        kst kstVar = this.W;
        ehrw ehrwVar = kstVar != null ? (ehrw) kstVar.a() : null;
        if (ehrwVar == null) {
            ehrwVar = new ehrw(this, getContext());
        }
        ehrwVar.a(ehrtVar);
        ehrwVar.setFocusable(true);
        ehrwVar.setMinimumWidth(A());
        if (TextUtils.isEmpty(ehrtVar.d)) {
            ehrwVar.setContentDescription(ehrtVar.c);
        } else {
            ehrwVar.setContentDescription(ehrtVar.d);
        }
        ehrtVar.i = ehrwVar;
        if (ehrtVar.j != -1) {
            ehrtVar.i.setId(0);
        }
        return ehrtVar;
    }

    @Deprecated
    public final void f(ehro ehroVar) {
        if (this.E.contains(ehroVar)) {
            return;
        }
        this.E.add(ehroVar);
    }

    public final void g(ehrt ehrtVar) {
        h(ehrtVar, this.b.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h(ehrt ehrtVar, boolean z) {
        i(ehrtVar, this.b.size(), z);
    }

    public final void i(ehrt ehrtVar, int i, boolean z) {
        if (ehrtVar.h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        ehrtVar.e = i;
        this.b.add(i, ehrtVar);
        int size = this.b.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (((ehrt) this.b.get(i3)).e == this.a) {
                i2 = i3;
            }
            ((ehrt) this.b.get(i3)).e = i3;
        }
        this.a = i2;
        ehrw ehrwVar = ehrtVar.i;
        ehrwVar.setSelected(false);
        ehrwVar.setActivated(false);
        ehrs ehrsVar = this.c;
        int i4 = ehrtVar.e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        G(layoutParams);
        ehrsVar.addView(ehrwVar, i4, layoutParams);
        if (z) {
            ehrtVar.b();
        }
    }

    public final void j() {
        int i;
        k();
        pco pcoVar = this.R;
        if (pcoVar != null) {
            int j = pcoVar.j();
            for (int i2 = 0; i2 < j; i2++) {
                ehrt e = e();
                e.f(this.R.k(i2));
                h(e, false);
            }
            ViewPager viewPager = this.F;
            if (viewPager == null || j <= 0 || (i = viewPager.c) == a() || i >= b()) {
                return;
            }
            m(d(i));
        }
    }

    public final void k() {
        for (int childCount = this.c.getChildCount() - 1; childCount >= 0; childCount--) {
            ehrw ehrwVar = (ehrw) this.c.getChildAt(childCount);
            this.c.removeViewAt(childCount);
            if (ehrwVar != null) {
                ehrwVar.a(null);
                ehrwVar.setSelected(false);
                this.W.b(ehrwVar);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ehrt ehrtVar = (ehrt) it.next();
            it.remove();
            ehrtVar.h = null;
            ehrtVar.i = null;
            ehrtVar.a = null;
            ehrtVar.b = null;
            ehrtVar.j = -1;
            ehrtVar.c = null;
            ehrtVar.d = null;
            ehrtVar.e = -1;
            ehrtVar.f = null;
            I.b(ehrtVar);
        }
        this.J = null;
    }

    @Deprecated
    public final void l(ehro ehroVar) {
        this.E.remove(ehroVar);
    }

    public final void m(ehrt ehrtVar) {
        n(ehrtVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r0.e == (-1)) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.ehrt r4, boolean r5) {
        /*
            r3 = this;
            ehrt r0 = r3.J
            r1 = -1
            if (r0 != r4) goto L24
            if (r0 == 0) goto L7a
            java.util.ArrayList r5 = r3.E
            int r5 = r5.size()
            int r5 = r5 + r1
        Le:
            if (r5 < 0) goto L1e
            java.util.ArrayList r0 = r3.E
            java.lang.Object r0 = r0.get(r5)
            ehro r0 = (defpackage.ehro) r0
            r0.a(r4)
            int r5 = r5 + (-1)
            goto Le
        L1e:
            int r4 = r4.e
            r3.C(r4)
            return
        L24:
            if (r4 == 0) goto L29
            int r2 = r4.e
            goto L2a
        L29:
            r2 = r1
        L2a:
            if (r5 == 0) goto L42
            if (r0 == 0) goto L33
            int r5 = r0.e
            if (r5 != r1) goto L3a
            goto L34
        L33:
            r0 = 0
        L34:
            if (r2 == r1) goto L3a
            r3.x(r2)
            goto L3d
        L3a:
            r3.C(r2)
        L3d:
            if (r2 == r1) goto L42
            r3.E(r2)
        L42:
            r3.J = r4
            if (r0 == 0) goto L61
            com.google.android.material.tabs.TabLayout r5 = r0.h
            if (r5 == 0) goto L61
            java.util.ArrayList r5 = r3.E
            int r5 = r5.size()
            int r5 = r5 + r1
        L51:
            if (r5 < 0) goto L61
            java.util.ArrayList r2 = r3.E
            java.lang.Object r2 = r2.get(r5)
            ehro r2 = (defpackage.ehro) r2
            r2.c(r0)
            int r5 = r5 + (-1)
            goto L51
        L61:
            if (r4 == 0) goto L7a
            java.util.ArrayList r5 = r3.E
            int r5 = r5.size()
            int r5 = r5 + r1
        L6a:
            if (r5 < 0) goto L7a
            java.util.ArrayList r0 = r3.E
            java.lang.Object r0 = r0.get(r5)
            ehro r0 = (defpackage.ehro) r0
            r0.b(r4)
            int r5 = r5 + (-1)
            goto L6a
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.n(ehrt, boolean):void");
    }

    public final void o(pco pcoVar, boolean z) {
        DataSetObserver dataSetObserver;
        pco pcoVar2 = this.R;
        if (pcoVar2 != null && (dataSetObserver = this.S) != null) {
            pcoVar2.f.unregisterObserver(dataSetObserver);
        }
        this.R = pcoVar;
        if (z && pcoVar != null) {
            if (this.S == null) {
                this.S = new ehrq(this);
            }
            pcoVar.f.registerObserver(this.S);
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ehoq.c(this);
        if (this.F == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                I((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            u(null);
            this.V = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        ehrw ehrwVar;
        Drawable drawable;
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            if ((childAt instanceof ehrw) && (drawable = (ehrwVar = (ehrw) childAt).f) != null) {
                drawable.setBounds(ehrwVar.getLeft(), ehrwVar.getTop(), ehrwVar.getRight(), ehrwVar.getBottom());
                ehrwVar.f.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new kxu(accessibilityNodeInfo).t(kxs.a(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return H() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        Context context = getContext();
        int size = this.b.size();
        int i4 = 0;
        while (true) {
            i3 = 48;
            if (i4 >= size) {
                break;
            }
            ehrt ehrtVar = (ehrt) this.b.get(i4);
            if (ehrtVar == null || ehrtVar.b == null || TextUtils.isEmpty(ehrtVar.c)) {
                i4++;
            } else if (!this.y) {
                i3 = 72;
            }
        }
        int round = Math.round(ehjg.a(context, i3));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i5 = this.M;
            if (i5 <= 0) {
                i5 = (int) (size2 - ehjg.a(getContext(), 56));
            }
            this.t = i5;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i6 = this.x;
            if (i6 != 0) {
                if (i6 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
                if (i6 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || H()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int round = Math.round(f2);
        if (round < 0 || round >= this.c.getChildCount()) {
            return;
        }
        if (z2) {
            ehrs ehrsVar = this.c;
            ehrsVar.b.a = Math.round(f2);
            ValueAnimator valueAnimator = ehrsVar.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ehrsVar.a.cancel();
            }
            ehrsVar.c(ehrsVar.getChildAt(i), ehrsVar.getChildAt(i + 1), f);
        }
        ValueAnimator valueAnimator2 = this.Q;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.Q.cancel();
        }
        int z4 = z(i, f);
        int scrollX = getScrollX();
        boolean z5 = (i < a() && z4 >= scrollX) || (i > a() && z4 <= scrollX) || i == a();
        if (getLayoutDirection() == 1) {
            z5 = (i < a() && z4 <= scrollX) || (i > a() && z4 >= scrollX) || i == a();
        }
        if (z5 || this.G == 1 || z3) {
            if (i < 0) {
                z4 = 0;
            }
            scrollTo(z4, 0);
        }
        if (z) {
            E(round);
        }
    }

    public final void q(int i) {
        this.K = i;
        ehfy.f(this.n, i);
        v(false);
    }

    public final void r(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            F();
        }
    }

    public final void s(int i) {
        if (i != this.x) {
            this.x = i;
            D();
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ehoq.b(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public final void t(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            F();
        }
    }

    public final void u(ViewPager viewPager) {
        I(viewPager, false);
    }

    public final void v(boolean z) {
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            childAt.setMinimumWidth(A());
            G((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final void w() {
        if (!this.y) {
            this.y = true;
            for (int i = 0; i < this.c.getChildCount(); i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt instanceof ehrw) {
                    ehrw ehrwVar = (ehrw) childAt;
                    ehrwVar.setOrientation(!ehrwVar.g.y ? 1 : 0);
                    TextView textView = ehrwVar.d;
                    if (textView == null && ehrwVar.e == null) {
                        ehrwVar.d(ehrwVar.a, ehrwVar.b, true);
                    } else {
                        ehrwVar.d(textView, ehrwVar.e, false);
                    }
                }
            }
            D();
        }
    }

    public final void x(int i) {
        p(i, 0.0f, true, true, true);
    }

    public final void y() {
        if (this.u != 0) {
            this.u = 0;
            D();
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        B(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        B(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        B(view);
    }
}
