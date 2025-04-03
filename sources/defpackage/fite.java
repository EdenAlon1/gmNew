package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fite {
    public static int a(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException(a.s(j, "Value cannot fit in an int: "));
        }
        return (int) j;
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException(a.D(j2, j, "The calculation caused an overflow: ", " + "));
    }

    public static void c(fird firdVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new firo(firdVar.p(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }
}
