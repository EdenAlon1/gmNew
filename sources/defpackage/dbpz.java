package defpackage;

import androidx.compose.foundation.MarqueeModifierElement;
import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbpz implements ffjn {
    final /* synthetic */ long a;
    final /* synthetic */ String b;
    final /* synthetic */ List c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ Duration e;

    public dbpz(long j, String str, List list, ffjm ffjmVar, Duration duration) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = ffjmVar;
        this.e = duration;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
        hvi a2;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi a3 = eao.a(hvi.e, 1);
            long j = this.a;
            String str = this.b;
            List<ffcf> list = this.c;
            ffjm ffjmVar = this.d;
            Duration duration = this.e;
            dxi dxiVar = dxu.a;
            int i = huo.a;
            ipn a4 = ebm.a(dxiVar, hum.m, hfdVar, 0);
            int a5 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, a3);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            a = ebr.a.a(eba.f(hvi.e, 14.0f, 10.0f, 14.0f, 14.0f), 1.0f, true);
            ipn a6 = dyo.a(dxu.c, hum.j, hfdVar, 0);
            int a7 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, a);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a6, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a7))) {
                Integer valueOf2 = Integer.valueOf(a7);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar3);
            }
            hlc.b(hfdVar, b2, iss.c);
            dwjt.b(str, eba.j(hvi.e, 0.0f, 0.0f, 0.0f, 6.0f, 7).a(new MarqueeModifierElement(true != dhn.a(0) ? 0 : 1200, dho.a)), gft.a(hfdVar).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(hfdVar).h, hfdVar, 48, 3120, 55288);
            hfdVar.v(-1582663818);
            for (ffcf ffcfVar : list) {
                dbqa.d((String) ffcfVar.a, ffcfVar.b, hfdVar, 0);
            }
            hfdVar.o();
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
            a2 = dee.a(hvi.e, j, idb.a);
            hvi p = ebs.p(ebs.b(eba.d(a2, 4.0f), 1.0f), 94.0f, 100.0f);
            ipn a8 = dyc.a(hum.a, false);
            int a9 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b3 = huz.b(hfdVar, p);
            ffix ffixVar3 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar3);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a8, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a9))) {
                Integer valueOf3 = Integer.valueOf(a9);
                hfdVar.y(valueOf3);
                hfdVar.h(valueOf3, ffjmVar4);
            }
            hlc.b(hfdVar, b3, iss.c);
            dyi dyiVar = dyi.a;
            dwjt.b(dbqa.a(duration), dyiVar.a(hvi.e, hum.e), ibw.d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(gft.d(hfdVar).j, 0L, 0L, jsy.h, null, jsf.c, null, 0L, null, 0, 0, 0L, null, null, 0, 16777179), hfdVar, 384, 0, 65528);
            hfdVar.n();
            hfdVar.n();
        }
        return ffcu.a;
    }
}
