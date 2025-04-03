package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljx extends dlaf {
    public final dlgu a;
    public final String b;
    public final List c;
    public final List d;

    public dljx(dlgu dlguVar, String str, List list, List list2) {
        this.a = dlguVar;
        this.b = str;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dljx)) {
            return false;
        }
        dljx dljxVar = (dljx) obj;
        return ffkj.e(this.a, dljxVar.a) && ffkj.e(this.b, dljxVar.b) && ffkj.e(this.c, dljxVar.c) && ffkj.e(this.d, dljxVar.d);
    }

    public final int hashCode() {
        dlgu dlguVar = this.a;
        int hashCode = dlguVar == null ? 0 : dlguVar.hashCode();
        String str = this.b;
        return (((((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
