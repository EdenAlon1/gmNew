package com.google.android.material.sidesheet;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.a;
import defpackage.aak;
import defpackage.egyv;
import defpackage.ehjl;
import defpackage.ehjx;
import defpackage.ehjy;
import defpackage.ehmq;
import defpackage.ehop;
import defpackage.ehou;
import defpackage.ehow;
import defpackage.ehpp;
import defpackage.ehpq;
import defpackage.ehpr;
import defpackage.ehps;
import defpackage.ehpt;
import defpackage.ehpy;
import defpackage.ehpz;
import defpackage.ehqb;
import defpackage.ehqd;
import defpackage.ehqe;
import defpackage.kkt;
import defpackage.kkw;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.kxr;
import defpackage.kyg;
import defpackage.laa;
import defpackage.lab;
import defpackage.ljm;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SideSheetBehavior<V extends View> extends kkt<V> implements ehjl {
    public ehpt a;
    public boolean b;
    public int c;
    public lab d;
    public final float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public WeakReference j;
    public final Set k;
    private ehop l;
    private ColorStateList m;
    private ehow n;
    private final ehqd o;
    private float p;
    private boolean q;
    private WeakReference r;
    private int s;
    private VelocityTracker t;
    private ehjy u;
    private int v;
    private final laa w;

    public SideSheetBehavior() {
        this.o = new ehqd(this);
        this.b = true;
        this.c = 5;
        this.e = 0.1f;
        this.s = -1;
        this.k = new LinkedHashSet();
        this.w = new ehpy(this);
    }

    private final int A() {
        ehpt ehptVar = this.a;
        return (ehptVar == null || ehptVar.i() == 0) ? 5 : 3;
    }

    private final kkw B() {
        View view;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof kkw)) {
            return null;
        }
        return (kkw) view.getLayoutParams();
    }

    private final void C(View view, kxr kxrVar, final int i) {
        kvo.y(view, kxrVar, new kyg() { // from class: ehpw
            @Override // defpackage.kyg
            public final boolean a(View view2) {
                SideSheetBehavior.this.v(i);
                return true;
            }
        });
    }

    private final void D() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private final void E() {
        View view;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        kvo.n(view, 262144);
        kvo.n(view, 1048576);
        if (this.c != 5) {
            C(view, kxr.h, 5);
        }
        if (this.c != 3) {
            C(view, kxr.f, 3);
        }
    }

    private final void G(ehow ehowVar) {
        ehop ehopVar = this.l;
        if (ehopVar != null) {
            ehopVar.fy(ehowVar);
        }
    }

    private final void I(View view) {
        int i = this.c == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    private final boolean J() {
        if (this.d != null) {
            return this.b || this.c == 1;
        }
        return false;
    }

    @Override // defpackage.ehjl
    public final void F(aak aakVar) {
        ehjy ehjyVar = this.u;
        if (ehjyVar == null) {
            return;
        }
        ehjyVar.e = aakVar;
    }

    @Override // defpackage.ehjl
    public final void H(aak aakVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ehjy ehjyVar = this.u;
        if (ehjyVar == null) {
            return;
        }
        ehjyVar.f(aakVar, A());
        WeakReference weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.j.get();
        View u = u();
        if (u == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) u.getLayoutParams()) == null) {
            return;
        }
        this.a.j(marginLayoutParams, (int) ((this.f * view.getScaleX()) + this.i));
        u.requestLayout();
    }

    @Override // defpackage.kkt
    public final void a(kkw kkwVar) {
        this.j = null;
        this.d = null;
        this.u = null;
    }

    @Override // defpackage.kkt
    public final void b() {
        this.j = null;
        this.d = null;
        this.u = null;
    }

    @Override // defpackage.kkt
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        lab labVar;
        if ((!view.isShown() && kvo.h(view) == null) || !this.b) {
            this.q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            D();
            actionMasked = 0;
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.v = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.q) {
            this.q = false;
            return false;
        }
        return (this.q || (labVar = this.d) == null || !labVar.i(motionEvent)) ? false : true;
    }

    @Override // defpackage.kkt
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        kkw B;
        kkw B2;
        int i2;
        View findViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.j == null) {
            this.j = new WeakReference(view);
            this.u = new ehjy(view);
            ehop ehopVar = this.l;
            if (ehopVar != null) {
                view.setBackground(ehopVar);
                ehop ehopVar2 = this.l;
                float f = this.p;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                ehopVar2.N(f);
            } else {
                ColorStateList colorStateList = this.m;
                if (colorStateList != null) {
                    int[] iArr = kvo.a;
                    kvd.h(view, colorStateList);
                }
            }
            I(view);
            E();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (kvo.h(view) == null) {
                kvo.r(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(((kkw) view.getLayoutParams()).c, i);
        int i3 = 0;
        int i4 = absoluteGravity != 3 ? 0 : 1;
        ehpt ehptVar = this.a;
        if (ehptVar == null || ehptVar.i() != i4) {
            if (absoluteGravity != 3) {
                this.a = new ehpr(this);
                if (this.n != null && ((B2 = B()) == null || B2.rightMargin <= 0)) {
                    ehou ehouVar = new ehou(this.n);
                    ehouVar.h(0.0f);
                    ehouVar.d(0.0f);
                    G(new ehow(ehouVar));
                }
            } else {
                this.a = new ehpp(this);
                if (this.n != null && ((B = B()) == null || B.leftMargin <= 0)) {
                    ehou ehouVar2 = new ehou(this.n);
                    ehouVar2.f(0.0f);
                    ehouVar2.b(0.0f);
                    G(new ehow(ehouVar2));
                }
            }
        }
        if (this.d == null) {
            this.d = lab.b(coordinatorLayout, this.w);
        }
        int g = this.a.g(view);
        coordinatorLayout.j(view, i);
        this.g = coordinatorLayout.getWidth();
        this.h = this.a.h(coordinatorLayout);
        this.f = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.i = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        int i5 = this.c;
        if (i5 == 1 || i5 == 2) {
            i3 = g - this.a.g(view);
        } else if (i5 != 3) {
            if (i5 != 5) {
                throw new IllegalStateException(a.h(i5, "Unexpected value: "));
            }
            i3 = this.a.d();
        }
        int[] iArr2 = kvo.a;
        view.offsetLeftAndRight(i3);
        if (this.r == null && (i2 = this.s) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.r = new WeakReference(findViewById);
        }
        for (ehps ehpsVar : this.k) {
            if (ehpsVar instanceof ehqe) {
            }
        }
        return true;
    }

    @Override // defpackage.kkt
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.c == 1 && actionMasked == 0) {
            return true;
        }
        if (J()) {
            this.d.e(motionEvent);
        }
        if (actionMasked == 0) {
            D();
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (J() && actionMasked == 2 && !this.q && J()) {
            float abs = Math.abs(this.v - motionEvent.getX());
            lab labVar = this.d;
            if (abs > labVar.a) {
                labVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.q;
    }

    @Override // defpackage.kkt
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.kkt
    public final void q(View view, Parcelable parcelable) {
        int i = ((ehqb) parcelable).a;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.c = i;
    }

    @Override // defpackage.kkt
    public final Parcelable r(View view) {
        return new ehqb(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final int t() {
        return this.a.c();
    }

    public final View u() {
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void v(final int i) {
        WeakReference weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            w(i);
            return;
        }
        View view = (View) this.j.get();
        Runnable runnable = new Runnable() { // from class: ehpv
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                View view2 = (View) sideSheetBehavior.j.get();
                if (view2 != null) {
                    sideSheetBehavior.y(view2, i, false);
                }
            }
        };
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void w(int i) {
        View view;
        if (this.c == i) {
            return;
        }
        this.c = i;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        I(view);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ehps) it.next()).b();
        }
        E();
    }

    @Override // defpackage.ehjl
    public final void x() {
        ehjy ehjyVar = this.u;
        if (ehjyVar == null) {
            return;
        }
        ehjyVar.e();
    }

    public final void y(View view, int i, boolean z) {
        int t;
        if (i == 3) {
            t = t();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.h(i, "Invalid state to get outer edge offset: "));
            }
            t = this.a.d();
        }
        lab labVar = this.d;
        if (labVar == null || (!z ? labVar.j(view, t, view.getTop()) : labVar.h(t, view.getTop()))) {
            w(i);
        } else {
            w(2);
            this.o.a(i);
        }
    }

    @Override // defpackage.ehjl
    public final void z() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        ehjy ehjyVar = this.u;
        if (ehjyVar == null) {
            return;
        }
        aak c = ehjyVar.c();
        if (c == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        ehjy ehjyVar2 = this.u;
        int A = A();
        ehpz ehpzVar = new ehpz(this);
        final View u = u();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (u != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) u.getLayoutParams()) != null) {
            final int b = this.a.b(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: ehpx
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i2 = b;
                    SideSheetBehavior.this.a.j(marginLayoutParams, egyv.b(i2, 0, valueAnimator.getAnimatedFraction()));
                    u.requestLayout();
                }
            };
        }
        boolean h = ehjyVar2.h(A);
        float width = ehjyVar2.a.getWidth() * ehjyVar2.a.getScaleX();
        ViewGroup.LayoutParams layoutParams = ehjyVar2.a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = h ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = width + i;
        View view = ehjyVar2.a;
        Property property = View.TRANSLATION_X;
        if (h) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        boolean z = c.c == 0;
        ofFloat.setInterpolator(new ljm());
        ofFloat.setDuration(egyv.b(ehjyVar2.b, ehjyVar2.c, c.b));
        ofFloat.addListener(new ehjx(ehjyVar2, z, A));
        ofFloat.addListener(ehpzVar);
        ofFloat.start();
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new ehqd(this);
        this.b = true;
        this.c = 5;
        this.e = 0.1f;
        this.s = -1;
        this.k = new LinkedHashSet();
        this.w = new ehpy(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehpq.a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.m = ehmq.c(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.n = new ehow(ehow.h(context, attributeSet, 0, R.style.Widget_Material3_SideSheet));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.s = resourceId;
            WeakReference weakReference = this.r;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.r = null;
            WeakReference weakReference2 = this.j;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        if (this.n != null) {
            ehop ehopVar = new ehop(this.n);
            this.l = ehopVar;
            ehopVar.K(context);
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                this.l.O(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.l.setTint(typedValue.data);
            }
        }
        this.p = obtainStyledAttributes.getDimension(2, -1.0f);
        this.b = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
