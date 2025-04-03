package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnir implements dndt {
    public final dnwq a;
    public final String b;
    public final dnid c;
    public final String d;
    private final ffix e = null;

    public dnir(dnwq dnwqVar, String str, dnid dnidVar, String str2) {
        this.a = dnwqVar;
        this.b = str;
        this.c = dnidVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnir)) {
            return false;
        }
        dnir dnirVar = (dnir) obj;
        if (!ffkj.e(this.a, dnirVar.a) || !ffkj.e(this.b, dnirVar.b) || !ffkj.e(this.c, dnirVar.c) || !ffkj.e(this.d, dnirVar.d)) {
            return false;
        }
        ffix ffixVar = dnirVar.e;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        return ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return "ReactionListItemUiData(monogram=" + this.a + ", title=" + this.b + ", reaction=" + this.c + ", subtitle=" + this.d + ", onClick=null)";
    }
}
