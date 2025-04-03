package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxs implements Comparable, Serializable {
    public static final enxs a = new enxs(Double.POSITIVE_INFINITY);
    public static final enxs b = new enxs(eobe.a);
    public final double c;

    public enxs(double d) {
        this.c = d;
    }

    public static enxs a(double d) {
        return new enxs(d * 0.017453292519943295d);
    }

    public static enxs b(int i) {
        return a(i * 1.0E-7d);
    }

    public static enxs c(enxs enxsVar, enxs enxsVar2) {
        return enxsVar2.c > enxsVar.c ? enxsVar : enxsVar2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        double d = ((enxs) obj).c;
        double d2 = this.c;
        if (d2 < d) {
            return -1;
        }
        return d2 <= d ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof enxs) && this.c == ((enxs) obj).c;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return (this.c * 57.29577951308232d) + "d";
    }

    public enxs() {
        this(eobe.a);
    }
}
