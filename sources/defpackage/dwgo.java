package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgo {
    public static final void a(final ffix ffixVar, final ffjm ffjmVar, final hvi hviVar, final ffjm ffjmVar2, idh idhVar, float f, fzr fzrVar, keh kehVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        ffix ffixVar2;
        int i2;
        ffjn ffjnVar2;
        idh idhVar2;
        fzr a;
        keh kehVar2;
        float f2;
        hfd hfdVar2;
        final idh idhVar3;
        final float f3;
        final fzr fzrVar2;
        final keh kehVar3;
        ffjmVar.getClass();
        ffjnVar.getClass();
        hfd b = hfdVar.b(1124347902);
        if ((i & 6) == 0) {
            ffixVar2 = ffixVar;
            i2 = (true != b.F(ffixVar2) ? 2 : 4) | i;
        } else {
            ffixVar2 = ffixVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        int i3 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            ffjnVar2 = ffjnVar;
            i3 |= true != b.F(ffjnVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((38347923 & i3) == 38347922 && b.I()) {
            b.s();
            idhVar3 = idhVar;
            f3 = f;
            fzrVar2 = fzrVar;
            kehVar3 = kehVar;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                b.v(155797517);
                idh b2 = dwiq.b(2, b);
                ((hfm) b).Z();
                idhVar2 = b2;
                a = dwgm.a(b);
                kehVar2 = new keh(false, 3);
                f2 = 6.0f;
            } else {
                b.s();
                idhVar2 = idhVar;
                f2 = f;
                a = fzrVar;
                kehVar2 = kehVar;
            }
            b.l();
            hfdVar2 = b;
            gac.a(ffixVar2, ffjmVar, hviVar, ffjmVar2, idhVar2, f2, a, kehVar2, ffjnVar2, hfdVar2, i3 & 264249342);
            idhVar3 = idhVar2;
            f3 = f2;
            fzrVar2 = a;
            kehVar3 = kehVar2;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwgn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    ffjm ffjmVar3 = ffjmVar;
                    hvi hviVar2 = hviVar;
                    ffjm ffjmVar4 = ffjmVar2;
                    idh idhVar4 = idhVar3;
                    float f4 = f3;
                    fzr fzrVar3 = fzrVar2;
                    keh kehVar4 = kehVar3;
                    dwgo.a(ffixVar3, ffjmVar3, hviVar2, ffjmVar4, idhVar4, f4, fzrVar3, kehVar4, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
