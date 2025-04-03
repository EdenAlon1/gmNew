package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecyn extends edbs {
    public final ecxu a;
    public final edbt b;

    public ecyn(ecxu ecxuVar, edbt edbtVar) {
        this.a = ecxuVar;
        this.b = edbtVar;
    }

    @Override // defpackage.edbs
    public final ecxu a() {
        return this.a;
    }

    @Override // defpackage.edbs
    public final edbt b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edbs) {
            edbs edbsVar = (edbs) obj;
            ecxu ecxuVar = this.a;
            if (ecxuVar != null ? ecxuVar.equals(edbsVar.a()) : edbsVar.a() == null) {
                if (this.b.equals(edbsVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ecxu ecxuVar = this.a;
        return (((ecxuVar == null ? 0 : ecxuVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        edbt edbtVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + edbtVar.toString() + "}";
    }
}
