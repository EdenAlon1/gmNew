package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csdq {
    public final engw a;
    public final String b;
    public final int c;

    public csdq(engw engwVar, String str, int i) {
        engwVar.getClass();
        str.getClass();
        this.a = engwVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csdq)) {
            return false;
        }
        csdq csdqVar = (csdq) obj;
        return ffkj.e(this.a, csdqVar.a) && ffkj.e(this.b, csdqVar.b) && this.c == csdqVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ListCmsItemsResult(cmsItems=" + this.a + ", pageToken=" + this.b + ", totalSize=" + this.c + ")";
    }
}
