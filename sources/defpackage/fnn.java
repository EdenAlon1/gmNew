package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnn extends ffkk implements ffjn {
    final /* synthetic */ List a;
    final /* synthetic */ fkh b;
    final /* synthetic */ String c;
    final /* synthetic */ fnv d;
    final /* synthetic */ fnv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnn(fnv fnvVar, fnv fnvVar2, List list, fkh fkhVar, String str) {
        super(3);
        this.d = fnvVar;
        this.e = fnvVar2;
        this.a = list;
        this.b = fkhVar;
        this.c = str;
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
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            boolean e = ffkj.e(this.d, this.e);
            int i = true != e ? 75 : 150;
            int i2 = (!e || kau.b(this.a).size() == 1) ? 0 : 75;
            dbu dbuVar = new dbu(i, i2, cyp.d);
            boolean F = hfdVar.F(this.d) | hfdVar.F(this.b);
            fnv fnvVar = this.d;
            fkh fkhVar = this.b;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new fnm(fnvVar, fkhVar);
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
            boolean F2 = hfdVar.F(cxjVar) | hfdVar.E(e) | hfdVar.F(dbuVar) | hfdVar.D(ffixVar);
            Object f3 = hfdVar.f();
            if (F2 || f3 == hfc.a) {
                Object fnsVar = new fns(cxjVar, e, dbuVar, ffixVar, null);
                hfdVar.y(fnsVar);
                f3 = fnsVar;
            }
            hgs.g(valueOf, (ffjm) f3, hfdVar);
            cxv cxvVar = cxjVar.b;
            dbu dbuVar2 = new dbu(i, i2, cyp.a);
            Object f4 = hfdVar.f();
            if (f4 == hfc.a) {
                f4 = cxk.a(true == e ? 0.8f : 1.0f);
                hfdVar.y(f4);
            }
            cxj cxjVar2 = (cxj) f4;
            boolean F3 = hfdVar.F(cxjVar2) | hfdVar.E(e) | hfdVar.F(dbuVar2);
            Object f5 = hfdVar.f();
            if (F3 || f5 == hfc.a) {
                f5 = new fnt(cxjVar2, e, dbuVar2, null);
                hfdVar.y(f5);
            }
            hgs.g(valueOf, (ffjm) f5, hfdVar);
            cxv cxvVar2 = cxjVar2.b;
            hvi b = icf.b(hvi.e, ((Number) cxvVar2.a()).floatValue(), ((Number) cxvVar2.a()).floatValue(), ((Number) cxvVar.a()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 131064);
            boolean E = hfdVar.E(e) | hfdVar.D(this.c) | hfdVar.F(this.d);
            String str = this.c;
            fnv fnvVar2 = this.d;
            Object f6 = hfdVar.f();
            if (E || f6 == hfc.a) {
                f6 = new fnk(e, str, fnvVar2);
                hfdVar.y(f6);
            }
            c = jjs.c(b, false, (ffji) f6);
            int i3 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, c);
            int i4 = ist.a;
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Object valueOf2 = Integer.valueOf(a2);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            ffjmVar.a(hfdVar, Integer.valueOf(intValue & 14));
            hfdVar.n();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
