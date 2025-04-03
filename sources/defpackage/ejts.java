package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejts extends ejvd {
    public final long a;

    public ejts(long j) {
        this.a = j;
    }

    @Override // defpackage.ejvd
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ejvd) && this.a == ((ejvd) obj).a();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "FetchTaskIdentifier{index=" + this.a + "}";
    }
}
