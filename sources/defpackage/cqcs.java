package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcs {
    private final cqgj a;
    private final eqqh b;

    public cqcs(cqgj cqgjVar, eqqh eqqhVar) {
        eqqhVar.getClass();
        this.a = cqgjVar;
        this.b = eqqhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqcs)) {
            return false;
        }
        cqcs cqcsVar = (cqcs) obj;
        return ffkj.e(this.a, cqcsVar.a) && this.b == cqcsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncRequested(request=" + this.a + ", reason=" + this.b + ")";
    }
}
