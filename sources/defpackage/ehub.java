package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehub implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;

    public ehub(View view, float f, float f2, float f3, float f4) {
        this.a = view;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = ehui.a;
        float f = this.d;
        float f2 = this.b;
        if (floatValue >= f) {
            float f3 = this.e;
            float f4 = this.c;
            if (floatValue > f3) {
                f2 = f4;
            } else {
                f2 += ((floatValue - f) / (f3 - f)) * (f4 - f2);
            }
        }
        this.a.setAlpha(f2);
    }
}
