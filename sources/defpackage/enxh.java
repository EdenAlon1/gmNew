package defpackage;

import java.math.BigDecimal;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enxh implements Comparable {
    final BigDecimal a;
    final BigDecimal b;
    final BigDecimal c;

    public enxh(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    final enxh a(enxh enxhVar) {
        return new enxh(this.b.multiply(enxhVar.c).subtract(this.c.multiply(enxhVar.b)), this.c.multiply(enxhVar.a).subtract(this.a.multiply(enxhVar.c)), this.a.multiply(enxhVar.b).subtract(this.b.multiply(enxhVar.a)));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        enxh enxhVar = (enxh) obj;
        int compareTo = this.a.compareTo(enxhVar.a);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.b.compareTo(enxhVar.b);
        return compareTo2 != 0 ? compareTo2 : this.c.compareTo(enxhVar.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof enxh)) {
            return false;
        }
        enxh enxhVar = (enxh) obj;
        return this.a.equals(enxhVar.a) && this.b.equals(enxhVar.b) && this.c.equals(enxhVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public enxh(enyr enyrVar) {
        this(new BigDecimal(enyrVar.e), new BigDecimal(enyrVar.f), new BigDecimal(enyrVar.g));
    }
}
