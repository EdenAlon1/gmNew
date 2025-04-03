package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryb extends AnimatorListenerAdapter {
    final /* synthetic */ dryd a;

    public dryb(dryd drydVar) {
        this.a = drydVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        super.onAnimationEnd(animator);
        dryd drydVar = this.a;
        drydVar.f = true;
        drydVar.d.invoke();
    }
}
