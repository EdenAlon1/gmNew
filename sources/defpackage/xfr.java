package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfr implements xfs, xfo {
    public final xhl a;
    private final xgv b;

    public xfr(xhl xhlVar, xgv xgvVar) {
        xhlVar.getClass();
        this.a = xhlVar;
        this.b = xgvVar;
    }

    @Override // defpackage.xfo
    public final xgv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfr)) {
            return false;
        }
        xfr xfrVar = (xfr) obj;
        return ffkj.e(this.a, xfrVar.a) && ffkj.e(this.b, xfrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftedAttachment.Unresolved(unresolvedAttachment=" + this.a + ", compressionInfo=" + this.b + ")";
    }
}
