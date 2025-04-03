package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbr implements Interpolator {
    private static final float a = 1.0f / a(1.0f);

    private static float a(float f) {
        return (float) (1.0d - Math.pow(100.0d, -f));
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - (a(1.0f - f) * a);
    }
}
