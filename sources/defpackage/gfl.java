package defpackage;

import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfl {
    public static final float a(int i) {
        return gfs.a(i, 3) ? 12.0f : 8.0f;
    }

    public static final int b(iny inyVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        return ffmk.g(Math.max(Math.max(jzk.c(j), inyVar.eo(gfs.a(i6, 1) ? 56.0f : gfs.a(i6, 2) ? 72.0f : 88.0f)), i7 + Math.max(i, Math.max(i3 + i4 + i5, i2))), jzk.a(j));
    }

    public static final void c(ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, ffjm ffjmVar5, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2052297037);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar4) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjmVar5) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new gfq();
                hfmVar.ad(R);
            }
            gfq gfqVar = (gfq) R;
            ffjm[] ffjmVarArr = new ffjm[5];
            ffjmVarArr[0] = ffjmVar3;
            ffjmVarArr[1] = ffjmVar4 == null ? fyr.a : ffjmVar4;
            ffjmVarArr[2] = ffjmVar5 == null ? fyr.b : ffjmVar5;
            ffjmVarArr[3] = ffjmVar == null ? fyr.c : ffjmVar;
            ffjmVarArr[4] = ffjmVar2 == null ? fyr.d : ffjmVar2;
            List g = ffdx.g(ffjmVarArr);
            hve hveVar = hvi.e;
            ffjm a = iol.a(g);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ipv(gfqVar);
                hfmVar.ad(R2);
            }
            ipn ipnVar = (ipn) R2;
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, ipnVar, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar6 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar6);
            }
            hlc.b(b, b2, iss.c);
            a.a(b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gfi(ffjmVar, ffjmVar2, ffjmVar3, ffjmVar4, ffjmVar5, i);
        }
    }

    public static final void d(long j, hej hejVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        long j2;
        ffjm ffjmVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1133967795);
        if (i3 == 0) {
            i2 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hejVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            j2 = j;
            ffjmVar2 = ffjmVar;
        } else {
            j2 = j;
            hca.a(j2, gvu.a(hejVar, b), ffjmVar, b, i2 & 910);
            ffjmVar2 = ffjmVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gfj(j2, hejVar, ffjmVar2, i);
        }
    }

    public static final boolean e(jzn jznVar, int i) {
        return i > jznVar.en(kal.c(30));
    }

    public static final int f(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        if (jzk.i(j)) {
            return jzk.b(j);
        }
        return i6 + i + Math.max(i3, Math.max(i4, i5)) + i2;
    }

    public static final void g(ffjm ffjmVar, hvi hviVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, ffjm ffjmVar5, gez gezVar, hfd hfdVar, int i) {
        int i2;
        hpn hpnVar;
        hpn hpnVar2;
        hpn hpnVar3;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1647707763);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjmVar4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjmVar5) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(gezVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.A(0.0f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.A(0.0f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i2 & 38347923) == 38347922 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hpn d = hpx.d(-403249643, new gfd(gezVar, ffjmVar), b);
            hpn hpnVar4 = null;
            if (ffjmVar3 == null) {
                b.v(-669383419);
                ((hfm) b).Z();
                hpnVar = null;
            } else {
                b.v(-669383418);
                hpn d2 = hpx.d(-1020860251, new gfg(gezVar, ffjmVar3), b);
                ((hfm) b).Z();
                hpnVar = d2;
            }
            if (ffjmVar2 == null) {
                b.v(-669066227);
                ((hfm) b).Z();
                hpnVar2 = null;
            } else {
                b.v(-669066226);
                hpn d3 = hpx.d(-764441232, new gff(gezVar, ffjmVar2), b);
                ((hfm) b).Z();
                hpnVar2 = d3;
            }
            if (ffjmVar4 == null) {
                b.v(-668755421);
                ((hfm) b).Z();
                hpnVar3 = null;
            } else {
                b.v(-668755420);
                hpn d4 = hpx.d(1400509200, new gfe(gezVar, ffjmVar4), b);
                ((hfm) b).Z();
                hpnVar3 = d4;
            }
            if (ffjmVar5 == null) {
                b.v(-668339184);
            } else {
                b.v(-668339183);
                hpnVar4 = hpx.d(1512306332, new gfh(gezVar, ffjmVar5), b);
            }
            ((hfm) b).Z();
            hfdVar2 = b;
            gpa.c(jjs.c(hvi.e, true, gfa.a).a(hviVar), glx.c(10, b), gezVar.a, gezVar.b, 0.0f, 0.0f, null, hpx.d(1502590376, new gfb(hpnVar3, hpnVar4, d, hpnVar2, hpnVar), b), hfdVar2, 64);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gfc(ffjmVar, hviVar, ffjmVar2, ffjmVar3, ffjmVar4, ffjmVar5, gezVar, i);
        }
    }
}
