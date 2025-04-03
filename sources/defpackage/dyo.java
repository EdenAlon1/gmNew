package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyo {
    public static final /* synthetic */ int a = 0;
    private static final ipn b;

    static {
        dxq dxqVar = dxu.c;
        int i = huo.a;
        b = new dyq(dxqVar, hum.j);
    }

    public static final ipn a(dxq dxqVar, hun hunVar, hfd hfdVar, int i) {
        if (ffkj.e(dxqVar, dxu.c)) {
            int i2 = huo.a;
            if (ffkj.e(hunVar, hum.j)) {
                hfdVar.v(346089448);
                hfdVar.o();
                return b;
            }
        }
        hfdVar.v(346143295);
        boolean z = ((((i & 14) ^ 6) > 4 && hfdVar.D(dxqVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && hfdVar.D(hunVar)) || (i & 48) == 32);
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            f = new dyq(dxqVar, hunVar);
            hfdVar.y(f);
        }
        dyq dyqVar = (dyq) f;
        hfdVar.o();
        return dyqVar;
    }
}
