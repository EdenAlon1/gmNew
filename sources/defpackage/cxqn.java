package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqn extends cxqx {
    final /* synthetic */ cxqy a;

    public cxqn(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        cxqy cxqyVar = this.a;
        cxqyVar.b = cxqyVar.b();
        this.a.b.start();
    }
}
