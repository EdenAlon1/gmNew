package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class iar {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + iag.a(Float.intBitsToFloat((int) (j >> 32))) + ", " + iag.a(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof iar) && j == ((iar) obj).a;
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final boolean g(long j) {
        long j2 = (~(-(((-9223372034707292160L) & j) >>> 31))) & j;
        return (((j2 & 4294967295L) & (j2 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public final boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public final int hashCode() {
        return iaq.a(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
