package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqy {
    private static final etqt c = new etqt(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final etqv a = new etqv(new etqw(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] b = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static int a(long[] jArr) {
        return etrf.k(jArr)[0] & 1;
    }

    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static long c(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | b(bArr, i);
    }

    public static void d(etqv etqvVar, etqx etqxVar, etqt etqtVar) {
        etqw etqwVar = etqxVar.a;
        long[] jArr = new long[10];
        etrf.j(etqvVar.a.a, etqwVar.b, etqwVar.a);
        etqw etqwVar2 = etqxVar.a;
        etrf.i(etqvVar.a.b, etqwVar2.b, etqwVar2.a);
        long[] jArr2 = etqtVar.b;
        long[] jArr3 = etqvVar.a.b;
        etrf.b(jArr3, jArr3, jArr2);
        etqw etqwVar3 = etqvVar.a;
        etrf.b(etqwVar3.c, etqwVar3.a, etqtVar.a);
        etrf.b(etqvVar.b, etqxVar.b, etqtVar.c);
        etqtVar.b(etqvVar.a.a, etqxVar.a.c);
        long[] jArr4 = etqvVar.a.a;
        etrf.j(jArr, jArr4, jArr4);
        etqw etqwVar4 = etqvVar.a;
        etrf.i(etqwVar4.a, etqwVar4.c, etqwVar4.b);
        etqw etqwVar5 = etqvVar.a;
        long[] jArr5 = etqwVar5.c;
        long[] jArr6 = etqwVar5.b;
        etrf.j(jArr6, jArr5, jArr6);
        etrf.j(etqvVar.a.c, jArr, etqvVar.b);
        long[] jArr7 = etqvVar.b;
        etrf.i(jArr7, jArr, jArr7);
    }

    public static void e(etqv etqvVar, etqw etqwVar) {
        long[] jArr = new long[10];
        etrf.h(etqvVar.a.a, etqwVar.a);
        etrf.h(etqvVar.a.c, etqwVar.b);
        etrf.h(etqvVar.b, etqwVar.c);
        long[] jArr2 = etqvVar.b;
        etrf.j(jArr2, jArr2, jArr2);
        etrf.j(etqvVar.a.b, etqwVar.a, etqwVar.b);
        etrf.h(jArr, etqvVar.a.b);
        etqw etqwVar2 = etqvVar.a;
        etrf.j(etqwVar2.b, etqwVar2.c, etqwVar2.a);
        etqw etqwVar3 = etqvVar.a;
        long[] jArr3 = etqwVar3.a;
        long[] jArr4 = etqwVar3.c;
        etrf.i(jArr4, jArr4, jArr3);
        etqw etqwVar4 = etqvVar.a;
        etrf.i(etqwVar4.a, jArr, etqwVar4.b);
        long[] jArr5 = etqvVar.a.c;
        long[] jArr6 = etqvVar.b;
        etrf.i(jArr6, jArr6, jArr5);
    }

    public static void f(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static void g(etqv etqvVar, etqx etqxVar, etqt etqtVar) {
        etqw etqwVar = etqxVar.a;
        long[] jArr = new long[10];
        etrf.j(etqvVar.a.a, etqwVar.b, etqwVar.a);
        etqw etqwVar2 = etqxVar.a;
        etrf.i(etqvVar.a.b, etqwVar2.b, etqwVar2.a);
        long[] jArr2 = etqtVar.a;
        long[] jArr3 = etqvVar.a.b;
        etrf.b(jArr3, jArr3, jArr2);
        etqw etqwVar3 = etqvVar.a;
        etrf.b(etqwVar3.c, etqwVar3.a, etqtVar.b);
        etrf.b(etqvVar.b, etqxVar.b, etqtVar.c);
        etqtVar.b(etqvVar.a.a, etqxVar.a.c);
        long[] jArr4 = etqvVar.a.a;
        etrf.j(jArr, jArr4, jArr4);
        etqw etqwVar4 = etqvVar.a;
        etrf.i(etqwVar4.a, etqwVar4.c, etqwVar4.b);
        etqw etqwVar5 = etqvVar.a;
        long[] jArr5 = etqwVar5.c;
        long[] jArr6 = etqwVar5.b;
        etrf.j(jArr6, jArr5, jArr6);
        etrf.i(etqvVar.a.c, jArr, etqvVar.b);
        long[] jArr7 = etqvVar.b;
        etrf.j(jArr7, jArr, jArr7);
    }

    public static boolean h(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        etrf.e(jArr2);
        byte[] k = etrf.k(jArr2);
        for (int i = 0; i < 32; i++) {
            if (k[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] i(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) euil.d.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static byte[] j(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        etqv etqvVar = new etqv(a);
        etqx etqxVar = new etqx();
        for (i = 1; i < 64; i += 2) {
            etqt etqtVar = new etqt(c);
            m(etqtVar, i / 2, bArr2[i]);
            etqx.a(etqxVar, etqvVar);
            d(etqvVar, etqxVar, etqtVar);
        }
        etqw etqwVar = new etqw();
        etqw.b(etqwVar, etqvVar);
        e(etqvVar, etqwVar);
        etqw.b(etqwVar, etqvVar);
        e(etqvVar, etqwVar);
        etqw.b(etqwVar, etqvVar);
        e(etqvVar, etqwVar);
        etqw.b(etqwVar, etqvVar);
        e(etqvVar, etqwVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            etqt etqtVar2 = new etqt(c);
            m(etqtVar2, i7 / 2, bArr2[i7]);
            etqx.a(etqxVar, etqvVar);
            d(etqvVar, etqxVar, etqtVar2);
        }
        etqw etqwVar2 = new etqw(etqvVar);
        long[] jArr = new long[10];
        etrf.h(jArr, etqwVar2.a);
        long[] jArr2 = new long[10];
        etrf.h(jArr2, etqwVar2.b);
        long[] jArr3 = new long[10];
        etrf.h(jArr3, etqwVar2.c);
        long[] jArr4 = new long[10];
        etrf.h(jArr4, jArr3);
        long[] jArr5 = new long[10];
        etrf.i(jArr5, jArr2, jArr);
        etrf.b(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        etrf.b(jArr6, jArr, jArr2);
        etrf.b(jArr6, jArr6, etra.a);
        etrf.j(jArr6, jArr6, jArr4);
        etrf.d(jArr6, jArr6);
        if (MessageDigest.isEqual(etrf.k(jArr5), etrf.k(jArr6))) {
            return etqwVar2.a();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] k(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b3 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static int l(int i, int i2) {
        int i3 = (~(i ^ i2)) & PrivateKeyType.INVALID;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static void m(etqt etqtVar, int i, byte b2) {
        int i2 = (b2 & 255) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        etqtVar.a(etra.d[i][0], l(i4, 1));
        etqtVar.a(etra.d[i][1], l(i4, 2));
        etqtVar.a(etra.d[i][2], l(i4, 3));
        etqtVar.a(etra.d[i][3], l(i4, 4));
        etqtVar.a(etra.d[i][4], l(i4, 5));
        etqtVar.a(etra.d[i][5], l(i4, 6));
        etqtVar.a(etra.d[i][6], l(i4, 7));
        etqtVar.a(etra.d[i][7], l(i4, 8));
        long[] jArr = etqtVar.c;
        long[] jArr2 = etqtVar.a;
        long[] copyOf = Arrays.copyOf(etqtVar.b, 10);
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = Arrays.copyOf(jArr, 10);
        f(copyOf3, copyOf3);
        etqtVar.a(new etqt(copyOf, copyOf2, copyOf3), i2);
    }
}
