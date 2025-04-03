package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edlv extends edqd {
    public final edqc a;
    public final double b;

    public edlv(edqc edqcVar, double d) {
        if (edqcVar == null) {
            throw new NullPointerException("Null place");
        }
        this.a = edqcVar;
        this.b = d;
    }

    @Override // defpackage.edqd
    public final double a() {
        return this.b;
    }

    @Override // defpackage.edqd
    public final edqc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edqd) {
            edqd edqdVar = (edqd) obj;
            if (this.a.equals(edqdVar.b()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(edqdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)));
    }

    public final String toString() {
        return "PlaceLikelihood{place=" + this.a.toString() + ", likelihood=" + this.b + "}";
    }
}
