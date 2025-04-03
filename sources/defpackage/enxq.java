package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxq implements Serializable {
    public double a;
    public double b;

    public enxq(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static double a(enxq enxqVar, enxq enxqVar2) {
        return (enxqVar.a * enxqVar2.a) + (enxqVar.b * enxqVar2.b);
    }

    public static enxq b(enxq enxqVar, enxq enxqVar2) {
        return new enxq(enxqVar.a - enxqVar2.a, enxqVar.b - enxqVar2.b);
    }

    final void c(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof enxq)) {
            return false;
        }
        enxq enxqVar = (enxq) obj;
        return this.a == enxqVar.a && this.b == enxqVar.b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.a)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(Math.abs(this.b));
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public enxq() {
        this(eobe.a, eobe.a);
    }
}
