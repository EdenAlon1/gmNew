package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehsh extends AnimatorListenerAdapter {
    final /* synthetic */ ehsj a;

    public ehsh(ehsj ehsjVar) {
        this.a = ehsjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.l(true);
    }
}
