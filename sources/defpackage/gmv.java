package defpackage;

import androidx.compose.foundation.HoverableElement;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmv {
    public static final gmv a = new gmv();
    public static final float b = 4.0f;
    private static final icv c = new ibc((byte[]) null);

    private gmv() {
    }

    public static final void b(ifr ifrVar, dqs dqsVar, long j, long j2, long j3, float f, float f2) {
        long a2 = iaf.a(f, f);
        long a3 = iaf.a(f2, f2);
        iao a4 = dqsVar == dqs.a ? iap.a(ian.a(j, ias.a(iar.c(j2), iar.a(j2))), a2, a2, a3, a3) : iap.a(ian.a(j, ias.a(iar.c(j2), iar.a(j2))), a2, a3, a3, a2);
        icv icvVar = c;
        icvVar.s(a4);
        ifq.h(ifrVar, icvVar, j3, null, 60);
        icvVar.l();
    }

    public static final gmm c(fxz fxzVar) {
        long f;
        long f2;
        long f3;
        long f4;
        long f5;
        gmm gmmVar = fxzVar.ab;
        if (gmmVar != null) {
            return gmmVar;
        }
        long g = fyc.g(fxzVar, 26);
        long g2 = fyc.g(fxzVar, 26);
        long g3 = fyc.g(fxzVar, 32);
        long g4 = fyc.g(fxzVar, 32);
        long g5 = fyc.g(fxzVar, 26);
        f = iby.f(ibw.d(r14), ibw.c(r14), ibw.b(r14), 0.38f, ibw.f(fyc.g(fxzVar, 18)));
        long h = iby.h(f, fxzVar.p);
        f2 = iby.f(ibw.d(r14), ibw.c(r14), ibw.b(r14), 0.38f, ibw.f(fyc.g(fxzVar, 18)));
        f3 = iby.f(ibw.d(r9), ibw.c(r9), ibw.b(r9), 0.12f, ibw.f(fyc.g(fxzVar, 18)));
        f4 = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.12f, ibw.f(fyc.g(fxzVar, 18)));
        f5 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(fyc.g(fxzVar, 18)));
        gmm gmmVar2 = new gmm(g, g2, g3, g4, g5, h, f2, f3, f4, f5);
        fxzVar.ab = gmmVar2;
        return gmmVar2;
    }

    public final void a(gnn gnnVar, float f, hvi hviVar, boolean z, gmm gmmVar, ffjm ffjmVar, ffjn ffjnVar, float f2, float f3, hfd hfdVar, int i, int i2) {
        int i3;
        hvi d;
        hvi e;
        hfd hfdVar2;
        hvi hviVar2;
        hfd hfdVar3;
        int i4 = i & 6;
        hfd b2 = hfdVar.b(-1066375183);
        if (i4 == 0) {
            i3 = (true != b2.F(gnnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b2.A(8.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b2.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b2.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.D(gmmVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != b2.F(ffjnVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b2.A(f2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b2.A(f3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != b2.E(false) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i3) == 306783378 && (i2 & 1) == 0 && b2.I()) {
            b2.s();
            hfdVar3 = b2;
        } else {
            long b3 = gmmVar.b(z, false);
            long b4 = gmmVar.b(z, true);
            long a2 = gmmVar.a(z, false);
            long a3 = gmmVar.a(z, true);
            if (gnnVar.e == dqs.a) {
                float f4 = gnj.a;
                e = ebs.b(ebs.o(hviVar, 16.0f), 1.0f);
            } else {
                d = ebs.d(hviVar, 1.0f);
                float f5 = gnj.a;
                e = ebs.e(d, 16.0f);
                if (gnnVar.d) {
                    e = hya.a(e, -1.0f, 1.0f);
                }
            }
            hvi hviVar3 = e;
            boolean F = b2.F(gnnVar) | b2.C(b3) | b2.C(b4) | b2.C(a2) | b2.C(a3);
            boolean z2 = (i3 & 29360128) == 8388608;
            boolean z3 = (234881024 & i3) == 67108864;
            boolean z4 = (i3 & 112) == 32;
            boolean z5 = (458752 & i3) == 131072;
            boolean z6 = (3670016 & i3) == 1048576;
            boolean z7 = (1879048192 & i3) == 536870912;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (((z6 | F | z2 | z3 | z4 | z5) || z7) || R == hfc.a) {
                hfdVar2 = b2;
                hviVar2 = hviVar3;
                gmo gmoVar = new gmo(gnnVar, b3, b4, a2, a3, f2, f3, 8.0f, ffjmVar, ffjnVar);
                hfmVar.ad(gmoVar);
                R = gmoVar;
            } else {
                hfdVar2 = b2;
                hviVar2 = hviVar3;
            }
            hfdVar3 = hfdVar2;
            deu.a(hviVar2, (ffji) R, hfdVar3, 0);
        }
        hio L = hfdVar3.L();
        if (L != null) {
            L.d = new gmp(this, gnnVar, 8.0f, hviVar, z, gmmVar, ffjmVar, ffjnVar, f2, f3, i, i2);
        }
    }

    public final void d(dwn dwnVar, hvi hviVar, gmm gmmVar, boolean z, long j, hfd hfdVar, int i) {
        int i2;
        gmv gmvVar;
        long j2;
        hvi a2;
        hfd b2 = hfdVar.b(-290277409);
        if ((i & 6) == 0) {
            i2 = (true != b2.D(dwnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(gmmVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            gmvVar = this;
            i2 |= true != b2.D(gmvVar) ? 65536 : 131072;
        } else {
            gmvVar = this;
        }
        if ((74899 & i2) == 74898 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new hss();
                hfmVar.ad(R);
            }
            int i3 = i2 & 14;
            hss hssVar = (hss) R;
            Object R2 = hfmVar.R();
            if (i3 == 4 || R2 == hfc.a) {
                R2 = new gmr(dwnVar, hssVar, null);
                hfmVar.ad(R2);
            }
            hgs.g(dwnVar, (ffjm) R2, b2);
            if (hssVar.isEmpty()) {
                j2 = j;
            } else {
                float b3 = jzv.b(j) / 2.0f;
                j2 = (Float.floatToRawIntBits(jzv.a(j)) & 4294967295L) | (Float.floatToRawIntBits(b3) << 32);
            }
            a2 = ebs.l(hviVar, j2).a(new HoverableElement(dwnVar));
            ebv.a(dee.a(a2, z ? gmmVar.a : gmmVar.f, glx.c(5, b2)), b2);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gms(gmvVar, dwnVar, hviVar, gmmVar, z, j, i);
        }
    }

    public final void e(gnn gnnVar, hvi hviVar, boolean z, gmm gmmVar, ffjm ffjmVar, ffjn ffjnVar, float f, float f2, hfd hfdVar, int i) {
        gnn gnnVar2;
        int i2;
        float f3;
        ffjn ffjnVar2;
        hfd hfdVar2;
        ffjn ffjnVar3;
        hfd b2 = hfdVar.b(49984771);
        if ((i & 6) == 0) {
            gnnVar2 = gnnVar;
            i2 = (true != b2.F(gnnVar2) ? 2 : 4) | i;
        } else {
            gnnVar2 = gnnVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(gmmVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 8192 : 16384;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            f3 = f;
            i3 |= true != b2.A(f3) ? 524288 : 1048576;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b2.A(f2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != b2.D(this) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i3) == 38347922 && b2.I()) {
            b2.s();
            ffjnVar3 = ffjnVar;
            hfdVar2 = b2;
        } else {
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                ffjnVar2 = gmt.a;
            } else {
                b2.s();
                ffjnVar2 = ffjnVar;
            }
            b2.l();
            float f4 = gnj.a;
            int i4 = i3 << 3;
            hfdVar2 = b2;
            a(gnnVar2, 8.0f, hviVar, z, gmmVar, ffjmVar, ffjnVar2, f3, f2, hfdVar2, (i3 & 14) | 805306416 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024), (i3 >> 24) & 14);
            ffjnVar3 = ffjnVar2;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gmu(this, gnnVar, hviVar, z, gmmVar, ffjmVar, ffjnVar3, f, f2, i);
        }
    }
}
