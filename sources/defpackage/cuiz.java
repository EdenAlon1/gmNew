package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuiz {

    @evlj(a = "v")
    private final String a = "1";

    @evlj(a = "i")
    private final String b;

    @evlj(a = "u")
    private final String c;

    @evlj(a = "s")
    private final String d;

    @evlj(a = "r")
    private final String e;

    @evlj(a = "d")
    private final String f;

    @evlj(a = "m")
    private final cuja g;

    public cuiz(String str, String str2, String str3, String str4, String str5, cuja cujaVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = cujaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuiz)) {
            return false;
        }
        cuiz cuizVar = (cuiz) obj;
        return ffkj.e(this.a, cuizVar.a) && ffkj.e(this.b, cuizVar.b) && ffkj.e(this.c, cuizVar.c) && ffkj.e(this.d, cuizVar.d) && ffkj.e(this.e, cuizVar.e) && ffkj.e(this.f, cuizVar.f) && ffkj.e(this.g, cuizVar.g);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.e;
        return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "CarrierSpamReport(version=" + this.a + ", conversationUuid=" + this.b + ", userAgent=" + this.c + ", senderDestination=" + this.d + ", reporterDestination=" + this.e + ", disposition=" + this.f + ", message=" + this.g + ")";
    }
}
