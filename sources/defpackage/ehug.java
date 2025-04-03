package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehug extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ float b;

    public ehug(View view, float f) {
        this.a = view;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setTranslationX(this.b);
    }
}
