package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngt implements dngx {
    public final dnym a;
    public final String b;
    public final String c;
    public final List d;
    public final ffix e;
    public final dngq f;

    public dngt(dnym dnymVar, String str, String str2, List list, ffix ffixVar, dngq dngqVar) {
        this.a = dnymVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = ffixVar;
        this.f = dngqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dngt)) {
            return false;
        }
        dngt dngtVar = (dngt) obj;
        return ffkj.e(this.a, dngtVar.a) && ffkj.e(this.b, dngtVar.b) && ffkj.e(this.c, dngtVar.c) && ffkj.e(this.d, dngtVar.d) && ffkj.e(this.e, dngtVar.e) && ffkj.e(this.f, dngtVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1) * 31) + this.e.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "Redirecting(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", annotations=" + this.d + ", onClick=" + this.e + ", flags=" + this.f + ")";
    }
}
