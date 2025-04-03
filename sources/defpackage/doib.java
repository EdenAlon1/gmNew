package defpackage;

/* compiled from: PG */
@ffbs
/* loaded from: classes4.dex */
public final class doib {
    public final String a;
    public final ffix b;
    public final doie c;

    public doib(doie doieVar, String str, ffix ffixVar) {
        this.c = doieVar;
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doib)) {
            return false;
        }
        doib doibVar = (doib) obj;
        return ffkj.e(this.c, doibVar.c) && ffkj.e(this.a, doibVar.a) && ffkj.e(this.b, doibVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SimChipUiData(simIconUiData=" + this.c + ", carrierName=" + this.a + ", onClick=" + this.b + ")";
    }
}
