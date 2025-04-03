package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.ehdg;
import defpackage.ehdh;
import defpackage.ehhl;
import defpackage.ehib;
import defpackage.ehmu;
import defpackage.ehmv;
import defpackage.ehmx;
import defpackage.ehoq;
import defpackage.ehow;
import defpackage.ehph;
import defpackage.kxt;
import defpackage.kxu;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class Chip extends AppCompatCheckBox implements ehdg, ehph, ehib {
    private static final int a = 2132151493;
    public ehdh e;
    public CompoundButton.OnCheckedChangeListener f;
    public boolean g;
    public boolean h;
    public int i;
    public final Rect j;
    public ehhl k;
    private InsetDrawable l;
    private RippleDrawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private final RectF r;
    private final ehmv s;
    public static final Rect d = new Rect();
    private static final int[] b = {R.attr.state_selected};
    private static final int[] c = {R.attr.state_checkable};

    public Chip(Context context) {
        this(context, null);
    }

    private final void e() {
        if (this.l != null) {
            this.l = null;
            setMinWidth(0);
            ehdh ehdhVar = this.e;
            setMinHeight((int) (ehdhVar != null ? ehdhVar.b : 0.0f));
            n();
        }
    }

    private final void l(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    private final void m(boolean z) {
        if (this.o != z) {
            this.o = z;
            refreshDrawableState();
        }
    }

    private final void n() {
        RippleDrawable rippleDrawable = new RippleDrawable(ehmx.b(this.e.c), d(), null);
        this.m = rippleDrawable;
        setBackground(rippleDrawable);
        o();
    }

    private final void o() {
        ehdh ehdhVar;
        if (TextUtils.isEmpty(getText()) || (ehdhVar = this.e) == null) {
            return;
        }
        float b2 = ehdhVar.l + ehdhVar.k + ehdhVar.b();
        int a2 = (int) (ehdhVar.i + ehdhVar.j + ehdhVar.a());
        int i = (int) b2;
        if (this.l != null) {
            Rect rect = new Rect();
            this.l.getPadding(rect);
            a2 += rect.left;
            i += rect.right;
        }
        setPaddingRelative(a2, getPaddingTop(), i, getPaddingBottom());
    }

    private final void p() {
        TextPaint paint = getPaint();
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            paint.drawableState = ehdhVar.getState();
        }
        ehdh ehdhVar2 = this.e;
        ehmu i = ehdhVar2 != null ? ehdhVar2.i() : null;
        if (i != null) {
            i.c(getContext(), paint, this.s);
        }
    }

    @Override // defpackage.ehdg
    public final void a() {
        i(this.i);
        requestLayout();
        invalidateOutline();
    }

    public final RectF c() {
        this.r.setEmpty();
        j();
        return this.r;
    }

    public final Drawable d() {
        InsetDrawable insetDrawable = this.l;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ehdh ehdhVar = this.e;
        if (ehdhVar == null || !ehdh.s(ehdhVar.g)) {
            return;
        }
        ehdh ehdhVar2 = this.e;
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.g) {
            i = isEnabled + 1;
        }
        int i2 = i;
        if (this.p) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.o) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.g) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.p) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.o) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        if (ehdhVar2.t(iArr)) {
            invalidate();
        }
    }

    @Override // defpackage.ehph
    public final void fy(ehow ehowVar) {
        this.e.fy(ehowVar);
    }

    public final boolean g() {
        ehdh ehdhVar = this.e;
        return ehdhVar != null && ehdhVar.h;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (!g()) {
            return !isClickable() ? "android.view.View" : "android.widget.Button";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).c()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            return ehdhVar.n;
        }
        return null;
    }

    @Override // defpackage.ehib
    public final void h(ehhl ehhlVar) {
        this.k = ehhlVar;
    }

    public final void i(int i) {
        this.i = i;
        if (!this.h) {
            if (this.l != null) {
                e();
                return;
            } else {
                n();
                return;
            }
        }
        int max = Math.max(0, i - this.e.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.l != null) {
                e();
                return;
            } else {
                n();
                return;
            }
        }
        int i2 = max2 > 0 ? max2 >> 1 : 0;
        int i3 = max > 0 ? max >> 1 : 0;
        if (this.l != null) {
            Rect rect = new Rect();
            this.l.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                n();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.l = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        n();
    }

    public final void j() {
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            ehdhVar.d();
        }
    }

    public final void k() {
        playSoundEffect(0);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ehoq.d(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        if (g()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            l(c().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            l(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            kxu kxuVar = new kxu(accessibilityNodeInfo);
            if (chipGroup.e) {
                i = 0;
                for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.b(i2)) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            i = -1;
            Object tag = getTag(com.google.android.apps.messaging.R.id.row_index_key);
            kxuVar.u(kxt.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon systemIcon;
        if (!c().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        return systemIcon;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.q != i) {
            this.q = i;
            o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.c()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L2d
            r4 = 2
            if (r0 == r4) goto L23
            r1 = 3
            if (r0 == r1) goto L21
            goto L41
        L21:
            r0 = r2
            goto L35
        L23:
            boolean r0 = r5.o
            if (r0 == 0) goto L41
            if (r1 != 0) goto L47
            r5.m(r2)
            return r3
        L2d:
            boolean r0 = r5.o
            if (r0 == 0) goto L21
            r5.k()
            r0 = r3
        L35:
            r5.m(r2)
            if (r0 != 0) goto L47
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.m(r3)
            goto L47
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
        L47:
            return r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable == d() || drawable == this.m) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == d() || drawable == this.m) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        ehdh ehdhVar = this.e;
        if (ehdhVar == null) {
            this.n = z;
        } else if (ehdhVar.h) {
            super.setChecked(z);
        }
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable2, null, drawable4);
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            ehdhVar.N(f);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            ehdhVar.n = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public final void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            ehdhVar.p = i;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ehdh ehdhVar = this.e;
        if (ehdhVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(true != ehdhVar.o ? charSequence : null, bufferType);
        ehdh ehdhVar2 = this.e;
        if (ehdhVar2 != null) {
            ehdhVar2.p(charSequence);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            ehdhVar.r(i);
        }
        p();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            ehmu i2 = ehdhVar.i();
            if (i2 != null) {
                i2.l = applyDimension;
                ehdhVar.m.a.setTextSize(applyDimension);
                ehdhVar.e();
            }
        }
        p();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ehdh ehdhVar = this.e;
        if (ehdhVar != null) {
            ehdhVar.r(i);
        }
        p();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }
}
