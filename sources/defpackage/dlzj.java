package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlzj implements ffjm {
    final /* synthetic */ ffjn a;

    public dlzj(ffjn ffjnVar) {
        this.a = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hve hveVar = hvi.e;
            hfdVar.v(-1052953640);
            if (dooy.f(hfdVar)) {
                hfdVar.v(-1069556901);
                j = gft.a(hfdVar).I;
                hfdVar.o();
            } else {
                hfdVar.v(-1069496668);
                j = gft.a(hfdVar).n;
                hfdVar.o();
            }
            hfdVar.o();
            a = dee.a(hveVar, j, idb.a);
            hvi w = ebs.w(a, 0.0f, 0.0f, 200.0f, 72.0f, 3);
            ffjn ffjnVar = this.a;
            int i = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, w);
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
            ffjnVar.a(dyi.a, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
