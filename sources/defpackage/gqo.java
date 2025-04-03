package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqo {
    public static final void a(hvi hviVar, long j, long j2, ffjn ffjnVar, ffjm ffjmVar, ffjm ffjmVar2, hfd hfdVar, int i) {
        hvi hviVar2;
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-160898917);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.C(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjmVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            gpa.c(epp.a(hviVar2), null, j, j2, 0.0f, 0.0f, null, hpx.d(-1617702432, new gqm(ffjmVar2, ffjmVar, ffjnVar), b), hfdVar2, 114);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gqn(hviVar, j, j2, ffjnVar, ffjmVar, ffjmVar2, i);
        }
    }

    public static final void b(int i, hvi hviVar, long j, long j2, float f, ffjn ffjnVar, ffjm ffjmVar, ffjm ffjmVar2, hfd hfdVar, int i2) {
        int i3;
        int i4;
        long j3;
        long j4;
        float f2;
        ffjn ffjnVar2;
        ffjm ffjmVar3;
        ffjm ffjmVar4;
        hfd hfdVar2;
        int i5 = i2 & 6;
        hfd b = hfdVar.b(-497821003);
        if (i5 == 0) {
            i3 = i;
            i4 = (true != b.B(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            j3 = j;
            i4 |= true != b.C(j3) ? 128 : 256;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            j4 = j2;
            i4 |= true != b.C(j4) ? 1024 : 2048;
        } else {
            j4 = j2;
        }
        if ((i2 & 24576) == 0) {
            f2 = f;
            i4 |= true != b.A(f2) ? 8192 : 16384;
        } else {
            f2 = f;
        }
        if ((196608 & i2) == 0) {
            ffjnVar2 = ffjnVar;
            i4 |= true != b.F(ffjnVar2) ? 65536 : 131072;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((1572864 & i2) == 0) {
            ffjmVar3 = ffjmVar;
            i4 |= true != b.F(ffjmVar3) ? 524288 : 1048576;
        } else {
            ffjmVar3 = ffjmVar;
        }
        if ((12582912 & i2) == 0) {
            ffjmVar4 = ffjmVar2;
            i4 |= true != b.F(ffjmVar4) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar4 = ffjmVar2;
        }
        if ((4793491 & i4) == 4793490 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i2 & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            int i6 = i4 << 3;
            hfdVar2 = b;
            ffjn ffjnVar3 = ffjnVar2;
            c(i3, ffjnVar3, hviVar, j3, j4, f2, ffjmVar3, ffjmVar4, dix.a(0, b, 0, 1), hfdVar2, (i4 & 14) | ((i4 >> 12) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i4 & 3670016) | (i4 & 29360128));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gqc(i, hviVar, j, j2, f, ffjnVar, ffjmVar, ffjmVar2, i2);
        }
    }

    public static final void c(int i, ffjn ffjnVar, hvi hviVar, long j, long j2, float f, ffjm ffjmVar, ffjm ffjmVar2, dji djiVar, hfd hfdVar, int i2) {
        int i3;
        int i4;
        hfd hfdVar2;
        int i5 = i2 & 6;
        hfd b = hfdVar.b(-955409947);
        if (i5 == 0) {
            i3 = i;
            i4 = (true != b.B(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != b.C(j) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != b.C(j2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != b.A(f) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != b.F(ffjmVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != b.F(ffjmVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != b.D(djiVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i4 & 38347923) == 38347922 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i2 & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hfdVar2 = b;
            gpa.c(hviVar, null, j, j2, 0.0f, 0.0f, null, hpx.d(-1572959552, new gqg(djiVar, f, ffjmVar2, ffjmVar, ffjnVar, i3), b), hfdVar2, 114);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gqh(i, ffjnVar, hviVar, j, j2, f, ffjmVar, ffjmVar2, djiVar, i2);
        }
    }

    public static final void d(int i, hvi hviVar, long j, long j2, ffjn ffjnVar, ffjm ffjmVar, ffjm ffjmVar2, hfd hfdVar, int i2) {
        int i3;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(-1199178586);
        if (i4 == 0) {
            i3 = (true != b.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.C(j) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.C(j2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != b.F(ffjnVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != b.F(ffjmVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != b.F(ffjmVar2) ? 524288 : 1048576;
        }
        if ((599187 & i3) == 599186 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i2 & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hfdVar2 = b;
            a(hviVar, j, j2, ffjnVar, ffjmVar, ffjmVar2, hfdVar2, (i3 >> 3) & 524286);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gqi(i, hviVar, j, j2, ffjnVar, ffjmVar, ffjmVar2, i2);
        }
    }
}
