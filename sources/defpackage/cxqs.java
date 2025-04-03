package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqs implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ cxqy a;

    public cxqs(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
