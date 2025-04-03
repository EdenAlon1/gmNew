package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqjk {
    public final Collection a;
    public final Collection b;
    public final eqqh c;
    public final int d;

    public cqjk(Collection collection, int i, Collection collection2, eqqh eqqhVar) {
        this.a = collection;
        this.d = i;
        this.b = collection2;
        this.c = eqqhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqjk)) {
            return false;
        }
        cqjk cqjkVar = (cqjk) obj;
        return ffkj.e(this.a, cqjkVar.a) && this.d == cqjkVar.d && ffkj.e(this.b, cqjkVar.b) && this.c == cqjkVar.c;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.d) * 31) + this.b.hashCode();
        eqqh eqqhVar = this.c;
        return (hashCode * 31) + (eqqhVar == null ? 0 : eqqhVar.hashCode());
    }

    public final String toString() {
        return "NewRequestMergeResult(updatedQueue=" + this.a + ", mergeCase=" + ((Object) Integer.toString(this.d - 1)) + ", mergeDetails=" + this.b + ", newFullSyncReason=" + this.c + ")";
    }

    public /* synthetic */ cqjk(Collection collection, int i, Collection collection2) {
        this(collection, i, collection2, null);
    }
}
