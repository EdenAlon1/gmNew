package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ge_frombytes {
    static int[] d = {-10913610, 13857413, -15372611, 6949391, 114729, -8787816, -6275908, -3247719, -18696448, -12055116};
    static int[] sqrtm1 = {-32595792, -7943725, 9377950, 3500415, 12389472, -272473, -25146209, -2005654, 326686, 11406482};

    static int ge_frombytes_negate_vartime(ge_p3 ge_p3Var, byte[] bArr) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        fe_frombytes.fe_frombytes(ge_p3Var.Y, bArr);
        fe_1.fe_1(ge_p3Var.Z);
        fe_sq.fe_sq(iArr, ge_p3Var.Y);
        fe_mul.fe_mul(iArr2, iArr, d);
        fe_sub.fe_sub(iArr, iArr, ge_p3Var.Z);
        fe_add.fe_add(iArr2, iArr2, ge_p3Var.Z);
        fe_sq.fe_sq(iArr3, iArr2);
        fe_mul.fe_mul(iArr3, iArr3, iArr2);
        fe_sq.fe_sq(ge_p3Var.X, iArr3);
        int[] iArr6 = ge_p3Var.X;
        fe_mul.fe_mul(iArr6, iArr6, iArr2);
        int[] iArr7 = ge_p3Var.X;
        fe_mul.fe_mul(iArr7, iArr7, iArr);
        int[] iArr8 = ge_p3Var.X;
        fe_pow22523.fe_pow22523(iArr8, iArr8);
        int[] iArr9 = ge_p3Var.X;
        fe_mul.fe_mul(iArr9, iArr9, iArr3);
        int[] iArr10 = ge_p3Var.X;
        fe_mul.fe_mul(iArr10, iArr10, iArr);
        fe_sq.fe_sq(iArr4, ge_p3Var.X);
        fe_mul.fe_mul(iArr4, iArr4, iArr2);
        fe_sub.fe_sub(iArr5, iArr4, iArr);
        if (fe_isnonzero.fe_isnonzero(iArr5) != 0) {
            fe_add.fe_add(iArr5, iArr4, iArr);
            if (fe_isnonzero.fe_isnonzero(iArr5) != 0) {
                return -1;
            }
            int[] iArr11 = ge_p3Var.X;
            fe_mul.fe_mul(iArr11, iArr11, sqrtm1);
        }
        if (fe_isnegative.fe_isnegative(ge_p3Var.X) == ((bArr[31] >>> 7) & 1)) {
            int[] iArr12 = ge_p3Var.X;
            fe_neg.fe_neg(iArr12, iArr12);
        }
        fe_mul.fe_mul(ge_p3Var.T, ge_p3Var.X, ge_p3Var.Y);
        return 0;
    }
}
