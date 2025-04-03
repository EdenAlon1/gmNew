package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmfe implements ffjn {
    final /* synthetic */ dmfm a;
    final /* synthetic */ ffsk b;
    final /* synthetic */ gmk c;

    public dmfe(dmfm dmfmVar, ffsk ffskVar, gmk gmkVar) {
        this.a = dmfmVar;
        this.b = ffskVar;
        this.c = gmkVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        dys dysVar = (dys) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dysVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dysVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1648390664);
            if (this.a.f) {
                hfdVar.v(-1648388539);
                boolean F = hfdVar.F(this.b) | hfdVar.D(this.c) | hfdVar.D(this.a);
                final ffsk ffskVar = this.b;
                final gmk gmkVar = this.c;
                final dmfm dmfmVar = this.a;
                Object f = hfdVar.f();
                if (F || f == hfc.a) {
                    f = new ffix() { // from class: dmfc
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffud d = ffqy.d(ffsk.this, null, null, new dmfd(gmkVar, null), 3);
                            final dmfm dmfmVar2 = dmfmVar;
                            d.hZ(new ffji() { // from class: dmfb
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj4) {
                                    dmfm.this.h.invoke();
                                    return ffcu.a;
                                }
                            });
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                dmff.g(dysVar, (ffix) f, hfdVar, intValue & 14);
            }
            hfdVar.o();
            hvi i = eba.i(hvi.e, 24.0f, 0.0f, 2);
            int i2 = huo.a;
            dmfm dmfmVar2 = this.a;
            ipn a = dyo.a(dxu.c, hum.k, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, i);
            int i3 = ist.a;
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
            c = dix.c(dys.b(hvi.e, 1.0f, false), dix.a(0, hfdVar, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            ipn a3 = dyo.a(dxu.c, hum.k, hfdVar, 48);
            int a4 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, c);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a3, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            doat doatVar = dmfmVar2.i;
            hfdVar.v(-1718648681);
            float f2 = 8.0f;
            if (doatVar != null) {
                ebv.a(ebs.e(hvi.e, true == dmfmVar2.f ? 8.0f : 24.0f), hfdVar);
                dmff.l(doatVar, null, hfdVar, 0);
            }
            hfdVar.o();
            if (dmfmVar2.i != null) {
                f2 = 16.0f;
            } else if (!dmfmVar2.f) {
                f2 = 48.0f;
            }
            ebv.a(ebs.e(hvi.e, f2), hfdVar);
            dmff.j(dmfmVar2.a, null, hfdVar, 0);
            String str = dmfmVar2.d;
            hfdVar.v(-1718635680);
            if (str != null) {
                ebv.a(ebs.e(hvi.e, 16.0f), hfdVar);
                dmff.b(str, dmfmVar2.e, hfdVar, 0);
            }
            hfdVar.o();
            ebv.a(ebs.e(hvi.e, 28.0f), hfdVar);
            hfdVar.n();
            dmff.c(dmfmVar2.g, dmfmVar2.b, dmfmVar2.c, false, null, null, hfdVar, 0, 48);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
