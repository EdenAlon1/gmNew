package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqt implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ cxqy a;

    public cxqt(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
