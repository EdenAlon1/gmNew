package defpackage;

import androidx.car.app.model.Alert;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpn {
    public static final int a(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, ebe ebeVar) {
        float f2;
        ebf ebfVar = (ebf) ebeVar;
        float f3 = ebfVar.a * f;
        float f4 = ebfVar.b * f;
        float max = Math.max(i, i5);
        if (z) {
            f2 = i2 + f + f + max + f4;
        } else {
            f2 = f3 + max + f4;
        }
        return jzl.b(j, Math.max(ffln.b(f2), Math.max(i3, i4)));
    }

    public static final int b(int i, int i2, int i3, int i4, int i5, long j) {
        return jzl.c(j, i + Math.max(i3, Math.max(i4, i5)) + i2);
    }

    public static final int c(int i, int i2) {
        return i == Integer.MAX_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : i - i2;
    }

    public static final void d(String str, ffji ffjiVar, hvi hviVar, boolean z, jpo jpoVar, ffjm ffjmVar, jwn jwnVar, euw euwVar, euv euvVar, int i, int i2, idh idhVar, fjj fjjVar, hfd hfdVar, int i3, int i4) {
        int i5;
        hfd hfdVar2;
        boolean z2;
        jpo jpoVar2;
        jwn jwnVar2;
        euw euwVar2;
        euv euvVar2;
        int i6;
        int i7;
        idh idhVar2;
        idh d;
        int i8;
        euw euwVar3;
        euv euvVar3;
        int i9;
        jpo jpoVar3;
        boolean z3;
        hfm hfmVar;
        long j;
        int i10 = i3 & 6;
        hfd b = hfdVar.b(-1504264404);
        if (i10 == 0) {
            i5 = (true != b.D(str) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != b.D(hviVar) ? 128 : 256;
        }
        int i11 = i5 | 27648;
        if ((i3 & 196608) == 0) {
            i11 = i5 | 93184;
        }
        if ((1572864 & i3) == 0) {
            i11 |= true != b.F(ffjmVar) ? 524288 : 1048576;
        }
        int i12 = i4 | 438;
        if ((i4 & 3072) == 0) {
            i12 = i4 | 1462;
        }
        int i13 = i12 | 24576;
        if ((i4 & 196608) == 0) {
            i13 = i12 | 90112;
        }
        int i14 = 14155776 | i13;
        if ((100663296 & i4) == 0) {
            i14 = i13 | 47710208;
        }
        if ((805306368 & i4) == 0) {
            i14 |= true != b.D(fjjVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i15 = i14;
        int i16 = i11 | 918552576;
        if (b.J(((i16 & 306783379) == 306783378 && (306783379 & i15) == 306783378) ? false : true, i16 & 1)) {
            int i17 = i15 >> 18;
            int i18 = i15 & (-235346945);
            b.t();
            if ((i3 & 1) == 0 || b.G()) {
                jpo jpoVar4 = (jpo) b.e(fqi.a);
                int i19 = jwn.d;
                jwn jwnVar3 = jwm.a;
                euw euwVar4 = euw.a;
                euv euvVar4 = new euv(null, null, null, null, 63);
                eqd eqdVar = fla.b(b).a;
                eqe eqeVar = eqg.a;
                d = eqd.d(eqdVar, null, null, eqeVar, eqeVar, 3);
                i8 = 1;
                euwVar3 = euwVar4;
                euvVar3 = euvVar4;
                i9 = Integer.MAX_VALUE;
                jpoVar3 = jpoVar4;
                jwnVar2 = jwnVar3;
                z3 = true;
            } else {
                b.s();
                z3 = z;
                jpoVar3 = jpoVar;
                jwnVar2 = jwnVar;
                euwVar3 = euwVar;
                euvVar3 = euvVar;
                i9 = i;
                i8 = i2;
                d = idhVar;
            }
            b.l();
            b.v(-1665933612);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar2.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar2.Z();
            b.v(-53734699);
            long f = jpoVar3.f();
            if (f != 16) {
                hfmVar = hfmVar2;
                j = f;
            } else {
                hfmVar = hfmVar2;
                j = ((ibw) fjjVar.b(z3, b).a()).i;
            }
            hfmVar.Z();
            jpo m = jpoVar3.m(new jpo(j, 0L, null, null, 0L, 0, 0L, 16777214));
            hvi g = huz.g(hviVar, new fov(z3, dwnVar, fjjVar));
            fok.a(3, b);
            jpo jpoVar5 = jpoVar3;
            boolean z4 = z3;
            int i20 = i18 << 12;
            hfdVar2 = b;
            eri.d(str, ffjiVar, ebs.a(g, 280.0f, 56.0f), z4, m, euwVar3, euvVar3, false, i9, i8, jwnVar2, null, dwnVar, new idl(((ibw) fjjVar.a(b).a()).i), hpx.d(989834338, new fpj(str, z3, jwnVar2, dwnVar, ffjmVar, d, fjjVar), b), hfdVar2, (i16 & 64638) | (3670016 & i20) | (i20 & 234881024), (i17 & 14) | 196608 | (i15 & 112), 4096);
            jpoVar2 = jpoVar5;
            idhVar2 = d;
            z2 = z4;
            euwVar2 = euwVar3;
            euvVar2 = euvVar3;
            i6 = i9;
            i7 = i8;
        } else {
            hfdVar2 = b;
            hfdVar2.s();
            z2 = z;
            jpoVar2 = jpoVar;
            jwnVar2 = jwnVar;
            euwVar2 = euwVar;
            euvVar2 = euvVar;
            i6 = i;
            i7 = i2;
            idhVar2 = idhVar;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fpk(str, ffjiVar, hviVar, z2, jpoVar2, ffjmVar, jwnVar2, euwVar2, euvVar2, i6, i7, idhVar2, fjjVar, i3, i4);
        }
    }

    public static final void e(hvi hviVar, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, float f, ebe ebeVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2112507061);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjmVar3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.E(false) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.A(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.D(ebeVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 67108864;
        }
        if (b.J((38347923 & i2) != 38347922, i2 & 1)) {
            boolean z = (3670016 & i2) == 1048576;
            boolean z2 = (29360128 & i2) == 8388608;
            boolean z3 = (234881024 & i2) == 67108864;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z | z2 | z3) || R == hfc.a) {
                R = new fpt(f, ebeVar);
                hfmVar.ad(R);
            }
            fpt fptVar = (fpt) R;
            kah kahVar = (kah) b.e(jdr.j);
            int a = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            int i5 = i2;
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, fptVar, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar4);
            }
            hlc.b(b, b2, iss.c);
            b.v(79103218);
            hfmVar.Z();
            if (ffjmVar3 != null) {
                b.v(79145905);
                hvi a2 = fky.a(ioe.a(hvi.e, "Trailing"));
                int i6 = huo.a;
                ipn a3 = dyc.a(hum.e, false);
                int a4 = hey.a(b);
                hqb ai2 = hfmVar.ai();
                hvi b3 = huz.b(b, a2);
                ffix ffixVar2 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar2);
                } else {
                    b.z();
                }
                hlc.b(b, a3, iss.e);
                hlc.b(b, ai2, iss.d);
                ffjm ffjmVar5 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    hfmVar.ad(valueOf2);
                    b.h(valueOf2, ffjmVar5);
                }
                hlc.b(b, b3, iss.c);
                ffjmVar3.a(b, Integer.valueOf((i5 >> 15) & 14));
                b.n();
                hfmVar.Z();
            } else {
                b.v(79392882);
                hfmVar.Z();
            }
            float b4 = eba.b(ebeVar, kahVar);
            float a5 = eba.a(ebeVar, kahVar);
            hve hveVar = hvi.e;
            if (ffjmVar3 != null) {
                a5 = ffmk.c(a5 - 12.0f, 0.0f);
            }
            hvi j = eba.j(hveVar, b4, 0.0f, a5, 0.0f, 10);
            b.v(80331314);
            hfmVar.Z();
            if (ffjmVar2 != null) {
                int i7 = i5 >> 6;
                b.v(80365817);
                hvi a6 = ioe.a(hvi.e, "Label").a(j);
                int i8 = huo.a;
                ipn a7 = dyc.a(hum.a, false);
                int a8 = hey.a(b);
                hqb ai3 = hfmVar.ai();
                hvi b5 = huz.b(b, a6);
                ffix ffixVar3 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar3);
                } else {
                    b.z();
                }
                hlc.b(b, a7, iss.e);
                hlc.b(b, ai3, iss.d);
                ffjm ffjmVar6 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a8))) {
                    Integer valueOf3 = Integer.valueOf(a8);
                    hfmVar.ad(valueOf3);
                    b.h(valueOf3, ffjmVar6);
                }
                hlc.b(b, b5, iss.c);
                ffjmVar2.a(b, Integer.valueOf(i7 & 14));
                b.n();
                hfmVar.Z();
            } else {
                b.v(80451346);
                hfmVar.Z();
            }
            hvi a9 = ioe.a(hvi.e, "TextField").a(j);
            int i9 = huo.a;
            ipn a10 = dyc.a(hum.a, true);
            int a11 = hey.a(b);
            hqb ai4 = hfmVar.ai();
            hvi b6 = huz.b(b, a9);
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar4);
            } else {
                b.z();
            }
            hlc.b(b, a10, iss.e);
            hlc.b(b, ai4, iss.d);
            ffjm ffjmVar7 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a11))) {
                Integer valueOf4 = Integer.valueOf(a11);
                hfmVar.ad(valueOf4);
                b.h(valueOf4, ffjmVar7);
            }
            hlc.b(b, b6, iss.c);
            ffjmVar.a(b, Integer.valueOf((i5 >> 3) & 14));
            b.n();
            b.n();
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fpl(hviVar, ffjmVar, ffjmVar2, ffjmVar3, f, ebeVar, i);
        }
    }
}
