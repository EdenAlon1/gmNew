package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class kam {
    public final long a;

    public static String a(long j) {
        return b(j, 0L) ? "Unspecified" : b(j, 4294967296L) ? "Sp" : b(j, 8589934592L) ? "Em" : "Invalid";
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kam) && this.a == ((kam) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return a(this.a);
    }
}
