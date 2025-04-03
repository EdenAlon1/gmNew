package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.cpn;
import defpackage.egza;
import defpackage.ehgb;
import defpackage.ehgc;
import defpackage.ehgh;
import defpackage.ehgv;
import defpackage.ehgw;
import defpackage.ehgx;
import defpackage.ehhg;
import defpackage.ehhh;
import defpackage.ehhi;
import defpackage.ehhk;
import defpackage.ehht;
import defpackage.ehiz;
import defpackage.ehjg;
import defpackage.ehjh;
import defpackage.ehmq;
import defpackage.ehmx;
import defpackage.ehop;
import defpackage.ehoq;
import defpackage.ehow;
import defpackage.ehph;
import defpackage.ehrh;
import defpackage.ehua;
import defpackage.kks;
import defpackage.kkt;
import defpackage.kkw;
import defpackage.ksw;
import defpackage.kvo;
import defpackage.ra;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FloatingActionButton extends ehjh implements ehgb, ehph, kks {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private final ra m;
    private final ehgc n;
    private ehhg o;

    /* compiled from: PG */
    protected static class BaseBehavior<T extends FloatingActionButton> extends kkt<T> {
        private Rect a;
        private final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private static boolean t(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof kkw) {
                return ((kkw) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean u(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((kkw) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0;
        }

        private final boolean v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!u(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ehht.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.f()) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.e(false);
            return true;
        }

        private final boolean w(View view, FloatingActionButton floatingActionButton) {
            if (!u(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((kkw) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.e(false);
            return true;
        }

        @Override // defpackage.kkt
        public final void a(kkw kkwVar) {
            if (kkwVar.h == 0) {
                kkwVar.h = 80;
            }
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List a = coordinatorLayout.a(floatingActionButton);
            int size = a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) a.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (t(view2) && w(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            kkw kkwVar = (kkw) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - kkwVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= kkwVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - kkwVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= kkwVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int[] iArr = kvo.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            int[] iArr2 = kvo.a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (t(view2)) {
                w(view2, floatingActionButton);
            }
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehhk.d);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    private final ehhg i() {
        if (this.o == null) {
            this.o = new ehhi(this, new ehgv(this));
        }
        return this.o;
    }

    @Override // defpackage.kks
    public final kkt a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    public final void d(boolean z) {
        ehhg i = i();
        if (i.B.getVisibility() == 0) {
            if (i.A == 1) {
                return;
            }
        } else if (i.A != 2) {
            return;
        }
        Animator animator = i.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!i.n()) {
            i.B.g(true != z ? 4 : 8, z);
            return;
        }
        egza egzaVar = i.x;
        AnimatorSet c = egzaVar != null ? i.c(egzaVar, 0.0f, 0.0f, 0.0f) : i.d(0.0f, 0.4f, 0.4f, ehhg.d, ehhg.e);
        c.addListener(new ehgw(i, z));
        c.start();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        i();
        getDrawableState();
    }

    public final void e(boolean z) {
        ehhg i = i();
        if (i.B.getVisibility() != 0) {
            if (i.A == 2) {
                return;
            }
        } else if (i.A != 1) {
            return;
        }
        Animator animator = i.v;
        if (animator != null) {
            animator.cancel();
        }
        egza egzaVar = i.w;
        if (!i.n()) {
            i.B.g(0, z);
            i.B.setAlpha(1.0f);
            i.B.setScaleY(1.0f);
            i.B.setScaleX(1.0f);
            i.h(1.0f);
            return;
        }
        if (i.B.getVisibility() != 0) {
            i.B.setAlpha(0.0f);
            FloatingActionButton floatingActionButton = i.B;
            float f = egzaVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            i.B.setScaleX(f);
            i.h(f);
        }
        egza egzaVar2 = i.w;
        AnimatorSet c = egzaVar2 != null ? i.c(egzaVar2, 1.0f, 1.0f, 1.0f) : i.d(1.0f, 1.0f, 1.0f, ehhg.b, ehhg.c);
        c.addListener(new ehgx(i, z));
        c.start();
    }

    @Override // defpackage.ehph
    public final void fy(ehow ehowVar) {
        i().i(ehowVar);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ehhg i = i();
        ehop ehopVar = i.m;
        if (ehopVar != null) {
            ehoq.d(i.B, ehopVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ehhg i = i();
        i.B.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = i.C;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int b = b();
        this.a = (b - this.k) / 2;
        i().k();
        int min = Math.min(View.resolveSize(b, i), View.resolveSize(b, i2));
        setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ehrh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ehrh ehrhVar = (ehrh) parcelable;
        super.onRestoreInstanceState(ehrhVar.d);
        ehgc ehgcVar = this.n;
        Bundle bundle = (Bundle) ehrhVar.a.get("expandableWidgetHelper");
        ksw.h(bundle);
        ehgcVar.b = bundle.getBoolean("expanded", false);
        ehgcVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (ehgcVar.b) {
            ViewParent parent = ehgcVar.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b(ehgcVar.a);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ehrh ehrhVar = new ehrh(onSaveInstanceState);
        cpn cpnVar = ehrhVar.a;
        ehgc ehgcVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", ehgcVar.b);
        bundle.putInt("expandedComponentIdHint", ehgcVar.c);
        cpnVar.put("expandableWidgetHelper", bundle);
        return ehrhVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            rect.left += this.c.left;
            rect.top += this.c.top;
            rect.right -= this.c.right;
            rect.bottom -= this.c.bottom;
            int i = -this.o.b();
            rect.inset(i, i);
            if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            ehhg i = i();
            ehop ehopVar = i.m;
            if (ehopVar != null) {
                ehopVar.setTintList(colorStateList);
            }
            ehgh ehghVar = i.o;
            if (ehghVar != null) {
                ehghVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            ehop ehopVar = i().m;
            if (ehopVar != null) {
                ehopVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        i().l(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i().j();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.m.e(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        i();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable drawable2;
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray a = ehiz.a(context2, attributeSet, ehhk.c, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = ehmq.c(context2, a, 1);
        this.f = ehjg.c(a.getInt(2, -1), null);
        this.g = ehmq.c(context2, a, 12);
        this.i = a.getInt(7, -1);
        this.j = a.getDimensionPixelSize(6, 0);
        this.h = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(4, 0.0f);
        float dimension2 = a.getDimension(9, 0.0f);
        float dimension3 = a.getDimension(11, 0.0f);
        this.b = a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = a.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        ehhg i2 = i();
        if (i2.z != dimensionPixelSize2) {
            i2.z = dimensionPixelSize2;
            i2.j();
        }
        egza b = egza.b(context2, a, 15);
        egza b2 = egza.b(context2, a, 8);
        ehow ehowVar = new ehow(ehow.c(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, ehow.a));
        boolean z = a.getBoolean(5, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        ra raVar = new ra(this);
        this.m = raVar;
        raVar.c(attributeSet, i);
        this.n = new ehgc(this);
        i().i(ehowVar);
        ehhg i3 = i();
        ColorStateList colorStateList2 = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList3 = this.g;
        int i4 = this.h;
        ehhi ehhiVar = (ehhi) i3;
        ehow ehowVar2 = ehhiVar.l;
        ksw.h(ehowVar2);
        ehhiVar.m = new ehhh(ehowVar2);
        ehhiVar.m.setTintList(colorStateList2);
        if (mode != null) {
            ehhiVar.m.setTintMode(mode);
        }
        ehhiVar.m.K(ehhiVar.B.getContext());
        if (i4 > 0) {
            Context context3 = ehhiVar.B.getContext();
            ehow ehowVar3 = ehhiVar.l;
            ksw.h(ehowVar3);
            ehgh ehghVar = new ehgh(ehowVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            ehghVar.c = color;
            ehghVar.d = color2;
            ehghVar.e = color3;
            ehghVar.f = color4;
            float f = i4;
            if (ehghVar.b != f) {
                ehghVar.b = f;
                ehghVar.a.setStrokeWidth(f * 1.3333f);
                ehghVar.g = true;
                ehghVar.invalidateSelf();
            }
            ehghVar.b(colorStateList2);
            ehhiVar.o = ehghVar;
            ehgh ehghVar2 = ehhiVar.o;
            ksw.h(ehghVar2);
            ehop ehopVar = ehhiVar.m;
            ksw.h(ehopVar);
            drawable2 = new LayerDrawable(new Drawable[]{ehghVar2, ehopVar});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            ehhiVar.o = null;
            drawable2 = ehhiVar.m;
        }
        ehhiVar.n = new RippleDrawable(ehmx.b(colorStateList), drawable2, drawable);
        ehhiVar.p = ehhiVar.n;
        i().u = dimensionPixelSize;
        ehhg i5 = i();
        if (i5.r != dimension) {
            i5.r = dimension;
            i5.g(dimension, i5.s, i5.t);
        }
        ehhg i6 = i();
        if (i6.s != dimension2) {
            i6.s = dimension2;
            i6.g(i6.r, dimension2, i6.t);
        }
        ehhg i7 = i();
        if (i7.t != dimension3) {
            i7.t = dimension3;
            i7.g(i7.r, i7.s, dimension3);
        }
        i().w = b;
        i().x = b2;
        i().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
