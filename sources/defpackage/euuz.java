package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euuz extends euvd {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public euuz(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.g = i;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }

    @Override // defpackage.euvd
    public final long a() {
        return this.d;
    }

    @Override // defpackage.euvd
    public final long b() {
        return this.e;
    }

    @Override // defpackage.euvd
    public final euvc c() {
        return new euuy(this);
    }

    @Override // defpackage.euvd
    public final String d() {
        return this.b;
    }

    @Override // defpackage.euvd
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof euvd) {
            euvd euvdVar = (euvd) obj;
            String str4 = this.a;
            if (str4 != null ? str4.equals(euvdVar.e()) : euvdVar.e() == null) {
                int i = this.g;
                int h = euvdVar.h();
                if (i == 0) {
                    throw null;
                }
                if (i == h && ((str = this.b) != null ? str.equals(euvdVar.d()) : euvdVar.d() == null) && ((str2 = this.c) != null ? str2.equals(euvdVar.g()) : euvdVar.g() == null) && this.d == euvdVar.a() && this.e == euvdVar.b() && ((str3 = this.f) != null ? str3.equals(euvdVar.f()) : euvdVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.euvd
    public final String f() {
        return this.f;
    }

    @Override // defpackage.euvd
    public final String g() {
        return this.c;
    }

    @Override // defpackage.euvd
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.g;
        if (i == 0) {
            throw null;
        }
        int i2 = ((hashCode ^ 1000003) * 1000003) ^ i;
        String str2 = this.b;
        int hashCode2 = ((i2 * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.d;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int i4 = (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f;
        return i4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        int i = this.g;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + str + ", authToken=" + this.b + ", refreshToken=" + this.c + ", expiresInSecs=" + this.d + ", tokenCreationEpochInSecs=" + this.e + ", fisError=" + this.f + "}";
    }
}
