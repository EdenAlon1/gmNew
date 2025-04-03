package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwec {
    public final String a;
    public final List b;
    public final ffix c;
    public final String d;
    public final cvxm e;
    public final cweb f;

    public cwec() {
        this((String) null, (List) null, (ffix) null, (String) null, (cweb) null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwec)) {
            return false;
        }
        cwec cwecVar = (cwec) obj;
        return ffkj.e(this.a, cwecVar.a) && ffkj.e(this.b, cwecVar.b) && ffkj.e(this.c, cwecVar.c) && ffkj.e(this.d, cwecVar.d) && ffkj.e(this.e, cwecVar.e) && ffkj.e(this.f, cwecVar.f);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        cvxm cvxmVar = this.e;
        return ((hashCode2 + (cvxmVar != null ? cvxmVar.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "ContactSuggestionListUiData(id=" + this.a + ", suggestionList=" + this.b + ", onSuggestionListInteractive=" + this.c + ", a11ySuggestionsTitle=" + this.d + ", emergencyRowUiData=" + this.e + ", flags=" + this.f + ")";
    }

    public cwec(String str, List list, ffix ffixVar, String str2, cvxm cvxmVar, cweb cwebVar) {
        str.getClass();
        list.getClass();
        ffixVar.getClass();
        cwebVar.getClass();
        this.a = str;
        this.b = list;
        this.c = ffixVar;
        this.d = str2;
        this.e = cvxmVar;
        this.f = cwebVar;
    }

    public /* synthetic */ cwec(String str, List list, ffix ffixVar, String str2, cweb cwebVar, int i) {
        this(1 == (i & 1) ? "" : str, (i & 2) != 0 ? ffel.a : list, (i & 4) != 0 ? new ffix() { // from class: cwdz
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar, (i & 8) != 0 ? null : str2, (cvxm) null, (i & 32) != 0 ? new cweb(null) : cwebVar);
    }
}
