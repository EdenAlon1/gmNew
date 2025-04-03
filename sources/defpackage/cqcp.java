package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcp {
    private final cqfu a;
    private final cqfu b;

    public cqcp(cqfu cqfuVar, cqfu cqfuVar2) {
        cqfuVar.getClass();
        cqfuVar2.getClass();
        this.a = cqfuVar;
        this.b = cqfuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqcp)) {
            return false;
        }
        cqcp cqcpVar = (cqcp) obj;
        return ffkj.e(this.a, cqcpVar.a) && ffkj.e(this.b, cqcpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncInterrupted(newActiveSync=" + this.a + ", interruptedSync=" + this.b + ")";
    }
}
