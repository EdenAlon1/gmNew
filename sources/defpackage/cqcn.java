package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcn {
    private final cqgj a;

    public cqcn(cqgj cqgjVar) {
        cqgjVar.getClass();
        this.a = cqgjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqcn) && ffkj.e(this.a, ((cqcn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncAddedToQueue(request=" + this.a + ")";
    }
}
