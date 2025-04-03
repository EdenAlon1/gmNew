package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.egyv;
import defpackage.ehdr;
import defpackage.ehiz;
import defpackage.ehjg;
import defpackage.ehjz;
import defpackage.ehmp;
import defpackage.ehqg;
import defpackage.ehqm;
import defpackage.ehqn;
import defpackage.ehqo;
import defpackage.ehqp;
import defpackage.ehqq;
import defpackage.ehqt;
import defpackage.ehqv;
import defpackage.ehqw;
import defpackage.ehqx;
import defpackage.ehqz;
import defpackage.ehre;
import defpackage.ehrf;
import defpackage.kkw;
import defpackage.kvd;
import defpackage.kvo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class BaseTransientBottomBar {
    private ehqv A;
    private int C;
    private final AccessibilityManager D;
    public final int c;
    public final int d;
    public final int e;
    public final TimeInterpolator f;
    public final TimeInterpolator g;
    public final ViewGroup h;
    public final Context i;
    public final ehqz j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public List s;
    public final SnackbarContentLayout t;
    private final TimeInterpolator z;
    private static final TimeInterpolator v = egyv.b;
    private static final TimeInterpolator w = egyv.a;
    private static final TimeInterpolator x = egyv.d;
    private static final int[] y = {R.attr.snackbarStyle};
    public static final String b = "BaseTransientBottomBar";
    public static final Handler a = new Handler(Looper.getMainLooper(), new ehqm());
    public boolean l = false;
    private final Runnable B = new ehqn(this);
    public final ehqq u = new ehqq(this);

    /* compiled from: PG */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final ehqx g = new ehqx(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.kkt
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            ehqx ehqxVar = this.g;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    ehrf.a().f(ehqxVar.a);
                }
            } else if (coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                ehrf.a().e(ehqxVar.a);
            }
            return super.f(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean t(View view) {
            return view instanceof ehqz;
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.h = viewGroup;
        this.t = snackbarContentLayout;
        this.i = context;
        ehiz.c(context);
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        ehqz ehqzVar = (ehqz) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.j = ehqzVar;
        ehqzVar.a = this;
        float f = ehqzVar.d;
        if (f != 1.0f) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            snackbarContentLayout2.b.setTextColor(ehdr.f(ehdr.b(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
        }
        ((SnackbarContentLayout) view).d = ehqzVar.e;
        ehqzVar.addView(view);
        ehqzVar.setAccessibilityLiveRegion(1);
        ehqzVar.setImportantForAccessibility(1);
        ehqzVar.setFitsSystemWindows(true);
        ehqo ehqoVar = new ehqo(this);
        int[] iArr = kvo.a;
        kvd.k(ehqzVar, ehqoVar);
        kvo.p(ehqzVar, new ehqp(this));
        this.D = (AccessibilityManager) context.getSystemService("accessibility");
        this.e = ehmp.a(context, R.attr.motionDurationLong2, 250);
        this.c = ehmp.a(context, R.attr.motionDurationLong2, 150);
        this.d = ehmp.a(context, R.attr.motionDurationMedium1, 75);
        this.z = ehjz.a(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.g = ehjz.a(context, R.attr.motionEasingEmphasizedInterpolator, x);
        this.f = ehjz.a(context, R.attr.motionEasingEmphasizedInterpolator, v);
    }

    public int a() {
        throw null;
    }

    public final int b() {
        ehqz ehqzVar = this.j;
        int height = ehqzVar.getHeight();
        ViewGroup.LayoutParams layoutParams = ehqzVar.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.z);
        ofFloat.addUpdateListener(new ehqg(this));
        return ofFloat;
    }

    public final View d() {
        ehqv ehqvVar = this.A;
        if (ehqvVar == null) {
            return null;
        }
        return (View) ehqvVar.a.get();
    }

    public final void e() {
        f(3);
    }

    public final void f(int i) {
        ehrf a2 = ehrf.a();
        Object obj = a2.a;
        ehqq ehqqVar = this.u;
        synchronized (obj) {
            if (a2.g(ehqqVar)) {
                a2.d(a2.c, i);
            } else if (a2.h(ehqqVar)) {
                a2.d(a2.d, i);
            }
        }
    }

    public final void g() {
        ehrf a2 = ehrf.a();
        Object obj = a2.a;
        ehqq ehqqVar = this.u;
        synchronized (obj) {
            if (a2.g(ehqqVar)) {
                a2.b(a2.c);
            }
        }
        List list = this.s;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ehqw) this.s.get(size)).a(this);
            }
        }
    }

    public final void h() {
        int height;
        if (d() == null) {
            height = 0;
        } else {
            int[] iArr = new int[2];
            d().getLocationOnScreen(iArr);
            int i = iArr[1];
            int[] iArr2 = new int[2];
            this.h.getLocationOnScreen(iArr2);
            height = (iArr2[1] + this.h.getHeight()) - i;
        }
        this.C = height;
        k();
    }

    public final void i() {
        ehrf a2 = ehrf.a();
        Object obj = a2.a;
        int a3 = a();
        ehqq ehqqVar = this.u;
        synchronized (obj) {
            if (a2.g(ehqqVar)) {
                ehre ehreVar = a2.c;
                ehreVar.b = a3;
                a2.b.removeCallbacksAndMessages(ehreVar);
                a2.b(a2.c);
                return;
            }
            if (a2.h(ehqqVar)) {
                a2.d.b = a3;
            } else {
                a2.d = new ehre(a3, ehqqVar);
            }
            ehre ehreVar2 = a2.c;
            if (ehreVar2 == null || !a2.d(ehreVar2, 4)) {
                a2.c = null;
                a2.c();
            }
        }
    }

    public final void j() {
        if (kvo.h(this.j) == null) {
            kvo.r(this.j, this.i.getString(R.string.snackbar_accessibility_pane_title));
        }
        if (m()) {
            this.j.post(new ehqt(this));
            return;
        }
        if (this.j.getParent() != null) {
            this.j.setVisibility(0);
        }
        g();
    }

    public final void k() {
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ehqz ehqzVar = this.j;
        if (ehqzVar.f == null) {
            Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (ehqzVar.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = this.j.f.bottom + (d() != null ? this.C : this.m);
        int i2 = this.j.f.left + this.n;
        int i3 = this.j.f.right + this.o;
        int i4 = this.j.f.top;
        if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            this.j.requestLayout();
        } else if (this.q == this.p) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || this.p <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.j.getLayoutParams();
        if ((layoutParams2 instanceof kkw) && (((kkw) layoutParams2).a instanceof SwipeDismissBehavior)) {
            this.j.removeCallbacks(this.B);
            this.j.post(this.B);
        }
    }

    public final boolean l() {
        boolean g;
        ehrf a2 = ehrf.a();
        Object obj = a2.a;
        ehqq ehqqVar = this.u;
        synchronized (obj) {
            g = a2.g(ehqqVar);
        }
        return g;
    }

    public final boolean m() {
        AccessibilityManager accessibilityManager = this.D;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void n(View view) {
        ehqv ehqvVar;
        ehqv ehqvVar2 = this.A;
        if (ehqvVar2 != null) {
            ehqvVar2.a();
        }
        if (view == null) {
            ehqvVar = null;
        } else {
            ehqv ehqvVar3 = new ehqv(this, view);
            if (view.isAttachedToWindow()) {
                ehjg.h(view, ehqvVar3);
            }
            view.addOnAttachStateChangeListener(ehqvVar3);
            ehqvVar = ehqvVar3;
        }
        this.A = ehqvVar;
    }

    public final void o() {
        this.j.c = 0;
    }

    public final void p() {
        ehrf a2 = ehrf.a();
        Object obj = a2.a;
        ehqq ehqqVar = this.u;
        synchronized (obj) {
            if (a2.g(ehqqVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.c();
                }
            }
        }
        List list = this.s;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((ehqw) this.s.get(size)).b(this);
                }
            }
        }
        ViewParent parent = this.j.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.j);
        }
    }
}
