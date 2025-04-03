package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngn implements dngx {
    public final dnym a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final String f;
    public final ffji g;
    public final dngq h;
    private final ffix i;

    public dngn(dnym dnymVar, String str, List list, String str2, List list2, String str3, ffji ffjiVar, dngq dngqVar) {
        list.getClass();
        this.a = dnymVar;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = list2;
        this.f = str3;
        this.i = null;
        this.g = ffjiVar;
        this.h = dngqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dngn)) {
            return false;
        }
        dngn dngnVar = (dngn) obj;
        if (!ffkj.e(this.a, dngnVar.a) || !ffkj.e(this.b, dngnVar.b) || !ffkj.e(this.c, dngnVar.c) || !ffkj.e(this.d, dngnVar.d) || !ffkj.e(this.e, dngnVar.e) || !ffkj.e(this.f, dngnVar.f)) {
            return false;
        }
        ffix ffixVar = dngnVar.i;
        return ffkj.e(null, null) && ffkj.e(this.g, dngnVar.g) && ffkj.e(this.h, dngnVar.h);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + 1) * 31;
        String str2 = this.f;
        int hashCode3 = hashCode2 + (str2 == null ? 0 : str2.hashCode());
        ffji ffjiVar = this.g;
        return (((hashCode3 * 961) + (ffjiVar != null ? ffjiVar.hashCode() : 0)) * 31) + 1237;
    }

    public final String toString() {
        return "Actionable(monogram=" + this.a + ", title=" + this.b + ", actions=" + this.c + ", subtitle=" + this.d + ", annotations=" + this.e + ", tertiaryText=" + this.f + ", onClick=null, onClickWithPosition=" + this.g + ", flags=" + this.h + ")";
    }
}
