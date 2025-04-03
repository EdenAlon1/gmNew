package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnj {
    public static final float a = 16.0f;
    private static final float b = 4.0f;
    private static final float c = 44.0f;

    static {
        jzr.b(b, c);
        jzr.b(c, b);
    }

    public static final float a(float f, float f2, float f3) {
        float f4 = f2 - f;
        return ffmk.e(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    public static final float b(float f, float f2, float f3, float f4, float f5) {
        return kav.b(f4, f5, a(f, f2, f3));
    }

    public static final void c(hvi hviVar, gnn gnnVar, boolean z, dwn dwnVar, ffjn ffjnVar, ffjn ffjnVar2, hfd hfdVar, int i) {
        int i2;
        gnn gnnVar2;
        hvi a2;
        hvi c2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(1390990089);
        if (i3 == 0) {
            i2 = (true != b2.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(gnnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(dwnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffjnVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffjnVar2) ? 65536 : 131072;
        }
        int i4 = i2;
        if ((74899 & i4) == 74898 && b2.I()) {
            b2.s();
            gnnVar2 = gnnVar;
        } else {
            boolean z2 = false;
            boolean z3 = b2.e(jdr.j) == kah.b;
            gnnVar.d = z3;
            if (gnnVar.e == dqs.b && z3) {
                z2 = true;
            } else {
                dqs dqsVar = dqs.a;
            }
            hvi hviVar2 = hvi.e;
            if (z) {
                gni gniVar = new gni(gnnVar, null);
                iki ikiVar = ilv.a;
                hviVar2 = new SuspendPointerInputElement(gnnVar, dwnVar, null, new ilu(gniVar), 4);
            }
            hve hveVar = hvi.e;
            hvi hviVar3 = hviVar2;
            dqs dqsVar2 = gnnVar.e;
            boolean l = gnnVar.l();
            boolean F = b2.F(gnnVar);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new gnc(gnnVar, null);
                hfmVar.ad(R);
            }
            hvi a3 = dpj.a(hveVar, gnnVar, dqsVar2, z, dwnVar, l, (ffjn) R, z2, 32);
            boolean z4 = z2;
            gnnVar2 = gnnVar;
            hvi y = gnnVar2.e == dqs.a ? ebs.y(ioe.a(hvi.e, gmn.a)) : ebs.A(ioe.a(hvi.e, gmn.a));
            hvi a4 = gex.a(hviVar);
            dqs dqsVar3 = gnnVar2.e;
            dqs dqsVar4 = dqs.a;
            a2 = a4.a(new SizeElement(dqsVar3 == dqsVar4 ? 16.0f : 4.0f, dqsVar3 == dqsVar4 ? 4.0f : 16.0f, Float.NaN, Float.NaN, false));
            c2 = jjs.c(a2, false, new gnf(z, gnnVar2));
            hvi hviVar4 = y;
            hvi a5 = ija.a(dfz.a(jjs.c(c2.a(gyf.a), true, new dit(gnnVar2.d(), new ffmf(((Number) gnnVar2.i.c()).floatValue(), ((Number) gnnVar2.i.b()).floatValue()))), z, dwnVar), new gnd(z, gnnVar2.b, gnnVar2.i, z4, gnnVar2.d(), gnnVar2.a)).a(hviVar3).a(a3);
            boolean F2 = b2.F(gnnVar2);
            Object R2 = hfmVar.R();
            if (F2 || R2 == hfc.a) {
                R2 = new gna(gnnVar2);
                hfmVar.ad(R2);
            }
            ipn ipnVar = (ipn) R2;
            int a6 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, a5);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, ipnVar, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf = Integer.valueOf(a6);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            boolean F3 = b2.F(gnnVar2);
            Object R3 = hfmVar.R();
            if (F3 || R3 == hfc.a) {
                R3 = new gmy(gnnVar2);
                hfmVar.ad(R3);
            }
            hvi a7 = iqd.a(hviVar4, (ffji) R3);
            int i6 = huo.a;
            ipn a8 = dyc.a(hum.a, false);
            int a9 = hey.a(b2);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b2, a7);
            ffix ffixVar2 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar2);
            } else {
                b2.z();
            }
            hlc.b(b2, a8, iss.e);
            hlc.b(b2, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a9))) {
                Integer valueOf2 = Integer.valueOf(a9);
                hfmVar.ad(valueOf2);
                b2.h(valueOf2, ffjmVar2);
            }
            hlc.b(b2, b4, iss.c);
            int i7 = (i4 >> 3) & 14;
            ffjnVar.a(gnnVar2, b2, Integer.valueOf(((i4 >> 9) & 112) | i7));
            b2.n();
            hvi a10 = ioe.a(hvi.e, gmn.b);
            ipn a11 = dyc.a(hum.a, false);
            int a12 = hey.a(b2);
            hqb ai3 = hfmVar.ai();
            hvi b5 = huz.b(b2, a10);
            ffix ffixVar3 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar3);
            } else {
                b2.z();
            }
            hlc.b(b2, a11, iss.e);
            hlc.b(b2, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a12))) {
                Integer valueOf3 = Integer.valueOf(a12);
                hfmVar.ad(valueOf3);
                b2.h(valueOf3, ffjmVar3);
            }
            hlc.b(b2, b5, iss.c);
            ffjnVar2.a(gnnVar2, b2, Integer.valueOf(i7 | ((i4 >> 12) & 112)));
            b2.n();
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gnb(hviVar, gnnVar2, z, dwnVar, ffjnVar, ffjnVar2, i);
        }
    }

    public static final void d(gnn gnnVar, hvi hviVar, boolean z, gmm gmmVar, dwn dwnVar, ffjn ffjnVar, ffjn ffjnVar2, hfd hfdVar, int i) {
        gnn gnnVar2;
        int i2;
        gmm c2;
        gmm gmmVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1303883986);
        if (i3 == 0) {
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
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.D(dwnVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffjnVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.F(ffjnVar2) ? 524288 : 1048576;
        }
        if ((599187 & i2) == 599186 && b2.I()) {
            b2.s();
            gmmVar2 = gmmVar;
        } else {
            int i4 = i2 & (-7169);
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                gmv gmvVar = gmv.a;
                c2 = gmv.c(gft.a(b2));
            } else {
                b2.s();
                c2 = gmmVar;
            }
            b2.l();
            int i5 = i4 >> 3;
            c(hviVar, gnnVar2, z, dwnVar, ffjnVar, ffjnVar2, b2, (i2 & 896) | ((i4 << 3) & 112) | (i5 & 14) | (i5 & 7168) | (57344 & i5) | (458752 & i5));
            gmmVar2 = c2;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gmw(gnnVar, hviVar, z, gmmVar2, dwnVar, ffjnVar, ffjnVar2, i);
        }
    }

    public static final void e(float f, ffji ffjiVar, hvi hviVar, boolean z, ffix ffixVar, gmm gmmVar, dwn dwnVar, ffjn ffjnVar, ffjn ffjnVar2, ffmf ffmfVar, hfd hfdVar, int i, int i2) {
        int i3;
        gmm gmmVar2;
        dwn dwnVar2;
        ffjn ffjnVar3;
        ffjn ffjnVar4;
        int i4;
        hfd hfdVar2;
        int i5 = i & 6;
        hfd b2 = hfdVar.b(1191170377);
        if (i5 == 0) {
            i3 = (true != b2.A(f) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b2.F(ffjiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b2.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b2.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b2.F(ffixVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            gmmVar2 = gmmVar;
            i3 |= true != b2.D(gmmVar2) ? 65536 : 131072;
        } else {
            gmmVar2 = gmmVar;
        }
        if ((1572864 & i) == 0) {
            dwnVar2 = dwnVar;
            i3 |= true != b2.D(dwnVar2) ? 524288 : 1048576;
        } else {
            dwnVar2 = dwnVar;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != b2.B(0) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            ffjnVar3 = ffjnVar;
            i3 |= true != b2.F(ffjnVar3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ffjnVar3 = ffjnVar;
        }
        if ((805306368 & i) == 0) {
            ffjnVar4 = ffjnVar2;
            i3 |= true != b2.F(ffjnVar4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjnVar4 = ffjnVar2;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b2.D(ffmfVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            int i6 = i3;
            boolean z2 = ((29360128 & i3) == 8388608) | ((((i4 & 14) ^ 6) > 4 && b2.D(ffmfVar)) || (i4 & 6) == 4);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (z2 || R == hfc.a) {
                R = new gnn(f, ffixVar, ffmfVar);
                hfmVar.ad(R);
            }
            gnn gnnVar = (gnn) R;
            gnnVar.a = ffixVar;
            gnnVar.b = ffjiVar;
            gnnVar.k(f);
            int i7 = i6 >> 9;
            hfdVar2 = b2;
            d(gnnVar, hviVar, z, null, dwnVar2, ffjnVar3, ffjnVar4, hfdVar2, ((i6 >> 3) & 1008) | ((i6 >> 6) & 57344) | (458752 & i7) | (3670016 & i7));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gmx(f, ffjiVar, hviVar, z, ffixVar, gmmVar2, dwnVar, ffjnVar, ffjnVar2, ffmfVar, i, i2);
        }
    }
}
