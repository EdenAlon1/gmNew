package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apcs {
    public final long a;

    public apcs(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apcs) && this.a == ((apcs) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "BugleAnalyticsId(value=" + this.a + ")";
    }
}
