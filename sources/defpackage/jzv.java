package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jzv {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jzv) && this.a == ((jzv) obj).a;
    }

    public final int hashCode() {
        return jzu.a(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) jzq.a(b(j))) + " x " + ((Object) jzq.a(a(j)));
    }
}
