package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkm {
    public final String a;
    public final String b;
    public final String c;
    public final ffix d;
    public final doie e;

    public dnkm(String str, doie doieVar, String str2, String str3, ffix ffixVar) {
        this.a = str;
        this.e = doieVar;
        this.b = str2;
        this.c = str3;
        this.d = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnkm)) {
            return false;
        }
        dnkm dnkmVar = (dnkm) obj;
        return ffkj.e(this.a, dnkmVar.a) && ffkj.e(this.e, dnkmVar.e) && ffkj.e(this.b, dnkmVar.b) && ffkj.e(this.c, dnkmVar.c) && ffkj.e(this.d, dnkmVar.d);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SimUiData(id=" + this.a + ", simIcon=" + this.e + ", title=" + this.b + ", subtitle=" + this.c + ", onClick=" + this.d + ")";
    }
}
