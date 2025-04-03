package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxxx extends cxyf {
    private final cxym a;
    private final cxyi b;

    public cxxx(cxym cxymVar, cxyi cxyiVar) {
        this.a = cxymVar;
        this.b = cxyiVar;
    }

    @Override // defpackage.cxyf
    public final cxyi a() {
        return this.b;
    }

    @Override // defpackage.cxyf
    public final cxym b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxyf) {
            cxyf cxyfVar = (cxyf) obj;
            if (this.a.equals(cxyfVar.b()) && this.b.equals(cxyfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cxyi cxyiVar = this.b;
        return "CreationParams{bannerFactory=" + this.a.toString() + ", priority=" + cxyiVar.toString() + "}";
    }
}
