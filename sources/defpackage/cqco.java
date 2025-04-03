package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqco {
    public final cqfu a;
    private final cqfe b;

    public cqco(cqfu cqfuVar, cqfe cqfeVar) {
        cqfuVar.getClass();
        cqfeVar.getClass();
        this.a = cqfuVar;
        this.b = cqfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqco)) {
            return false;
        }
        cqco cqcoVar = (cqco) obj;
        return ffkj.e(this.a, cqcoVar.a) && this.b == cqcoVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncCompleted(sync=" + this.a + ", status=" + this.b + ")";
    }
}
