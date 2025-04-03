package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cevq {
    public final Map a;
    public final Map b;
    public final Optional c;

    public cevq(Map map, Map map2, Optional optional) {
        this.a = map;
        this.b = map2;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cevq)) {
            return false;
        }
        cevq cevqVar = (cevq) obj;
        return ffkj.e(this.a, cevqVar.a) && ffkj.e(this.b, cevqVar.b) && ffkj.e(this.c, cevqVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SchedulingTransactionResult(duplicateRows=" + this.a + ", newRows=" + this.b + ", maybeSchedulingDeferred=" + this.c + ")";
    }
}
