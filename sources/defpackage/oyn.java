package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oyn implements Animator.AnimatorListener {
    final /* synthetic */ oyo a;
    final /* synthetic */ oyp b;

    public oyn(oyp oypVar, oyo oyoVar) {
        this.b = oypVar;
        this.a = oyoVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.e();
        oyo oyoVar = this.a;
        oyoVar.f();
        oyoVar.g();
        oyp oypVar = this.b;
        if (!oypVar.d) {
            oypVar.c += 1.0f;
            return;
        }
        oypVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.a.c(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
