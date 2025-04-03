package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eavp extends eavo {
    private final Object a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final eavi g;

    public eavp(Object obj, String str, String str2, String str3, String str4, String str5, eavi eaviVar) {
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = eaviVar;
    }

    @Override // defpackage.eavo
    public final eavi a() {
        return this.g;
    }

    @Override // defpackage.eavo
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.eavo
    public final String d() {
        return this.b;
    }

    @Override // defpackage.eavo
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavo) {
            eavo eavoVar = (eavo) obj;
            if (this.a.equals(eavoVar.c()) && ((str = this.b) != null ? str.equals(eavoVar.d()) : eavoVar.d() == null) && ((str2 = this.c) != null ? str2.equals(eavoVar.f()) : eavoVar.f() == null) && ((str3 = this.d) != null ? str3.equals(eavoVar.h()) : eavoVar.h() == null) && ((str4 = this.e) != null ? str4.equals(eavoVar.g()) : eavoVar.g() == null) && ((str5 = this.f) != null ? str5.equals(eavoVar.e()) : eavoVar.e() == null)) {
                eavoVar.i();
                eavi eaviVar = this.g;
                if (eaviVar != null ? eaviVar.equals(eavoVar.a()) : eavoVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.eavo
    public final String f() {
        return this.c;
    }

    @Override // defpackage.eavo
    public final String g() {
        return this.e;
    }

    @Override // defpackage.eavo
    public final String h() {
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
        int hashCode6 = (((hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ 1231) * 1000003;
        eavi eaviVar = this.g;
        return hashCode6 ^ (eaviVar != null ? eaviVar.hashCode() : 0);
    }

    public final String toString() {
        eavi eaviVar = this.g;
        return "AccountSnapshot{account=" + this.a.toString() + ", accountName=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", avatarUrl=" + this.f + ", isMetadataAvailable=true, gaiaAccountData=" + String.valueOf(eaviVar) + "}";
    }

    @Override // defpackage.eavo
    public final void i() {
    }
}
