package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class faw {
    public static final long a = b(Float.NaN, Float.NaN);

    public static long a(jzn jznVar) {
        return b(jznVar.ec(), jznVar.ed());
    }

    public static long b(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final boolean c(long j, long j2) {
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
