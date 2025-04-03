package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dorb {
    public static final void a(final List list, final long j, final ffix ffixVar, hfd hfdVar, final int i) {
        List<doqp> list2;
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1817902522);
        if (i3 == 0) {
            list2 = list;
            i2 = (true != b.F(list2) ? 2 : 4) | i;
        } else {
            list2 = list;
            i2 = i;
        }
        long j2 = j;
        if ((i & 48) == 0) {
            i2 |= true != b.C(j2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            hve hveVar = hvi.e;
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 0);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            b.v(-1524325365);
            for (final doqp doqpVar : list2) {
                String str = doqpVar.a;
                b.v(-1524322426);
                boolean F = b.F(ffskVar) | b.D(doqpVar);
                boolean z = (i2 & 896) == 256;
                Object R2 = hfmVar.R();
                if ((F | z) || R2 == hfc.a) {
                    R2 = new ffix() { // from class: doqr
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffqy.d(ffsk.this, null, null, new doqz(doqpVar, ffixVar, null), 3);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                b(str, j2, (ffix) R2, b, i2 & 112);
                j2 = j;
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doqs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list3 = list;
                    long j3 = j;
                    dorb.a(list3, j3, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, final long j, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1212533791);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 128 : 256;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            ebe ebeVar = dwfd.a;
            dwfj.e(ffixVar2, null, false, null, dwfd.f(j, b, 13), null, hpx.d(784463516, new dora(str), b), b, ((i2 >> 6) & 14) | 805306368, 494);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doqt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    long j2 = j;
                    dorb.b(str2, j2, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dorc dorcVar, hvi hviVar, long j, long j2, long j3, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        long j4;
        long j5;
        long j6;
        hvi hviVar2;
        final hvi hviVar3;
        hfd hfdVar2;
        final long j7;
        final long j8;
        final long j9;
        ffjmVar.getClass();
        hfd b = hfdVar.b(-7607429);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dorcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b.F(ffjmVar) ? 65536 : 131072;
        }
        int i4 = i3;
        if ((74899 & i4) == 74898 && b.I()) {
            b.s();
            hviVar3 = hviVar;
            j9 = j;
            j7 = j2;
            j8 = j3;
            hfdVar2 = b;
        } else {
            int i5 = i4 & (-65409);
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hve hveVar = hvi.e;
                j4 = gft.a(b).p;
                j5 = gft.a(b).s;
                j6 = gft.a(b).a;
                hviVar2 = hveVar;
            } else {
                b.s();
                hviVar2 = hviVar;
                j4 = j;
                j5 = j2;
                j6 = j3;
            }
            b.l();
            b.u(-930640665, true);
            float f = gvc.a;
            dif difVar = gzn.a;
            dif difVar2 = gzn.a;
            boolean E = b.E(true) | b.D(difVar2);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (E || R == hfc.a) {
                R = new gvi(difVar2);
                hfmVar.ad(R);
            }
            gvi gviVar = (gvi) R;
            hfmVar.Z();
            float f2 = dwkb.a;
            b.v(2063781281);
            int eo = ((jzn) b.e(jdr.e)).eo(4.0f);
            b.v(104586924);
            boolean B = b.B(eo);
            Object R2 = hfmVar.R();
            if (B || R2 == hfc.a) {
                R2 = new dwka(eo);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hfmVar.Z();
            long j10 = j4;
            long j11 = j5;
            long j12 = j6;
            int i6 = i5 << 6;
            hvi hviVar4 = hviVar2;
            dwke.b((dwka) R2, hpx.d(-357042320, new doqx(dorcVar, j4, j5, j6, gviVar), b), gviVar, hviVar4, false, false, ffjmVar, b, (i6 & 29360128) | (i6 & 7168) | 48);
            b.v(-930610781);
            boolean F = ((i4 & 14) == 4) | b.F(gviVar);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new doqy(dorcVar, gviVar, null);
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hgs.g(true, (ffjm) R3, b);
            hviVar3 = hviVar4;
            hfdVar2 = b;
            j7 = j11;
            j8 = j12;
            j9 = j10;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doqq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dorc dorcVar2 = dorc.this;
                    hvi hviVar5 = hviVar3;
                    long j13 = j9;
                    long j14 = j7;
                    long j15 = j8;
                    dorb.c(dorcVar2, hviVar5, j13, j14, j15, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
