package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmv extends AnimatorListenerAdapter {
    final /* synthetic */ dwna a;

    public dwmv(dwna dwnaVar) {
        this.a = dwnaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.q = null;
        dwna dwnaVar = this.a;
        if (dwnaVar.t) {
            return;
        }
        dwnaVar.n(dwnaVar.a());
    }
}
