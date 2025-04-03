package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tj implements Runnable {
    final /* synthetic */ tn a;

    public tj(tn tnVar) {
        this.a = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn tnVar = this.a;
        int i = tnVar.q;
        if (i == 1) {
            tnVar.p.cancel();
        } else if (i != 2) {
            return;
        }
        tnVar.q = 3;
        ValueAnimator valueAnimator = tnVar.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        tnVar.p.setDuration(500L);
        tnVar.p.start();
    }
}
