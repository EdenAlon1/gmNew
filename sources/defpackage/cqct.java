package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqct {
    public final cqfu a;

    public cqct(cqfu cqfuVar) {
        cqfuVar.getClass();
        this.a = cqfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqct) && ffkj.e(this.a, ((cqct) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncResumed(sync=" + this.a + ")";
    }
}
