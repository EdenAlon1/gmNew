package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzk {
    public final List a;
    public final int b;
    private final int c;

    public dnzk(List list, int i, int i2) {
        this.a = list;
        this.c = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnzk)) {
            return false;
        }
        dnzk dnzkVar = (dnzk) obj;
        return ffkj.e(this.a, dnzkVar.a) && this.c == dnzkVar.c && this.b == dnzkVar.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b;
    }

    public final String toString() {
        return "GaiaSellPageSellSuggestionItem(suggestionList=" + this.a + ", firstVisibleItemIndex=" + this.c + ", firstVisibleItemOffset=" + this.b + ")";
    }
}
