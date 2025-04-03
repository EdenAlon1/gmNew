package defpackage;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujr {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        int i = 0;
        copyOf[0] = (byte) (copyOf[0] & 248);
        int i2 = copyOf[31] & Byte.MAX_VALUE;
        copyOf[31] = (byte) i2;
        copyOf[31] = (byte) (i2 | 64);
        byte[][] bArr3 = etqs.a;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        for (int i3 = 0; i3 < 7; i3++) {
            if (MessageDigest.isEqual(etqs.a[i3], copyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(euiv.a(etqs.a[i3])));
            }
        }
        long[] l = etrf.l(copyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i4 = 10;
        System.arraycopy(l, 0, jArr2, 0, 10);
        for (int i5 = 32; i < i5; i5 = 32) {
            int i6 = copyOf[31 - i] & 255;
            int i7 = 0;
            while (i7 < 8) {
                int i8 = (i6 >> (7 - i7)) & 1;
                etqs.b(jArr4, jArr2, i8);
                etqs.b(jArr5, jArr3, i8);
                byte[] bArr4 = copyOf;
                long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                int i9 = i6;
                long[] jArr10 = new long[19];
                int i10 = i;
                long[] jArr11 = new long[19];
                int i11 = i7;
                long[] jArr12 = new long[19];
                long[] jArr13 = jArr;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                etrf.j(jArr4, jArr4, jArr5);
                etrf.i(jArr5, copyOf3, jArr5);
                long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                etrf.j(jArr2, jArr2, jArr3);
                etrf.i(jArr3, copyOf4, jArr3);
                etrf.c(jArr14, jArr2, jArr5);
                etrf.c(jArr15, jArr4, jArr3);
                etrf.f(jArr14);
                etrf.e(jArr14);
                etrf.f(jArr15);
                etrf.e(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                etrf.j(jArr14, jArr14, jArr15);
                etrf.i(jArr15, copyOf4, jArr15);
                etrf.h(jArr18, jArr14);
                etrf.h(jArr17, jArr15);
                etrf.c(jArr15, jArr17, l);
                etrf.f(jArr15);
                etrf.e(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                etrf.h(jArr11, jArr4);
                etrf.h(jArr12, jArr5);
                etrf.c(jArr8, jArr11, jArr12);
                etrf.f(jArr8);
                etrf.e(jArr8);
                etrf.i(jArr12, jArr11, jArr12);
                Arrays.fill(jArr10, 10, 18, 0L);
                etrf.g(jArr10, jArr12, 121665L);
                etrf.e(jArr10);
                etrf.j(jArr10, jArr10, jArr11);
                etrf.c(jArr16, jArr12, jArr10);
                etrf.f(jArr16);
                etrf.e(jArr16);
                etqs.b(jArr8, jArr6, i8);
                etqs.b(jArr16, jArr7, i8);
                i7 = i11 + 1;
                long[] jArr20 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr20;
                long[] jArr21 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr21;
                long[] jArr22 = jArr5;
                jArr5 = jArr16;
                jArr9 = jArr22;
                jArr2 = jArr6;
                i6 = i9;
                copyOf = bArr4;
                i = i10;
                jArr = jArr13;
                jArr6 = jArr19;
            }
            i++;
            i4 = 10;
        }
        int i12 = i4;
        long[] jArr23 = jArr;
        long[] jArr24 = new long[i12];
        etrf.a(jArr24, jArr5);
        etrf.b(jArr23, jArr4, jArr24);
        long[] jArr25 = new long[i12];
        long[] jArr26 = new long[i12];
        long[] jArr27 = new long[11];
        long[] jArr28 = new long[11];
        long[] jArr29 = new long[11];
        etrf.b(jArr25, l, jArr23);
        etrf.j(jArr26, l, jArr23);
        long[] jArr30 = new long[i12];
        jArr30[0] = 486662;
        etrf.j(jArr28, jArr26, jArr30);
        etrf.b(jArr28, jArr28, jArr3);
        etrf.j(jArr28, jArr28, jArr2);
        etrf.b(jArr28, jArr28, jArr25);
        etrf.b(jArr28, jArr28, jArr2);
        etrf.g(jArr27, jArr28, 4L);
        etrf.e(jArr27);
        etrf.b(jArr28, jArr25, jArr3);
        etrf.i(jArr28, jArr28, jArr3);
        etrf.b(jArr29, jArr26, jArr2);
        etrf.j(jArr28, jArr28, jArr29);
        etrf.h(jArr28, jArr28);
        if (MessageDigest.isEqual(etrf.k(jArr27), etrf.k(jArr28))) {
            return etrf.k(jArr23);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(euiv.a(bArr2)));
    }

    public static byte[] b() {
        byte[] b = ettg.b(32);
        b[0] = (byte) (b[0] | 7);
        int i = b[31] & 63;
        b[31] = (byte) i;
        b[31] = (byte) (i | 128);
        return b;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }
}
