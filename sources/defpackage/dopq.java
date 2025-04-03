package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dopq {
    public final hkx a;
    public final jpo b;
    public final jpo c;
    public final jpo d;
    public final jpo e;
    public final jpo f;
    public final jpo g;
    public final gvs h;

    public dopq(hkx hkxVar, jpo jpoVar, jpo jpoVar2, jpo jpoVar3, jpo jpoVar4, jpo jpoVar5, jpo jpoVar6, gvs gvsVar) {
        this.a = hkxVar;
        this.b = jpoVar;
        this.c = jpoVar2;
        this.d = jpoVar3;
        this.e = jpoVar4;
        this.f = jpoVar5;
        this.g = jpoVar6;
        this.h = gvsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dopq)) {
            return false;
        }
        dopq dopqVar = (dopq) obj;
        return ffkj.e(this.a, dopqVar.a) && ffkj.e(this.b, dopqVar.b) && ffkj.e(this.c, dopqVar.c) && ffkj.e(this.d, dopqVar.d) && ffkj.e(this.e, dopqVar.e) && ffkj.e(this.f, dopqVar.f) && ffkj.e(this.g, dopqVar.g) && ffkj.e(this.h, dopqVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "AbcTypography(scalableFontFactor=" + this.a + ", bodyBold=" + this.b + ", bodyExtraLarge=" + this.c + ", bodyMediumItalic=" + this.d + ", labelExtraSmall=" + this.e + ", titleMediumLarge=" + this.f + ", titleSmallCondensed=" + this.g + ", baseTypography=" + this.h + ")";
    }
}
