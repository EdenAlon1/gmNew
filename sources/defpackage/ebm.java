package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebm {
    private static final ipn a;

    static {
        dxi dxiVar = dxu.a;
        int i = huo.a;
        a = new ebo(dxiVar, hum.m);
    }

    public static final ipn a(dxi dxiVar, hus husVar, hfd hfdVar, int i) {
        if (ffkj.e(dxiVar, dxu.a)) {
            int i2 = huo.a;
            if (ffkj.e(husVar, hum.m)) {
                hfdVar.v(-848964613);
                hfdVar.o();
                return a;
            }
        }
        hfdVar.v(-848913742);
        boolean z = ((((i & 14) ^ 6) > 4 && hfdVar.D(dxiVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && hfdVar.D(husVar)) || (i & 48) == 32);
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            f = new ebo(dxiVar, husVar);
            hfdVar.y(f);
        }
        ebo eboVar = (ebo) f;
        hfdVar.o();
        return eboVar;
    }

    public static final long b(boolean z, int i, int i2, int i3) {
        return !z ? jzl.d(i, i2, 0, i3) : jzj.b(i, i2, 0, i3);
    }
}
