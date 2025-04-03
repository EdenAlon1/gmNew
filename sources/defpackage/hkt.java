package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hkt {
    public static final hik a = new hky(hkl.a);

    public static final ffxx a(ffix ffixVar) {
        return new fgcp(new hks(ffixVar, null));
    }

    public static final hkx b(ffxx ffxxVar, Object obj, ffhd ffhdVar, hfd hfdVar, int i) {
        if ((i & 2) != 0) {
            ffhdVar = (ffhd) hfdVar.e(a);
        }
        boolean F = hfdVar.F(ffhdVar) | hfdVar.F(ffxxVar);
        Object f = hfdVar.f();
        if (F || f == hfc.a) {
            f = new hkp(ffhdVar, ffxxVar, null);
            hfdVar.y(f);
        }
        ffjm ffjmVar = (ffjm) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            Object hicVar = new hic(obj, hla.a);
            hfdVar.y(hicVar);
            f2 = hicVar;
        }
        hho hhoVar = (hho) f2;
        boolean F2 = hfdVar.F(ffjmVar);
        Object f3 = hfdVar.f();
        if (F2 || f3 == hfc.a) {
            f3 = new hki(ffjmVar, hhoVar, null);
            hfdVar.y(f3);
        }
        hgs.f(ffxxVar, ffhdVar, (ffjm) f3, hfdVar);
        return hhoVar;
    }
}
