package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehle extends AnimatorListenerAdapter {
    final /* synthetic */ ehli a;

    public ehle(ehli ehliVar) {
        this.a = ehliVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        ehli ehliVar = this.a;
        ehliVar.f = (ehliVar.f + 4) % ehliVar.e.c.length;
    }
}
