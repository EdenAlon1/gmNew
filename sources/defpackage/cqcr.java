package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcr {
    private final cqfu a;
    private final cqcm b;

    public cqcr(cqfu cqfuVar, cqcm cqcmVar) {
        cqfuVar.getClass();
        this.a = cqfuVar;
        this.b = cqcmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqcr)) {
            return false;
        }
        cqcr cqcrVar = (cqcr) obj;
        return ffkj.e(this.a, cqcrVar.a) && ffkj.e(this.b, cqcrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncProgress(sync=" + this.a + ", update=" + this.b + ")";
    }
}
