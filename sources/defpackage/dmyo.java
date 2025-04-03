package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmyo implements ffjm {
    final /* synthetic */ dmyy a;

    public dmyo(dmyy dmyyVar) {
        this.a = dmyyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi i = eba.i(hvi.e, 8.0f, 0.0f, 2);
            int i2 = huo.a;
            dmyy dmyyVar = this.a;
            ipn a = dyo.a(dxu.c, hum.k, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, i);
            int i3 = ist.a;
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
            dnxw.j(dmyyVar.a, ebs.k(hvi.e, 56.0f), hfdVar, 48);
            ebv.a(ebs.e(hvi.e, 8.0f), hfdVar);
            hvi x = ebs.x(hvi.e, 0.0f, 56.0f, 1);
            dwjt.b(dmyyVar.b, x, gft.a(hfdVar).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(hfdVar).l, hfdVar, 48, 3120, 55288);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
