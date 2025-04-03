package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.egyv;
import defpackage.ehaj;
import defpackage.ehak;
import defpackage.ehal;
import defpackage.eham;
import defpackage.ehan;
import defpackage.ehao;
import defpackage.ehjz;
import defpackage.ehmp;
import defpackage.kkt;
import defpackage.kkw;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class HideViewOnScrollBehavior<V extends View> extends kkt<V> {
    public ViewPropertyAnimator a;
    private ehao b;
    private final LinkedHashSet c;
    private int d;
    private int e;
    private TimeInterpolator f;
    private TimeInterpolator g;
    private int h;
    private int i;

    public HideViewOnScrollBehavior() {
        this.c = new LinkedHashSet();
        this.h = 0;
        this.i = 2;
    }

    private final void u(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = this.b.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new eham(this));
    }

    private final void v(int i) {
        this.i = i;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ehan) it.next()).a();
        }
    }

    @Override // defpackage.kkt
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.i == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            v(1);
            u(view, this.h, this.e, this.g);
            return;
        }
        if (i2 >= 0 || this.i == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.a;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        v(2);
        this.b.d();
        u(view, 0, this.d, this.f);
    }

    @Override // defpackage.kkt
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((kkw) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            t(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            int i3 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i3 = 0;
            }
            t(i3);
        }
        this.h = this.b.a(view, marginLayoutParams);
        this.d = ehmp.a(view.getContext(), R.attr.motionDurationLong2, 225);
        this.e = ehmp.a(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f = ehjz.a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, egyv.d);
        this.g = ehjz.a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, egyv.c);
        return false;
    }

    @Override // defpackage.kkt
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void t(int i) {
        ehao ehaoVar = this.b;
        if (ehaoVar == null || ehaoVar.b() != i) {
            this.b = i != 0 ? i != 1 ? new ehak() : new ehaj() : new ehal();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new LinkedHashSet();
        this.h = 0;
        this.i = 2;
    }
}
