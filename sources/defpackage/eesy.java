package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesy extends AnimatorListenerAdapter {
    final /* synthetic */ eeta a;

    public eesy(eeta eetaVar) {
        this.a = eetaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.e.clearAnimation();
        this.a.g.setVisibility(8);
        this.a.e.setTranslationY(0.0f);
    }
}
