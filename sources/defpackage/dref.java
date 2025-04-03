package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dref {
    public final String a;
    public final String b;
    public final String c;

    public dref(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dref)) {
            return false;
        }
        dref drefVar = (dref) obj;
        return ffkj.e(this.a, drefVar.a) && ffkj.e(this.b, drefVar.b) && ffkj.e(this.c, drefVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "GifStickerCategory(name=" + this.a + ", searchTerm=" + this.b + ", thumbnail=" + this.c + ")";
    }
}
