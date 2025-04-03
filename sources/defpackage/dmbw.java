package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmbw implements ffjn {
    final /* synthetic */ dmat a;

    public dmbw(dmat dmatVar) {
        this.a = dmatVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            qgp d = qhj.d(this.a.a, hfdVar);
            final qfn c2 = qfx.c(hfdVar);
            Boolean bool = (Boolean) hfdVar.e(dnmz.a);
            boolean booleanValue = bool.booleanValue();
            qci a = d.a();
            Integer valueOf = Integer.valueOf(this.a.c);
            hfdVar.v(1531472713);
            boolean D = hfdVar.D(c2) | hfdVar.E(booleanValue) | hfdVar.D(d);
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new dmbu(c2, booleanValue, d, null);
                hfdVar.y(f);
            }
            hfdVar.o();
            hgs.f(a, valueOf, (ffjm) f, hfdVar);
            hfdVar.v(1531482601);
            boolean E = hfdVar.E(booleanValue) | hfdVar.D(d) | hfdVar.D(c2);
            Object f2 = hfdVar.f();
            if (E || f2 == hfc.a) {
                f2 = new dmbv(booleanValue, c2, d, null);
                hfdVar.y(f2);
            }
            hfdVar.o();
            hgs.g(bool, (ffjm) f2, hfdVar);
            c = ebs.c(eba.d(hvi.e, 4.0f), 1.0f);
            float f3 = this.a.b;
            hvi a2 = hya.a(c, f3, f3);
            qci a3 = d.a();
            hfdVar.v(1531498133);
            boolean D2 = hfdVar.D(c2);
            Object f4 = hfdVar.f();
            if (D2 || f4 == hfc.a) {
                f4 = new ffix() { // from class: dmbt
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Float.valueOf(qfn.this.e());
                    }
                };
                hfdVar.y(f4);
            }
            hfdVar.o();
            qgf.c(a3, (ffix) f4, a2, null, null, null, null, false, hfdVar, 0, 0, 8184);
        }
        return ffcu.a;
    }
}
