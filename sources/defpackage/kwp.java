package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwp extends kwq {
    private final WindowInsetsAnimation a;

    public kwp(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.kwq
    public final float g() {
        float interpolatedFraction;
        interpolatedFraction = this.a.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.kwq
    public final int h() {
        int typeMask;
        typeMask = this.a.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.kwq
    public final long i() {
        long durationMillis;
        durationMillis = this.a.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.kwq
    public final void j(float f) {
        this.a.setFraction(f);
    }
}
