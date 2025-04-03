package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mbr {
    public static float[] a(mbs mbsVar) {
        Matrix g = mbsVar.g();
        float[][] fArr = mbt.a;
        float[] fArr2 = new float[9];
        g.getValues(fArr2);
        float[] fArr3 = new float[16];
        fArr3[10] = 1.0f;
        int i = 0;
        while (i < 3) {
            int i2 = 0;
            while (i2 < 3) {
                fArr3[((i == 2 ? 3 : i) * 4) + (i2 == 2 ? 3 : i2)] = fArr2[(i * 3) + i2];
                i2++;
            }
            i++;
        }
        float[] fArr4 = new float[16];
        android.opengl.Matrix.transposeM(fArr4, 0, fArr3, 0);
        return fArr4;
    }
}
