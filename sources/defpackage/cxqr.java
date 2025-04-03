package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqr extends cxqx {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ cxqy b;

    public cxqr(cxqy cxqyVar, ValueAnimator valueAnimator) {
        this.a = valueAnimator;
        this.b = cxqyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        cxqy cxqyVar = this.b;
        cxqyVar.h = cxqyVar.a();
        cxqy cxqyVar2 = this.b;
        int i = cxqy.a[cxqyVar2.h];
        cxqyVar2.i = i;
        this.a.setObjectValues(Integer.valueOf(i), Integer.valueOf(cxqy.a[this.b.a()]));
    }
}
