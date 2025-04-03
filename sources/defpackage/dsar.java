package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsar {
    public final int a;
    public final dsaq b;
    public final List c;
    public final ffji d;
    private final dsaq e;

    public /* synthetic */ dsar(int i, dsaq dsaqVar, List list, ffji ffjiVar, int i2) {
        list = (i2 & 8) != 0 ? ffel.a : list;
        dsaqVar.getClass();
        list.getClass();
        this.a = i;
        this.b = dsaqVar;
        this.e = null;
        this.c = list;
        this.d = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsar)) {
            return false;
        }
        dsar dsarVar = (dsar) obj;
        if (this.a != dsarVar.a || !ffkj.e(this.b, dsarVar.b)) {
            return false;
        }
        dsaq dsaqVar = dsarVar.e;
        return ffkj.e(null, null) && ffkj.e(this.c, dsarVar.c) && ffkj.e(this.d, dsarVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 961) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "HugoShortcut(title=" + this.a + ", icon=" + this.b + ", badgeIcon=null, permissions=" + this.c + ")";
    }
}
