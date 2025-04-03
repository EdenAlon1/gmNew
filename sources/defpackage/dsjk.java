package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjk {
    public final List a;
    public final ffji b;
    private final ffbz c = ffca.a(new ffix() { // from class: dsjj
        @Override // defpackage.ffix
        public final Object invoke() {
            List list = dsjk.this.a;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((drlx) it.next()).a());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    });

    public dsjk(List list, ffji ffjiVar) {
        this.a = list;
        this.b = ffjiVar;
    }

    public final String[] a() {
        return (String[]) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsjk)) {
            return false;
        }
        dsjk dsjkVar = (dsjk) obj;
        return ffkj.e(this.a, dsjkVar.a) && ffkj.e(this.b, dsjkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ContentInsertionListener(mediaTypes=" + this.a + ", onContentInserted=" + this.b + ")";
    }
}
