package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvx implements dlwa {
    public final String a;
    public final String b;
    private final String c;

    public dlvx(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvx)) {
            return false;
        }
        dlvx dlvxVar = (dlvx) obj;
        return ffkj.e(this.a, dlvxVar.a) && ffkj.e(this.b, dlvxVar.b) && ffkj.e(this.c, dlvxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Error(title=" + this.a + ", subtitle=" + this.b + ", contentDescription=" + this.c + ")";
    }

    public /* synthetic */ dlvx(String str, String str2) {
        this(str, null, str2);
    }
}
