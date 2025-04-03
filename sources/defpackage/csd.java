package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csd {
    public final huo a;
    public final ffji b;
    public final cyq c;
    public final boolean d;

    public csd(huo huoVar, ffji ffjiVar, cyq cyqVar, boolean z) {
        this.a = huoVar;
        this.b = ffjiVar;
        this.c = cyqVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csd)) {
            return false;
        }
        csd csdVar = (csd) obj;
        return ffkj.e(this.a, csdVar.a) && ffkj.e(this.b, csdVar.b) && ffkj.e(this.c, csdVar.c) && this.d == csdVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ')';
    }
}
