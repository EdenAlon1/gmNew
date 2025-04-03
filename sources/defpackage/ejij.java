package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejij {
    public final String a;
    public final String b;
    public final String c;

    public ejij(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejij)) {
            return false;
        }
        ejij ejijVar = (ejij) obj;
        return ffkj.e(this.a, ejijVar.a) && ffkj.e(this.b, ejijVar.b) && ffkj.e(this.c, ejijVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SelectedAccount(userId=" + this.a + ", displayId=" + this.b + ", type=" + this.c + ")";
    }
}
