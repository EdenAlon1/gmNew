package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxm {
    public static int a(enyr enyrVar, enyr enyrVar2, enyr enyrVar3) {
        double d;
        try {
            enxr c = enxr.c(enyrVar2.f, enyrVar3.g);
            enxr c2 = enxr.c(enyrVar2.g, enyrVar3.f);
            enxr c3 = enxr.c(enyrVar2.g, enyrVar3.e);
            enxr c4 = enxr.c(enyrVar2.e, enyrVar3.g);
            enxr c5 = enxr.c(enyrVar2.e, enyrVar3.f);
            enxr c6 = enxr.c(enyrVar2.f, enyrVar3.e);
            d = c.d(c2).b(enyrVar.e).a(c3.d(c4).b(enyrVar.f)).a(c5.d(c6).b(enyrVar.g)).a[r9.length - 1];
        } catch (ArithmeticException unused) {
        }
        if (d > eobe.a) {
            return 1;
        }
        return d < eobe.a ? -1 : 0;
    }

    public static double b(double d) {
        return Math.IEEEremainder(d, 6.283185307179586d);
    }
}
