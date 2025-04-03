package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czk {
    public static final hkx a(czg czgVar, float f, float f2, cyz cyzVar, hfd hfdVar) {
        return c(czgVar, Float.valueOf(f), Float.valueOf(f2), dcp.a, cyzVar, hfdVar, 33208);
    }

    public static final czg b(hfd hfdVar) {
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new czg();
            hfdVar.y(f);
        }
        czg czgVar = (czg) f;
        czgVar.a(hfdVar, 0);
        return czgVar;
    }

    public static final hkx c(czg czgVar, Object obj, Object obj2, dbv dbvVar, cyz cyzVar, hfd hfdVar, int i) {
        czg czgVar2;
        Object obj3;
        Object obj4;
        cyz cyzVar2;
        Object f = hfdVar.f();
        if (f == hfc.a) {
            czgVar2 = czgVar;
            obj3 = obj;
            obj4 = obj2;
            cyzVar2 = cyzVar;
            cza czaVar = new cza(czgVar2, obj3, obj4, dbvVar, cyzVar2);
            hfdVar.y(czaVar);
            f = czaVar;
        } else {
            czgVar2 = czgVar;
            obj3 = obj;
            obj4 = obj2;
            cyzVar2 = cyzVar;
        }
        cza czaVar2 = (cza) f;
        boolean z = true;
        if ((((i & 112) ^ 48) <= 32 || !hfdVar.F(obj3)) && (i & 48) != 32) {
            z = false;
        }
        boolean F = hfdVar.F(cyzVar2) | z;
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new czh(obj3, czaVar2, obj4, cyzVar2);
            hfdVar.y(f2);
        }
        hgs.i((ffix) f2, hfdVar);
        boolean F2 = hfdVar.F(czgVar2);
        Object f3 = hfdVar.f();
        if (F2 || f3 == hfc.a) {
            f3 = new czj(czgVar2, czaVar2);
            hfdVar.y(f3);
        }
        hgs.c(czaVar2, (ffji) f3, hfdVar);
        return czaVar2;
    }
}
