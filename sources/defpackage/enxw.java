package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxw {
    public static final double a = 1.0d / Math.sqrt(2.0d);
    public static final double b = Math.sqrt(2.0d);
    public static final enxs c;
    public static final double d;
    public static final enyr e;
    private static final int[] f;
    private static final int[][] g;
    private static final enyr[] h;

    static {
        double sqrt = Math.sqrt(3.0d);
        enxs enxsVar = new enxs(8.881784197001252E-16d);
        c = enxsVar;
        d = ((32.0d * sqrt) * 1.1102230246251565E-16d) / ((enxsVar.c / 1.1102230246251565E-16d) - ((sqrt + sqrt) + 1.0d));
        e = new enyr(-0.00999946643502502d, 0.002592454260932412d, 0.999946643502502d);
        f = new int[]{1, 0, 0, 3};
        g = new int[][]{new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};
        h = new enyr[]{new enyr(1.0d, 0.0053d, 0.00457d), new enyr(0.012d, 1.0d, 0.00457d), new enyr(0.012d, 0.0053d, 1.0d)};
    }

    public static int a(int i, int i2) {
        return g[i][i2];
    }

    public static int b(int i) {
        boolean z = false;
        if (i >= 0 && i < 4) {
            z = true;
        }
        emxf.a(z);
        return f[i];
    }

    public static enyr c(enyr enyrVar) {
        int h2 = enyr.h(enyrVar.e, enyrVar.f, enyrVar.g) - 1;
        if (h2 < 0) {
            h2 = 2;
        }
        return enyr.m(enyr.j(enyrVar, h[h2]));
    }

    public static boolean d(enyr enyrVar) {
        return Math.abs(enyrVar.e() + (-1.0d)) <= 1.1102230246251565E-15d;
    }
}
