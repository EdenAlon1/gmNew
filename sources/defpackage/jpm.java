package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jpm {
    public static final long a = jpn.a(0, 0);
    public final long b;

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return c(j) - d(j);
    }

    public static final int c(long j) {
        return Math.max(e(j), a(j));
    }

    public static final int d(long j) {
        return Math.min(e(j), a(j));
    }

    public static final int e(long j) {
        return (int) (j >> 32);
    }

    public static String f(long j) {
        return "TextRange(" + e(j) + ", " + a(j) + ')';
    }

    public static final boolean g(long j, long j2) {
        return (d(j) <= d(j2)) & (c(j2) <= c(j));
    }

    public static final boolean h(long j, long j2) {
        return j == j2;
    }

    public static final boolean i(long j) {
        return e(j) == a(j);
    }

    public static final boolean j(long j) {
        return e(j) > a(j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jpm) && this.b == ((jpm) obj).b;
    }

    public final int hashCode() {
        return jpl.a(this.b);
    }

    public final String toString() {
        return f(this.b);
    }
}
