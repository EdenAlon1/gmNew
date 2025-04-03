package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxi {
    public static final /* synthetic */ int a = 0;
    private static final ebe b;

    static {
        eba.g(8.0f, 0.0f, 2);
        b = eba.g(8.0f, 0.0f, 2);
        eba.g(8.0f, 0.0f, 2);
    }

    public static final void a(ffjm ffjmVar, jpo jpoVar, long j, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, long j2, long j3, float f, ebe ebeVar, hfd hfdVar, int i) {
        ffjm ffjmVar5;
        int i2;
        ffjm ffjmVar6;
        ffjm ffjmVar7;
        long j4;
        int i3;
        int i4 = i & 6;
        hfd b2 = hfdVar.b(-782878228);
        if (i4 == 0) {
            ffjmVar5 = ffjmVar;
            i2 = (true != b2.F(ffjmVar5) ? 2 : 4) | i;
        } else {
            ffjmVar5 = ffjmVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(jpoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(ffjmVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            ffjmVar6 = ffjmVar3;
            i2 |= true != b2.F(ffjmVar6) ? 8192 : 16384;
        } else {
            ffjmVar6 = ffjmVar3;
        }
        if ((196608 & i) == 0) {
            ffjmVar7 = ffjmVar4;
            i2 |= true != b2.F(ffjmVar7) ? 65536 : 131072;
        } else {
            ffjmVar7 = ffjmVar4;
        }
        if ((1572864 & i) == 0) {
            j4 = j2;
            i2 |= true != b2.C(j4) ? 524288 : 1048576;
        } else {
            j4 = j2;
        }
        int i5 = i2;
        if ((12582912 & i) == 0) {
            i3 = i5 | (true != b2.C(j3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT);
        } else {
            i3 = i5;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b2.A(32.0f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b2.D(ebeVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i3) == 306783378 && b2.I()) {
            b2.s();
        } else {
            hfz.b(new hil[]{fzc.a.c(new ibw(j)), grl.a.c(jpoVar)}, hpx.d(1748799148, new fwz(32.0f, ebeVar, ffjmVar6, ffjmVar2, ffjmVar7, j4, ffjmVar5, j3), b2), b2, 56);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fxa(ffjmVar, jpoVar, j, ffjmVar2, ffjmVar3, ffjmVar4, j2, j3, 32.0f, ebeVar, i);
        }
    }

    public static final void b(boolean z, ffix ffixVar, ffjm ffjmVar, hvi hviVar, boolean z2, ffjm ffjmVar2, idh idhVar, glp glpVar, glt gltVar, der derVar, hfd hfdVar, int i, int i2) {
        boolean z3;
        int i3;
        ffjm ffjmVar3;
        ffjm ffjmVar4;
        glp glpVar2;
        glt gltVar2;
        der derVar2;
        int i4;
        int i5;
        hfd hfdVar2;
        int i6 = i & 6;
        hfd b2 = hfdVar.b(-1711985619);
        if (i6 == 0) {
            z3 = z;
            i3 = (true != b2.E(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b2.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            ffjmVar3 = ffjmVar;
            i3 |= true != b2.F(ffjmVar3) ? 128 : 256;
        } else {
            ffjmVar3 = ffjmVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b2.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.E(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            ffjmVar4 = ffjmVar2;
            i3 |= true != b2.F(ffjmVar4) ? 65536 : 131072;
        } else {
            ffjmVar4 = ffjmVar2;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b2.F(null) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != b2.D(idhVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            glpVar2 = glpVar;
            i3 |= true != b2.D(glpVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            glpVar2 = glpVar;
        }
        if ((805306368 & i) == 0) {
            gltVar2 = gltVar;
            i3 |= true != b2.D(gltVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            gltVar2 = gltVar;
        }
        if ((i2 & 6) == 0) {
            derVar2 = derVar;
            i4 = 12582912;
            i5 = i2 | (true != b2.D(derVar2) ? 2 : 4);
        } else {
            derVar2 = derVar;
            i4 = 12582912;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != b2.D(null) ? 16 : 32;
        }
        if ((306783379 & i3) == 306783378 && (i5 & 19) == 18 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            jpo a2 = gvu.a(hdw.a, b2);
            int i7 = (i3 & 14) | i4;
            int i8 = i3 >> 6;
            int i9 = i3;
            int i10 = i9 << 3;
            hfdVar2 = b2;
            int i11 = i9 << 6;
            int i12 = i9 >> 24;
            int i13 = (i10 & 3670016) | ((i9 >> 3) & 7168) | i7 | (i8 & 112) | (i10 & 896) | (i11 & 57344);
            int i14 = (i12 & 14) | 27648 | (i12 & 112);
            ffjm ffjmVar5 = ffjmVar3;
            ffjm ffjmVar6 = ffjmVar4;
            c(z3, hviVar, ffixVar, z2, ffjmVar5, a2, ffjmVar6, null, null, idhVar, glpVar2, gltVar2, derVar2, 32.0f, b, hfdVar2, i13 | (i11 & 234881024) | (i11 & 1879048192), i14 | ((i5 << 6) & 896) | (458752 & (i5 << 12)));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fxb(z, ffixVar, ffjmVar, hviVar, z2, ffjmVar2, idhVar, glpVar, gltVar, derVar, i, i2);
        }
    }

    public static final void c(boolean z, hvi hviVar, ffix ffixVar, boolean z2, ffjm ffjmVar, jpo jpoVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, idh idhVar, glp glpVar, glt gltVar, der derVar, float f, ebe ebeVar, hfd hfdVar, int i, int i2) {
        int i3;
        int i4;
        ffjm ffjmVar5;
        int i5;
        boolean z3;
        hvi c;
        float f2;
        boolean z4;
        dwn dwnVar;
        int i6;
        cxv cxvVar;
        hfd hfdVar2;
        int i7 = i & 6;
        hfd b2 = hfdVar.b(402951308);
        if (i7 == 0) {
            i3 = (true != b2.E(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b2.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b2.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            i3 |= true != b2.D(jpoVar) ? 65536 : 131072;
        } else {
            i4 = 196608;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b2.F(ffjmVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ffjmVar5 = ffjmVar3;
            i3 |= true != b2.F(ffjmVar5) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar5 = ffjmVar3;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b2.F(ffjmVar4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b2.D(idhVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = (true != b2.D(glpVar) ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != b2.D(gltVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != b2.D(derVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            z3 = true;
            i5 |= true == b2.A(32.0f) ? 2048 : 1024;
        } else {
            z3 = true;
        }
        if ((i2 & 24576) == 0) {
            i5 |= z3 == b2.D(ebeVar) ? 16384 : 8192;
        }
        int i8 = i5;
        if ((i2 & i4) == 0) {
            i5 = i8 | (true == b2.D(null) ? 131072 : 65536);
        }
        int i9 = i5;
        if ((i3 & 306783379) == 306783378 && (i9 & 74899) == 74898 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            b2.v(-168865738);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            int i10 = i3;
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwn dwnVar2 = (dwn) R;
            hfmVar.Z();
            c = jjs.c(hviVar, false, fxf.a);
            long j = !z2 ? z ? glpVar.j : glpVar.e : !z ? glpVar.a : glpVar.i;
            if (gltVar == null) {
                b2.v(-168472783);
                hfmVar.Z();
                dwnVar = dwnVar2;
                cxvVar = null;
            } else {
                b2.v(2072775376);
                int i11 = i10 >> 9;
                int i12 = i9 << 3;
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    R2 = new hss();
                    hfmVar.ad(R2);
                }
                hss hssVar = (hss) R2;
                Object R3 = hfmVar.R();
                if (R3 == hfc.a) {
                    hic hicVar = new hic(null, hla.a);
                    hfmVar.ad(hicVar);
                    R3 = hicVar;
                }
                int i13 = (i12 & 896) | (i11 & 14);
                hho hhoVar = (hho) R3;
                boolean D = b2.D(dwnVar2);
                Object R4 = hfmVar.R();
                if (D || R4 == hfc.a) {
                    R4 = new glr(dwnVar2, hssVar, null);
                    hfmVar.ad(R4);
                }
                hgs.g(dwnVar2, (ffjm) R4, b2);
                dwm dwmVar = (dwm) ffdx.Q(hssVar);
                if (z2) {
                    if (!(dwmVar instanceof dwp)) {
                        if (dwmVar instanceof dwk) {
                            f2 = gltVar.a;
                        } else if (!(dwmVar instanceof dwf) && (dwmVar instanceof dwd)) {
                            f2 = 8.0f;
                        }
                        z4 = true;
                    }
                    f2 = 0.0f;
                    z4 = true;
                } else {
                    f2 = 0.0f;
                    z4 = false;
                }
                Object R5 = hfmVar.R();
                dwnVar = dwnVar2;
                if (R5 == hfc.a) {
                    i6 = i13;
                    R5 = new cxj(new jzq(f2), dcp.c, null, 12);
                    hfmVar.ad(R5);
                } else {
                    i6 = i13;
                }
                cxj cxjVar = (cxj) R5;
                jzq jzqVar = new jzq(f2);
                boolean F = b2.F(cxjVar) | b2.A(f2) | ((((i6 & 14) ^ 6) > 4 && b2.E(z4)) || (i6 & 6) == 4) | b2.F(dwmVar);
                Object R6 = hfmVar.R();
                if (F || R6 == hfc.a) {
                    R6 = new gls(cxjVar, f2, z4, dwmVar, hhoVar, null);
                    hfmVar.ad(R6);
                }
                hgs.g(jzqVar, (ffjm) R6, b2);
                cxv cxvVar2 = cxjVar.b;
                hfmVar.Z();
                cxvVar = cxvVar2;
            }
            hfdVar2 = b2;
            gpa.d(z, ffixVar, c, z2, idhVar, j, cxvVar != null ? ((jzq) cxvVar.a()).a : 0.0f, derVar, dwnVar, hpx.d(-577614814, new fxg(glpVar, z2, z, ffjmVar, jpoVar, ffjmVar2, ffjmVar5, ffjmVar4, 32.0f, ebeVar), b2), hfdVar2, 192);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fxh(z, hviVar, ffixVar, z2, ffjmVar, jpoVar, ffjmVar2, ffjmVar3, ffjmVar4, idhVar, glpVar, gltVar, derVar, 32.0f, ebeVar, i, i2);
        }
    }

    public static final void d(ffix ffixVar, ffjm ffjmVar, hvi hviVar, boolean z, ffjm ffjmVar2, ffjm ffjmVar3, idh idhVar, glp glpVar, glt gltVar, der derVar, hfd hfdVar, int i, int i2) {
        int i3;
        ffix ffixVar2;
        ffjm ffjmVar4;
        hvi hviVar2;
        idh idhVar2;
        glp glpVar2;
        int i4;
        hpn hpnVar;
        int i5;
        float f;
        hfd b2 = hfdVar.b(1658928131);
        if ((i & 6) == 0) {
            i3 = (true != b2.E(false) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ffixVar2 = ffixVar;
            i3 |= true != b2.F(ffixVar2) ? 16 : 32;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i & 384) == 0) {
            ffjmVar4 = ffjmVar;
            i3 |= true != b2.F(ffjmVar4) ? 128 : 256;
        } else {
            ffjmVar4 = ffjmVar;
        }
        if ((i & 3072) == 0) {
            hviVar2 = hviVar;
            i3 |= true != b2.D(hviVar2) ? 1024 : 2048;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.E(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b2.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b2.F(ffjmVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b2.F(ffjmVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            idhVar2 = idhVar;
            i3 |= true != b2.D(idhVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            idhVar2 = idhVar;
        }
        if ((805306368 & i) == 0) {
            glpVar2 = glpVar;
            i3 |= true != b2.D(glpVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            glpVar2 = glpVar;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b2.D(gltVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b2.D(derVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            hpnVar = null;
            i4 |= true != b2.D(null) ? 128 : 256;
        } else {
            hpnVar = null;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            if (ffjmVar2 != null) {
                b2.v(71072450);
                hpnVar = hpx.d(1154227507, new fxd(z ? 1.0f : 0.38f, glx.c(5, b2), ffjmVar2), b2);
                ((hfm) b2).Z();
            } else {
                b2.v(71669231);
                ((hfm) b2).Z();
            }
            jpo a2 = gvu.a(hdx.a, b2);
            int i6 = i3 & 14;
            int i7 = i3 >> 6;
            int i8 = i3 << 3;
            hpn hpnVar2 = hpnVar;
            int i9 = i3 >> 3;
            int i10 = i3 << 6;
            int i11 = ((i3 >> 27) & 14) | 3072;
            int i12 = i4 << 3;
            int i13 = i4 << 9;
            if (ffjmVar3 != null) {
                i5 = i11;
                f = 8.0f;
            } else {
                i5 = i11;
                f = 4.0f;
            }
            c(false, hviVar2, ffixVar2, z, ffjmVar4, a2, null, hpnVar2, ffjmVar3, idhVar2, glpVar2, gltVar, derVar, 32.0f, eba.h(4.0f, 0.0f, f, 0.0f, 10), b2, (i9 & 7168) | (i8 & 896) | i6 | (i7 & 112) | (i10 & 57344) | (3670016 & i8) | (234881024 & i8) | (i8 & 1879048192), (i12 & 896) | i5 | (i12 & 112) | (458752 & i13));
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fxe(ffixVar, ffjmVar, hviVar, z, ffjmVar2, ffjmVar3, idhVar, glpVar, gltVar, derVar, i, i2);
        }
    }
}
