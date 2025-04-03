package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqp extends cxqx {
    final /* synthetic */ cxqy a;

    public cxqp(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        cxqy cxqyVar = this.a;
        cxqyVar.c = (cxqyVar.c + 216.0f) % 360.0f;
    }
}
