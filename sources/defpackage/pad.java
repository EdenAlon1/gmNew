package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pad extends AnimatorListenerAdapter {
    final /* synthetic */ cmh a;
    final /* synthetic */ par b;

    public pad(par parVar, cmh cmhVar) {
        this.b = parVar;
        this.a = cmhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.l.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.l.add(animator);
    }
}
