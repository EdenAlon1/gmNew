package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxo implements Serializable {
    public double a;
    public double b;

    public enxo(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static enxo c(double d, double d2) {
        enxo enxoVar = new enxo();
        enxoVar.d(d, d2);
        return enxoVar;
    }

    public final double a(double d) {
        return Math.max(this.a, Math.min(this.b, d));
    }

    public final enxo b(double d) {
        return i() ? this : new enxo(this.a - d, this.b + d);
    }

    final void d(double d, double d2) {
        this.a = d <= d2 ? d : d2;
        if (d <= d2) {
            d = d2;
        }
        this.b = d;
    }

    final void e(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enxo) {
            enxo enxoVar = (enxo) obj;
            if (this.a == enxoVar.a && this.b == enxoVar.b) {
                return true;
            }
            if (i() && enxoVar.i()) {
                return true;
            }
        }
        return false;
    }

    final void f(enxo enxoVar) {
        if (i()) {
            this.a = enxoVar.a;
            this.b = enxoVar.b;
        } else {
            if (enxoVar.i()) {
                return;
            }
            this.a = Math.min(this.a, enxoVar.a);
            this.b = Math.max(this.b, enxoVar.b);
        }
    }

    public final boolean g(double d) {
        return d >= this.a && d <= this.b;
    }

    public final boolean h(enxo enxoVar) {
        double d = this.a;
        double d2 = enxoVar.a;
        if (d <= d2) {
            d = d2;
        }
        if (d > (d <= d2 ? this : enxoVar).b) {
            return false;
        }
        if (d > d2) {
            enxoVar = this;
        }
        return d <= enxoVar.b;
    }

    public final int hashCode() {
        if (i()) {
            return 17;
        }
        long doubleToLongBits = ((Double.doubleToLongBits(this.a) + 629) * 37) + Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean i() {
        return this.a > this.b;
    }

    public final String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }

    public enxo() {
        this(1.0d, eobe.a);
    }

    public enxo(enxo enxoVar) {
        this(enxoVar.a, enxoVar.b);
    }
}
