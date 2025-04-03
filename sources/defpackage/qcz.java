package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qcz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ qdb a;

    public qcz(qdb qdbVar) {
        this.a = qdbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        qdb qdbVar = this.a;
        qjf qjfVar = qdbVar.i;
        if (qjfVar != null) {
            qjfVar.o(qdbVar.b.c());
        }
    }
}
