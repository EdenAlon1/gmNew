package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehmd extends AnimatorListenerAdapter {
    final /* synthetic */ ehmf a;

    public ehmd(ehmf ehmfVar) {
        this.a = ehmfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        ehmf ehmfVar = this.a;
        ehmfVar.c = (ehmfVar.c + 1) % ehmfVar.b.c.length;
        ehmfVar.d = true;
    }
}
