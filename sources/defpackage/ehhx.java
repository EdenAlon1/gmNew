package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehhx {
    static void a(float f, float[] fArr) {
        float f2 = f + f;
        if (f <= 0.5f) {
            fArr[0] = 1.0f - f2;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = f2 - 1.0f;
        }
    }
}
