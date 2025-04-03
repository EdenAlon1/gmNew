package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dojn implements ffjn {
    final /* synthetic */ hvi a;
    final /* synthetic */ dji b;
    final /* synthetic */ dojh c;

    public dojn(hvi hviVar, dji djiVar, dojh dojhVar) {
        this.a = hviVar;
        this.b = djiVar;
        this.c = dojhVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hvi c;
        List list = (List) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        list.getClass();
        d = ebs.d(this.a, 1.0f);
        c = dix.c(d, this.b, false, true, false);
        hvi a = jfw.a(eba.j(c, 8.0f, 0.0f, 8.0f, 0.0f, 10), "suggestion_row");
        int i = huo.a;
        ipn a2 = ebm.a(dxu.g(8.0f, hum.l), hum.o, hfdVar, 54);
        int a3 = hey.a(hfdVar);
        hgb c2 = hfdVar.c();
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
        hlc.b(hfdVar, c2, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
            Integer valueOf = Integer.valueOf(a3);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        dojh dojhVar = this.c;
        hlc.b(hfdVar, b, iss.c);
        dlti dltiVar = dojhVar != null ? dojhVar.b : null;
        hfdVar.v(-567391087);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new ffji() { // from class: dojl
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    ((Integer) obj4).intValue();
                    return ctt.n(new dbu(250, 100, new cyh(0.0f, 0.0f, 0.0f, 1.0f)), 0.0f, 0L, 6);
                }
            };
            hfdVar.y(f);
        }
        ffji ffjiVar = (ffji) f;
        hfdVar.o();
        hfdVar.v(-567381370);
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new ffji() { // from class: dojm
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    ((Integer) obj4).intValue();
                    return ctt.o(cxu.c(100, 0, new cyh(0.3f, 0.0f, 0.8f, 0.15f), 2), 0.0f, 0L, 6);
                }
            };
            hfdVar.y(f2);
        }
        hfdVar.o();
        dlth.b(list, dltiVar, ffjiVar, (ffji) f2, null, doih.b, hfdVar, (intValue & 14) | 200064);
        hfdVar.n();
        return ffcu.a;
    }
}
