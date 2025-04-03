package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eduh extends edvr {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public eduh(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // defpackage.edvr
    public final long a() {
        return this.a;
    }

    @Override // defpackage.edvr
    public final long b() {
        return this.c;
    }

    @Override // defpackage.edvr
    public final long c() {
        return this.b;
    }

    @Override // defpackage.edvr
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edvr) {
            edvr edvrVar = (edvr) obj;
            if (this.a == edvrVar.a() && this.b == edvrVar.c() && this.c == edvrVar.b() && this.d == edvrVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.c;
        long j4 = j3 ^ (j3 >>> 32);
        long j5 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((((i ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ ((int) j4)) * 1000003);
    }

    public final String toString() {
        return "ReportId{customerId=" + this.a + ", projectId=" + this.b + ", metricId=" + this.c + ", reportId=" + this.d + "}";
    }
}
