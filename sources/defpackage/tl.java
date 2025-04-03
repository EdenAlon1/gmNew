package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tl extends AnimatorListenerAdapter {
    final /* synthetic */ tn a;
    private boolean b = false;

    public tl(tn tnVar) {
        this.a = tnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        if (((Float) this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            tn tnVar = this.a;
            tnVar.q = 0;
            tnVar.f(0);
        } else {
            tn tnVar2 = this.a;
            tnVar2.q = 2;
            tnVar2.e();
        }
    }
}
