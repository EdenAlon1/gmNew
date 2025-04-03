package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqkk {
    public final cqgj a;
    public final Collection b;
    public final cqgj c;

    public cqkk(cqgj cqgjVar, Collection collection, cqgj cqgjVar2) {
        cqgjVar.getClass();
        collection.getClass();
        this.a = cqgjVar;
        this.b = collection;
        this.c = cqgjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqkk)) {
            return false;
        }
        cqkk cqkkVar = (cqkk) obj;
        return ffkj.e(this.a, cqkkVar.a) && ffkj.e(this.b, cqkkVar.b) && ffkj.e(this.c, cqkkVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cqgj cqgjVar = this.c;
        return (hashCode * 31) + (cqgjVar == null ? 0 : cqgjVar.hashCode());
    }

    public final String toString() {
        return "PartialSyncAndSpotSyncs(updatedPartialSync=" + this.a + ", mergedSpotSyncs=" + this.b + ", updatedSpotSync=" + this.c + ")";
    }
}
