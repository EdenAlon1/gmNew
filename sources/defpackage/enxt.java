package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxt implements Comparable, Serializable {
    public static final enxt a = new enxt(eobe.a);
    public static final enxt b = new enxt(2.0d);
    public static final enxt c = new enxt(4.0d);
    public static final enxt d = new enxt(Double.POSITIVE_INFINITY);
    public static final enxt e = new enxt(-1.0d);
    public final double f;

    public enxt(double d2) {
        this.f = d2;
        if (f()) {
            return;
        }
        throw new IllegalArgumentException("Invalid length2: " + d2);
    }

    public static enxt c(double d2) {
        return new enxt(Math.min(4.0d, d2));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(enxt enxtVar) {
        return Double.compare(this.f, enxtVar.f);
    }

    public final enxs b() {
        if (e()) {
            return new enxs(-1.0d);
        }
        if (d()) {
            return enxs.a;
        }
        double asin = Math.asin(Math.sqrt(this.f) * 0.5d);
        return new enxs(asin + asin);
    }

    public final boolean d() {
        return this.f == Double.POSITIVE_INFINITY;
    }

    public final boolean e() {
        return this.f < eobe.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof enxt) && this.f == ((enxt) obj).f;
    }

    public final boolean f() {
        double d2 = this.f;
        return (d2 >= eobe.a && d2 <= 4.0d) || e() || d();
    }

    public final int hashCode() {
        double d2 = this.f;
        if (d2 == eobe.a) {
            return 0;
        }
        int i = ermg.a;
        return Double.valueOf(d2).hashCode();
    }

    public final String toString() {
        double d2 = e.f;
        double d3 = this.f;
        return d3 == d2 ? "NEGATIVE" : d3 == a.f ? "ZERO" : d3 == c.f ? "STRAIGHT" : d3 == d.f ? "INFINITY" : b().toString();
    }

    public enxt(enyr enyrVar, enyr enyrVar2) {
        this(Math.min(4.0d, enyrVar.c(enyrVar2)));
        emxf.a(enxw.d(enyrVar));
        emxf.a(enxw.d(enyrVar2));
        emxf.a(f());
    }
}
