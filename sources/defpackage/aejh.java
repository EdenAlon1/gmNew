package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aejh extends AnimatorListenerAdapter {
    final /* synthetic */ aeji a;

    public aejh(aeji aejiVar) {
        this.a = aejiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aeji aejiVar = this.a;
        aejiVar.s.setVisibility(8);
        aejiVar.t.setVisibility(0);
        aejiVar.t.l(-1);
        aejiVar.t.d();
    }
}
