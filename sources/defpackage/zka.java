package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zka {
    public static final void a(final kgc kgcVar, final kfr kfrVar, final zfj zfjVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-216235940);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(kgcVar) : b.F(kgcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(kfrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(zfjVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dmcg dmcgVar = (dmcg) hkt.b(zfjVar.c, null, null, b, 2).a();
            if (dmcgVar != null && !dmcgVar.a.isEmpty()) {
                kfr a = kgcVar.a();
                hve hveVar = hvi.e;
                b.v(-41112107);
                int i3 = i2 & 112;
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (i3 == 32 || R == hfc.a) {
                    R = new ffji() { // from class: zjw
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            kfq kfqVar = (kfq) obj;
                            kfqVar.getClass();
                            kfo kfoVar = kfqVar.g;
                            kfr kfrVar2 = kfr.this;
                            kgv.a(kfoVar, kfrVar2.d, 0.0f, 6);
                            kgo.a(kfqVar.h, kfrVar2.e, 0.0f, 6);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                hvi d = kgc.d(hveVar, a, (ffji) R);
                b.v(-41108303);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    R2 = new ffjn() { // from class: zjx
                        @Override // defpackage.ffjn
                        public final Object a(Object obj, Object obj2, Object obj3) {
                            ipo ei;
                            final ipq ipqVar = (ipq) obj;
                            ipl iplVar = (ipl) obj2;
                            ipqVar.getClass();
                            iplVar.getClass();
                            final iqk e = iplVar.e(((jzk) obj3).a);
                            ei = ipqVar.ei(e.a, e.b, ffem.a, new ffji() { // from class: zjz
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj4) {
                                    iqj iqjVar = (iqj) obj4;
                                    iqjVar.getClass();
                                    ipq ipqVar2 = ipqVar;
                                    iqk iqkVar = iqk.this;
                                    iqjVar.e(iqkVar, 0, iqkVar.b - ((int) ipqVar2.em(8.0f)), 0.0f);
                                    return ffcu.a;
                                }
                            });
                            return ei;
                        }
                    };
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                dmcf.p(dmcgVar, iop.a(d, (ffjn) R2), b, 0);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zjy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kgc kgcVar2 = kgc.this;
                    kfr kfrVar2 = kfrVar;
                    int i4 = i;
                    zka.a(kgcVar2, kfrVar2, zfjVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
