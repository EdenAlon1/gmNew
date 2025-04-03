package defpackage;

import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyy {
    public static final /* synthetic */ int a = 0;

    static {
        enxt.c(2.0d - enxw.b);
        new BigDecimal("0.25");
        new BigDecimal("0.5");
        new BigDecimal("2");
        new BigDecimal("4");
    }

    public static int a(enyr enyrVar, enyr enyrVar2, enyr enyrVar3) {
        double f = enyr.f(enyrVar3, enyrVar, enyrVar2);
        int i = f >= 1.6E-15d ? 1 : f <= -1.6E-15d ? -1 : 0;
        return i == 0 ? enyx.b(enyrVar, enyrVar2, enyrVar3) : i;
    }

    public static boolean b(enyr enyrVar, enyr enyrVar2, enyr enyrVar3, enyr enyrVar4) {
        int a2 = a(enyrVar2, enyrVar4, enyrVar);
        int a3 = a(enyrVar3, enyrVar4, enyrVar2);
        int i = a2 >= 0 ? 1 : 0;
        if (a3 >= 0) {
            i++;
        }
        if (a(enyrVar, enyrVar4, enyrVar3) > 0) {
            i++;
        }
        return i >= 2;
    }
}
