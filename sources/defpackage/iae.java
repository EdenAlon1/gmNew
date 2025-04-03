package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class iae {
    public static String a(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "CornerRadius.circular(" + iag.a(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + iag.a(Float.intBitsToFloat(i2)) + ", " + iag.a(Float.intBitsToFloat(i)) + ')';
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
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
