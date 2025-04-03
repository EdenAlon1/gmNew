package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvm {
    public static final hvi a(hvi hviVar, gmk gmkVar) {
        return icf.a(hviVar, new fvk(gmkVar));
    }

    public static final hvi b(hvi hviVar, gmk gmkVar) {
        return icf.a(hviVar, new fvl(gmkVar));
    }

    public static final void c(ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, ffix ffixVar, gmk gmkVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1870972053);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar4) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(gmkVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            ffjm[] ffjmVarArr = new ffjm[4];
            ffjmVarArr[0] = ffjmVar == null ? fyh.a : ffjmVar;
            ffjmVarArr[1] = ffjmVar2;
            ffjmVarArr[2] = ffjmVar3;
            ffjmVarArr[3] = ffjmVar4;
            List g = ffdx.g(ffjmVarArr);
            boolean z = (458752 & i2) == 131072;
            boolean z2 = (i2 & 57344) == 16384;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z | z2) || R == hfc.a) {
                R = new fup(gmkVar, ffixVar);
                hfmVar.ad(R);
            }
            ipu ipuVar = (ipu) R;
            hve hveVar = hvi.e;
            ffjm a = iol.a(g);
            boolean D = b.D(ipuVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ipv(ipuVar);
                hfmVar.ad(R2);
            }
            ipn ipnVar = (ipn) R2;
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i4 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, ipnVar, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar5);
            }
            hlc.b(b, b2, iss.c);
            a.a(b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fuq(ffjmVar, ffjmVar2, ffjmVar3, ffjmVar4, ffixVar, gmkVar, i);
        }
    }

    public static final void d(gmk gmkVar, float f, float f2, boolean z, idh idhVar, long j, long j2, float f3, float f4, ffjm ffjmVar, ffjn ffjnVar, hfd hfdVar, int i, int i2) {
        int i3;
        long j3;
        float f5;
        int i4;
        int i5;
        hvi hviVar;
        hvi d;
        hvi a;
        hvi a2;
        hfd hfdVar2;
        int i6 = i & 6;
        hfd b = hfdVar.b(721467526);
        if (i6 == 0) {
            i3 = (true != b.D(gmkVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.A(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.D(idhVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b.C(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            j3 = j2;
            i3 |= true != b.C(j3) ? 524288 : 1048576;
        } else {
            j3 = j2;
        }
        if ((12582912 & i) == 0) {
            f5 = f3;
            i3 |= true != b.A(f5) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            f5 = f3;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b.A(f4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b.F(ffjmVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i3;
            i5 = i2 | (true != b.F(ffjnVar) ? 2 : 4);
        } else {
            i4 = i3;
            i5 = i2;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            cyq a3 = gjb.a(1, b);
            cyq a4 = gjb.a(1, b);
            cyq a5 = gjb.a(5, b);
            boolean z2 = (i4 & 14) == 4;
            boolean F = b.F(a4) | z2 | b.F(a5) | b.F(a3);
            boolean z3 = z2;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new fur(gmkVar, a4, a5, a3);
                hfmVar.ad(R);
            }
            hgs.i((ffix) R, b);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hgd hgdVar = new hgd(hgs.a(ffhe.a, b));
                hfmVar.ad(hgdVar);
                R2 = hgdVar;
            }
            ffsk ffskVar = ((hgd) R2).a;
            dqs dqsVar = dqs.a;
            float em = ((jzn) b.e(jdr.e)).em(f);
            if (z) {
                b.v(-943960517);
                hve hveVar = hvi.e;
                boolean D = b.D(gmkVar.d);
                Object R3 = hfmVar.R();
                if (D || R3 == hfc.a) {
                    fvi fviVar = new fvi(ffskVar, gmkVar);
                    cxt cxtVar = gmd.a;
                    R3 = new gly(gmkVar, fviVar, dqsVar);
                    hfmVar.ad(R3);
                }
                hviVar = ijk.a(hveVar, (ijf) R3, null);
                hfmVar.Z();
            } else {
                b.v(-943566290);
                hfmVar.Z();
                hviVar = hvi.e;
            }
            d = ebs.d(ebs.x(hvi.e, 0.0f, f2, 1), 1.0f);
            a = d.a(new SizeElement(0.0f, 1 == (r11 & 1) ? Float.NaN : f, 0.0f, (r11 & 2) != 0 ? Float.NaN : 0.0f, false, 5));
            hvi a6 = a.a(hviVar);
            gzl gzlVar = gmkVar.d;
            boolean A = z3 | b.A(em);
            Object R4 = hfmVar.R();
            if (A || R4 == hfc.a) {
                R4 = new fut(gmkVar, em);
                hfmVar.ad(R4);
            }
            a2 = dpj.a(gyu.a(a6, gzlVar, dqsVar, (ffjm) R4), r3.d, dqsVar, z, null, r3.o(), new gym(gmkVar.d, null), false, 32);
            hfdVar2 = b;
            gpa.c(b(a2, gmkVar), idhVar, j, j3, f5, f4, null, hpx.d(390720907, new fvf(gmkVar, ffjmVar, ffskVar, z, ffjnVar), b), hfdVar2, 64);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fvg(gmkVar, f, f2, z, idhVar, j, j2, f3, f4, ffjmVar, ffjnVar, i, i2);
        }
    }

    public static final void e(ffjn ffjnVar, hvi hviVar, fvn fvnVar, float f, float f2, idh idhVar, long j, long j2, float f3, float f4, ffjm ffjmVar, boolean z, ffjm ffjmVar2, ffjn ffjnVar2, long j3, long j4, ffjn ffjnVar3, hfd hfdVar, int i, int i2) {
        int i3;
        hvi hviVar2;
        fvn fvnVar2;
        int i4;
        int i5;
        ffjm ffjmVar3;
        int i6;
        boolean z2;
        ffjn ffjnVar4;
        float f5;
        hvi c;
        hvi a;
        float f6;
        int i7 = i & 6;
        hfd b = hfdVar.b(-1523924135);
        if (i7 == 0) {
            i3 = (true != b.F(ffjnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            hviVar2 = hviVar;
            i3 |= true != b.D(hviVar2) ? 16 : 32;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 384) == 0) {
            fvnVar2 = fvnVar;
            i3 |= true != b.D(fvnVar2) ? 128 : 256;
        } else {
            fvnVar2 = fvnVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.A(f) ? 1024 : 2048;
        }
        int i8 = i3 | 24576;
        if ((i & 196608) == 0) {
            i4 = 196608;
            i8 |= true != b.D(idhVar) ? 65536 : 131072;
        } else {
            i4 = 196608;
        }
        if ((i & 1572864) == 0) {
            i8 |= true != b.C(j) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i8 |= true != b.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i & 100663296) == 0) {
            i8 |= true != b.A(f3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i & 805306368) == 0) {
            i8 |= true != b.A(f4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != b.F(ffjmVar) ? 2 : 4);
        } else {
            i5 = i2;
        }
        int i9 = i5;
        if ((i2 & 48) == 0) {
            i5 = i9 | (true != b.E(z) ? 16 : 32);
        }
        if ((i2 & 384) == 0) {
            ffjmVar3 = ffjmVar2;
            int i10 = i5;
            z2 = true;
            i6 = i10 | (true == b.F(ffjmVar3) ? 256 : 128);
        } else {
            ffjmVar3 = ffjmVar2;
            i6 = i5;
            z2 = true;
        }
        if ((i2 & 3072) == 0) {
            i6 |= z2 == b.F(ffjnVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= z2 != b.C(j3) ? 8192 : 16384;
        }
        if ((i2 & i4) == 0) {
            i6 |= z2 == b.C(j4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            ffjnVar4 = ffjnVar3;
            i6 |= z2 == b.F(ffjnVar4) ? 1048576 : 524288;
        } else {
            ffjnVar4 = ffjnVar3;
        }
        if ((306783379 & i8) == 306783378 && (i6 & 599187) == 599186 && b.I()) {
            b.s();
            f6 = f2;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                f5 = 640.0f;
            } else {
                b.s();
                f5 = f2;
            }
            b.l();
            c = ebs.c(hviVar2, 1.0f);
            a = dee.a(c, j3, idb.a);
            int i11 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i12 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar4);
            }
            hlc.b(b, b2, iss.c);
            hfz.a(fzc.a.c(new ibw(j4)), hpx.d(-1958071777, new fum(fvnVar2, ffjmVar3, ffjnVar4, f, f5, z, idhVar, j, j2, f3, f4, ffjmVar, ffjnVar, ffjnVar2), b), b, 56);
            b.n();
            f6 = f5;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fun(ffjnVar, hviVar, fvnVar, f, f6, idhVar, j, j2, f3, f4, ffjmVar, z, ffjmVar2, ffjnVar2, j3, j4, ffjnVar3, i, i2);
        }
    }
}
