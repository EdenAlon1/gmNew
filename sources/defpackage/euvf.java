package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euvf extends euvk {
    public final String a;
    public final String b;
    public final euvn c;
    public final int d;
    private final String e;

    public euvf(String str, String str2, String str3, euvn euvnVar, int i) {
        this.e = str;
        this.a = str2;
        this.b = str3;
        this.c = euvnVar;
        this.d = i;
    }

    @Override // defpackage.euvk
    public final euvn a() {
        return this.c;
    }

    @Override // defpackage.euvk
    public final String b() {
        return this.a;
    }

    @Override // defpackage.euvk
    public final String c() {
        return this.b;
    }

    @Override // defpackage.euvk
    public final String d() {
        return this.e;
    }

    @Override // defpackage.euvk
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euvk) {
            euvk euvkVar = (euvk) obj;
            String str = this.e;
            if (str != null ? str.equals(euvkVar.d()) : euvkVar.d() == null) {
                String str2 = this.a;
                if (str2 != null ? str2.equals(euvkVar.b()) : euvkVar.b() == null) {
                    String str3 = this.b;
                    if (str3 != null ? str3.equals(euvkVar.c()) : euvkVar.c() == null) {
                        euvn euvnVar = this.c;
                        if (euvnVar != null ? euvnVar.equals(euvkVar.a()) : euvkVar.a() == null) {
                            int i = this.d;
                            if (i != 0 ? i == euvkVar.e() : euvkVar.e() == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.e;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.b;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        euvn euvnVar = this.c;
        int hashCode4 = (hashCode3 ^ (euvnVar == null ? 0 : euvnVar.hashCode())) * 1000003;
        int i2 = this.d;
        return hashCode4 ^ (i2 != 0 ? i2 : 0);
    }

    public final String toString() {
        int i = this.d;
        String valueOf = String.valueOf(this.c);
        String str = i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK";
        String str2 = this.b;
        String str3 = this.a;
        return "InstallationResponse{uri=" + this.e + ", fid=" + str3 + ", refreshToken=" + str2 + ", authToken=" + valueOf + ", responseCode=" + str + "}";
    }
}
