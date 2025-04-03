package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwa {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ffix r27, defpackage.hvi r28, boolean r29, defpackage.idh r30, defpackage.fvo r31, defpackage.fvt r32, defpackage.der r33, defpackage.ebe r34, defpackage.ffjn r35, defpackage.hfd r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwa.a(ffix, hvi, boolean, idh, fvo, fvt, der, ebe, ffjn, hfd, int, int):void");
    }

    public static final void b(ffix ffixVar, hvi hviVar, boolean z, idh idhVar, fvo fvoVar, der derVar, ebe ebeVar, ffjn ffjnVar, hfd hfdVar, int i) {
        ffix ffixVar2;
        int i2;
        idh idhVar2;
        der derVar2;
        ffjn ffjnVar2;
        fvo fvoVar2;
        boolean z2;
        long f;
        hfd hfdVar2;
        boolean z3;
        fvo fvoVar3;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1694808287);
        if (i3 == 0) {
            ffixVar2 = ffixVar;
            i2 = (true != b.F(ffixVar2) ? 2 : 4) | i;
        } else {
            ffixVar2 = ffixVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            idhVar2 = idhVar;
            i4 |= true != b.D(idhVar2) ? 1024 : 2048;
        } else {
            idhVar2 = idhVar;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i) == 0) {
            derVar2 = derVar;
            i5 |= true != b.D(derVar2) ? 524288 : 1048576;
        } else {
            derVar2 = derVar;
        }
        if ((12582912 & i) == 0) {
            i5 |= true != b.D(ebeVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i6 = i5 | 100663296;
        if ((805306368 & i) == 0) {
            ffjnVar2 = ffjnVar;
            i6 |= true != b.F(ffjnVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((306783379 & i6) == 306783378 && b.I()) {
            b.s();
            z3 = z;
            fvoVar3 = fvoVar;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                ebe ebeVar2 = fvp.a;
                fxz a = gft.a(b);
                fvo fvoVar4 = a.L;
                if (fvoVar4 == null) {
                    long j = ibw.g;
                    long g = fyc.g(a, 19);
                    long j2 = ibw.g;
                    f = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.38f, ibw.f(fyc.g(a, 19)));
                    fvoVar2 = new fvo(j, g, j2, f);
                    a.L = fvoVar2;
                } else {
                    fvoVar2 = fvoVar4;
                }
                z2 = true;
            } else {
                b.s();
                z2 = z;
                fvoVar2 = fvoVar;
            }
            b.l();
            hfdVar2 = b;
            a(ffixVar2, hviVar, z2, idhVar2, fvoVar2, null, derVar2, ebeVar, ffjnVar2, hfdVar2, i6 & 2147426302, 0);
            z3 = z2;
            fvoVar3 = fvoVar2;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fvy(ffixVar, hviVar, z3, idhVar, fvoVar3, derVar, ebeVar, ffjnVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ffix r22, defpackage.hvi r23, boolean r24, defpackage.idh r25, defpackage.fvo r26, defpackage.ebe r27, defpackage.ffjn r28, defpackage.hfd r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwa.c(ffix, hvi, boolean, idh, fvo, ebe, ffjn, hfd, int, int):void");
    }
}
