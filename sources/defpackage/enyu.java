package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enyu {
    private int a;
    private final int[] b;

    public enyu() {
        emxf.d(true, "Unsupported N: %s", 2);
        int[] iArr = new int[10];
        this.b = iArr;
        Arrays.fill(iArr, 0, 2, 0);
        this.a = 0;
    }

    public final int a(int i) {
        int i2 = this.a;
        if (i2 < 2) {
            i2++;
            this.a = i2;
        }
        while (true) {
            i2--;
            if (i2 < 0) {
                return i;
            }
            int[] iArr = this.b;
            i += iArr[i2];
            iArr[i2] = i;
        }
    }
}
