package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmu extends AnimatorListenerAdapter {
    final /* synthetic */ dwna a;

    public dwmu(dwna dwnaVar) {
        this.a = dwnaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.q = null;
        dwna dwnaVar = this.a;
        if (dwnaVar.t || dwnaVar.z) {
            return;
        }
        dwnaVar.n(dwnaVar.a());
    }
}
