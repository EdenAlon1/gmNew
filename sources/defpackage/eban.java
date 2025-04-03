package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eban extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ AnimatorListenerAdapter b;
    final /* synthetic */ ebap c;

    public eban(ebap ebapVar, Runnable runnable, AnimatorListenerAdapter animatorListenerAdapter) {
        this.a = runnable;
        this.b = animatorListenerAdapter;
        this.c = ebapVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
        ebap ebapVar = this.c;
        AccountParticleDisc accountParticleDisc = ebapVar.b.c;
        engw t = engw.t(ObjectAnimator.ofFloat(accountParticleDisc, "scaleX", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "scaleY", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 0.125f, 1.0f).setDuration(117L));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(t);
        animatorSet.addListener(this.b);
        animatorSet.addListener(new ebao(ebapVar, accountParticleDisc));
        animatorSet.start();
    }
}
