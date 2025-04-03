package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehlt extends AnimatorListenerAdapter {
    final /* synthetic */ ehlw a;

    public ehlt(ehlw ehlwVar) {
        this.a = ehlwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        ehlw ehlwVar = this.a;
        List list = ehlwVar.l;
        if (list == null || ehlwVar.m) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((pbt) it.next()).c(ehlwVar);
        }
    }
}
