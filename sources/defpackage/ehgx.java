package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgx extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ ehhg b;

    public ehgx(ehhg ehhgVar, boolean z) {
        this.a = z;
        this.b = ehhgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ehhg ehhgVar = this.b;
        ehhgVar.A = 0;
        ehhgVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.B.g(0, this.a);
        ehhg ehhgVar = this.b;
        ehhgVar.A = 2;
        ehhgVar.v = animator;
    }
}
