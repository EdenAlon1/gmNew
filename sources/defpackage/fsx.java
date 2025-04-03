package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsx {
    public static final ebe a = new ebf(24.0f, 24.0f, 24.0f, 24.0f);
    public static final ebe b = eba.h(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final ebe c = eba.h(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final ebe d = eba.h(0.0f, 0.0f, 0.0f, 24.0f, 7);

    public static final void a(float f, float f2, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(586821353);
        if (i3 == 0) {
            i2 = (true != b2.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.A(f2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if ((z | z2) || R == hfc.a) {
                R = new fso(f, f2);
                hfmVar.ad(R);
            }
            ipn ipnVar = (ipn) R;
            hve hveVar = hvi.e;
            int a2 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, hveVar);
            int i4 = ist.a;
            int i5 = ((((i2 >> 6) & 14) << 6) & 896) | 6;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, ipnVar, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar2);
            }
            hlc.b(b2, b3, iss.c);
            ffjmVar.a(b2, Integer.valueOf((i5 >> 6) & 14));
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fsp(f, f2, ffjmVar, i);
        }
    }

    public static final void b(ffix ffixVar, ffjm ffjmVar, hvi hviVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, ffjm ffjmVar5, idh idhVar, long j, long j2, long j3, long j4, float f, keh kehVar, hfd hfdVar, int i, int i2) {
        int i3;
        ffjm ffjmVar6;
        ffjm ffjmVar7;
        ffjm ffjmVar8;
        idh idhVar2;
        int i4;
        float f2;
        keh kehVar2;
        int i5 = i & 6;
        hfd b2 = hfdVar.b(-919826268);
        if (i5 == 0) {
            i3 = (true != b2.F(ffixVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ffjmVar6 = ffjmVar;
            i3 |= true != b2.F(ffjmVar6) ? 16 : 32;
        } else {
            ffjmVar6 = ffjmVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != b2.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b2.F(ffjmVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.F(ffjmVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            ffjmVar7 = ffjmVar4;
            i3 |= true != b2.F(ffjmVar7) ? 65536 : 131072;
        } else {
            ffjmVar7 = ffjmVar4;
        }
        if ((1572864 & i) == 0) {
            ffjmVar8 = ffjmVar5;
            i3 |= true != b2.F(ffjmVar8) ? 524288 : 1048576;
        } else {
            ffjmVar8 = ffjmVar5;
        }
        if ((12582912 & i) == 0) {
            idhVar2 = idhVar;
            i3 |= true != b2.D(idhVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            idhVar2 = idhVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b2.C(j) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b2.C(j2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b2.C(j3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b2.C(j4) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= true != b2.A(f2) ? 128 : 256;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            kehVar2 = kehVar;
            i4 |= true != b2.D(kehVar2) ? 1024 : 2048;
        } else {
            kehVar2 = kehVar;
        }
        int i6 = i4;
        if ((306783379 & i3) == 306783378 && (i6 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            int i7 = (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i6 >> 3) & 896);
            keh kehVar3 = kehVar2;
            d(ffixVar, hviVar, kehVar3, hpx.d(-1852840226, new fss(ffjmVar3, ffjmVar7, ffjmVar8, idhVar2, j, f2, j2, j3, j4, ffjmVar2, ffjmVar6), b2), b2, i7);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fst(ffixVar, ffjmVar, hviVar, ffjmVar2, ffjmVar3, ffjmVar4, ffjmVar5, idhVar, j, j2, j3, j4, f, kehVar, i, i2);
        }
    }

    public static final void c(ffjm ffjmVar, hvi hviVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, idh idhVar, long j, float f, long j2, long j3, long j4, long j5, hfd hfdVar, int i, int i2) {
        int i3;
        ffjm ffjmVar5;
        ffjm ffjmVar6;
        ffjm ffjmVar7;
        int i4;
        hvi hviVar2;
        int i5 = i & 6;
        hfd b2 = hfdVar.b(1522575799);
        if (i5 == 0) {
            i3 = (true != b2.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            ffjmVar5 = ffjmVar2;
            i6 |= true != b2.F(ffjmVar5) ? 128 : 256;
        } else {
            ffjmVar5 = ffjmVar2;
        }
        if ((i & 3072) == 0) {
            ffjmVar6 = ffjmVar3;
            i6 |= true != b2.F(ffjmVar6) ? 1024 : 2048;
        } else {
            ffjmVar6 = ffjmVar3;
        }
        if ((i & 24576) == 0) {
            ffjmVar7 = ffjmVar4;
            i6 |= true != b2.F(ffjmVar7) ? 8192 : 16384;
        } else {
            ffjmVar7 = ffjmVar4;
        }
        if ((196608 & i) == 0) {
            i6 |= true != b2.D(idhVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i6 |= true != b2.C(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i6 |= true != b2.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i6 |= true != b2.C(j2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i6 |= true != b2.C(j3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b2.C(j4) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b2.C(j5) ? 16 : 32;
        }
        if ((306783379 & i6) == 306783378 && (i4 & 19) == 18 && b2.I()) {
            b2.s();
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            gpa.c(hveVar, idhVar, j, 0L, f, 0.0f, null, hpx.d(-2126308228, new fsl(ffjmVar5, ffjmVar6, ffjmVar7, j3, j4, j5, j2, ffjmVar), b2), b2, 104);
            hviVar2 = hveVar;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fsm(ffjmVar, hviVar2, ffjmVar2, ffjmVar3, ffjmVar4, idhVar, j, f, j2, j3, j4, j5, i, i2);
        }
    }

    public static final void d(ffix ffixVar, hvi hviVar, keh kehVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        ffix ffixVar2;
        keh kehVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1922902937);
        if (i3 == 0) {
            i2 = (true != b2.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(kehVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b2.I()) {
            b2.s();
            ffixVar2 = ffixVar;
            kehVar2 = kehVar;
        } else {
            ffixVar2 = ffixVar;
            kehVar2 = kehVar;
            kdc.a(ffixVar2, kehVar2, hpx.d(905289008, new fsv(hviVar, ffjmVar), b2), b2, (i2 & 14) | 384 | ((i2 >> 3) & 112), 0);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fsw(ffixVar2, hviVar, kehVar2, ffjmVar, i);
        }
    }
}
