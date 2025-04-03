package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gti extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ gul b;
    final /* synthetic */ grs c;
    final /* synthetic */ hho d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gti(hho hhoVar, gul gulVar, grs grsVar, hho hhoVar2) {
        super(2);
        this.a = hhoVar;
        this.b = gulVar;
        this.c = grsVar;
        this.d = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hho hhoVar = this.a;
            gul gulVar = this.b;
            grs grsVar = this.c;
            hho hhoVar2 = this.d;
            hve hveVar = hvi.e;
            dxi dxiVar = dxu.a;
            int i = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, hfdVar, 0);
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
                Object valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hve hveVar2 = hvi.e;
            boolean D = hfdVar.D(hhoVar) | hfdVar.F(gulVar);
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gta(gulVar, hhoVar);
                hfdVar.y(f);
            }
            hvi a3 = ija.a(hveVar2, (ffji) f);
            jvu f2 = guj.f(hhoVar);
            boolean F = hfdVar.F(gulVar) | hfdVar.D(hhoVar);
            Object f3 = hfdVar.f();
            if (F || f3 == hfc.a) {
                f3 = new gtc(gulVar, hhoVar);
                hfdVar.y(f3);
            }
            ffji ffjiVar = (ffji) f3;
            euw euwVar = new euw(0, null, 3, 6, 115);
            boolean F2 = hfdVar.F(gulVar);
            Object f4 = hfdVar.f();
            if (F2 || f4 == hfc.a) {
                f4 = new gtd(gulVar);
                hfdVar.y(f4);
            }
            guj.C(a3, f2, ffjiVar, gulVar, 0, euwVar, new euv(null, (ffji) f4, null, null, 59), grsVar, hfdVar, 24576);
            guj.l(ebs.m(hvi.e, 24.0f, 72.0f), hfdVar, 6);
            hve hveVar3 = hvi.e;
            boolean D2 = hfdVar.D(hhoVar2) | hfdVar.F(gulVar);
            Object f5 = hfdVar.f();
            if (D2 || f5 == hfc.a) {
                f5 = new gte(gulVar, hhoVar2);
                hfdVar.y(f5);
            }
            hvi b2 = ija.b(hveVar3, (ffji) f5);
            jvu g = guj.g(hhoVar2);
            boolean F3 = hfdVar.F(gulVar) | hfdVar.D(hhoVar2);
            Object f6 = hfdVar.f();
            if (F3 || f6 == hfc.a) {
                f6 = new gtg(gulVar, hhoVar2);
                hfdVar.y(f6);
            }
            ffji ffjiVar2 = (ffji) f6;
            euw euwVar2 = new euw(0, null, 3, 7, 115);
            boolean F4 = hfdVar.F(gulVar);
            Object f7 = hfdVar.f();
            if (F4 || f7 == hfc.a) {
                f7 = new gth(gulVar);
                hfdVar.y(f7);
            }
            guj.C(b2, g, ffjiVar2, gulVar, 1, euwVar2, new euv(null, (ffji) f7, null, null, 59), grsVar, hfdVar, 24576);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
