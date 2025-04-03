package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aae implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aaf a;

    public aae(aaf aafVar) {
        this.a = aafVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.p = valueAnimator.getAnimatedFraction();
    }
}
