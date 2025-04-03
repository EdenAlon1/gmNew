package defpackage;

import com.android.vcard.VCardConfig;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfo {
    public static final void a(hvi hviVar, idh idhVar, fwd fwdVar, fwi fwiVar, der derVar, final ffjn ffjnVar, hfd hfdVar, final int i, final int i2) {
        hvi hviVar2;
        int i3;
        idh idhVar2;
        fwd fwdVar2;
        fwi fwiVar2;
        der derVar2;
        idh idhVar3;
        fwd fwdVar3;
        fwi fwiVar3;
        hvi hviVar3;
        fwi fwiVar4;
        idh idhVar4;
        fwd fwdVar4;
        hfd hfdVar2;
        der derVar3;
        final hvi hviVar4;
        final idh idhVar5;
        final fwd fwdVar5;
        final fwi fwiVar5;
        ffjnVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(1536405658);
        if (i4 != 0) {
            i3 = i | 6;
            hviVar2 = hviVar;
        } else if ((i & 6) == 0) {
            hviVar2 = hviVar;
            i3 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if ((i2 & 2) == 0) {
                idhVar2 = idhVar;
                if (b.D(idhVar2)) {
                    i5 = 32;
                }
            } else {
                idhVar2 = idhVar;
            }
            i3 |= i5;
        } else {
            idhVar2 = idhVar;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0) {
                fwdVar2 = fwdVar;
                if (b.D(fwdVar2)) {
                    i6 = 256;
                }
            } else {
                fwdVar2 = fwdVar;
            }
            i3 |= i6;
        } else {
            fwdVar2 = fwdVar;
        }
        if ((i & 3072) == 0) {
            int i7 = 1024;
            if ((i2 & 8) == 0) {
                fwiVar2 = fwiVar;
                if (b.D(fwiVar2)) {
                    i7 = 2048;
                }
            } else {
                fwiVar2 = fwiVar;
            }
            i3 |= i7;
        } else {
            fwiVar2 = fwiVar;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
            derVar2 = derVar;
        } else {
            derVar2 = derVar;
            if ((i & 24576) == 0) {
                i3 |= true != b.D(derVar2) ? 8192 : 16384;
            }
        }
        if ((196608 & i) == 0) {
            i3 |= true != b.F(ffjnVar) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && b.I()) {
            b.s();
            hviVar4 = hviVar2;
            idhVar5 = idhVar2;
            fwdVar5 = fwdVar2;
            fwiVar5 = fwiVar2;
        } else {
            int i9 = i2 & 8;
            int i10 = i2 & 4;
            int i11 = i2 & 2;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hvi hviVar5 = i4 != 0 ? hvi.e : hviVar2;
                if (i11 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    b.v(-1167381787);
                    idhVar3 = dwiq.b(13, b);
                    ((hfm) b).Z();
                } else {
                    idhVar3 = idhVar2;
                }
                if (i10 != 0) {
                    fwdVar3 = dwfk.b(0L, 0L, b, 15);
                    i3 &= -897;
                } else {
                    fwdVar3 = fwdVar2;
                }
                if (i9 != 0) {
                    fwiVar3 = dwfk.a(b);
                    i3 &= -7169;
                } else {
                    fwiVar3 = fwiVar2;
                }
                if (i8 != 0) {
                    hviVar3 = hviVar5;
                    fwiVar4 = fwiVar3;
                    idhVar4 = idhVar3;
                    fwdVar4 = fwdVar3;
                    hfdVar2 = b;
                    derVar3 = null;
                    hfdVar2.l();
                    fwo.a(hviVar3, idhVar4, fwdVar4, fwiVar4, derVar3, ffjnVar, hfdVar2, i3 & 524286);
                    derVar2 = derVar3;
                    b = hfdVar2;
                    hviVar4 = hviVar3;
                    idhVar5 = idhVar4;
                    fwdVar5 = fwdVar4;
                    fwiVar5 = fwiVar4;
                } else {
                    hviVar3 = hviVar5;
                    fwiVar4 = fwiVar3;
                    idhVar4 = idhVar3;
                    fwdVar4 = fwdVar3;
                }
            } else {
                b.s();
                if (i11 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i10 != 0) {
                    i3 &= -897;
                }
                if (i9 != 0) {
                    i3 &= -7169;
                }
                hviVar3 = hviVar2;
                idhVar4 = idhVar2;
                fwdVar4 = fwdVar2;
                fwiVar4 = fwiVar2;
            }
            hfdVar2 = b;
            derVar3 = derVar2;
            hfdVar2.l();
            fwo.a(hviVar3, idhVar4, fwdVar4, fwiVar4, derVar3, ffjnVar, hfdVar2, i3 & 524286);
            derVar2 = derVar3;
            b = hfdVar2;
            hviVar4 = hviVar3;
            idhVar5 = idhVar4;
            fwdVar5 = fwdVar4;
            fwiVar5 = fwiVar4;
        }
        final der derVar4 = derVar2;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwfn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar6 = hvi.this;
                    idh idhVar6 = idhVar5;
                    fwd fwdVar6 = fwdVar5;
                    fwi fwiVar6 = fwiVar5;
                    der derVar5 = derVar4;
                    dwfo.a(hviVar6, idhVar6, fwdVar6, fwiVar6, derVar5, ffjnVar, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final ffix ffixVar, final hvi hviVar, boolean z, final idh idhVar, final fwd fwdVar, fwi fwiVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        ffix ffixVar2;
        int i2;
        idh idhVar2;
        ffjn ffjnVar2;
        boolean z2;
        fwi a;
        hfd hfdVar2;
        final boolean z3;
        final fwi fwiVar2;
        ffjnVar.getClass();
        hfd b = hfdVar.b(-2043141941);
        if ((i & 6) == 0) {
            ffixVar2 = ffixVar;
            i2 = (true != b.F(ffixVar2) ? 2 : 4) | i;
        } else {
            ffixVar2 = ffixVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            idhVar2 = idhVar;
            i3 |= true != b.D(idhVar2) ? 1024 : 2048;
        } else {
            idhVar2 = idhVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.D(fwdVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        int i4 = i3 | 14155776;
        if ((100663296 & i) == 0) {
            ffjnVar2 = ffjnVar;
            i4 |= true != b.F(ffjnVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((38347923 & i4) == 38347922 && b.I()) {
            b.s();
            z3 = z;
            fwiVar2 = fwiVar;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                z2 = true;
                a = dwfk.a(b);
            } else {
                b.s();
                z2 = z;
                a = fwiVar;
            }
            b.l();
            hfdVar2 = b;
            fwo.c(ffixVar2, hviVar, z2, idhVar2, fwdVar, a, ffjnVar2, hfdVar2, i4 & 267976702);
            z3 = z2;
            fwiVar2 = a;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwfl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    hvi hviVar2 = hviVar;
                    boolean z4 = z3;
                    idh idhVar3 = idhVar;
                    fwd fwdVar2 = fwdVar;
                    fwi fwiVar3 = fwiVar2;
                    dwfo.b(ffixVar3, hviVar2, z4, idhVar3, fwdVar2, fwiVar3, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final hvi hviVar, idh idhVar, fwd fwdVar, fwi fwiVar, der derVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        long f;
        idh idhVar2;
        fwd fwdVar2;
        fwi fwiVar2;
        der derVar2;
        final idh idhVar3;
        final fwd fwdVar3;
        final fwi fwiVar3;
        final der derVar3;
        ffjnVar.getClass();
        hfd b = hfdVar.b(488271448);
        if ((i & 6) == 0) {
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
                b.v(-2063131167);
                idh b2 = dwiq.b(13, b);
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                b.v(-976332415);
                long c = dwfv.c(35, b);
                long a = dwfv.a(c, b);
                f = iby.f(ibw.d(a), ibw.c(a), ibw.b(a), 0.38f, ibw.f(a));
                fwd a2 = fwe.a(c, a, c, f, b);
                b = b;
                hfmVar.Z();
                b.v(-463571699);
                fwi fwiVar4 = new fwi(0.0f);
                hfmVar.Z();
                b.v(652558697);
                b.v(1760627272);
                long c2 = dwfv.c(25, b);
                hfmVar.Z();
                der a3 = des.a(1.0f, c2);
                hfmVar.Z();
                idhVar2 = b2;
                fwdVar2 = a2;
                fwiVar2 = fwiVar4;
                derVar2 = a3;
            } else {
                b.s();
                idhVar2 = idhVar;
                fwdVar2 = fwdVar;
                fwiVar2 = fwiVar;
                derVar2 = derVar;
            }
            b.l();
            a(hviVar2, idhVar2, fwdVar2, fwiVar2, derVar2, ffjnVar, b, i2 & 458766, 0);
            idhVar3 = idhVar2;
            fwdVar3 = fwdVar2;
            fwiVar3 = fwiVar2;
            derVar3 = derVar2;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwfm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    idh idhVar4 = idhVar3;
                    fwd fwdVar4 = fwdVar3;
                    fwi fwiVar5 = fwiVar3;
                    der derVar4 = derVar3;
                    dwfo.c(hviVar3, idhVar4, fwdVar4, fwiVar5, derVar4, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
