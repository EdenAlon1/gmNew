package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdw {
    public static double a(double d) {
        double d2 = d % 360.0d;
        return d2 < eobe.a ? d2 + 360.0d : d2;
    }

    public static int b(double d) {
        if (d < eobe.a) {
            return -1;
        }
        return d == eobe.a ? 0 : 1;
    }

    public static double[] c(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        return new double[]{d2 + d4 + d6, d7 + d8 + d9, (d * dArr5[0]) + (d3 * dArr5[1]) + (d5 * dArr5[2])};
    }
}
