package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.kt;
import defpackage.kvo;
import defpackage.kzd;
import defpackage.lgl;
import defpackage.lht;
import defpackage.lhu;
import defpackage.mk;
import defpackage.qy;
import defpackage.ry;
import defpackage.td;
import defpackage.ym;
import defpackage.yn;
import defpackage.yo;
import defpackage.yt;
import defpackage.zu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property m = new ym(Float.class);
    private static final int[] n = {R.attr.state_checked};
    private float A;
    private float B;
    private VelocityTracker C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final ry Q;
    private qy R;
    private yn S;
    private final Rect T;
    public Drawable a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public int i;
    public float j;
    public boolean k;
    ObjectAnimator l;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private int y;
    private int z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private final int j() {
        return (int) (((zu.a(this) ? 1.0f - this.j : this.j) * k()) + 0.5f);
    }

    private final int k() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.T;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect b = drawable2 != null ? td.b(drawable2) : td.a;
        return ((((this.E - this.G) - rect.left) - rect.right) - b.left) - b.right;
    }

    private final qy l() {
        if (this.R == null) {
            this.R = new qy(this);
        }
        return this.R;
    }

    private final Layout m(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.L, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.L)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence n(CharSequence charSequence) {
        lht lhtVar = l().a.a;
        TransformationMethod transformationMethod = this.P;
        if (!lhu.a()) {
            transformationMethod = ((lhu) lhtVar).a.a(transformationMethod);
        }
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    private final void o() {
        if (this.S == null && ((lhu) this.R.a.a).a.b && lgl.h()) {
            lgl c = lgl.c();
            int b = c.b();
            if (b == 3 || b == 0) {
                yn ynVar = new yn(this);
                this.S = ynVar;
                c.f(ynVar);
            }
        }
    }

    private final boolean p() {
        return this.j > 0.5f;
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.o) {
                Drawable mutate = drawable.mutate();
                this.a = mutate;
                if (this.d) {
                    mutate.setTintList(this.b);
                }
                if (this.o) {
                    this.a.setTintMode(this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.p) {
                Drawable mutate = drawable.mutate();
                this.e = mutate;
                if (this.h) {
                    mutate.setTintList(this.f);
                }
                if (this.p) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        h(this.t);
        g(this.v);
        requestLayout();
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.v;
            if (charSequence == null) {
                charSequence = getResources().getString(com.google.android.apps.messaging.R.string.abc_capital_off);
            }
            kvo.u(this, charSequence);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.H;
        int i4 = this.I;
        int i5 = this.J;
        int i6 = this.K;
        int j = j() + i3;
        Drawable drawable = this.a;
        Rect b = drawable != null ? td.b(drawable) : td.a;
        Rect rect = this.T;
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            j += rect.left;
            if (b != null) {
                if (b.left > rect.left) {
                    i3 += b.left - rect.left;
                }
                i = b.top > rect.top ? (b.top - rect.top) + i4 : i4;
                if (b.right > rect.right) {
                    i5 -= b.right - rect.right;
                }
                if (b.bottom > rect.bottom) {
                    i2 = i6 - (b.bottom - rect.bottom);
                    this.e.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.e.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = j - rect.left;
            int i8 = j + this.G + rect.right;
            this.a.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.t;
            if (charSequence == null) {
                charSequence = getResources().getString(com.google.android.apps.messaging.R.string.abc_capital_on);
            }
            kvo.u(this, charSequence);
        }
    }

    public final void f(Typeface typeface) {
        if ((this.L.getTypeface() == null || this.L.getTypeface().equals(typeface)) && (this.L.getTypeface() != null || typeface == null)) {
            return;
        }
        this.L.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void g(CharSequence charSequence) {
        this.v = charSequence;
        this.w = n(charSequence);
        this.O = null;
        if (this.x) {
            o();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!zu.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (zu.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kzd.a(super.getCustomSelectionActionModeCallback());
    }

    public final void h(CharSequence charSequence) {
        this.t = charSequence;
        this.u = n(charSequence);
        this.N = null;
        if (this.x) {
            o();
        }
    }

    public final void i(float f) {
        this.j = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.l.end();
        this.l = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, n);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.e;
        Rect rect = this.T;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.I;
        int i2 = this.K;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b = td.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = p() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.t : this.v;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.a != null) {
            Rect rect = this.T;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = td.b(this.a);
            i5 = Math.max(0, b.left - rect.left);
            i10 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        if (zu.a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.E + i6) - i5) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i6 = (width - this.E) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = (getPaddingTop() + getHeight()) - getPaddingBottom();
            i7 = this.F;
            i8 = (paddingTop / 2) - (i7 / 2);
        } else {
            if (gravity == 80) {
                i9 = getHeight() - getPaddingBottom();
                i8 = i9 - this.F;
                this.H = i6;
                this.I = i8;
                this.K = i9;
                this.J = width;
            }
            i8 = getPaddingTop();
            i7 = this.F;
        }
        i9 = i7 + i8;
        this.H = i6;
        this.I = i8;
        this.K = i9;
        this.J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.x) {
            if (this.N == null) {
                this.N = m(this.u);
            }
            if (this.O == null) {
                this.O = m(this.w);
            }
        }
        Rect rect = this.T;
        Drawable drawable = this.a;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.x) {
            int max = Math.max(this.N.getWidth(), this.O.getWidth());
            int i8 = this.q;
            i5 = max + i8 + i8;
        } else {
            i5 = 0;
        }
        this.G = Math.max(i5, i3);
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.e.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect b = td.b(drawable3);
            i9 = Math.max(i9, b.left);
            i10 = Math.max(i10, b.right);
        }
        if (this.k) {
            int i11 = this.i;
            int i12 = this.G;
            i6 = Math.max(i11, i12 + i12 + i9 + i10);
        } else {
            i6 = this.i;
        }
        int max2 = Math.max(i7, i4);
        this.E = i6;
        this.F = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.t : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        l().b(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            e();
        } else {
            d();
        }
        float f = true != isChecked ? 0.0f : 1.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.l;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            i(f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) m, f);
        this.l = ofFloat;
        ofFloat.setDuration(250L);
        this.l.setAutoCancel(true);
        this.l.start();
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kzd.b(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(l().c(inputFilterArr));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.e;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface create;
        this.b = null;
        this.c = null;
        this.d = false;
        this.o = false;
        this.f = null;
        this.g = null;
        this.h = false;
        this.p = false;
        this.C = VelocityTracker.obtain();
        this.k = true;
        this.T = new Rect();
        yo.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        yt l = yt.l(context, attributeSet, kt.y, i, 0);
        kvo.o(this, context, kt.y, attributeSet, l.b, i, 0);
        Drawable h = l.h(2);
        this.a = h;
        if (h != null) {
            h.setCallback(this);
        }
        Drawable h2 = l.h(11);
        this.e = h2;
        if (h2 != null) {
            h2.setCallback(this);
        }
        h(l.m(0));
        g(l.m(1));
        this.x = l.p(3, true);
        this.q = l.b(8, 0);
        this.i = l.b(5, 0);
        this.r = l.b(6, 0);
        this.s = l.p(4, false);
        ColorStateList g = l.g(9);
        if (g != null) {
            this.b = g;
            this.d = true;
        }
        PorterDuff.Mode a = td.a(l.c(10, -1), null);
        if (this.c != a) {
            this.c = a;
            this.o = true;
        }
        if (this.d || this.o) {
            a();
        }
        ColorStateList g2 = l.g(12);
        if (g2 != null) {
            this.f = g2;
            this.h = true;
        }
        PorterDuff.Mode a2 = td.a(l.c(13, -1), null);
        if (this.g != a2) {
            this.g = a2;
            this.p = true;
        }
        if (this.h || this.p) {
            b();
        }
        int f = l.f(7, 0);
        if (f != 0) {
            yt j = yt.j(context, f, kt.z);
            ColorStateList g3 = j.g(3);
            if (g3 != null) {
                this.M = g3;
            } else {
                this.M = getTextColors();
            }
            int b = j.b(0, 0);
            if (b != 0) {
                float f2 = b;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int c = j.c(1, -1);
            int c2 = j.c(2, -1);
            if (c == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (c != 2) {
                typeface = c != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (c2 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(c2);
                } else {
                    create = Typeface.create(typeface, c2);
                }
                f(create);
                int i2 = (~(create != null ? create.getStyle() : 0)) & c2;
                textPaint.setFakeBoldText(1 == (i2 & 1));
                textPaint.setTextSkewX((2 & i2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                f(typeface);
            }
            if (j.p(14, false)) {
                this.P = new mk(getContext());
            } else {
                this.P = null;
            }
            h(this.t);
            g(this.v);
            j.o();
        }
        ry ryVar = new ry(this);
        this.Q = ryVar;
        ryVar.h(attributeSet, i);
        l.o();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        l().a(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
