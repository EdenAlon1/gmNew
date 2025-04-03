package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbfd implements ffjm {
    final /* synthetic */ dbfg a;

    public dbfd(dbfg dbfgVar) {
        this.a = dbfgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbfg dbfgVar = this.a;
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hveVar);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            Object[] objArr = new Object[0];
            hfdVar.v(-988013462);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: dbfb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return new hic(0, hla.a);
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            hho hhoVar = (hho) hqr.c(objArr, null, (ffix) f, hfdVar, 3072, 6);
            dbfgVar.b(hfdVar, 0);
            int intValue = ((Number) hhoVar.a()).intValue();
            hpn d = hpx.d(-1618563651, new dbfc(dbfgVar, hhoVar), hfdVar);
            d.getClass();
            hfdVar.v(-134691479);
            gqo.d(intValue, hvi.e, dwji.a(hfdVar), dwji.b(hfdVar), hpx.d(1527850756, new dwjl(intValue), hfdVar), dwgl.a, d, hfdVar, 1572864);
            hfdVar.o();
            ((dbhe) dbfgVar.c.get(((Number) hhoVar.a()).intValue())).d(hfdVar);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
