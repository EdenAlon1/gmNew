package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmit implements ffjm {
    final /* synthetic */ dmiy a;

    public dmit(dmiy dmiyVar) {
        this.a = dmiyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        dmiy dmiyVar;
        float f;
        hvi d;
        long j;
        long j2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmiy dmiyVar2 = this.a;
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
            dmiw dmiwVar = dmiyVar2.a;
            if (dmiwVar != null) {
                hfdVar.v(1134041977);
                hvi d2 = eba.d(hvi.e, 16.0f);
                ipn a3 = ebm.a(dxu.a, hum.n, hfdVar, 48);
                int a4 = hey.a(hfdVar);
                hgb c2 = hfdVar.c();
                hvi b2 = huz.b(hfdVar, d2);
                ffix ffixVar2 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar2);
                } else {
                    hfdVar.z();
                }
                hlc.b(hfdVar, a3, iss.e);
                hlc.b(hfdVar, c2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    hfdVar.y(valueOf2);
                    hfdVar.h(valueOf2, ffjmVar2);
                }
                hlc.b(hfdVar, b2, iss.c);
                hfdVar.v(1862060751);
                hfdVar.o();
                String str = dmiwVar.a;
                jpo jpoVar = gft.d(hfdVar).g;
                hfdVar.v(-1353650306);
                if (dmiyVar2.c) {
                    hfdVar.v(1769701216);
                    j2 = gft.a(hfdVar).w;
                    hfdVar.o();
                } else {
                    hfdVar.v(1769747902);
                    j2 = gft.a(hfdVar).a;
                    hfdVar.o();
                }
                hfdVar.o();
                dmiyVar = dmiyVar2;
                dwjt.b(str, null, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpoVar, hfdVar, 0, 0, 65530);
                hfdVar = hfdVar;
                hfdVar.n();
                hfdVar.o();
                f = 12.0f;
            } else {
                dmiyVar = dmiyVar2;
                hfdVar.v(1134681476);
                f = 12.0f;
                ebv.a(ebs.e(hvi.e, 12.0f), hfdVar);
                hfdVar.o();
            }
            hfdVar.v(1976268176);
            dmiy dmiyVar3 = dmiyVar;
            Iterator it = dmiyVar3.b.iterator();
            while (it.hasNext()) {
                dnds.a((dnhh) it.next(), null, hfdVar, 0, 2);
            }
            hfdVar.o();
            d = ebs.d(hvi.e, 1.0f);
            hvi i3 = eba.i(d, 16.0f, 0.0f, 2);
            ipn a5 = ebm.a(dxu.b, hum.m, hfdVar, 6);
            int a6 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b3 = huz.b(hfdVar, i3);
            ffix ffixVar3 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar3);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a5, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a6))) {
                Integer valueOf3 = Integer.valueOf(a6);
                hfdVar.y(valueOf3);
                hfdVar.h(valueOf3, ffjmVar3);
            }
            hlc.b(hfdVar, b3, iss.c);
            dmiq dmiqVar = dmiyVar3.d;
            hfdVar.v(1862086017);
            if (dmiqVar != null) {
                long b4 = dmiv.b(hfdVar);
                hfdVar.v(-964422446);
                if (dmiyVar3.c) {
                    hfdVar.v(-308250864);
                    j = gft.a(hfdVar).w;
                    hfdVar.o();
                } else {
                    hfdVar.v(-308204178);
                    j = gft.a(hfdVar).a;
                    hfdVar.o();
                }
                hfdVar.o();
                dmiv.a(dmiqVar, b4, j, hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.v(1862090366);
            hfdVar.o();
            hfdVar.n();
            ebv.a(ebs.e(hvi.e, f), hfdVar);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
