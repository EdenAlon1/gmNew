package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import defpackage.kpt;
import defpackage.ks;
import defpackage.kua;
import defpackage.kub;
import defpackage.kuc;
import defpackage.kvb;
import defpackage.kvo;
import defpackage.kws;
import defpackage.kwt;
import defpackage.kwu;
import defpackage.kwv;
import defpackage.kww;
import defpackage.kxh;
import defpackage.nl;
import defpackage.op;
import defpackage.pe;
import defpackage.pf;
import defpackage.pg;
import defpackage.ph;
import defpackage.pi;
import defpackage.pj;
import defpackage.so;
import defpackage.sp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements so, kua, kub {
    private static final kxh l;
    private static final Rect m;
    private kxh A;
    private kxh B;
    private kxh C;
    private kxh D;
    private OverScroller E;
    private final Runnable F;
    private final Runnable G;
    private final kuc H;
    private final pj I;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public ph h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int n;
    private ContentFrameLayout o;
    private sp p;
    private Drawable q;
    private boolean r;
    private int s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private final Rect x;
    private boolean y;
    private boolean z;
    private static final Rect k = new Rect();
    static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    static {
        kww kwvVar = Build.VERSION.SDK_INT >= 34 ? new kwv() : Build.VERSION.SDK_INT >= 30 ? new kwu() : Build.VERSION.SDK_INT >= 29 ? new kwt() : new kws();
        kwvVar.c(kpt.d(0, 1, 0, 1));
        l = kwvVar.a();
        m = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void w(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.q = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.E = new OverScroller(context);
    }

    private static final boolean x(View view, Rect rect, boolean z) {
        boolean z2;
        pi piVar = (pi) view.getLayoutParams();
        if (piVar.leftMargin != rect.left) {
            piVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (piVar.topMargin != rect.top) {
            piVar.topMargin = rect.top;
            z2 = true;
        }
        if (piVar.rightMargin != rect.right) {
            piVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || piVar.bottomMargin == rect.bottom) {
            return z2;
        }
        piVar.bottomMargin = rect.bottom;
        return true;
    }

    private static final boolean y(View view, Rect rect) {
        if (view.getPaddingLeft() == rect.left && view.getPaddingTop() == rect.top && view.getPaddingRight() == rect.right) {
            return false;
        }
        view.setPadding(rect.left, rect.top, rect.right, view.getPaddingBottom());
        return true;
    }

    public final int a() {
        ActionBarContainer actionBarContainer = this.c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // defpackage.so
    public final void b() {
        j();
        this.p.g();
    }

    public final void c() {
        removeCallbacks(this.F);
        removeCallbacks(this.G);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pi;
    }

    @Override // defpackage.so
    public final void d(int i) {
        j();
        if (i == 2) {
            this.p.i();
        } else if (i == 5) {
            this.p.h();
        } else {
            if (i != 109) {
                return;
            }
            this.d = true;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.q != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.q.setBounds(0, bottom, getWidth(), this.q.getIntrinsicHeight() + bottom);
            this.q.draw(canvas);
        }
    }

    @Override // defpackage.kua
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.kub
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        f(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new pi();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new pi(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.H.a();
    }

    @Override // defpackage.kua
    public final void h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.kua
    public final void i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void j() {
        sp g;
        if (this.o == null) {
            this.o = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof sp) {
                g = (sp) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(findViewById.getClass().getSimpleName())));
                }
                g = ((Toolbar) findViewById).g();
            }
            this.p = g;
        }
    }

    public final void k(int i) {
        c();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void l(boolean z) {
        if (z != this.r) {
            this.r = z;
            if (z) {
                return;
            }
            c();
            k(0);
        }
    }

    @Override // defpackage.so
    public final void m(Menu menu, op opVar) {
        j();
        this.p.m(menu, opVar);
    }

    @Override // defpackage.so
    public final void n() {
        j();
        this.p.n();
    }

    @Override // defpackage.so
    public final void o(Window.Callback callback) {
        j();
        this.p.v(callback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r4 != false) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
        /*
            r7 = this;
            r7.j()
            int r0 = r7.getWindowSystemUiVisibility()
            r1 = r0 & 256(0x100, float:3.59E-43)
            r0 = r0 & 1536(0x600, float:2.152E-42)
            kxh r2 = android.support.v7.widget.ActionBarOverlayLayout.l
            int[] r3 = defpackage.kvo.a
            pj r3 = r7.I
            android.graphics.Rect r4 = r7.x
            defpackage.kvd.e(r3, r2, r4)
            android.graphics.Rect r2 = r7.x
            android.graphics.Rect r3 = android.support.v7.widget.ActionBarOverlayLayout.m
            boolean r2 = r2.equals(r3)
            r3 = r2 ^ 1
            r7.y = r3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L28
            r1 = r4
            goto L29
        L28:
            r1 = r3
        L29:
            if (r2 != 0) goto L32
            if (r1 == 0) goto L30
            if (r0 == 0) goto L30
            goto L32
        L30:
            r0 = r3
            goto L33
        L32:
            r0 = r4
        L33:
            r7.z = r0
            ph r2 = r7.h
            if (r2 == 0) goto L44
            if (r1 != 0) goto L3f
            if (r0 != 0) goto L3f
            r0 = r4
            goto L40
        L3f:
            r0 = r3
        L40:
            ks r2 = (defpackage.ks) r2
            r2.k = r0
        L44:
            kxh r8 = defpackage.kxh.p(r8, r7)
            android.graphics.Rect r0 = r7.w
            int r1 = r8.b()
            int r2 = r8.d()
            int r5 = r8.c()
            int r6 = r8.a()
            r0.set(r1, r2, r5, r6)
            android.support.v7.widget.ActionBarContainer r0 = r7.c
            android.graphics.Rect r1 = r7.w
            boolean r2 = r7.z
            if (r2 == 0) goto L70
            android.graphics.Rect r2 = android.support.v7.widget.ActionBarOverlayLayout.k
            boolean r2 = x(r0, r2, r3)
            boolean r0 = y(r0, r1)
            goto L7a
        L70:
            android.graphics.Rect r2 = android.support.v7.widget.ActionBarOverlayLayout.k
            boolean r2 = y(r0, r2)
            boolean r0 = x(r0, r1, r3)
        L7a:
            r0 = r0 | r2
            android.graphics.Rect r1 = r7.t
            defpackage.kvd.e(r7, r8, r1)
            android.graphics.Rect r1 = r7.t
            int r2 = r1.left
            int r3 = r1.top
            int r5 = r1.right
            int r1 = r1.bottom
            kxh r1 = r8.n(r2, r3, r5, r1)
            r7.A = r1
            kxh r2 = r7.B
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L9d
            kxh r0 = r7.A
            r7.B = r0
            goto L9e
        L9d:
            r4 = r0
        L9e:
            android.graphics.Rect r0 = r7.u
            android.graphics.Rect r1 = r7.t
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb0
            android.graphics.Rect r0 = r7.u
            android.graphics.Rect r1 = r7.t
            r0.set(r1)
            goto Lb2
        Lb0:
            if (r4 == 0) goto Lb5
        Lb2:
            r7.requestLayout()
        Lb5:
            kxh r8 = r8.k()
            kxh r8 = r8.m()
            kxh r8 = r8.l()
            android.view.WindowInsets r8 = r8.e()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        int[] iArr = kvo.a;
        kvb.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                pi piVar = (pi) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = piVar.leftMargin + paddingLeft;
                int i7 = piVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        pi piVar = (pi) this.c.getLayoutParams();
        int max = Math.max(0, this.c.getMeasuredWidth() + piVar.leftMargin + piVar.rightMargin);
        int max2 = Math.max(0, this.c.getMeasuredHeight() + piVar.topMargin + piVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = kvo.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.n;
            if (this.z) {
                measuredHeight += this.w.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        this.v.set(this.t);
        kxh kxhVar = this.A;
        this.C = kxhVar;
        if (this.d || z || !this.y) {
            kpt d = this.z ? kpt.d(kxhVar.b(), Math.max(this.C.d(), measuredHeight), this.C.c(), Math.max(this.C.a(), 0)) : kpt.d(kxhVar.b(), this.C.d() + measuredHeight, this.C.c(), this.C.a());
            kxh kxhVar2 = this.C;
            kww kwvVar = Build.VERSION.SDK_INT >= 34 ? new kwv(kxhVar2) : Build.VERSION.SDK_INT >= 30 ? new kwu(kxhVar2) : Build.VERSION.SDK_INT >= 29 ? new kwt(kxhVar2) : new kws(kxhVar2);
            kwvVar.c(d);
            this.C = kwvVar.a();
        } else {
            if (this.z) {
                Rect rect = this.v;
                rect.top = Math.max(rect.top, measuredHeight);
                Rect rect2 = this.v;
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                this.v.top += measuredHeight;
                Rect rect3 = this.v;
                rect3.bottom = rect3.bottom;
            }
            this.C = this.C.n(0, measuredHeight, 0, 0);
        }
        x(this.o, this.v, true);
        if (!this.D.equals(this.C)) {
            kxh kxhVar3 = this.C;
            this.D = kxhVar3;
            kvo.f(this.o, kxhVar3);
        }
        measureChildWithMargins(this.o, i, 0, i2, 0);
        pi piVar2 = (pi) this.o.getLayoutParams();
        int max3 = Math.max(max, this.o.getMeasuredWidth() + piVar2.leftMargin + piVar2.rightMargin);
        int max4 = Math.max(max2, this.o.getMeasuredHeight() + piVar2.topMargin + piVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.r || !z) {
            return false;
        }
        this.E.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.E.getFinalY() > this.c.getHeight()) {
            c();
            this.G.run();
        } else {
            c();
            this.F.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.s + i2;
        this.s = i5;
        k(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ks ksVar;
        nl nlVar;
        this.H.d(i);
        this.s = a();
        c();
        ph phVar = this.h;
        if (phVar == null || (nlVar = (ksVar = (ks) phVar).n) == null) {
            return;
        }
        nlVar.a();
        ksVar.n = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.r || this.f) {
            return;
        }
        if (this.s <= this.c.getHeight()) {
            c();
            postDelayed(this.F, 600L);
        } else {
            c();
            postDelayed(this.G, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.g ^ i;
        this.g = i;
        ph phVar = this.h;
        if (phVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            ks ksVar = (ks) phVar;
            ksVar.k = (z || this.z) ? false : true;
            if (i3 == 0 || !z) {
                if (ksVar.m) {
                    ksVar.m = false;
                    ksVar.c(true);
                }
            } else if (!ksVar.m) {
                ksVar.m = true;
                ksVar.c(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int[] iArr = kvo.a;
        kvb.c(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        ph phVar = this.h;
        if (phVar != null) {
            ((ks) phVar).j = i;
        }
    }

    @Override // defpackage.so
    public final void p(CharSequence charSequence) {
        j();
        this.p.w(charSequence);
    }

    @Override // defpackage.so
    public final boolean q() {
        j();
        return this.p.x();
    }

    @Override // defpackage.so
    public final boolean r() {
        j();
        return this.p.z();
    }

    @Override // defpackage.so
    public final boolean s() {
        j();
        return this.p.A();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.so
    public final boolean t() {
        j();
        return this.p.B();
    }

    @Override // defpackage.kua
    public final boolean u(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.so
    public final boolean v() {
        j();
        return this.p.C();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.y = true;
        this.z = false;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.A = kxh.a;
        kxh kxhVar = kxh.a;
        this.B = kxhVar;
        this.C = kxhVar;
        this.D = kxhVar;
        this.j = new pe(this);
        this.F = new pf(this);
        this.G = new pg(this);
        w(context);
        this.H = new kuc();
        pj pjVar = new pj(context);
        this.I = pjVar;
        addView(pjVar);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new pi(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.kua
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }
}
