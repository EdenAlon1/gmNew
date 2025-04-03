package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsqu {
    public final dspo a;
    public final ffud b;

    public dsqu(dspo dspoVar, ffud ffudVar) {
        this.a = dspoVar;
        this.b = ffudVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsqu)) {
            return false;
        }
        dsqu dsquVar = (dsqu) obj;
        return ffkj.e(this.a, dsquVar.a) && ffkj.e(this.b, dsquVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActiveProjection(projection=" + this.a + ", job=" + this.b + ")";
    }
}
