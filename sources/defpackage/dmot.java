package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmot implements ffjn {
    final /* synthetic */ dmov a;
    final /* synthetic */ ffix b;

    public dmot(dmov dmovVar, ffix ffixVar) {
        this.a = dmovVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            final dmov dmovVar = this.a;
            final ffix ffixVar = this.b;
            final int i = 0;
            for (Object obj4 : dmovVar.a) {
                int i2 = i + 1;
                if (i < 0) {
                    ffdx.l();
                }
                final dmog dmogVar = (dmog) obj4;
                hve hveVar = hvi.e;
                hfdVar.v(1717254046);
                boolean D = hfdVar.D(dmovVar) | hfdVar.D(dmogVar) | hfdVar.D(ffixVar);
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dmor
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dmov.this.c.invoke(dmogVar);
                            ffixVar.invoke();
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                hvi d = dfb.d(hveVar, false, null, (ffix) f, 7);
                hfdVar.v(1717258796);
                boolean D2 = hfdVar.D(dmovVar) | hfdVar.B(i);
                Object f2 = hfdVar.f();
                if (D2 || f2 == hfc.a) {
                    f2 = new ffji() { // from class: dmos
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj5) {
                            jkv jkvVar = (jkv) obj5;
                            jkvVar.getClass();
                            Integer num = dmov.this.b;
                            boolean z = false;
                            if (num != null) {
                                if (num.intValue() == i) {
                                    z = true;
                                }
                            }
                            jkr.r(jkvVar, z);
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f2);
                }
                hfdVar.o();
                hvi c = jjs.c(d, true, (ffji) f2);
                int i3 = huo.a;
                ipn a = ebm.a(dxu.a, hum.n, hfdVar, 48);
                int a2 = hey.a(hfdVar);
                hgb c2 = hfdVar.c();
                hvi b = huz.b(hfdVar, c);
                int i4 = ist.a;
                ffix ffixVar2 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar2);
                } else {
                    hfdVar.z();
                }
                hlc.b(hfdVar, a, iss.e);
                hlc.b(hfdVar, c2, iss.d);
                ffjm ffjmVar = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    hfdVar.y(valueOf);
                    hfdVar.h(valueOf, ffjmVar);
                }
                hlc.b(hfdVar, b, iss.c);
                dmou.g(dmogVar.c, dmogVar.a, dmogVar.b, hfdVar, 0);
                hfdVar.n();
                hfdVar.v(-970786969);
                if (i != ffdx.e(dmovVar.a)) {
                    dwgw.a(eba.i(hvi.e, 0.0f, 8.0f, 1), 0.0f, 0L, hfdVar, 6, 6);
                }
                hfdVar.o();
                i = i2;
            }
        }
        return ffcu.a;
    }
}
