package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqu extends cxqx {
    final /* synthetic */ cxqy a;

    public cxqu(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        this.a.f = 0.0f;
    }
}
