package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqo {
    private final long a;
    private final long b;

    public pqo(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ffkj.e(getClass(), obj.getClass())) {
            pqo pqoVar = (pqo) obj;
            if (pqoVar.a == this.a && pqoVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (pqn.a(this.a) * 31) + pqn.a(this.b);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
