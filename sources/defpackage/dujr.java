package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujr extends AnimatorListenerAdapter {
    final /* synthetic */ SurveyPromptActivity a;

    public dujr(SurveyPromptActivity surveyPromptActivity) {
        this.a = surveyPromptActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.o.setVisibility(8);
    }
}
