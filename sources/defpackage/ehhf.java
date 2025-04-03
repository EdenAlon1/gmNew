package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ehhf extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ ehhg b;
    private float c;
    private float d;

    public ehhf(ehhg ehhgVar) {
        this.b = ehhgVar;
    }

    protected abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.l((int) this.d);
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.a) {
            ehop ehopVar = this.b.m;
            this.c = ehopVar == null ? 0.0f : ehopVar.u();
            this.d = a();
            this.a = true;
        }
        ehhg ehhgVar = this.b;
        float f = this.c;
        ehhgVar.l((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction())));
    }
}
