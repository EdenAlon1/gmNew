package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abks implements doau {
    public final dmzz a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final List f;
    public final List g;
    public final ffix h;
    public final ffix i;
    public final abkr j;

    public abks(dmzz dmzzVar, String str, String str2, List list, String str3, List list2, List list3, ffix ffixVar, ffix ffixVar2, abkr abkrVar) {
        dmzzVar.getClass();
        list3.getClass();
        this.a = dmzzVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = list2;
        this.g = list3;
        this.h = ffixVar;
        this.i = ffixVar2;
        this.j = abkrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abks)) {
            return false;
        }
        abks abksVar = (abks) obj;
        return this.a == abksVar.a && ffkj.e(this.b, abksVar.b) && ffkj.e(this.c, abksVar.c) && ffkj.e(this.d, abksVar.d) && ffkj.e(this.e, abksVar.e) && ffkj.e(this.f, abksVar.f) && ffkj.e(this.g, abksVar.g) && ffkj.e(this.h, abksVar.h) && ffkj.e(this.i, abksVar.i) && ffkj.e(this.j, abksVar.j);
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        abkr abkrVar = this.j;
        return (hashCode * 31) + (abkrVar == null ? 0 : abkrVar.hashCode());
    }

    public final String toString() {
        return "SpeedBumpScreenUiData(headerIcon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", subtitleAnnotations=" + this.d + ", intro=" + this.e + ", infoItems=" + this.f + ", helpItems=" + this.g + ", onBack=" + this.h + ", onContinue=" + this.i + ", bottomSheetUiData=" + this.j + ")";
    }
}
