package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwr {
    public static final hvi a(hvi hviVar, int i, gxa gxaVar, ffix ffixVar, gwb gwbVar, idh idhVar) {
        return iop.a(hviVar, new gwq(ffixVar, gxaVar, i, gwbVar, idhVar));
    }

    public static final void b(gxa gxaVar, dqs dqsVar, ffjm ffjmVar, ebe ebeVar, hvi hviVar, dtt dttVar, ffjo ffjoVar, hfd hfdVar, int i) {
        int i2;
        float b;
        float a;
        hfd b2 = hfdVar.b(-2035733443);
        if ((i & 6) == 0) {
            i2 = (true != b2.F(gxaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(dqsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(ebeVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.B(2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.D(hviVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.A(8.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.D(dttVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b2.F(ffjoVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            if (dqsVar == dqs.a) {
                b2.v(580863331);
                ((hfm) b2).Z();
                b = ((ebf) ebeVar).a;
            } else {
                b2.v(580914853);
                b = eba.b(ebeVar, (kah) b2.e(jdr.j));
                ((hfm) b2).Z();
            }
            float em = ((jzn) b2.e(jdr.e)).em(b);
            if (dqsVar == dqs.a) {
                b2.v(-1036189831);
                ((hfm) b2).Z();
                a = ((ebf) ebeVar).b;
            } else {
                b2.v(-1036135488);
                a = eba.a(ebeVar, (kah) b2.e(jdr.j));
                ((hfm) b2).Z();
            }
            float em2 = ((jzn) b2.e(jdr.e)).em(a);
            int i3 = i2 & 896;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (i3 == 256 || R == hfc.a) {
                R = new gws(ffjmVar, em, em2);
                hfmVar.ad(R);
            }
            gws gwsVar = (gws) R;
            gxj gxjVar = new gxj(gwsVar);
            if (dqsVar == dqs.b) {
                int i4 = 57344 & i2;
                b2.v(-1618656812);
                ebf ebfVar = (ebf) ebeVar;
                eno.d(gxaVar.b, hviVar, eba.h(0.0f, ebfVar.a, 0.0f, ebfVar.b, 5), gwsVar, null, dttVar, false, null, gxjVar, hpx.d(687111200, new gwg(gxaVar, gwsVar, ffjoVar), b2), b2, ((i2 >> 12) & 112) | i4 | ((i2 >> 3) & 458752) | (i2 & 29360128), 3072);
                hfmVar.Z();
            } else if (dqsVar == dqs.a) {
                b2.v(-1616954912);
                eno.f(gxaVar.b, hviVar, eba.h(eba.b(ebeVar, (kah) b2.e(jdr.j)), 0.0f, eba.a(ebeVar, (kah) b2.e(jdr.j)), 0.0f, 10), gwsVar, null, dttVar, false, null, gxjVar, hpx.d(-817308503, new gwj(gxaVar, gwsVar, ffjoVar), b2), b2, ((i2 >> 12) & 112) | (i2 & 57344) | ((i2 >> 3) & 458752) | (i2 & 29360128), 3072);
                hfmVar.Z();
            } else {
                b2.v(-1615302953);
                hfmVar.Z();
            }
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gwk(gxaVar, dqsVar, ffjmVar, ebeVar, hviVar, dttVar, ffjoVar, i);
        }
    }

    public static final void c(gxa gxaVar, hvi hviVar, dtt dttVar, float f, float f2, ebe ebeVar, ffjo ffjoVar, hfd hfdVar, int i) {
        int i2;
        dtt dttVar2;
        ffjo ffjoVar2;
        float f3;
        float f4;
        ebe ebfVar;
        ebe ebeVar2;
        float f5;
        float f6;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1825706865);
        if (i3 == 0) {
            i2 = (true != b.F(gxaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(156.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(8.0f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            dttVar2 = dttVar;
            i2 |= true != b.D(dttVar2) ? 8192 : 16384;
        } else {
            dttVar2 = dttVar;
        }
        int i4 = i2 | 14352384;
        if ((100663296 & i) == 0) {
            ffjoVar2 = ffjoVar;
            i4 |= true != b.F(ffjoVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ffjoVar2 = ffjoVar;
        }
        if ((38347923 & i4) == 38347922 && b.I()) {
            b.s();
            f6 = f;
            f5 = f2;
            ebeVar2 = ebeVar;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                f3 = 56.0f;
                f4 = 40.0f;
                ebfVar = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                b.s();
                f4 = f;
                f3 = f2;
                ebfVar = ebeVar;
            }
            b.l();
            jzn jznVar = (jzn) b.e(jdr.e);
            int i5 = i4;
            dqs dqsVar = dqs.b;
            boolean D = ((i5 & 112) == 32) | b.D(jznVar) | b.F(gxaVar);
            boolean z = (i5 & 458752) == 131072;
            boolean z2 = (i5 & 3670016) == 1048576;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z | D | z2) || R == hfc.a) {
                R = new gwl(jznVar, gxaVar, f4, f3);
                hfmVar.ad(R);
            }
            int i6 = i5 << 9;
            b(gxaVar, dqsVar, (ffjm) R, ebfVar, hviVar, dttVar2, ffjoVar2, b, (i5 & 14) | 24624 | ((i5 >> 12) & 7168) | (i6 & 458752) | (i6 & 3670016) | (29360128 & i6) | (i5 & 234881024));
            ebeVar2 = ebfVar;
            f5 = f3;
            f6 = f4;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gwm(gxaVar, hviVar, dttVar, f6, f5, ebeVar2, ffjoVar, i);
        }
    }
}
