package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmha {
    public final int a;
    public final ibw b;
    public final String c;
    public final dmzz d;
    public final ibw e;
    public final ibw f;
    public final ibw g;
    public final ffix h;

    public dmha(int i, ibw ibwVar, String str, dmzz dmzzVar, ibw ibwVar2, ibw ibwVar3, ibw ibwVar4, ffix ffixVar) {
        dmzzVar.getClass();
        this.a = i;
        this.b = ibwVar;
        this.c = str;
        this.d = dmzzVar;
        this.e = ibwVar2;
        this.f = ibwVar3;
        this.g = ibwVar4;
        this.h = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmha)) {
            return false;
        }
        dmha dmhaVar = (dmha) obj;
        return this.a == dmhaVar.a && ffkj.e(this.b, dmhaVar.b) && ffkj.e(this.c, dmhaVar.c) && this.d == dmhaVar.d && ffkj.e(this.e, dmhaVar.e) && ffkj.e(this.f, dmhaVar.f) && ffkj.e(this.g, dmhaVar.g) && ffkj.e(this.h, dmhaVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + ffco.a(this.b.i)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + ffco.a(this.e.i)) * 31) + ffco.a(this.f.i)) * 31) + ffco.a(this.g.i)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "CountBadgedIconButtonUiData(count=" + this.a + ", badgeTextColor=" + this.b + ", contentDescription=" + this.c + ", icon=" + this.d + ", iconTint=" + this.e + ", buttonColor=" + this.f + ", badgeColor=" + this.g + ", onClick=" + this.h + ")";
    }
}
