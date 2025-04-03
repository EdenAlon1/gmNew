package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqu {
    public static final gqu a = new gqu();

    private gqu() {
    }

    public final void a(String str, ffjm ffjmVar, boolean z, jwn jwnVar, dwn dwnVar, ffjm ffjmVar2, idh idhVar, gqr gqrVar, ebe ebeVar, ffjm ffjmVar3, hfd hfdVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        ffjm ffjmVar4;
        int i6;
        gqr gqrVar2;
        ebe ebeVar2;
        byte[] bArr;
        hfd hfdVar2;
        hfd b = hfdVar.b(289640444);
        if ((i & 6) == 0) {
            i3 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i3 |= true != b.E(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.D(jwnVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            i3 |= true != b.D(dwnVar) ? 65536 : 131072;
        } else {
            i4 = 196608;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != b.E(false) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i5 = 12582912;
            i3 |= true != b.F(null) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            i5 = 12582912;
        }
        if ((100663296 & i) == 0) {
            ffjmVar4 = ffjmVar2;
            i3 |= true != b.F(ffjmVar4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ffjmVar4 = ffjmVar2;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b.F(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i6 = (true != b.F(null) ? 2 : 4) | i2;
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= true != b.F(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i6 |= true != b.F(null) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i6 |= true != b.F(null) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i6 |= true == b.D(idhVar) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            gqrVar2 = gqrVar;
            i6 |= true != b.D(gqrVar2) ? 65536 : 131072;
        } else {
            gqrVar2 = gqrVar;
        }
        if ((i2 & 1572864) == 0) {
            ebeVar2 = ebeVar;
            i6 |= true != b.D(ebeVar2) ? 524288 : 1048576;
        } else {
            ebeVar2 = ebeVar;
        }
        if ((i2 & i5) == 0) {
            i6 |= true != b.F(ffjmVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            i6 |= true != b.D(this) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((306783379 & i3) == 306783378 && (38347923 & i6) == 38347922 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            boolean z3 = (i3 & 14) == 4;
            boolean z4 = (57344 & i3) == 16384;
            hfm hfmVar = (hfm) b;
            boolean z5 = z3;
            Object R = hfmVar.R();
            if ((z5 || z4) || R == hfc.a) {
                bArr = null;
                R = jwnVar.a(new jlm(str, null, 6));
                hfmVar.ad(R);
            } else {
                bArr = null;
            }
            String str2 = ((jwk) R).a.b;
            int i7 = i6;
            hdi hdiVar = hdi.a;
            gqy gqyVar = new gqy(bArr);
            b.v(-1626079295);
            hfmVar.Z();
            int i8 = i3 >> 9;
            int i9 = i7 << 21;
            hfdVar2 = b;
            ffjm ffjmVar5 = ffjmVar4;
            hdh.g(hdiVar, str2, ffjmVar, gqyVar, null, ffjmVar5, null, null, z2, true, false, dwnVar, ebeVar2, gqrVar2, ffjmVar3, hfdVar2, (i9 & 29360128) | ((i3 << 3) & 896) | 6 | (i8 & 458752) | (i8 & 3670016) | (i9 & 234881024) | (i9 & 1879048192), ((i7 >> 9) & 14) | ((i3 >> 6) & 112) | (i3 & 896) | (i8 & 7168) | ((i3 >> 3) & 57344) | ((i7 >> 3) & 458752) | ((i7 << 3) & 3670016) | (i7 & 29360128));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gqs(this, str, ffjmVar, z, jwnVar, dwnVar, ffjmVar2, idhVar, gqrVar, ebeVar, ffjmVar3, i, i2);
        }
    }
}
