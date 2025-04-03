package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cypp {
    public final String a;
    public final String b;

    public cypp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cypp)) {
            return false;
        }
        cypp cyppVar = (cypp) obj;
        return ffkj.e(this.a, cyppVar.a) && ffkj.e(this.b, cyppVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SelfIdentityNameAndDestination(name=" + this.a + ", destination=" + this.b + ")";
    }
}
