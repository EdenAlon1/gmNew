package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class kak {
    public final long b;
    private static final kam[] c = {new kam(0), new kam(4294967296L), new kam(8589934592L)};
    public static final long a = kal.d(0, Float.NaN);

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long b(long j) {
        return j & 1095216660480L;
    }

    public static final long c(long j) {
        return c[(int) (b(j) >>> 32)].a;
    }

    public static String d(long j) {
        long c2 = c(j);
        if (kam.b(c2, 0L)) {
            return "Unspecified";
        }
        if (kam.b(c2, 4294967296L)) {
            return a(j) + ".sp";
        }
        if (!kam.b(c2, 8589934592L)) {
            return "Invalid";
        }
        return a(j) + ".em";
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kak) && this.b == ((kak) obj).b;
    }

    public final int hashCode() {
        return kaj.a(this.b);
    }

    public final String toString() {
        return d(this.b);
    }
}
