package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifh {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public ifh(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < eobe.a || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == eobe.a && (d2 == eobe.a || d == eobe.a)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == eobe.a) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == eobe.a || d == eobe.a) && d4 == eobe.a) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < eobe.a) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < eobe.a || d < eobe.a) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean a() {
        return this.a == -3.0d;
    }

    public final boolean b() {
        return this.a == -2.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifh)) {
            return false;
        }
        ifh ifhVar = (ifh) obj;
        return Double.compare(this.a, ifhVar.a) == 0 && Double.compare(this.b, ifhVar.b) == 0 && Double.compare(this.c, ifhVar.c) == 0 && Double.compare(this.d, ifhVar.d) == 0 && Double.compare(this.e, ifhVar.e) == 0 && Double.compare(this.f, ifhVar.f) == 0 && Double.compare(this.g, ifhVar.g) == 0;
    }

    public final int hashCode() {
        return (((((((((((ifg.a(this.a) * 31) + ifg.a(this.b)) * 31) + ifg.a(this.c)) * 31) + ifg.a(this.d)) * 31) + ifg.a(this.e)) * 31) + ifg.a(this.f)) * 31) + ifg.a(this.g);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }

    public /* synthetic */ ifh(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, eobe.a, eobe.a);
    }
}
