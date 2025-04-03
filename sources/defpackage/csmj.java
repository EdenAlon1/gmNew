package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class csmj {
    public static final Interpolator a = new ljm();
    public static final Interpolator b = new csje(0.4f, 0.0f, 0.2f, 1.0f);

    public static int a(Context context) {
        return context.getResources().getInteger(R.integer.no_shifting_animation_duration);
    }

    public static int b(View view) {
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), Integer.MIN_VALUE);
    }

    public static int c(View view) {
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), Integer.MIN_VALUE);
    }

    public static int d(View view) {
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824);
    }

    public static Animator e(View view, int i, long j) {
        return ObjectAnimator.ofFloat(view, "alpha", i == 0 ? 1.0f : 0.0f).setDuration(j);
    }

    public static Animator f(View view, int i, int i2, Runnable runnable) {
        if (view.getVisibility() != 0 && i == 0) {
            view.setAlpha(0.0f);
        }
        Animator e = e(view, i, i2);
        e.addListener(new csmc(i, view, runnable));
        return e;
    }

    public static void l(View view, int i, long j, Interpolator interpolator, Runnable runnable, Animation... animationArr) {
        csix.l(animationArr);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animationArr[0]);
        if (j == -1) {
            animationSet.setDuration(a(view.getContext()));
        } else {
            animationSet.setDuration(j);
        }
        animationSet.setInterpolator(interpolator);
        animationSet.setAnimationListener(new csme(i, view, runnable));
        view.clearAnimation();
        view.startAnimation(animationSet);
    }

    public static boolean o(View view, int i, Runnable runnable) {
        if (view.getVisibility() != i) {
            return true;
        }
        if (runnable == null) {
            return false;
        }
        cslq.a.post(runnable);
        return false;
    }

    public static Animator p(View view, int i) {
        return f(view, i, 150, null);
    }

    public final Rect g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    public final void h(final View view, int i, int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: csmb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Interpolator interpolator = csmj.a;
                view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.setDuration(150L).start();
    }

    public final void i(View view, lkk lkkVar, Runnable runnable) {
        view.addOnLayoutChangeListener(new csmi(view, lkkVar, runnable));
    }

    @Deprecated
    public final void j(View view, int i, long j) {
        cria criaVar = new cria(view, 2, i);
        criaVar.setInterpolator(b);
        if (j == -1) {
            j = a(view.getContext());
        }
        criaVar.setDuration(j);
        view.clearAnimation();
        view.startAnimation(criaVar);
    }

    @Deprecated
    public final void k(View view, int i, Runnable runnable) {
        Interpolator interpolator = b;
        if (o(view, i, runnable)) {
            l(view, i, -1L, interpolator, runnable, new crhy(view.getContext(), i == 0 ? 0.0f : 1.0f, i == 0 ? 1.0f : 0.0f));
        }
    }

    public final void m(View view, float f) {
        view.clearAnimation();
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public final void n(View view, float f) {
        view.animate().scaleX(f).scaleY(f).setDuration(150L);
    }
}
