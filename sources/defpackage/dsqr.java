package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqr {
    public final List a;
    public final hho b;

    public dsqr(List list, hho hhoVar) {
        list.getClass();
        this.a = list;
        this.b = hhoVar;
    }

    public final hho a(dsqs dsqsVar) {
        Object obj;
        dsqsVar.getClass();
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dsqq) obj).d() == dsqsVar) {
                break;
            }
        }
        dsqq dsqqVar = (dsqq) obj;
        return dsqqVar != null ? dsqqVar.c() : new hic(null, hla.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsqr)) {
            return false;
        }
        dsqr dsqrVar = (dsqr) obj;
        return ffkj.e(this.a, dsqrVar.a) && ffkj.e(this.b, dsqrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProjectorLayersState(layers=" + this.a + ", focusMode=" + this.b + ")";
    }
}
