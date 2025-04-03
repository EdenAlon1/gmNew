package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebrn extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ ebrp b;

    public ebrn(ebrp ebrpVar, boolean z) {
        this.a = z;
        this.b = ebrpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.b.s(true);
            this.b.t(true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            return;
        }
        this.b.s(false);
        this.b.t(false);
    }
}
