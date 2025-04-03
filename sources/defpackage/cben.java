package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cben extends cbeo {
    private final aoku a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;

    public cben(aoku aokuVar, String str, long j, String str2, String str3) {
        this.a = aokuVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.cbeo
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cbeo
    public final aoku b() {
        return this.a;
    }

    @Override // defpackage.cbeo
    public final String c() {
        return this.b;
    }

    @Override // defpackage.cbeo
    public final String d() {
        return this.e;
    }

    @Override // defpackage.cbeo
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbeo) {
            cbeo cbeoVar = (cbeo) obj;
            if (this.a.equals(cbeoVar.b()) && ((str = this.b) != null ? str.equals(cbeoVar.c()) : cbeoVar.c() == null) && this.c == cbeoVar.a() && ((str2 = this.d) != null ? str2.equals(cbeoVar.e()) : cbeoVar.e() == null) && this.e.equals(cbeoVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        int i = ((((hashCode * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.d;
        return ((i ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "MatchingContactData{messagingIdentity=" + ((aoks) this.a).o() + ", displayName=" + this.b + ", contactId=" + this.c + ", photoUri=" + this.d + ", lookupKey=" + this.e + "}";
    }
}
