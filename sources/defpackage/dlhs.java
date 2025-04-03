package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhs extends dlaf {
    public final dlgu a;
    public final List b;
    public final List c;

    public dlhs(dlgu dlguVar, List list, List list2) {
        dlguVar.getClass();
        this.a = dlguVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlhs)) {
            return false;
        }
        dlhs dlhsVar = (dlhs) obj;
        return ffkj.e(this.a, dlhsVar.a) && ffkj.e(this.b, dlhsVar.b) && ffkj.e(this.c, dlhsVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
