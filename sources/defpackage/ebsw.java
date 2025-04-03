package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebsw extends ebtg {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    private final String e;

    public ebsw(String str, String str2, String str3, String str4, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null accountIdentifier");
        }
        this.e = str;
        if (str2 == null) {
            throw new NullPointerException("Null accountName");
        }
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = z;
    }

    @Override // defpackage.ebtg
    public final String a() {
        return this.e;
    }

    @Override // defpackage.ebtg
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ebtg
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ebtg
    public final String d() {
        return this.b;
    }

    @Override // defpackage.ebtg
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebtg) {
            ebtg ebtgVar = (ebtg) obj;
            if (this.e.equals(ebtgVar.a()) && this.a.equals(ebtgVar.b()) && ((str = this.b) != null ? str.equals(ebtgVar.d()) : ebtgVar.d() == null) && ((str2 = this.c) != null ? str2.equals(ebtgVar.c()) : ebtgVar.c() == null) && this.d == ebtgVar.e()) {
                ebtgVar.f();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        String str = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return ((((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1231;
    }

    public final String toString() {
        return "OneGoogleAvatarImageLoaderKey{accountIdentifier=" + this.e + ", accountName=" + this.a + ", displayName=" + this.b + ", avatarUrl=" + this.c + ", isGaiaAccount=" + this.d + ", isMetadataAvailable=true}";
    }

    @Override // defpackage.ebtg
    public final void f() {
    }
}
