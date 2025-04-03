package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlp {
    private final String a;
    private final String b;

    public drlp(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drlp)) {
            return false;
        }
        drlp drlpVar = (drlp) obj;
        return ffkj.e(this.a, drlpVar.a) && ffkj.e(this.b, drlpVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            return this.a;
        }
        return this.a + "=" + str;
    }
}
