package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyub {
    public final String a;
    public final String b;
    public final String c;
    public final cyua d;
    private final boolean e = true;

    public cyub(String str, String str2, String str3, cyua cyuaVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cyuaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyub)) {
            return false;
        }
        cyub cyubVar = (cyub) obj;
        if (!ffkj.e(this.a, cyubVar.a) || !ffkj.e(this.b, cyubVar.b) || !ffkj.e(this.c, cyubVar.c)) {
            return false;
        }
        boolean z = cyubVar.e;
        return ffkj.e(this.d, cyubVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode * 31;
        String str3 = this.c;
        return ((((((i + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + 1231) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TitleUiData(title=" + this.a + ", subtitle=" + this.b + ", displayDestination=" + this.c + ", enableCopyTitleToClipBoard=true, flags=" + this.d + ")";
    }
}
