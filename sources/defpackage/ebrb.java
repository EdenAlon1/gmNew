package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebrb extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public ebrb(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
