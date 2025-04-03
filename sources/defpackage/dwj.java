package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwj {
    public static final hkx a(dwn dwnVar, hfd hfdVar, int i) {
        Object f = hfdVar.f();
        if (f == hfc.a) {
            hic hicVar = new hic(false, hla.a);
            hfdVar.y(hicVar);
            f = hicVar;
        }
        hho hhoVar = (hho) f;
        boolean z = (((i & 14) ^ 6) > 4 && hfdVar.D(dwnVar)) || (i & 6) == 4;
        Object f2 = hfdVar.f();
        if (z || f2 == hfc.a) {
            f2 = new dwi(dwnVar, hhoVar, null);
            hfdVar.y(f2);
        }
        hgs.g(dwnVar, (ffjm) f2, hfdVar);
        return hhoVar;
    }
}
