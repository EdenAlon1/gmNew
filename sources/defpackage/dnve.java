package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnve {
    public final dofg a;
    public final dnvd b;
    public final ffix c;

    public dnve(dofg dofgVar, dnvd dnvdVar, ffix ffixVar) {
        this.a = dofgVar;
        this.b = dnvdVar;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnve)) {
            return false;
        }
        dnve dnveVar = (dnve) obj;
        return ffkj.e(this.a, dnveVar.a) && ffkj.e(this.b, dnveVar.b) && ffkj.e(this.c, dnveVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionsBarPopupUiData(content=" + this.a + ", positioning=" + this.b + ", onDismissRequest=" + this.c + ")";
    }
}
