package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxa {
    public final List a;
    public final dszr b;
    public final String c;

    public drxa(List list, dszr dszrVar, String str) {
        this.a = list;
        this.b = dszrVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drxa)) {
            return false;
        }
        drxa drxaVar = (drxa) obj;
        return ffkj.e(this.a, drxaVar.a) && this.b == drxaVar.b && ffkj.e(this.c, drxaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dszr dszrVar = this.b;
        int hashCode2 = (hashCode + (dszrVar == null ? 0 : dszrVar.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ProxyScreenArguments(categories=" + this.a + ", initialScreen=" + this.b + ", initialSearchTerm=" + this.c + ")";
    }
}
