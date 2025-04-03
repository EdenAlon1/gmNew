package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dswz {
    public final ffix a;
    public final ffji b;

    public dswz(ffix ffixVar, ffji ffjiVar) {
        this.a = ffixVar;
        this.b = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dswz)) {
            return false;
        }
        dswz dswzVar = (dswz) obj;
        return ffkj.e(this.a, dswzVar.a) && ffkj.e(this.b, dswzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RenderingHeightController(get=" + this.a + ", set=" + this.b + ")";
    }
}
