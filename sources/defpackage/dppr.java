package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppr implements ffjn {
    final /* synthetic */ dptl a;

    public dppr(dptl dptlVar) {
        this.a = dptlVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.E(booleanValue) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else if (booleanValue) {
            hfdVar.v(-256849481);
            d = ebs.d(hvi.e, 1.0f);
            dptl dptlVar = this.a;
            dxj dxjVar = dxu.e;
            int i = huo.a;
            ipn a = ebm.a(dxjVar, hum.m, hfdVar, 6);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
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
            dpqe.m(dptlVar.d, null, hfdVar, 0);
            hfdVar.n();
            hfdVar.o();
        } else {
            hfdVar.v(-256670270);
            dpqe.c(this.a.j, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
