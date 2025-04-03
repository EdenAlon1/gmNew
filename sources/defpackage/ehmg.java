package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehmg extends AnimatorListenerAdapter {
    final /* synthetic */ ehmj a;

    public ehmg(ehmj ehmjVar) {
        this.a = ehmjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        ehmj ehmjVar = this.a;
        ehmjVar.e = (ehmjVar.e + 1) % ehmjVar.d.c.length;
        ehmjVar.f = true;
    }
}
