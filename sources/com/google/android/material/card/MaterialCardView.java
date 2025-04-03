package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.clz;
import defpackage.ehca;
import defpackage.ehcb;
import defpackage.ehdr;
import defpackage.ehiz;
import defpackage.ehmq;
import defpackage.ehoq;
import defpackage.ehow;
import defpackage.ehph;
import defpackage.ehua;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialCardView extends CardView implements Checkable, ehph {
    private static final int[] g = {R.attr.state_checkable};
    private static final int[] h = {R.attr.state_checked};
    private boolean i;
    public final ehca t;
    public boolean u;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // defpackage.ehph
    public final void fy(ehow ehowVar) {
        RectF rectF = new RectF();
        rectF.set(this.t.d.getBounds());
        setClipToOutline(ehowVar.g(rectF));
        this.t.g(ehowVar);
    }

    @Override // androidx.cardview.widget.CardView
    public final float gt() {
        return this.t.d.w();
    }

    @Override // androidx.cardview.widget.CardView
    public final void gu(int i) {
        this.t.e(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public final void gv(float f) {
        super.gv(f);
        this.t.j();
    }

    @Override // androidx.cardview.widget.CardView
    public final void gw(float f) {
        super.gw(f);
        ehca ehcaVar = this.t;
        ehcaVar.g(ehcaVar.n.d(f));
        ehcaVar.j.invalidateSelf();
        if (ehcaVar.o() || ehcaVar.n()) {
            ehcaVar.i();
        }
        if (ehcaVar.o()) {
            if (!ehcaVar.r) {
                super.setBackgroundDrawable(ehcaVar.d(ehcaVar.d));
            }
            ehcaVar.b.setForeground(ehcaVar.d(ehcaVar.j));
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t.h();
        ehoq.d(this, this.t.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (p()) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        if (this.u) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.u);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(p());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.u);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ehca ehcaVar = this.t;
        if (ehcaVar.q != null) {
            if (ehcaVar.b.a) {
                float b = ehcaVar.b();
                i3 = (int) Math.ceil(b + b);
                float a = ehcaVar.a();
                i4 = (int) Math.ceil(a + a);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i5 = ehcaVar.m() ? ((measuredWidth - ehcaVar.f) - ehcaVar.g) - i4 : ehcaVar.f;
            int i6 = ehcaVar.l() ? ehcaVar.f : ((measuredHeight - ehcaVar.f) - ehcaVar.g) - i3;
            int i7 = ehcaVar.m() ? ehcaVar.f : ((measuredWidth - ehcaVar.f) - ehcaVar.g) - i4;
            int i8 = ehcaVar.l() ? ((measuredHeight - ehcaVar.f) - ehcaVar.g) - i3 : ehcaVar.f;
            int layoutDirection = ehcaVar.b.getLayoutDirection();
            ehcaVar.q.setLayerInset(2, layoutDirection != 1 ? i5 : i7, i8, layoutDirection == 1 ? i5 : i7, i6);
        }
    }

    public final boolean p() {
        ehca ehcaVar = this.t;
        return ehcaVar != null && ehcaVar.s;
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            if (!this.t.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.t.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.u != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        ehca ehcaVar = this.t;
        if (ehcaVar != null) {
            ehcaVar.h();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        ehca ehcaVar;
        Drawable drawable;
        if (p() && isEnabled()) {
            this.u = !this.u;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26 && (drawable = (ehcaVar = this.t).p) != null) {
                Rect bounds = drawable.getBounds();
                int i = bounds.bottom;
                ehcaVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                ehcaVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            this.t.f(this.u, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.u = false;
        this.i = true;
        TypedArray a = ehiz.a(getContext(), attributeSet, ehcb.b, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CardView, new int[0]);
        ehca ehcaVar = new ehca(this, attributeSet, i);
        this.t = ehcaVar;
        ehcaVar.e(((clz) this.f.a).e);
        ehcaVar.c.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        ehcaVar.i();
        ehcaVar.o = ehmq.c(ehcaVar.b.getContext(), a, 11);
        if (ehcaVar.o == null) {
            ehcaVar.o = ColorStateList.valueOf(-1);
        }
        ehcaVar.i = a.getDimensionPixelSize(12, 0);
        boolean z = a.getBoolean(0, false);
        ehcaVar.s = z;
        ehcaVar.b.setLongClickable(z);
        ehcaVar.m = ehmq.c(ehcaVar.b.getContext(), a, 6);
        Drawable e = ehmq.e(ehcaVar.b.getContext(), a, 2);
        if (e != null) {
            ehcaVar.k = e.mutate();
            ehcaVar.k.setTintList(ehcaVar.m);
            ehcaVar.f(ehcaVar.b.u, false);
        } else {
            ehcaVar.k = ehca.a;
        }
        LayerDrawable layerDrawable = ehcaVar.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.apps.messaging.R.id.mtrl_card_checked_layer_id, ehcaVar.k);
        }
        ehcaVar.g = a.getDimensionPixelSize(5, 0);
        ehcaVar.f = a.getDimensionPixelSize(4, 0);
        ehcaVar.h = a.getInteger(3, 8388661);
        ehcaVar.l = ehmq.c(ehcaVar.b.getContext(), a, 7);
        if (ehcaVar.l == null) {
            ehcaVar.l = ColorStateList.valueOf(ehdr.b(ehcaVar.b, com.google.android.apps.messaging.R.attr.colorControlHighlight));
        }
        ColorStateList c = ehmq.c(ehcaVar.b.getContext(), a, 1);
        ehcaVar.e.O(c == null ? ColorStateList.valueOf(0) : c);
        Drawable drawable = ehcaVar.p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(ehcaVar.l);
        }
        ehcaVar.j();
        ehcaVar.k();
        super.setBackgroundDrawable(ehcaVar.d(ehcaVar.d));
        ehcaVar.j = ehcaVar.p() ? ehcaVar.c() : ehcaVar.e;
        ehcaVar.b.setForeground(ehcaVar.d(ehcaVar.j));
        a.recycle();
    }
}
