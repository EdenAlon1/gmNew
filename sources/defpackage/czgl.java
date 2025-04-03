package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czgl implements Animator.AnimatorListener {
    final /* synthetic */ czgm a;

    public czgl(czgm czgmVar) {
        this.a = czgmVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        czgm czgmVar = this.a;
        if (czgmVar.G() != null) {
            cg cgVar = new cg(czgmVar.E.I());
            cgVar.n(this.a);
            cgVar.j();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
