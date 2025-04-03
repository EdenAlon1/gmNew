package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqw extends AnimatorListenerAdapter {
    final /* synthetic */ cxqy a;

    public cxqw(cxqy cxqyVar) {
        this.a = cxqyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b.start();
    }
}
