package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbl extends AnimatorListenerAdapter {
    final /* synthetic */ exbu a;

    public exbl(exbu exbuVar) {
        this.a = exbuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c.dismiss();
    }
}
