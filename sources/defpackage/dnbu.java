package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbu {
    public static final Uri a(hho hhoVar) {
        return (Uri) hhoVar.a();
    }

    public static final Uri b(hho hhoVar) {
        return (Uri) hhoVar.a();
    }

    public static final boolean c(Uri uri) {
        return uri == null || ffkj.e(uri, Uri.EMPTY);
    }

    public static final void d(dnbm dnbmVar, final Object obj, eqd eqdVar, final inp inpVar, hfd hfdVar, final int i) {
        int i2;
        dnbm dnbmVar2;
        eqd eqdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1761516952);
        if (i3 == 0) {
            i2 = (true != b.D(dnbmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(eqdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(inpVar) ? 1024 : 2048;
        }
        if ((i2 & 1155) == 1154 && b.I()) {
            b.s();
            dnbmVar2 = dnbmVar;
            eqdVar2 = eqdVar;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            b.v(-1274061028);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(null, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            if (a(hhoVar) == null && dnbmVar.k() != null) {
                hhoVar.b(dnbmVar.k());
            }
            b.v(-1274040224);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hic hicVar2 = new hic(dnbmVar.l(), hla.a);
                hfmVar.ad(hicVar2);
                R2 = hicVar2;
            }
            hho hhoVar2 = (hho) R2;
            hfmVar.Z();
            if (c(b(hhoVar2)) && !c(dnbmVar.l())) {
                hhoVar2.b(dnbmVar.l());
            }
            boolean z = a(hhoVar) != null;
            dnbmVar2 = dnbmVar;
            eqdVar2 = eqdVar;
            dnmq.a(dnbmVar2, null, eqdVar2, z, hpx.d(758448413, new dnbt(hhoVar2, hhoVar, dnbmVar, inpVar), b), b, (i2 & 14) | 24576 | (i2 & 896), 2);
        }
        hio L = b.L();
        if (L != null) {
            final dnbm dnbmVar3 = dnbmVar2;
            final eqd eqdVar3 = eqdVar2;
            L.d = new ffjm() { // from class: dnbn
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dnbm dnbmVar4 = dnbm.this;
                    Object obj4 = obj;
                    eqd eqdVar4 = eqdVar3;
                    dnbu.d(dnbmVar4, obj4, eqdVar4, inpVar, (hfd) obj2, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dnbm dnbmVar, final Object obj, final eqd eqdVar, hfd hfdVar, final int i) {
        int i2;
        obj.getClass();
        hfd b = hfdVar.b(61183376);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dnbmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(obj) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(eqdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(true) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            int i3 = inp.a;
            inp inpVar = ino.a;
            b.v(-192926479);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new dnbq(dnbmVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(dnbmVar, (ffjm) R, b);
            int ordinal = dnbmVar.m().ordinal();
            if (ordinal == 0) {
                b.v(-1685636898);
                hfmVar.Z();
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dnbo
                        @Override // defpackage.ffjm
                        public final Object a(Object obj2, Object obj3) {
                            ((Integer) obj3).intValue();
                            dnbm dnbmVar2 = dnbm.this;
                            Object obj4 = obj;
                            int i5 = i;
                            dnbu.e(dnbmVar2, obj4, eqdVar, (hfd) obj2, hip.a(i5 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                b.v(-192917923);
                String p = dnbmVar.p();
                String o = dnbmVar.o();
                String a = dnbmVar.a();
                if (a == null) {
                    a = "";
                }
                dlza.a(new dlzf(new dlwc(p, o, a, 4), new dlze(dnbmVar.e().a, dnbmVar.e().c), dnbmVar.a(), dnbmVar.d(), (ffix) null, 48), null, eqdVar, b, i2 & 896, 2);
                hfmVar.Z();
            } else {
                b.v(-1684764620);
                dnum.b(dnbmVar.n(), null, hpx.d(-556514838, new dnbr(dnbmVar, obj, eqdVar, inpVar), b), b, 384);
                hfmVar.Z();
            }
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dnbp
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dnbm dnbmVar2 = dnbm.this;
                    Object obj4 = obj;
                    int i5 = i;
                    dnbu.e(dnbmVar2, obj4, eqdVar, (hfd) obj2, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
