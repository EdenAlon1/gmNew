package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oym implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ oyo a;
    final /* synthetic */ oyp b;

    public oym(oyp oypVar, oyo oyoVar) {
        this.b = oypVar;
        this.a = oyoVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        oyp.e(floatValue, this.a);
        this.b.a(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
