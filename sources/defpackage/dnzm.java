package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzm {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;
    public final dnzl i;

    public dnzm(String str, Integer num, Integer num2, String str2, String str3, String str4, List list, List list2, dnzl dnzlVar) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = list2;
        this.i = dnzlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnzm)) {
            return false;
        }
        dnzm dnzmVar = (dnzm) obj;
        return ffkj.e(this.a, dnzmVar.a) && ffkj.e(this.b, dnzmVar.b) && ffkj.e(this.c, dnzmVar.c) && ffkj.e(this.d, dnzmVar.d) && ffkj.e(this.e, dnzmVar.e) && ffkj.e(this.f, dnzmVar.f) && ffkj.e(this.g, dnzmVar.g) && ffkj.e(this.h, dnzmVar.h) && ffkj.e(this.i, dnzmVar.i);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return ((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "GaiaSellPageUiData(title=" + this.a + ", titleHighlightStart=" + this.b + ", titleHighlightEnd=" + this.c + ", accountName=" + this.d + ", accountAvatarUri=" + this.e + ", headerIconUri=" + this.f + ", items=" + this.g + ", itemsV2=" + this.h + ", flags=" + this.i + ")";
    }
}
