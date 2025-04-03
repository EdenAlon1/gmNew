package defpackage;

import java.math.BigInteger;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhtb implements Cloneable {
    public long[] b;
    private static final short[] c = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    static final byte[] a = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    public fhtb(int i) {
        this.b = new long[i];
    }

    public static long d(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr2[i2 + i5];
            int i6 = i + i5;
            jArr[i6] = (j | (j2 << i4)) ^ jArr[i6];
            j = j2 >>> (64 - i4);
        }
        return j;
    }

    public static long e(int i) {
        short[] sArr = c;
        return ((sArr[i & PrivateKeyType.INVALID] | (sArr[(i >>> 8) & PrivateKeyType.INVALID] << 16)) & 4294967295L) | ((((sArr[i >>> 24] << 16) | sArr[(i >>> 16) & PrivateKeyType.INVALID]) & 4294967295L) << 32);
    }

    public static void f(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            jArr3[i3 + i5] = jArr[i + i5] ^ jArr2[i2 + i5];
        }
    }

    public static void g(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            jArr[i6] = jArr[i6] ^ (jArr2[i2 + i5] ^ jArr3[i3 + i5]);
        }
    }

    public static void o(long j, long[] jArr, int i, long[] jArr2) {
        long[] jArr3;
        int i2 = i;
        long[] jArr4 = jArr2;
        if ((j & 1) != 0) {
            jArr3 = jArr;
            u(jArr4, 0, jArr3, 0, i2);
        } else {
            jArr3 = jArr;
        }
        long j2 = j;
        int i3 = 1;
        while (true) {
            j2 >>>= 1;
            if (j2 == 0) {
                return;
            }
            if ((j2 & 1) != 0) {
                long d = d(jArr4, 0, jArr3, 0, i2, i3);
                if (d != 0) {
                    jArr2[i] = jArr2[i] ^ d;
                }
            }
            i3++;
            jArr3 = jArr;
            i2 = i;
            jArr4 = jArr2;
        }
    }

    public static void p(long[] jArr, int i, int i2, int[] iArr) {
        v(jArr, i);
        int length = iArr.length;
        while (true) {
            int i3 = i - i2;
            length--;
            if (length < 0) {
                v(jArr, i3);
                return;
            }
            v(jArr, iArr[length] + i3);
        }
    }

    public static int q(long[] jArr, int i, int i2, int[] iArr) {
        int i3;
        int[] iArr2 = iArr;
        int i4 = (i2 + 63) >>> 6;
        if (i < i4) {
            return i;
        }
        int i5 = i << 6;
        int min = Math.min(i5, (i2 + i2) - 1);
        int i6 = i5 - min;
        while (i6 >= 64) {
            i--;
            i6 -= 64;
        }
        int length = iArr2.length;
        int i7 = iArr2[length - 1];
        int i8 = length > 1 ? iArr2[length - 2] : 0;
        int max = Math.max(i2, i7 + 64);
        int min2 = (i6 + Math.min(min - max, i2 - i8)) >> 6;
        if (min2 > 1) {
            int i9 = i - min2;
            int i10 = i - i9;
            int i11 = i9 << 6;
            int i12 = i11 - i2;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                w(jArr, jArr, i9, i10, iArr2[length] + i12);
            }
            w(jArr, jArr, i9, i10, i12);
            while (i > i9) {
                i--;
                jArr[i] = 0;
            }
            min = i11;
        }
        if (min > max) {
            while (true) {
                i3 = max >>> 6;
                i--;
                if (i <= i3) {
                    break;
                }
                long j = jArr[i];
                if (j != 0) {
                    jArr[i] = 0;
                    y(jArr, i << 6, j, i2, iArr2);
                }
                iArr2 = iArr;
            }
            int i13 = max & 63;
            long j2 = jArr[i3];
            long j3 = j2 >>> i13;
            if (j3 != 0) {
                jArr[i3] = j2 ^ (j3 << i13);
                iArr2 = iArr;
                min = max;
                y(jArr, min, j3, i2, iArr2);
            } else {
                iArr2 = iArr;
                min = max;
            }
        }
        int i14 = min;
        if (i14 > i2) {
            while (true) {
                i14--;
                if (i14 < i2) {
                    break;
                }
                if ((jArr[i14 >>> 6] & (1 << (i14 & 63))) != 0) {
                    p(jArr, i14, i2, iArr2);
                }
            }
        }
        return i4;
    }

    public static fhtb r(long[] jArr, int i, int i2, int[] iArr) {
        return new fhtb(jArr, q(jArr, i, i2, iArr));
    }

    public static void s(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr[i + i5];
            jArr2[i2 + i5] = j | (j2 << i4);
            j = j2 >>> (64 - i4);
        }
    }

    private static int t(long j) {
        int i;
        int i2 = 32;
        int i3 = (int) (j >>> 32);
        if (i3 == 0) {
            i3 = (int) j;
            i2 = 0;
        }
        int i4 = i3 >>> 16;
        if (i4 == 0) {
            int i5 = i3 >>> 8;
            i = i5 == 0 ? a[i3] : a[i5] + 8;
        } else {
            int i6 = i3 >>> 24;
            i = i6 == 0 ? a[i4] + 16 : a[i6] + 24;
        }
        return i2 + i;
    }

    private static void u(long[] jArr, int i, long[] jArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    private static void v(long[] jArr, int i) {
        int i2 = i >>> 6;
        jArr[i2] = jArr[i2] ^ (1 << (i & 63));
    }

    private static void w(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        int i4 = i3 & 63;
        int i5 = i3 >>> 6;
        int i6 = i2;
        if (i4 == 0) {
            u(jArr, i5, jArr2, i, i6);
            return;
        }
        int i7 = i5 + 1;
        int i8 = 64 - i4;
        long j = 0;
        while (true) {
            i6--;
            if (i6 < 0) {
                jArr[i5] = jArr[i5] ^ j;
                return;
            }
            long j2 = jArr2[i + i6];
            int i9 = i7 + i6;
            jArr[i9] = (j | (j2 >>> i8)) ^ jArr[i9];
            j = j2 << (64 - i8);
        }
    }

    private static void x(long[] jArr, int i, long j) {
        int i2 = i & 63;
        int i3 = i >>> 6;
        if (i2 == 0) {
            jArr[i3] = j ^ jArr[i3];
            return;
        }
        jArr[i3] = jArr[i3] ^ (j << i2);
        long j2 = j >>> (64 - i2);
        if (j2 != 0) {
            int i4 = i3 + 1;
            jArr[i4] = j2 ^ jArr[i4];
        }
    }

    private static void y(long[] jArr, int i, long j, int i2, int[] iArr) {
        int length = iArr.length;
        while (true) {
            int i3 = i - i2;
            length--;
            if (length < 0) {
                x(jArr, i3, j);
                return;
            }
            x(jArr, i3 + iArr[length], j);
        }
    }

    public final int a() {
        int length = this.b.length;
        while (length != 0) {
            length--;
            long j = this.b[length];
            if (j != 0) {
                return (length << 6) + t(j);
            }
        }
        return 0;
    }

    public final int b(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.b[i2];
            if (j != 0) {
                return (i2 << 6) + t(j);
            }
        }
        return 0;
    }

    public final int c() {
        long[] jArr = this.b;
        int length = jArr.length;
        int min = Math.min(length, length);
        if (min <= 0) {
            return 0;
        }
        if (jArr[0] == 0) {
            while (true) {
                int i = min - 1;
                if (jArr[i] != 0) {
                    return min;
                }
                if (i <= 0) {
                    return 0;
                }
                min = i;
            }
        } else {
            while (true) {
                int i2 = min - 1;
                if (jArr[i2] != 0) {
                    return min;
                }
                min = i2;
            }
        }
    }

    public final Object clone() {
        long[] jArr = this.b;
        return new fhtb(jArr == null ? null : (long[]) jArr.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhtb)) {
            return false;
        }
        fhtb fhtbVar = (fhtb) obj;
        int c2 = c();
        if (fhtbVar.c() != c2) {
            return false;
        }
        for (int i = 0; i < c2; i++) {
            if (this.b[i] != fhtbVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    public final void h(fhtb fhtbVar, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 & 63;
        int i5 = i2 >>> 6;
        if (i4 == 0) {
            u(this.b, i5, fhtbVar.b, 0, i3);
            return;
        }
        long d = d(this.b, i5, fhtbVar.b, 0, i3, i4);
        if (d != 0) {
            long[] jArr = this.b;
            int i6 = i3 + i5;
            jArr[i6] = d ^ jArr[i6];
        }
    }

    public final int hashCode() {
        int c2 = c();
        int i = 1;
        for (int i2 = 0; i2 < c2; i2++) {
            long j = this.b[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public final void i(int i, int[] iArr) {
        long[] jArr = this.b;
        int length = jArr.length;
        int q = q(jArr, length, i, iArr);
        if (q < length) {
            long[] jArr2 = new long[q];
            this.b = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, q);
        }
    }

    public final boolean j() {
        long[] jArr = this.b;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean k() {
        for (long j : this.b) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public final long[] l(int i) {
        long[] jArr = new long[i];
        long[] jArr2 = this.b;
        System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, i));
        return jArr;
    }

    public final void m(fhtb fhtbVar) {
        int c2 = fhtbVar.c();
        if (c2 == 0) {
            return;
        }
        if (c2 > this.b.length) {
            this.b = l(c2);
        }
        u(this.b, 0, fhtbVar.b, 0, c2);
    }

    public final fhtb n(fhtb fhtbVar) {
        int a2 = a();
        if (a2 == 0) {
            return this;
        }
        int a3 = fhtbVar.a();
        if (a3 == 0) {
            return fhtbVar;
        }
        fhtb fhtbVar2 = a2 > a3 ? this : fhtbVar;
        fhtb fhtbVar3 = a2 <= a3 ? this : fhtbVar;
        int i = a2 > a3 ? a2 : a3;
        if (a2 > a3) {
            a2 = a3;
        }
        int i2 = a2 + i + 62;
        int i3 = (a2 + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = (i + 63) >>> 6;
        if (i3 == 1) {
            long j = fhtbVar3.b[0];
            if (j == 1) {
                return fhtbVar2;
            }
            long[] jArr = new long[i4];
            o(j, fhtbVar2.b, i5, jArr);
            return new fhtb(jArr, i4);
        }
        int i6 = (i + 70) >>> 6;
        int i7 = i6 << 4;
        int[] iArr = new int[16];
        long[] jArr2 = new long[i7];
        iArr[1] = i6;
        System.arraycopy(fhtbVar2.b, 0, jArr2, i6, i5);
        int i8 = 2;
        int i9 = i6;
        while (i8 < 16) {
            int i10 = i9 + i6;
            iArr[i8] = i10;
            if ((i8 & 1) == 0) {
                s(jArr2, i10 >>> 1, jArr2, i10, i6, 1);
            } else {
                int i11 = i6;
                f(jArr2, i11, jArr2, i10 - i6, jArr2, i10, i11);
                i6 = i11;
                i10 = i10;
            }
            i8++;
            i9 = i10;
        }
        long[] jArr3 = new long[i7];
        s(jArr2, 0, jArr3, 0, i7, 4);
        long[] jArr4 = fhtbVar3.b;
        int i12 = i4 << 3;
        long[] jArr5 = new long[i12];
        for (int i13 = 0; i13 < i3; i13++) {
            long j2 = jArr4[i13];
            int i14 = i13;
            while (true) {
                long[] jArr6 = jArr2;
                int i15 = i6;
                g(jArr5, i14, jArr6, iArr[((int) j2) & 15], jArr3, iArr[((int) (j2 >>> 4)) & 15], i15);
                jArr2 = jArr6;
                i6 = i15;
                j2 >>>= 8;
                if (j2 == 0) {
                    break;
                }
                i14 += i4;
            }
        }
        while (true) {
            int i16 = i12 - i4;
            if (i16 == 0) {
                return new fhtb(jArr5, i4);
            }
            d(jArr5, i16 - i4, jArr5, i16, i4, 8);
            i12 = i16;
        }
    }

    public final String toString() {
        int c2 = c();
        if (c2 == 0) {
            return "0";
        }
        int i = c2 - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.b[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.b[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public fhtb(long[] jArr) {
        this.b = jArr;
    }

    public fhtb(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            int i = 1;
            if (bigInteger.signum() == 0) {
                this.b = new long[]{0};
                return;
            }
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (byteArray[0] == 0) {
                length--;
            } else {
                i = 0;
            }
            int i2 = (length + 7) / 8;
            this.b = new long[i2];
            int i3 = i2 - 1;
            int i4 = (length % 8) + i;
            if (i < i4) {
                long j = 0;
                while (i < i4) {
                    j = (j << 8) | (byteArray[i] & 255);
                    i++;
                }
                this.b[i3] = j;
                i3 = i2 - 2;
            }
            while (i3 >= 0) {
                long j2 = 0;
                int i5 = 0;
                while (i5 < 8) {
                    j2 = (j2 << 8) | (byteArray[i] & 255);
                    i5++;
                    i++;
                }
                this.b[i3] = j2;
                i3--;
            }
            return;
        }
        throw new IllegalArgumentException("invalid F2m field value");
    }

    public fhtb(long[] jArr, int i) {
        if (i == jArr.length) {
            this.b = jArr;
            return;
        }
        long[] jArr2 = new long[i];
        this.b = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }
}
