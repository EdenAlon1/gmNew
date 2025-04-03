package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwk extends AnimatorListenerAdapter {
    final /* synthetic */ kwr a;
    final /* synthetic */ View b;

    public kwk(kwr kwrVar, View view) {
        this.a = kwrVar;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d(1.0f);
        kwn.c(this.b, this.a);
    }
}
