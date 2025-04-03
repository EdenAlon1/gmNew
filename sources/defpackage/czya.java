package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czya extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ kgc b;
    final /* synthetic */ czxn c;
    final /* synthetic */ ffix d;
    final /* synthetic */ ffix e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czya(hho hhoVar, kgc kgcVar, czxn czxnVar, ffix ffixVar, ffix ffixVar2) {
        super(2);
        this.a = hhoVar;
        this.b = kgcVar;
        this.c = czxnVar;
        this.d = ffixVar;
        this.e = ffixVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.b(ffcu.a);
            this.b.c();
            kgc kgcVar = this.b;
            hfdVar.v(1535721498);
            kgb b = kgcVar.b();
            kfr a = b.a();
            kfr b2 = b.b();
            int i = huo.a;
            dxi g = dxu.g(10.0f, hum.k);
            hus husVar = hum.n;
            hvi f = eba.f(hvi.e, 10.0f, 18.0f, 48.0f, 8.0f);
            hfdVar.v(2127765125);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = czxu.a;
                hfdVar.y(f2);
            }
            hfdVar.o();
            hvi d = kgc.d(f, a, (ffji) f2);
            ipn a2 = ebm.a(g, husVar, hfdVar, 54);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
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
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b3, iss.c);
            hfdVar.v(420546491);
            Integer num = this.c.c;
            if (num != null) {
                dwho.a(jie.a(num.intValue(), hfdVar, 0), null, ebs.k(hvi.e, 18.0f), gft.a(hfdVar).s, hfdVar, 432, 0);
            }
            hfdVar.o();
            czyb.b(this.c, this.e, null, hfdVar, 0);
            hfdVar.n();
            hfdVar.v(2127785562);
            if (this.c.d) {
                ffix ffixVar2 = this.d;
                hve hveVar = hvi.e;
                hfdVar.v(2127790173);
                Object f3 = hfdVar.f();
                if (f3 == hfc.a) {
                    f3 = czxv.a;
                    hfdVar.y(f3);
                }
                hfdVar.o();
                czyb.a(ffixVar2, kgc.d(hveVar, b2, (ffji) f3), czws.b, hfdVar, 384);
            }
            hfdVar.o();
            hfdVar.o();
            hfdVar.v(-2087871650);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
