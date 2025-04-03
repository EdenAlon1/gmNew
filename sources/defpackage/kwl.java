package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwl implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ kwr b;
    final /* synthetic */ kwh c;
    final /* synthetic */ ValueAnimator d;

    public kwl(View view, kwr kwrVar, kwh kwhVar, ValueAnimator valueAnimator) {
        this.a = view;
        this.b = kwrVar;
        this.c = kwhVar;
        this.d = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kwn.f(this.a, this.b, this.c);
        this.d.start();
    }
}
