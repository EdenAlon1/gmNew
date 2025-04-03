package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgx implements ffjm {
    final /* synthetic */ zhq a;

    public zgx(zhq zhqVar) {
        this.a = zhqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        zhq zhqVar;
        hfd hfdVar;
        hfd hfdVar2 = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar2.I()) {
            hfdVar2.s();
        } else {
            zhq zhqVar2 = this.a;
            dxj dxjVar = dxu.e;
            hve hveVar = hvi.e;
            int i = huo.a;
            ipn a = dyo.a(dxjVar, hum.j, hfdVar2, 6);
            int a2 = hey.a(hfdVar2);
            hgb c = hfdVar2.c();
            hvi b = huz.b(hfdVar2, hveVar);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar2.M();
            hfdVar2.x();
            if (hfdVar2.H()) {
                hfdVar2.j(ffixVar);
            } else {
                hfdVar2.z();
            }
            hlc.b(hfdVar2, a, iss.e);
            hlc.b(hfdVar2, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar2.H() || !ffkj.e(hfdVar2.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar2.y(valueOf);
                hfdVar2.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar2, b, iss.c);
            String str = zhqVar2 != null ? zhqVar2.a : null;
            hfdVar2.v(-1589287159);
            if (str != null) {
                zhqVar = zhqVar2;
                dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(hfdVar2).g, hfdVar2, 0, 3120, 55294);
                hfdVar2 = hfdVar2;
            } else {
                zhqVar = zhqVar2;
            }
            hfdVar2.o();
            zhq zhqVar3 = zhqVar;
            String str2 = zhqVar3 != null ? zhqVar3.b : null;
            hfdVar2.v(-1589280182);
            if (str2 != null) {
                hfdVar = hfdVar2;
                dwjt.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar2).k, hfdVar, 0, 0, 65534);
            } else {
                hfdVar = hfdVar2;
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}
