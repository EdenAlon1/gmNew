package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqjj {
    public final Collection a;
    public final cqfu b;
    public final Set c;

    public cqjj(Collection collection, cqfu cqfuVar, Set set) {
        this.a = collection;
        this.b = cqfuVar;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqjj)) {
            return false;
        }
        cqjj cqjjVar = (cqjj) obj;
        return ffkj.e(this.a, cqjjVar.a) && ffkj.e(this.b, cqjjVar.b) && ffkj.e(this.c, cqjjVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ActiveSyncMergeResult(updatedQueue=" + this.a + ", updatedActiveSync=" + this.b + ", mergeDetails=" + this.c + ")";
    }
}
