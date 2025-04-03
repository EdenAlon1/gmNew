package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdo {
    public static final void a(hvi hviVar, float f, long j, hfd hfdVar, int i, int i2) {
        int i3;
        hvi d;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(75144485);
        boolean z = true;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.C(j) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                if (i4 != 0) {
                    hviVar = hvi.e;
                }
                if (i5 != 0) {
                    f = 1.0f;
                }
            } else {
                b.s();
            }
            b.l();
            d = ebs.d(hviVar, 1.0f);
            hvi e = ebs.e(d, f);
            boolean z2 = (i3 & 112) == 32;
            if ((((i3 & 896) ^ 384) <= 256 || !b.C(j)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z3 = z | z2;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (z3 || R == hfc.a) {
                R = new gdk(f, j);
                hfmVar.ad(R);
            }
            deu.a(e, (ffji) R, b, 0);
        }
        float f2 = f;
        hio L = b.L();
        if (L != null) {
            L.d = new gdl(hviVar, f2, j, i, i2);
        }
    }

    public static final void b(hvi hviVar, long j, hfd hfdVar, int i) {
        int i2;
        hvi b;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1534852205);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != b2.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.A(1.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.C(j) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            b = ebs.b(hviVar, 1.0f);
            hvi o = ebs.o(b, 1.0f);
            boolean z2 = (i2 & 112) == 32;
            if ((((i2 & 896) ^ 384) <= 256 || !b2.C(j)) && (i2 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (z3 || R == hfc.a) {
                R = new gdm(j);
                hfmVar.ad(R);
            }
            deu.a(o, (ffji) R, b2, 0);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gdn(hviVar, j, i);
        }
    }
}
