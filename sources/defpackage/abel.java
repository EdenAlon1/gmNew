package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abel implements ffjn {
    final /* synthetic */ abdn a;
    final /* synthetic */ god b;
    final /* synthetic */ hho c;

    public abel(abdn abdnVar, god godVar, hho hhoVar) {
        this.a = abdnVar;
        this.b = godVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebe) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            final abdn abdnVar = this.a;
            god godVar = this.b;
            hho hhoVar = this.c;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
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
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            final abeo abeoVar = abdnVar.r;
            dyi dyiVar = dyi.a;
            hfdVar.v(1938867822);
            if (abeoVar != null) {
                hfdVar.v(2058690661);
                hfdVar.v(-1213093029);
                boolean F = hfdVar.F(abeoVar);
                Object f = hfdVar.f();
                if (F || f == hfc.a) {
                    f = new ffix() { // from class: aben
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            abeo.this.a.g();
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                dmao.b((ffix) f, hfdVar, 0);
                hfdVar.o();
            }
            hfdVar.o();
            hfdVar.v(-24500563);
            abem.e(dyiVar, abdnVar, hfdVar, 6);
            hfdVar.o();
            zmz zmzVar = abdnVar.b;
            hvi b2 = ecm.b(dyiVar.b(hvi.e), new eat(ecv.f(hfdVar), 16));
            hfdVar.v(1938881599);
            boolean D = hfdVar.D(abdnVar);
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = new ffji() { // from class: abei
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        abjo abjoVar = (abjo) obj4;
                        abjoVar.getClass();
                        abdn.this.k.invoke(abjoVar);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            ffji ffjiVar = (ffji) f2;
            hfdVar.o();
            b2.getClass();
            ffjiVar.getClass();
            zoz.e(zmzVar, abem.a(hhoVar), ilv.a(b2, ffcu.a, new abjr(ffjiVar)), hfdVar, 0);
            abem.h(abdnVar, hpx.d(-1637165938, new abej(abdnVar, dyiVar), hfdVar), hfdVar, 48);
            zeb zebVar = abdnVar.g;
            ffxx ffxxVar = zebVar != null ? zebVar.a : null;
            hfdVar.v(1938897572);
            hkx b3 = ffxxVar == null ? null : hkt.b(ffxxVar, false, null, hfdVar, 2);
            hfdVar.o();
            if (b3 == null) {
                b3 = new hic(false, hla.a);
            }
            hfdVar.v(1938900205);
            if (((Boolean) b3.a()).booleanValue()) {
                abem.j(hxe.a(eau.b(dyiVar.a(hvi.e, hum.c), -8.0f, ((jzn) hfdVar.e(jdr.e)).ek(((Number) hkt.b(abdnVar.f, 0, null, hfdVar, 2).a()).intValue()) + 8.0f), 0.25f), hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.v(-23189139);
            abem.f(dyiVar, abdnVar, hfdVar, 6);
            hfdVar.o();
            abem.d(abdnVar, godVar, hfdVar, 48);
            abem.h(abdnVar, hpx.d(-1481577723, new abek(abdnVar), hfdVar), hfdVar, 48);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
