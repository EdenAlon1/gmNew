package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxql implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ cxqy a;

    public cxql(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
