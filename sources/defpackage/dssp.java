package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dssp implements ffjo {
    final /* synthetic */ hvi a;
    final /* synthetic */ boolean b;
    final /* synthetic */ List c;
    final /* synthetic */ dspe d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ffjp f;
    final /* synthetic */ eot g;

    public dssp(hvi hviVar, boolean z, List list, dspe dspeVar, boolean z2, ffjp ffjpVar, eot eotVar) {
        this.a = hviVar;
        this.b = z;
        this.c = list;
        this.d = dspeVar;
        this.e = z2;
        this.f = ffjpVar;
        this.g = eotVar;
    }

    public static final void b(hho hhoVar, long j) {
        hhoVar.b(new kaf(j));
    }

    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        hvi c;
        final int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((eoc) obj).getClass();
        hfdVar.v(1691086195);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            hic hicVar = new hic(new kaf(0L), hla.a);
            hfdVar.y(hicVar);
            f = hicVar;
        }
        final hho hhoVar = (hho) f;
        hfdVar.o();
        hfdVar.v(1691089435);
        hvi hviVar = this.a;
        boolean z = this.b;
        final dspe dspeVar = this.d;
        final eot eotVar = this.g;
        c = ebs.c(hviVar, 1.0f);
        if (z) {
            hve hveVar = hvi.e;
            hfdVar.v(18502649);
            boolean F = ((((intValue2 & 112) ^ 48) > 32 && hfdVar.B(intValue)) || (intValue2 & 48) == 32) | hfdVar.F(dspeVar) | hfdVar.D(eotVar);
            Object f2 = hfdVar.f();
            if (F || f2 == hfc.a) {
                f2 = new ffji() { // from class: dssk
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj5) {
                        ((jzn) obj5).getClass();
                        long j = ((kaf) hhoVar.a()).a;
                        int b = jzk.b(dspe.this.a());
                        final eot eotVar2 = eotVar;
                        int i = eotVar2.x().c;
                        final int f3 = ffmk.f(((b - ((int) (j >> 32))) / 2) - (i + i), 0);
                        final int i2 = intValue;
                        ffix ffixVar = new ffix() { // from class: dssj
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                float f4;
                                float c2;
                                float f5;
                                int i3 = i2;
                                eot eotVar3 = eot.this;
                                if (i3 == eotVar3.j()) {
                                    f4 = eotVar3.c();
                                } else {
                                    if (i3 == eotVar3.j() + 1) {
                                        c2 = eotVar3.c();
                                        f5 = -1.0f;
                                    } else if (i3 == eotVar3.j() - 1) {
                                        c2 = eotVar3.c();
                                        f5 = 1.0f;
                                    } else {
                                        f4 = 0.0f;
                                    }
                                    f4 = c2 + f5;
                                }
                                return Integer.valueOf(ffln.b(f4 * f3));
                            }
                        };
                        hqg hqgVar = hkg.a;
                        return new kaa(((Number) new hgk(ffixVar, null).a()).intValue() << 32);
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            c = c.a(eau.a(hveVar, (ffji) f2));
        }
        hvi hviVar2 = c;
        hfdVar.o();
        dssr dssrVar = (dssr) this.c.get(intValue);
        if (dssrVar instanceof dsum) {
            hfdVar.v(884388414);
            dspe dspeVar2 = this.d;
            dsum dsumVar = (dsum) dssrVar;
            hfdVar.v(1691100476);
            Object f3 = hfdVar.f();
            if (f3 == hfc.a) {
                f3 = new ffji() { // from class: dssl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj5) {
                        dssp.b(hho.this, ((kaf) obj5).a);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            ffji ffjiVar = (ffji) f3;
            hfdVar.o();
            boolean z2 = this.e;
            ffjp ffjpVar = this.f;
            hfdVar.v(1691103910);
            hpn d = ffjpVar == null ? null : hpx.d(776709613, new dssn(ffjpVar, intValue), hfdVar);
            hfdVar.o();
            dsuh.c(dspeVar2, hviVar2, dsumVar, ffjiVar, z2, d, hfdVar, 3584);
            hfdVar.o();
        } else {
            if (!(dssrVar instanceof dsvy)) {
                hfdVar.v(1691119876);
                hfdVar.o();
                throw new UnsupportedOperationException("Unknown media type.");
            }
            hfdVar.v(884739241);
            dspe dspeVar3 = this.d;
            dsvy dsvyVar = (dsvy) dssrVar;
            boolean z3 = intValue == this.g.j();
            hfdVar.v(1691113436);
            Object f4 = hfdVar.f();
            if (f4 == hfc.a) {
                f4 = new ffji() { // from class: dssm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj5) {
                        dssp.b(hho.this, ((kaf) obj5).a);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f4);
            }
            ffji ffjiVar2 = (ffji) f4;
            hfdVar.o();
            boolean z4 = this.e;
            ffjp ffjpVar2 = this.f;
            hfdVar.v(1691116870);
            hpn d2 = ffjpVar2 == null ? null : hpx.d(1262793847, new dsso(ffjpVar2, intValue), hfdVar);
            hfdVar.o();
            dsvs.j(dspeVar3, hviVar2, dsvyVar, z3, ffjiVar2, z4, d2, hfdVar, 25088);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
