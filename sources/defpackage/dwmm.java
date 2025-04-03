package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmm extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dwna b;

    public dwmm(dwna dwnaVar, Runnable runnable) {
        this.a = runnable;
        this.b = dwnaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dwna dwnaVar = this.b;
        dwnaVar.t = false;
        if (dwnaVar.p()) {
            dwna dwnaVar2 = this.b;
            ((TextView) dwnaVar2.h).setTextColor(dwnaVar2.j);
        }
        dwna dwnaVar3 = this.b;
        if (dwnaVar3.q()) {
            dwnaVar3.h.setDrawingCacheEnabled(dwnaVar3.o);
        }
        this.b.setVisibility(8);
        this.b.q = null;
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.t = true;
    }
}
