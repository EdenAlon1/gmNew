package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokk {
    public static final void a(final List list, final int i, hfd hfdVar, final int i2) {
        int i3;
        hvi d;
        hvi a;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(-1195299037);
        if (i4 == 0) {
            i3 = (true != b.F(list) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            gpz gpzVar = (gpz) list.get(i);
            hkx b2 = cxo.b(gpzVar.b, cxu.c(250, 0, cyp.a, 2), b, 384, 8);
            hkx b3 = cxo.b(gpzVar.a, cxu.c(250, 0, cyp.a, 2), b, 384, 8);
            d = ebs.d(hvi.e, 1.0f);
            int i5 = huo.a;
            hvi e = ebs.e(ebs.o(eau.c(ebs.z(d, hum.g, 2), ((jzq) b3.a()).a + 16.0f, 0.0f, 2), ((jzq) b2.a()).a - 32.0f), 3.0f);
            b.v(2002590114);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffjn() { // from class: dojz
                    @Override // defpackage.ffjn
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        icv icvVar = (icv) obj;
                        iar iarVar = (iar) obj2;
                        icvVar.getClass();
                        ((kah) obj3).getClass();
                        icvVar.f(0.0f, Float.intBitsToFloat((int) (iarVar.a & 4294967295L)));
                        icvVar.d(0.0f, Float.intBitsToFloat((int) (iarVar.a & 4294967295L)) / 2.0f, Float.intBitsToFloat((int) (iarVar.a & 4294967295L)) / 2.0f, 0.0f, Float.intBitsToFloat((int) (iarVar.a & 4294967295L)), 0.0f);
                        long j = iarVar.a;
                        icvVar.e(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f);
                        long j2 = iarVar.a;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - (Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f);
                        long j3 = iarVar.a;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f;
                        long j4 = iarVar.a;
                        icvVar.d(intBitsToFloat, 0.0f, intBitsToFloat2, intBitsToFloat3, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)));
                        icvVar.f(0.0f, Float.intBitsToFloat((int) (iarVar.a & 4294967295L)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            a = dee.a(hxo.a(e, new eqi((ffjn) R)), gft.a(b).a, idb.a);
            dyc.b(a, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doka
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    int i6 = i2;
                    dokk.a(list2, i, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dojy dojyVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long j;
        long j2;
        final hvi hviVar2;
        hfd b = hfdVar.b(2075779516);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dojyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            final hve hveVar = hvi.e;
            Object[] objArr = new Object[0];
            b.v(248457634);
            int i4 = i3 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffix() { // from class: dokb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return new hhy(dojy.this.b);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hjz hjzVar = (hjz) hqr.c(objArr, null, (ffix) R, b, 0, 6);
            if (hjzVar.c() == -1) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dokc
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dojy dojyVar2 = dojy.this;
                            int i5 = i;
                            dokk.b(dojyVar2, hveVar, (hfd) obj, hip.a(i5 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(248462430);
            boolean D = b.D(hjzVar) | (i4 == 4);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new doke(dojyVar, hjzVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(dojyVar, (ffjm) R2, b);
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i6 = ist.a;
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
            int c = hjzVar.c();
            if (((Boolean) b.e(fyc.b)).booleanValue()) {
                b.v(537973206);
                j = dwji.a(b);
                hfmVar.Z();
            } else {
                b.v(538038802);
                j = gft.a(b).F;
                hfmVar.Z();
            }
            dwjm.a(c, null, j, 0L, 0.0f, hpx.d(675803448, new dokf(hjzVar), b), doij.a, hpx.d(1869325112, new dokj(dojyVar, hjzVar), b), b, 14376960, 10);
            if (dfq.a(b)) {
                b.v(539143642);
                j2 = dooy.e(b).F;
                hfmVar.Z();
            } else {
                b.v(539204929);
                j2 = dooy.e(b).S;
                hfmVar.Z();
            }
            dwgw.a(null, 0.0f, j2, b, 0, 3);
            b.n();
            hviVar2 = hveVar;
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dokd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dojy dojyVar2 = dojy.this;
                    int i7 = i;
                    dokk.b(dojyVar2, hviVar2, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
