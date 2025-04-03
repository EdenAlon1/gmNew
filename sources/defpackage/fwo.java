package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwo {
    public static final void a(hvi hviVar, idh idhVar, fwd fwdVar, fwi fwiVar, der derVar, ffjn ffjnVar, hfd hfdVar, int i) {
        hvi hviVar2;
        int i2;
        der derVar2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1179621553);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(idhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(fwdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(fwiVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            derVar2 = derVar;
            i2 |= true != b.D(derVar2) ? 8192 : 16384;
        } else {
            derVar2 = derVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjnVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hfdVar2 = b;
            gpa.c(hviVar2, idhVar, fwdVar.a(true), fwdVar.b(true), 0.0f, ((jzq) fwiVar.a(true, null, b, ((i2 >> 3) & 896) | 54).a()).a, derVar2, hpx.d(664103990, new fwj(ffjnVar), b), hfdVar2, 16);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fwk(hviVar, idhVar, fwdVar, fwiVar, derVar, ffjnVar, i);
        }
    }

    public static final void b(hvi hviVar, idh idhVar, fwd fwdVar, fwi fwiVar, der derVar, ffjn ffjnVar, hfd hfdVar, int i) {
        hvi hviVar2;
        int i2;
        idh idhVar2;
        fwi fwiVar2;
        der derVar2;
        fwd fwdVar2;
        long f;
        idh idhVar3;
        fwd fwdVar3;
        fwi fwiVar3;
        der derVar3;
        int i3 = i & 6;
        hfd b = hfdVar.b(740336179);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjnVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
            idhVar3 = idhVar;
            fwdVar3 = fwdVar;
            fwiVar3 = fwiVar;
            derVar3 = derVar;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                idh c = glx.c(9, b);
                fxz a = gft.a(b);
                fwd fwdVar4 = a.O;
                if (fwdVar4 == null) {
                    long g = fyc.g(a, 35);
                    long a2 = fyc.a(a, fyc.g(a, 35));
                    long g2 = fyc.g(a, 35);
                    f = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.38f, ibw.f(fyc.a(a, fyc.g(a, 35))));
                    fwd fwdVar5 = new fwd(g, a2, g2, f);
                    a.O = fwdVar5;
                    fwdVar4 = fwdVar5;
                }
                fwi fwiVar4 = new fwi(0.0f);
                b.v(-133959402);
                long h = fyc.h(25, b);
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                boolean C = b.C(h);
                Object R = hfmVar.R();
                if (C || R == hfc.a) {
                    R = des.a(1.0f, h);
                    hfmVar.ad(R);
                }
                idhVar2 = c;
                fwiVar2 = fwiVar4;
                derVar2 = (der) R;
                fwdVar2 = fwdVar4;
            } else {
                b.s();
                idhVar2 = idhVar;
                fwdVar2 = fwdVar;
                fwiVar2 = fwiVar;
                derVar2 = derVar;
            }
            b.l();
            a(hviVar2, idhVar2, fwdVar2, fwiVar2, derVar2, ffjnVar, b, i2 & 458766);
            idhVar3 = idhVar2;
            fwdVar3 = fwdVar2;
            fwiVar3 = fwiVar2;
            derVar3 = derVar2;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fwn(hviVar, idhVar3, fwdVar3, fwiVar3, derVar3, ffjnVar, i);
        }
    }

    public static final void c(ffix ffixVar, hvi hviVar, boolean z, idh idhVar, fwd fwdVar, fwi fwiVar, ffjn ffjnVar, hfd hfdVar, int i) {
        ffix ffixVar2;
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2024281376);
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
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(idhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(fwdVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(fwiVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(null) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.F(ffjnVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            b.v(1142832616);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar.Z();
            int i4 = i2;
            ffix ffixVar3 = ffixVar2;
            gpa.e(ffixVar3, hviVar, z, idhVar, fwdVar.a(z), fwdVar.b(z), ((jzq) fwiVar.a(z, dwnVar, b, ((i4 >> 9) & 896) | ((i4 >> 6) & 14)).a()).a, null, dwnVar, hpx.d(776921067, new fwl(ffjnVar), b), b, 64);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fwm(ffixVar, hviVar, z, idhVar, fwdVar, fwiVar, ffjnVar, i);
        }
    }
}
