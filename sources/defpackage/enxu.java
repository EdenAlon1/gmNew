package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxu implements Cloneable, Serializable {
    public double a;
    public double b;

    public enxu() {
        this(3.141592653589793d, -3.141592653589793d);
    }

    public static double b(double d, double d2) {
        double d3 = d2 - d;
        return d3 >= eobe.a ? d3 : (d2 + 3.141592653589793d) - (d - 3.141592653589793d);
    }

    public static enxu c() {
        enxu enxuVar = new enxu();
        enxuVar.g();
        return enxuVar;
    }

    public static enxu d() {
        enxu enxuVar = new enxu();
        enxuVar.h();
        return enxuVar;
    }

    public final double a() {
        double d = this.b - this.a;
        if (d >= eobe.a) {
            return d;
        }
        double d2 = d + 6.283185307179586d;
        if (d2 > eobe.a) {
            return d2;
        }
        return -1.0d;
    }

    final void e(double d, double d2) {
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        if (d2 == -3.141592653589793d) {
            d2 = 3.141592653589793d;
        }
        double b = b(d, d2);
        this.a = b <= 3.141592653589793d ? d : d2;
        if (b <= 3.141592653589793d) {
            d = d2;
        }
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enxu) {
            enxu enxuVar = (enxu) obj;
            if (this.a == enxuVar.a && this.b == enxuVar.b) {
                return true;
            }
        }
        return false;
    }

    final void f(double d, double d2, boolean z) {
        this.a = d;
        this.b = d2;
        if (z) {
            return;
        }
        if (d == -3.141592653589793d && d2 != 3.141592653589793d) {
            this.a = 3.141592653589793d;
        }
        if (d2 != -3.141592653589793d || d == 3.141592653589793d) {
            return;
        }
        this.b = 3.141592653589793d;
    }

    final void g() {
        this.a = 3.141592653589793d;
        this.b = -3.141592653589793d;
    }

    final void h() {
        this.a = -3.141592653589793d;
        this.b = 3.141592653589793d;
    }

    public final int hashCode() {
        long doubleToLongBits = ((Double.doubleToLongBits(this.a) + 629) * 37) + Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    final void i(enxu enxuVar) {
        if (enxuVar.l()) {
            return;
        }
        double d = enxuVar.a;
        if (k(d)) {
            double d2 = enxuVar.b;
            if (!k(d2)) {
                this.b = d2;
                return;
            } else {
                if (j(enxuVar)) {
                    return;
                }
                h();
                return;
            }
        }
        double d3 = enxuVar.b;
        if (k(d3)) {
            this.a = d;
            return;
        }
        if (!l()) {
            double d4 = this.a;
            if (!enxuVar.k(d4)) {
                if (b(d3, d4) < b(this.b, d)) {
                    this.a = d;
                    return;
                } else {
                    this.b = d3;
                    return;
                }
            }
        }
        this.a = d;
        this.b = d3;
    }

    public final boolean j(enxu enxuVar) {
        if (n()) {
            if (!enxuVar.n()) {
                return (enxuVar.a >= this.a || enxuVar.b <= this.b) && !l();
            }
        } else if (enxuVar.n()) {
            return m() || enxuVar.l();
        }
        return enxuVar.a >= this.a && enxuVar.b <= this.b;
    }

    public final boolean k(double d) {
        boolean n = n();
        double d2 = this.a;
        return n ? (d >= d2 || d <= this.b) && !l() : d >= d2 && d <= this.b;
    }

    public final boolean l() {
        return this.a == 3.141592653589793d && this.b == -3.141592653589793d;
    }

    public final boolean m() {
        return this.a == -3.141592653589793d && this.b == 3.141592653589793d;
    }

    public final boolean n() {
        return this.a > this.b;
    }

    public final String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }

    public enxu(double d, double d2) {
        f(d, d2, false);
    }

    public enxu(enxu enxuVar) {
        this(enxuVar.a, enxuVar.b);
    }
}
