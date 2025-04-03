package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class cmv {
    public final long a;

    public static final int a(long j) {
        return (int) (j >> 32);
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static long c(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cmv) && this.a == ((cmv) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append(a(j));
        sb.append(", ");
        sb.append(b(j));
        sb.append(')');
        return sb.toString();
    }
}
