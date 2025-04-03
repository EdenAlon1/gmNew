package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vyj extends AnimatorListenerAdapter {
    final /* synthetic */ vyp a;
    private final ffix b;
    private final ffix c;

    public vyj(vyp vypVar, ffix ffixVar, ffix ffixVar2) {
        this.a = vypVar;
        this.b = ffixVar;
        this.c = ffixVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.h = null;
        this.c.invoke();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        Animator animator2 = this.a.h;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.a.h = animator;
        this.b.invoke();
    }
}
