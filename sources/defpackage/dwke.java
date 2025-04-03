package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwke {
    public static final void a(final gve gveVar, hvi hviVar, final ffjm ffjmVar, long j, float f, idh idhVar, final gks gksVar, float f2, float f3, final ffjm ffjmVar2, hfd hfdVar, final int i, final int i2) {
        gve gveVar2;
        int i3;
        ffjm ffjmVar3;
        int i4;
        hvi hviVar2;
        float f4;
        idh idhVar2;
        float f5;
        float f6;
        long j2;
        hfd hfdVar2;
        final hvi hviVar3;
        final long j3;
        final float f7;
        final idh idhVar3;
        final float f8;
        final float f9;
        ffjmVar2.getClass();
        int i5 = i & 6;
        hfd b = hfdVar.b(-880522537);
        if (i5 == 0) {
            gveVar2 = gveVar;
            i3 = (true != b.F(gveVar2) ? 2 : 4) | i;
        } else {
            gveVar2 = gveVar;
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            i6 |= true != b.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i6 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i6 |= 8192;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i) == 0) {
            i7 = i6 | 720896;
        }
        if ((12582912 & i) == 0) {
            i7 |= true != b.D(gksVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i7 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((805306368 & i) == 0) {
            i7 |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        if ((i2 & 6) == 0) {
            ffjmVar3 = ffjmVar2;
            i4 = i2 | (true != b.F(ffjmVar3) ? 2 : 4);
        } else {
            ffjmVar3 = ffjmVar2;
            i4 = i2;
        }
        if ((306783379 & i7) == 306783378 && (i4 & 3) == 2 && b.I()) {
            b.s();
            hviVar3 = hviVar;
            j3 = j;
            f7 = f;
            idhVar3 = idhVar;
            f8 = f2;
            f9 = f3;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hve hveVar = hvi.e;
                float f10 = dwkb.a;
                float f11 = dwkb.a;
                b.v(1396064359);
                idh b2 = dwiq.b(13, b);
                ((hfm) b).Z();
                hviVar2 = hveVar;
                f4 = f11;
                idhVar2 = b2;
                f5 = 3.0f;
                f6 = 3.0f;
                j2 = 9205357640488583168L;
            } else {
                b.s();
                hviVar2 = hviVar;
                j2 = j;
                f4 = f;
                idhVar2 = idhVar;
                f5 = f2;
                f6 = f3;
            }
            b.l();
            hfdVar2 = b;
            gvc.a(gveVar2, hviVar2, ffjmVar, j2, f4, idhVar2, gksVar, f5, f6, ffjmVar3, hfdVar2, i7 & 29827070, i4 & 14);
            hviVar3 = hviVar2;
            j3 = j2;
            f7 = f4;
            idhVar3 = idhVar2;
            f8 = f5;
            f9 = f6;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwkc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    hfd hfdVar3 = (hfd) obj;
                    ((Integer) obj2).intValue();
                    gve gveVar3 = gve.this;
                    hvi hviVar4 = hviVar3;
                    ffjm ffjmVar4 = ffjmVar;
                    long j4 = j3;
                    float f12 = f7;
                    idh idhVar4 = idhVar3;
                    gks gksVar2 = gksVar;
                    float f13 = f8;
                    float f14 = f9;
                    int i8 = i;
                    dwke.a(gveVar3, hviVar4, ffjmVar4, j4, f12, idhVar4, gksVar2, f13, f14, ffjmVar2, hfdVar3, hip.a(i8 | 1), hip.a(i2));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final kev kevVar, final ffjn ffjnVar, final gvi gviVar, final hvi hviVar, boolean z, boolean z2, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        ffjm ffjmVar2;
        hfd hfdVar2;
        final boolean z3;
        final boolean z4;
        kevVar.getClass();
        ffjnVar.getClass();
        gviVar.getClass();
        hfd b = hfdVar.b(-1277076934);
        if ((i & 6) == 0) {
            i2 = (true != b.D(kevVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(gviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        int i3 = i2 | 1794048;
        if ((12582912 & i) == 0) {
            ffjmVar2 = ffjmVar;
            i3 |= true != b.F(ffjmVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar2 = ffjmVar;
        }
        if ((4793491 & i3) == 4793490 && b.I()) {
            b.s();
            z3 = z;
            hfdVar2 = b;
            z4 = z2;
        } else {
            gvc.b(kevVar, ffjnVar, gviVar, hviVar, ffjmVar2, b, 33554430 & i3);
            hfdVar2 = b;
            z3 = true;
            z4 = true;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwkd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kev kevVar2 = kev.this;
                    ffjn ffjnVar2 = ffjnVar;
                    gvi gviVar2 = gviVar;
                    hvi hviVar2 = hviVar;
                    boolean z5 = z3;
                    boolean z6 = z4;
                    dwke.b(kevVar2, ffjnVar2, gviVar2, hviVar2, z5, z6, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
