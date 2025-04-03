package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eble extends eblf {
    private final String a;
    private final String b;
    private final String c;

    public eble(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.eblf
    public final String a() {
        return this.b;
    }

    @Override // defpackage.eblf
    public final String b() {
        return this.c;
    }

    @Override // defpackage.eblf
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eblf) {
            eblf eblfVar = (eblf) obj;
            eblfVar.j();
            String str = this.a;
            if (str != null ? str.equals(eblfVar.c()) : eblfVar.c() == null) {
                if (this.b.equals(eblfVar.a())) {
                    eblfVar.e();
                    eblfVar.d();
                    eblfVar.f();
                    eblfVar.h();
                    eblfVar.g();
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(eblfVar.b()) : eblfVar.b() == null) {
                        eblfVar.i();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 375623332) * 1000003) ^ this.b.hashCode();
        String str2 = this.c;
        return (((((((hashCode * 583896283) ^ 1237) * 1000003) ^ 1) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ 1;
    }

    public final String toString() {
        return "DeviceOwner{isMetadataAvailable=true, displayName=" + this.a + ", accountName=" + this.b + ", givenName=null, familyName=null, isG1User=false, isDasherUser=UNKNOWN, obfuscatedGaiaId=null, avatarUrl=" + this.c + ", isUnicornUser=UNKNOWN}";
    }

    @Override // defpackage.eblf
    public final void d() {
    }

    @Override // defpackage.eblf
    public final void e() {
    }

    @Override // defpackage.eblf
    public final void f() {
    }

    @Override // defpackage.eblf
    public final void g() {
    }

    @Override // defpackage.eblf
    public final void h() {
    }

    @Override // defpackage.eblf
    public final void i() {
    }

    @Override // defpackage.eblf
    public final void j() {
    }
}
