package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zys {
    public final doui a;
    public final doue b;
    public final fgdj c;
    public final ffxx d;
    public final ffix e;

    public zys(doui douiVar, doue doueVar, fgdj fgdjVar, ffxx ffxxVar, ffix ffixVar) {
        this.a = douiVar;
        this.b = doueVar;
        this.c = fgdjVar;
        this.d = ffxxVar;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zys)) {
            return false;
        }
        zys zysVar = (zys) obj;
        return ffkj.e(this.a, zysVar.a) && ffkj.e(this.b, zysVar.b) && ffkj.e(this.c, zysVar.c) && ffkj.e(this.d, zysVar.d) && ffkj.e(this.e, zysVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Transcript(uiData=" + this.a + ", uiAction=" + this.b + ", expandStateFlow=" + this.c + ", progressFlow=" + this.d + ", onPrepare=" + this.e + ")";
    }
}
