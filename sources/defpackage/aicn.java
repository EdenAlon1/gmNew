package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicn implements ffjm {
    final /* synthetic */ aicj a;

    public aicn(aicj aicjVar) {
        this.a = aicjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            aicj aicjVar = this.a;
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
            aigr.b(aicjVar.a, hfdVar, 0);
            if (aicjVar.f.a) {
                hfdVar.v(213577129);
                if (!((ahvn) hkf.a(aicjVar.e, hfdVar).a()).a) {
                    aiao.b(aicjVar.b, hfdVar, 8);
                }
                hfdVar.o();
            } else {
                hfdVar.v(213784240);
                aiao.b(aicjVar.b, hfdVar, 8);
                hfdVar.o();
            }
            hfdVar.n();
        }
        return ffcu.a;
    }
}
