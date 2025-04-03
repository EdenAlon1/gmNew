package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebrh extends AnimatorListenerAdapter {
    final /* synthetic */ ebrp a;

    public ebrh(ebrp ebrpVar) {
        this.a = ebrpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.m.setVisibility(4);
        this.a.l.setVisibility(4);
        this.a.y = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.n.setVisibility(0);
    }
}
