package defpackage;

import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enzw {
    static emxc a(enyr enyrVar, enyr enyrVar2) {
        try {
            enyr i = enyr.i(enyrVar, enyrVar2);
            enyr n = enyr.n(enyrVar2, enyrVar);
            enyr enyrVar3 = new enyr(enxr.c(i.f, n.g).d(enxr.c(i.g, n.f)).doubleValue(), enxr.c(i.g, n.e).d(enxr.c(i.e, n.g)).doubleValue(), enxr.c(i.e, n.f).d(enxr.c(i.f, n.e)).doubleValue());
            if (!e(enyrVar3)) {
                double a = ermg.a(Math.abs(enyrVar3.e), Math.abs(enyrVar3.f), Math.abs(enyrVar3.g));
                enyrVar3 = new enyr(enyrVar3.e / a, enyrVar3.f / a, enyrVar3.g / a);
            }
            if (!enyrVar3.p(enyr.a) && e(enyrVar3)) {
                return emxc.j(enyrVar3);
            }
            return emux.a;
        } catch (ArithmeticException unused) {
            return emux.a;
        }
    }

    public static enyr b(enyr enyrVar, enyr enyrVar2) {
        Object c;
        enyr j = enyr.j(enyr.i(enyrVar2, enyrVar), enyr.n(enyrVar2, enyrVar));
        emxc j2 = j.e() < enxw.d * enxw.d ? emux.a : emxc.j(j);
        if (j2.g()) {
            return (enyr) j2.c();
        }
        if (enyrVar.p(enyrVar2)) {
            c = enxw.c(enyrVar);
        } else {
            emxc a = a(enyrVar, enyrVar2);
            if (a.g()) {
                c = a.c();
            } else {
                enxh a2 = new enxh(enyrVar).a(new enxh(enyrVar2));
                BigDecimal bigDecimal = a2.a;
                BigDecimal bigDecimal2 = a2.b;
                BigDecimal bigDecimal3 = a2.c;
                enyr enyrVar3 = new enyr(bigDecimal.doubleValue(), bigDecimal2.doubleValue(), bigDecimal3.doubleValue());
                if (!e(enyrVar3)) {
                    int i = -enzv.a(bigDecimal).scale();
                    int precision = enzv.a(bigDecimal).precision() - 1;
                    int i2 = -enzv.a(bigDecimal2).scale();
                    int precision2 = enzv.a(bigDecimal2).precision() - 1;
                    int i3 = -enzv.a(bigDecimal3).scale();
                    int precision3 = enzv.a(bigDecimal3).precision() - 1;
                    int max = bigDecimal.signum() != 0 ? Math.max(Integer.MIN_VALUE, i + precision) : Integer.MIN_VALUE;
                    if (bigDecimal2.signum() != 0) {
                        max = Math.max(max, i2 + precision2);
                    }
                    if (bigDecimal3.signum() != 0) {
                        max = Math.max(max, i3 + precision3);
                    }
                    if (max == Integer.MIN_VALUE) {
                        enyrVar3 = enyr.a;
                    } else {
                        int i4 = (-max) - 1;
                        enyrVar3 = new enyr(bigDecimal.scaleByPowerOfTen(i4).doubleValue(), bigDecimal2.scaleByPowerOfTen(i4).doubleValue(), bigDecimal3.scaleByPowerOfTen(i4).doubleValue());
                    }
                }
                emxc j3 = enyrVar3.p(enyr.a) ? emux.a : emxc.j(enyrVar3);
                c = j3.g() ? j3.c() : enyrVar.q(enyrVar2) ? d(c(enyrVar, enyrVar2)) : enyr.l(d(c(enyrVar2, enyrVar)));
            }
        }
        return (enyr) c;
    }

    static enyr c(enyr enyrVar, enyr enyrVar2) {
        double d = enyrVar2.e;
        if (d != eobe.a || enyrVar2.f != eobe.a) {
            return new enyr(-enyrVar2.f, d, eobe.a);
        }
        double d2 = enyrVar2.g;
        if (d2 == eobe.a) {
            double d3 = enyrVar.e;
            if (d3 != eobe.a || enyrVar.f != eobe.a) {
                return new enyr(enyrVar.f, -d3, eobe.a);
            }
            d2 = 1.0d;
        }
        return new enyr(d2, eobe.a, eobe.a);
    }

    private static enyr d(enyr enyrVar) {
        return e(enyrVar) ? enyrVar : enyr.k(enyrVar, Math.pow(2.0d, (-1) - Math.getExponent(ermg.a(Math.abs(enyrVar.e), Math.abs(enyrVar.f), Math.abs(enyrVar.g)))));
    }

    private static boolean e(enyr enyrVar) {
        return ermg.a(Math.abs(enyrVar.e), Math.abs(enyrVar.f), Math.abs(enyrVar.g)) >= Math.pow(2.0d, -242.0d);
    }
}
