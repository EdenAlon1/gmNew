package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywk implements ffjn {
    final /* synthetic */ cyxb a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;

    public cywk(cyxb cyxbVar, hho hhoVar, hho hhoVar2) {
        this.a = cyxbVar;
        this.b = hhoVar;
        this.c = hhoVar2;
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
            Boolean bool = (Boolean) this.b.a();
            bool.booleanValue();
            hfdVar.v(1127153979);
            boolean D = hfdVar.D(this.a);
            final cyxb cyxbVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffji() { // from class: cywf
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        ((cqw) obj4).getClass();
                        if (!cyxb.this.g.a) {
                            cyh cyhVar = cyvr.a;
                            return new csi(ctt.l(cxu.c(500, 0, cyvr.b, 2), 2), ctt.m(cxu.c(500, 0, cyvr.b, 2), 2));
                        }
                        csi csiVar = new csi(ctt.l(null, 3), ctt.m(null, 3));
                        csiVar.d = cqn.c(new ffjm() { // from class: cywg
                            @Override // defpackage.ffjm
                            public final Object a(Object obj5, Object obj6) {
                                final kaf kafVar = (kaf) obj6;
                                return cxu.a(new ffji() { // from class: cywe
                                    @Override // defpackage.ffji
                                    public final Object invoke(Object obj7) {
                                        czn cznVar = (czn) obj7;
                                        cznVar.getClass();
                                        long j = kaf.this.a >> 32;
                                        cznVar.a(new kaf((((int) (r0 & 4294967295L)) & 4294967295L) | (((int) j) << 32)), 0);
                                        cznVar.a = 350;
                                        return ffcu.a;
                                    }
                                });
                            }
                        }, 1);
                        return csiVar;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            cqn.a(bool, null, (ffji) f, null, "photoSelectorTransitionInMiniCdp", null, hpx.d(1125085216, new cywj(this.a, cvoVar, this.c), hfdVar), hfdVar, 1597440, 42);
        }
        return ffcu.a;
    }
}
