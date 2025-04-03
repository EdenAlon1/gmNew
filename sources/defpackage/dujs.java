package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujs implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ SurveyPromptActivity a;

    public dujs(SurveyPromptActivity surveyPromptActivity) {
        this.a = surveyPromptActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.n.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.a.n.requestLayout();
    }
}
