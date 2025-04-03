package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cevo {
    public final Map a;
    public final Map b;

    public cevo(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cevo)) {
            return false;
        }
        cevo cevoVar = (cevo) obj;
        return ffkj.e(this.a, cevoVar.a) && ffkj.e(this.b, cevoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DuplicationResult(potentialDuplicatesInDb=" + this.a + ", duplicatesInBatch=" + this.b + ")";
    }
}
