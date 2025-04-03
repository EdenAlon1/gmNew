package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyq implements dnyr {
    public final List a;
    public final dnlz b;

    public dnyq(List list, dnlz dnlzVar) {
        this.a = list;
        this.b = dnlzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnyq)) {
            return false;
        }
        dnyq dnyqVar = (dnyq) obj;
        return ffkj.e(this.a, dnyqVar.a) && ffkj.e(this.b, dnyqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GaiaSellPageSellItemUiData(suggestionList=" + this.a + ", body=" + this.b + ")";
    }
}
