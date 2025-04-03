package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmfj implements dmfk {
    public final List a;
    public final dnlz b;

    public dmfj(List list, dnlz dnlzVar) {
        this.a = list;
        this.b = dnlzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmfj)) {
            return false;
        }
        dmfj dmfjVar = (dmfj) obj;
        return ffkj.e(this.a, dmfjVar.a) && ffkj.e(this.b, dmfjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GaiaOptInSellItemUiData(suggestionList=" + this.a + ", body=" + this.b + ")";
    }
}
