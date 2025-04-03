package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehlr extends lej {
    @Override // defpackage.lej
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = ehls.h;
        return ((ehls) obj).b() * 10000.0f;
    }

    @Override // defpackage.lej
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        final ehls ehlsVar = (ehls) obj;
        int i = ehls.h;
        ehlsVar.d(f / 10000.0f);
        if (ehlsVar.j.b(true)) {
            if (ehlsVar.d == null) {
                ehlsVar.f = ehjz.a(ehlsVar.i, R.attr.motionEasingStandardInterpolator, egyv.a);
                ehlsVar.g = ehjz.a(ehlsVar.i, R.attr.motionEasingEmphasizedAccelerateInterpolator, egyv.a);
                ehlsVar.d = new ValueAnimator();
                ehlsVar.d.setDuration(500L);
                ehlsVar.d.setFloatValues(0.0f, 1.0f);
                ehlsVar.d.setInterpolator(null);
                ehlsVar.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehlp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ehls ehlsVar2 = ehls.this;
                        ehlsVar2.b.e = ehlsVar2.e.getInterpolation(ehlsVar2.d.getAnimatedFraction());
                    }
                });
            }
            float a = ehlsVar.a((int) f);
            if (a == ehlsVar.c) {
                if (ehlsVar.d.isRunning()) {
                    return;
                }
                ehlsVar.c(a);
                return;
            }
            if (ehlsVar.d.isRunning()) {
                ehlsVar.d.cancel();
            }
            ehlsVar.c = a;
            if (a == 1.0f) {
                ehlsVar.e = ehlsVar.f;
                ehlsVar.d.start();
            } else {
                ehlsVar.e = ehlsVar.g;
                ehlsVar.d.reverse();
            }
        }
    }
}
