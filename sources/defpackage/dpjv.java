package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpjv implements ffjn {
    final /* synthetic */ kfr a;
    final /* synthetic */ kfr b;
    final /* synthetic */ dplw c;

    public dpjv(kfr kfrVar, kfr kfrVar2, dplw dplwVar) {
        this.a = kfrVar;
        this.b = kfrVar2;
        this.c = dplwVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long f;
        hvi a;
        crw crwVar = (crw) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        crwVar.getClass();
        hfdVar.v(1187659191);
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = cxk.a(1.0f);
            hfdVar.y(f2);
        }
        cxj cxjVar = (cxj) f2;
        hfdVar.o();
        hfdVar.v(1187660857);
        Object f3 = hfdVar.f();
        if (f3 == hfc.a) {
            f3 = cxk.a(0.5f);
            hfdVar.y(f3);
        }
        cxj cxjVar2 = (cxj) f3;
        hfdVar.o();
        hvi c = ebs.c(hvi.e, 0.87f);
        kfr kfrVar = this.a;
        hfdVar.v(1187665737);
        Object f4 = hfdVar.f();
        if (f4 == hfc.a) {
            f4 = dpjs.a;
            hfdVar.y(f4);
        }
        hfdVar.o();
        hvi a2 = hvr.a(kgc.d(c, kfrVar, (ffji) f4), 0.0f);
        int i = huo.a;
        ipn a3 = dyc.a(hum.a, false);
        int a4 = hey.a(hfdVar);
        hgb c2 = hfdVar.c();
        hvi b = huz.b(hfdVar, a2);
        int i2 = ist.a;
        ffix ffixVar = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a3, iss.e);
        hlc.b(hfdVar, c2, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
            Object valueOf = Integer.valueOf(a4);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        hlc.b(hfdVar, b, iss.c);
        dyi dyiVar = dyi.a;
        hvi c3 = ebs.c(hvi.e, 0.87f);
        float floatValue = ((Number) cxjVar.d()).floatValue();
        hvi a5 = hxo.a(dyiVar.a(hya.a(c3, floatValue, floatValue), hum.e), eqm.a);
        f = iby.f(ibw.d(r12), ibw.c(r12), ibw.b(r12), ((Number) cxjVar2.d()).floatValue(), ibw.f(gft.a(hfdVar).f));
        a = dee.a(a5, f, idb.a);
        dyc.b(a, hfdVar, 0);
        hfdVar.n();
        hfdVar.v(1187682807);
        Object f5 = hfdVar.f();
        if (f5 == hfc.a) {
            f5 = cxk.a(0.0f);
            hfdVar.y(f5);
        }
        cxj cxjVar3 = (cxj) f5;
        hfdVar.o();
        hfdVar.v(1187684535);
        Object f6 = hfdVar.f();
        if (f6 == hfc.a) {
            f6 = cxk.a(0.0f);
            hfdVar.y(f6);
        }
        cxj cxjVar4 = (cxj) f6;
        hfdVar.o();
        hfdVar.v(1187687351);
        boolean F = hfdVar.F(cxjVar3);
        Object f7 = hfdVar.f();
        if (F || f7 == hfc.a) {
            f7 = new dpjt(cxjVar3);
            hfdVar.y(f7);
        }
        ffix ffixVar2 = (ffix) f7;
        hfdVar.o();
        kfr kfrVar2 = this.b;
        hve hveVar = hvi.e;
        hfdVar.v(1187690921);
        Object f8 = hfdVar.f();
        if (f8 == hfc.a) {
            f8 = dpju.a;
            hfdVar.y(f8);
        }
        hfdVar.o();
        dpmu.a(ffixVar2, hvr.a(crwVar.b(hxz.a(kgc.d(hveVar, kfrVar2, (ffji) f8), ((Number) cxjVar4.d()).floatValue()), ctt.l(null, 3), ctt.o(null, 0.0f, 0L, 7).a(ctt.m(null, 3))), 1.0f), iby.d(4293153105L), iby.d(4294225516L), hfdVar, 28032);
        dpkz.d(cxjVar3, this.c.a(), cxjVar, cxjVar2, cxjVar4, hfdVar, 37384);
        return ffcu.a;
    }
}
