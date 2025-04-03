package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywj implements ffjo {
    final /* synthetic */ cyxb a;
    final /* synthetic */ cvo b;
    final /* synthetic */ hho c;

    public cywj(cyxb cyxbVar, cvo cvoVar, hho hhoVar) {
        this.a = cyxbVar;
        this.b = cvoVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        hvi k;
        cqq cqqVar = (cqq) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        hfd hfdVar = (hfd) obj3;
        int intValue = ((Number) obj4).intValue() << 6;
        cqqVar.getClass();
        int i = intValue & 896;
        if (booleanValue) {
            hfdVar.v(719490536);
            czah.f(this.b, this.a.f, cqqVar, hfdVar, i | 64);
            hfdVar.o();
        } else {
            hfdVar.v(717997359);
            hvi a = jfw.a(hvi.e, "mini_cdp");
            hfdVar.v(2101377364);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar.y(f);
            }
            dwn dwnVar = (dwn) f;
            hfdVar.o();
            hfdVar.v(2101379683);
            boolean D = hfdVar.D(this.a);
            final cyxb cyxbVar = this.a;
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = new ffix() { // from class: cywh
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        cyxb.this.e.invoke();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            hvi c = dfb.c(a, dwnVar, null, false, null, null, (ffix) f2, 28);
            int i2 = this.a.h - 1;
            hvi i3 = eba.i(c, ((i2 == 1 || i2 == 3) ? 56.0f : 28.0f) + 8.0f, 0.0f, 2);
            cyxb cyxbVar2 = this.a;
            cvo cvoVar = this.b;
            final hho hhoVar = this.c;
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, i3);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hvi d = ebs.d(hvi.e, cyxbVar2.h + (-1) != 2 ? 0.85f : 0.7f);
            ipn a4 = dyo.a(dxu.e, hum.j, hfdVar, 54);
            int a5 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, d);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            cyvj cyvjVar = cyxbVar2.a;
            hfdVar.v(1351390838);
            if (cyxbVar2.g.b) {
                hve hveVar = hvi.e;
                hfdVar.v(1351393449);
                Object f3 = hfdVar.f();
                if (f3 == hfc.a) {
                    f3 = new ffji() { // from class: cywi
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj5) {
                            hho.this.b(Integer.valueOf((int) (((kaf) obj5).a & 4294967295L)));
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f3);
                }
                hfdVar.o();
                k = ebs.w(iqd.a(hveVar, (ffji) f3), 0.0f, 0.0f, 200.0f, 200.0f, 3);
            } else {
                k = ebs.k(hvi.e, 200.0f);
            }
            hfdVar.o();
            cyvm.a(cvoVar, cyvjVar, cqqVar, k, hfdVar, i);
            cyuv.b(cyxbVar2.b, cyxbVar2.e, hfdVar, 0);
            hfdVar.n();
            hfdVar.n();
            hfdVar.o();
        }
        return ffcu.a;
    }
}
