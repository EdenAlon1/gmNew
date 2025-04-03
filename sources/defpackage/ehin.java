package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehin implements TimeInterpolator {
    private final TimeInterpolator a;

    public ehin(TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new ehin(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
