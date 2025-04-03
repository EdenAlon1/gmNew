package defpackage;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhwy extends SecureRandom {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private fhqa d;

    public fhwy(byte[] bArr, fhqa fhqaVar) {
        this.a = bArr;
        this.d = fhqaVar;
        int length = bArr.length;
        if (length >= 48) {
            b(bArr);
            return;
        }
        int i = 48 - length;
        int b = fhqaVar.b();
        fhqaVar.e(bArr, 0, length);
        byte[] bArr2 = new byte[b];
        fhqaVar.a(bArr2, 0);
        if (i != b) {
            if (i < b) {
                bArr2 = fics.f(bArr2, i);
            } else {
                byte[] f = fics.f(bArr2, b);
                while (true) {
                    i -= b;
                    if (i < b) {
                        break;
                    }
                    fhqaVar.e(bArr2, 0, b);
                    bArr2 = new byte[b];
                    fhqaVar.a(bArr2, 0);
                    f = fics.e(f, bArr2);
                }
                if (i > 0) {
                    fhqaVar.e(bArr2, 0, b);
                    byte[] bArr3 = new byte[b];
                    fhqaVar.a(bArr3, 0);
                    int length2 = f.length;
                    f = fics.f(f, length2 + i);
                    System.arraycopy(bArr3, 0, f, length2, i);
                }
                bArr2 = f;
            }
        }
        b(fics.e(this.a, bArr2));
    }

    private static final void a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        char c;
        byte[] bArr4 = bArr2;
        try {
            byte[] bArr5 = fhqn.a;
            fhpy.a();
            int length = bArr.length;
            byte[] bArr6 = new byte[32];
            System.arraycopy(bArr, 0, bArr6, 0, 32);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 15, 4);
            int b = ficw.b(bArr6, 0);
            iArr[0][0] = b;
            int b2 = ficw.b(bArr6, 4);
            iArr[0][1] = b2;
            int i2 = 8;
            int b3 = ficw.b(bArr6, 8);
            iArr[0][2] = b3;
            int b4 = ficw.b(bArr6, 12);
            char c2 = 3;
            iArr[0][3] = b4;
            int i3 = 16;
            int b5 = ficw.b(bArr6, 16);
            iArr[1][0] = b5;
            int b6 = ficw.b(bArr6, 20);
            iArr[1][1] = b6;
            int i4 = 24;
            int b7 = ficw.b(bArr6, 24);
            iArr[1][2] = b7;
            int b8 = ficw.b(bArr6, 28);
            iArr[1][3] = b8;
            int i5 = 2;
            int i6 = 1;
            while (true) {
                int b9 = fhqn.b(fhqn.a(b8, i2)) ^ i6;
                i6 += i6;
                b ^= b9;
                int[] iArr2 = iArr[i5];
                iArr2[0] = b;
                b2 ^= b;
                iArr2[1] = b2;
                b3 ^= b2;
                iArr2[2] = b3;
                b4 ^= b3;
                iArr2[c2] = b4;
                c = c2;
                int i7 = i5 + 1;
                if (i7 >= 15) {
                    break;
                }
                int i8 = i4;
                int i9 = i2;
                int i10 = i3;
                b5 ^= fhqn.b(b4);
                int[] iArr3 = iArr[i7];
                iArr3[0] = b5;
                b6 ^= b5;
                iArr3[1] = b6;
                b7 ^= b6;
                iArr3[2] = b7;
                b8 ^= b7;
                iArr3[c] = b8;
                i5 += 2;
                bArr4 = bArr2;
                c2 = c;
                i2 = i9;
                i4 = i8;
                i3 = i10;
            }
            byte[] c3 = fics.c(fhqn.a);
            fhpy.a();
            int i11 = 0;
            while (true) {
                int length2 = bArr4.length;
                if (i11 == i3) {
                    return;
                }
                int i12 = i + i11;
                if (i11 > 0) {
                    throw new fhpz("input buffer too short");
                }
                if (i12 > bArr3.length - 16) {
                    throw new fhqb();
                }
                int b10 = ficw.b(bArr4, i11);
                int b11 = ficw.b(bArr4, i11 + 4);
                int b12 = ficw.b(bArr4, i11 + 8);
                int b13 = ficw.b(bArr4, i11 + 12);
                int[] iArr4 = iArr[0];
                int i13 = b10 ^ iArr4[0];
                int i14 = b11 ^ iArr4[1];
                int i15 = b12 ^ iArr4[2];
                int i16 = b13 ^ iArr4[c];
                int i17 = 1;
                while (i17 < 13) {
                    int[] iArr5 = fhqn.b;
                    int a = (fhqn.a(iArr5[(i15 >> 16) & PrivateKeyType.INVALID], i3) ^ (fhqn.a(iArr5[(i14 >> 8) & PrivateKeyType.INVALID], i4) ^ iArr5[i13 & PrivateKeyType.INVALID])) ^ fhqn.a(iArr5[(i16 >> 24) & PrivateKeyType.INVALID], 8);
                    int[] iArr6 = iArr[i17];
                    int i18 = a ^ iArr6[0];
                    byte[] bArr7 = c3;
                    int a2 = ((fhqn.a(iArr5[(i16 >> 16) & PrivateKeyType.INVALID], 16) ^ (iArr5[i14 & PrivateKeyType.INVALID] ^ fhqn.a(iArr5[(i15 >> 8) & PrivateKeyType.INVALID], 24))) ^ fhqn.a(iArr5[(i13 >> 24) & PrivateKeyType.INVALID], 8)) ^ iArr6[1];
                    int a3 = ((fhqn.a(iArr5[(i13 >> 16) & PrivateKeyType.INVALID], 16) ^ (iArr5[i15 & PrivateKeyType.INVALID] ^ fhqn.a(iArr5[(i16 >> 8) & PrivateKeyType.INVALID], 24))) ^ fhqn.a(iArr5[(i14 >> 24) & PrivateKeyType.INVALID], 8)) ^ iArr6[2];
                    int a4 = (((fhqn.a(iArr5[(i13 >> 8) & PrivateKeyType.INVALID], 24) ^ iArr5[i16 & PrivateKeyType.INVALID]) ^ fhqn.a(iArr5[(i14 >> 16) & PrivateKeyType.INVALID], 16)) ^ fhqn.a(iArr5[(i15 >> 24) & PrivateKeyType.INVALID], 8)) ^ iArr6[c];
                    int a5 = ((iArr5[i18 & PrivateKeyType.INVALID] ^ fhqn.a(iArr5[(a2 >> 8) & PrivateKeyType.INVALID], 24)) ^ fhqn.a(iArr5[(a3 >> 16) & PrivateKeyType.INVALID], 16)) ^ fhqn.a(iArr5[(a4 >> 24) & PrivateKeyType.INVALID], 8);
                    int[] iArr7 = iArr[i17 + 1];
                    int i19 = a5 ^ iArr7[0];
                    int a6 = (((iArr5[a2 & PrivateKeyType.INVALID] ^ fhqn.a(iArr5[(a3 >> 8) & PrivateKeyType.INVALID], 24)) ^ fhqn.a(iArr5[(a4 >> 16) & PrivateKeyType.INVALID], 16)) ^ fhqn.a(iArr5[(i18 >> 24) & PrivateKeyType.INVALID], 8)) ^ iArr7[1];
                    int a7 = (((iArr5[a3 & PrivateKeyType.INVALID] ^ fhqn.a(iArr5[(a4 >> 8) & PrivateKeyType.INVALID], 24)) ^ fhqn.a(iArr5[(i18 >> 16) & PrivateKeyType.INVALID], 16)) ^ fhqn.a(iArr5[(a2 >> 24) & PrivateKeyType.INVALID], 8)) ^ iArr7[2];
                    i17 += 2;
                    int a8 = ((fhqn.a(iArr5[(a2 >> 16) & PrivateKeyType.INVALID], 16) ^ (fhqn.a(iArr5[(i18 >> 8) & PrivateKeyType.INVALID], 24) ^ iArr5[a4 & PrivateKeyType.INVALID])) ^ fhqn.a(iArr5[(a3 >> 24) & PrivateKeyType.INVALID], 8)) ^ iArr7[c];
                    i13 = i19;
                    i14 = a6;
                    i15 = a7;
                    i4 = 24;
                    i3 = 16;
                    i16 = a8;
                    c3 = bArr7;
                }
                byte[] bArr8 = c3;
                int[] iArr8 = fhqn.b;
                int a9 = ((iArr8[i13 & PrivateKeyType.INVALID] ^ fhqn.a(iArr8[(i14 >> 8) & PrivateKeyType.INVALID], 24)) ^ fhqn.a(iArr8[(i15 >> 16) & PrivateKeyType.INVALID], 16)) ^ fhqn.a(iArr8[(i16 >> 24) & PrivateKeyType.INVALID], 8);
                int[] iArr9 = iArr[i17];
                int i20 = a9 ^ iArr9[0];
                int a10 = (((iArr8[i14 & PrivateKeyType.INVALID] ^ fhqn.a(iArr8[(i15 >> 8) & PrivateKeyType.INVALID], 24)) ^ fhqn.a(iArr8[(i16 >> 16) & PrivateKeyType.INVALID], 16)) ^ fhqn.a(iArr8[(i13 >> 24) & PrivateKeyType.INVALID], 8)) ^ iArr9[1];
                int a11 = (((iArr8[i15 & PrivateKeyType.INVALID] ^ fhqn.a(iArr8[(i16 >> 8) & PrivateKeyType.INVALID], 24)) ^ fhqn.a(iArr8[(i13 >> 16) & PrivateKeyType.INVALID], 16)) ^ fhqn.a(iArr8[(i14 >> 24) & PrivateKeyType.INVALID], 8)) ^ iArr9[2];
                int i21 = iArr8[i16 & PrivateKeyType.INVALID];
                int a12 = (fhqn.a(iArr8[(i15 >> 24) & PrivateKeyType.INVALID], 8) ^ ((fhqn.a(iArr8[(i13 >> 8) & PrivateKeyType.INVALID], 24) ^ i21) ^ fhqn.a(iArr8[(i14 >> 16) & PrivateKeyType.INVALID], 16))) ^ iArr9[c];
                byte[] bArr9 = fhqn.a;
                int i22 = (((bArr9[i20 & PrivateKeyType.INVALID] & 255) ^ ((bArr9[(a10 >> 8) & PrivateKeyType.INVALID] & 255) << 8)) ^ ((bArr8[(a11 >> 16) & PrivateKeyType.INVALID] & 255) << 16)) ^ (bArr8[(a12 >> 24) & PrivateKeyType.INVALID] << 24);
                int[] iArr10 = iArr[i17 + 1];
                int i23 = i22 ^ iArr10[0];
                int i24 = ((((bArr8[a10 & PrivateKeyType.INVALID] & 255) ^ ((bArr9[(a11 >> 8) & PrivateKeyType.INVALID] & 255) << 8)) ^ ((bArr9[(a12 >> 16) & PrivateKeyType.INVALID] & 255) << 16)) ^ (bArr8[(i20 >> 24) & PrivateKeyType.INVALID] << 24)) ^ iArr10[1];
                int i25 = ((((bArr8[a11 & PrivateKeyType.INVALID] & 255) ^ ((bArr9[(a12 >> 8) & PrivateKeyType.INVALID] & 255) << 8)) ^ ((bArr9[(i20 >> 16) & PrivateKeyType.INVALID] & 255) << 16)) ^ (bArr9[(a10 >> 24) & PrivateKeyType.INVALID] << 24)) ^ iArr10[2];
                int i26 = ((((bArr8[a12 & PrivateKeyType.INVALID] & 255) ^ ((bArr8[(i20 >> 8) & PrivateKeyType.INVALID] & 255) << 8)) ^ ((bArr8[(a10 >> 16) & PrivateKeyType.INVALID] & 255) << 16)) ^ (bArr9[(a11 >> 24) & PrivateKeyType.INVALID] << 24)) ^ iArr10[c];
                ficw.f(i23, bArr3, i12);
                ficw.f(i24, bArr3, i12 + 4);
                ficw.f(i25, bArr3, i12 + 8);
                ficw.f(i26, bArr3, i12 + 12);
                i11 += 16;
                bArr4 = bArr2;
                c3 = bArr8;
                i4 = 24;
                i3 = 16;
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: ".concat(String.valueOf(th.getMessage())), th);
        }
    }

    private final void b(byte[] bArr) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.b = bArr3;
        byte[] bArr4 = new byte[16];
        this.c = bArr4;
        c(bArr2, bArr3, bArr4);
    }

    private static final void c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            int i2 = 15;
            while (true) {
                if (i2 >= 0) {
                    byte b = bArr3[i2];
                    if ((b & 255) != 255) {
                        bArr3[i2] = (byte) (b + 1);
                        break;
                    } else {
                        bArr3[i2] = 0;
                        i2--;
                    }
                }
            }
            a(bArr2, bArr3, bArr4, i * 16);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        int length = bArr2.length;
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        int length2 = bArr3.length;
        System.arraycopy(bArr4, 32, bArr3, 0, 16);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = 15;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                byte[] bArr3 = this.c;
                byte b = bArr3[i2];
                if ((b & 255) != 255) {
                    bArr3[i2] = (byte) (b + 1);
                    break;
                } else {
                    bArr3[i2] = 0;
                    i2--;
                }
            }
            a(this.b, this.c, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i, 16);
                i += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, length);
                length = 0;
            }
        }
        c(null, this.b, this.c);
    }
}
