package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnyg implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffjn b;

    public dnyg(boolean z, ffjn ffjnVar) {
        this.a = z;
        this.b = ffjnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            if (this.a) {
                hfdVar.v(-555862451);
                final float em = ((jzn) hfdVar.e(jdr.e)).em(dynVar.c()) * 0.07f;
                hfdVar.v(-156474590);
                boolean A = hfdVar.A(em);
                Object f = hfdVar.f();
                if (A || f == hfc.a) {
                    ifv ifvVar = new ifv(em, 0.0f, 0, 0, 30);
                    hfdVar.y(ifvVar);
                    f = ifvVar;
                }
                final ifv ifvVar2 = (ifv) f;
                hfdVar.o();
                hve hveVar = hvi.e;
                hfdVar.v(-156471600);
                boolean A2 = hfdVar.A(em) | hfdVar.F(ifvVar2);
                Object f2 = hfdVar.f();
                if (A2 || f2 == hfc.a) {
                    f2 = new ffji() { // from class: dnye
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj4) {
                            ifo ifoVar = (ifo) obj4;
                            ifoVar.getClass();
                            ifoVar.p();
                            long j = ibw.a;
                            float b = iar.b(ifoVar.b()) / 2.0f;
                            ifq.e(ifoVar, j, b - (em / 2.0f), ias.b(ifoVar.b()), ifvVar2, 0, 40);
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f2);
                }
                hfdVar.o();
                hvi c2 = hxs.c(hveVar, (ffji) f2);
                hfdVar.v(-156462670);
                Object f3 = hfdVar.f();
                if (f3 == hfc.a) {
                    f3 = new ffji() { // from class: dnyf
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj4) {
                            idd iddVar = (idd) obj4;
                            iddVar.getClass();
                            iddVar.r(true);
                            iddVar.A(eqm.a);
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f3);
                }
                hfdVar.o();
                c = icf.a(c2, (ffji) f3);
                hfdVar.o();
            } else {
                hfdVar.v(-555289447);
                c = dek.c(hvi.e, dynVar.c() * 0.07f, gft.a(hfdVar).n, eqm.a);
                hfdVar.o();
            }
            hvi d = eba.d(ebs.h(hvi.e, dynVar.c()).a(c), 1.0f);
            ffjn ffjnVar = this.b;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
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
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjnVar.a(dyi.a, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
