package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcu {
    public final cqfu a;

    public cqcu(cqfu cqfuVar) {
        cqfuVar.getClass();
        this.a = cqfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqcu) && ffkj.e(this.a, ((cqcu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncStarted(sync=" + this.a + ")";
    }
}
