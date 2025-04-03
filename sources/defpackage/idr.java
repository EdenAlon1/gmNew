package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class idr {
    public static final long a = ids.a(0.5f, 0.5f);
    public final long b;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof idr) && this.b == ((idr) obj).b;
    }

    public final int hashCode() {
        return idq.a(this.b);
    }

    public final String toString() {
        return c(this.b);
    }
}
