package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwf extends bvx {
    public final int a;
    public final long b;

    public bwf(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.bvx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bvx
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvx) {
            bvx bvxVar = (bvx) obj;
            if (this.a == bvxVar.a() && this.b == bvxVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PacketInfo{sizeInBytes=" + this.a + ", timestampNs=" + this.b + "}";
    }
}
