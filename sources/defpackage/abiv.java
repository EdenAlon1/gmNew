package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abiv implements ffjn {
    final /* synthetic */ abhz a;
    final /* synthetic */ ffsk b;
    final /* synthetic */ gmk c;
    final /* synthetic */ hkx d;
    final /* synthetic */ hho e;

    public abiv(abhz abhzVar, ffsk ffskVar, gmk gmkVar, hkx hkxVar, hho hhoVar) {
        this.a = abhzVar;
        this.b = ffskVar;
        this.c = gmkVar;
        this.d = hkxVar;
        this.e = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        boolean z;
        boolean z2;
        Integer a;
        dys dysVar = (dys) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dysVar.getClass();
        boolean z3 = true;
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dysVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1097849845);
            if (this.a.k) {
                hfdVar.v(-1097847658);
                boolean F = hfdVar.F(this.b) | hfdVar.D(this.c) | hfdVar.D(this.a);
                final ffsk ffskVar = this.b;
                final gmk gmkVar = this.c;
                final abhz abhzVar = this.a;
                Object f = hfdVar.f();
                if (F || f == hfc.a) {
                    f = new ffix() { // from class: abit
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffud k = axol.k(ffsk.this, null, new abiu(gmkVar, null), 3);
                            final abhz abhzVar2 = abhzVar;
                            k.hZ(new ffji() { // from class: abis
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj4) {
                                    abhz.this.l.invoke();
                                    return ffcu.a;
                                }
                            });
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                abiy.i(dysVar, (ffix) f, hfdVar, intValue & 14);
            }
            hfdVar.o();
            c = dix.c(dys.b(eba.i(hvi.e, 24.0f, 0.0f, 2), 1.0f, false), dix.a(0, hfdVar, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            int i = huo.a;
            abhz abhzVar2 = this.a;
            hkx hkxVar = this.d;
            ipn a2 = dyo.a(dxu.c, hum.k, hfdVar, 48);
            int a3 = hey.a(hfdVar);
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
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hun hunVar = hum.k;
            hve hveVar = hvi.e;
            ipn a4 = dyo.a(dxu.c, hunVar, hfdVar, 48);
            int a5 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, hveVar);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            abiy.n(abhzVar2.a, null, hfdVar, 0);
            String str = abhzVar2.b;
            hfdVar.v(2141309780);
            if (str != null) {
                ebv.a(ebs.e(hvi.e, 16.0f), hfdVar);
                abiy.b(str, abhzVar2.c, hfdVar, 0);
            }
            hfdVar.o();
            ebv.a(ebs.e(hvi.e, 16.0f), hfdVar);
            hfdVar.n();
            hfdVar.v(-1634590198);
            int i3 = 0;
            for (Object obj4 : abhzVar2.e) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    ffdx.l();
                }
                dnia dniaVar = (dnia) obj4;
                String str2 = dniaVar.a;
                String str3 = dniaVar.b;
                Integer a6 = abiy.a(hkxVar);
                if (a6 == null) {
                    z = z3;
                } else {
                    z = z3;
                    if (i3 == a6.intValue()) {
                        z2 = z;
                        abiy.o(new dnia(str2, str3, dniaVar.c, z2, dniaVar.e), null, hfdVar, 0);
                        hfdVar.v(-1634581898);
                        if (abhzVar2.f != null && ffkj.e(abiy.a(hkxVar), abhzVar2.f) && (a = abiy.a(hkxVar)) != null && i3 == a.intValue()) {
                            abiy.m(dnem.a(abhzVar2.g, null, null, null, false, null, hum.m, 191), eba.j(dys.a(hvi.e, hum.k), 42.0f, 0.0f, 0.0f, 0.0f, 14), hfdVar, 0);
                        }
                        hfdVar.o();
                        z3 = z;
                        i3 = i4;
                    }
                }
                z2 = false;
                abiy.o(new dnia(str2, str3, dniaVar.c, z2, dniaVar.e), null, hfdVar, 0);
                hfdVar.v(-1634581898);
                if (abhzVar2.f != null) {
                    abiy.m(dnem.a(abhzVar2.g, null, null, null, false, null, hum.m, 191), eba.j(dys.a(hvi.e, hum.k), 42.0f, 0.0f, 0.0f, 0.0f, 14), hfdVar, 0);
                }
                hfdVar.o();
                z3 = z;
                i3 = i4;
            }
            boolean z4 = z3;
            hfdVar.o();
            hfdVar.v(-1634568794);
            if (ffkj.e(abiy.a(hkxVar), abhzVar2.h)) {
                dnmi.b(abhzVar2.i, eba.j(dys.a(hvi.e, hum.k), 0.0f, 0.0f, 0.0f, 4.0f, 7), hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
            if (abiy.a(this.d) != null) {
                this.e.b(Boolean.valueOf(z4));
            }
            ebv.a(ebs.e(hvi.e, 8.0f), hfdVar);
            abiy.k(this.a.j, ((Boolean) this.e.a()).booleanValue(), eba.i(hvi.e, 24.0f, 0.0f, 2), hfdVar, 384);
        }
        return ffcu.a;
    }
}
