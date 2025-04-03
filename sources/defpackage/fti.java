package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fti {
    static {
        new kex(true, false, 14);
    }

    public static final void a(ffjm ffjmVar, ffix ffixVar, hvi hviVar, ffjm ffjmVar2, boolean z, ggc ggcVar, ebe ebeVar, hfd hfdVar, int i) {
        ffjm ffjmVar3;
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1826340448);
        if (i3 == 0) {
            ffjmVar3 = ffjmVar;
            i2 = (true != b.F(ffjmVar3) ? 2 : 4) | i;
        } else {
            ffjmVar3 = ffjmVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(ggcVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(ebeVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.D(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hfdVar2 = b;
            ggm.b(ffjmVar3, ffixVar, hviVar, ffjmVar2, z, ggcVar, ebeVar, hfdVar2, i2 & 268435454);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fth(ffjmVar, ffixVar, hviVar, ffjmVar2, z, ggcVar, ebeVar, i);
        }
    }

    public static final void b(boolean z, ffix ffixVar, hvi hviVar, long j, dji djiVar, kex kexVar, idh idhVar, long j2, float f, ffjn ffjnVar, hfd hfdVar, int i, int i2) {
        int i3;
        ffix ffixVar2;
        dji djiVar2;
        int i4;
        czq czqVar;
        int i5 = i & 6;
        hfd b = hfdVar.b(1431928300);
        if (i5 == 0) {
            i3 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ffixVar2 = ffixVar;
            i3 |= true != b.F(ffixVar2) ? 16 : 32;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.C(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            djiVar2 = djiVar;
            i3 |= true != b.D(djiVar2) ? 8192 : 16384;
        } else {
            djiVar2 = djiVar;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b.D(kexVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b.D(idhVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b.A(0.0f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b.A(f) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b.D(null) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new czq(false);
                hfmVar.ad(R);
            }
            czq czqVar2 = (czq) R;
            czqVar2.d(Boolean.valueOf(z));
            if (((Boolean) czqVar2.a()).booleanValue() || ((Boolean) czqVar2.b()).booleanValue()) {
                b.v(-1729840063);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    czqVar = czqVar2;
                    hic hicVar = new hic(new idr(idr.a), hla.a);
                    hfmVar.ad(hicVar);
                    R2 = hicVar;
                } else {
                    czqVar = czqVar2;
                }
                hho hhoVar = (hho) R2;
                jzn jznVar = (jzn) b.e(jdr.e);
                czq czqVar3 = czqVar;
                boolean D = b.D(jznVar) | ((i3 & 7168) == 2048);
                Object R3 = hfmVar.R();
                if (D || R3 == hfc.a) {
                    R3 = new hbc(j, jznVar, jznVar.eo(48.0f), new ftg(hhoVar));
                    hfmVar.ad(R3);
                }
                kdy.b((hbc) R3, ffixVar2, kexVar, hpx.d(2126968933, new fte(hviVar, czqVar3, hhoVar, djiVar2, idhVar, j2, f, ffjnVar), b), b, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                hfmVar.Z();
            } else {
                b.v(-1728781041);
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ftf(z, ffixVar, hviVar, j, djiVar, kexVar, idhVar, j2, f, ffjnVar, i, i2);
        }
    }
}
