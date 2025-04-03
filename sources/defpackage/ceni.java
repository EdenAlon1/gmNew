package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceni {
    public final long a;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    private final int e;

    public ceni(long j, int i) {
        this.a = j;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceni)) {
            return false;
        }
        ceni ceniVar = (ceni) obj;
        return this.a == ceniVar.a && this.e == ceniVar.e;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.e;
    }

    public final String toString() {
        long j = this.d;
        if (j == -1) {
            return ".. No scheduling attempted.";
        }
        long j2 = this.a;
        long j3 = this.b;
        String valueOf = j3 != -1 ? Long.valueOf(j3 - j2) : "n/a";
        long j4 = this.c;
        long j5 = j4 - this.b;
        Object valueOf2 = j4 != -1 ? Long.valueOf(this.d - j4) : "n/a";
        return ffpc.c("\n        #.. Scheduling Attempt # " + this.e + " - " + (j - j2) + " (ms)\n        #... Pre query - " + valueOf + " (ms)\n        #... Message query for scheduling - " + j5 + " (ms)\n        #... Post query - " + valueOf2 + " (ms)\n        ", "#");
    }
}
