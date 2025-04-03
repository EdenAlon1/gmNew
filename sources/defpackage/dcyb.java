package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcyb extends AnimatorListenerAdapter {
    final /* synthetic */ dcyc a;

    public dcyb(dcyc dcycVar) {
        this.a = dcycVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dcyc dcycVar = this.a;
        dcycVar.l = 3;
        dcycVar.d.removeView(dcycVar.a);
        dcycVar.a.setVisibility(8);
    }
}
