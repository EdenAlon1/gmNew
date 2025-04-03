package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxwe implements Interpolator {
    private final float a;

    public cxwe(float f) {
        this.a = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.a;
        return f < f2 ? f / f2 : (1.0f - f) / (1.0f - f2);
    }
}
