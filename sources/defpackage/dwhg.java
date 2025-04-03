package defpackage;

import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhg {
    public static final void a(fxz fxzVar, glv glvVar, gvs gvsVar, final ffjm ffjmVar, hfd hfdVar, final int i, final int i2) {
        fxz fxzVar2;
        int i3;
        final glv glvVar2;
        final gvs gvsVar2;
        final fxz fxzVar3;
        ffjmVar.getClass();
        int i4 = i & 6;
        hfd b = hfdVar.b(648134875);
        if (i4 == 0) {
            int i5 = 2;
            if ((i2 & 1) == 0) {
                fxzVar2 = fxzVar;
                if (b.D(fxzVar2)) {
                    i5 = 4;
                }
            } else {
                fxzVar2 = fxzVar;
            }
            i3 = i5 | i;
        } else {
            fxzVar2 = fxzVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0) {
                glvVar2 = glvVar;
                if (b.D(glvVar2)) {
                    i6 = 32;
                }
            } else {
                glvVar2 = glvVar;
            }
            i3 |= i6;
        } else {
            glvVar2 = glvVar;
        }
        if ((i & 384) == 0) {
            int i7 = 128;
            if ((i2 & 4) == 0) {
                gvsVar2 = gvsVar;
                if (b.D(gvsVar2)) {
                    i7 = 256;
                }
            } else {
                gvsVar2 = gvsVar;
            }
            i3 |= i7;
        } else {
            gvsVar2 = gvsVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            fxzVar3 = fxzVar2;
        } else {
            int i8 = i2 & 4;
            int i9 = i2 & 2;
            int i10 = i2 & 1;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                if (i10 != 0) {
                    i3 &= -15;
                    fxzVar2 = dwfv.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
                }
                if (i9 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    glvVar2 = dwiq.a;
                }
                if (i8 != 0) {
                    i3 &= -897;
                    gvsVar2 = dwhh.a();
                }
            } else {
                b.s();
                if (i10 != 0) {
                    i3 &= -15;
                }
                if (i9 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i8 != 0) {
                    i3 &= -897;
                }
            }
            fxz fxzVar4 = fxzVar2;
            glv glvVar3 = glvVar2;
            gvs gvsVar3 = gvsVar2;
            b.l();
            int i11 = i3 << 3;
            b(fxzVar4, new dwib(), glvVar3, gvsVar3, ffjmVar, b, (i3 & 14) | (i11 & 896) | (i11 & 7168) | (i11 & 57344));
            fxzVar3 = fxzVar4;
            glvVar2 = glvVar3;
            gvsVar2 = gvsVar3;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwhe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fxz fxzVar5 = fxz.this;
                    glv glvVar4 = glvVar2;
                    gvs gvsVar4 = gvsVar2;
                    dwhg.a(fxzVar5, glvVar4, gvsVar4, ffjmVar, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(fxz fxzVar, giz gizVar, glv glvVar, gvs gvsVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        gvs gvsVar2;
        final fxz fxzVar2;
        final giz gizVar2;
        final glv glvVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2124579738);
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
            gvsVar2 = gvsVar;
            glvVar2 = glvVar;
            gizVar2 = gizVar;
            fxzVar2 = fxzVar;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            gvsVar2 = gvsVar;
            gga.b(fxzVar, gizVar, glvVar, gvsVar2, hpx.d(1798917965, new dwhf(c(fxzVar, b), ffjmVar), b), b, (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896) | (i2 & 7168));
            fxzVar2 = fxzVar;
            gizVar2 = gizVar;
            glvVar2 = glvVar;
        }
        hio L = b.L();
        if (L != null) {
            final gvs gvsVar3 = gvsVar2;
            L.d = new ffjm() { // from class: dwhd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fxz fxzVar3 = fxz.this;
                    giz gizVar3 = gizVar2;
                    glv glvVar3 = glvVar2;
                    gvs gvsVar4 = gvsVar3;
                    dwhg.b(fxzVar3, gizVar3, glvVar3, gvsVar4, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final fhz c(fxz fxzVar, hfd hfdVar) {
        long f;
        hfdVar.v(-816036754);
        hfdVar.v(-1957191637);
        long j = fxzVar.a;
        boolean C = hfdVar.C(j);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (C || R == hfc.a) {
            f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), 0.4f, ibw.f(j));
            R = new fhz(j, f);
            hfmVar.ad(R);
        }
        fhz fhzVar = (fhz) R;
        hfmVar.Z();
        hfmVar.Z();
        return fhzVar;
    }
}
