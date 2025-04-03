package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokl {
    public final String a;
    public final String b;
    public final ffix c;

    public dokl(String str, String str2, ffix ffixVar) {
        ffixVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dokl)) {
            return false;
        }
        dokl doklVar = (dokl) obj;
        return ffkj.e(this.a, doklVar.a) && ffkj.e(this.b, doklVar.b) && ffkj.e(this.c, doklVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Basic(title=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
