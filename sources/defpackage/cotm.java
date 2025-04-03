package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotm extends covn {
    public final long a;
    public final long b;

    public cotm(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.covn
    public final long a() {
        return this.b;
    }

    @Override // defpackage.covn
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof covn) {
            covn covnVar = (covn) obj;
            if (this.a == covnVar.b() && this.b == covnVar.a()) {
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
        return "MessageLimitResult{requiredSize=" + this.a + ", maxMessageSize=" + this.b + "}";
    }
}
