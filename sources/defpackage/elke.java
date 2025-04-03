package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elke extends elko {
    public final long a;
    public final long b;

    public elke(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.elko
    public final long a() {
        return this.a;
    }

    @Override // defpackage.elko
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elko) {
            elko elkoVar = (elko) obj;
            if (this.a == elkoVar.a() && this.b == elkoVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "AsyncInfo{dispatchMarkId=" + this.a + ", dispatchMarkTimeNanos=" + this.b + "}";
    }
}
