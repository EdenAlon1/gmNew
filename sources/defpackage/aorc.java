package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aorc extends aott {
    private final long a;
    private final long b;
    private final long c;

    public aorc(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.aott
    public final long a() {
        return this.b;
    }

    @Override // defpackage.aott
    public final long b() {
        return this.c;
    }

    @Override // defpackage.aott
    public final long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aott) {
            aott aottVar = (aott) obj;
            if (this.a == aottVar.c() && this.b == aottVar.a() && this.c == aottVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        return "BuglePagingKey{timestamp=" + this.a + ", id=" + this.b + ", partId=" + this.c + "}";
    }
}
