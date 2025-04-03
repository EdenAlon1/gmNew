package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehkf implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ ehkh b;

    public ehkf(ehkh ehkhVar, float f) {
        this.a = f;
        this.b = ehkhVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
