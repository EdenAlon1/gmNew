package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmov {
    public final List a;
    public final Integer b;
    public final ffji c;

    public dmov(List list, Integer num, ffji ffjiVar) {
        list.getClass();
        this.a = list;
        this.b = num;
        this.c = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmov)) {
            return false;
        }
        dmov dmovVar = (dmov) obj;
        return ffkj.e(this.a, dmovVar.a) && ffkj.e(this.b, dmovVar.b) && ffkj.e(this.c, dmovVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ComposeRowSimSelectorUiData(sims=" + this.a + ", selected=" + this.b + ", onSelect=" + this.c + ")";
    }
}
