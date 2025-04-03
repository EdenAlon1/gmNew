package defpackage;

import android.opengl.Matrix;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mbt {
    public static final float[][] a = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};

    public static lux a(int i, int i2, List list) {
        lti.b(i > 0, "inputWidth must be positive");
        lti.b(i2 > 0, "inputHeight must be positive");
        lux luxVar = new lux(i, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            luxVar = ((mbf) list.get(i3)).e(luxVar.c, luxVar.d);
        }
        return luxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static engw b(float[] fArr, engw engwVar) {
        engr engrVar = new engr();
        int i = 0;
        while (i < ((enou) engwVar).c) {
            float[] fArr2 = new float[4];
            float[] fArr3 = fArr;
            Matrix.multiplyMV(fArr2, 0, fArr3, 0, (float[]) engwVar.get(i), 0);
            float f = fArr2[0];
            float f2 = fArr2[3];
            fArr2[0] = f / f2;
            fArr2[1] = fArr2[1] / f2;
            fArr2[2] = fArr2[2] / f2;
            fArr2[3] = 1.0f;
            engrVar.h(fArr2);
            i++;
            fArr = fArr3;
        }
        return engrVar.g();
    }

    public static boolean c(float[] fArr, float[] fArr2) {
        lti.b(fArr2.length == 4, "Expecting 4 plane parameters");
        return ((fArr2[0] * fArr[0]) + (fArr2[1] * fArr[1])) + (fArr2[2] * fArr[2]) <= fArr2[3];
    }

    public static float[] d(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        lti.b(fArr2.length == 4, "Expecting 4 plane parameters");
        float f = fArr[0];
        float f2 = fArr3[0];
        float f3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr2[1];
        float f7 = fArr[2];
        float f8 = fArr3[2];
        float f9 = fArr2[2];
        float f10 = fArr4[0] - f2;
        float f11 = fArr4[1] - f5;
        float f12 = fArr4[2] - f8;
        float f13 = ((((f - f2) * f3) + ((f4 - f5) * f6)) + ((f7 - f8) * f9)) / (((f3 * f10) + (f6 * f11)) + (f9 * f12));
        return new float[]{f2 + (f10 * f13), f5 + (f11 * f13), f8 + (f12 * f13), 1.0f};
    }
}
