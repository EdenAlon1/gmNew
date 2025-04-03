package defpackage;

import androidx.car.app.model.Alert;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flu {
    public static final /* synthetic */ int a = 0;
    private static final long b = kal.c(8);

    public static final int a(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, ebe ebeVar) {
        int max = Math.max(i3, Math.max(i5, kav.c(i4, 0, f)));
        ebf ebfVar = (ebf) ebeVar;
        float f3 = ebfVar.a * f2;
        return jzl.b(j, Math.max(i, Math.max(i2, ffln.b(kav.b(f3, Math.max(f3, i4 / 2.0f), f) + max + (ebfVar.b * f2)))));
    }

    public static final int b(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, ebe ebeVar) {
        return jzl.c(j, Math.max(i + Math.max(i3, Math.max(kav.c(i4, 0, f), i5)) + i2, ffln.b((i4 + ((ebeVar.b(kah.a) + ebeVar.c(kah.a)) * f2)) * f)));
    }

    public static final int c(int i, int i2) {
        return i == Integer.MAX_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : i - i2;
    }

    public static final void d(String str, ffji ffjiVar, hvi hviVar, boolean z, jpo jpoVar, ffjm ffjmVar, ffjm ffjmVar2, jwn jwnVar, euw euwVar, euv euvVar, int i, int i2, idh idhVar, fjj fjjVar, hfd hfdVar, int i3, int i4) {
        int i5;
        ffjm ffjmVar3;
        hfd hfdVar2;
        hvi hviVar2;
        boolean z2;
        jwn jwnVar2;
        euw euwVar2;
        euv euvVar2;
        int i6;
        int i7;
        idh idhVar2;
        fjj fjjVar2;
        idh idhVar3;
        int i8;
        int i9;
        long f;
        long f2;
        long f3;
        long f4;
        long f5;
        long f6;
        long f7;
        long f8;
        long f9;
        long f10;
        long f11;
        long f12;
        long f13;
        long f14;
        int i10;
        jpo jpoVar2;
        euw euwVar3;
        euv euvVar3;
        fjj fjjVar3;
        int i11;
        jwn jwnVar3;
        boolean z3;
        euw euwVar4;
        hfm hfmVar;
        long j;
        int i12 = i3 & 6;
        hfd b2 = hfdVar.b(-621914704);
        if (i12 == 0) {
            i5 = i3 | (true != b2.D(str) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != b2.F(ffjiVar) ? 16 : 32;
        }
        int i13 = i5 | 28032;
        if ((i3 & 196608) == 0) {
            i13 = i5 | 93568;
        }
        if ((i3 & 1572864) == 0) {
            i13 |= true != b2.F(ffjmVar) ? 524288 : 1048576;
        }
        int i14 = i13 | 113246208;
        if ((i3 & 805306368) == 0) {
            ffjmVar3 = ffjmVar2;
            i14 |= true != b2.F(ffjmVar3) ? 268435456 : 536870912;
        } else {
            ffjmVar3 = ffjmVar2;
        }
        int i15 = i14;
        int i16 = i4 | 28086;
        if ((i4 & 196608) == 0) {
            i16 = 93622 | i4;
        }
        int i17 = 14155776 | i16;
        if ((100663296 & i4) == 0) {
            i17 = i16 | 47710208;
        }
        if ((805306368 & i4) == 0) {
            i17 |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        int i18 = i17;
        if (b2.J(((i15 & 306783379) == 306783378 && (i18 & 306783379) == 306783378) ? false : true, i15 & 1)) {
            int i19 = i18 >> 18;
            int i20 = i18 & (-2114387969);
            b2.t();
            if ((i3 & 1) == 0 || b2.G()) {
                hve hveVar = hvi.e;
                jpo jpoVar3 = (jpo) b2.e(fqi.a);
                int i21 = jwn.d;
                jwn jwnVar4 = jwm.a;
                euw euwVar5 = euw.a;
                euv euvVar4 = euv.a;
                idhVar3 = fla.b(b2).a;
                i8 = 196608;
                i9 = i15;
                f = iby.f(ibw.d(r14), ibw.c(r14), ibw.b(r14), ((Number) b2.e(fiz.a)).floatValue(), ibw.f(((ibw) b2.e(fjb.a)).i));
                f2 = iby.f(ibw.d(f), ibw.c(f), ibw.b(f), fix.a(b2), ibw.f(f));
                long j2 = ibw.g;
                long h = fla.a(b2).h();
                long b3 = fla.a(b2).b();
                hviVar = hveVar;
                f3 = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), fix.b(b2), ibw.f(fla.a(b2).h()));
                f4 = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), fix.a(b2), ibw.f(fla.a(b2).g()));
                f5 = iby.f(ibw.d(f4), ibw.c(f4), ibw.b(f4), fix.a(b2), ibw.f(f4));
                long b4 = fla.a(b2).b();
                f6 = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.54f, ibw.f(fla.a(b2).g()));
                f7 = iby.f(ibw.d(f6), ibw.c(f6), ibw.b(f6), fix.a(b2), ibw.f(f6));
                f8 = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.54f, ibw.f(fla.a(b2).g()));
                f9 = iby.f(ibw.d(f8), ibw.c(f8), ibw.b(f8), fix.a(b2), ibw.f(f8));
                long b5 = fla.a(b2).b();
                f10 = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), fix.b(b2), ibw.f(fla.a(b2).h()));
                f11 = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), fix.c(b2), ibw.f(fla.a(b2).g()));
                f12 = iby.f(ibw.d(f11), ibw.c(f11), ibw.b(f11), fix.a(b2), ibw.f(f11));
                long b6 = fla.a(b2).b();
                f13 = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), fix.c(b2), ibw.f(fla.a(b2).g()));
                f14 = iby.f(ibw.d(f13), ibw.c(f13), ibw.b(f13), fix.a(b2), ibw.f(f13));
                fjj fjjVar4 = new fjj(f, f2, h, b3, f3, f4, b4, f5, f6, f7, f6, f8, f9, b5, j2, f10, f11, f12, b6, f13, f14);
                i10 = Integer.MAX_VALUE;
                jpoVar2 = jpoVar3;
                euwVar3 = euwVar5;
                euvVar3 = euvVar4;
                fjjVar3 = fjjVar4;
                i11 = 1;
                jwnVar3 = jwnVar4;
                z3 = true;
            } else {
                b2.s();
                z3 = z;
                jpoVar2 = jpoVar;
                jwnVar3 = jwnVar;
                euwVar3 = euwVar;
                i11 = i2;
                idhVar3 = idhVar;
                fjjVar3 = fjjVar;
                i8 = 196608;
                i9 = i15;
                euvVar3 = euvVar;
                i10 = i;
            }
            hvi hviVar3 = hviVar;
            b2.l();
            b2.v(-579485994);
            hfm hfmVar2 = (hfm) b2;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar2.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar2.Z();
            b2.v(674048659);
            long f15 = jpoVar2.f();
            if (f15 != 16) {
                euwVar4 = euwVar3;
                hfmVar = hfmVar2;
                j = f15;
            } else {
                euwVar4 = euwVar3;
                hfmVar = hfmVar2;
                j = ((ibw) fjjVar3.b(z3, b2).a()).i;
            }
            hfmVar.Z();
            jpo m = jpoVar2.m(new jpo(j, 0L, null, null, 0L, 0, 0L, 16777214));
            jpoVar = jpoVar2;
            hvi j3 = eba.j(jjs.c(hvi.e, true, flo.a), 0.0f, ((jzn) b2.e(jdr.e)).ef(b), 0.0f, 0.0f, 13);
            fok.a(3, b2);
            idh idhVar4 = idhVar3;
            fjj fjjVar5 = fjjVar3;
            int i22 = i20 << 12;
            euv euvVar5 = euvVar3;
            hfdVar2 = b2;
            i6 = i10;
            i7 = i11;
            jwn jwnVar5 = jwnVar3;
            euw euwVar6 = euwVar4;
            eri.d(str, ffjiVar, ebs.a(j3, 280.0f, 56.0f), z3, m, euwVar6, euvVar5, false, i6, i7, jwnVar5, null, dwnVar, new idl(((ibw) fjjVar3.a(b2).a()).i), hpx.d(1710364390, new flq(str, z3, jwnVar3, dwnVar, ffjmVar, ffjmVar3, idhVar3, fjjVar3), b2), hfdVar2, (i9 & 64638) | (3670016 & i22) | (29360128 & i22) | (i22 & 234881024), (i19 & 14) | i8 | (i18 & 112), 4096);
            hviVar2 = hviVar3;
            z2 = z3;
            euvVar2 = euvVar5;
            fjjVar2 = fjjVar5;
            idhVar2 = idhVar4;
            euwVar2 = euwVar6;
            jwnVar2 = jwnVar5;
        } else {
            hfdVar2 = b2;
            hfdVar2.s();
            hviVar2 = hviVar;
            z2 = z;
            jwnVar2 = jwnVar;
            euwVar2 = euwVar;
            euvVar2 = euvVar;
            i6 = i;
            i7 = i2;
            idhVar2 = idhVar;
            fjjVar2 = fjjVar;
        }
        jpo jpoVar4 = jpoVar;
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new flr(str, ffjiVar, hviVar2, z2, jpoVar4, ffjmVar, ffjmVar2, jwnVar2, euwVar2, euvVar2, i6, i7, idhVar2, fjjVar2, i3, i4);
        }
    }

    public static final void e(hvi hviVar, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, float f, ffji ffjiVar, ffjm ffjmVar4, ebe ebeVar, hfd hfdVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i & 6;
        hfd b2 = hfdVar.b(-2049536174);
        if (i5 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b2.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b2.F(ffjmVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b2.F(ffjmVar3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b2.E(false) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b2.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b2.F(ffjiVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b2.F(ffjmVar4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b2.D(ebeVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (b2.J(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i6 = i3 >> 3;
            boolean z = (234881024 & i3) == 67108864;
            boolean z2 = (3670016 & i3) == 1048576;
            int i7 = i3;
            boolean z3 = (29360128 & i3) == 8388608;
            boolean z4 = (i4 & 14) == 4;
            hfm hfmVar = (hfm) b2;
            boolean z5 = z3;
            Object R = hfmVar.R();
            if ((z | z2 | z5 | z4) || R == hfc.a) {
                R = new fma(ffjiVar, f, ebeVar);
                hfmVar.ad(R);
            }
            fma fmaVar = (fma) R;
            kah kahVar = (kah) b2.e(jdr.j);
            int a2 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, hviVar);
            int i8 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, fmaVar, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar5);
            }
            hlc.b(b2, b3, iss.c);
            ffjmVar4.a(b2, Integer.valueOf((i7 >> 27) & 14));
            b2.v(-978146092);
            hfmVar.Z();
            if (ffjmVar3 != null) {
                b2.v(-978103405);
                hvi a3 = fky.a(ioe.a(hvi.e, "Trailing"));
                int i9 = huo.a;
                ipn a4 = dyc.a(hum.e, false);
                int a5 = hey.a(b2);
                hqb ai2 = hfmVar.ai();
                hvi b4 = huz.b(b2, a3);
                ffix ffixVar2 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, a4, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar6 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                    Integer valueOf2 = Integer.valueOf(a5);
                    hfmVar.ad(valueOf2);
                    b2.h(valueOf2, ffjmVar6);
                }
                hlc.b(b2, b4, iss.c);
                ffjmVar3.a(b2, Integer.valueOf((i7 >> 15) & 14));
                b2.n();
                hfmVar.Z();
            } else {
                b2.v(-977856428);
                hfmVar.Z();
            }
            float b5 = eba.b(ebeVar, kahVar);
            float a6 = eba.a(ebeVar, kahVar);
            hve hveVar = hvi.e;
            if (ffjmVar3 != null) {
                a6 = ffmk.c(a6 - 12.0f, 0.0f);
            }
            hvi j = eba.j(hveVar, b5, 0.0f, a6, 0.0f, 10);
            b2.v(-976917996);
            hfmVar.Z();
            hvi a7 = ioe.a(hvi.e, "TextField").a(j);
            int i10 = huo.a;
            ipn a8 = dyc.a(hum.a, true);
            int a9 = hey.a(b2);
            hqb ai3 = hfmVar.ai();
            hvi b6 = huz.b(b2, a7);
            ffix ffixVar3 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar3);
            } else {
                b2.z();
            }
            hlc.b(b2, a8, iss.e);
            hlc.b(b2, ai3, iss.d);
            ffjm ffjmVar7 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a9))) {
                Integer valueOf3 = Integer.valueOf(a9);
                hfmVar.ad(valueOf3);
                b2.h(valueOf3, ffjmVar7);
            }
            hlc.b(b2, b6, iss.c);
            ffjmVar.a(b2, Integer.valueOf(i6 & 14));
            b2.n();
            if (ffjmVar2 != null) {
                b2.v(-976688162);
                hvi a10 = ioe.a(hvi.e, "Label");
                ipn a11 = dyc.a(hum.a, false);
                int a12 = hey.a(b2);
                hqb ai4 = hfmVar.ai();
                hvi b7 = huz.b(b2, a10);
                ffix ffixVar4 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar4);
                } else {
                    b2.z();
                }
                hlc.b(b2, a11, iss.e);
                hlc.b(b2, ai4, iss.d);
                ffjm ffjmVar8 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a12))) {
                    Integer valueOf4 = Integer.valueOf(a12);
                    hfmVar.ad(valueOf4);
                    b2.h(valueOf4, ffjmVar8);
                }
                hlc.b(b2, b7, iss.c);
                ffjmVar2.a(b2, Integer.valueOf((i7 >> 9) & 14));
                b2.n();
                hfmVar.Z();
            } else {
                b2.v(-976605516);
                hfmVar.Z();
            }
            b2.n();
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fls(hviVar, ffjmVar, ffjmVar2, ffjmVar3, f, ffjiVar, ffjmVar4, ebeVar, i, i2);
        }
    }
}
