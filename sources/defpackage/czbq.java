package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbq implements ffjn {
    final /* synthetic */ czal a;
    final /* synthetic */ dji b;
    final /* synthetic */ cvo c;
    final /* synthetic */ czbe d;
    final /* synthetic */ crw e;
    final /* synthetic */ czbd f;
    final /* synthetic */ float g;

    public czbq(czal czalVar, dji djiVar, cvo cvoVar, czbe czbeVar, crw crwVar, czbd czbdVar, float f) {
        this.a = czalVar;
        this.b = djiVar;
        this.c = cvoVar;
        this.d = czbeVar;
        this.e = crwVar;
        this.f = czbdVar;
        this.g = f;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
        hvi c;
        hvi c2;
        ebe ebeVar = (ebe) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ebeVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebeVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            a = dee.a(hvi.e, gft.a(hfdVar).F, idb.a);
            c = ebs.c(a, 1.0f);
            hvi c3 = eba.c(c, ebeVar);
            dji djiVar = this.b;
            cvo cvoVar = this.c;
            czbe czbeVar = this.d;
            crw crwVar = this.e;
            czbd czbdVar = this.f;
            float f = this.g;
            int i = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(hfdVar);
            hgb c4 = hfdVar.c();
            hvi b = huz.b(hfdVar, c3);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c4, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            c2 = dix.c(hvi.e, djiVar, false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            hvi a4 = jfw.a(eba.j(c2, 16.0f, 0.0f, 16.0f, 0.0f, 10), "conversation_details_scroller");
            ipn a5 = dyo.a(dxnVar, hum.j, hfdVar, 0);
            int a6 = hey.a(hfdVar);
            hgb c5 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, a4);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a5, iss.e);
            hlc.b(hfdVar, c5, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            cysv.d(cvoVar, czbeVar.b, crwVar, czbdVar.a ? 1.0f - f : 1.0f, hfdVar, 0);
            czbr.d(czbeVar, hfdVar, 0);
            hfdVar.v(1169509497);
            if (atiz.a()) {
                ebv.a(ecs.b(hvi.e), hfdVar);
            }
            hfdVar.o();
            hfdVar.n();
            hfdVar.n();
            czal czalVar = this.a;
            hfdVar.v(1001164955);
            czbe czbeVar2 = czalVar.a;
            if (czbeVar2.k.c) {
                cywo.a(czbeVar2.j, hfdVar, 0);
            }
            hfdVar.o();
            doau doauVar = (doau) hkf.a(czalVar.b, hfdVar).a();
            hfdVar.v(1001172886);
            if (doauVar != null) {
                if (doauVar instanceof dmvt) {
                    hfdVar.v(1169524104);
                    dmva.a((dmvt) doauVar, null, hfdVar, 0);
                    hfdVar.o();
                } else if (doauVar instanceof dmfn) {
                    hfdVar.v(1169525905);
                    abes.b((dmfn) doauVar, null, hfdVar, 0);
                    hfdVar.o();
                } else if (doauVar instanceof abgs) {
                    hfdVar.v(1169528700);
                    ((abgs) doauVar).a.a(hfdVar, 0);
                    hfdVar.o();
                } else if (doauVar instanceof dpld) {
                    hfdVar.v(1169531106);
                    ((dpla) hfdVar.e(czbr.a)).a((dpld) doauVar, hfdVar);
                    hfdVar.o();
                } else {
                    hfdVar.v(1895750255);
                    hfdVar.o();
                }
            }
            hfdVar.o();
        }
        return ffcu.a;
    }
}
