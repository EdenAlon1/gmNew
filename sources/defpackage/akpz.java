package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akpz extends AnimatorListenerAdapter {
    final /* synthetic */ Animator.AnimatorListener a;
    final /* synthetic */ View b;
    final /* synthetic */ ObjectAnimator c;

    public akpz(Animator.AnimatorListener animatorListener, View view, ObjectAnimator objectAnimator) {
        this.a = animatorListener;
        this.b = view;
        this.c = objectAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setAlpha(1.0f);
        this.a.onAnimationEnd(animator);
        this.c.removeAllListeners();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
