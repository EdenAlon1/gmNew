package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxp implements Serializable {
    public final enxo a;
    public final enxo b;

    public enxp(enxo enxoVar, enxo enxoVar2) {
        this.a = enxoVar;
        this.b = enxoVar2;
    }

    public static enxp a() {
        return new enxp(new enxo(1.0d, eobe.a), new enxo(1.0d, eobe.a));
    }

    public final enxp b(double d) {
        enxq enxqVar = new enxq(d, d);
        enxo b = this.a.b(enxqVar.a);
        enxo b2 = this.b.b(enxqVar.b);
        return (b.i() || b2.i()) ? a() : new enxp(b, b2);
    }

    public final enxq c(int i, int i2) {
        double d = i == 0 ? this.a.a : this.a.b;
        enxo enxoVar = this.b;
        return new enxq(d, i2 == 0 ? enxoVar.a : enxoVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enxp) {
            enxp enxpVar = (enxp) obj;
            if (this.a.equals(enxpVar.a) && this.b.equals(enxpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 701) + this.b.hashCode();
    }

    public final String toString() {
        return "[Lo" + new enxq(this.a.a, this.b.a).toString() + ", Hi" + new enxq(this.a.b, this.b.b).toString() + "]";
    }

    public enxp() {
        this(new enxo(), new enxo());
    }
}
