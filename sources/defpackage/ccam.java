package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccam {
    public final int a;
    public final Map b;
    public final cckh c;

    public ccam(int i, Map map, cckh cckhVar) {
        this.a = i;
        this.b = map;
        this.c = cckhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccam)) {
            return false;
        }
        ccam ccamVar = (ccam) obj;
        return this.a == ccamVar.a && ffkj.e(this.b, ccamVar.b) && ffkj.e(this.c, ccamVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a * 31) + this.b.hashCode();
        cckh cckhVar = this.c;
        return (hashCode * 31) + (cckhVar == null ? 0 : cckhVar.hashCode());
    }

    public final String toString() {
        return "BatchBackupResult(tableType=" + this.a + ", results=" + this.b + ", terminationError=" + this.c + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ccam(int i, Map map) {
        this(i, map, null);
        map.getClass();
    }
}
