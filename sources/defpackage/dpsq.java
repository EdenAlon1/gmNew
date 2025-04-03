package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpsq implements Animator.AnimatorListener {
    final /* synthetic */ dptb a;
    final /* synthetic */ float b;

    public dpsq(dptb dptbVar, float f) {
        this.a = dptbVar;
        this.b = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dptb dptbVar = this.a;
        dptbVar.i = ffqy.d(dptbVar.d, null, null, new dpsp(dptbVar, null), 3);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f(this.b);
        this.a.i.t(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
