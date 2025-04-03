package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apqj extends apqn {
    private final long a;
    private final long b;
    private final boolean c;

    public apqj(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    @Override // defpackage.apqn, defpackage.apqy
    public final long a() {
        return this.a;
    }

    @Override // defpackage.apqn, defpackage.apqy
    public final long b() {
        return this.b;
    }

    @Override // defpackage.apqn, defpackage.apqy
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apqn) {
            apqn apqnVar = (apqn) obj;
            if (this.a == apqnVar.a() && this.b == apqnVar.b() && this.c == apqnVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.c ? 1237 : 1231;
        long j = this.a;
        long j2 = this.b;
        return i ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "BugleFileTransfer{bytesTransferred=" + this.a + ", totalBytesInFile=" + this.b + ", isFinished=" + this.c + "}";
    }
}
