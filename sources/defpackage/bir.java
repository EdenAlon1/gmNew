package defpackage;

import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bir {
    public static void a(float[] fArr, float f) {
        d(fArr, 0.5f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        c(fArr, 0.5f);
    }

    public static void b(float[] fArr) {
        d(fArr, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        c(fArr, 0.0f);
    }

    private static void c(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, -f, -0.5f, 0.0f);
    }

    private static void d(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, f, 0.5f, 0.0f);
    }
}
