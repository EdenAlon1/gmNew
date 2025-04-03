package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnqm extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ kgc b;
    final /* synthetic */ dnoo c;
    final /* synthetic */ dnsh d;
    final /* synthetic */ float e;
    final /* synthetic */ dntj f;
    final /* synthetic */ float g;
    final /* synthetic */ boolean h;
    final /* synthetic */ cxj i;
    final /* synthetic */ ffjn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqm(hho hhoVar, kgc kgcVar, dnoo dnooVar, dnsh dnshVar, float f, dntj dntjVar, float f2, boolean z, cxj cxjVar, ffjn ffjnVar) {
        super(2);
        this.a = hhoVar;
        this.b = kgcVar;
        this.c = dnooVar;
        this.d = dnshVar;
        this.e = f;
        this.f = dntjVar;
        this.g = f2;
        this.h = z;
        this.i = cxjVar;
        this.j = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.b(ffcu.a);
            this.b.c();
            kgc kgcVar = this.b;
            hfdVar.v(609659485);
            kgb b = kgcVar.b();
            kfr a = b.a();
            kfr b2 = b.b();
            kfr c = b.c();
            hve hveVar = hvi.e;
            hfdVar.v(-950163045);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = dnqe.a;
                hfdVar.y(f);
            }
            hfdVar.o();
            d = ebs.d(kgc.d(hveVar, a, (ffji) f), 1.0f);
            int i = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b3 = huz.b(hfdVar, d);
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
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b3, iss.c);
            dnrv.f(this.d, this.h, this.c, this.i, eau.b(hvi.e, this.e, 0.0f), this.j, hfdVar, 4096, 0);
            hfdVar.n();
            hfdVar.v(-950146856);
            if (this.c.b()) {
                hve hveVar2 = hvi.e;
                hfdVar.v(-950142651);
                boolean D = hfdVar.D(a) | hfdVar.D(this.d);
                Object f2 = hfdVar.f();
                if (D || f2 == hfc.a) {
                    f2 = new dnqf(a, this.d);
                    hfdVar.y(f2);
                }
                hfdVar.o();
                hvi d2 = kgc.d(hveVar2, c, (ffji) f2);
                if (dnsi.f(this.d)) {
                    d2 = d2.a(eba.i(hvi.e, 19.0f, 0.0f, 2));
                }
                hvi b4 = eau.b(d2, this.e, 0.0f);
                dnsh dnshVar = this.d;
                dnrv.g(b4, dnshVar, dnshVar.l, this.f, hfdVar, 0);
            }
            hfdVar.o();
            hvi x = ebs.x(hvi.e, 0.0f, 70.0f, 1);
            hfdVar.v(-950117251);
            boolean D2 = hfdVar.D(a);
            Object f3 = hfdVar.f();
            if (D2 || f3 == hfc.a) {
                f3 = new dnqg(a);
                hfdVar.y(f3);
            }
            hfdVar.o();
            dzt.b(eau.b(kgc.d(x, b2, (ffji) f3), this.g, 0.0f), new dxn(2.0f, true, dxr.a), null, null, 2, 0, hpx.d(1851344230, new dnqh(this.i, this.d), hfdVar), hfdVar, 1597488, 44);
            hfdVar.o();
            hfdVar.v(-2087871650);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
