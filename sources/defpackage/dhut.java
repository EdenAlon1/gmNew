package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhut {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        d(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long b(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        long j3 = j * j2;
        if (numberOfLeadingZeros > 65) {
            return j3;
        }
        d(numberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        d((j >= 0) | (j2 != Long.MIN_VALUE), "checkedMultiply", j, j2);
        d(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    public static long c(long j, long j2) {
        long j3 = j - j2;
        d(((j ^ j2) >= 0) | ((j ^ j3) >= 0), "checkedSubtract", j, j2);
        return j3;
    }

    private static void d(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }
}
