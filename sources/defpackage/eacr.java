package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eacr extends AnimatorListenerAdapter {
    final /* synthetic */ eacs a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ eacu d;

    public eacr(eacu eacuVar, eacs eacsVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = eacsVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = eacuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.p(this.a.b);
        this.d.d.remove(this.a.b);
        this.d.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        wr wrVar = this.a.b;
    }
}
