package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hkk {
    public static final hkx a(Object obj, ffjm ffjmVar, hfd hfdVar) {
        Object f = hfdVar.f();
        if (f == hfc.a) {
            hic hicVar = new hic(obj, hla.a);
            hfdVar.y(hicVar);
            f = hicVar;
        }
        hho hhoVar = (hho) f;
        ffcu ffcuVar = ffcu.a;
        boolean F = hfdVar.F(ffjmVar);
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new hkh(ffjmVar, hhoVar, null);
            hfdVar.y(f2);
        }
        hgs.g(ffcuVar, (ffjm) f2, hfdVar);
        return hhoVar;
    }
}
