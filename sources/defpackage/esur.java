package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esur {
    public final String a;
    public final String b;

    public esur(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esur)) {
            return false;
        }
        esur esurVar = (esur) obj;
        return ffkj.e(this.a, esurVar.a) && ffkj.e(this.b, esurVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Capability(name=" + this.a + ", value=" + this.b + ")";
    }
}
