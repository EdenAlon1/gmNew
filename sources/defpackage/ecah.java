package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecah extends AnimatorListenerAdapter {
    final /* synthetic */ ecau a;

    public ecah(ecau ecauVar) {
        this.a = ecauVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.aU();
    }
}
