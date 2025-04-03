package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbo implements ffjn {
    final /* synthetic */ hho a;
    final /* synthetic */ czbe b;
    final /* synthetic */ hkx c;

    public czbo(hho hhoVar, czbe czbeVar, hkx hkxVar) {
        this.a = hhoVar;
        this.b = czbeVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvo cvoVar = (cvo) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        cvoVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(cvoVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hho hhoVar = this.a;
            hik hikVar = czbr.a;
            Boolean bool = (Boolean) hhoVar.a();
            bool.booleanValue();
            hfdVar.v(-1422437037);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffji() { // from class: czbm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        ((cqw) obj4).getClass();
                        cyh cyhVar = czak.a;
                        return new csi(ctt.l(cxu.c(500, 0, czak.a, 2), 2), ctt.m(cxu.c(500, 0, czak.b, 2), 2));
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            cqn.a(bool, null, (ffji) f, null, "photoSelectorTransition", null, hpx.d(-1857489894, new czbn(cvoVar, this.b, this.c), hfdVar), hfdVar, 1597824, 42);
        }
        return ffcu.a;
    }
}
