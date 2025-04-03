package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwjo {
    public static final dwjo a = new dwjo();

    private dwjo() {
    }

    public final void a(final String str, final ffjm ffjmVar, final boolean z, final jwn jwnVar, final dwn dwnVar, final ffjm ffjmVar2, idh idhVar, gqr gqrVar, final ebe ebeVar, final ffjm ffjmVar3, hfd hfdVar, final int i, final int i2) {
        String str2;
        int i3;
        dwn dwnVar2;
        ffjm ffjmVar4;
        int i4;
        ebe ebeVar2;
        int i5;
        ffjm ffjmVar5;
        int i6;
        long f;
        long f2;
        long f3;
        long f4;
        long f5;
        long f6;
        long f7;
        long f8;
        long f9;
        hfd hfdVar2;
        long j;
        long f10;
        long f11;
        long f12;
        long f13;
        long f14;
        long f15;
        long f16;
        long f17;
        long f18;
        gqr gqrVar2;
        hfd hfdVar3;
        final idh idhVar2;
        final gqr gqrVar3;
        str.getClass();
        dwnVar.getClass();
        hfd b = hfdVar.b(1762682885);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (true != b.D(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.D(jwnVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            dwnVar2 = dwnVar;
            i3 |= true != b.D(dwnVar2) ? 65536 : 131072;
        } else {
            dwnVar2 = dwnVar;
        }
        int i7 = i & 100663296;
        int i8 = i3 | 14155776;
        int i9 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
        if (i7 == 0) {
            ffjmVar4 = ffjmVar2;
            i4 = 196608;
            i8 |= true != b.F(ffjmVar4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 67108864;
        } else {
            ffjmVar4 = ffjmVar2;
            i4 = 196608;
        }
        int i10 = i2 | 3510;
        if ((i2 & 24576) == 0) {
            i10 = i2 | 11702;
        }
        if ((i2 & i4) == 0) {
            i10 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            ebeVar2 = ebeVar;
            i5 = 100663296;
            i10 |= true != b.D(ebeVar2) ? 524288 : 1048576;
        } else {
            ebeVar2 = ebeVar;
            i5 = 100663296;
        }
        if ((12582912 & i2) == 0) {
            ffjmVar5 = ffjmVar3;
            i10 |= true != b.F(ffjmVar5) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar5 = ffjmVar3;
        }
        if ((i2 & i5) == 0) {
            if (true != b.D(this)) {
                i9 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            }
            i10 |= i9;
        }
        int i11 = i8 | 805306368;
        if ((306783379 & i11) == 306783378 && (38347923 & i10) == 38347922 && b.I()) {
            b.s();
            idhVar2 = idhVar;
            gqrVar3 = gqrVar;
            hfdVar3 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                b.v(46991273);
                idh b2 = dwiq.b(6, b);
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                i6 = i11;
                b.v(616122571);
                long c = dwfv.c(18, b);
                long c2 = dwfv.c(18, b);
                idhVar = b2;
                f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.38f, ibw.f(dwfv.c(18, b)));
                long c3 = dwfv.c(18, b);
                long c4 = dwfv.c(39, b);
                long c5 = dwfv.c(39, b);
                long c6 = dwfv.c(39, b);
                long c7 = dwfv.c(39, b);
                long c8 = dwfv.c(26, b);
                long c9 = dwfv.c(2, b);
                fhz fhzVar = (fhz) b.e(fib.a);
                long c10 = dwfv.c(26, b);
                long c11 = dwfv.c(19, b);
                f2 = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.38f, ibw.f(dwfv.c(18, b)));
                long c12 = dwfv.c(2, b);
                long c13 = dwfv.c(19, b);
                long c14 = dwfv.c(19, b);
                f3 = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.38f, ibw.f(dwfv.c(18, b)));
                long c15 = dwfv.c(19, b);
                long c16 = dwfv.c(19, b);
                long c17 = dwfv.c(19, b);
                f4 = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.38f, ibw.f(dwfv.c(18, b)));
                long c18 = dwfv.c(2, b);
                long c19 = dwfv.c(26, b);
                long c20 = dwfv.c(19, b);
                f5 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(dwfv.c(18, b)));
                long c21 = dwfv.c(2, b);
                long c22 = dwfv.c(19, b);
                long c23 = dwfv.c(19, b);
                f6 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(dwfv.c(18, b)));
                long c24 = dwfv.c(19, b);
                long c25 = dwfv.c(19, b);
                long c26 = dwfv.c(19, b);
                f7 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(dwfv.c(18, b)));
                long c27 = dwfv.c(2, b);
                long c28 = dwfv.c(19, b);
                long c29 = dwfv.c(19, b);
                f8 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(dwfv.c(19, b)));
                long c30 = dwfv.c(19, b);
                long c31 = dwfv.c(19, b);
                long c32 = dwfv.c(19, b);
                f9 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(dwfv.c(19, b)));
                long c33 = dwfv.c(19, b);
                fxz a2 = gft.a(b);
                fhz fhzVar2 = (fhz) b.e(fib.a);
                hfdVar2 = b;
                gqr gqrVar4 = a2.ad;
                if (gqrVar4 != null) {
                    j = f9;
                    if (!ffkj.e(gqrVar4.e, fhzVar2)) {
                        gqrVar4 = gqrVar4.c(gqrVar4.L, gqrVar4.M, gqrVar4.N, gqrVar4.O, gqrVar4.a, gqrVar4.b, gqrVar4.c, gqrVar4.d, gqrVar4.P, gqrVar4.Q, fhzVar2, gqrVar4.f, gqrVar4.g, gqrVar4.h, gqrVar4.i, gqrVar4.j, gqrVar4.k, gqrVar4.l, gqrVar4.m, gqrVar4.n, gqrVar4.o, gqrVar4.p, gqrVar4.q, gqrVar4.r, gqrVar4.s, gqrVar4.t, gqrVar4.u, gqrVar4.v, gqrVar4.w, gqrVar4.x, gqrVar4.y, gqrVar4.z, gqrVar4.A, gqrVar4.B, gqrVar4.C, gqrVar4.D, gqrVar4.E, gqrVar4.F, gqrVar4.G, gqrVar4.H, gqrVar4.I, gqrVar4.J, gqrVar4.K);
                        a2.ad = gqrVar4;
                    }
                } else {
                    j = f9;
                    long g = fyc.g(a2, 18);
                    long g2 = fyc.g(a2, 18);
                    f10 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(fyc.g(a2, 18)));
                    long g3 = fyc.g(a2, 18);
                    long g4 = fyc.g(a2, 39);
                    long g5 = fyc.g(a2, 39);
                    long g6 = fyc.g(a2, 39);
                    long g7 = fyc.g(a2, 39);
                    long g8 = fyc.g(a2, 26);
                    long g9 = fyc.g(a2, 2);
                    long g10 = fyc.g(a2, 26);
                    long g11 = fyc.g(a2, 19);
                    f11 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a2, 18)));
                    long g12 = fyc.g(a2, 2);
                    long g13 = fyc.g(a2, 19);
                    long g14 = fyc.g(a2, 19);
                    f12 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a2, 18)));
                    long g15 = fyc.g(a2, 19);
                    long g16 = fyc.g(a2, 19);
                    long g17 = fyc.g(a2, 19);
                    f13 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a2, 18)));
                    long g18 = fyc.g(a2, 2);
                    long g19 = fyc.g(a2, 26);
                    long g20 = fyc.g(a2, 19);
                    f14 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a2, 18)));
                    long g21 = fyc.g(a2, 2);
                    long g22 = fyc.g(a2, 19);
                    long g23 = fyc.g(a2, 19);
                    f15 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a2, 18)));
                    long g24 = fyc.g(a2, 19);
                    long g25 = fyc.g(a2, 19);
                    long g26 = fyc.g(a2, 19);
                    f16 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a2, 18)));
                    long g27 = fyc.g(a2, 2);
                    long g28 = fyc.g(a2, 19);
                    long g29 = fyc.g(a2, 19);
                    f17 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a2, 19)));
                    long g30 = fyc.g(a2, 19);
                    long g31 = fyc.g(a2, 19);
                    long g32 = fyc.g(a2, 19);
                    f18 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.38f, ibw.f(fyc.g(a2, 19)));
                    gqrVar4 = new gqr(g, g2, f10, g3, g4, g5, g6, g7, g8, g9, fhzVar2, g10, g11, f11, g12, g13, g14, f12, g15, g16, g17, f13, g18, g19, g20, f14, g21, g22, g23, f15, g24, g25, g26, f16, g27, g28, g29, f17, g30, g31, g32, f18, fyc.g(a2, 19));
                    a2.ad = gqrVar4;
                }
                gqr c34 = gqrVar4.c(c, c2, f, c3, c4, c5, c6, c7, c8, c9, fhzVar, c10, c11, f2, c12, c13, c14, f3, c15, c16, c17, f4, c18, c19, c20, f5, c21, c22, c23, f6, c24, c25, c26, f7, c27, c28, c29, f8, c30, c31, c32, j, c33);
                hfmVar.Z();
                gqrVar2 = c34;
            } else {
                b.s();
                gqrVar2 = gqrVar;
                hfdVar2 = b;
                i6 = i11;
            }
            idh idhVar3 = idhVar;
            hfdVar2.l();
            hfdVar3 = hfdVar2;
            gqu.a.a(str2, ffjmVar, z, jwnVar, dwnVar2, ffjmVar4, idhVar3, gqrVar2, ebeVar2, ffjmVar5, hfdVar3, i6 & 2147483646, (i10 & 14) | i5 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (3670016 & i10) | (29360128 & i10));
            idhVar2 = idhVar3;
            gqrVar3 = gqrVar2;
        }
        hio L = hfdVar3.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwjn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    hfd hfdVar4 = (hfd) obj;
                    ((Integer) obj2).intValue();
                    dwjo dwjoVar = dwjo.this;
                    String str3 = str;
                    ffjm ffjmVar6 = ffjmVar;
                    boolean z2 = z;
                    jwn jwnVar2 = jwnVar;
                    dwn dwnVar3 = dwnVar;
                    ffjm ffjmVar7 = ffjmVar2;
                    idh idhVar4 = idhVar2;
                    gqr gqrVar5 = gqrVar3;
                    ebe ebeVar3 = ebeVar;
                    int i12 = i;
                    dwjoVar.a(str3, ffjmVar6, z2, jwnVar2, dwnVar3, ffjmVar7, idhVar4, gqrVar5, ebeVar3, ffjmVar3, hfdVar4, hip.a(i12 | 1), hip.a(i2));
                    return ffcu.a;
                }
            };
        }
    }
}
