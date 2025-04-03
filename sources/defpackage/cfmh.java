package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmh {
    public static final cfmh a = new cfmh(0);
    public static final cfmh b = new cfmh(1);
    public static final cfmh c = new cfmh(2);
    public final long d;

    static {
        new cfmh(3L);
    }

    public cfmh(long j) {
        this.d = j;
        if (j < 0 || j >= 4) {
            throw new IllegalArgumentException(a.y(j, "EncryptionProtocol value ", " must be in [0, 3]"));
        }
    }

    public final boolean a(cfmh cfmhVar) {
        cfmhVar.getClass();
        long j = this.d;
        long j2 = cfmhVar.d;
        return (j & j2) == j2;
    }

    public final boolean b() {
        return a(c);
    }

    public final boolean c() {
        return a(b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfmh) && this.d == ((cfmh) obj).d;
    }

    public final int hashCode() {
        long j = this.d;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "EncryptionProtocol(value=" + this.d + ")";
    }
}
