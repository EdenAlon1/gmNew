package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doec implements doef {
    public final qgw a;
    public final String b;
    public final ffix c;

    public doec(qgw qgwVar, String str, ffix ffixVar) {
        this.a = qgwVar;
        this.b = str;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doec)) {
            return false;
        }
        doec doecVar = (doec) obj;
        return ffkj.e(this.a, doecVar.a) && ffkj.e(this.b, doecVar.b) && ffkj.e(this.c, doecVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Animation(lottie=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
