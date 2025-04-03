package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfq implements xfs, xfn {
    private final doxs a;
    private final xgv b;

    public xfq(doxs doxsVar, xgv xgvVar) {
        doxsVar.getClass();
        this.a = doxsVar;
        this.b = xgvVar;
    }

    @Override // defpackage.xfn
    public final doxs a() {
        return this.a;
    }

    @Override // defpackage.xfo
    public final xgv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfq)) {
            return false;
        }
        xfq xfqVar = (xfq) obj;
        return ffkj.e(this.a, xfqVar.a) && ffkj.e(this.b, xfqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xgv xgvVar = this.b;
        return hashCode + (xgvVar == null ? 0 : xgvVar.hashCode());
    }

    public final String toString() {
        return "DraftedAttachment.Resolved(hugoAttachment=" + this.a + ", compressionInfo=" + this.b + ")";
    }
}
