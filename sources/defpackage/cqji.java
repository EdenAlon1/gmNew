package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqji {
    public final cqgj a;
    public final eyee b;
    public final cqgj c;

    public cqji(cqgj cqgjVar, eyee eyeeVar, cqgj cqgjVar2) {
        cqgjVar.getClass();
        this.a = cqgjVar;
        this.b = eyeeVar;
        this.c = cqgjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqji)) {
            return false;
        }
        cqji cqjiVar = (cqji) obj;
        return ffkj.e(this.a, cqjiVar.a) && ffkj.e(this.b, cqjiVar.b) && ffkj.e(this.c, cqjiVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cqgj cqgjVar = this.c;
        return (hashCode * 31) + (cqgjVar == null ? 0 : cqgjVar.hashCode());
    }

    public final String toString() {
        return "MergeDetails(originalRequest=" + this.a + ", mergedRequestSyncId=" + this.b + ", updatedRequest=" + this.c + ")";
    }

    public /* synthetic */ cqji(cqgj cqgjVar, eyee eyeeVar) {
        this(cqgjVar, eyeeVar, null);
    }
}
