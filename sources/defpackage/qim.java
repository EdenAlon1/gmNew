package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qim {
    public final float[] a;
    public final int[] b;

    public qim(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final qim a(float[] fArr) {
        int a;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            int binarySearch = Arrays.binarySearch(this.a, f);
            if (binarySearch >= 0) {
                a = this.b[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    a = this.b[0];
                } else {
                    int[] iArr2 = this.b;
                    int length = iArr2.length - 1;
                    if (i2 == length) {
                        a = iArr2[length];
                    } else {
                        float[] fArr2 = this.a;
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        a = qln.a((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = a;
        }
        return new qim(fArr, iArr);
    }
}
