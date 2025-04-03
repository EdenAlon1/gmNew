package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fci {
    public static final ich a(hxn hxnVar, float f) {
        float ceil = (float) Math.ceil(f);
        ich ichVar = fcn.a;
        ibt ibtVar = fcn.b;
        ifm ifmVar = fcn.c;
        int i = (int) ceil;
        int i2 = i + i;
        if (ichVar == null || ibtVar == null || i2 > ichVar.c() || i2 > ichVar.b()) {
            ichVar = icj.a(i2, i2, 1);
            fcn.a = ichVar;
            ibtVar = iav.b(ichVar);
            fcn.b = ibtVar;
        }
        ich ichVar2 = ichVar;
        ibt ibtVar2 = ibtVar;
        if (ifmVar == null) {
            ifmVar = new ifm();
            fcn.c = ifmVar;
        }
        ifm ifmVar2 = ifmVar;
        kah q = hxnVar.q();
        float c = ichVar2.c();
        float b = ichVar2.b();
        long floatToRawIntBits = Float.floatToRawIntBits(c);
        long floatToRawIntBits2 = Float.floatToRawIntBits(b);
        ifk ifkVar = ifmVar2.a;
        jzn jznVar = ifkVar.a;
        kah kahVar = ifkVar.b;
        ibt ibtVar3 = ifkVar.c;
        long j = ifkVar.d;
        ifkVar.a = hxnVar;
        ifkVar.b = q;
        ifkVar.c = ibtVar2;
        ifkVar.d = (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
        ibtVar2.l();
        ifmVar2.r(ibw.a, 0L, (r20 & 4) != 0 ? ifq.c(ifmVar2.b(), 0L) : ifq.b(ifmVar2), (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
        ifmVar2.r(iby.d(4278190080L), 0L, (r20 & 4) != 0 ? ifq.c(ifmVar2.b(), 0L) : (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
        ifq.e(ifmVar2, iby.d(4278190080L), f, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), null, 0, 120);
        ibtVar2.j();
        ifk ifkVar2 = ifmVar2.a;
        ifkVar2.a = jznVar;
        ifkVar2.b = kahVar;
        ifkVar2.c = ibtVar3;
        ifkVar2.d = j;
        return ichVar2;
    }

    public static final void b(fcu fcuVar, huo huoVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        ffjm ffjmVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(476043083);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(fcuVar) : b.F(fcuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(huoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if (b.J((i2 & 147) != 146, i2 & 1)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && b.D(fcuVar))) | ((i2 & 112) == 32);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (z || R == hfc.a) {
                R = new fco(huoVar, fcuVar);
                hfmVar.ad(R);
            }
            ffjmVar2 = ffjmVar;
            kdy.b((fco) R, null, new kex(false, true, true, false), ffjmVar2, b, ((i2 << 3) & 7168) | 384, 2);
        } else {
            ffjmVar2 = ffjmVar;
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fbx(fcuVar, huoVar, ffjmVar2, i);
        }
    }

    public static final void c(hvi hviVar, ffix ffixVar, boolean z, hfd hfdVar, int i) {
        int i2;
        hvi g;
        int i3 = i & 6;
        hfd b = hfdVar.b(2111672474);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if (b.J((i2 & 147) != 146, i2 & 1)) {
            g = huz.g(ebs.m(hviVar, 25.0f, 25.0f), new fch(ffixVar, z));
            ebv.a(g, b);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fce(hviVar, ffixVar, z, i);
        }
    }

    public static final void d(fcu fcuVar, boolean z, jyi jyiVar, boolean z2, long j, float f, hvi hviVar, hfd hfdVar, int i) {
        int i2;
        long j2;
        long j3;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-466280168);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(fcuVar) : b.F(fcuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(jyiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(hviVar) ? 524288 : 1048576;
        }
        if (b.J((533651 & i2) != 533650, i2 & 1)) {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                j3 = 9205357640488583168L;
            } else {
                b.s();
                j3 = j;
            }
            b.l();
            boolean b2 = fem.b(jyiVar, z2);
            if (!z) {
                b2 = !b2;
            }
            huo huoVar = hui.a;
            huo huoVar2 = b2 ? hui.b : hui.a;
            int i4 = i2 & 14;
            boolean E = b.E(b2) | (i4 == 4 || ((i2 & 8) != 0 && b.F(fcuVar))) | ((i2 & 112) == 32);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (E || R == hfc.a) {
                R = new fcd(fcuVar, z, b2);
                hfmVar.ad(R);
            }
            c = jjs.c(hviVar, false, (ffji) R);
            j2 = j3;
            b(fcuVar, huoVar2, hpx.d(1365123137, new fcb((jgi) b.e(jdr.n), j2, b2, c, fcuVar), b), b, i4 | 384);
        } else {
            b.s();
            j2 = j;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fcc(fcuVar, z, jyiVar, z2, j2, f, hviVar, i);
        }
    }
}
