package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import defpackage.ebnr;
import defpackage.ebow;
import defpackage.ebpb;
import defpackage.ebvw;
import defpackage.ebwc;
import defpackage.ebzj;
import defpackage.ebzo;
import defpackage.ebzp;
import defpackage.ebzq;
import defpackage.ebzr;
import defpackage.ebzs;
import defpackage.ebzt;
import defpackage.ebzu;
import defpackage.ebzv;
import defpackage.ecav;
import defpackage.ecaw;
import defpackage.egyx;
import defpackage.ehdr;
import defpackage.ehfz;
import defpackage.ehga;
import defpackage.ehjg;
import defpackage.ehop;
import defpackage.ehou;
import defpackage.ehow;
import defpackage.kps;
import defpackage.ktq;
import defpackage.kub;
import defpackage.kuc;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.ljl;
import defpackage.ljm;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ExpandableDialogView extends ViewGroup implements kub, ebwc {
    public static final /* synthetic */ int m = 0;
    private static final TimeInterpolator n = new ljl();
    private static final Property o = new ebzs(Integer.class);
    private static final Property p = new ebzt(RectF.class);
    private static final Property q = new ebzu(Integer.class);
    private boolean A;
    private boolean B;
    private int C;
    private final Paint D;
    private final Paint E;
    private final Paint F;
    private final RectF G;
    private final ObjectAnimator H;
    private final ObjectAnimator I;
    private final int J;
    private final ehfz K;
    private final Paint L;
    private final int M;
    private final boolean N;
    private final boolean O;
    private final ktq P;
    private OverScrollControlledNestedScrollView Q;
    private View R;
    private boolean S;
    private Configuration T;
    private boolean U;
    private boolean V;
    private boolean W;
    public final Rect a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    public final float b;
    public final RectF c;
    public View d;
    public final ehop e;
    public final float f;
    public float g;
    public View h;
    public int i;
    public Runnable j;
    public Window k;
    public int l;
    private final kuc r;
    private final Rect s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private float z;

    public ExpandableDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new kuc();
        this.s = new Rect();
        this.a = new Rect();
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        Paint paint3 = new Paint(1);
        this.F = paint3;
        this.G = new RectF();
        RectF rectF = new RectF();
        this.c = rectF;
        Paint paint4 = new Paint(1);
        this.L = paint4;
        this.t = getResources().getDimensionPixelSize(R.dimen.og_dialog_margin_horizontal);
        this.v = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_margin_bottom);
        this.w = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_width);
        this.x = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_max_height);
        this.y = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_min_scroll);
        float a = ebnr.a(getContext(), R.attr.ogDialogCornerRadius);
        this.b = a;
        this.f = ebnr.a(getContext(), R.attr.ogDialogHeaderElevation);
        setWillNotDraw(false);
        paint4.setStyle(Paint.Style.FILL);
        int a2 = ehga.a(R.dimen.m3_sys_elevation_level2, getContext());
        this.J = a2;
        int i = ebnr.e(context, R.attr.elevationOverlayEnabled).data;
        this.K = new ehfz(i != 0, ehdr.c(context, R.attr.elevationOverlayColor, 0), ehdr.c(context, R.attr.elevationOverlayAccentColor, 0), a2, context.getResources().getDisplayMetrics().density);
        int b = ebnr.b(getContext(), R.attr.ogLightGrey);
        this.M = b;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ecav.a, 0, 0);
        try {
            this.N = obtainStyledAttributes.getBoolean(2, false);
            this.O = obtainStyledAttributes.getBoolean(0, false);
            this.u = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.og_dialog_default_margin_top));
            obtainStyledAttributes.recycle();
            paint3.setColor(a2);
            paint.setColor(kps.h(a2, Math.round(204.0f)));
            paint2.setColor(b);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, (Property<ExpandableDialogView, Integer>) o, 0);
            this.I = ofInt;
            ofInt.setDuration(150L);
            ofInt.setInterpolator(new ljm());
            ofInt.addListener(new ebzo(this));
            ehop E = ehop.E(getContext());
            this.e = E;
            E.O(ColorStateList.valueOf(a2));
            ehou ehouVar = new ehou();
            ehouVar.j(a);
            ehouVar.k(a);
            E.fy(new ehow(ehouVar));
            ObjectAnimator ofObject = ObjectAnimator.ofObject(this, (Property<ExpandableDialogView, V>) p, new ecaw(new RectF()), rectF);
            this.H = ofObject;
            ofObject.setDuration(300L);
            ofObject.setInterpolator(new ljm());
            ofObject.addListener(new ebzp(this));
            setClipToOutline(true);
            setOutlineProvider(new ebzq(this));
            setClipChildren(false);
            q(getResources().getConfiguration());
            ktq ktqVar = new ktq(getContext(), new ebzr(this));
            this.P = ktqVar;
            ktqVar.a(false);
            this.l = 1;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void o(int i) {
        int height = this.a.height();
        int round = Math.round(this.t * (1.0f - a()));
        if (this.U && i > this.w) {
            this.a.top = this.C + this.s.top;
            int i2 = this.w;
            int i3 = this.l;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                this.a.left = ((((i - this.s.left) - this.s.right) - i2) / 2) + this.s.left;
            }
            Rect rect = this.a;
            rect.right = rect.left + i2;
            Rect rect2 = this.a;
            rect2.bottom = rect2.top + height;
            this.G.set(this.a);
            return;
        }
        this.a.top = this.s.top + (m() ? 0 : this.C - this.i);
        this.a.left = this.s.left + round;
        this.a.right = (i - this.s.right) - round;
        if (this.A || v()) {
            Rect rect3 = this.a;
            rect3.bottom = rect3.top + height;
        } else if (this.i <= 0) {
            Rect rect4 = this.a;
            rect4.bottom = rect4.top + this.d.getMeasuredHeight() + this.ab;
        } else {
            this.a.bottom = this.s.top + this.C + this.d.getMeasuredHeight() + this.ab + Math.round((this.aa - r0) * a());
        }
        if (m()) {
            this.G.set(0.0f, 0.0f, i, this.aa);
        } else {
            this.G.set(this.a.left, this.a.top - (n.getInterpolation(Math.max(0.0f, (a() - 0.6f) / 0.39999998f)) * this.s.top), this.a.right, this.a.bottom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(float f) {
        this.R.setTranslationY(f);
    }

    private final void q(Configuration configuration) {
        this.U = configuration.smallestScreenWidthDp >= 600;
        this.V = configuration.orientation == 2;
        this.W = ebow.a(getContext());
        requestLayout();
    }

    private final void r(float f) {
        this.z = f;
        s();
    }

    private final void s() {
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.Q;
        if (overScrollControlledNestedScrollView != null) {
            boolean z = true;
            if (!m() && !this.U) {
                z = false;
            }
            overScrollControlledNestedScrollView.h = z;
        }
    }

    private final boolean t() {
        int i = this.i;
        return i < -290 || i <= this.ae;
    }

    private final boolean v() {
        return (this.V || this.W) && !this.U;
    }

    public final float a() {
        if (this.U) {
            return 0.0f;
        }
        if (v()) {
            return 1.0f;
        }
        return this.z;
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        ebvwVar.b(findViewById(R.id.og_container_header), 93522);
        ebvwVar.b(findViewById(R.id.og_header_close_button), 93521);
        View view = this.h;
        view.getClass();
        ebvwVar.b(view, 90573);
    }

    public final int c(float f) {
        return this.K.b(this.J, f + ehjg.b(this));
    }

    public final void d(int i) {
        Runnable runnable;
        if (this.i == i) {
            return;
        }
        r(Math.max(0.0f, i / this.C));
        this.Q.offsetTopAndBottom(this.i - i);
        this.i = i;
        this.H.cancel();
        o(getWidth());
        if (!this.A) {
            j(this.G);
        }
        this.c.set(this.G);
        k();
        invalidate();
        invalidateOutline();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        View view = this.d;
        Rect rect = this.a;
        view.layout(rect.left, rect.top, rect.right, rect.top + this.d.getMeasuredHeight());
        if (!this.N) {
            OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.Q;
            int i2 = this.a.left;
            int bottom = this.d.getBottom();
            Rect rect2 = this.a;
            overScrollControlledNestedScrollView.layout(i2, bottom, rect2.right, rect2.bottom);
        }
        if (i > this.ad || (runnable = this.j) == null) {
            return;
        }
        runnable.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Rect rect = this.a;
        int save = canvas.save();
        canvas.clipRect(rect.left, this.a.top, this.a.right, this.c.bottom);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // defpackage.kua
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        if (i2 <= 0 || (i4 = this.i) >= (i5 = this.C)) {
            return;
        }
        if (!this.A && !this.B) {
            i5 = 0;
        }
        int min = Math.min(i2, i5 - i4);
        iArr[1] = min;
        d(this.i + min);
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        this.s.set(rect);
        return true;
    }

    @Override // defpackage.kub
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            if (i5 == 0 || this.i < this.C) {
                int max = Math.max(i4 + this.i, this.ae);
                iArr[1] = max - this.i;
                d(max);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.r.a();
    }

    @Override // defpackage.kua
    public final void h(View view, View view2, int i, int i2) {
        this.r.b(i, i2);
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        ebvwVar.e(findViewById(R.id.og_header_close_button));
        ebvwVar.e(findViewById(R.id.og_container_header));
        View view = this.h;
        view.getClass();
        ebvwVar.e(view);
    }

    @Override // defpackage.kua
    public final void i(View view, int i) {
        this.r.c(i);
        if (i == 1) {
            this.S = false;
        }
        if (this.S || m()) {
            return;
        }
        if (!t()) {
            if (this.i >= 145) {
                this.I.setIntValues(this.C);
            } else {
                this.I.setIntValues(0);
            }
            this.I.start();
            return;
        }
        this.I.setIntValues(this.ad);
        ObjectAnimator objectAnimator = this.I;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(50L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        if (this.k != null) {
            int color = getContext().getColor(R.color.google_scrim);
            animatorSet.playTogether(objectAnimator, ObjectAnimator.ofObject(this.k.getDecorView(), (Property<View, V>) q, new egyx(), Integer.valueOf(color), Integer.valueOf(kps.h(color, 0))));
        } else {
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.start();
    }

    public final void j(RectF rectF) {
        this.c.set(rectF);
        p((rectF.bottom - this.Q.getTop()) - this.ac);
        k();
        invalidate();
        invalidateOutline();
    }

    public final void k() {
        Window window;
        Rect rect = this.s;
        RectF rectF = this.c;
        boolean l = l();
        ebpb.b(this, rectF.top < ((float) rect.top) / 2.0f, !l);
        float f = this.c.bottom;
        int height = getHeight() - this.s.bottom;
        Window window2 = this.k;
        boolean z = f >= ((float) height);
        if (window2 != null) {
            if (this.V || !z) {
                window2.setNavigationBarColor(0);
            } else {
                window2.setNavigationBarColor(this.af);
            }
        }
        if (!this.V || this.U) {
            if (!z) {
                setSystemUiVisibility(getSystemUiVisibility() & (-17));
            } else if (Build.VERSION.SDK_INT > 26 && Build.VERSION.SDK_INT < 29 && !l) {
                setSystemUiVisibility(getSystemUiVisibility() | 16);
            }
            if (Build.VERSION.SDK_INT < 28 || (window = this.k) == null) {
                return;
            }
            window.setNavigationBarDividerColor(z ? this.M : 0);
        }
    }

    public final boolean l() {
        Configuration configuration = this.T;
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    final boolean m() {
        return a() == 1.0f;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.s.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Runnable() { // from class: ebzn
            @Override // java.lang.Runnable
            public final void run() {
                ExpandableDialogView expandableDialogView = ExpandableDialogView.this;
                expandableDialogView.setSystemUiVisibility(expandableDialogView.getSystemUiVisibility() & (-17));
                if (!expandableDialogView.l()) {
                    expandableDialogView.setSystemUiVisibility(expandableDialogView.getSystemUiVisibility() | 16);
                }
                expandableDialogView.k();
            }
        });
        this.af = (this.k == null || Build.VERSION.SDK_INT >= 29) ? 0 : this.k.getNavigationBarColor();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q(configuration);
        s();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float a = this.b * (1.0f - a());
        canvas.drawRoundRect(this.c, a, a, this.F);
        ehou ehouVar = new ehou();
        ehouVar.j(a);
        ehouVar.k(a);
        this.e.fy(new ehow(ehouVar));
        if (m()) {
            View view = this.d;
            int[] iArr = kvo.a;
            this.L.setColor(c(kvd.a(view)));
            canvas.drawRect(this.s.left, -this.s.top, this.c.right - this.s.right, this.d.getTop(), this.L);
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        float a = 1.0f - a();
        canvas.save();
        canvas.clipRect(0, getHeight() - this.s.bottom, getWidth(), getHeight());
        RectF rectF = this.c;
        Paint paint = this.D;
        float f = this.b * a;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(0.0f, getHeight() - this.s.bottom, getWidth(), (getHeight() - this.s.bottom) + 1, this.E);
        canvas.restore();
        if (m()) {
            if (this.s.left > 0) {
                canvas.drawRect(this.s.left - 1, 0.0f, this.s.left, getHeight(), this.E);
            }
            if (this.s.right > 0) {
                canvas.drawRect(getWidth() - this.s.right, 0.0f, (getWidth() - this.s.right) + 1, getHeight(), this.E);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        this.d = childAt;
        int[] iArr = kvo.a;
        childAt.setBackground(this.e);
        this.d.setOutlineProvider(null);
        this.Q = (OverScrollControlledNestedScrollView) findViewById(R.id.og_container_scroll_view);
        this.R = findViewById(R.id.og_container_footer);
        this.h = findViewById(R.id.og_dialog_scrim_ve);
        findViewById(R.id.og_container_disable_content_view).setBackgroundColor(this.J);
        if (Build.VERSION.SDK_INT <= 26) {
            this.Q.findViewById(R.id.og_container_scroll_root).setFocusableInTouchMode(true);
        }
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = this.a;
        this.d.layout(rect.left, rect.top, rect.right, rect.top + this.d.getMeasuredHeight());
        int i5 = ((this.U || !this.N) ? this.a : this.s).left;
        this.Q.layout(i5, this.d.getBottom(), this.Q.getMeasuredWidth() + i5, this.a.bottom);
        if (this.i == 0) {
            this.Q.setScrollY(0);
        }
        k();
        if (!getResources().getConfiguration().equals(this.T)) {
            this.T = getResources().getConfiguration();
            this.c.set(this.G);
            invalidateOutline();
        } else {
            if (this.c.equals(this.G)) {
                return;
            }
            this.H.setObjectValues(this.G);
            this.H.start();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int min;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        o(size);
        int i3 = (size2 - this.s.top) - this.s.bottom;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        int measuredHeight = this.d.getMeasuredHeight();
        int width = (this.U || !this.N) ? this.a.width() : (size - this.s.left) - this.s.right;
        int i4 = i3 - measuredHeight;
        boolean z = this.U;
        int i5 = z ? (i4 - this.u) - this.v : i4 - this.u;
        int i6 = z ? this.y : 0;
        this.aa = size2 - this.s.bottom;
        this.Q.findViewById(R.id.og_container_scroll_root).setMinimumHeight(0);
        this.Q.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.ab = this.Q.getMeasuredHeight();
        boolean z2 = this.Q.getMeasuredHeight() - i5 >= i6;
        this.A = z2;
        if (m() || (!this.U && z2 && this.Q.getMeasuredHeight() < i4)) {
            this.Q.findViewById(R.id.og_container_scroll_root).setMinimumHeight(i4);
            this.Q.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        if (m() || this.A) {
            min = this.U ? Math.min(this.x - measuredHeight, i5) : i4;
        } else {
            min = this.Q.getMeasuredHeight();
            r(0.0f);
        }
        if (!this.O || m() || this.U) {
            this.C = this.u;
        } else {
            this.C = Math.max(this.u, (i4 - min) / 2);
        }
        int i7 = -size2;
        this.ad = this.s.top + i7 + this.C;
        this.ae = (i7 / 2) + this.s.top + this.C;
        Rect rect = this.a;
        rect.bottom = rect.top + min + measuredHeight;
        this.G.bottom = m() ? this.aa : this.a.bottom;
        this.ac = this.Q.findViewById(R.id.og_container_scroll_root).getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.i < this.C;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.r.d(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        ebzv ebzvVar = (ebzv) parcelable;
        super.onRestoreInstanceState(ebzvVar.a());
        r(true != ebzvVar.b() ? 0.0f : 1.0f);
        this.i = Math.round(this.z * this.u);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        float f = this.z;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            return new ebzj(f == 1.0f, onSaveInstanceState);
        }
        throw new NullPointerException("Null parentState");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.r.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.P.b(motionEvent);
    }

    @Override // defpackage.kua
    public final boolean u(View view, View view2, int i, int i2) {
        if (t()) {
            return false;
        }
        this.I.cancel();
        if (this.U || v()) {
            return false;
        }
        if (i2 == 1) {
            this.S = true;
        }
        this.B = m();
        return true;
    }

    @Override // defpackage.kua
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
