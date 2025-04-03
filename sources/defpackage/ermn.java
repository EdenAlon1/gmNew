package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermn extends ermo {
    public static int a(long j) {
        int i = (int) j;
        emxf.e(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int b(int i, int i2, int i3) {
        emxf.g(true, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        emxf.g(length >= 4, "array too small: %s < %s", length, 4);
        return d(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int d(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int e(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(int... iArr) {
        emxf.a(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int g(long j) {
        if (j > 2147483647L) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static Integer h(String str) {
        return i(str, 10);
    }

    public static Integer i(String str, int i) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i2 = charAt == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                int a = ermp.a(str.charAt(i2));
                if (a >= 0 && a < i) {
                    long j = i;
                    long j2 = -a;
                    long j3 = Long.MIN_VALUE;
                    long j4 = Long.MIN_VALUE / j;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            int a2 = ermp.a(str.charAt(i3));
                            if (a2 < 0 || a2 >= i || j2 < j4) {
                                break;
                            }
                            long j5 = j3;
                            long j6 = a2;
                            long j7 = j2 * j;
                            if (j7 < j6 + j5) {
                                break;
                            }
                            j2 = j7 - j6;
                            i3 = i4;
                            j3 = j5;
                        } else {
                            long j8 = j3;
                            if (charAt == '-') {
                                valueOf = Long.valueOf(j2);
                            } else if (j2 != j8) {
                                valueOf = Long.valueOf(-j2);
                            }
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static List j(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new ermm(iArr, 0, length);
    }

    public static byte[] k(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int[] l(Collection collection) {
        if (collection instanceof ermm) {
            ermm ermmVar = (ermm) collection;
            return Arrays.copyOfRange(ermmVar.a, ermmVar.b, ermmVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
