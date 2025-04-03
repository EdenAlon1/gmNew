package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bdjh extends bdnk {
    private final byzj a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public bdjh(byzj byzjVar, String str, String str2, String str3, String str4, String str5, String str6) {
        if (byzjVar == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        this.a = byzjVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // defpackage.bdnk
    public final byzj a() {
        return this.a;
    }

    @Override // defpackage.bdnk
    public final String b() {
        return this.c;
    }

    @Override // defpackage.bdnk
    public final String c() {
        return this.b;
    }

    @Override // defpackage.bdnk
    public final String d() {
        return this.e;
    }

    @Override // defpackage.bdnk
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdnk) {
            bdnk bdnkVar = (bdnk) obj;
            if (this.a.equals(bdnkVar.a()) && ((str = this.b) != null ? str.equals(bdnkVar.c()) : bdnkVar.c() == null) && ((str2 = this.c) != null ? str2.equals(bdnkVar.b()) : bdnkVar.b() == null) && ((str3 = this.d) != null ? str3.equals(bdnkVar.g()) : bdnkVar.g() == null) && ((str4 = this.e) != null ? str4.equals(bdnkVar.d()) : bdnkVar.d() == null) && ((str5 = this.f) != null ? str5.equals(bdnkVar.f()) : bdnkVar.f() == null) && ((str6 = this.g) != null ? str6.equals(bdnkVar.e()) : bdnkVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdnk
    public final String f() {
        return this.f;
    }

    @Override // defpackage.bdnk
    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        return hashCode6 ^ (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "MessageSendReceiveAttemptRowInfo{transportProtocol=" + this.a.toString() + ", currentSimNetworkCountry=" + this.b + ", currentSimCountry=" + this.c + ", settingsCountry=" + this.d + ", defaultSmsSimCountry=" + this.e + ", localeCountry=" + this.f + ", defaultSmsSimNetworkCountry=" + this.g + "}";
    }
}
