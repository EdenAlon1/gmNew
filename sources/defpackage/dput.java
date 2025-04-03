package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dput {
    public static final void a(final dyh dyhVar, final dpxa dpxaVar, hfd hfdVar, final int i) {
        int i2;
        huo huoVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-977795027);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dpxaVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-1169288123);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            boolean a = dpxaVar.a();
            Boolean valueOf = Boolean.valueOf(a);
            b.v(-1169284428);
            boolean E = b.E(a);
            Object R2 = hfmVar.R();
            if (E || R2 == hfc.a) {
                R2 = new dpur(a, hhoVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(valueOf, (ffjm) R2, b);
            dbe d = dbs.d(Boolean.valueOf(c(hhoVar)), null, b, 0, 2);
            if (dpxaVar == dpxa.d) {
                int i4 = huo.a;
                huoVar = hum.d;
            } else {
                int i5 = huo.a;
                huoVar = hum.f;
            }
            boolean z = ((Boolean) d.e()).booleanValue() || c(hhoVar);
            b.v(-1169272934);
            boolean E2 = b.E(z);
            Object R3 = hfmVar.R();
            if (E2 || R3 == hfc.a) {
                hvi a2 = dyhVar.a(eba.d(hvi.e, 20.0f), huoVar);
                int ordinal = dpxaVar.ordinal();
                R3 = iop.a(hxz.a(a2, ordinal != 1 ? ordinal != 3 ? 0.0f : 90.0f : -90.0f), new ffjn() { // from class: dpuk
                    @Override // defpackage.ffjn
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        ipo ei;
                        ipq ipqVar = (ipq) obj;
                        ipl iplVar = (ipl) obj2;
                        ipqVar.getClass();
                        iplVar.getClass();
                        final iqk e = iplVar.e(((jzk) obj3).a);
                        ei = ipqVar.ei(e.b, e.a, ffem.a, new ffji() { // from class: dpuq
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj4) {
                                iqj iqjVar = (iqj) obj4;
                                iqjVar.getClass();
                                iqk iqkVar = iqk.this;
                                int i6 = iqkVar.a;
                                iqjVar.e(iqkVar, (-i6) / 2, (i6 - iqkVar.b) / 2, 0.0f);
                                return ffcu.a;
                            }
                        });
                        return ei;
                    }
                });
                hfmVar.ad(R3);
            }
            hvi hviVar = (hvi) R3;
            hfmVar.Z();
            final String a3 = jii.a(R.string.rotate_device_to_access_gallery, b);
            b.v(-1169256191);
            if (c(hhoVar)) {
                hve hveVar = hvi.e;
                b.v(-139715324);
                boolean D = b.D(a3);
                Object R4 = hfmVar.R();
                if (D || R4 == hfc.a) {
                    R4 = new ffji() { // from class: dpul
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            jkv jkvVar = (jkv) obj;
                            jkvVar.getClass();
                            jkr.n(jkvVar, 0);
                            jkr.k(jkvVar, a3);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R4);
                }
                hfmVar.Z();
                hviVar = hviVar.a(jjs.b(hveVar, (ffji) R4));
            }
            hfmVar.Z();
            dbu c = cxu.c(500, 0, new cyh(0.0f, 0.0f, 0.0f, 1.0f), 2);
            b.v(-1169243411);
            Object R5 = hfmVar.R();
            if (R5 == hfc.a) {
                R5 = new ffji() { // from class: dpum
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        int intValue = ((Integer) obj).intValue();
                        return Integer.valueOf(intValue + intValue);
                    }
                };
                hfmVar.ad(R5);
            }
            hfmVar.Z();
            cue e = ctt.e(c, (ffji) R5);
            dbu c2 = cxu.c(100, 0, new cyh(0.3f, 0.0f, 0.8f, 0.15f), 2);
            b.v(-1169237139);
            Object R6 = hfmVar.R();
            if (R6 == hfc.a) {
                R6 = new ffji() { // from class: dpun
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        int intValue = ((Integer) obj).intValue();
                        return Integer.valueOf(intValue + intValue);
                    }
                };
                hfmVar.ad(R6);
            }
            hfmVar.Z();
            cug h = ctt.h(c2, (ffji) R6);
            b.v(-1169248759);
            Object R7 = hfmVar.R();
            if (R7 == hfc.a) {
                R7 = new ffji() { // from class: dpuo
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        return bool;
                    }
                };
                hfmVar.ad(R7);
            }
            hfmVar.Z();
            cru.h(d, (ffji) R7, hviVar, e, h, hpx.d(1787213046, new dpus(a3), b), b, 224304);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpup
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i6 = i;
                    dput.a(dyhVar2, dpxaVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final boolean c(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }
}
