package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euvh extends euvn {
    public final String a;
    public final long b;
    public final int c;

    public euvh(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.euvn
    public final long a() {
        return this.b;
    }

    @Override // defpackage.euvn
    public final String b() {
        return this.a;
    }

    @Override // defpackage.euvn
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof euvn) {
            euvn euvnVar = (euvn) obj;
            String str = this.a;
            if (str != null ? str.equals(euvnVar.b()) : euvnVar.b() == null) {
                if (this.b == euvnVar.a() && ((i = this.c) != 0 ? i == euvnVar.c() : euvnVar.c() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = this.c;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (i != 0 ? i : 0);
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
        long j = this.b;
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + j + ", responseCode=" + str + "}";
    }
}
