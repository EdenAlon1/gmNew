package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjvt {
    public final cjwi a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    private final String f;
    private final String g;
    private final String h;

    public cjvt() {
        this(null, null, null, null, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjvt)) {
            return false;
        }
        cjvt cjvtVar = (cjvt) obj;
        return ffkj.e(this.f, cjvtVar.f) && ffkj.e(this.g, cjvtVar.g) && ffkj.e(this.h, cjvtVar.h) && this.a == cjvtVar.a && this.b == cjvtVar.b;
    }

    public final int hashCode() {
        String str = this.f;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.g;
        int hashCode2 = ((hashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.a.hashCode()) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "DefaultProfileName(defaultFirstName=" + this.f + ", defaultLastName=" + this.g + ", defaultDisplayName=" + this.h + ", source=" + this.a + ", hasName=" + this.b + ")";
    }

    public /* synthetic */ cjvt(String str, String str2, String str3, cjwi cjwiVar, boolean z, int i) {
        cjwiVar = (i & 8) != 0 ? cjwi.PROFILE_PEOPLE_SHARING_SOURCE : cjwiVar;
        int i2 = i & 2;
        int i3 = i & 1;
        String str4 = null;
        str3 = (i & 4) != 0 ? null : str3;
        str2 = i2 != 0 ? null : str2;
        str = 1 == i3 ? null : str;
        boolean z2 = (i & 16) == 0;
        cjwiVar.getClass();
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.a = cjwiVar;
        this.b = z & z2;
        this.c = (str == null || str.length() == 0) ? null : str;
        this.d = (str2 == null || str2.length() == 0) ? null : str2;
        if (str3 != null && str3.length() != 0) {
            str4 = str3;
        }
        this.e = str4;
    }
}
