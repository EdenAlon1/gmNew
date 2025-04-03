package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gac {
    public static final ebe a = eba.h(0.0f, 0.0f, 6.0f, 8.0f, 3);
    public static final float b = 8.0f;
    public static final float c = 12.0f;

    public static final void a(ffix ffixVar, ffjm ffjmVar, hvi hviVar, ffjm ffjmVar2, idh idhVar, float f, fzr fzrVar, keh kehVar, ffjn ffjnVar, hfd hfdVar, int i) {
        ffix ffixVar2;
        int i2;
        ffjm ffjmVar3;
        idh idhVar2;
        fzr fzrVar2;
        keh kehVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-36517340);
        if (i3 == 0) {
            ffixVar2 = ffixVar;
            i2 = (true != b2.F(ffixVar2) ? 2 : 4) | i;
        } else {
            ffixVar2 = ffixVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            ffjmVar3 = ffjmVar2;
            i2 |= true != b2.F(ffjmVar3) ? 1024 : 2048;
        } else {
            ffjmVar3 = ffjmVar2;
        }
        if ((i & 24576) == 0) {
            idhVar2 = idhVar;
            i2 |= true != b2.D(idhVar2) ? 8192 : 16384;
        } else {
            idhVar2 = idhVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.A(f) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            fzrVar2 = fzrVar;
            i2 |= true != b2.D(fzrVar2) ? 524288 : 1048576;
        } else {
            fzrVar2 = fzrVar;
        }
        if ((12582912 & i) == 0) {
            kehVar2 = kehVar;
            i2 |= true != b2.D(kehVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            kehVar2 = kehVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b2.F(ffjnVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            fsx.d(ffixVar2, ebs.y(hviVar), kehVar2, hpx.d(-10625622, new gaa(idhVar2, fzrVar2, f, ffjnVar, ffjmVar3, ffjmVar), b2), b2, (i2 & 14) | 3072 | ((i2 >> 15) & 896));
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gab(ffixVar, ffjmVar, hviVar, ffjmVar2, idhVar, f, fzrVar, kehVar, ffjnVar, i);
        }
    }
}
