package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czac implements ffjn {
    final /* synthetic */ float a;
    final /* synthetic */ hkx b;
    final /* synthetic */ czai c;
    final /* synthetic */ eot d;

    public czac(float f, hkx hkxVar, czai czaiVar, eot eotVar) {
        this.a = f;
        this.b = hkxVar;
        this.c = czaiVar;
        this.d = eotVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        long f;
        hvi a;
        hfd hfdVar;
        hfd hfdVar2 = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        dxq dxqVar = dxu.d;
        int i = huo.a;
        hun hunVar = hum.k;
        c = ebs.c(hvi.e, 1.0f);
        hvi a2 = hxe.a(c, this.a * czah.a(this.b));
        ipn a3 = dyo.a(dxqVar, hunVar, hfdVar2, 54);
        int a4 = hey.a(hfdVar2);
        hgb c2 = hfdVar2.c();
        hvi b = huz.b(hfdVar2, a2);
        int i2 = ist.a;
        ffix ffixVar = iss.a;
        hfdVar2.M();
        hfdVar2.x();
        if (hfdVar2.H()) {
            hfdVar2.j(ffixVar);
        } else {
            hfdVar2.z();
        }
        hlc.b(hfdVar2, a3, iss.e);
        hlc.b(hfdVar2, c2, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar2.H() || !ffkj.e(hfdVar2.f(), Integer.valueOf(a4))) {
            Integer valueOf = Integer.valueOf(a4);
            hfdVar2.y(valueOf);
            hfdVar2.h(valueOf, ffjmVar);
        }
        hlc.b(hfdVar2, b, iss.c);
        ebv.a(ebs.e(hvi.e, 50.0f), hfdVar2);
        hvi a5 = hxo.a(ebs.A(ebs.y(hvi.e)), eqm.b(35.0f));
        f = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.5f, ibw.f(ibw.b));
        a = dee.a(a5, f, idb.a);
        hvi a6 = dys.a(a, hum.k);
        ipn a7 = ebm.a(dxu.e, hum.m, hfdVar2, 6);
        int a8 = hey.a(hfdVar2);
        hgb c3 = hfdVar2.c();
        hvi b2 = huz.b(hfdVar2, a6);
        ffix ffixVar2 = iss.a;
        hfdVar2.M();
        hfdVar2.x();
        if (hfdVar2.H()) {
            hfdVar2.j(ffixVar2);
        } else {
            hfdVar2.z();
        }
        hlc.b(hfdVar2, a7, iss.e);
        hlc.b(hfdVar2, c3, iss.d);
        ffjm ffjmVar2 = iss.f;
        if (hfdVar2.H() || !ffkj.e(hfdVar2.f(), Integer.valueOf(a8))) {
            Integer valueOf2 = Integer.valueOf(a8);
            hfdVar2.y(valueOf2);
            hfdVar2.h(valueOf2, ffjmVar2);
        }
        eot eotVar = this.d;
        final czai czaiVar = this.c;
        hlc.b(hfdVar2, b2, iss.c);
        czah.d(eotVar, true, hfdVar2, 48, 0);
        hfdVar2.n();
        ebv.a(ebs.e(hvi.e, 50.0f), hfdVar2);
        dwjt.b(czaiVar.c, null, ibw.d, 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, gft.d(hfdVar2).g, hfdVar2, 384, 3072, 57338);
        hfdVar2.v(1517417882);
        String str = czaiVar.e;
        if (str == null) {
            hfdVar = hfdVar2;
        } else {
            hve hveVar = hvi.e;
            hfdVar2.v(-619168786);
            boolean F = hfdVar2.F(czaiVar);
            Object f2 = hfdVar2.f();
            if (F || f2 == hfc.a) {
                f2 = new ffix() { // from class: czab
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix ffixVar3 = czai.this.f;
                        if (ffixVar3 != null) {
                            ffixVar3.invoke();
                        }
                        return ffcu.a;
                    }
                };
                hfdVar2.y(f2);
            }
            hfdVar2.o();
            hvi d = dfb.d(hveVar, false, null, (ffix) f2, 7);
            ipn a9 = dyc.a(hum.a, false);
            int a10 = hey.a(hfdVar2);
            hgb c4 = hfdVar2.c();
            hvi b3 = huz.b(hfdVar2, d);
            ffix ffixVar3 = iss.a;
            hfdVar2.M();
            hfdVar2.x();
            if (hfdVar2.H()) {
                hfdVar2.j(ffixVar3);
            } else {
                hfdVar2.z();
            }
            hlc.b(hfdVar2, a9, iss.e);
            hlc.b(hfdVar2, c4, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfdVar2.H() || !ffkj.e(hfdVar2.f(), Integer.valueOf(a10))) {
                Integer valueOf3 = Integer.valueOf(a10);
                hfdVar2.y(valueOf3);
                hfdVar2.h(valueOf3, ffjmVar3);
            }
            hlc.b(hfdVar2, b3, iss.c);
            hfdVar = hfdVar2;
            dwjt.b(str, null, gft.a(hfdVar2).f, 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, gft.d(hfdVar2).i, hfdVar, 0, 3072, 57338);
            hfdVar.n();
        }
        hfdVar.o();
        hfdVar.n();
        return ffcu.a;
    }
}
