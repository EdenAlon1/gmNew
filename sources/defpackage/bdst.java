package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdst {
    private final ctvf a;
    private final ctvf b;
    private final ctvf c;
    private final ctvf d;
    private final List e;
    private final List f;

    public bdst(ctvf ctvfVar, ctvf ctvfVar2, ctvf ctvfVar3, ctvf ctvfVar4, List list, List list2) {
        this.a = ctvfVar;
        this.b = ctvfVar2;
        this.c = ctvfVar3;
        this.d = ctvfVar4;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdst)) {
            return false;
        }
        bdst bdstVar = (bdst) obj;
        return ffkj.e(this.a, bdstVar.a) && ffkj.e(this.b, bdstVar.b) && ffkj.e(this.c, bdstVar.c) && ffkj.e(this.d, bdstVar.d) && ffkj.e(this.e, bdstVar.e) && ffkj.e(this.f, bdstVar.f);
    }

    public final int hashCode() {
        int i = this.a.a;
        List list = this.e;
        ctvf ctvfVar = this.d;
        return (((((((((i * 31) + this.b.a) * 31) + this.c.a) * 31) + ctvfVar.a) * 31) + list.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "CountryCodes(deviceCountry=" + this.a + ", deviceCountryDeprecated=" + this.b + ", localeCountry=" + this.c + ", settingsCountry=" + this.d + ", simCountryCodes=" + this.e + ", networkCountryCodes=" + this.f + ")";
    }
}
