package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpxx extends cpzh {
    private final long a;
    private final cpbd b;

    public cpxx(long j, cpbd cpbdVar) {
        this.a = j;
        this.b = cpbdVar;
    }

    @Override // defpackage.cpzh
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cpzh
    public final cpbd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpzh) {
            cpzh cpzhVar = (cpzh) obj;
            if (this.a == cpzhVar.a() && this.b.equals(cpzhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ThreadMergeData{oldThreadId=" + this.a + ", newThreadData=" + this.b.toString() + "}";
    }
}
