package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flk {
    public static final float a(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [cyq, java.lang.Object] */
    public static final void b(czq czqVar, hho hhoVar, dji djiVar, hvi hviVar, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(435109845);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(czqVar) : b.F(czqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hhoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(djiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjnVar) ? 8192 : 16384;
        }
        if (b.J((i2 & 9363) != 9362, i2 & 1)) {
            dbe b2 = dbs.b(czqVar, "DropDownMenu", b, (i2 & 14) | 48, 0);
            flg flgVar = flg.a;
            dbv dbvVar = dcp.a;
            boolean booleanValue = ((Boolean) b2.e()).booleanValue();
            b.v(1652594929);
            float f = true != booleanValue ? 0.8f : 1.0f;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            Float valueOf = Float.valueOf(f);
            boolean booleanValue2 = ((Boolean) b2.f()).booleanValue();
            b.v(1652594929);
            float f2 = true == booleanValue2 ? 1.0f : 0.8f;
            hfmVar.Z();
            hkx f3 = dbs.f(b2, valueOf, Float.valueOf(f2), flgVar.a(b2.d(), b, 0), dbvVar, b, 0);
            flf flfVar = flf.a;
            dbv dbvVar2 = dcp.a;
            boolean booleanValue3 = ((Boolean) b2.e()).booleanValue();
            b.v(388050693);
            float f4 = true != booleanValue3 ? 0.0f : 1.0f;
            hfmVar.Z();
            Float valueOf2 = Float.valueOf(f4);
            int i4 = i2;
            boolean booleanValue4 = ((Boolean) b2.f()).booleanValue();
            b.v(388050693);
            float f5 = true != booleanValue4 ? 0.0f : 1.0f;
            hfmVar.Z();
            boolean z = true;
            hkx f6 = dbs.f(b2, valueOf2, Float.valueOf(f5), flfVar.a(b2.d(), b, 0), dbvVar2, b, 0);
            hve hveVar = hvi.e;
            boolean D = b.D(f3) | b.D(f6);
            if ((i4 & 112) != 32) {
                z = false;
            }
            Object R = hfmVar.R();
            if ((D | z) || R == hfc.a) {
                R = new flc(hhoVar, f3, f6);
                hfmVar.ad(R);
            }
            fim.a(icf.a(hveVar, (ffji) R), 0L, 8.0f, hpx.d(895555282, new fld(hviVar, djiVar, ffjnVar), b), b, 1769472, 30);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fle(czqVar, hhoVar, djiVar, hviVar, ffjnVar, i);
        }
    }

    public static final void c(ffix ffixVar, hvi hviVar, ebe ebeVar, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2;
        hvi d;
        hfd b = hfdVar.b(87134531);
        if ((i & 6) == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(ebeVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjnVar) ? 65536 : 131072;
        }
        if (b.J((74899 & i2) != 74898, i2 & 1)) {
            d = ebs.d(dfb.c(hviVar, null, fmn.a(true, 0.0f, 6), true, null, null, ffixVar, 24), 1.0f);
            hvi c = eba.c(ebs.w(d, 112.0f, 48.0f, 280.0f, 0.0f, 8), ebeVar);
            int i3 = huo.a;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
            int i4 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            fqi.a(fla.c(b).a, hpx.d(1190489496, new fli(ffjnVar, ebr.a), b), b, 48);
            b.n();
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new flj(ffixVar, hviVar, ebeVar, ffjnVar, i);
        }
    }
}
