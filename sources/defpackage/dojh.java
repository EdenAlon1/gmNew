package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojh {
    public final List a;
    public final dlti b;

    public dojh(List list, dlti dltiVar) {
        list.getClass();
        this.a = list;
        this.b = dltiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dojh)) {
            return false;
        }
        dojh dojhVar = (dojh) obj;
        return ffkj.e(this.a, dojhVar.a) && ffkj.e(this.b, dojhVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dlti dltiVar = this.b;
        return hashCode + (dltiVar == null ? 0 : dltiVar.hashCode());
    }

    public final String toString() {
        return "SuggestionListUiData(suggestionList=" + this.a + ", initialCompositionElement=" + this.b + ")";
    }

    public /* synthetic */ dojh(List list) {
        this(list, null);
    }
}
