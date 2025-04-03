package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdsr {
    public static final bdsq a = new bdsq();
    public static final List b = ffdx.ak(new ffme('A', 'Z'));
    public static final List c = ffdx.g('(', ')', '-', ' ', '*', '#', '@', '_', '.', ',', ':', ',', '/', '+');
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final List o;
    private final String p;
    private final String q;

    public bdsr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.p = str7;
        this.q = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = list;
        this.o = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdsr)) {
            return false;
        }
        bdsr bdsrVar = (bdsr) obj;
        return ffkj.e(this.d, bdsrVar.d) && ffkj.e(this.e, bdsrVar.e) && ffkj.e(this.f, bdsrVar.f) && ffkj.e(this.g, bdsrVar.g) && ffkj.e(this.h, bdsrVar.h) && ffkj.e(this.i, bdsrVar.i) && ffkj.e(this.p, bdsrVar.p) && ffkj.e(this.q, bdsrVar.q) && ffkj.e(this.j, bdsrVar.j) && ffkj.e(this.k, bdsrVar.k) && ffkj.e(this.l, bdsrVar.l) && ffkj.e(this.m, bdsrVar.m) && ffkj.e(this.n, bdsrVar.n) && ffkj.e(this.o, bdsrVar.o);
    }

    public final int hashCode() {
        String str = this.d;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode * 31;
        String str3 = this.f;
        int hashCode3 = (((i + hashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.q;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.l;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.m;
        return ((((hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public final String toString() {
        return "AnonymizedRoamingInvestigationValues(originalNormalizedDestination=" + this.d + ", originalSendDestination=" + this.e + ", updatedNormalizedDestination=" + this.f + ", updatedSendDestination=" + this.g + ", expectedNormalizedDestination=" + this.h + ", expectedSendDestination=" + this.i + ", telephonyCanonicalAddress=" + this.p + ", userInputNumber=" + this.q + ", localeCountryCode=" + this.j + ", deviceCountryCode=" + this.k + ", deviceCountryCodeDeprecated=" + this.l + ", settingsCountryCode=" + this.m + ", simCountryCodes=" + this.n + ", networkCountryCodes=" + this.o + ")";
    }
}
