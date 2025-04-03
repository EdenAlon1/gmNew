package defpackage;

import com.android.vcard.VCardConfig;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzp {
    public static final /* synthetic */ int a = 0;
    private static final ebe b = eba.h(24.0f, 10.0f, 24.0f, 0.0f, 8);
    private static final float c = 16.0f;

    public static final jvu a(hho hhoVar) {
        return (jvu) hhoVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        if (r2.D(r24) != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.Long r20, defpackage.ffji r21, defpackage.ham r22, defpackage.ffmj r23, defpackage.gae r24, defpackage.dmug r25, defpackage.fzr r26, boolean r27, defpackage.hfd r28, int r29) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzp.b(java.lang.Long, ffji, ham, ffmj, gae, dmug, fzr, boolean, hfd, int):void");
    }

    public static final void c(hvi hviVar, Long l, ffji ffjiVar, ham hamVar, ffjm ffjmVar, ffjm ffjmVar2, fzq fzqVar, haw hawVar, Locale locale, fzr fzrVar, boolean z, hfd hfdVar, int i, int i2) {
        int i3;
        fzq fzqVar2;
        int i4;
        Object fznVar;
        ham hamVar2;
        hfm hfmVar;
        int i5;
        hho hhoVar;
        float f;
        hzi hziVar;
        int i6;
        hfm hfmVar2;
        hho hhoVar2;
        ffji ffjiVar2;
        hvi c2;
        hfd hfdVar2;
        haw hawVar2 = hawVar;
        int i7 = i & 6;
        hfd b2 = hfdVar.b(-1823503473);
        if (i7 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b2.D(l) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b2.F(ffjiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b2.F(hamVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b2.F(ffjmVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b2.B(0) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            fzqVar2 = fzqVar;
            i3 |= true != b2.D(fzqVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fzqVar2 = fzqVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b2.D(hawVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b2.F(locale) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b2.D(fzrVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b2.E(z) ? 16 : 32;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && b2.I()) {
            b2.s();
            ffjiVar2 = ffjiVar;
            hfdVar2 = b2;
        } else {
            Object[] objArr = new Object[0];
            boolean z2 = (i3 & 112) == 32;
            hrh hrhVar = jvu.a;
            boolean F = z2 | b2.F(hamVar);
            boolean z3 = (i3 & 234881024) == 67108864;
            boolean F2 = b2.F(locale) | F | z3;
            hfm hfmVar3 = (hfm) b2;
            boolean z4 = z3;
            Object R = hfmVar3.R();
            if (F2 || R == hfc.a) {
                R = new fzo(l, hamVar, hawVar2, locale);
                hfmVar3.ad(R);
            }
            hho b3 = hqr.b(objArr, hrhVar, (ffix) R, b2);
            Object[] objArr2 = new Object[0];
            boolean D = b2.D(b3);
            boolean z5 = (i3 & 29360128) == 8388608;
            boolean F3 = D | z5 | b2.F(hamVar) | z4 | b2.F(locale);
            boolean z6 = z5;
            boolean z7 = (3670016 & i3) == 1048576;
            Object R2 = hfmVar3.R();
            if ((F3 || z7) || R2 == hfc.a) {
                hamVar2 = hamVar;
                hfmVar = hfmVar3;
                i5 = i3;
                hhoVar = b3;
                fznVar = new fzn(fzqVar2, hamVar2, hawVar2, locale, hhoVar);
                hfmVar.ad(fznVar);
            } else {
                hamVar2 = hamVar;
                i5 = i3;
                fznVar = R2;
                hhoVar = b3;
                hfmVar = hfmVar3;
            }
            hfm hfmVar4 = hfmVar;
            hho hhoVar3 = (hho) hqr.c(objArr2, null, (ffix) fznVar, b2, 0, 6);
            if (ffpc.J((CharSequence) hhoVar3.a())) {
                f = c;
            } else {
                ebf ebfVar = new ebf(16.0f, 4.0f, 16.0f, 0.0f);
                f = c - (ebfVar.b + ebfVar.a);
            }
            float f2 = f;
            if (z) {
                b2.v(-1258493583);
                Object R3 = hfmVar4.R();
                if (R3 == hfc.a) {
                    R3 = new hzi();
                    hfmVar4.ad(R3);
                }
                hfmVar4.Z();
                hziVar = (hzi) R3;
            } else {
                b2.v(-1258459639);
                hfmVar4.Z();
                hziVar = null;
            }
            jvu a2 = a(hhoVar);
            boolean D2 = z4 | b2.D(hhoVar) | b2.D(hhoVar3);
            boolean z8 = (i5 & 896) == 256;
            boolean F4 = D2 | z8 | b2.F(hamVar2) | b2.F(locale);
            Object R4 = hfmVar4.R();
            if ((z7 || (F4 | z6)) || R4 == hfc.a) {
                i6 = i5;
                hfmVar2 = hfmVar4;
                hhoVar2 = hhoVar3;
                ham hamVar3 = hamVar2;
                ffjiVar2 = ffjiVar;
                fzi fziVar = new fzi(hawVar, hhoVar2, ffjiVar2, hamVar3, locale, fzqVar, hhoVar);
                hawVar2 = hawVar;
                hfmVar2.ad(fziVar);
                R4 = fziVar;
            } else {
                ffjiVar2 = ffjiVar;
                i6 = i5;
                hfmVar2 = hfmVar4;
                hhoVar2 = hhoVar3;
                hawVar2 = hawVar;
            }
            ffji ffjiVar3 = (ffji) R4;
            hzi hziVar2 = hziVar;
            hfm hfmVar5 = hfmVar2;
            hvi j = eba.j(hviVar, 0.0f, 0.0f, 0.0f, f2, 7);
            boolean D3 = b2.D(hhoVar2);
            Object R5 = hfmVar5.R();
            if (D3 || R5 == hfc.a) {
                R5 = new fzj(hhoVar2);
                hfmVar5.ad(R5);
            }
            c2 = jjs.c(j, false, (ffji) R5);
            gjt.a(a2, ffjiVar3, c2.a(hziVar2 != null ? hzk.a(hvi.e, hziVar2) : hvi.e), false, null, ffjmVar, ffjmVar2, null, hpx.d(786647478, new fzk(hhoVar2), b2), !ffpc.J((CharSequence) hhoVar2.a()), new gde(hawVar2), new euw(0, false, 3, 7, 113), null, true, 0, 0, null, fzrVar.y, b2, (i6 << 6) & 33030144, 12779904, 0, 4001592);
            hfdVar2 = b2;
            ffcu ffcuVar = ffcu.a;
            boolean D4 = hfdVar2.D(hhoVar2) | z8 | hfdVar2.D(hziVar2);
            Object R6 = hfmVar5.R();
            if (D4 || R6 == hfc.a) {
                R6 = new fzl(hhoVar2, ffjiVar2, hziVar2, null);
                hfmVar5.ad(R6);
            }
            hgs.g(ffcuVar, (ffjm) R6, hfdVar2);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fzm(hviVar, l, ffjiVar2, hamVar, ffjmVar, ffjmVar2, fzqVar, hawVar2, locale, fzrVar, z, i, i2);
        }
    }
}
