package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apsv {
    public final int a;
    public final long b;
    public final apvf c;

    public apsv(int i, long j, apvf apvfVar) {
        this.a = i;
        this.b = j;
        this.c = apvfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apsv)) {
            return false;
        }
        apsv apsvVar = (apsv) obj;
        return this.a == apsvVar.a && this.b == apsvVar.b && ffkj.e(this.c, apsvVar.c);
    }

    public final int hashCode() {
        long j = this.b;
        return (((this.a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CachedPagingResults(limit=" + this.a + ", version=" + this.b + ", pagingResults=" + this.c + ")";
    }
}
