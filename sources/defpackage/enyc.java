package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyc {
    public static enyl a(enyl enylVar) {
        if (enylVar.i()) {
            return enylVar;
        }
        double a = 3.141592653589793d - enylVar.b.a();
        enxo enxoVar = enylVar.a;
        double max = Math.max(eobe.a, a - 5.551115123125783E-16d);
        double max2 = Math.max(enxoVar.a, -enxoVar.b);
        enxo enxoVar2 = enylVar.a;
        double d = enxoVar2.a + 1.5707963267948966d;
        double d2 = 1.5707963267948966d - enxoVar2.b;
        if (max2 >= eobe.a) {
            if (max2 + max2 + max < 1.354E-15d) {
                return enyl.f();
            }
        } else if (max >= 1.5707963267948966d) {
            if (d + d2 < 1.687E-15d) {
                return enyl.f();
            }
        } else if (Math.max(d, d2) * max < 1.765E-15d) {
            return enyl.f();
        }
        return enylVar.e(new enyj(1.9984014443252818E-15d, max > eobe.a ? 0.0d : 3.141592653589793d)).g();
    }
}
