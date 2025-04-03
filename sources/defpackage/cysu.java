package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cysu implements ffjm {
    final /* synthetic */ cysm a;
    final /* synthetic */ cvo b;
    final /* synthetic */ crw c;
    final /* synthetic */ float d;

    public cysu(cysm cysmVar, cvo cvoVar, crw crwVar, float f) {
        this.a = cysmVar;
        this.b = cvoVar;
        this.c = crwVar;
        this.d = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar;
        hfd hfdVar2 = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar2.I()) {
            hfdVar2.s();
        } else {
            dxi dxiVar = dxu.a;
            int i = huo.a;
            cysm cysmVar = this.a;
            cvo cvoVar = this.b;
            crw crwVar = this.c;
            float f = this.d;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a = ebm.a(dxiVar, husVar, hfdVar2, 54);
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
            cysv.a(cysmVar.d, hfdVar2, 0);
            ebv.a(ebs.o(hvi.e, 8.0f), hfdVar2);
            cysv.c(cvoVar, cysmVar, crwVar, 36.0f, hxe.a(hvi.e, f), f >= 1.0f, f, hfdVar2, 3072);
            ebv.a(ebs.o(hvi.e, 12.0f), hfdVar2);
            cyub cyubVar = cysmVar.b;
            hfdVar2.v(1238936927);
            String str = cyubVar.a;
            if (str != null) {
                hfdVar = hfdVar2;
                dwjt.b(str, hxe.a(hvi.e, f), gft.a(hfdVar2).q, 0L, null, null, 0L, new jyj(3), 0L, 2, false, 1, 0, null, gft.d(hfdVar2).h, hfdVar, 0, 3120, 54776);
            } else {
                hfdVar = hfdVar2;
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}
