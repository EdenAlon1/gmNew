package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.egyv;
import defpackage.ehah;
import defpackage.ehai;
import defpackage.ehjz;
import defpackage.ehmp;
import defpackage.kkt;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends kkt<V> {
    public ViewPropertyAnimator a;
    private final LinkedHashSet b;
    private int c;
    private int d;
    private TimeInterpolator e;
    private TimeInterpolator f;
    private int g;
    private int h;

    public HideBottomViewOnScrollBehavior() {
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }

    private final void t(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ehah(this));
    }

    private final void u(int i) {
        this.h = i;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ehai) it.next()).a();
        }
    }

    @Override // defpackage.kkt
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.h == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            u(1);
            t(view, this.g, this.d, this.f);
            return;
        }
        if (i2 >= 0 || this.h == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.a;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        u(2);
        t(view, 0, this.c, this.e);
    }

    @Override // defpackage.kkt
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.g = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.c = ehmp.a(view.getContext(), R.attr.motionDurationLong2, 225);
        this.d = ehmp.a(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.e = ehjz.a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, egyv.d);
        this.f = ehjz.a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, egyv.c);
        return false;
    }

    @Override // defpackage.kkt
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }
}
