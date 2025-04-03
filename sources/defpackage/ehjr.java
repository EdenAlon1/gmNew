package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjr extends AnimatorListenerAdapter {
    final /* synthetic */ ehjs a;

    public ehjr(ehjs ehjsVar) {
        this.a = ehjsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setTranslationY(0.0f);
        this.a.g(0.0f);
    }
}
