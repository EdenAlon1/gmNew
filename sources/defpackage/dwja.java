package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwja {
    public static final long a = jzr.b(4.0f, 44.0f);
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        jzr.b(44.0f, 4.0f);
        b = 6.0f;
        c = 2.0f;
        d = 4.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final float r27, final defpackage.ffji r28, defpackage.hvi r29, boolean r30, defpackage.ffix r31, defpackage.gmm r32, defpackage.dwn r33, final defpackage.ffjn r34, final defpackage.ffjn r35, final defpackage.ffmf r36, defpackage.hfd r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwja.a(float, ffji, hvi, boolean, ffix, gmm, dwn, ffjn, ffjn, ffmf, hfd, int, int, int):void");
    }

    public static final void b(final float f, final ffji ffjiVar, final hvi hviVar, boolean z, final ffmf ffmfVar, final ffix ffixVar, final gmm gmmVar, dwn dwnVar, hfd hfdVar, final int i) {
        float f2;
        int i2;
        ffji ffjiVar2;
        hvi hviVar2;
        ffmf ffmfVar2;
        dwn dwnVar2;
        final boolean z2;
        final dwn dwnVar3;
        ffjiVar.getClass();
        hfd b2 = hfdVar.b(1784046225);
        boolean z3 = true;
        if ((i & 6) == 0) {
            f2 = f;
            i2 = (true != b2.A(f2) ? 2 : 4) | i;
        } else {
            f2 = f;
            i2 = i;
        }
        if ((i & 48) == 0) {
            ffjiVar2 = ffjiVar;
            i2 |= true != b2.F(ffjiVar2) ? 16 : 32;
        } else {
            ffjiVar2 = ffjiVar;
        }
        if ((i & 384) == 0) {
            hviVar2 = hviVar;
            i2 |= true != b2.D(hviVar2) ? 128 : 256;
        } else {
            hviVar2 = hviVar;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            ffmfVar2 = ffmfVar;
            i3 |= true != b2.D(ffmfVar2) ? 8192 : 16384;
        } else {
            ffmfVar2 = ffmfVar;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= true != b2.F(ffixVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i4 |= true != b2.D(gmmVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i5 = i4 | 100663296;
        if ((38347923 & i5) == 38347922 && b2.I()) {
            b2.s();
            z2 = z;
            dwnVar3 = dwnVar;
        } else {
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                b2.v(-1440045457);
                hfm hfmVar = (hfm) b2;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new dwn();
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                dwnVar2 = (dwn) R;
            } else {
                b2.s();
                z3 = z;
                dwnVar2 = dwnVar;
            }
            b2.l();
            int i6 = i5 & 7168;
            int i7 = i5 >> 3;
            int i8 = (i5 & 14) | 905969664 | (i5 & 112) | (i5 & 896) | i6 | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128);
            int i9 = (i5 >> 12) & 14;
            ffji ffjiVar3 = ffjiVar2;
            boolean z4 = z3;
            a(f2, ffjiVar3, hviVar2, z4, ffixVar, gmmVar, dwnVar2, hpx.d(-289559339, new dwiy(dwnVar2, gmmVar, z3), b2), hpx.d(-723523020, new dwiz(z3, gmmVar), b2), ffmfVar2, b2, i8, i9, 0);
            z2 = z4;
            dwnVar3 = dwnVar2;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwiw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    hfd hfdVar2 = (hfd) obj;
                    ((Integer) obj2).intValue();
                    float f3 = f;
                    ffji ffjiVar4 = ffjiVar;
                    hvi hviVar3 = hviVar;
                    boolean z5 = z2;
                    ffmf ffmfVar3 = ffmfVar;
                    ffix ffixVar2 = ffixVar;
                    int i10 = i;
                    dwja.b(f3, ffjiVar4, hviVar3, z5, ffmfVar3, ffixVar2, gmmVar, dwnVar3, hfdVar2, hip.a(i10 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
