package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenk {
    public final long a;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    private final int g;
    private final int h;

    public cenk(long j, int i, int i2) {
        this.a = j;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cenk)) {
            return false;
        }
        cenk cenkVar = (cenk) obj;
        return this.a == cenkVar.a && this.g == cenkVar.g && this.h == cenkVar.h;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        long j = this.f;
        long j2 = this.a;
        long j3 = j - j2;
        long j4 = this.b;
        long j5 = j4 - j2;
        long j6 = this.c;
        long j7 = j6 - j4;
        long j8 = this.d;
        long j9 = j8 - j6;
        long j10 = this.e;
        return ffpc.c("\n        #.. Sub Batch (Type: " + cenj.a(this.g) + ". Size: " + this.h + ".) - " + j3 + " (ms)\n        #... Initial logging and DB reads/writes - " + j5 + " (ms)\n        #... Object data retrieval and state update - " + j7 + " (ms)\n        #... Object data encryption - " + j9 + " (ms)\n        #... Object data upload and conditional getObjectIds RPC latency + data transfer - " + (j10 - j8) + " (ms)\n        #... Object state update - " + (j - j10) + " (ms)\n        ", "#");
    }
}
