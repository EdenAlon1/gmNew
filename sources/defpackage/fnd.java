package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnd {
    public static final hik a = new hky(fmq.a);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hvi r30, defpackage.fnf r31, defpackage.ffjm r32, defpackage.ffjm r33, defpackage.ffjn r34, defpackage.ffjm r35, int r36, boolean r37, defpackage.idh r38, float r39, long r40, long r42, long r44, long r46, long r48, defpackage.ffjn r50, defpackage.hfd r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnd.a(hvi, fnf, ffjm, ffjm, ffjn, ffjm, int, boolean, idh, float, long, long, long, long, long, ffjn, hfd, int, int, int):void");
    }

    public static final void b(ecd ecdVar, hvi hviVar, fnf fnfVar, ffjm ffjmVar, ffjm ffjmVar2, ffjn ffjnVar, ffjm ffjmVar3, int i, boolean z, idh idhVar, float f, long j, long j2, long j3, long j4, long j5, ffjn ffjnVar2, hfd hfdVar, int i2, int i3) {
        int i4;
        ffjm ffjmVar4;
        int i5;
        ffjn ffjnVar3;
        int i6;
        ffjm ffjmVar5;
        int i7;
        int i8;
        int i9;
        int i10;
        hvi hviVar2;
        hfd hfdVar2;
        int i11 = i2 & 6;
        hfd b = hfdVar.b(-1288630565);
        if (i11 == 0) {
            i4 = (true != b.D(ecdVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != b.D(fnfVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            ffjmVar4 = ffjmVar;
            i4 |= true != b.F(ffjmVar4) ? 1024 : 2048;
        } else {
            ffjmVar4 = ffjmVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != b.F(ffjmVar2) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i5 = 196608;
            ffjnVar3 = ffjnVar;
            i4 |= true != b.F(ffjnVar3) ? 65536 : 131072;
        } else {
            i5 = 196608;
            ffjnVar3 = ffjnVar;
        }
        if ((i2 & 1572864) == 0) {
            i6 = 1572864;
            ffjmVar5 = ffjmVar3;
            i4 |= true != b.F(ffjmVar5) ? 524288 : 1048576;
        } else {
            i6 = 1572864;
            ffjmVar5 = ffjmVar3;
        }
        if ((i2 & 12582912) == 0) {
            i7 = 12582912;
            i8 = i;
            i4 |= true != b.B(i8) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            i7 = 12582912;
            i8 = i;
        }
        if ((i2 & 100663296) == 0) {
            i9 = 100663296;
            i4 |= true != b.E(false) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            i9 = 100663296;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != b.F(null) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i12 = i4;
        if ((i3 & 6) == 0) {
            i10 = (true != b.E(z) ? 2 : 4) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= true != b.D(idhVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i10 |= true != b.A(f) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i10 |= true != b.C(j) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i10 |= true == b.C(j2) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            i10 |= true == b.C(j3) ? 131072 : 65536;
        }
        if ((i3 & i6) == 0) {
            i10 |= true != b.C(j4) ? 524288 : 1048576;
        }
        if ((i3 & i7) == 0) {
            i10 |= true != b.C(j5) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i3 & i9) == 0) {
            i10 |= true != b.F(ffjnVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (b.J(((i12 & 306783379) == 306783378 && (38347923 & i10) == 38347922) ? false : true, i12 & 1)) {
            b.t();
            if ((i2 & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            int i13 = i12 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i13 == 4 || R == hfc.a) {
                R = new fln(ecdVar);
                hfmVar.ad(R);
            }
            hfdVar2 = b;
            hpn d = hpx.d(-219833176, new fmw((fln) R, ecdVar, j4, j5, i8, ffjmVar4, ffjnVar2, ffjmVar5, ffjmVar2, ffjnVar3, fnfVar), hfdVar2);
            hfdVar2.v(652256007);
            hviVar2 = hviVar;
            d.a(hviVar2, hfdVar2, Integer.valueOf(((i12 >> 3) & 14) | 48));
            hfmVar.Z();
        } else {
            hviVar2 = hviVar;
            hfdVar2 = b;
            hfdVar2.s();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fmr(ecdVar, hviVar2, fnfVar, ffjmVar, ffjmVar2, ffjnVar, ffjmVar3, i, z, idhVar, f, j, j2, j3, j4, j5, ffjnVar2, i2, i3);
        }
    }

    public static final /* synthetic */ void c(int i, ffjm ffjmVar, ffjn ffjnVar, ffjm ffjmVar2, ffjm ffjmVar3, ecd ecdVar, ffjm ffjmVar4, hfd hfdVar, int i2) {
        int i3;
        ffjn ffjnVar2;
        ffjm ffjmVar5;
        ffjm ffjmVar6;
        ecd ecdVar2;
        hfd b = hfdVar.b(-468424875);
        if ((i2 & 6) == 0) {
            i3 = (true != b.E(false) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            ffjnVar2 = ffjnVar;
            i3 |= true != b.F(ffjnVar2) ? 1024 : 2048;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((i2 & 24576) == 0) {
            ffjmVar5 = ffjmVar2;
            i3 |= true != b.F(ffjmVar5) ? 8192 : 16384;
        } else {
            ffjmVar5 = ffjmVar2;
        }
        if ((196608 & i2) == 0) {
            ffjmVar6 = ffjmVar3;
            i3 |= true != b.F(ffjmVar6) ? 65536 : 131072;
        } else {
            ffjmVar6 = ffjmVar3;
        }
        if ((1572864 & i2) == 0) {
            ecdVar2 = ecdVar;
            i3 |= true != b.D(ecdVar2) ? 524288 : 1048576;
        } else {
            ecdVar2 = ecdVar;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != b.F(ffjmVar4) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if (b.J((4793491 & i3) != 4793490, i3 & 1)) {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new fnc();
                hfmVar.ad(R);
            }
            boolean z = (i3 & 896) == 256;
            boolean z2 = (57344 & i3) == 16384;
            boolean z3 = (3670016 & i3) == 1048576;
            boolean z4 = (458752 & i3) == 131072;
            boolean z5 = (i3 & 112) == 32;
            boolean z6 = (i3 & 14) == 4;
            boolean z7 = (29360128 & i3) == 8388608;
            boolean z8 = (i3 & 7168) == 2048;
            fnc fncVar = (fnc) R;
            Object R2 = hfmVar.R();
            if ((z8 | z7 | z | z2 | z3 | z4 | z5 | z6) || R2 == hfc.a) {
                fna fnaVar = new fna(ffjmVar, ffjmVar5, ffjmVar6, i, ecdVar2, fncVar, ffjmVar4, ffjnVar2);
                hfmVar.ad(fnaVar);
                R2 = fnaVar;
            }
            ira.a(null, (ffjm) R2, b, 0, 1);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fnb(i, ffjmVar, ffjnVar, ffjmVar2, ffjmVar3, ecdVar, ffjmVar4, i2);
        }
    }

    public static final fnf d(fnx fnxVar, hfd hfdVar, int i) {
        hfd hfdVar2;
        if ((i & 1) != 0) {
            fjy fjyVar = fjy.a;
            int i2 = fjt.a;
            fjr fjrVar = fjr.a;
            Object[] objArr = new Object[0];
            hrk hrkVar = new hrk(fju.a, new fjv(fjrVar));
            boolean D = hfdVar.D(fjrVar);
            hfm hfmVar = (hfm) hfdVar;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new fjs(fjyVar, fjrVar);
                hfmVar.ad(R);
            }
            ffix ffixVar = (ffix) R;
            hfdVar2 = hfdVar;
        } else {
            hfdVar2 = hfdVar;
        }
        if ((i & 2) != 0) {
            hfm hfmVar2 = (hfm) hfdVar2;
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                R2 = new fnx();
                hfmVar2.ad(R2);
            }
            fnxVar = (fnx) R2;
        }
        hfm hfmVar3 = (hfm) hfdVar2;
        Object R3 = hfmVar3.R();
        if (R3 == hfc.a) {
            R3 = new fnf(fnxVar);
            hfmVar3.ad(R3);
        }
        return (fnf) R3;
    }
}
