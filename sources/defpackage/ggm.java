package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggm {
    public static final float a(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    public static final void b(ffjm ffjmVar, ffix ffixVar, hvi hviVar, ffjm ffjmVar2, boolean z, ggc ggcVar, ebe ebeVar, hfd hfdVar, int i) {
        ffjm ffjmVar3;
        int i2;
        ffix ffixVar2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1564716777);
        if (i3 == 0) {
            ffjmVar3 = ffjmVar;
            i2 = (true != b.F(ffjmVar3) ? 2 : 4) | i;
        } else {
            ffjmVar3 = ffjmVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 16 : 32;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(ggcVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(ebeVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.D(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i2 & 38347923) == 38347922 && b.I()) {
            b.s();
        } else {
            d = ebs.d(dfb.c(hviVar, null, gkw.a(true, 0.0f, 0L, 6), z, null, null, ffixVar2, 24), 1.0f);
            hvi c = eba.c(ebs.w(d, 112.0f, 48.0f, 280.0f, 0.0f, 8), ebeVar);
            int i4 = huo.a;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
            int i5 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar4);
            }
            hlc.b(b, b2, iss.c);
            grl.a(gft.d(b).m, hpx.d(1065051884, new ggk(ffjmVar2, ggcVar, z, ebr.a, ffjmVar3), b), b, 48);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ggl(ffjmVar, ffixVar, hviVar, ffjmVar2, z, ggcVar, ebeVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [cyq, java.lang.Object] */
    public static final void c(hvi hviVar, czq czqVar, hho hhoVar, dji djiVar, idh idhVar, long j, float f, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-151448888);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(czqVar) : b.F(czqVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hhoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(djiVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(idhVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.C(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.A(0.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.D(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != b.F(ffjnVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i2) == 306783378 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            dbe c = dbs.c(czqVar, "DropDownMenu", b, ((i2 >> 3) & 14) | 48, 0);
            cyq a = gjb.a(2, b);
            cyq a2 = gjb.a(5, b);
            ggh gghVar = new ggh(a);
            dbv dbvVar = dcp.a;
            boolean booleanValue = ((Boolean) c.e()).booleanValue();
            b.v(2139028452);
            float f2 = true != booleanValue ? 0.8f : 1.0f;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            Float valueOf = Float.valueOf(f2);
            boolean booleanValue2 = ((Boolean) c.f()).booleanValue();
            b.v(2139028452);
            float f3 = true == booleanValue2 ? 1.0f : 0.8f;
            hfmVar.Z();
            hkx f4 = dbs.f(c, valueOf, Float.valueOf(f3), gghVar.a(c.d(), b, 0), dbvVar, b, 0);
            ggg gggVar = new ggg(a2);
            dbv dbvVar2 = dcp.a;
            boolean booleanValue3 = ((Boolean) c.e()).booleanValue();
            b.v(-249413128);
            float f5 = true != booleanValue3 ? 0.0f : 1.0f;
            hfmVar.Z();
            Float valueOf2 = Float.valueOf(f5);
            boolean booleanValue4 = ((Boolean) c.f()).booleanValue();
            b.v(-249413128);
            float f6 = true != booleanValue4 ? 0.0f : 1.0f;
            hfmVar.Z();
            boolean z = true;
            hkx f7 = dbs.f(c, valueOf2, Float.valueOf(f6), gggVar.a(c.d(), b, 0), dbvVar2, b, 0);
            boolean booleanValue5 = ((Boolean) b.e(jet.a)).booleanValue();
            hve hveVar = hvi.e;
            boolean E = b.E(booleanValue5) | b.D(f4) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && b.F(czqVar))) | b.D(f7);
            if ((i2 & 896) != 256) {
                z = false;
            }
            Object R = hfmVar.R();
            if ((z | E) || R == hfc.a) {
                ggd ggdVar = new ggd(booleanValue5, czqVar, hhoVar, f4, f7);
                hfmVar.ad(ggdVar);
                R = ggdVar;
            }
            gpa.c(icf.a(hveVar, (ffji) R), idhVar, j, 0L, 0.0f, f, null, hpx.d(1573559053, new gge(hviVar, djiVar, ffjnVar), b), b, 8);
            hfdVar2 = b;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ggf(hviVar, czqVar, hhoVar, djiVar, idhVar, j, f, ffjnVar, i);
        }
    }
}
