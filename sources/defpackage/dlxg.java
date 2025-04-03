package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxg implements ffjm {
    final /* synthetic */ dlvq a;

    public dlxg(dlvq dlvqVar) {
        this.a = dlvqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi a = hvr.a(hvi.e, 1.0f);
            dlvq dlvqVar = this.a;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, a);
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
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dlvp b2 = dlvqVar.b();
            hfdVar.v(-1370651257);
            if (b2 != null) {
                hve hveVar = hvi.e;
                hfdVar.v(-262992670);
                doui douiVar = b2.a;
                float f = 12.0f;
                if ((douiVar instanceof douf) && ((douf) douiVar).b) {
                    f = 16.0f;
                }
                hfdVar.o();
                hvi j2 = eba.j(hveVar, 16.0f, f, 16.0f, 0.0f, 8);
                ipn a4 = dyc.a(hum.a, false);
                int a5 = hey.a(hfdVar);
                hgb c2 = hfdVar.c();
                hvi b3 = huz.b(hfdVar, j2);
                ffix ffixVar2 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar2);
                } else {
                    hfdVar.z();
                }
                hlc.b(hfdVar, a4, iss.e);
                hlc.b(hfdVar, c2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                    Integer valueOf2 = Integer.valueOf(a5);
                    hfdVar.y(valueOf2);
                    hfdVar.h(valueOf2, ffjmVar2);
                }
                hlc.b(hfdVar, b3, iss.c);
                doui douiVar2 = b2.a;
                doue doueVar = b2.b;
                hfdVar.v(646348605);
                hfdVar.v(968752636);
                boolean z = dooy.f(hfdVar) && dlvqVar.d() != null;
                hfdVar.o();
                if (z) {
                    hfdVar.v(968754883);
                    j = gft.a(hfdVar).v;
                    hfdVar.o();
                } else {
                    hfdVar.v(968755576);
                    boolean z2 = dooy.f(hfdVar) && dlvqVar.f();
                    hfdVar.o();
                    if (z2) {
                        j = ibw.a;
                    } else {
                        hfdVar.v(968757411);
                        boolean z3 = dooy.f(hfdVar) && dlvqVar.h() && dlvqVar.g();
                        hfdVar.o();
                        if (z3) {
                            j = ibw.d;
                        } else {
                            hfdVar.v(968759573);
                            boolean z4 = dooy.f(hfdVar) && dlvqVar.g();
                            hfdVar.o();
                            if (z4) {
                                j = ibw.a;
                            } else {
                                hfdVar.v(968762364);
                                j = gft.a(hfdVar).q;
                                hfdVar.o();
                            }
                        }
                    }
                }
                hfdVar.o();
                doud.b(douiVar2, doueVar, null, new ibw(j), hfdVar, 0, 4);
                hfdVar.n();
            }
            hfdVar.o();
            if (dlvqVar instanceof dlvl) {
                hfdVar.v(-1370631331);
                douq.a(hpx.d(-1654508758, new dlxd(dlvqVar), hfdVar), hfdVar, 6);
                hfdVar.o();
            } else if (dlvqVar instanceof dlve) {
                hfdVar.v(-1370627164);
                dlxp.a(hfdVar, 0);
                hfdVar.o();
            } else if (dlvqVar instanceof dlvn) {
                hfdVar.v(-1370623908);
                douq.a(hpx.d(-314928222, new dlxe(dlvqVar), hfdVar), hfdVar, 6);
                hfdVar.o();
            } else {
                if (!(dlvqVar instanceof dlvj)) {
                    hfdVar.v(-1370633599);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(-1370620717);
                douq.a(hpx.d(44486115, new dlxf(dlvqVar), hfdVar), hfdVar, 6);
                hfdVar.o();
            }
            hfdVar.n();
        }
        return ffcu.a;
    }
}
