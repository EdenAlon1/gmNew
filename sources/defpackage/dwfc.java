package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfc {
    public static final void a(final ffjn ffjnVar, hvi hviVar, final fvn fvnVar, final float f, idh idhVar, final long j, final long j2, float f2, float f3, final ffjm ffjmVar, boolean z, final ffjm ffjmVar2, ffjn ffjnVar2, final long j3, long j4, final ffjn ffjnVar3, hfd hfdVar, final int i, final int i2) {
        int i3;
        fvn fvnVar2;
        float f4;
        ffjm ffjmVar3;
        hvi hviVar2;
        int i4;
        final idh b;
        final ffjn ffjnVar4;
        final long a;
        final float f5;
        final float f6;
        final boolean z2;
        hfd hfdVar2;
        final hvi hviVar3;
        ffjnVar.getClass();
        ffjnVar3.getClass();
        hfd b2 = hfdVar.b(-1146176352);
        if ((i & 6) == 0) {
            i3 = (true != b2.F(ffjnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            fvnVar2 = fvnVar;
            i5 |= true != b2.D(fvnVar2) ? 128 : 256;
        } else {
            fvnVar2 = fvnVar;
        }
        if ((i & 3072) == 0) {
            f4 = f;
            i5 |= true != b2.A(f4) ? 1024 : 2048;
        } else {
            f4 = f;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        if ((i & 196608) == 0) {
            i5 |= true != b2.C(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i5 |= true != b2.C(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((805306368 & i) == 0) {
            ffjmVar3 = ffjmVar;
            i5 |= true != b2.F(ffjmVar3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjmVar3 = ffjmVar;
        }
        int i6 = i2 | 6;
        if ((i2 & 48) == 0) {
            i6 |= true != b2.F(ffjmVar2) ? 16 : 32;
        }
        int i7 = i6 | 384;
        if ((i2 & 3072) == 0) {
            i7 |= true != b2.C(j3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i7 |= 8192;
        }
        if ((i2 & 196608) == 0) {
            i7 |= true != b2.F(ffjnVar3) ? 65536 : 131072;
        }
        if ((306783379 & i5) == 306783378 && (74899 & i7) == 74898 && b2.I()) {
            b2.s();
            hviVar3 = hviVar;
            b = idhVar;
            f5 = f2;
            f6 = f3;
            z2 = z;
            ffjnVar4 = ffjnVar2;
            a = j4;
            hfdVar2 = b2;
        } else {
            int i8 = (-57345) & i7;
            int i9 = i5 >> 27;
            int i10 = (-264298497) & i5;
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                hviVar2 = hvi.e;
                i4 = i9;
                b = dwfa.b(b2);
                ffjnVar4 = dwgb.a;
                a = dwfv.a(j3, b2);
                f5 = 1.0f;
                f6 = 1.0f;
                z2 = true;
            } else {
                b2.s();
                hviVar2 = hviVar;
                f5 = f2;
                f6 = f3;
                z2 = z;
                ffjnVar4 = ffjnVar2;
                a = j4;
                i4 = i9;
                b = idhVar;
            }
            b2.l();
            int i11 = i10 << 3;
            int i12 = i8 << 3;
            hfdVar2 = b2;
            hvi hviVar4 = hviVar2;
            fvm.e(ffjnVar, hviVar4, fvnVar2, f4, 0.0f, b, j, j2, f5, f6, ffjmVar3, z2, ffjmVar2, ffjnVar4, j3, a, ffjnVar3, hfdVar2, (i5 & 8190) | (i11 & 3670016) | (i11 & 29360128), (i12 & 896) | (i4 & 14) | (i12 & 112) | (i12 & 7168) | (57344 & i12) | (3670016 & i12));
            hviVar3 = hviVar4;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwfb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffjn ffjnVar5 = ffjn.this;
                    hvi hviVar5 = hviVar3;
                    fvn fvnVar3 = fvnVar;
                    float f7 = f;
                    idh idhVar2 = b;
                    long j5 = j;
                    long j6 = j2;
                    float f8 = f5;
                    float f9 = f6;
                    ffjm ffjmVar4 = ffjmVar;
                    boolean z3 = z2;
                    ffjm ffjmVar5 = ffjmVar2;
                    ffjn ffjnVar6 = ffjnVar4;
                    long j7 = j3;
                    long j8 = a;
                    int i13 = i;
                    dwfc.a(ffjnVar5, hviVar5, fvnVar3, f7, idhVar2, j5, j6, f8, f9, ffjmVar4, z3, ffjmVar5, ffjnVar6, j7, j8, ffjnVar3, (hfd) obj, hip.a(i13 | 1), hip.a(i2));
                    return ffcu.a;
                }
            };
        }
    }
}
