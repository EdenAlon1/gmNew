package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class ite {
    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final int b(long j, long j2) {
        boolean d = d(j);
        if (d != d(j2)) {
            return d ? -1 : 1;
        }
        return (Math.min(a(j), a(j2)) >= 0.0f && c(j) != c(j2)) ? c(j) ? -1 : 1 : (int) Math.signum(a(j) - a(j2));
    }

    public static final boolean c(long j) {
        return (j & 2) != 0;
    }

    public static final boolean d(long j) {
        return (j & 1) != 0;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
