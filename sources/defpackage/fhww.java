package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhww {
    public static final short[][] a(short[][] sArr, short[][] sArr2) {
        int length;
        int length2 = sArr.length;
        if (length2 != sArr2.length || (length = sArr[0].length) != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length2, length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr3[i][i2] = fhwx.a(sArr[i][i2], sArr2[i][i2]);
            }
        }
        return sArr3;
    }

    public static final short[][] b(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short b = fhwx.b(sArr[i][i2], sArr2[i2][i3]);
                    short[] sArr4 = sArr3[i];
                    sArr4[i3] = fhwx.a(sArr4[i3], b);
                }
            }
        }
        return sArr3;
    }

    public static final short[][][] c(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        int length;
        short[][] sArr4 = sArr2[0];
        int length2 = sArr4.length;
        short[][] sArr5 = sArr3[0];
        int length3 = sArr5.length;
        if (length2 == length3) {
            int length4 = sArr4[0].length;
            int length5 = sArr5[0].length;
            if (length4 == length5 && sArr2.length == sArr[0].length && (length = sArr3.length) == sArr.length) {
                short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, length, length3, length5);
                for (int i = 0; i < sArr2[0].length; i++) {
                    for (int i2 = 0; i2 < sArr2[0][0].length; i2++) {
                        for (int i3 = 0; i3 < sArr.length; i3++) {
                            for (int i4 = 0; i4 < sArr[0].length; i4++) {
                                short b = fhwx.b(sArr[i3][i4], sArr2[i4][i][i2]);
                                short[] sArr7 = sArr6[i3][i];
                                sArr7[i2] = fhwx.a(sArr7[i2], b);
                            }
                            short[] sArr8 = sArr6[i3][i];
                            sArr8[i2] = fhwx.a(sArr3[i3][i][i2], sArr8[i2]);
                        }
                    }
                }
                return sArr6;
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }

    public static final short[][] d(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i2][i] = sArr[i][i2];
            }
        }
        return sArr2;
    }

    public static final short[][] e(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return a(sArr, d(sArr));
        }
        throw new RuntimeException("Addition is not possible!");
    }
}
