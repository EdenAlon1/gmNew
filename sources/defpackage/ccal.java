package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccal {
    public final int a;
    public final Map b;

    public ccal(int i, Map map) {
        map.getClass();
        this.a = i;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccal)) {
            return false;
        }
        ccal ccalVar = (ccal) obj;
        return this.a == ccalVar.a && ffkj.e(this.b, ccalVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BatchBackupFailureResult(tableType=" + this.a + ", results=" + this.b + ")";
    }
}
