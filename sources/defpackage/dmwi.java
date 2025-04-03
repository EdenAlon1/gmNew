package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwi implements ffjn {
    final /* synthetic */ dmvn a;

    public dmwi(dmvn dmvnVar) {
        this.a = dmvnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            int i = huo.a;
            dmvn dmvnVar = this.a;
            ipn a = dyc.a(hum.e, false);
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
            dmuy.c(dmvnVar.a, new ibw(gft.a(hfdVar).w), hfdVar, 0, 0);
            hfdVar.n();
            ebv.a(ebs.e(hvi.e, 12.0f), hfdVar);
            dmuy.e(this.a.b, true, hfdVar, 48, 0);
            hvi j = eba.j(hvi.e, 24.0f, 16.0f, 24.0f, 0.0f, 8);
            dmvn dmvnVar2 = this.a;
            dmuy.h(dmvnVar2.c, dmvnVar2.d, j, hfdVar, 0, 8);
        }
        return ffcu.a;
    }
}
