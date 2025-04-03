package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dazz implements ffjm {
    final /* synthetic */ dbac a;

    public dazz(dbac dbacVar) {
        this.a = dbacVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbac dbacVar = this.a;
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
            Object[] objArr = new Object[0];
            hfdVar.v(2147294072);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: dazx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return new hhy(0);
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            hjz hjzVar = (hjz) hqr.c(objArr, null, (ffix) f, hfdVar, 3072, 6);
            dbacVar.b(hfdVar, 0);
            dwjm.a(hjzVar.c(), null, 0L, 0L, 0.0f, null, null, hpx.d(-721741345, new dazy(dbacVar, hjzVar), hfdVar), hfdVar, 12582912, 126);
            ((dazo) dbacVar.b.get(hjzVar.c())).b(hfdVar);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
