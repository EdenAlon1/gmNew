package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmgz {
    public static final void a(final dmzz dmzzVar, final long j, final long j2, final String str, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        ffix ffixVar2;
        hvi c;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-430957240);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.C(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(str) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 8192 : 16384;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            c = ebs.c(hvi.e, 1.0f);
            hfdVar2 = b;
            gpa.e(ffixVar2, jfw.a(c, "BadgedIconButton"), false, eqm.a, j, 0L, 0.0f, null, null, hpx.d(159993811, new dmgy(dmzzVar, str, j2), b), hfdVar2, 996);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmgs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    long j3 = j;
                    long j4 = j2;
                    String str2 = str;
                    dmgz.a(dmzzVar2, j3, j4, str2, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmha dmhaVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1714473042);
        if (i3 == 0) {
            i2 = (true != b.D(dmhaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi k = ebs.k(hviVar, 48.0f);
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, k);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dmzz dmzzVar = dmhaVar.d;
            ibw ibwVar = dmhaVar.f;
            dyi dyiVar = dyi.a;
            b.v(-1984708592);
            hfmVar.Z();
            ibw ibwVar2 = dmhaVar.e;
            b.v(-1984705948);
            hfmVar.Z();
            a(dmzzVar, ibwVar.i, ibwVar2.i, dmhaVar.c, dmhaVar.h, b, 0);
            b.v(-1984700881);
            int i6 = dmhaVar.a;
            ibw ibwVar3 = dmhaVar.g;
            b.v(-1984696657);
            hfmVar.Z();
            ibw ibwVar4 = dmhaVar.b;
            b.v(-1984693869);
            hfmVar.Z();
            c(dyiVar, i6, ibwVar3.i, ibwVar4.i, b, 6);
            hfdVar2 = b;
            hfmVar.Z();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmgw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmha dmhaVar2 = dmha.this;
                    int i7 = i;
                    dmgz.b(dmhaVar2, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dyh dyhVar, final int i, final long j, final long j2, hfd hfdVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(1177988554);
        if (i4 == 0) {
            i3 = (true != b.D(dyhVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.C(j) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.C(j2) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            int i5 = huo.a;
            hvi k = ebs.k(dyhVar.a(hveVar, hum.c), 18.0f);
            b.v(816342175);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffjn() { // from class: dmgt
                    @Override // defpackage.ffjn
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        ipo ei;
                        final ipq ipqVar = (ipq) obj;
                        ipl iplVar = (ipl) obj2;
                        ipqVar.getClass();
                        iplVar.getClass();
                        final iqk e = iplVar.e(((jzk) obj3).a);
                        ei = ipqVar.ei(e.a, e.b, ffem.a, new ffji() { // from class: dmgv
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj4) {
                                iqj iqjVar = (iqj) obj4;
                                iqjVar.getClass();
                                iqjVar.e(iqk.this, 0, (int) ipqVar.em(-5.0f), 0.0f);
                                return ffcu.a;
                            }
                        });
                        return ei;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dym.a(dee.a(iop.a(k, (ffjn) R), j, eqm.a), null, hpx.d(467993396, new dmgx(i, j2), b), b, 3072, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmgu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i6 = i;
                    long j3 = j;
                    dmgz.c(dyhVar2, i6, j3, j2, (hfd) obj, hip.a(i2 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
