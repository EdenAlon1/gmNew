package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojy {
    public final List a;
    public final int b;
    public final ffji c;

    public dojy(List list, int i, ffji ffjiVar) {
        ffjiVar.getClass();
        this.a = list;
        this.b = i;
        this.c = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dojy)) {
            return false;
        }
        dojy dojyVar = (dojy) obj;
        return ffkj.e(this.a, dojyVar.a) && this.b == dojyVar.b && ffkj.e(this.c, dojyVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SuggestionTabListUiData(suggestionTabList=" + this.a + ", initialTabIndex=" + this.b + ", onInitialComposition=" + this.c + ")";
    }
}
