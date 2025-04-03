package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpjm implements ffjm {
    final /* synthetic */ cxj a;
    final /* synthetic */ long b;
    final /* synthetic */ dplw c;
    final /* synthetic */ float d;
    final /* synthetic */ hho e;

    public dpjm(cxj cxjVar, long j, dplw dplwVar, float f, hho hhoVar) {
        this.a = cxjVar;
        this.b = j;
        this.c = dplwVar;
        this.d = f;
        this.e = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hve hveVar = hvi.e;
            hfdVar.v(770322745);
            boolean F = hfdVar.F(this.a);
            final cxj cxjVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffji() { // from class: dpjk
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        idd iddVar = (idd) obj3;
                        iddVar.getClass();
                        iddVar.a(((Number) cxj.this.d()).floatValue());
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            a = dee.a(icf.a(hveVar, (ffji) f), this.b, idb.a);
            dplw dplwVar = this.c;
            float f2 = this.d;
            final hho hhoVar = this.e;
            int i = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, a);
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
            hfdVar.v(411343405);
            boolean D = hfdVar.D(hhoVar);
            Object f3 = hfdVar.f();
            if (D || f3 == hfc.a) {
                f3 = new ffix() { // from class: dpjl
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        hho.this.b(true);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            hfdVar.o();
            dpkz.j(dplwVar, f2, (ffix) f3, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
