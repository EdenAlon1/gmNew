package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyj implements Serializable {
    public final double a;
    public final double b;

    public enyj(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static enyj c(double d, double d2) {
        return new enyj(enxs.a(d), enxs.a(d2));
    }

    public static enyj d(int i, int i2) {
        return new enyj(enxs.b(i), enxs.b(i2));
    }

    public final enxs a() {
        return new enxs(this.a);
    }

    public final enxs b() {
        return new enxs(this.b);
    }

    public final enyr e() {
        double d = this.a;
        double cos = Math.cos(d);
        double d2 = this.b;
        return new enyr(Math.cos(d2) * cos, Math.sin(d2) * cos, Math.sin(d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enyj) {
            enyj enyjVar = (enyj) obj;
            if (this.a == enyjVar.a && this.b == enyjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public enyj() {
        this(eobe.a, eobe.a);
    }

    public enyj(enxs enxsVar, enxs enxsVar2) {
        this(enxsVar.c, enxsVar2.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public enyj(defpackage.enyr r9) {
        /*
            r8 = this;
            double r0 = r9.g
            r2 = 0
            double r0 = r0 + r2
            double r4 = r9.e
            double r4 = r4 * r4
            double r6 = r9.f
            double r6 = r6 * r6
            double r4 = r4 + r6
            double r4 = java.lang.Math.sqrt(r4)
            double r0 = java.lang.Math.atan2(r0, r4)
            double r4 = r9.f
            double r4 = r4 + r2
            double r6 = r9.e
            double r6 = r6 + r2
            double r2 = java.lang.Math.atan2(r4, r6)
            r8.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enyj.<init>(enyr):void");
    }
}
