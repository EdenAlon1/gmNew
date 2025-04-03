package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehlk extends AnimatorListenerAdapter {
    final /* synthetic */ ehln a;

    public ehlk(ehln ehlnVar) {
        this.a = ehlnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        ehln ehlnVar = this.a;
        pbt pbtVar = ehlnVar.h;
        if (pbtVar != null) {
            pbtVar.b(ehlnVar.j);
        }
    }
}
