package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fow {
    public static final fow a = new fow();

    private fow() {
    }

    public final void a(boolean z, dwn dwnVar, fjj fjjVar, idh idhVar, float f, float f2, hfd hfdVar, int i) {
        boolean z2;
        int i2;
        fow fowVar;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3 = i & 6;
        hfd b = hfdVar.b(943754022);
        if (i3 == 0) {
            z2 = z;
            i2 = (true != b.E(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dwnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(fjjVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(idhVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            fowVar = this;
            i2 |= true != b.D(fowVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fowVar = this;
        }
        if (b.J((4793491 & i2) != 4793490, i2 & 1)) {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                f5 = 1.0f;
                f6 = 2.0f;
            } else {
                b.s();
                f6 = f;
                f5 = f2;
            }
            b.l();
            dyc.b(dek.b(hvi.e, (der) fox.a(z2, dwnVar, fjjVar, f6, f5, b, i2 & 8190).a(), idhVar), b, 0);
            f3 = f6;
            f4 = f5;
        } else {
            b.s();
            f3 = f;
            f4 = f2;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fos(fowVar, z, dwnVar, fjjVar, idhVar, f3, f4, i);
        }
    }

    public final void b(String str, ffjm ffjmVar, boolean z, jwn jwnVar, dwn dwnVar, ffjm ffjmVar2, ffjm ffjmVar3, idh idhVar, fjj fjjVar, ebe ebeVar, ffjm ffjmVar4, hfd hfdVar, int i, int i2) {
        int i3;
        ffjm ffjmVar5;
        boolean z2;
        jwn jwnVar2;
        int i4;
        ffjm ffjmVar6;
        ffjm ffjmVar7;
        int i5;
        fjj fjjVar2;
        hfd hfdVar2;
        ebe ebeVar2;
        ebe ebfVar;
        int i6 = i & 6;
        hfd b = hfdVar.b(-920823490);
        if (i6 == 0) {
            i3 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ffjmVar5 = ffjmVar;
            i3 |= true != b.F(ffjmVar5) ? 16 : 32;
        } else {
            ffjmVar5 = ffjmVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= true != b.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.E(false) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            jwnVar2 = jwnVar;
            i3 |= true != b.D(jwnVar2) ? 8192 : 16384;
        } else {
            jwnVar2 = jwnVar;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            i3 |= true != b.D(dwnVar) ? 65536 : 131072;
        } else {
            i4 = 196608;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b.E(false) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ffjmVar6 = ffjmVar2;
            i3 |= true != b.F(ffjmVar6) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar6 = ffjmVar2;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b.F(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b.F(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            ffjmVar7 = ffjmVar3;
            i5 = i2 | (true != b.F(ffjmVar7) ? 2 : 4);
        } else {
            ffjmVar7 = ffjmVar3;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != b.D(idhVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            fjjVar2 = fjjVar;
            i5 |= true != b.D(fjjVar2) ? 128 : 256;
        } else {
            fjjVar2 = fjjVar;
        }
        if ((i2 & 3072) == 0) {
            i5 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true == b.F(ffjmVar4) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            i5 |= true == b.D(this) ? 131072 : 65536;
        }
        if (b.J(((306783379 & i3) == 306783378 && (74899 & i5) == 74898) ? false : true, i3 & 1)) {
            int i7 = i5 & (-7169);
            b.t();
            if ((i & 1) == 0 || b.G()) {
                ebfVar = new ebf(16.0f, 16.0f, 16.0f, 16.0f);
            } else {
                b.s();
                ebfVar = ebeVar;
            }
            b.l();
            int i8 = i3 << 3;
            int i9 = i3 >> 9;
            hfdVar2 = b;
            int i10 = i7 << 6;
            fpi.e(fqb.b, str, ffjmVar5, jwnVar2, ffjmVar6, ffjmVar7, z2, dwnVar, ebfVar, idhVar, fjjVar2, ffjmVar4, hfdVar2, ((i3 >> 3) & 7168) | (i8 & 896) | (i8 & 112) | 6 | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | ((i7 << 21) & 29360128) | ((i3 << 15) & 234881024) | ((i3 << 21) & 1879048192), (i10 & 57344) | ((i3 >> 18) & 14) | ((i3 >> 12) & 112) | (i10 & 7168) | (458752 & (i7 << 3)));
            ebeVar2 = ebfVar;
        } else {
            hfdVar2 = b;
            hfdVar2.s();
            ebeVar2 = ebeVar;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fot(this, str, ffjmVar, z, jwnVar, dwnVar, ffjmVar2, ffjmVar3, idhVar, fjjVar, ebeVar2, ffjmVar4, i, i2);
        }
    }

    public final void c(String str, ffjm ffjmVar, boolean z, jwn jwnVar, dwn dwnVar, ffjm ffjmVar2, idh idhVar, fjj fjjVar, ebe ebeVar, hfd hfdVar, int i, int i2) {
        String str2;
        int i3;
        boolean z2;
        jwn jwnVar2;
        int i4;
        dwn dwnVar2;
        ffjm ffjmVar3;
        int i5;
        idh idhVar2;
        fjj fjjVar2;
        fow fowVar;
        hfd hfdVar2;
        ebe ebeVar2;
        int i6;
        ebe ebfVar;
        int i7 = i & 6;
        hfd b = hfdVar.b(-1391531252);
        if (i7 == 0) {
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
            z2 = z;
            i3 |= true != b.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.E(false) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            jwnVar2 = jwnVar;
            i3 |= true != b.D(jwnVar2) ? 8192 : 16384;
        } else {
            jwnVar2 = jwnVar;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            dwnVar2 = dwnVar;
            i3 |= true != b.D(dwnVar2) ? 65536 : 131072;
        } else {
            i4 = 196608;
            dwnVar2 = dwnVar;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b.E(false) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ffjmVar3 = ffjmVar2;
            i3 |= true != b.F(ffjmVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar3 = ffjmVar2;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b.F(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b.F(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != b.F(null) ? 2 : 4);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            idhVar2 = idhVar;
            i5 |= true != b.D(idhVar2) ? 16 : 32;
        } else {
            idhVar2 = idhVar;
        }
        if ((i2 & 384) == 0) {
            fjjVar2 = fjjVar;
            i5 |= true != b.D(fjjVar2) ? 128 : 256;
        } else {
            fjjVar2 = fjjVar;
        }
        if ((i2 & 3072) == 0) {
            i5 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            fowVar = this;
            i5 |= true == b.D(fowVar) ? 16384 : 8192;
        } else {
            fowVar = this;
        }
        if (b.J(((306783379 & i3) == 306783378 && (i5 & 9363) == 9362) ? false : true, i3 & 1)) {
            int i8 = i5 & (-7169);
            b.t();
            if ((i & 1) == 0 || b.G()) {
                i6 = i3;
                hfdVar2 = b;
                ebfVar = new ebf(16.0f, 20.0f, 16.0f, 10.0f);
            } else {
                b.s();
                ebfVar = ebeVar;
                i6 = i3;
                hfdVar2 = b;
            }
            hfdVar2.l();
            int i9 = i6 << 3;
            int i10 = i6 >> 9;
            int i11 = i8 << 21;
            int i12 = i8 << 6;
            fpi.e(fqb.a, str2, ffjmVar, jwnVar2, ffjmVar3, null, z2, dwnVar2, ebfVar, idhVar2, fjjVar2, null, hfdVar2, (i9 & 896) | (i9 & 112) | 6 | ((i6 >> 3) & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (i11 & 29360128) | ((i6 << 15) & 234881024) | ((i6 << 21) & 1879048192), ((i6 >> 18) & 14) | i4 | ((i6 >> 12) & 112) | (i12 & 7168) | (57344 & i12));
            ebeVar2 = ebfVar;
        } else {
            hfdVar2 = b;
            hfdVar2.s();
            ebeVar2 = ebeVar;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fou(fowVar, str, ffjmVar, z, jwnVar, dwnVar, ffjmVar2, idhVar, fjjVar, ebeVar2, i, i2);
        }
    }
}
