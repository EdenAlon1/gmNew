package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyjs extends Transition {
    public static final /* synthetic */ int a = 0;

    private static void a(TransitionValues transitionValues) {
        if (transitionValues.view instanceof CardView) {
            transitionValues.values.put("RadiusTransition:radius", Float.valueOf(((CardView) transitionValues.view).gt()));
        }
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || !(transitionValues.view instanceof CardView) || transitionValues.values.get("RadiusTransition:radius") == null || transitionValues2 == null || !(transitionValues2.view instanceof CardView) || transitionValues2.values.get("RadiusTransition:radius") == null) {
            return null;
        }
        final CardView cardView = (CardView) transitionValues2.view;
        float floatValue = ((Float) transitionValues.values.get("RadiusTransition:radius")).floatValue();
        float floatValue2 = ((Float) transitionValues2.values.get("RadiusTransition:radius")).floatValue();
        if (floatValue == floatValue2) {
            return null;
        }
        cardView.gw(floatValue);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(cardView.gt(), floatValue2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cyjr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = cyjs.a;
                CardView.this.gw(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    @Override // android.transition.Transition
    public final boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        return true;
    }
}
