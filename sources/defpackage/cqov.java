package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqov extends cqpu {
    public final long a;
    public final long b;

    public cqov(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.cqpu
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cqpu
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqpu) {
            cqpu cqpuVar = (cqpu) obj;
            if (this.a == cqpuVar.a() && this.b == cqpuVar.b()) {
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
        return "FileTransferProgress{bytesTransferred=" + this.a + ", totalBytesInFile=" + this.b + "}";
    }
}
