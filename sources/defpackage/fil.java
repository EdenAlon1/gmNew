package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fil {
    private static final kex a = new kex(true, false, 14);

    public static final void a(boolean z, ffix ffixVar, hvi hviVar, long j, dji djiVar, kex kexVar, ffjn ffjnVar, hfd hfdVar, int i) {
        boolean z2;
        int i2;
        ffix ffixVar2;
        ffjn ffjnVar2;
        long j2;
        kex kexVar2;
        hfd hfdVar2;
        dji djiVar2;
        long a2;
        dji a3;
        int i3;
        kex kexVar3;
        long j3;
        int i4 = i & 6;
        hfd b = hfdVar.b(-2135362555);
        if (i4 == 0) {
            z2 = z;
            i2 = (true != b.E(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
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
        int i5 = i2 | 3072;
        if ((i & 24576) == 0) {
            i5 = i2 | 11264;
        }
        int i6 = 196608 | i5;
        if ((1572864 & i) == 0) {
            ffjnVar2 = ffjnVar;
            i6 |= true != b.F(ffjnVar2) ? 524288 : 1048576;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if (b.J((599187 & i6) != 599186, i6 & 1)) {
            int i7 = i6 >> 9;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                a2 = jzr.a(0.0f, 0.0f);
                a3 = dix.a(0, b, 0, 1);
                i3 = i6;
                kexVar3 = a;
            } else {
                b.s();
                a2 = j;
                a3 = djiVar;
                i3 = i6;
                kexVar3 = kexVar;
            }
            b.l();
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new czq(false);
                hfmVar.ad(R);
            }
            czq czqVar = (czq) R;
            czqVar.d(Boolean.valueOf(z2));
            if (((Boolean) czqVar.a()).booleanValue() || ((Boolean) czqVar.b()).booleanValue()) {
                b.v(1377962068);
                Object R2 = hfmVar.R();
                int i8 = i3;
                if (R2 == hfc.a) {
                    hic hicVar = new hic(new idr(idr.a), hla.a);
                    hfmVar.ad(hicVar);
                    R2 = hicVar;
                }
                hho hhoVar = (hho) R2;
                jzn jznVar = (jzn) b.e(jdr.e);
                Object R3 = hfmVar.R();
                if (R3 == hfc.a) {
                    R3 = new fij(hhoVar);
                    hfmVar.ad(R3);
                }
                fjz fjzVar = new fjz(a2, jznVar, (ffjm) R3);
                j3 = a2;
                kdy.b(fjzVar, ffixVar2, kexVar3, hpx.d(-47803778, new fih(czqVar, hhoVar, a3, hviVar, ffjnVar2), b), b, (i7 & 896) | (i8 & 112) | 3072, 0);
                hfmVar.Z();
            } else {
                b.v(1378753932);
                hfmVar.Z();
                j3 = a2;
            }
            kexVar2 = kexVar3;
            j2 = j3;
            hfdVar2 = b;
            djiVar2 = a3;
        } else {
            b.s();
            j2 = j;
            kexVar2 = kexVar;
            hfdVar2 = b;
            djiVar2 = djiVar;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fii(z, ffixVar, hviVar, j2, djiVar2, kexVar2, ffjnVar, i);
        }
    }

    public static final void b(ffix ffixVar, hvi hviVar, boolean z, ebe ebeVar, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2;
        ffjn ffjnVar2;
        hvi hviVar2;
        boolean z2;
        ebe ebeVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1988562892);
        if (i3 == 0) {
            i2 = i | (true != b.F(ffixVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i4 = i2 | 28080;
        if ((i & 196608) == 0) {
            ffjnVar2 = ffjnVar;
            i4 |= true != b.F(ffjnVar2) ? 65536 : 131072;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if (b.J((74899 & i4) != 74898, i4 & 1)) {
            hve hveVar = hvi.e;
            ebe ebeVar3 = flb.a;
            ebe ebeVar4 = flb.a;
            flk.c(ffixVar, hveVar, ebeVar4, ffjnVar2, b, i4 & 524286);
            z2 = true;
            hviVar2 = hveVar;
            ebeVar2 = ebeVar4;
        } else {
            b.s();
            hviVar2 = hviVar;
            z2 = z;
            ebeVar2 = ebeVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fik(ffixVar, hviVar2, z2, ebeVar2, ffjnVar, i);
        }
    }
}
