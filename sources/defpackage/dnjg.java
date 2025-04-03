package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjg implements dndt {
    public final String a;
    public final String b;
    public final ffix c;
    public final doie d;

    public dnjg(doie doieVar, String str, String str2, ffix ffixVar) {
        this.d = doieVar;
        this.a = str;
        this.b = str2;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnjg)) {
            return false;
        }
        dnjg dnjgVar = (dnjg) obj;
        return ffkj.e(this.d, dnjgVar.d) && ffkj.e(this.a, dnjgVar.a) && ffkj.e(this.b, dnjgVar.b) && ffkj.e(this.c, dnjgVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        String str = this.b;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SimListItemUiData(simIcon=" + this.d + ", title=" + this.a + ", subtitle=" + this.b + ", onClick=" + this.c + ")";
    }
}
