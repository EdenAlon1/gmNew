package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaxs extends AnimatorListenerAdapter {
    final /* synthetic */ eaxu a;

    public eaxs(eaxu eaxuVar) {
        this.a = eaxuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ebin ebinVar;
        if (this.a.e.g() && (ebinVar = ((eawc) this.a.e.c()).d) != null) {
            ebinVar.c = false;
            AnimatorSet animatorSet = ebinVar.b;
            if (animatorSet != null) {
                animatorSet.end();
            }
        }
        this.a.a.h(null);
    }
}
