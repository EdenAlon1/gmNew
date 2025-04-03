package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kzz implements Interpolator {
    final /* synthetic */ lab a;

    public kzz(lab labVar) {
        this.a = labVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.b.getInterpolation(f);
    }
}
