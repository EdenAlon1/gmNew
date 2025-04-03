package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqn implements ffjn {
    final /* synthetic */ dnsh a;
    final /* synthetic */ dntj b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dnoo e;
    final /* synthetic */ cxj f;
    final /* synthetic */ ffjn g;
    final /* synthetic */ float h;

    public dnqn(dnsh dnshVar, dntj dntjVar, float f, boolean z, dnoo dnooVar, cxj cxjVar, ffjn ffjnVar, float f2) {
        this.a = dnshVar;
        this.b = dntjVar;
        this.c = f;
        this.d = z;
        this.e = dnooVar;
        this.f = cxjVar;
        this.g = ffjnVar;
        this.h = f2;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float f;
        dntj dntjVar;
        hvi c;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnsh dnshVar = this.a;
            dnvp.a(dnshVar.m, dnshVar.a, dnshVar.w, hfdVar, 0, 0);
            dnsh dnshVar2 = this.a;
            dnrv.r(dnshVar2, this.b, eau.b(hvi.e, dnshVar2.f == dnor.c ? this.c : 0.0f, 0.0f), hfdVar, 0);
            dnsh dnshVar3 = this.a;
            if (!dnrv.o(dnshVar3) || (dnshVar3.B.g && this.d)) {
                hfdVar.v(-2071632151);
                dnrv.f(this.a, this.d, this.e, this.f, null, this.g, hfdVar, 4096, 16);
                hfdVar = hfdVar;
                hfdVar.o();
            } else {
                hfdVar.v(-2074350262);
                dnoo dnooVar = this.e;
                dnsh dnshVar4 = this.a;
                float f2 = this.c;
                dntj dntjVar2 = this.b;
                float f3 = this.h;
                boolean z = this.d;
                cxj cxjVar = this.f;
                ffjn ffjnVar = this.g;
                hfdVar.v(-1003410150);
                hve hveVar = hvi.e;
                hfdVar.v(-2013492259);
                hfdVar.o();
                jzn jznVar = (jzn) hfdVar.e(jdr.e);
                Object f4 = hfdVar.f();
                if (f4 == hfc.a) {
                    f4 = new kgq(jznVar);
                    hfdVar.y(f4);
                }
                kgq kgqVar = (kgq) f4;
                Object f5 = hfdVar.f();
                if (f5 == hfc.a) {
                    f5 = new kgc();
                    hfdVar.y(f5);
                }
                kgc kgcVar = (kgc) f5;
                Object f6 = hfdVar.f();
                if (f6 == hfc.a) {
                    hic hicVar = new hic(false, hla.a);
                    hfdVar.y(hicVar);
                    f6 = hicVar;
                }
                hho hhoVar = (hho) f6;
                Object f7 = hfdVar.f();
                if (f7 == hfc.a) {
                    f7 = new kgj(kgcVar);
                    hfdVar.y(f7);
                }
                kgj kgjVar = (kgj) f7;
                Object f8 = hfdVar.f();
                if (f8 == hfc.a) {
                    dntjVar = dntjVar2;
                    hic hicVar2 = new hic(ffcu.a, hhs.a);
                    hfdVar.y(hicVar2);
                    f8 = hicVar2;
                } else {
                    dntjVar = dntjVar2;
                }
                hho hhoVar2 = (hho) f8;
                boolean F = hfdVar.F(kgqVar) | hfdVar.B(257);
                Object f9 = hfdVar.f();
                if (F || f9 == hfc.a) {
                    f9 = new dnqj(hhoVar2, kgqVar, kgjVar, hhoVar);
                    hfdVar.y(f9);
                }
                ipn ipnVar = (ipn) f9;
                Object f10 = hfdVar.f();
                if (f10 == hfc.a) {
                    f10 = new dnqk(hhoVar, kgjVar);
                    hfdVar.y(f10);
                }
                boolean F2 = hfdVar.F(kgqVar);
                Object f11 = hfdVar.f();
                if (F2 || f11 == hfc.a) {
                    f11 = new dnql(kgqVar);
                    hfdVar.y(f11);
                }
                c = jjs.c(hveVar, false, (ffji) f11);
                iol.b(c, hpx.d(1200550679, new dnqm(hhoVar2, kgcVar, dnooVar, dnshVar4, f2, dntjVar, f3, z, cxjVar, ffjnVar), hfdVar), ipnVar, hfdVar, 48);
                hfdVar.o();
                hfdVar.o();
            }
            if (this.e.b()) {
                dnsh dnshVar5 = this.a;
                if (!dnrv.o(dnshVar5) || (dnshVar5.B.g && this.d)) {
                    hvi hviVar = hvi.e;
                    if (dnsi.f(dnshVar5)) {
                        f = 0.0f;
                        hviVar = eba.i(hviVar, 19.0f, 0.0f, 2);
                    } else {
                        f = 0.0f;
                    }
                    hvi b = eau.b(hviVar, this.c, f);
                    dnsh dnshVar6 = this.a;
                    dnrv.g(b, dnshVar6, dnshVar6.l, this.b, hfdVar, 0);
                }
            }
        }
        return ffcu.a;
    }
}
