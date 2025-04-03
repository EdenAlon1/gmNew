package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehiw implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextView a;

    public ehiw(TextView textView) {
        this.a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.setScaleX(floatValue);
        this.a.setScaleY(floatValue);
    }
}
