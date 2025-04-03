package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erky {
    public static double a(double d) {
        return -Math.nextUp(-d);
    }

    static long b(double d) {
        emxf.b(c(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean c(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
