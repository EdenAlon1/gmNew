package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etlk {
    private static final int[] a = f(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int g = g(i5 ^ iArr[i4], 16);
        iArr[i4] = g;
        int i6 = iArr[i3] + g;
        iArr[i3] = i6;
        int g2 = g(iArr[i2] ^ i6, 12);
        iArr[i2] = g2;
        int i7 = iArr[i] + g2;
        iArr[i] = i7;
        int g3 = g(iArr[i4] ^ i7, 8);
        iArr[i4] = g3;
        int i8 = iArr[i3] + g3;
        iArr[i3] = i8;
        iArr[i2] = g(iArr[i2] ^ i8, 7);
    }

    static void b(int[] iArr, int[] iArr2) {
        int[] iArr3 = a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void c(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static byte[] d(byte[] bArr, byte[] bArr2) {
        int[] e = e(f(bArr), f(bArr2));
        ByteBuffer order = ByteBuffer.allocate(e.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(e);
        return order.array();
    }

    static int[] e(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        b(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    static int[] f(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    private static int g(int i, int i2) {
        int i3 = -i2;
        return (i >>> i3) | (i << i2);
    }
}
