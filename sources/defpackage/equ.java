package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class equ {
    public static final void a(hvi hviVar, hfd hfdVar, int i, int i2) {
        int i3;
        hvi g;
        hfd b = hfdVar.b(694251107);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if (b.J((i3 & 3) != 2, 1 & i3)) {
            if (i2 != 0) {
                hviVar = hvi.e;
            }
            g = huz.g(ebs.m(hviVar, 20.710678f, 25.0f), eqt.a);
            ebv.a(g, b);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new eqq(hviVar, i, i2);
        }
    }

    public static final void b(fcu fcuVar, hvi hviVar, long j, hfd hfdVar, int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(1776202187);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(fcuVar) : b.F(fcuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (b.J((i2 & 147) != 146, i2 & 1)) {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                j = 9205357640488583168L;
            } else {
                b.s();
            }
            b.l();
            int i4 = i2 & 14;
            if (i4 != 4 && ((i2 & 8) == 0 || !b.F(fcuVar))) {
                z = false;
            }
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (z || R == hfc.a) {
                R = new eqp(fcuVar);
                hfmVar.ad(R);
            }
            c = jjs.c(hviVar, false, (ffji) R);
            int i5 = huo.a;
            fci.b(fcuVar, hum.b, hpx.d(-1653527038, new eqn(j, c), b), b, i4 | 432);
        } else {
            b.s();
        }
        long j2 = j;
        hio L = b.L();
        if (L != null) {
            L.d = new eqo(fcuVar, hviVar, j2, i);
        }
    }
}
