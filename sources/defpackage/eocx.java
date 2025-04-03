package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eocx extends eocv {
    public static final eodc a = new eocx();

    private static long h(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long i(long j) {
        return j ^ (j >>> 47);
    }

    private static void j(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = j + eodm.b(bArr, i);
        long b2 = eodm.b(bArr, i + 8);
        long b3 = eodm.b(bArr, i + 16);
        long b4 = eodm.b(bArr, i + 24);
        long j3 = b2 + b + b3;
        long rotateRight = Long.rotateRight(j2 + b + b4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + b4;
        jArr[1] = rotateRight + b;
    }

    @Override // defpackage.eocr
    public final eodb e(byte[] bArr, int i) {
        int i2;
        boolean z;
        int i3;
        long j;
        long j2;
        long rotateRight;
        long[] jArr;
        long j3;
        byte[] bArr2 = bArr;
        boolean z2 = false;
        emxf.k(0, i, bArr2.length);
        long j4 = -4348849565147123417L;
        long j5 = -7286425919675154353L;
        if (i <= 32) {
            if (i > 16) {
                long b = eodm.b(bArr2, 0) * (-5435081209227447693L);
                long b2 = eodm.b(bArr2, 8);
                long j6 = i;
                long j7 = (j6 + j6) - 7286425919675154353L;
                long b3 = eodm.b(bArr2, i - 8) * j7;
                j5 = h(Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30) + (eodm.b(bArr2, i - 16) * (-7286425919675154353L)), b + Long.rotateRight(b2 - 7286425919675154353L, 18) + b3, j7);
            } else if (i >= 8) {
                long j8 = i;
                long j9 = (j8 + j8) - 7286425919675154353L;
                long b4 = eodm.b(bArr2, 0) - 7286425919675154353L;
                long b5 = eodm.b(bArr2, i - 8);
                j5 = h((Long.rotateRight(b5, 37) * j9) + b4, (Long.rotateRight(b4, 25) + b5) * j9, j9);
            } else if (i >= 4) {
                j5 = h(i + ((eodm.a(bArr2, 0) & 4294967295L) << 3), eodm.a(bArr2, i - 4) & 4294967295L, (i + i) - 7286425919675154353L);
            } else if (i > 0) {
                j5 = (-7286425919675154353L) * i((((bArr2[0] & 255) + ((bArr2[i >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((((bArr2[i - 1] & 255) << 2) + i) * (-4348849565147123417L)));
            }
        } else if (i <= 64) {
            long b6 = eodm.b(bArr2, 0) * (-7286425919675154353L);
            long b7 = eodm.b(bArr2, 8);
            long j10 = i;
            long j11 = (j10 + j10) - 7286425919675154353L;
            long b8 = eodm.b(bArr2, i - 8) * j11;
            long b9 = eodm.b(bArr2, i - 16) * (-7286425919675154353L);
            long rotateRight2 = Long.rotateRight(b6 + b7, 43) + Long.rotateRight(b8, 30);
            long rotateRight3 = Long.rotateRight(b7 - 7286425919675154353L, 18) + b6;
            long b10 = eodm.b(bArr2, 16) * j11;
            long b11 = eodm.b(bArr2, 24);
            long j12 = rotateRight2 + b9;
            long b12 = j12 + eodm.b(bArr2, i - 32);
            long j13 = b12 * j11;
            j5 = h(Long.rotateRight(b10 + b11, 43) + Long.rotateRight(j13, 30) + ((h(j12, rotateRight3 + b8, j11) + eodm.b(bArr2, i - 24)) * j11), b10 + Long.rotateRight(b11 + b6, 18) + j13, j11);
        } else {
            long[] jArr2 = new long[2];
            long[] jArr3 = new long[2];
            long b13 = eodm.b(bArr2, 0) + 95310865018149119L;
            long i4 = i(-7956866745689871395L) * (-7286425919675154353L);
            long j14 = 2480279821605975764L;
            int i5 = 0;
            while (true) {
                i2 = i - 1;
                z = z2;
                i3 = (i2 >> 6) * 64;
                j = j4;
                long rotateRight4 = Long.rotateRight(b13 + j14 + jArr2[z ? 1 : 0] + eodm.b(bArr2, i5 + 8), 37) * (-5435081209227447693L);
                long rotateRight5 = Long.rotateRight(j14 + jArr2[1] + eodm.b(bArr2, i5 + 48), 42) * (-5435081209227447693L);
                j2 = rotateRight4 ^ jArr3[1];
                long b14 = jArr2[z ? 1 : 0] + eodm.b(bArr2, i5 + 40);
                rotateRight = Long.rotateRight(i4 + jArr3[z ? 1 : 0], 33) * (-5435081209227447693L);
                j(bArr2, i5, jArr2[1] * (-5435081209227447693L), j2 + jArr3[z ? 1 : 0], jArr2);
                int i6 = i5;
                jArr = jArr2;
                j3 = rotateRight5 + b14;
                j(bArr2, i6 + 32, rotateRight + jArr3[1], eodm.b(bArr2, i6 + 16) + j3, jArr3);
                i5 = i6 + 64;
                if (i5 == i3) {
                    break;
                }
                bArr2 = bArr;
                z2 = z ? 1 : 0;
                i4 = j2;
                b13 = rotateRight;
                jArr2 = jArr;
                j14 = j3;
                j4 = j;
            }
            int i7 = i2 & 63;
            int i8 = i3 + i7;
            long j15 = j2 & 255;
            long j16 = (j15 + j15) - 5435081209227447693L;
            long j17 = jArr3[z ? 1 : 0] + i7;
            long j18 = jArr[z ? 1 : 0] + j17;
            jArr[z ? 1 : 0] = j18;
            jArr3[z ? 1 : 0] = j17 + j18;
            long rotateRight6 = Long.rotateRight(rotateRight + j3 + j18 + eodm.b(bArr2, i8 - 55), 37) * j16;
            long rotateRight7 = Long.rotateRight(j3 + jArr[1] + eodm.b(bArr2, i8 - 15), 42) * j16;
            long j19 = jArr3[1] * 9;
            long b15 = (jArr[z ? 1 : 0] * 9) + eodm.b(bArr2, i8 - 23);
            long rotateRight8 = Long.rotateRight(j2 + jArr3[z ? 1 : 0], 33) * j16;
            long j20 = rotateRight6 ^ j19;
            j(bArr2, i8 - 63, jArr[1] * j16, j20 + jArr3[z ? 1 : 0], jArr);
            long j21 = rotateRight7 + b15;
            j(bArr2, i8 - 31, jArr3[1] + rotateRight8, eodm.b(bArr2, i8 - 47) + j21, jArr3);
            j5 = h(h(jArr[z ? 1 : 0], jArr3[z ? 1 : 0], j16) + (i(j21) * j) + j20, h(jArr[1], jArr3[1], j16) + rotateRight8, j16);
        }
        long j22 = j5;
        int i9 = eodb.b;
        return new eoda(j22);
    }

    @Override // defpackage.eodc
    public final int g() {
        throw null;
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
