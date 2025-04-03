package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edkv extends edmj {
    public final String a;
    public final String b;
    public final List c;

    public edkv(String str, String str2, List list) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = str2;
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.c = list;
    }

    @Override // defpackage.edmj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.edmj
    public final String b() {
        return this.b;
    }

    @Override // defpackage.edmj
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edmj) {
            edmj edmjVar = (edmj) obj;
            if (this.a.equals(edmjVar.a()) && ((str = this.b) != null ? str.equals(edmjVar.b()) : edmjVar.b() == null) && this.c.equals(edmjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AddressComponent{name=" + this.a + ", shortName=" + this.b + ", types=" + this.c.toString() + "}";
    }
}
