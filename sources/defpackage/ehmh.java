package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehmh extends AnimatorListenerAdapter {
    final /* synthetic */ ehmj a;

    public ehmh(ehmj ehmjVar) {
        this.a = ehmjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        ehmj ehmjVar = this.a;
        pbt pbtVar = ehmjVar.h;
        if (pbtVar != null) {
            pbtVar.b(ehmjVar.j);
        }
    }
}
