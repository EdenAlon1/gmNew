package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foh {
    public static final void a(ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(917397959);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (b.J((i2 & 3) != 2, i2 & 1)) {
            fof fofVar = fof.a;
            hve hveVar = hvi.e;
            int a = hey.a(b);
            hfm hfmVar = (hfm) b;
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
            hlc.b(b, fofVar, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            hvi e = eba.e(hvi.e, 16.0f, 6.0f);
            int i5 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, e);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf2 = Integer.valueOf(a3);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar3);
            }
            hlc.b(b, b3, iss.c);
            ffjmVar.a(b, Integer.valueOf(i2 & 14));
            b.n();
            b.n();
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fog(ffjmVar, i);
        }
    }

    public static final void b(fnv fnvVar, hvi hviVar, idh idhVar, long j, long j2, long j3, float f, hfd hfdVar, int i) {
        int i2;
        fnv fnvVar2;
        hfd hfdVar2;
        hvi hviVar2;
        idh idhVar2;
        long j4;
        long j5;
        long j6;
        float f2;
        hvi hviVar3;
        idh idhVar3;
        long f3;
        long h;
        long l;
        int i3;
        long i4;
        float f4;
        long f5;
        int i5 = i & 6;
        hfd b = hfdVar.b(258660814);
        if (i5 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(fnvVar) : b.F(fnvVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 432;
        if ((i & 3072) == 0) {
            i6 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i6 |= 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        int i7 = i6 | 12582912;
        if (b.J((4793491 & i7) != 4793490, i7 & 1)) {
            int i8 = (-4193281) & i7;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hviVar3 = hvi.e;
                idhVar3 = fla.b(b).a;
                f3 = iby.f(ibw.d(r7), ibw.c(r7), ibw.b(r7), 0.8f, ibw.f(fla.a(b).g()));
                h = iby.h(f3, fla.a(b).l());
                l = fla.a(b).l();
                fin a = fla.a(b);
                if (a.m()) {
                    long h2 = a.h();
                    i3 = 12582912;
                    f5 = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.6f, ibw.f(a.l()));
                    i4 = iby.h(f5, h2);
                } else {
                    i3 = 12582912;
                    i4 = a.i();
                }
                f4 = 6.0f;
            } else {
                b.s();
                hviVar3 = hviVar;
                idhVar3 = idhVar;
                h = j;
                l = j2;
                f4 = f;
                i3 = 12582912;
                i4 = j3;
            }
            b.l();
            b.v(1609519419);
            ((hfm) b).Z();
            fnvVar2 = fnvVar;
            long j7 = i4;
            c(eba.d(hviVar3, 12.0f), idhVar3, h, l, f4, hpx.d(-261845785, new foc(fnvVar2), b), b, (i7 & 896) | i3 | ((i8 >> 3) & 3670016));
            hfdVar2 = b;
            hviVar2 = hviVar3;
            idhVar2 = idhVar3;
            j4 = h;
            j5 = l;
            f2 = f4;
            j6 = j7;
        } else {
            fnvVar2 = fnvVar;
            hfdVar2 = b;
            hfdVar2.s();
            hviVar2 = hviVar;
            idhVar2 = idhVar;
            j4 = j;
            j5 = j2;
            j6 = j3;
            f2 = f;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fod(fnvVar2, hviVar2, idhVar2, j4, j5, j6, f2, i);
        }
    }

    public static final void c(hvi hviVar, idh idhVar, long j, long j2, float f, ffjm ffjmVar, hfd hfdVar, int i) {
        hvi hviVar2;
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-558258760);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(false) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(idhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.C(j2) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != b.A(f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.F(ffjmVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if (b.J((4793491 & i2) != 4793490, i2 & 1)) {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            int i4 = i2 >> 6;
            hfdVar2 = b;
            C0001for.a(hviVar2, idhVar, j, j2, f, hpx.d(-2084221700, new foa(ffjmVar), b), hfdVar2, (i2 & 14) | 1572864 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | ((i2 >> 3) & 458752), 16);
        } else {
            hfdVar2 = b;
            hfdVar2.s();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fob(hviVar, idhVar, j, j2, f, ffjmVar, i);
        }
    }
}
