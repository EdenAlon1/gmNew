package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dodm implements ffjn {
    final /* synthetic */ dobm a;
    final /* synthetic */ String b;

    public dodm(dobm dobmVar, String str) {
        this.a = dobmVar;
        this.b = str;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = huo.a;
            hus husVar = hum.n;
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            dobm dobmVar = this.a;
            String str = this.b;
            hve hveVar = hvi.e;
            ipn a = ebm.a(dxnVar, husVar, hfdVar, 54);
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
            hfdVar.v(420699909);
            if (dobmVar != null) {
                dodp.k(dobmVar, ebs.k(hvi.e, 20.0f), hfdVar, 48);
            }
            hfdVar.o();
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
