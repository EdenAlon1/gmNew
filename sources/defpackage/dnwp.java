package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwp implements dnwq {
    public final ffjm a;
    private final Boolean b;
    private final dnwk c;

    public /* synthetic */ dnwp(ffjm ffjmVar, dnwk dnwkVar, int i) {
        dnwkVar = (i & 4) != 0 ? dnwk.a : dnwkVar;
        dnwkVar.getClass();
        this.b = null;
        this.a = ffjmVar;
        this.c = dnwkVar;
    }

    @Override // defpackage.dnwq
    public final dnwk a() {
        return this.c;
    }

    @Override // defpackage.dnwq
    public final Boolean b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnwp)) {
            return false;
        }
        dnwp dnwpVar = (dnwp) obj;
        Boolean bool = dnwpVar.b;
        return ffkj.e(null, null) && ffkj.e(this.a, dnwpVar.a) && this.c == dnwpVar.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Unassigned(forceClipToCircle=null, backgroundColor=" + this.a + ", monogramBadge=" + this.c + ")";
    }
}
