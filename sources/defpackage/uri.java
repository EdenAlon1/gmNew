package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uri extends AnimatorListenerAdapter {
    final /* synthetic */ wr a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ url d;

    public uri(url urlVar, wr wrVar, Runnable runnable, Runnable runnable2) {
        this.a = wrVar;
        this.b = runnable;
        this.c = runnable2;
        this.d = urlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.removeListener(this);
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.d.p(this.a);
        this.b.run();
        this.d.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
