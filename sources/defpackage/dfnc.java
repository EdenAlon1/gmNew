package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfnc {
    public static long a(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j = -5435081209227447693L;
        boolean z = false;
        if (length <= 32) {
            if (length > 16) {
                long d = d(bArr2, 0) * (-5435081209227447693L);
                long d2 = d(bArr2, 8);
                long j2 = (length + length) - 7286425919675154353L;
                long d3 = d(bArr2, length - 8) * j2;
                return c(Long.rotateRight(d + d2, 43) + Long.rotateRight(d3, 30) + (d(bArr2, length - 16) * (-7286425919675154353L)), d + Long.rotateRight(d2 - 7286425919675154353L, 18) + d3, j2);
            }
            if (length >= 8) {
                long j3 = (length + length) - 7286425919675154353L;
                long d4 = d(bArr2, 0) - 7286425919675154353L;
                long d5 = d(bArr2, length - 8);
                return c((Long.rotateRight(d5, 37) * j3) + d4, (Long.rotateRight(d4, 25) + d5) * j3, j3);
            }
            if (length >= 4) {
                return c(length + ((b(bArr2, 0) & 4294967295L) << 3), b(bArr2, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            return e((((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L))) * (-7286425919675154353L);
        }
        char c = '@';
        if (length <= 64) {
            long d6 = d(bArr2, 0) * (-7286425919675154353L);
            long d7 = d(bArr2, 8);
            long j4 = (length + length) - 7286425919675154353L;
            long d8 = d(bArr2, length - 8) * j4;
            long d9 = d(bArr2, length - 16) * (-7286425919675154353L);
            long rotateRight = Long.rotateRight(d6 + d7, 43) + Long.rotateRight(d8, 30);
            long rotateRight2 = Long.rotateRight(d7 - 7286425919675154353L, 18) + d6;
            long d10 = d(bArr2, 16) * j4;
            long d11 = d(bArr2, 24);
            long j5 = rotateRight + d9;
            long d12 = j5 + d(bArr2, length - 32);
            long j6 = d12 * j4;
            return c(Long.rotateRight(d10 + d11, 43) + Long.rotateRight(j6, 30) + ((c(j5, rotateRight2 + d8, j4) + d(bArr2, length - 24)) * j4), d10 + Long.rotateRight(d11 + d6, 18) + j6, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long d13 = d(bArr2, 0) + 95310865018149119L;
        long e = e(-7956866745689871395L) * (-7286425919675154353L);
        long j7 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            boolean z2 = z;
            int i3 = (i2 >> 6) * 64;
            char c2 = c;
            long rotateRight3 = Long.rotateRight(d13 + j7 + jArr[z2 ? 1 : 0] + d(bArr2, i + 8), 37) * j;
            long rotateRight4 = Long.rotateRight(j7 + jArr[1] + d(bArr2, i + 48), 42) * j;
            long j8 = rotateRight3 ^ jArr2[1];
            long j9 = j;
            long d14 = d(bArr2, i + 40) + jArr[z2 ? 1 : 0];
            long rotateRight5 = Long.rotateRight(e + jArr2[z2 ? 1 : 0], 33) * j9;
            int i4 = i;
            f(bArr2, i4, jArr[1] * j9, j8 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            j7 = rotateRight4 + d14;
            f(bArr2, i4 + 32, rotateRight5 + jArr2[1], d(bArr2, i4 + 16) + j7, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j10 = j8 & 255;
                long j11 = j10 + j10 + j9;
                long j12 = jArr2[z2 ? 1 : 0] + i5;
                long j13 = jArr3[z2 ? 1 : 0] + j12;
                jArr3[z2 ? 1 : 0] = j13;
                jArr2[z2 ? 1 : 0] = j12 + j13;
                long rotateRight6 = Long.rotateRight(rotateRight5 + j7 + j13 + d(bArr2, i6 - 55), 37) * j11;
                long rotateRight7 = Long.rotateRight(j7 + jArr3[1] + d(bArr2, i6 - 15), 42) * j11;
                long j14 = jArr2[1] * 9;
                long d15 = (jArr3[z2 ? 1 : 0] * 9) + d(bArr2, i6 - 23);
                long rotateRight8 = Long.rotateRight(j8 + jArr2[z2 ? 1 : 0], 33) * j11;
                long j15 = rotateRight6 ^ j14;
                f(bArr2, i6 - 63, jArr3[1] * j11, j15 + jArr2[z2 ? 1 : 0], jArr3);
                long j16 = rotateRight7 + d15;
                f(bArr2, i6 - 31, jArr2[1] + rotateRight8, d(bArr2, i6 - 47) + j16, jArr2);
                return c(c(jArr3[z2 ? 1 : 0], jArr2[z2 ? 1 : 0], j11) + (e(j16) * (-4348849565147123417L)) + j15, c(jArr3[1], jArr2[1], j11) + rotateRight8, j11);
            }
            bArr2 = bArr;
            c = c2;
            z = z2 ? 1 : 0;
            e = j8;
            j = j9;
            d13 = rotateRight5;
            jArr = jArr3;
        }
    }

    private static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long d(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    private static long e(long j) {
        return j ^ (j >>> 47);
    }

    private static void f(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long d = j + d(bArr, i);
        long d2 = d(bArr, i + 8);
        long d3 = d(bArr, i + 16);
        long d4 = d(bArr, i + 24);
        long j3 = d2 + d + d3;
        long rotateRight = Long.rotateRight(j2 + d + d4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + d4;
        jArr[1] = rotateRight + d;
    }
}
