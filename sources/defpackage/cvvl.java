package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvl {
    public final String a;
    public final String b;
    public final dnym c;
    public final ffix d;

    public cvvl(String str, String str2, dnym dnymVar, ffix ffixVar) {
        this.a = str;
        this.b = str2;
        this.c = dnymVar;
        this.d = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvvl)) {
            return false;
        }
        cvvl cvvlVar = (cvvl) obj;
        return ffkj.e(this.a, cvvlVar.a) && ffkj.e(this.b, cvvlVar.b) && ffkj.e(this.c, cvvlVar.c) && ffkj.e(this.d, cvvlVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PenpalRowUiData(title=" + this.a + ", subtitle=" + this.b + ", monogram=" + this.c + ", onClick=" + this.d + ")";
    }
}
