package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class egzt extends FrameLayout {
    private int A;
    private egzo B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private int G;
    private int H;
    private boolean I;
    private int J;
    final ehhs a;
    final ehhs b;
    final ehfz c;
    Drawable d;
    int e;
    kxh f;
    private boolean g;
    private int h;
    private ViewGroup i;
    private View j;
    private View k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private final Rect q;
    private boolean r;
    private boolean s;
    private Drawable t;
    private int u;
    private boolean v;
    private ValueAnimator w;
    private long x;
    private final TimeInterpolator y;
    private final TimeInterpolator z;

    public egzt(Context context) {
        this(context, null);
    }

    private static int a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void c(AppBarLayout appBarLayout) {
        if (p()) {
            appBarLayout.e = false;
        }
    }

    static egzz f(View view) {
        egzz egzzVar = (egzz) view.getTag(R.id.view_offset_helper);
        if (egzzVar != null) {
            return egzzVar;
        }
        egzz egzzVar2 = new egzz(view);
        view.setTag(R.id.view_offset_helper, egzzVar2);
        return egzzVar2;
    }

    private final void k() {
        View view;
        if (this.g) {
            ViewGroup viewGroup = null;
            this.i = null;
            this.j = null;
            int i = this.h;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.i = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view2 = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                        parent = parent.getParent();
                        view2 = view2;
                    }
                    this.j = view2;
                }
            }
            if (this.i == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.i = viewGroup;
            }
            if (!this.r && (view = this.k) != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.k);
                }
            }
            if (this.r && this.i != null) {
                if (this.k == null) {
                    this.k = new View(getContext());
                }
                if (this.k.getParent() == null) {
                    this.i.addView(this.k, -1, -1);
                }
            }
            this.g = false;
        }
    }

    private final void l(Drawable drawable, int i, int i2) {
        m(drawable, this.i, i, i2);
    }

    private final void m(Drawable drawable, View view, int i, int i2) {
        if (p() && view != null && this.r) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private final void n(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int i5;
        int i6;
        int i7;
        if (!this.r || (view = this.k) == null) {
            return;
        }
        int i8 = 0;
        boolean z2 = view.isAttachedToWindow() && this.k.getVisibility() == 0;
        this.s = z2;
        if (!z2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        int layoutDirection = getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        View view2 = this.j;
        if (view2 == null) {
            view2 = this.i;
        }
        int d = d(view2);
        ehht.a(this, this.k, this.q);
        ViewGroup viewGroup = this.i;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i8 = toolbar.n;
            i6 = toolbar.o;
            i7 = toolbar.p;
            i5 = toolbar.q;
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i8 = toolbar2.getTitleMarginStart();
            i6 = toolbar2.getTitleMarginEnd();
            i7 = toolbar2.getTitleMarginTop();
            i5 = toolbar2.getTitleMarginBottom();
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        int i9 = this.q.left + (layoutDirection == 1 ? i6 : i8);
        Rect rect = this.q;
        if (layoutDirection != 1) {
            i8 = i6;
        }
        int i10 = rect.right - i8;
        int i11 = this.q.top + d + i7;
        int i12 = (this.q.bottom + d) - i5;
        if (TextUtils.isEmpty(this.b.k)) {
            this.a.p(i9, i11, i10, i12);
        } else {
            this.a.p(i9, i11, i10, (int) (i12 - this.b.a()));
            this.b.p(i9, (int) (i11 + this.a.a()), i10, i12);
        }
        int i13 = z3 ? this.n : this.l;
        int i14 = this.q.top + this.m;
        int i15 = (i3 - i) - (z3 ? this.l : this.n);
        int i16 = (i4 - i2) - this.o;
        if (TextUtils.isEmpty(this.b.k)) {
            this.a.t(i13, i14, i15, i16);
            this.a.m(z);
        } else {
            this.a.u(i13, i14, i15, (int) ((i16 - (this.b.d() + this.H)) - this.p), false);
            this.b.u(i13, (int) (i14 + this.a.d() + this.G + this.p), i15, i16, false);
            this.a.m(z);
            this.b.m(z);
        }
    }

    private final void o() {
        ViewGroup viewGroup = this.i;
        if (viewGroup == null || !this.r) {
            return;
        }
        CharSequence charSequence = null;
        CharSequence title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).s : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        if (TextUtils.isEmpty(this.a.k) && !TextUtils.isEmpty(title)) {
            i(title);
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 instanceof Toolbar) {
            charSequence = ((Toolbar) viewGroup2).t;
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            charSequence = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.b.k) || TextUtils.isEmpty(charSequence)) {
            return;
        }
        fJ(charSequence);
    }

    private final boolean p() {
        return this.D == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof egzr;
    }

    final int d(View view) {
        return ((getHeight() - f(view).a) - view.getHeight()) - ((egzr) view.getLayoutParams()).bottomMargin;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        k();
        if (this.i == null && (drawable = this.t) != null && this.u > 0) {
            drawable.mutate().setAlpha(this.u);
            this.t.draw(canvas);
        }
        if (this.r && this.s) {
            if (this.i != null && this.t != null && this.u > 0 && p()) {
                ehhs ehhsVar = this.a;
                if (ehhsVar.a < ehhsVar.c) {
                    int save = canvas.save();
                    canvas.clipRect(this.t.getBounds(), Region.Op.DIFFERENCE);
                    this.a.h(canvas);
                    this.b.h(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.a.h(canvas);
            this.b.h(canvas);
        }
        if (this.d == null || this.u <= 0) {
            return;
        }
        kxh kxhVar = this.f;
        int d = kxhVar != null ? kxhVar.d() : 0;
        if (d > 0) {
            this.d.setBounds(0, -this.e, getWidth(), d - this.e);
            this.d.mutate().setAlpha(this.u);
            this.d.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.t;
        if (drawable == null || this.u <= 0 || ((view2 = this.j) == null || view2 == this ? view != this.i : view != view2)) {
            z = false;
        } else {
            m(drawable, view, getWidth(), getHeight());
            this.t.mutate().setAlpha(this.u);
            this.t.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.t;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        ehhs ehhsVar = this.a;
        if (ehhsVar != null) {
            z |= ehhsVar.I(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final int e() {
        int i = this.A;
        if (i >= 0) {
            return i + this.E + this.G + this.H + this.J;
        }
        kxh kxhVar = this.f;
        int d = kxhVar != null ? kxhVar.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min(minimumHeight + minimumHeight + d, getHeight()) : getHeight() / 3;
    }

    public void fJ(CharSequence charSequence) {
        this.b.D(charSequence);
    }

    public final void g(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.t = mutate;
            if (mutate != null) {
                l(mutate, getWidth(), getHeight());
                this.t.setCallback(this);
                this.t.setAlpha(this.u);
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new egzr();
    }

    final void h(int i) {
        ViewGroup viewGroup;
        if (i != this.u) {
            if (this.t != null && (viewGroup = this.i) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.u = i;
            postInvalidateOnAnimation();
        }
    }

    public final void i(CharSequence charSequence) {
        this.a.D(charSequence);
        setContentDescription(this.r ? this.a.k : null);
    }

    final void j() {
        if (this.t == null && this.d == null) {
            return;
        }
        int height = getHeight() + this.e;
        int e = e();
        boolean z = height < e;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.v != z) {
            int i = height < e ? PrivateKeyType.INVALID : 0;
            if (z2) {
                k();
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.w = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.u ? this.y : this.z);
                    this.w.addUpdateListener(new egzq(this));
                } else if (valueAnimator.isRunning()) {
                    this.w.cancel();
                }
                this.w.setDuration(this.x);
                this.w.setIntValues(this.u, i);
                this.w.start();
            } else {
                h(i);
            }
            this.v = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.B == null) {
                this.B = new egzs(this);
            }
            appBarLayout.j(this.B);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.k(configuration);
        if (this.C != configuration.orientation && this.I && this.a.a == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.b == 0) {
                    appBarLayout.b = 2;
                }
            }
        }
        this.C = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        egzo egzoVar = this.B;
        if (egzoVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).l(egzoVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        kxh kxhVar = this.f;
        if (kxhVar != null) {
            int d = kxhVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d) {
                    int[] iArr = kvo.a;
                    childAt.offsetTopAndBottom(d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            f(getChildAt(i6)).b();
        }
        n(i, i2, i3, i4, false);
        o();
        j();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            f(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        egzt egztVar;
        k();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        kxh kxhVar = this.f;
        int d = kxhVar != null ? kxhVar.d() : 0;
        if ((mode == 0 || this.F) && d > 0) {
            this.E = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        o();
        if (!this.r || TextUtils.isEmpty(this.a.k)) {
            egztVar = this;
        } else {
            int measuredHeight = getMeasuredHeight();
            egztVar = this;
            egztVar.n(0, 0, getMeasuredWidth(), measuredHeight, true);
            int d2 = (int) (egztVar.E + egztVar.m + egztVar.a.d() + (TextUtils.isEmpty(egztVar.b.k) ? 0.0f : egztVar.p + egztVar.b.d()) + egztVar.o);
            if (d2 > measuredHeight) {
                egztVar.J = d2 - measuredHeight;
            } else {
                egztVar.J = 0;
            }
            if (egztVar.I) {
                ehhs ehhsVar = egztVar.a;
                if (ehhsVar.q > 1) {
                    int i3 = ehhsVar.i;
                    if (i3 > 1) {
                        egztVar.G = Math.round(ehhsVar.d()) * (i3 - 1);
                    } else {
                        egztVar.G = 0;
                    }
                }
                ehhs ehhsVar2 = egztVar.b;
                if (ehhsVar2.q > 1) {
                    int i4 = ehhsVar2.i;
                    if (i4 > 1) {
                        egztVar.H = Math.round(ehhsVar2.d()) * (i4 - 1);
                    } else {
                        egztVar.H = 0;
                    }
                }
            }
            int i5 = egztVar.J;
            int i6 = egztVar.G;
            int i7 = egztVar.H;
            if (i5 + i6 + i7 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight + i5 + i6 + i7, 1073741824));
            }
        }
        ViewGroup viewGroup = egztVar.i;
        if (viewGroup != null) {
            View view = egztVar.j;
            if (view == null || view == egztVar) {
                setMinimumHeight(a(viewGroup));
            } else {
                setMinimumHeight(a(view));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.t;
        if (drawable != null) {
            l(drawable, i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.d;
        boolean z = i == 0;
        if (drawable != null && drawable.isVisible() != z) {
            this.d.setVisible(z, false);
        }
        Drawable drawable2 = this.t;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.t.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t || drawable == this.d;
    }

    public egzt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new egzr();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new egzr(getContext(), attributeSet);
    }

    public egzt(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        int b;
        TextUtils.TruncateAt truncateAt;
        this.g = true;
        this.q = new Rect();
        this.A = -1;
        this.E = 0;
        this.G = 0;
        this.H = 0;
        this.J = 0;
        Context context2 = getContext();
        this.C = getResources().getConfiguration().orientation;
        ehhs ehhsVar = new ehhs(this);
        this.a = ehhsVar;
        ehhsVar.E(egyv.e);
        ehhsVar.K();
        ehfz ehfzVar = new ehfz(context2);
        this.c = ehfzVar;
        TypedArray a = ehiz.a(context2, attributeSet, egzx.c, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        int i2 = a.getInt(8, 8388691);
        int i3 = a.getInt(2, 8388627);
        ehhsVar.y(i2);
        ehhsVar.s(i3);
        int dimensionPixelSize = a.getDimensionPixelSize(9, 0);
        this.o = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        if (a.hasValue(12)) {
            this.l = a.getDimensionPixelSize(12, 0);
        }
        if (a.hasValue(11)) {
            this.n = a.getDimensionPixelSize(11, 0);
        }
        if (a.hasValue(13)) {
            this.m = a.getDimensionPixelSize(13, 0);
        }
        if (a.hasValue(10)) {
            this.o = a.getDimensionPixelSize(10, 0);
        }
        if (a.hasValue(14)) {
            this.p = a.getDimensionPixelSize(14, 0);
        }
        this.r = a.getBoolean(27, true);
        i(a.getText(25));
        ehhsVar.w(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        ehhsVar.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (a.hasValue(15)) {
            ehhsVar.w(a.getResourceId(15, 0));
        }
        if (a.hasValue(3)) {
            ehhsVar.q(a.getResourceId(3, 0));
        }
        if (a.hasValue(30)) {
            int i4 = a.getInt(30, -1);
            if (i4 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i4 != 1) {
                truncateAt = i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
            } else {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            }
            ehhsVar.j = truncateAt;
            ehhsVar.l();
        }
        if (a.hasValue(16)) {
            ehhsVar.x(ehmq.c(context2, a, 16));
        }
        if (a.hasValue(4)) {
            ehhsVar.r(ehmq.c(context2, a, 4));
        }
        this.A = a.getDimensionPixelSize(21, -1);
        if (a.hasValue(28)) {
            ehhsVar.v(a.getInt(28, 1));
        } else if (a.hasValue(19)) {
            ehhsVar.v(a.getInt(19, 1));
        }
        if (a.hasValue(29)) {
            ehhsVar.C(AnimationUtils.loadInterpolator(context2, a.getResourceId(29, 0)));
        }
        ehhs ehhsVar2 = new ehhs(this);
        this.b = ehhsVar2;
        ehhsVar2.E(egyv.e);
        ehhsVar2.K();
        if (a.hasValue(23)) {
            fJ(a.getText(23));
        }
        ehhsVar2.y(i2);
        ehhsVar2.s(i3);
        ehhsVar2.w(R.style.TextAppearance_AppCompat_Headline);
        ehhsVar2.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (a.hasValue(6)) {
            ehhsVar2.w(a.getResourceId(6, 0));
        }
        if (a.hasValue(0)) {
            ehhsVar2.q(a.getResourceId(0, 0));
        }
        if (a.hasValue(7)) {
            ehhsVar2.x(ehmq.c(context2, a, 7));
        }
        if (a.hasValue(1)) {
            ehhsVar2.r(ehmq.c(context2, a, 1));
        }
        if (a.hasValue(24)) {
            ehhsVar2.v(a.getInt(24, 1));
        }
        if (a.hasValue(29)) {
            ehhsVar2.C(AnimationUtils.loadInterpolator(context2, a.getResourceId(29, 0)));
        }
        this.x = a.getInt(20, 600);
        this.y = ehjz.a(context2, R.attr.motionEasingStandardInterpolator, egyv.c);
        this.z = ehjz.a(context2, R.attr.motionEasingStandardInterpolator, egyv.d);
        g(a.getDrawable(5));
        Drawable drawable = a.getDrawable(22);
        Drawable drawable2 = this.d;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.d = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.d.setState(getDrawableState());
                }
                this.d.setLayoutDirection(getLayoutDirection());
                this.d.setVisible(getVisibility() == 0, false);
                this.d.setCallback(this);
                this.d.setAlpha(this.u);
            }
            postInvalidateOnAnimation();
        }
        this.D = a.getInt(26, 0);
        boolean p = p();
        ehhsVar.b = p;
        ehhsVar2.b = p;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (p && this.t == null) {
            ColorStateList g = ehdr.g(getContext(), R.attr.colorSurfaceContainer);
            if (g != null) {
                b = g.getDefaultColor();
            } else {
                b = ehfzVar.b(ehfzVar.b, getResources().getDimension(R.dimen.design_appbar_elevation));
            }
            g(new ColorDrawable(b));
        }
        this.h = a.getResourceId(31, -1);
        this.F = a.getBoolean(18, false);
        this.I = a.getBoolean(17, false);
        a.recycle();
        setWillNotDraw(false);
        egzp egzpVar = new egzp(this);
        int[] iArr = kvo.a;
        kvd.k(this, egzpVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new egzr(layoutParams);
    }
}
