package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deoa {
    public final dotb a;
    public final fgdj b;
    public final fgdj c;
    public final fgdj d;
    public final fgdj e;
    public final fgdj f;
    public final ffxx g;
    public final denz h;

    public deoa(dotb dotbVar, fgdj fgdjVar, fgdj fgdjVar2, fgdj fgdjVar3, fgdj fgdjVar4, fgdj fgdjVar5, ffxx ffxxVar, denz denzVar) {
        ffxxVar.getClass();
        this.a = dotbVar;
        this.b = fgdjVar;
        this.c = fgdjVar2;
        this.d = fgdjVar3;
        this.e = fgdjVar4;
        this.f = fgdjVar5;
        this.g = ffxxVar;
        this.h = denzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deoa)) {
            return false;
        }
        deoa deoaVar = (deoa) obj;
        return ffkj.e(this.a, deoaVar.a) && ffkj.e(this.b, deoaVar.b) && ffkj.e(this.c, deoaVar.c) && ffkj.e(this.d, deoaVar.d) && ffkj.e(this.e, deoaVar.e) && ffkj.e(this.f, deoaVar.f) && ffkj.e(this.g, deoaVar.g) && ffkj.e(this.h, deoaVar.h);
    }

    public final int hashCode() {
        dotb dotbVar = this.a;
        return ((((((((((((((dotbVar == null ? 0 : dotbVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "WelcomeScreenUiData(topAppBarUiData=" + this.a + ", accountSelectionState=" + this.b + ", welcomeAccountScreenUiData=" + this.c + ", featureUpsellUiDataFlow=" + this.d + ", onClickContinue=" + this.e + ", noticeUiData=" + this.f + ", finished=" + this.g + ", flags=" + this.h + ")";
    }
}
