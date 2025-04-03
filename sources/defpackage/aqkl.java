package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqkl {
    public final String a;
    public final String b;
    public final String c;

    public aqkl(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqkl)) {
            return false;
        }
        aqkl aqklVar = (aqkl) obj;
        return ffkj.e(this.a, aqklVar.a) && ffkj.e(this.b, aqklVar.b) && ffkj.e(this.c, aqklVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode * 31;
        String str3 = this.c;
        return ((i + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileReceivingMetadata(profileAccessToken=" + this.a + ", personId=" + this.b + ", profileLastUpdatedServerTimestamp=" + this.c + ")";
    }
}
