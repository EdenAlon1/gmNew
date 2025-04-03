package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcq {
    private final cqji a;
    private final int b;

    public cqcq(cqji cqjiVar, int i) {
        cqjiVar.getClass();
        this.a = cqjiVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqcq)) {
            return false;
        }
        cqcq cqcqVar = (cqcq) obj;
        return ffkj.e(this.a, cqcqVar.a) && this.b == cqcqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncMerged(mergeDetails=");
        sb.append(this.a);
        sb.append(", mergeType=");
        sb.append((Object) (this.b != 1 ? "ACTIVE_SYNC" : "NEW_REQUEST"));
        sb.append(")");
        return sb.toString();
    }
}
