package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehlj extends AnimatorListenerAdapter {
    final /* synthetic */ ehln a;

    public ehlj(ehln ehlnVar) {
        this.a = ehlnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        ehln ehlnVar = this.a;
        int i = ehlnVar.e;
        int length = ehln.a.length;
        ehlnVar.e = (i + 4) % ehlnVar.d.c.length;
    }
}
