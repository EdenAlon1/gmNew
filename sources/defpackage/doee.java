package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doee implements doef {
    public final String a;
    public final String b;
    public final ffix c;

    public doee(String str, String str2, ffix ffixVar) {
        this.a = str;
        this.b = str2;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doee)) {
            return false;
        }
        doee doeeVar = (doee) obj;
        return ffkj.e(this.a, doeeVar.a) && ffkj.e(this.b, doeeVar.b) && ffkj.e(this.c, doeeVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Emotify(uri=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
