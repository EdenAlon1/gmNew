package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class kaf {
    public final long a;

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return (int) (j >> 32);
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof kaf) && j == ((kaf) obj).a;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final int hashCode() {
        return kae.a(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
