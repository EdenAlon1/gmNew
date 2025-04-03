package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqs extends bte {
    private final long a;
    private final long b;
    private final bqf c;

    public bqs(long j, long j2, bqf bqfVar) {
        this.a = j;
        this.b = j2;
        this.c = bqfVar;
    }

    @Override // defpackage.bte
    public final long a() {
        return this.b;
    }

    @Override // defpackage.bte
    public final long b() {
        return this.a;
    }

    @Override // defpackage.bte
    public final bqf c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bte) {
            bte bteVar = (bte) obj;
            if (this.a == bteVar.b() && this.b == bteVar.a() && this.c.equals(bteVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
