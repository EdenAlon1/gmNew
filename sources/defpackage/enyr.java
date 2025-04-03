package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyr implements Comparable, Serializable, enzo {
    public static final enyr a = new enyr(eobe.a, eobe.a, eobe.a);
    public static final enyr b = new enyr(1.0d, eobe.a, eobe.a);
    public static final enyr c = new enyr(eobe.a, eobe.a, 1.0d);
    public static final enyr d = new enyr(eobe.a, eobe.a, -1.0d);
    final double e;
    final double f;
    final double g;

    public enyr(double d2, double d3, double d4) {
        this.e = d2;
        this.f = d3;
        this.g = d4;
    }

    public static final double f(enyr enyrVar, enyr enyrVar2, enyr enyrVar3) {
        double d2 = enyrVar2.f;
        double d3 = enyrVar3.g;
        double d4 = enyrVar2.g;
        double d5 = enyrVar3.f;
        double d6 = enyrVar3.e;
        double d7 = enyrVar2.e;
        double d8 = enyrVar.e * ((d2 * d3) - (d4 * d5));
        double d9 = enyrVar.f * ((d4 * d6) - (d3 * d7));
        return d8 + d9 + (enyrVar.g * ((d7 * d5) - (d2 * d6)));
    }

    static final int h(double d2, double d3, double d4) {
        double abs = Math.abs(d2);
        double abs2 = Math.abs(d3);
        double abs3 = Math.abs(d4);
        return abs > abs2 ? abs > abs3 ? 0 : 2 : abs2 > abs3 ? 1 : 2;
    }

    public static final enyr i(enyr enyrVar, enyr enyrVar2) {
        return new enyr(enyrVar.e + enyrVar2.e, enyrVar.f + enyrVar2.f, enyrVar.g + enyrVar2.g);
    }

    public static final enyr j(enyr enyrVar, enyr enyrVar2) {
        double d2 = enyrVar.f;
        double d3 = enyrVar2.g;
        double d4 = d2 * d3;
        double d5 = enyrVar.g;
        double d6 = enyrVar2.f;
        double d7 = d5 * d6;
        double d8 = enyrVar2.e;
        double d9 = enyrVar.e;
        return new enyr(d4 - d7, (d5 * d8) - (d3 * d9), (d9 * d6) - (d2 * d8));
    }

    public static final enyr k(enyr enyrVar, double d2) {
        double d3 = enyrVar.g;
        return new enyr(d2 * enyrVar.e, d2 * enyrVar.f, d2 * d3);
    }

    public static final enyr l(enyr enyrVar) {
        double d2 = enyrVar.g;
        return new enyr(-enyrVar.e, -enyrVar.f, -d2);
    }

    public static final enyr m(enyr enyrVar) {
        double d2 = enyrVar.d();
        if (d2 != eobe.a) {
            d2 = 1.0d / d2;
        }
        return k(enyrVar, d2);
    }

    public static final enyr n(enyr enyrVar, enyr enyrVar2) {
        return new enyr(enyrVar.e - enyrVar2.e, enyrVar.f - enyrVar2.f, enyrVar.g - enyrVar2.g);
    }

    public final double a(enyr enyrVar) {
        return (this.e * enyrVar.e) + (this.f * enyrVar.f) + (this.g * enyrVar.g);
    }

    public final double b(int i) {
        return i == 0 ? this.e : i == 1 ? this.f : this.g;
    }

    public final double c(enyr enyrVar) {
        double d2 = this.e - enyrVar.e;
        double d3 = this.f - enyrVar.f;
        double d4 = this.g - enyrVar.g;
        return (d2 * d2) + (d3 * d3) + (d4 * d4);
    }

    public final double d() {
        return Math.sqrt(e());
    }

    public final double e() {
        double d2 = this.g;
        double d3 = this.f;
        double d4 = this.e;
        return (d4 * d4) + (d3 * d3) + (d2 * d2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof enyr)) {
            return false;
        }
        enyr enyrVar = (enyr) obj;
        return this.e == enyrVar.e && this.f == enyrVar.f && this.g == enyrVar.g;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(enyr enyrVar) {
        if (q(enyrVar)) {
            return -1;
        }
        return !p(enyrVar) ? 1 : 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.e)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (doubleToLongBits * 37) + Double.doubleToLongBits(Math.abs(this.f));
        long doubleToLongBits3 = doubleToLongBits2 + (37 * doubleToLongBits2) + Double.doubleToLongBits(Math.abs(this.g));
        return (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
    }

    public final String o() {
        enyj enyjVar = new enyj(this);
        return "(" + (enyjVar.a * 57.29577951308232d) + ", " + (enyjVar.b * 57.29577951308232d) + ")";
    }

    public final boolean p(enyr enyrVar) {
        return this.e == enyrVar.e && this.f == enyrVar.f && this.g == enyrVar.g;
    }

    public final boolean q(enyr enyrVar) {
        double d2 = this.e;
        double d3 = enyrVar.e;
        if (d2 < d3) {
            return true;
        }
        if (d3 < d2) {
            return false;
        }
        double d4 = this.f;
        double d5 = enyrVar.f;
        if (d4 < d5) {
            return true;
        }
        return d5 >= d4 && this.g < enyrVar.g;
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ", " + this.g + ")";
    }

    public enyr() {
        this(eobe.a, eobe.a, eobe.a);
    }
}
