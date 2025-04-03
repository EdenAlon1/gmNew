package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axxf {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public axxf(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axxf)) {
            return false;
        }
        axxf axxfVar = (axxf) obj;
        return this.a == axxfVar.a && ffkj.e(this.b, axxfVar.b) && ffkj.e(this.c, axxfVar.c) && ffkj.e(this.d, axxfVar.d);
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RawContactName(contactId=" + this.a + ", displayName=" + this.b + ", givenName=" + this.c + ", familyName=" + this.d + ")";
    }
}
