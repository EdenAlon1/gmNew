package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecio extends ecjl {
    public final long a;
    public final long b;

    public ecio(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.ecjl
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ecjl
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecjl) {
            ecjl ecjlVar = (ecjl) obj;
            if (this.a == ecjlVar.a() && this.b == ecjlVar.b()) {
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
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }
}
