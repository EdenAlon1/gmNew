package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class deh {
    public ich a;
    public ibt b;
    public ifm c;
    private icv d;

    public deh() {
        this(null);
    }

    public final icv a() {
        icv icvVar = this.d;
        if (icvVar != null) {
            return icvVar;
        }
        ibc ibcVar = new ibc((byte[]) null);
        this.d = ibcVar;
        return ibcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deh)) {
            return false;
        }
        deh dehVar = (deh) obj;
        return ffkj.e(this.a, dehVar.a) && ffkj.e(this.b, dehVar.b) && ffkj.e(this.c, dehVar.c) && ffkj.e(this.d, dehVar.d);
    }

    public final int hashCode() {
        ich ichVar = this.a;
        int hashCode = ichVar == null ? 0 : ichVar.hashCode();
        ibt ibtVar = this.b;
        int hashCode2 = ibtVar == null ? 0 : ibtVar.hashCode();
        int i = hashCode * 31;
        ifm ifmVar = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (ifmVar == null ? 0 : ifmVar.hashCode())) * 31;
        icv icvVar = this.d;
        return hashCode3 + (icvVar != null ? icvVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public /* synthetic */ deh(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
