package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwif {
    public static final void a(final String str, final ffji ffjiVar, final hvi hviVar, boolean z, jpo jpoVar, final ffjm ffjmVar, final ffjm ffjmVar2, jwn jwnVar, final euw euwVar, euv euvVar, int i, int i2, idh idhVar, gqr gqrVar, hfd hfdVar, final int i3, final int i4, final int i5) {
        String str2;
        int i6;
        ffji ffjiVar2;
        hvi hviVar2;
        ffjm ffjmVar3;
        ffjm ffjmVar4;
        euw euwVar2;
        jpo jpoVar2;
        jwn jwnVar2;
        euv euvVar2;
        idh b;
        gqr a;
        int i7;
        boolean z2;
        int i8;
        hfd hfdVar2;
        final boolean z3;
        final jpo jpoVar3;
        final jwn jwnVar3;
        final euv euvVar3;
        final int i9;
        final int i10;
        final idh idhVar2;
        final gqr gqrVar2;
        hfd b2 = hfdVar.b(-544387420);
        if ((i3 & 6) == 0) {
            str2 = str;
            i6 = (true != b2.D(str2) ? 2 : 4) | i3;
        } else {
            str2 = str;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            ffjiVar2 = ffjiVar;
            i6 |= true != b2.F(ffjiVar2) ? 16 : 32;
        } else {
            ffjiVar2 = ffjiVar;
        }
        if ((i3 & 384) == 0) {
            hviVar2 = hviVar;
            i6 |= true != b2.D(hviVar2) ? 128 : 256;
        } else {
            hviVar2 = hviVar;
        }
        int i11 = i6 | 27648;
        if ((196608 & i3) == 0) {
            i11 = i6 | 93184;
        }
        int i12 = 1572864 | i11;
        if ((12582912 & i3) == 0) {
            ffjmVar3 = ffjmVar;
            i12 |= true != b2.F(ffjmVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar3 = ffjmVar;
        }
        int i13 = i12 | 100663296;
        if ((i3 & 805306368) == 0) {
            ffjmVar4 = ffjmVar2;
            i13 |= true != b2.F(ffjmVar4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjmVar4 = ffjmVar2;
        }
        int i14 = i4 | 438;
        if ((i4 & 3072) == 0) {
            euwVar2 = euwVar;
            i14 |= true != b2.D(euwVar2) ? 1024 : 2048;
        } else {
            euwVar2 = euwVar;
        }
        int i15 = 115040256 | i14;
        if ((805306368 & i4) == 0) {
            i15 = i14 | 383475712;
        }
        int i16 = (i5 & 6) == 0 ? i5 | 2 : i5;
        if ((i13 & 306783379) == 306783378 && (306783379 & i15) == 306783378 && (i16 & 3) == 2 && b2.I()) {
            b2.s();
            z3 = z;
            jpoVar3 = jpoVar;
            jwnVar3 = jwnVar;
            euvVar3 = euvVar;
            i9 = i;
            i10 = i2;
            idhVar2 = idhVar;
            gqrVar2 = gqrVar;
            hfdVar2 = b2;
        } else {
            int i17 = i15 >> 24;
            int i18 = (-1879048193) & i15;
            b2.t();
            if ((i3 & 1) == 0 || b2.G()) {
                jpo jpoVar4 = (jpo) b2.e(grl.a);
                int i19 = jwn.d;
                jpoVar2 = jpoVar4;
                jwnVar2 = jwm.a;
                euvVar2 = euv.a;
                b = dwic.b(b2);
                a = dwic.a(b2);
                i7 = Integer.MAX_VALUE;
                z2 = true;
                i8 = 1;
            } else {
                b2.s();
                z2 = z;
                jpoVar2 = jpoVar;
                jwnVar2 = jwnVar;
                euvVar2 = euvVar;
                i7 = i;
                i8 = i2;
                b = idhVar;
                a = gqrVar;
            }
            b2.l();
            hfdVar2 = b2;
            gjt.b(str2, ffjiVar2, hviVar2, z2, jpoVar2, ffjmVar3, ffjmVar4, jwnVar2, euwVar2, euvVar2, i7, i8, b, a, hfdVar2, i13 & 2147024894, (i18 << 6) & 2147483520, i17 & 14);
            z3 = z2;
            jpoVar3 = jpoVar2;
            jwnVar3 = jwnVar2;
            euvVar3 = euvVar2;
            i9 = i7;
            i10 = i8;
            idhVar2 = b;
            gqrVar2 = a;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwie
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    ffji ffjiVar3 = ffjiVar;
                    hvi hviVar3 = hviVar;
                    boolean z4 = z3;
                    jpo jpoVar5 = jpoVar3;
                    ffjm ffjmVar5 = ffjmVar;
                    ffjm ffjmVar6 = ffjmVar2;
                    jwn jwnVar4 = jwnVar3;
                    euw euwVar3 = euwVar;
                    euv euvVar4 = euvVar3;
                    int i20 = i9;
                    int i21 = i10;
                    int i22 = i3;
                    idh idhVar3 = idhVar2;
                    int i23 = i4;
                    int a2 = hip.a(i22 | 1);
                    int a3 = hip.a(i23);
                    dwif.a(str3, ffjiVar3, hviVar3, z4, jpoVar5, ffjmVar5, ffjmVar6, jwnVar4, euwVar3, euvVar4, i20, i21, idhVar3, gqrVar2, (hfd) obj, a2, a3, hip.a(i5));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final jvu jvuVar, final ffji ffjiVar, final hvi hviVar, boolean z, jpo jpoVar, final ffjm ffjmVar, final ffjm ffjmVar2, final ffjm ffjmVar3, final ffjm ffjmVar4, final boolean z2, jwn jwnVar, final euw euwVar, euv euvVar, int i, int i2, idh idhVar, gqr gqrVar, hfd hfdVar, final int i3, final int i4, final int i5) {
        jvu jvuVar2;
        int i6;
        ffji ffjiVar2;
        hvi hviVar2;
        ffjm ffjmVar5;
        ffjm ffjmVar6;
        int i7;
        int i8;
        boolean z3;
        jpo jpoVar2;
        jwn jwnVar2;
        euv euvVar2;
        int i9;
        boolean z4;
        gqr a;
        idh idhVar2;
        int i10;
        hfd hfdVar2;
        final boolean z5;
        final jpo jpoVar3;
        final jwn jwnVar3;
        final euv euvVar3;
        final int i11;
        final int i12;
        final idh idhVar3;
        final gqr gqrVar2;
        jvuVar.getClass();
        ffjiVar.getClass();
        hfd b = hfdVar.b(1370984951);
        if ((i3 & 6) == 0) {
            jvuVar2 = jvuVar;
            i6 = (true != b.D(jvuVar2) ? 2 : 4) | i3;
        } else {
            jvuVar2 = jvuVar;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            ffjiVar2 = ffjiVar;
            i6 |= true != b.F(ffjiVar2) ? 16 : 32;
        } else {
            ffjiVar2 = ffjiVar;
        }
        if ((i3 & 384) == 0) {
            hviVar2 = hviVar;
            i6 |= true != b.D(hviVar2) ? 128 : 256;
        } else {
            hviVar2 = hviVar;
        }
        int i13 = i6 | 27648;
        if ((i3 & 196608) == 0) {
            i13 = i6 | 93184;
        }
        if ((1572864 & i3) == 0) {
            i13 |= true != b.F(ffjmVar) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i13 |= true != b.F(ffjmVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i14 = i13 | 100663296;
        if ((i3 & 805306368) == 0) {
            ffjmVar5 = ffjmVar3;
            i14 |= true != b.F(ffjmVar5) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjmVar5 = ffjmVar3;
        }
        if ((i4 & 6) == 0) {
            ffjmVar6 = ffjmVar4;
            i7 = (true != b.F(ffjmVar6) ? 2 : 4) | i4;
        } else {
            ffjmVar6 = ffjmVar4;
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i8 = 805306368;
            z3 = z2;
            i7 |= true != b.E(z3) ? 16 : 32;
        } else {
            i8 = 805306368;
            z3 = z2;
        }
        int i15 = i7 | 384;
        if ((i4 & 3072) == 0) {
            i15 |= true != b.D(euwVar) ? 1024 : 2048;
        }
        int i16 = i15 | 24576;
        if ((i4 & 196608) == 0) {
            i16 |= true != b.E(true) ? 65536 : 131072;
        }
        int i17 = i16 | 114819072;
        if ((i4 & i8) == 0) {
            i17 = i16 | 383254528;
        }
        int i18 = (i5 & 6) == 0 ? i5 | 2 : i5;
        if ((i14 & 306783379) == 306783378 && (i17 & 306783379) == 306783378 && (i18 & 3) == 2 && b.I()) {
            b.s();
            z5 = z;
            jpoVar3 = jpoVar;
            jwnVar3 = jwnVar;
            euvVar3 = euvVar;
            i11 = i;
            i12 = i2;
            idhVar3 = idhVar;
            gqrVar2 = gqrVar;
            hfdVar2 = b;
        } else {
            int i19 = i17 >> 24;
            int i20 = i17 & (-1879048193);
            b.t();
            if ((i3 & 1) == 0 || b.G()) {
                jpo jpoVar4 = (jpo) b.e(grl.a);
                int i21 = jwn.d;
                jwn jwnVar4 = jwm.a;
                euv euvVar4 = euv.a;
                idh b2 = dwic.b(b);
                jpoVar2 = jpoVar4;
                jwnVar2 = jwnVar4;
                euvVar2 = euvVar4;
                i9 = Integer.MAX_VALUE;
                z4 = true;
                a = dwic.a(b);
                idhVar2 = b2;
                i10 = 1;
            } else {
                b.s();
                z4 = z;
                jpoVar2 = jpoVar;
                jwnVar2 = jwnVar;
                euvVar2 = euvVar;
                i9 = i;
                i10 = i2;
                idhVar2 = idhVar;
                a = gqrVar;
            }
            b.l();
            int i22 = (i20 << 6) & 2147483520;
            hfdVar2 = b;
            boolean z6 = z4;
            ffjm ffjmVar7 = ffjmVar5;
            gjt.a(jvuVar2, ffjiVar2, hviVar2, z6, jpoVar2, ffjmVar, ffjmVar2, ffjmVar7, ffjmVar6, z3, jwnVar2, euwVar, euvVar2, true, i9, i10, idhVar2, a, hfdVar2, i14 & 2147024894, i22, i19 & 14, 3072);
            z5 = z6;
            jpoVar3 = jpoVar2;
            jwnVar3 = jwnVar2;
            euvVar3 = euvVar2;
            i11 = i9;
            i12 = i10;
            idhVar3 = idhVar2;
            gqrVar2 = a;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwid
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    jvu jvuVar3 = jvu.this;
                    ffji ffjiVar3 = ffjiVar;
                    hvi hviVar3 = hviVar;
                    boolean z7 = z5;
                    jpo jpoVar5 = jpoVar3;
                    ffjm ffjmVar8 = ffjmVar;
                    ffjm ffjmVar9 = ffjmVar2;
                    ffjm ffjmVar10 = ffjmVar3;
                    ffjm ffjmVar11 = ffjmVar4;
                    boolean z8 = z2;
                    jwn jwnVar5 = jwnVar3;
                    euw euwVar2 = euwVar;
                    euv euvVar5 = euvVar3;
                    int i23 = i11;
                    int i24 = i12;
                    int i25 = i3;
                    idh idhVar4 = idhVar3;
                    int i26 = i4;
                    int a2 = hip.a(i25 | 1);
                    int a3 = hip.a(i26);
                    dwif.b(jvuVar3, ffjiVar3, hviVar3, z7, jpoVar5, ffjmVar8, ffjmVar9, ffjmVar10, ffjmVar11, z8, jwnVar5, euwVar2, euvVar5, i23, i24, idhVar4, gqrVar2, (hfd) obj, a2, a3, hip.a(i5));
                    return ffcu.a;
                }
            };
        }
    }
}
