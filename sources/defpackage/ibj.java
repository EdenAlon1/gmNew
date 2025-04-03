package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibj {
    public static final int a(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return Float.isNaN(f2) ? 0 : 1;
    }
}
