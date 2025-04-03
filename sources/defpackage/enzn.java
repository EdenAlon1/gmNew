package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enzn {
    public static final enxv a;
    public static final enxv b;
    private static final double c;
    private static final enzl[] d;
    private static final enzm[] e;

    static {
        Math.sqrt(2.0d);
        double sqrt = Math.sqrt(2.0d);
        double d2 = (sqrt + sqrt) / 3.0d;
        c = d2;
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        d = new enzl[]{new enzc(), new enzd(), new enze(), new enzf(), new enzg(), new enzh()};
        e = new enzm[]{new enzi(), new enzj(), new enzk(), new enyz(), new enza(), new enzb()};
        a = new enxv(d2);
        b = new enxv(1.4592137463861061d);
        Math.sqrt(3.0d);
    }

    public static double a(int i, int i2) {
        return c((i & (-i2)) * 9.313225746154785E-10d);
    }

    public static double b(long j) {
        return j * 4.6566128730773926E-10d;
    }

    public static double c(double d2) {
        if (d2 >= 0.5d) {
            return (((4.0d * d2) * d2) - 1.0d) * 0.3333333333333333d;
        }
        double d3 = 1.0d - d2;
        return (1.0d - ((4.0d * d3) * d3)) * 0.3333333333333333d;
    }

    public static double d(double d2) {
        double d3 = d2 * 3.0d;
        return d2 >= eobe.a ? Math.sqrt(d3 + 1.0d) * 0.5d : 1.0d - (Math.sqrt(1.0d - d3) * 0.5d);
    }

    public static int e(double d2) {
        return Math.max(0, Math.min(1073741823, (int) Math.round((d2 * 1.073741824E9d) - 0.5d)));
    }

    public static int f(enyr enyrVar) {
        return g(enyrVar.e, enyrVar.f, enyrVar.g);
    }

    static int g(double d2, double d3, double d4) {
        int h = enyr.h(d2, d3, d4);
        return h != 0 ? h != 1 ? d4 < eobe.a ? 5 : 2 : d3 < eobe.a ? 4 : 1 : d2 < eobe.a ? 3 : 0;
    }

    public static enyr h(int i, long j, long j2) {
        return i(i, c(b(j)), c(b(j2)));
    }

    public static enyr i(int i, double d2, double d3) {
        enzm n = n(i);
        return new enyr(n.a(d2, d3), n.b(d2, d3), n.c(d2, d3));
    }

    public static enyr j(int i, enyr enyrVar) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new enyr(enyrVar.f, enyrVar.e, -enyrVar.g) : new enyr(-enyrVar.g, enyrVar.e, -enyrVar.f) : new enyr(-enyrVar.g, -enyrVar.f, -enyrVar.e) : new enyr(-enyrVar.e, -enyrVar.f, enyrVar.g) : new enyr(-enyrVar.e, enyrVar.g, enyrVar.f) : new enyr(enyrVar.f, enyrVar.g, enyrVar.e);
    }

    public static enyr k(int i, double d2) {
        double d3;
        double d4;
        double d5;
        if (i != 0) {
            if (i == 1) {
                d5 = d2;
                d4 = 0.0d;
            } else {
                if (i != 2) {
                    return i != 3 ? i != 4 ? new enyr(eobe.a, -1.0d, -d2) : new enyr(eobe.a, -d2, 1.0d) : new enyr(-d2, eobe.a, 1.0d);
                }
                d4 = d2;
                d5 = 0.0d;
            }
            d3 = 1.0d;
        } else {
            d3 = d2;
            d4 = 0.0d;
            d5 = -1.0d;
        }
        return new enyr(d3, d5, d4);
    }

    public static enyr l(int i, double d2) {
        double d3;
        double d4;
        double d5;
        if (i == 0) {
            return new enyr(-d2, eobe.a, 1.0d);
        }
        if (i == 1) {
            return new enyr(eobe.a, -d2, 1.0d);
        }
        if (i == 2) {
            return new enyr(eobe.a, -1.0d, -d2);
        }
        if (i != 3) {
            if (i != 4) {
                d4 = d2;
                d5 = 0.0d;
            } else {
                d5 = d2;
                d4 = 0.0d;
            }
            d3 = 1.0d;
        } else {
            d3 = d2;
            d4 = 0.0d;
            d5 = -1.0d;
        }
        return new enyr(d3, d5, d4);
    }

    public static enzl m(int i) {
        return d[i];
    }

    static enzm n(int i) {
        return e[Math.min(5, i)];
    }

    public static void o(int i, enyr enyrVar, enxq enxqVar) {
        enzl m = m(i);
        enxqVar.c(m.a(enyrVar.e, enyrVar.f, enyrVar.g), m.b(enyrVar.e, enyrVar.f, enyrVar.g));
    }
}
