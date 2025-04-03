package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcya extends AnimatorListenerAdapter {
    final /* synthetic */ dcyc a;

    public dcya(dcyc dcycVar) {
        this.a = dcycVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.l = 0;
    }
}
