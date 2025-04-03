package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gll {
    public static final void a(int i, ffjm ffjmVar, ffjn ffjnVar, ffjm ffjmVar2, ffjm ffjmVar3, ecd ecdVar, ffjm ffjmVar4, hfd hfdVar, int i2) {
        int i3;
        int i4;
        ffjn ffjnVar2;
        ecd ecdVar2;
        ffjm ffjmVar5;
        Object gliVar;
        int i5;
        int i6 = i2 & 6;
        hfd b = hfdVar.b(-975511942);
        if (i6 == 0) {
            i3 = i;
            i4 = (true != b.B(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            ffjnVar2 = ffjnVar;
            i4 |= true != b.F(ffjnVar2) ? 128 : 256;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != b.F(ffjmVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != b.F(ffjmVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            ecdVar2 = ecdVar;
            i4 |= true != b.D(ecdVar2) ? 65536 : 131072;
        } else {
            ecdVar2 = ecdVar;
        }
        if ((1572864 & i2) == 0) {
            ffjmVar5 = ffjmVar4;
            i4 |= true != b.F(ffjmVar5) ? 524288 : 1048576;
        } else {
            ffjmVar5 = ffjmVar4;
        }
        if ((599187 & i4) == 599186 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new glk();
                hfmVar.ad(R);
            }
            boolean z = (458752 & i4) == 131072;
            boolean z2 = (i4 & 112) == 32;
            boolean z3 = (i4 & 7168) == 2048;
            Object obj = R;
            boolean z4 = (57344 & i4) == 16384;
            boolean z5 = (i4 & 14) == 4;
            boolean z6 = (3670016 & i4) == 1048576;
            glk glkVar = (glk) obj;
            boolean z7 = (i4 & 896) == 256;
            Object R2 = hfmVar.R();
            if (((z6 | z2 | z | z3 | z4 | z5) || z7) || R2 == hfc.a) {
                i5 = 0;
                gliVar = new gli(ecdVar2, i3, glkVar, ffjmVar, ffjmVar2, ffjmVar3, ffjmVar5, ffjnVar2);
                hfmVar.ad(gliVar);
            } else {
                gliVar = R2;
                i5 = 0;
            }
            ira.a(null, (ffjm) gliVar, b, i5, 1);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new glj(i, ffjmVar, ffjnVar, ffjmVar2, ffjmVar3, ecdVar, ffjmVar4, i2);
        }
    }

    public static final void b(hvi hviVar, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, int i, long j, long j2, ecd ecdVar, ffjn ffjnVar, hfd hfdVar, int i2) {
        int i3;
        ffjm ffjmVar5;
        ffjm ffjmVar6;
        long j3;
        ffjn ffjnVar2;
        int i4;
        hfd hfdVar2;
        int i5 = i2 & 6;
        hfd b = hfdVar.b(-1219521777);
        if (i5 == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.F(ffjmVar2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            ffjmVar5 = ffjmVar3;
            i3 |= true != b.F(ffjmVar5) ? 1024 : 2048;
        } else {
            ffjmVar5 = ffjmVar3;
        }
        if ((i2 & 24576) == 0) {
            ffjmVar6 = ffjmVar4;
            i3 |= true != b.F(ffjmVar6) ? 8192 : 16384;
        } else {
            ffjmVar6 = ffjmVar4;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != b.B(i) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            j3 = j;
            i3 |= true != b.C(j3) ? 524288 : 1048576;
        } else {
            j3 = j;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != b.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= true != b.D(ecdVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 67108864;
        }
        if ((805306368 & i2) == 0) {
            ffjnVar2 = ffjnVar;
            i4 = 100663296;
            i3 |= true != b.F(ffjnVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjnVar2 = ffjnVar;
            i4 = 100663296;
        }
        if ((306783379 & i3) == 306783378 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i2 & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            int i6 = (234881024 & i3) ^ i4;
            boolean z = (i6 > 67108864 && b.D(ecdVar)) || (i3 & i4) == 67108864;
            hfm hfmVar = (hfm) b;
            int i7 = i3;
            Object R = hfmVar.R();
            if (z || R == hfc.a) {
                R = new hbt(ecdVar);
                hfmVar.ad(R);
            }
            hbt hbtVar = (hbt) R;
            boolean D = ((i6 > 67108864 && b.D(ecdVar)) || (i7 & i4) == 67108864) | b.D(hbtVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new gkz(hbtVar, ecdVar);
                hfmVar.ad(R2);
            }
            hfdVar2 = b;
            gpa.c(ecm.a(hviVar, (ffji) R2), null, j3, j2, 0.0f, 0.0f, null, hpx.d(-1979205334, new gla(i, ffjmVar, ffjnVar2, ffjmVar5, ffjmVar6, hbtVar, ffjmVar2), b), hfdVar2, 114);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new glb(hviVar, ffjmVar, ffjmVar2, ffjmVar3, ffjmVar4, i, j, j2, ecdVar, ffjnVar, i2);
        }
    }
}
