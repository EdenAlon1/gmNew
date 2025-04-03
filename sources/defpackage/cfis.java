package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfis {
    public final String a;
    public final long b;
    public final int c;
    public final int d;

    public cfis(String str, long j, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfis)) {
            return false;
        }
        cfis cfisVar = (cfis) obj;
        return ffkj.e(this.a, cfisVar.a) && this.b == cfisVar.b && this.c == cfisVar.c && this.d == cfisVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "FinishedWorkerStats(queueName=" + this.a + ", startedAtTimeMillis=" + this.b + ", completedWorkItems=" + this.c + ", result=" + ((Object) cfiu.a(this.d)) + ")";
    }
}
