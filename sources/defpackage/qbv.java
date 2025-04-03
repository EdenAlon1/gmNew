package defpackage;

import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbv {
    private final BigDecimal a;
    private final BigDecimal b;
    private final BigDecimal c;
    private final BigDecimal d;

    public qbv(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = bigDecimal4;
    }

    public final double a() {
        return this.a.add(this.c).doubleValue() / 2.0d;
    }

    public final double b() {
        return this.b.add(this.d).doubleValue() / 2.0d;
    }
}
