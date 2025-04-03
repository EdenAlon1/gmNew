package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aotn {
    public final int a;
    public final engw b;

    public aotn(int i, engw engwVar) {
        engwVar.getClass();
        this.a = i;
        this.b = engwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aotn)) {
            return false;
        }
        aotn aotnVar = (aotn) obj;
        return this.a == aotnVar.a && ffkj.e(this.b, aotnVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BugleMessageSearchSummary(totalCount=" + this.a + ", summary=" + this.b + ")";
    }
}
