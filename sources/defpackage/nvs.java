package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nvs extends AnimatorListenerAdapter {
    final /* synthetic */ nva a;
    final /* synthetic */ nvx b;

    public nvs(nvx nvxVar, nva nvaVar) {
        this.a = nvaVar;
        this.b = nvxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.k(2);
        nvx nvxVar = this.b;
        if (nvxVar.u) {
            this.a.post(nvxVar.o);
            this.b.u = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k(3);
    }
}
