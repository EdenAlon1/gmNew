package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmm {
    public final fgdj a;
    public final fgdj b;
    public final fgdj c;
    public final fgdj d;
    public final fgdj e;
    public final ffji f;
    private final abml g;

    public abmm(fgdj fgdjVar, fgdj fgdjVar2, fgdj fgdjVar3, fgdj fgdjVar4, fgdj fgdjVar5, ffji ffjiVar, abml abmlVar) {
        fgdjVar2.getClass();
        fgdjVar3.getClass();
        fgdjVar4.getClass();
        fgdjVar5.getClass();
        this.a = fgdjVar;
        this.b = fgdjVar2;
        this.c = fgdjVar3;
        this.d = fgdjVar4;
        this.e = fgdjVar5;
        this.f = ffjiVar;
        this.g = abmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abmm)) {
            return false;
        }
        abmm abmmVar = (abmm) obj;
        return ffkj.e(this.a, abmmVar.a) && ffkj.e(this.b, abmmVar.b) && ffkj.e(this.c, abmmVar.c) && ffkj.e(this.d, abmmVar.d) && ffkj.e(this.e, abmmVar.e) && ffkj.e(this.f, abmmVar.f) && ffkj.e(this.g, abmmVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "TopContentUiData(rbmAppBarUiData=" + this.a + ", topAppBarUiData=" + this.b + ", textResultsBarUiData=" + this.c + ", bannersUiData=" + this.d + ", overrideSystemBack=" + this.e + ", onHeightComputed=" + this.f + ", flags=" + this.g + ")";
    }
}
