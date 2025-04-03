package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgiy extends cgjm {
    public final long a;
    public final long b;

    public cgiy(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.cgjm
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cgjm
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgjm) {
            cgjm cgjmVar = (cgjm) obj;
            if (this.a == cgjmVar.a() && this.b == cgjmVar.b()) {
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
        return "EntryPointInfo{entryPointId=" + this.a + ", entryPointTrackingId=" + this.b + "}";
    }
}
