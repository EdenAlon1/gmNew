package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ cxqy a;

    public cxqo(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cxqy cxqyVar = this.a;
        cxqyVar.d = floatValue;
        cxqyVar.invalidateSelf();
    }
}
