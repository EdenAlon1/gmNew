package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gns extends ffkk implements ffjn {
    final /* synthetic */ gdu a;
    final /* synthetic */ String b;
    final /* synthetic */ goa c;
    final /* synthetic */ goa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gns(goa goaVar, goa goaVar2, gdu gduVar, String str) {
        super(3);
        this.c = goaVar;
        this.d = goaVar2;
        this.a = gduVar;
        this.b = str;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        ffjm ffjmVar = (ffjm) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.F(ffjmVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            boolean e = ffkj.e(this.c, this.d);
            cyq a = gjb.a(5, hfdVar);
            boolean D = hfdVar.D(this.c) | hfdVar.F(this.a);
            goa goaVar = this.c;
            gdu gduVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gnr(goaVar, gduVar);
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = cxk.a(true != e ? 1.0f : 0.0f);
                hfdVar.y(f2);
            }
            cxj cxjVar = (cxj) f2;
            Boolean valueOf = Boolean.valueOf(e);
            boolean F = hfdVar.F(cxjVar) | hfdVar.E(e) | hfdVar.F(a) | hfdVar.D(ffixVar);
            Object f3 = hfdVar.f();
            if (F || f3 == hfc.a) {
                f3 = new gnx(cxjVar, e, a, ffixVar, null);
                hfdVar.y(f3);
            }
            hgs.g(valueOf, (ffjm) f3, hfdVar);
            cxv cxvVar = cxjVar.b;
            cyq a2 = gjb.a(2, hfdVar);
            Object f4 = hfdVar.f();
            if (f4 == hfc.a) {
                f4 = cxk.a(true == e ? 0.8f : 1.0f);
                hfdVar.y(f4);
            }
            cxj cxjVar2 = (cxj) f4;
            boolean F2 = hfdVar.F(cxjVar2) | hfdVar.E(e) | hfdVar.F(a2);
            Object f5 = hfdVar.f();
            if (F2 || f5 == hfc.a) {
                f5 = new gny(cxjVar2, e, a2, null);
                hfdVar.y(f5);
            }
            hgs.g(valueOf, (ffjm) f5, hfdVar);
            cxv cxvVar2 = cxjVar2.b;
            hvi b = icf.b(hvi.e, ((Number) cxvVar2.a()).floatValue(), ((Number) cxvVar2.a()).floatValue(), ((Number) cxvVar.a()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 131064);
            boolean E = hfdVar.E(e) | hfdVar.D(this.c) | hfdVar.D(this.b);
            String str = this.b;
            goa goaVar2 = this.c;
            Object f6 = hfdVar.f();
            if (E || f6 == hfc.a) {
                f6 = new gnp(e, str, goaVar2);
                hfdVar.y(f6);
            }
            c = jjs.c(b, false, (ffji) f6);
            int i = huo.a;
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, c);
            int i2 = ist.a;
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a3, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
                Object valueOf2 = Integer.valueOf(a4);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            ffjmVar.a(hfdVar, Integer.valueOf(intValue & 14));
            hfdVar.n();
        }
        return ffcu.a;
    }
}
