package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvc {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        new ebf(8.0f, 4.0f, 8.0f, 4.0f);
        a = 16.0f;
        b = 24.0f;
        c = 16.0f;
        d = 36.0f;
        e = 8.0f;
    }

    public static final void a(gve gveVar, hvi hviVar, ffjm ffjmVar, long j, float f, idh idhVar, gks gksVar, float f2, float f3, ffjm ffjmVar2, hfd hfdVar, int i, int i2) {
        int i3;
        int i4;
        hvi hviVar2;
        int i5 = i & 6;
        hfd b2 = hfdVar.b(-1781098418);
        if (i5 == 0) {
            i3 = (true != ((i & 8) == 0 ? b2.D(gveVar) : b2.F(gveVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b2.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b2.A(f) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b2.D(idhVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b2.D(gksVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b2.A(f2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b2.A(f3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b2.F(ffjmVar2) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            long c2 = fyc.c(gft.a(b2), gksVar.a, ((jzq) b2.e(gpa.a)).a + f2, b2);
            if (j != 9205357640488583168L) {
                b2.v(-1580002586);
                jzn jznVar = (jzn) b2.e(jdr.e);
                b2.v(-860154309);
                int eo = ((jzn) b2.e(jdr.e)).eo(((Configuration) b2.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp);
                hfm hfmVar = (hfm) b2;
                hfmVar.Z();
                hve hveVar = hvi.e;
                boolean D = b2.D(jznVar) | b2.B(eo) | b2.C(c2) | ((((i3 & 57344) ^ 24576) > 16384 && b2.C(j)) || (i3 & 24576) == 16384);
                Object R = hfmVar.R();
                if (D || R == hfc.a) {
                    gus gusVar = new gus(jznVar, eo, c2, j);
                    hfmVar.ad(gusVar);
                    R = gusVar;
                }
                hvi a2 = hxs.b(hveVar, new gvd((ffjm) R, gveVar)).a(hviVar);
                hfmVar.Z();
                hviVar2 = a2;
            } else {
                b2.v(1473068652);
                ((hfm) b2).Z();
                hviVar2 = hviVar;
            }
            gpa.c(ebs.w(hviVar2, 40.0f, 24.0f, f, 0.0f, 8), idhVar, gksVar.a, 0L, f2, f3, null, hpx.d(1896319273, new guq(ffjmVar, gksVar, ffjmVar2), b2), b2, 72);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gur(gveVar, hviVar, ffjmVar, j, f, idhVar, gksVar, f2, f3, ffjmVar2, i, i2);
        }
    }

    public static final void b(kev kevVar, ffjn ffjnVar, gvi gviVar, hvi hviVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        kev kevVar2;
        hvi hviVar2;
        gvi gviVar2;
        hfd b2 = hfdVar.b(1947209790);
        if ((i & 6) == 0) {
            i2 = (true != b2.D(kevVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffjnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b2.D(gviVar) : b2.F(gviVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.E(true) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.E(true) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793491 & i2) == 4793490 && b2.I()) {
            b2.s();
            kevVar2 = kevVar;
            hviVar2 = hviVar;
            gviVar2 = gviVar;
        } else {
            dbe c2 = dbs.c(gviVar.a, "tooltip transition", b2, 48, 0);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(null, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new gve(new guv(hhoVar));
                hfmVar.ad(R2);
            }
            hpn d2 = hpx.d(1784036624, new gux(hhoVar, ffjmVar), b2);
            hpn d3 = hpx.d(1746743156, new gut(c2, ffjnVar, (gve) R2), b2);
            int i3 = 57344 & i2;
            int i4 = 458752 & i2;
            int i5 = (i2 & 14) | 12582960 | (i2 & 896) | (i2 & 7168) | i3 | i4;
            kevVar2 = kevVar;
            hviVar2 = hviVar;
            hak.a(kevVar2, d3, gviVar, hviVar2, d2, b2, i5 | (i2 & 3670016));
            gviVar2 = gviVar;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new guu(kevVar2, ffjnVar, gviVar2, hviVar2, ffjmVar, i);
        }
    }
}
