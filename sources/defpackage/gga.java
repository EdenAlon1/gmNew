package defpackage;

import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gga {
    private static final hik a = new hky(gfu.a);

    public static final void a(fxz fxzVar, giz gizVar, glv glvVar, gvs gvsVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        glv glvVar2;
        gvs gvsVar2;
        ffjm ffjmVar2;
        giz gizVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1860825897);
        if (i3 == 0) {
            i2 = (true != b.D(fxzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(gizVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            glvVar2 = glvVar;
            i2 |= true != b.D(glvVar2) ? 128 : 256;
        } else {
            glvVar2 = glvVar;
        }
        if ((i & 3072) == 0) {
            gvsVar2 = gvsVar;
            i2 |= true != b.D(gvsVar2) ? 1024 : 2048;
        } else {
            gvsVar2 = gvsVar;
        }
        if ((i & 24576) == 0) {
            ffjmVar2 = ffjmVar;
            i2 |= true != b.F(ffjmVar2) ? 8192 : 16384;
        } else {
            ffjmVar2 = ffjmVar;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            hik hikVar = a;
            if (((Boolean) b.e(hikVar)).booleanValue()) {
                b.v(549080836);
                b.v(1126092287);
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                if (gizVar == null) {
                    b.v(1126095427);
                    gizVar2 = gft.b(b);
                    hfmVar.Z();
                } else {
                    b.v(1126094497);
                    hfmVar.Z();
                    gizVar2 = gizVar;
                }
                b.v(1126096701);
                hfmVar.Z();
                b.v(1126098645);
                hfmVar.Z();
                b(fxzVar, gizVar2, glvVar2, gvsVar2, ffjmVar2, b, i2 & 57344);
                hfmVar.Z();
            } else {
                b.v(549416411);
                hfz.a(hikVar.c(true), hpx.d(520220741, new gfv(fxzVar, gizVar, glvVar, gvsVar, ffjmVar), b), b, 56);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gfw(fxzVar, gizVar, glvVar, gvsVar, ffjmVar, i);
        }
    }

    public static final void b(fxz fxzVar, giz gizVar, glv glvVar, gvs gvsVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        char c;
        char c2;
        long f;
        int i3 = i & 6;
        hfd b = hfdVar.b(1317723617);
        if (i3 == 0) {
            i2 = (true != b.D(fxzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(gizVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(glvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(gvsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjmVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            dhf a2 = gkw.a(false, 0.0f, 0L, 7);
            long j = fxzVar.a;
            boolean C = b.C(j);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (C || R == hfc.a) {
                c = 1;
                c2 = 4;
                f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), 0.4f, ibw.f(j));
                R = new fhz(j, f);
                hfmVar.ad(R);
            } else {
                c = 1;
                c2 = 4;
            }
            hil[] hilVarArr = new hil[6];
            hilVarArr[0] = fyc.a.c(fxzVar);
            hilVarArr[c] = gjb.a.c(gizVar);
            hilVarArr[2] = dhc.a.c(a2);
            hilVarArr[3] = glx.a.c(glvVar);
            hilVarArr[c2] = fib.a.c((fhz) R);
            hilVarArr[5] = gvu.a.c(gvsVar);
            hfz.b(hilVarArr, hpx.d(-2097082079, new gfy(gvsVar, ffjmVar), b), b, 56);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gfz(fxzVar, gizVar, glvVar, gvsVar, ffjmVar, i);
        }
    }

    public static final void c(fxz fxzVar, glv glvVar, gvs gvsVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        fxz fxzVar2;
        gvs gvsVar2;
        ffjm ffjmVar2;
        glv glvVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2127166334);
        if (i3 == 0) {
            i2 = (true != b.D(fxzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(gvsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            ffjmVar2 = ffjmVar;
            gvsVar2 = gvsVar;
            glvVar2 = glvVar;
            fxzVar2 = fxzVar;
        } else {
            int i4 = i2 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                glvVar = gft.c(b);
            } else {
                b.s();
            }
            glv glvVar3 = glvVar;
            b.l();
            int i5 = i4 << 3;
            b(fxzVar, gft.b(b), glvVar3, gvsVar, ffjmVar, b, (i2 & 14) | (i5 & 7168) | (i5 & 57344));
            fxzVar2 = fxzVar;
            gvsVar2 = gvsVar;
            ffjmVar2 = ffjmVar;
            glvVar2 = glvVar3;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gfx(fxzVar2, glvVar2, gvsVar2, ffjmVar2, i);
        }
    }
}
