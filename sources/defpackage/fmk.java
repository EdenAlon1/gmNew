package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmk {
    public static final cyh a = new cyh(0.2f, 0.0f, 0.8f, 1.0f);
    public static final cyh b = new cyh(0.4f, 0.0f, 1.0f, 1.0f);
    public static final cyh c = new cyh(0.0f, 0.0f, 0.65f, 1.0f);
    public static final cyh d = new cyh(0.1f, 0.0f, 0.45f, 1.0f);

    static {
        new cyh(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final float a(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    public static final float b(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    public static final float c(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    public static final float d(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    public static final void e(hvi hviVar, long j, long j2, hfd hfdVar, int i) {
        int i2;
        long j3;
        long j4;
        long f;
        long j5;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(1501635280);
        if (i3 == 0) {
            i2 = (true != b2.D(hviVar) ? 2 : 4) | i;
        } else {
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
        if (b2.J((i2 & 1171) != 1170, i2 & 1)) {
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                long h = fla.a(b2).h();
                f = iby.f(ibw.d(h), ibw.c(h), ibw.b(h), 0.24f, ibw.f(h));
                j3 = h;
                j5 = f;
            } else {
                b2.s();
                j3 = j;
                j5 = j2;
            }
            b2.l();
            czg b3 = czk.b(b2);
            hkx a2 = czk.a(b3, 0.0f, 1.0f, cxu.d(cxu.a(fmd.a), 0, 0L, 6), b2);
            hkx a3 = czk.a(b3, 0.0f, 1.0f, cxu.d(cxu.a(fme.a), 0, 0L, 6), b2);
            hkx a4 = czk.a(b3, 0.0f, 1.0f, cxu.d(cxu.a(fmf.a), 0, 0L, 6), b2);
            hkx a5 = czk.a(b3, 0.0f, 1.0f, cxu.d(cxu.a(fmg.a), 0, 0L, 6), b2);
            hvi m = ebs.m(div.a(eba.i(jjs.c(iop.a(hviVar, new fmi()), true, fmj.a), 0.0f, 10.0f, 1)), 240.0f, 4.0f);
            boolean C = b2.C(j5) | b2.B(0) | b2.D(a2) | b2.D(a3) | b2.C(j3) | b2.D(a4) | b2.D(a5);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (C || R == hfc.a) {
                R = new fmb(j5, j3, a2, a3, a4, a5);
                hfmVar.ad(R);
            }
            deu.a(m, (ffji) R, b2, 0);
            j4 = j5;
        } else {
            b2.s();
            j3 = j;
            j4 = j2;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fmc(hviVar, j3, j4, i);
        }
    }

    public static final void f(ifr ifrVar, float f, float f2, long j, float f3) {
        float c2 = iar.c(ifrVar.b());
        float a2 = iar.a(ifrVar.b());
        float f4 = a2 / 2.0f;
        boolean z = ifrVar.q() == kah.a;
        float f5 = (z ? f : 1.0f - f2) * c2;
        float f6 = (z ? f2 : 1.0f - f) * c2;
        if (idm.a(0, 0) || a2 > c2) {
            ifq.m(ifrVar, j, ial.a(f5, f4), ial.a(f6, f4), f3, 0, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        ffmf ffmfVar = new ffmf(f7, c2 - f7);
        float floatValue = ((Number) ffmk.s(Float.valueOf(f5), ffmfVar)).floatValue();
        float floatValue2 = ((Number) ffmk.s(Float.valueOf(f6), ffmfVar)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            ifq.m(ifrVar, j, ial.a(floatValue, f4), ial.a(floatValue2, f4), f3, 0, 480);
        }
    }
}
