package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dost implements ffjm {
    final /* synthetic */ dosk a;
    final /* synthetic */ cxj b;
    final /* synthetic */ dnym c;

    public dost(dosk doskVar, cxj cxjVar, dnym dnymVar) {
        this.a = doskVar;
        this.b = cxjVar;
        this.c = dnymVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        long f;
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi a2 = hxo.a(ebs.w(hvi.e, 0.0f, 48.0f, 0.0f, 0.0f, 13), gft.c(hfdVar).c);
            dosk doskVar = this.a;
            cxj cxjVar = this.b;
            if (doskVar.d) {
                hve hveVar = hvi.e;
                hfdVar.v(1319568565);
                if (dooy.g(hfdVar)) {
                    hfdVar.v(2121773948);
                    j = dooy.a(hfdVar).d.c;
                    hfdVar.o();
                } else {
                    hfdVar.v(2121843233);
                    j = gft.a(hfdVar).H;
                    hfdVar.o();
                }
                hfdVar.o();
                f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), ((Number) cxjVar.d()).floatValue(), ibw.f(j));
                a = dee.a(hveVar, f, idb.a);
                a2 = a2.a(a);
            }
            ffix ffixVar = this.a.g;
            if (ffixVar != null) {
                a2 = a2.a(dfb.d(hvi.e, false, null, ffixVar, 7));
            }
            int i = huo.a;
            hus husVar = hum.n;
            dxn dxnVar = new dxn(12.0f, true, dxr.a);
            dnym dnymVar = this.c;
            dosk doskVar2 = this.a;
            ipn a3 = ebm.a(dxnVar, husVar, hfdVar, 54);
            int a4 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, a2);
            int i2 = ist.a;
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a3, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hfdVar.v(-319855636);
            if (dnymVar != null) {
                dnxw.j(dnymVar, jfw.a(ebs.k(hvi.e, doskVar2.f.a), "monogram_test_tag"), hfdVar, 0);
            }
            hfdVar.o();
            hve hveVar2 = hvi.e;
            ipn a5 = dyo.a(dxu.c, hum.j, hfdVar, 0);
            int a6 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, hveVar2);
            ffix ffixVar3 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar3);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a5, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            dosx.a(doskVar2.a, hfdVar, 0);
            String str = doskVar2.b;
            hfdVar.v(52028666);
            if (str != null) {
                dosv.d(str, hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
            hfdVar.n();
        }
        return ffcu.a;
    }
}
