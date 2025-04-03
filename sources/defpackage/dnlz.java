package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnlz implements dndt {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final Integer e;
    public final dnlg f;
    public final dnlg g;
    public final ffix h;

    public /* synthetic */ dnlz(String str, String str2, String str3, List list, Integer num, dnlg dnlgVar, dnlg dnlgVar2, ffix ffixVar, int i) {
        list = (i & 8) != 0 ? ffel.a : list;
        int i2 = i & 2;
        str3 = (i & 4) != 0 ? null : str3;
        str2 = i2 != 0 ? null : str2;
        num = (i & 16) != 0 ? null : num;
        dnlgVar = (i & 32) != 0 ? null : dnlgVar;
        dnlgVar2 = (i & 64) != 0 ? null : dnlgVar2;
        ffixVar = (i & 128) != 0 ? null : ffixVar;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = num;
        this.f = dnlgVar;
        this.g = dnlgVar2;
        this.h = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnlz)) {
            return false;
        }
        dnlz dnlzVar = (dnlz) obj;
        return ffkj.e(this.a, dnlzVar.a) && ffkj.e(this.b, dnlzVar.b) && ffkj.e(this.c, dnlzVar.c) && ffkj.e(this.d, dnlzVar.d) && ffkj.e(this.e, dnlzVar.e) && ffkj.e(this.f, dnlzVar.f) && ffkj.e(this.g, dnlzVar.g) && ffkj.e(this.h, dnlzVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d.hashCode()) * 31;
        Integer num = this.e;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        dnlg dnlgVar = this.f;
        int hashCode5 = (hashCode4 + (dnlgVar == null ? 0 : dnlgVar.hashCode())) * 31;
        dnlg dnlgVar2 = this.g;
        int hashCode6 = (hashCode5 + (dnlgVar2 == null ? 0 : dnlgVar2.hashCode())) * 31;
        ffix ffixVar = this.h;
        return hashCode6 + (ffixVar != null ? ffixVar.hashCode() : 0);
    }

    public final String toString() {
        return "TextListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", overline=" + this.c + ", annotations=" + this.d + ", count=" + this.e + ", startDecoration=" + this.f + ", endDecoration=" + this.g + ", onClick=" + this.h + ")";
    }
}
