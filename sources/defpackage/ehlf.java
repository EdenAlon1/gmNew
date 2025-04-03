package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehlf extends AnimatorListenerAdapter {
    final /* synthetic */ ehli a;

    public ehlf(ehli ehliVar) {
        this.a = ehliVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        ehli ehliVar = this.a;
        pbt pbtVar = ehliVar.i;
        if (pbtVar != null) {
            pbtVar.b(ehliVar.j);
        }
    }
}
