package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kwq {
    private final int a;
    private float b;
    private final Interpolator c;
    private final long d;

    public kwq(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public float g() {
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
    }

    public int h() {
        return this.a;
    }

    public long i() {
        return this.d;
    }

    public void j(float f) {
        this.b = f;
    }
}
