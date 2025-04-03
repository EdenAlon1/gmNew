package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjt {
    public static final int a(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int d = d(arrayList, i, i2);
        return d >= 0 ? d : -(d + 1);
    }

    public static final int c(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    public static final int d(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((hen) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int a = ffkj.a(i5, i);
            if (a < 0) {
                i3 = i4 + 1;
            } else {
                if (a <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int e(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    public static final hen f(ArrayList arrayList, int i, int i2) {
        int d = d(arrayList, i, i2);
        if (d >= 0) {
            return (hen) arrayList.get(d);
        }
        return null;
    }

    public static final void g() {
        throw new ConcurrentModificationException();
    }

    public static final void h(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 3] = i2;
    }

    public static final void i(int[] iArr, int i, int i2) {
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
