package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwj implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ kwr a;
    final /* synthetic */ kxh b;
    final /* synthetic */ kxh c;
    final /* synthetic */ int d;
    final /* synthetic */ View e;

    public kwj(kwr kwrVar, kxh kxhVar, kxh kxhVar2, int i, View view) {
        this.a = kwrVar;
        this.b = kxhVar;
        this.c = kxhVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.d(valueAnimator.getAnimatedFraction());
        float a = this.a.a();
        Interpolator interpolator = kwn.a;
        int i = Build.VERSION.SDK_INT;
        kxh kxhVar = this.b;
        kww kwvVar = i >= 34 ? new kwv(kxhVar) : Build.VERSION.SDK_INT >= 30 ? new kwu(kxhVar) : Build.VERSION.SDK_INT >= 29 ? new kwt(kxhVar) : new kws(kxhVar);
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((this.d & i2) == 0) {
                kwvVar.g(i2, kxhVar.f(i2));
            } else {
                kxh kxhVar2 = this.c;
                kpt f = kxhVar.f(i2);
                kpt f2 = kxhVar2.f(i2);
                float f3 = 1.0f - a;
                kwvVar.g(i2, kxh.i(f, (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d), (int) (((f.e - f2.e) * f3) + 0.5d)));
            }
        }
        kwn.e(this.e, kwvVar.a(), Collections.singletonList(this.a));
    }
}
