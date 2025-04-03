package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermr {
    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int b(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static long c(byte[] bArr) {
        int length = bArr.length;
        emxf.g(length >= 8, "array too small: %s < %s", length, 8);
        return d(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long d(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return (b8 & 255) | ((b7 & 255) << 8) | ((b & 255) << 56) | ((b2 & 255) << 48) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16);
    }

    public static long e(long... jArr) {
        emxf.a(true);
        long j = jArr[0];
        for (int i = 1; i < 3; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static byte[] f(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static long[] g(Collection collection) {
        if (collection instanceof ermq) {
            ermq ermqVar = (ermq) collection;
            return Arrays.copyOfRange(ermqVar.a, ermqVar.b, ermqVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }
}
