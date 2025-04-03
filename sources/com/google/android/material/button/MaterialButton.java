package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.ehbr;
import defpackage.ehbt;
import defpackage.ehbv;
import defpackage.ehbw;
import defpackage.ehmx;
import defpackage.ehop;
import defpackage.ehoq;
import defpackage.ehow;
import defpackage.ehph;
import defpackage.ku;
import defpackage.qo;
import defpackage.qp;
import defpackage.yr;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialButton extends qp implements Checkable, ehph {
    private static final int[] k = {R.attr.state_checkable};
    private static final int[] l = {R.attr.state_checked};
    public final ehbv b;
    public ColorStateList c;
    public Drawable d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    int j;
    private final LinkedHashSet m;
    private PorterDuff.Mode n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final int a() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private final void n() {
        if (p()) {
            setCompoundDrawablesRelative(this.d, null, null, null);
        } else if (o()) {
            setCompoundDrawablesRelative(null, null, this.d, null);
        } else if (q()) {
            setCompoundDrawablesRelative(null, this.d, null, null);
        }
    }

    private final boolean o() {
        int i = this.f;
        return i == 3 || i == 4;
    }

    private final boolean p() {
        int i = this.f;
        return i == 1 || i == 2;
    }

    private final boolean q() {
        int i = this.f;
        return i == 16 || i == 32;
    }

    final String b() {
        if (TextUtils.isEmpty(null)) {
            return (true != l() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    public final void c(Drawable drawable) {
        if (this.d != drawable) {
            this.d = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void d(int i) {
        c(i != 0 ? ku.a(getContext(), i) : null);
    }

    public final void e(ColorStateList colorStateList) {
        if (m()) {
            ehbv ehbvVar = this.b;
            if (ehbvVar.n != colorStateList) {
                ehbvVar.n = colorStateList;
                if (ehbvVar.a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) ehbvVar.a.getBackground()).setColor(ehmx.b(colorStateList));
                }
            }
        }
    }

    @Override // defpackage.ehph
    public final void fy(ehow ehowVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.b.d(ehowVar);
    }

    public final void g(ColorStateList colorStateList) {
        if (m()) {
            ehbv ehbvVar = this.b;
            if (ehbvVar.m != colorStateList) {
                ehbvVar.m = colorStateList;
                ehop a = ehbvVar.a();
                ehop b = ehbvVar.b();
                if (a != null) {
                    a.U(ehbvVar.j, ehbvVar.m);
                    if (b != null) {
                        b.T(ehbvVar.j, 0);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        yr yrVar;
        if (m()) {
            return this.b.l;
        }
        qo qoVar = this.a;
        if (qoVar == null || (yrVar = qoVar.a) == null) {
            return null;
        }
        return yrVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        yr yrVar;
        if (m()) {
            return this.b.k;
        }
        qo qoVar = this.a;
        if (qoVar == null || (yrVar = qoVar.a) == null) {
            return null;
        }
        return yrVar.b;
    }

    public final void h(ColorStateList colorStateList) {
        if (m()) {
            ehbv ehbvVar = this.b;
            if (ehbvVar.l != colorStateList) {
                ehbvVar.l = colorStateList;
                if (ehbvVar.a() != null) {
                    ehbvVar.a().setTintList(ehbvVar.l);
                    return;
                }
                return;
            }
            return;
        }
        qo qoVar = this.a;
        if (qoVar != null) {
            if (qoVar.a == null) {
                qoVar.a = new yr();
            }
            yr yrVar = qoVar.a;
            yrVar.a = colorStateList;
            yrVar.d = true;
            qoVar.a();
        }
    }

    public final void i(PorterDuff.Mode mode) {
        if (m()) {
            ehbv ehbvVar = this.b;
            if (ehbvVar.k != mode) {
                ehbvVar.k = mode;
                if (ehbvVar.a() == null || ehbvVar.k == null) {
                    return;
                }
                ehbvVar.a().setTintMode(ehbvVar.k);
                return;
            }
            return;
        }
        qo qoVar = this.a;
        if (qoVar != null) {
            if (qoVar.a == null) {
                qoVar.a = new yr();
            }
            yr yrVar = qoVar.a;
            yrVar.b = mode;
            yrVar.c = true;
            qoVar.a();
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.r;
    }

    public final void j(boolean z) {
        Drawable drawable = this.d;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.d = mutate;
            mutate.setTintList(this.c);
            PorterDuff.Mode mode = this.n;
            if (mode != null) {
                this.d.setTintMode(mode);
            }
            int i = this.e;
            if (i == 0) {
                i = this.d.getIntrinsicWidth();
            }
            int i2 = this.e;
            if (i2 == 0) {
                i2 = this.d.getIntrinsicHeight();
            }
            Drawable drawable2 = this.d;
            int i3 = this.o;
            int i4 = this.p;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.d.setVisible(true, z);
        }
        if (z) {
            n();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!p() || drawable3 == this.d) && ((!o() || drawable5 == this.d) && (!q() || drawable4 == this.d))) {
            return;
        }
        n();
    }

    public final void k(int i, int i2) {
        Layout.Alignment alignment;
        int min;
        if (this.d == null || getLayout() == null) {
            return;
        }
        if (!p() && !o()) {
            if (q()) {
                this.o = 0;
                if (this.f == 16) {
                    this.p = 0;
                    j(false);
                    return;
                }
                int i3 = this.e;
                if (i3 == 0) {
                    i3 = this.d.getIntrinsicHeight();
                }
                if (getLineCount() > 1) {
                    min = getLayout().getHeight();
                } else {
                    TextPaint paint = getPaint();
                    String charSequence = getText().toString();
                    if (getTransformationMethod() != null) {
                        charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                    }
                    Rect rect = new Rect();
                    paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                    min = Math.min(rect.height(), getLayout().getHeight());
                }
                int max = Math.max(0, (((((i2 - min) - getPaddingTop()) - i3) - this.q) - getPaddingBottom()) / 2);
                if (this.p != max) {
                    this.p = max;
                    j(false);
                    return;
                }
                return;
            }
            return;
        }
        this.p = 0;
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            int gravity = getGravity() & 8388615;
            if (gravity != 1) {
                if (gravity != 5 && gravity != 8388613) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        int i4 = this.f;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && alignment == Layout.Alignment.ALIGN_NORMAL) || (this.f == 4 && alignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.o = 0;
            j(false);
            return;
        }
        int i5 = this.e;
        if (i5 == 0) {
            i5 = this.d.getIntrinsicWidth();
        }
        int a = ((((i - a()) - getPaddingEnd()) - i5) - this.q) - getPaddingStart();
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            a /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f == 4)) {
            a = -a;
        }
        if (this.o != a) {
            this.o = a;
            j(false);
        }
    }

    public final boolean l() {
        ehbv ehbvVar = this.b;
        return ehbvVar != null && ehbvVar.r;
    }

    public final boolean m() {
        ehbv ehbvVar = this.b;
        return (ehbvVar == null || ehbvVar.p) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            ehoq.d(this, this.b.a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (l()) {
            mergeDrawableStates(onCreateDrawableState, k);
        }
        if (this.r) {
            mergeDrawableStates(onCreateDrawableState, l);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.qp, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(b());
        accessibilityEvent.setChecked(this.r);
    }

    @Override // defpackage.qp, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(b());
        accessibilityNodeInfo.setCheckable(l());
        accessibilityNodeInfo.setChecked(this.r);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.qp, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        k(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.t != i6) {
            this.t = i6;
            this.g = -1.0f;
        }
        if (this.g == -1.0f) {
            this.g = i3 - i;
        }
        if (this.j == -1) {
            Drawable drawable = this.d;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.q;
                int i8 = this.e;
                if (i8 == 0) {
                    i8 = drawable.getIntrinsicWidth();
                }
                i5 = i7 + i8;
            }
            this.j = (getMeasuredWidth() - a()) - i5;
        }
        if (this.h == -1) {
            this.h = getPaddingStart();
        }
        if (this.i == -1) {
            this.i = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ehbt)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ehbt ehbtVar = (ehbt) parcelable;
        super.onRestoreInstanceState(ehbtVar.d);
        setChecked(ehbtVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ehbt ehbtVar = new ehbt(super.onSaveInstanceState());
        ehbtVar.a = this.r;
        return ehbtVar;
    }

    @Override // defpackage.qp, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.b.s) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.d != null) {
            if (this.d.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!m()) {
            super.setBackgroundColor(i);
            return;
        }
        ehbv ehbvVar = this.b;
        if (ehbvVar.a() != null) {
            ehbvVar.a().setTint(i);
        }
    }

    @Override // defpackage.qp, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.b.c();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.qp, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ku.a(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        h(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        i(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!l() || this.r == z) {
            return;
        }
        this.r = z;
        refreshDrawableState();
        if (getParent() instanceof ehbw) {
            throw null;
        }
        if (this.s) {
            return;
        }
        this.s = true;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((ehbr) it.next()).a();
        }
        this.s = false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (m()) {
            this.b.a().N(f);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.g = -1.0f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.r);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r24, android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
