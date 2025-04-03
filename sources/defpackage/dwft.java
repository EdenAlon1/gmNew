package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwft {
    /* JADX WARN: Removed duplicated region for block: B:100:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r27, final defpackage.ffix r28, final defpackage.ffjm r29, defpackage.hvi r30, boolean r31, defpackage.ffjm r32, defpackage.idh r33, defpackage.glp r34, defpackage.glt r35, defpackage.der r36, defpackage.hfd r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwft.a(boolean, ffix, ffjm, hvi, boolean, ffjm, idh, glp, glt, der, hfd, int, int, int):void");
    }

    public static final void b(final ffix ffixVar, final ffjm ffjmVar, final hvi hviVar, final boolean z, final ffjm ffjmVar2, final ffjm ffjmVar3, final idh idhVar, final glp glpVar, glt gltVar, final der derVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        hvi hviVar2;
        ffjm ffjmVar4;
        ffjm ffjmVar5;
        idh idhVar2;
        glp glpVar2;
        der derVar2;
        glt gltVar2;
        hfd hfdVar2;
        final glt gltVar3;
        ffixVar.getClass();
        ffjmVar.getClass();
        hfd b = hfdVar.b(242855447);
        if ((i & 6) == 0) {
            i3 = (true != b.E(false) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            hviVar2 = hviVar;
            i3 |= true != b.D(hviVar2) ? 1024 : 2048;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.E(z) ? 8192 : 16384;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            ffjmVar4 = ffjmVar2;
            i4 |= true != b.F(ffjmVar4) ? 524288 : 1048576;
        } else {
            ffjmVar4 = ffjmVar2;
        }
        if ((12582912 & i) == 0) {
            ffjmVar5 = ffjmVar3;
            i4 |= true != b.F(ffjmVar5) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjmVar5 = ffjmVar3;
        }
        if ((100663296 & i) == 0) {
            idhVar2 = idhVar;
            i4 |= true != b.D(idhVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            idhVar2 = idhVar;
        }
        if ((805306368 & i) == 0) {
            glpVar2 = glpVar;
            i4 |= true != b.D(glpVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            glpVar2 = glpVar;
        }
        int i5 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            derVar2 = derVar;
            i5 |= true != b.D(derVar2) ? 16 : 32;
        } else {
            derVar2 = derVar;
        }
        int i6 = i5 | 384;
        if ((306783379 & i4) == 306783378 && (i6 & 147) == 146 && b.I()) {
            b.s();
            gltVar3 = gltVar;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                b.v(1445578179);
                glt gltVar4 = new glt(0.0f);
                ((hfm) b).Z();
                gltVar2 = gltVar4;
            } else {
                b.s();
                gltVar2 = gltVar;
            }
            b.l();
            hfdVar2 = b;
            der derVar3 = derVar2;
            fxi.d(ffixVar, ffjmVar, hviVar2, z, ffjmVar4, ffjmVar5, idhVar2, glpVar2, gltVar2, derVar3, hfdVar2, i4 & 2147483646, i6 & 1008);
            gltVar3 = gltVar2;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwfs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    hfd hfdVar3 = (hfd) obj;
                    ((Integer) obj2).intValue();
                    ffix ffixVar2 = ffix.this;
                    ffjm ffjmVar6 = ffjmVar;
                    hvi hviVar3 = hviVar;
                    boolean z2 = z;
                    ffjm ffjmVar7 = ffjmVar2;
                    ffjm ffjmVar8 = ffjmVar3;
                    idh idhVar3 = idhVar;
                    glp glpVar3 = glpVar;
                    glt gltVar5 = gltVar3;
                    int i7 = i;
                    dwft.b(ffixVar2, ffjmVar6, hviVar3, z2, ffjmVar7, ffjmVar8, idhVar3, glpVar3, gltVar5, derVar, hfdVar3, hip.a(i7 | 1), hip.a(i2));
                    return ffcu.a;
                }
            };
        }
    }
}
