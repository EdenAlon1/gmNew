package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsni extends dsnk {
    public dsni(WindowInsetsAnimation windowInsetsAnimation) {
        super(windowInsetsAnimation);
    }

    @Override // defpackage.dsnk
    public final float a() {
        float interpolatedFraction;
        interpolatedFraction = this.a.getInterpolatedFraction();
        return 1.0f - interpolatedFraction;
    }
}
