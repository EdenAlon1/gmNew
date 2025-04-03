package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehih implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int a = 0;
    private final ehig b;
    private final View[] c;

    public ehih(ehig ehigVar, View... viewArr) {
        this.b = ehigVar;
        this.c = viewArr;
    }

    public static ehih a(View... viewArr) {
        return new ehih(new ehig() { // from class: ehif
            @Override // defpackage.ehig
            public final void a(ValueAnimator valueAnimator, View view) {
                int i = ehih.a;
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }, viewArr);
    }

    public static ehih b(View... viewArr) {
        return new ehih(new ehig() { // from class: ehic
            @Override // defpackage.ehig
            public final void a(ValueAnimator valueAnimator, View view) {
                int i = ehih.a;
                view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }, viewArr);
    }

    public static ehih c(View... viewArr) {
        return new ehih(new ehig() { // from class: ehie
            @Override // defpackage.ehig
            public final void a(ValueAnimator valueAnimator, View view) {
                int i = ehih.a;
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }, viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            this.b.a(valueAnimator, viewArr[i]);
            i++;
        }
    }
}
