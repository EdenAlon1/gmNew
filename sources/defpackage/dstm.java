package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dstm {
    public final dsss a;
    public final float b;

    public dstm(dsss dsssVar, float f) {
        this.a = dsssVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dstm)) {
            return false;
        }
        dstm dstmVar = (dstm) obj;
        return ffkj.e(this.a, dstmVar.a) && Float.compare(this.b, dstmVar.b) == 0;
    }

    public final int hashCode() {
        dsss dsssVar = this.a;
        return ((dsssVar == null ? 0 : dsssVar.hashCode()) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WeightedPage(uiData=" + this.a + ", weight=" + this.b + ")";
    }
}
