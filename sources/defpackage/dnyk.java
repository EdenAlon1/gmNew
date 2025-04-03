package defpackage;

import androidx.compose.foundation.layout.AspectRatioElement;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyk {
    public static final void a(final dnym dnymVar, hvi hviVar, int i, boolean z, hfd hfdVar, final int i2, final int i3) {
        int i4;
        hvi hviVar2;
        final boolean z2;
        int i5 = i3 & 1;
        hfd b = hfdVar.b(92906746);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != b.D(dnymVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != b.B(i) ? 128 : 256;
        }
        int i8 = i3 & 8;
        boolean z3 = i8 == 0;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
            z2 = z;
        } else {
            if (i6 != 0) {
                hviVar = hvi.e;
            }
            if (i7 != 0) {
                i = 4;
            }
            boolean z4 = z3 & z;
            b.v(357181432);
            if (z4) {
                hve hveVar = hvi.e;
                b.v(-1650673008);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new ffji() { // from class: dnxx
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            idd iddVar = (idd) obj;
                            iddVar.getClass();
                            iddVar.s(1);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                hviVar2 = hviVar.a(icf.a(hveVar, (ffji) R));
            } else {
                hviVar2 = hviVar;
            }
            ((hfm) b).Z();
            dncx.a(hviVar2, hpx.d(534478007, new dnyj(dnymVar, i, z4), b), b, 432);
            z2 = z4;
        }
        final int i9 = i;
        hio L = b.L();
        if (L != null) {
            final hvi hviVar3 = hviVar;
            L.d = new ffjm() { // from class: dnxy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnym dnymVar2 = dnym.this;
                    hvi hviVar4 = hviVar3;
                    int i10 = i9;
                    dnyk.a(dnymVar2, hviVar4, i10, z2, (hfd) obj, hip.a(i2 | 1), i3);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(hvi hviVar, dnyl dnylVar, final ffjn ffjnVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        hvi a;
        ffjnVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(523461458);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(dnylVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.F(ffjnVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            if (i4 != 0) {
                hviVar = hvi.e;
            }
            if (i5 != 0) {
                dnylVar = dnyl.a;
            }
            b.v(-1518019052);
            a = ebs.z(hviVar, null, 3).a(new AspectRatioElement(1.0f));
            hvi a2 = hxo.a(a, i(dnylVar));
            int i6 = huo.a;
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a2);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ffjnVar.a(dyi.a, b, Integer.valueOf((((((i3 & 1022) << 3) & 7168) >> 6) & 112) | 6));
            b.n();
            hfmVar.Z();
        }
        final dnyl dnylVar2 = dnylVar;
        hio L = b.L();
        if (L != null) {
            final hvi hviVar2 = hviVar;
            L.d = new ffjm() { // from class: dnyb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dnyl dnylVar3 = dnylVar2;
                    dnyk.b(hviVar3, dnylVar3, ffjnVar, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1801762240);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dym.a(null, null, hpx.d(-1207309014, new dnyg(z, ffjnVar), b), b, 3072, 7);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnxz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i4 = i;
                    dnyk.c(z2, ffjnVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final ffjm ffjmVar, final ffjm ffjmVar2, final float f, final hvi hviVar, dnyl dnylVar, hfd hfdVar, final int i) {
        int i2;
        dnyl dnylVar2;
        hvi a;
        hvi c;
        hvi a2;
        hvi a3;
        hvi a4;
        ffjmVar.getClass();
        ffjmVar2.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1238085463);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            dnylVar2 = dnylVar;
            i2 |= true != b.D(dnylVar2) ? 8192 : 16384;
        } else {
            dnylVar2 = dnylVar;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            float h = h(f);
            b.v(-1518019052);
            a = ebs.z(hviVar, null, 3).a(new AspectRatioElement(1.0f));
            hvi a5 = hxo.a(a, i(dnylVar2));
            int i4 = huo.a;
            ipn a6 = dyc.a(hum.a, false);
            int a7 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a5);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf = Integer.valueOf(a7);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar3);
            }
            hlc.b(b, b2, iss.c);
            c = ebs.c(hvi.e, 1.0f);
            ipn a8 = ebm.a(dxu.a, hum.m, b, 0);
            int a9 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, c);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a8, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a9))) {
                Integer valueOf2 = Integer.valueOf(a9);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar4);
            }
            hlc.b(b, b3, iss.c);
            ebr ebrVar = ebr.a;
            a2 = ebrVar.a(hvi.e, h, true);
            ipn a10 = dyc.a(hum.a, false);
            int a11 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b4 = huz.b(b, a2);
            ffix ffixVar3 = iss.a;
            b.x();
            int i6 = i2;
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a10, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a11))) {
                Integer valueOf3 = Integer.valueOf(a11);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar5);
            }
            hlc.b(b, b4, iss.c);
            ffjmVar.a(b, Integer.valueOf(i6 & 14));
            b.n();
            a3 = ebrVar.a(hvi.e, f, true);
            ebv.a(a3, b);
            a4 = ebrVar.a(hvi.e, h, true);
            ipn a12 = dyc.a(hum.a, false);
            int a13 = hey.a(b);
            hqb ai4 = hfmVar.ai();
            hvi b5 = huz.b(b, a4);
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar4);
            } else {
                b.z();
            }
            hlc.b(b, a12, iss.e);
            hlc.b(b, ai4, iss.d);
            ffjm ffjmVar6 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a13))) {
                Integer valueOf4 = Integer.valueOf(a13);
                hfmVar.ad(valueOf4);
                b.h(valueOf4, ffjmVar6);
            }
            hlc.b(b, b5, iss.c);
            ffjmVar2.a(b, Integer.valueOf((i6 >> 3) & 14));
            b.n();
            b.n();
            b.n();
            hfmVar.Z();
        }
        hio L = b.L();
        if (L != null) {
            final dnyl dnylVar3 = dnylVar2;
            L.d = new ffjm() { // from class: dnyd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffjm ffjmVar7 = ffjm.this;
                    ffjm ffjmVar8 = ffjmVar2;
                    float f2 = f;
                    hvi hviVar2 = hviVar;
                    dnyk.d(ffjmVar7, ffjmVar8, f2, hviVar2, dnylVar3, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final ffjm ffjmVar, final ffjm ffjmVar2, final ffjm ffjmVar3, final ffjm ffjmVar4, final float f, final hvi hviVar, dnyl dnylVar, hfd hfdVar, final int i) {
        int i2;
        dnyl dnylVar2;
        hvi a;
        hvi c;
        hvi a2;
        hvi b;
        hvi b2;
        hvi b3;
        hvi a3;
        hvi a4;
        hvi b4;
        hvi b5;
        hvi b6;
        ffjmVar.getClass();
        ffjmVar2.getClass();
        ffjmVar3.getClass();
        ffjmVar4.getClass();
        int i3 = i & 6;
        hfd b7 = hfdVar.b(726106781);
        if (i3 == 0) {
            i2 = (true != b7.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b7.F(ffjmVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b7.F(ffjmVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b7.F(ffjmVar4) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b7.A(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b7.D(hviVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            dnylVar2 = dnylVar;
            i2 |= true != b7.D(dnylVar2) ? 524288 : 1048576;
        } else {
            dnylVar2 = dnylVar;
        }
        if ((599187 & i2) == 599186 && b7.I()) {
            b7.s();
        } else {
            float h = h(f);
            b7.v(-1518019052);
            a = ebs.z(hviVar, null, 3).a(new AspectRatioElement(1.0f));
            hvi a5 = hxo.a(a, i(dnylVar2));
            int i4 = huo.a;
            ipn a6 = dyc.a(hum.a, false);
            int a7 = hey.a(b7);
            hfm hfmVar = (hfm) b7;
            hqb ai = hfmVar.ai();
            hvi b8 = huz.b(b7, a5);
            int i5 = ist.a;
            int i6 = i2;
            ffix ffixVar = iss.a;
            b7.x();
            if (hfmVar.z) {
                b7.j(ffixVar);
            } else {
                b7.z();
            }
            hlc.b(b7, a6, iss.e);
            hlc.b(b7, ai, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf = Integer.valueOf(a7);
                hfmVar.ad(valueOf);
                b7.h(valueOf, ffjmVar5);
            }
            hlc.b(b7, b8, iss.c);
            c = ebs.c(hvi.e, 1.0f);
            ipn a8 = ebm.a(dxu.a, hum.m, b7, 0);
            int a9 = hey.a(b7);
            hqb ai2 = hfmVar.ai();
            hvi b9 = huz.b(b7, c);
            ffix ffixVar2 = iss.a;
            b7.x();
            if (hfmVar.z) {
                b7.j(ffixVar2);
            } else {
                b7.z();
            }
            hlc.b(b7, a8, iss.e);
            hlc.b(b7, ai2, iss.d);
            ffjm ffjmVar6 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a9))) {
                Integer valueOf2 = Integer.valueOf(a9);
                hfmVar.ad(valueOf2);
                b7.h(valueOf2, ffjmVar6);
            }
            hlc.b(b7, b9, iss.c);
            ebr ebrVar = ebr.a;
            a2 = ebrVar.a(hvi.e, h, true);
            ipn a10 = dyo.a(dxu.c, hum.j, b7, 0);
            int a11 = hey.a(b7);
            hqb ai3 = hfmVar.ai();
            hvi b10 = huz.b(b7, a2);
            ffix ffixVar3 = iss.a;
            b7.x();
            if (hfmVar.z) {
                b7.j(ffixVar3);
            } else {
                b7.z();
            }
            hlc.b(b7, a10, iss.e);
            hlc.b(b7, ai3, iss.d);
            ffjm ffjmVar7 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a11))) {
                Integer valueOf3 = Integer.valueOf(a11);
                hfmVar.ad(valueOf3);
                b7.h(valueOf3, ffjmVar7);
            }
            hlc.b(b7, b10, iss.c);
            b = dys.b(hvi.e, h, true);
            ipn a12 = dyc.a(hum.a, false);
            int a13 = hey.a(b7);
            hqb ai4 = hfmVar.ai();
            hvi b11 = huz.b(b7, b);
            ffix ffixVar4 = iss.a;
            b7.x();
            if (hfmVar.z) {
                b7.j(ffixVar4);
            } else {
                b7.z();
            }
            hlc.b(b7, a12, iss.e);
            hlc.b(b7, ai4, iss.d);
            ffjm ffjmVar8 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a13))) {
                Integer valueOf4 = Integer.valueOf(a13);
                hfmVar.ad(valueOf4);
                b7.h(valueOf4, ffjmVar8);
            }
            hlc.b(b7, b11, iss.c);
            ffjmVar.a(b7, Integer.valueOf(i6 & 14));
            b7.n();
            b2 = dys.b(hvi.e, f, true);
            ebv.a(b2, b7);
            b3 = dys.b(hvi.e, h, true);
            ipn a14 = dyc.a(hum.a, false);
            int a15 = hey.a(b7);
            hqb ai5 = hfmVar.ai();
            hvi b12 = huz.b(b7, b3);
            ffix ffixVar5 = iss.a;
            b7.x();
            if (hfmVar.z) {
                b7.j(ffixVar5);
            } else {
                b7.z();
            }
            hlc.b(b7, a14, iss.e);
            hlc.b(b7, ai5, iss.d);
            ffjm ffjmVar9 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a15))) {
                Integer valueOf5 = Integer.valueOf(a15);
                hfmVar.ad(valueOf5);
                b7.h(valueOf5, ffjmVar9);
            }
            hlc.b(b7, b12, iss.c);
            ffjmVar2.a(b7, Integer.valueOf((i6 >> 3) & 14));
            b7.n();
            b7.n();
            a3 = ebrVar.a(hvi.e, f, true);
            ebv.a(a3, b7);
            a4 = ebrVar.a(hvi.e, h, true);
            ipn a16 = dyo.a(dxu.c, hum.j, b7, 0);
            int a17 = hey.a(b7);
            hqb ai6 = hfmVar.ai();
            hvi b13 = huz.b(b7, a4);
            ffix ffixVar6 = iss.a;
            b7.x();
            if (hfmVar.z) {
                b7.j(ffixVar6);
            } else {
                b7.z();
            }
            hlc.b(b7, a16, iss.e);
            hlc.b(b7, ai6, iss.d);
            ffjm ffjmVar10 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a17))) {
                Integer valueOf6 = Integer.valueOf(a17);
                hfmVar.ad(valueOf6);
                b7.h(valueOf6, ffjmVar10);
            }
            hlc.b(b7, b13, iss.c);
            b4 = dys.b(hvi.e, h, true);
            ipn a18 = dyc.a(hum.a, false);
            int a19 = hey.a(b7);
            hqb ai7 = hfmVar.ai();
            hvi b14 = huz.b(b7, b4);
            ffix ffixVar7 = iss.a;
            b7.x();
            if (hfmVar.z) {
                b7.j(ffixVar7);
            } else {
                b7.z();
            }
            hlc.b(b7, a18, iss.e);
            hlc.b(b7, ai7, iss.d);
            ffjm ffjmVar11 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a19))) {
                Integer valueOf7 = Integer.valueOf(a19);
                hfmVar.ad(valueOf7);
                b7.h(valueOf7, ffjmVar11);
            }
            hlc.b(b7, b14, iss.c);
            ffjmVar3.a(b7, Integer.valueOf((i6 >> 6) & 14));
            b7.n();
            b5 = dys.b(hvi.e, f, true);
            ebv.a(b5, b7);
            b6 = dys.b(hvi.e, h, true);
            ipn a20 = dyc.a(hum.a, false);
            int a21 = hey.a(b7);
            hqb ai8 = hfmVar.ai();
            hvi b15 = huz.b(b7, b6);
            ffix ffixVar8 = iss.a;
            b7.x();
            if (hfmVar.z) {
                b7.j(ffixVar8);
            } else {
                b7.z();
            }
            hlc.b(b7, a20, iss.e);
            hlc.b(b7, ai8, iss.d);
            ffjm ffjmVar12 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a21))) {
                Integer valueOf8 = Integer.valueOf(a21);
                hfmVar.ad(valueOf8);
                b7.h(valueOf8, ffjmVar12);
            }
            hlc.b(b7, b15, iss.c);
            ffjmVar4.a(b7, Integer.valueOf((i6 >> 9) & 14));
            b7.n();
            b7.n();
            b7.n();
            b7.n();
            hfmVar.Z();
        }
        hio L = b7.L();
        if (L != null) {
            final dnyl dnylVar3 = dnylVar2;
            L.d = new ffjm() { // from class: dnyc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffjm ffjmVar13 = ffjm.this;
                    ffjm ffjmVar14 = ffjmVar2;
                    ffjm ffjmVar15 = ffjmVar3;
                    ffjm ffjmVar16 = ffjmVar4;
                    float f2 = f;
                    hvi hviVar2 = hviVar;
                    dnyk.e(ffjmVar13, ffjmVar14, ffjmVar15, ffjmVar16, f2, hviVar2, dnylVar3, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final ffjm ffjmVar, final ffjm ffjmVar2, final ffjm ffjmVar3, final float f, final hvi hviVar, dnyl dnylVar, hfd hfdVar, final int i) {
        int i2;
        dnyl dnylVar2;
        hvi a;
        hvi c;
        hvi a2;
        hvi a3;
        hvi a4;
        hvi b;
        hvi b2;
        hvi b3;
        ffjmVar.getClass();
        ffjmVar2.getClass();
        ffjmVar3.getClass();
        int i3 = i & 6;
        hfd b4 = hfdVar.b(165983605);
        if (i3 == 0) {
            i2 = (true != b4.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b4.F(ffjmVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b4.F(ffjmVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b4.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b4.D(hviVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            dnylVar2 = dnylVar;
            i2 |= true != b4.D(dnylVar2) ? 65536 : 131072;
        } else {
            dnylVar2 = dnylVar;
        }
        if ((74899 & i2) == 74898 && b4.I()) {
            b4.s();
        } else {
            float h = h(f);
            b4.v(-1518019052);
            a = ebs.z(hviVar, null, 3).a(new AspectRatioElement(1.0f));
            hvi a5 = hxo.a(a, i(dnylVar2));
            int i4 = huo.a;
            ipn a6 = dyc.a(hum.a, false);
            int a7 = hey.a(b4);
            hfm hfmVar = (hfm) b4;
            hqb ai = hfmVar.ai();
            hvi b5 = huz.b(b4, a5);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b4.x();
            int i6 = i2;
            if (hfmVar.z) {
                b4.j(ffixVar);
            } else {
                b4.z();
            }
            hlc.b(b4, a6, iss.e);
            hlc.b(b4, ai, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf = Integer.valueOf(a7);
                hfmVar.ad(valueOf);
                b4.h(valueOf, ffjmVar4);
            }
            hlc.b(b4, b5, iss.c);
            c = ebs.c(hvi.e, 1.0f);
            ipn a8 = ebm.a(dxu.a, hum.m, b4, 0);
            int a9 = hey.a(b4);
            hqb ai2 = hfmVar.ai();
            hvi b6 = huz.b(b4, c);
            ffix ffixVar2 = iss.a;
            b4.x();
            if (hfmVar.z) {
                b4.j(ffixVar2);
            } else {
                b4.z();
            }
            hlc.b(b4, a8, iss.e);
            hlc.b(b4, ai2, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a9))) {
                Integer valueOf2 = Integer.valueOf(a9);
                hfmVar.ad(valueOf2);
                b4.h(valueOf2, ffjmVar5);
            }
            hlc.b(b4, b6, iss.c);
            ebr ebrVar = ebr.a;
            a2 = ebrVar.a(hvi.e, h, true);
            ipn a10 = dyc.a(hum.a, false);
            int a11 = hey.a(b4);
            hqb ai3 = hfmVar.ai();
            hvi b7 = huz.b(b4, a2);
            ffix ffixVar3 = iss.a;
            b4.x();
            if (hfmVar.z) {
                b4.j(ffixVar3);
            } else {
                b4.z();
            }
            hlc.b(b4, a10, iss.e);
            hlc.b(b4, ai3, iss.d);
            ffjm ffjmVar6 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a11))) {
                Integer valueOf3 = Integer.valueOf(a11);
                hfmVar.ad(valueOf3);
                b4.h(valueOf3, ffjmVar6);
            }
            hlc.b(b4, b7, iss.c);
            ffjmVar.a(b4, Integer.valueOf(i6 & 14));
            b4.n();
            a3 = ebrVar.a(hvi.e, f, true);
            ebv.a(a3, b4);
            a4 = ebrVar.a(hvi.e, h, true);
            ipn a12 = dyo.a(dxu.c, hum.j, b4, 0);
            int a13 = hey.a(b4);
            hqb ai4 = hfmVar.ai();
            hvi b8 = huz.b(b4, a4);
            ffix ffixVar4 = iss.a;
            b4.x();
            if (hfmVar.z) {
                b4.j(ffixVar4);
            } else {
                b4.z();
            }
            hlc.b(b4, a12, iss.e);
            hlc.b(b4, ai4, iss.d);
            ffjm ffjmVar7 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a13))) {
                Integer valueOf4 = Integer.valueOf(a13);
                hfmVar.ad(valueOf4);
                b4.h(valueOf4, ffjmVar7);
            }
            hlc.b(b4, b8, iss.c);
            b = dys.b(hvi.e, h, true);
            ipn a14 = dyc.a(hum.a, false);
            int a15 = hey.a(b4);
            hqb ai5 = hfmVar.ai();
            hvi b9 = huz.b(b4, b);
            ffix ffixVar5 = iss.a;
            b4.x();
            if (hfmVar.z) {
                b4.j(ffixVar5);
            } else {
                b4.z();
            }
            hlc.b(b4, a14, iss.e);
            hlc.b(b4, ai5, iss.d);
            ffjm ffjmVar8 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a15))) {
                Integer valueOf5 = Integer.valueOf(a15);
                hfmVar.ad(valueOf5);
                b4.h(valueOf5, ffjmVar8);
            }
            hlc.b(b4, b9, iss.c);
            ffjmVar2.a(b4, Integer.valueOf((i6 >> 3) & 14));
            b4.n();
            b2 = dys.b(hvi.e, f, true);
            ebv.a(b2, b4);
            b3 = dys.b(hvi.e, h, true);
            ipn a16 = dyc.a(hum.a, false);
            int a17 = hey.a(b4);
            hqb ai6 = hfmVar.ai();
            hvi b10 = huz.b(b4, b3);
            ffix ffixVar6 = iss.a;
            b4.x();
            if (hfmVar.z) {
                b4.j(ffixVar6);
            } else {
                b4.z();
            }
            hlc.b(b4, a16, iss.e);
            hlc.b(b4, ai6, iss.d);
            ffjm ffjmVar9 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a17))) {
                Integer valueOf6 = Integer.valueOf(a17);
                hfmVar.ad(valueOf6);
                b4.h(valueOf6, ffjmVar9);
            }
            hlc.b(b4, b10, iss.c);
            ffjmVar3.a(b4, Integer.valueOf((i6 >> 6) & 14));
            b4.n();
            b4.n();
            b4.n();
            b4.n();
            hfmVar.Z();
        }
        hio L = b4.L();
        if (L != null) {
            final dnyl dnylVar3 = dnylVar2;
            L.d = new ffjm() { // from class: dnya
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffjm ffjmVar10 = ffjm.this;
                    ffjm ffjmVar11 = ffjmVar2;
                    ffjm ffjmVar12 = ffjmVar3;
                    float f2 = f;
                    hvi hviVar2 = hviVar;
                    dnyk.f(ffjmVar10, ffjmVar11, ffjmVar12, f2, hviVar2, dnylVar3, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final float h(float f) {
        return (1.0f - f) / 2.0f;
    }

    private static final idh i(dnyl dnylVar) {
        int ordinal = dnylVar.ordinal();
        if (ordinal == 0) {
            return eqm.a;
        }
        if (ordinal == 1) {
            return idb.a;
        }
        if (ordinal == 2) {
            return eqm.b(24.0f);
        }
        throw new ffcd();
    }
}
