package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jzt {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) jzq.a(a(j))) + ", " + ((Object) jzq.a(b(j))) + ')';
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jzt) && this.a == ((jzt) obj).a;
    }

    public final int hashCode() {
        return jzs.a(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
