package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdhi {
    public final ccki a;
    public final List b;

    public cdhi(ccki cckiVar, List list) {
        this.a = cckiVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdhi)) {
            return false;
        }
        cdhi cdhiVar = (cdhi) obj;
        return ffkj.e(this.a, cdhiVar.a) && ffkj.e(this.b, cdhiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RegularItemResult(cmsItemBackupResult=" + this.a + ", newWorkItems=" + this.b + ")";
    }
}
