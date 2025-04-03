package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehlu extends AnimatorListenerAdapter {
    final /* synthetic */ ehlw a;

    public ehlu(ehlw ehlwVar) {
        this.a = ehlwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ehlw ehlwVar = this.a;
        List list = ehlwVar.l;
        if (list == null || ehlwVar.m) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((pbt) it.next()).b(ehlwVar);
        }
    }
}
