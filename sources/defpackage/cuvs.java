package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuvs {
    public final fbct a;
    public final fcfo b;
    public final fcek c;
    public final fcfw d;

    public cuvs(fbct fbctVar, fcfo fcfoVar, fcek fcekVar, fcfw fcfwVar) {
        fbctVar.getClass();
        fcfoVar.getClass();
        fcekVar.getClass();
        fcfwVar.getClass();
        this.a = fbctVar;
        this.b = fcfoVar;
        this.c = fcekVar;
        this.d = fcfwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuvs)) {
            return false;
        }
        cuvs cuvsVar = (cuvs) obj;
        return ffkj.e(this.a, cuvsVar.a) && ffkj.e(this.b, cuvsVar.b) && ffkj.e(this.c, cuvsVar.c) && ffkj.e(this.d, cuvsVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RequestObjects(stub=" + this.a + ", requestHeader=" + this.b + ", reporterId=" + this.c + ", spamContextInfo=" + this.d + ")";
    }
}
