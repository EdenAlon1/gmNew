package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czbe {
    public final czdj a;
    public final cysm b;
    public final czcw c;
    public final cyqe d;
    public final cyor e;
    public final cyph f;
    public final cypq g;
    public final ffxx h;
    public final cyyj i;
    public final cyxb j;
    public final czbd k;

    public czbe(czdj czdjVar, cysm cysmVar, czcw czcwVar, cyqe cyqeVar, cyor cyorVar, cyph cyphVar, cypq cypqVar, ffxx ffxxVar, cyyj cyyjVar, cyxb cyxbVar, czbd czbdVar) {
        czdjVar.getClass();
        cysmVar.getClass();
        cyorVar.getClass();
        cypqVar.getClass();
        this.a = czdjVar;
        this.b = cysmVar;
        this.c = czcwVar;
        this.d = cyqeVar;
        this.e = cyorVar;
        this.f = cyphVar;
        this.g = cypqVar;
        this.h = ffxxVar;
        this.i = cyyjVar;
        this.j = cyxbVar;
        this.k = czbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czbe)) {
            return false;
        }
        czbe czbeVar = (czbe) obj;
        return ffkj.e(this.a, czbeVar.a) && ffkj.e(this.b, czbeVar.b) && ffkj.e(this.c, czbeVar.c) && ffkj.e(this.d, czbeVar.d) && ffkj.e(this.e, czbeVar.e) && ffkj.e(this.f, czbeVar.f) && ffkj.e(this.g, czbeVar.g) && ffkj.e(this.h, czbeVar.h) && ffkj.e(this.i, czbeVar.i) && ffkj.e(this.j, czbeVar.j) && ffkj.e(this.k, czbeVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        czcw czcwVar = this.c;
        int hashCode2 = ((hashCode * 31) + (czcwVar == null ? 0 : czcwVar.hashCode())) * 31;
        cyqe cyqeVar = this.d;
        int hashCode3 = (((hashCode2 + (cyqeVar == null ? 0 : cyqeVar.hashCode())) * 31) + this.e.hashCode()) * 31;
        cyph cyphVar = this.f;
        int hashCode4 = (((((hashCode3 + (cyphVar == null ? 0 : cyphVar.hashCode())) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
        cyyj cyyjVar = this.i;
        int hashCode5 = (hashCode4 + (cyyjVar == null ? 0 : cyyjVar.hashCode())) * 31;
        cyxb cyxbVar = this.j;
        return ((hashCode5 + (cyxbVar != null ? cyxbVar.hashCode() : 0)) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "ConversationDetailsUiData(topbar=" + this.a + ", header=" + this.b + ", search=" + this.c + ", encryption=" + this.d + ", actions=" + this.e + ", activeSimUiData=" + this.f + ", descriptionItems=" + this.g + ", groupMembers=" + this.h + ", photoSelector=" + this.i + ", miniConversationDetailsUiData=" + this.j + ", flags=" + this.k + ")";
    }
}
