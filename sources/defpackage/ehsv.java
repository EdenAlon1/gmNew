package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehsv extends AnimatorListenerAdapter {
    final /* synthetic */ ehsw a;

    public ehsv(ehsw ehswVar) {
        this.a = ehswVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.x();
        this.a.d.start();
    }
}
