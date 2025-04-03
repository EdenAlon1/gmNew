package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnhh implements dndt, dlut {
    public final String a;
    public final dmzz b;
    public final Integer c;
    public final List d;
    public final boolean e;

    public dnhh(String str, dmzz dmzzVar, Integer num, List list, boolean z) {
        list.getClass();
        this.a = str;
        this.b = dmzzVar;
        this.c = num;
        this.d = list;
        this.e = z;
    }

    @Override // defpackage.dlut
    public final /* bridge */ /* synthetic */ String a() {
        return null;
    }

    @Override // defpackage.dlut
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnhh)) {
            return false;
        }
        dnhh dnhhVar = (dnhh) obj;
        return ffkj.e(this.a, dnhhVar.a) && this.b == dnhhVar.b && ffkj.e(this.c, dnhhVar.c) && ffkj.e(this.d, dnhhVar.d) && this.e == dnhhVar.e;
    }

    @Override // defpackage.dlut
    public final List f() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmzz dmzzVar = this.b;
        int hashCode2 = (hashCode + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31;
        Integer num = this.c;
        return ((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "InfoListItemUiData(text=" + this.a + ", icon=" + this.b + ", iconTint=" + this.c + ", annotations=" + this.d + ", isError=" + this.e + ")";
    }

    public /* synthetic */ dnhh(String str, dmzz dmzzVar, List list, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : dmzzVar, (Integer) null, (i & 8) != 0 ? ffel.a : list, ((i & 16) == 0) & z);
    }
}
