package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ cxqy a;

    public cxqq(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.i = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}
