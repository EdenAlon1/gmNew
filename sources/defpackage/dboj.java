package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dboj {
    public final List a;
    public final List b;
    public final List c;

    public dboj(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dboj)) {
            return false;
        }
        dboj dbojVar = (dboj) obj;
        return ffkj.e(this.a, dbojVar.a) && ffkj.e(this.b, dbojVar.b) && ffkj.e(this.c, dbojVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PwqDebugUiData(running=" + this.a + ", scheduled=" + this.b + ", finished=" + this.c + ")";
    }
}
