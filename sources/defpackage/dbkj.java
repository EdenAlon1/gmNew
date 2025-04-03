package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbkj implements ffjm {
    final /* synthetic */ dbku a;

    public dbkj(dbku dbkuVar) {
        this.a = dbkuVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbku dbkuVar = this.a;
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
            hfdVar.v(46985194);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: dbkf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return new hhy(0);
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            hjz hjzVar = (hjz) hqr.c(objArr, null, (ffix) f, hfdVar, 3072, 6);
            dbkuVar.c(hfdVar, 0);
            dwjm.a(hjzVar.c(), null, 0L, 0L, 0.0f, null, null, hpx.d(821753861, new dbki(dbkuVar, hjzVar), hfdVar), hfdVar, 12582912, 126);
            int c2 = hjzVar.c();
            if (c2 == 0) {
                hfdVar.v(46997727);
                dbkuVar.b(hfdVar, 0);
                hfdVar.o();
            } else if (c2 != 1) {
                hfdVar.v(1456977744);
                hfdVar.o();
            } else {
                hfdVar.v(46998652);
                dbkuVar.f(null, hfdVar, 0);
                hfdVar.o();
            }
            hfdVar.n();
        }
        return ffcu.a;
    }
}
