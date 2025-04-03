package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egzq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ egzt a;

    public egzq(egzt egztVar) {
        this.a = egztVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.h(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
