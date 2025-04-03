package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjp {
    public static final void a(hvi hviVar, long j, float f, hfd hfdVar, int i, int i2) {
        int i3;
        long j2;
        float f2;
        long f3;
        float f4;
        float f5;
        hvi d;
        hvi a;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-1249392198);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (true != b.D(hviVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        int i5 = i3 | 3456;
        if (b.J((i5 & 1171) != 1170, 1 & i5)) {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                if (i4 != 0) {
                    hviVar = hvi.e;
                }
                f3 = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.12f, ibw.f(fla.a(b).g()));
                f4 = 1.0f;
            } else {
                b.s();
                f3 = j;
                f4 = f;
            }
            b.l();
            hve hveVar = hvi.e;
            if (jzq.b(f4, 0.0f)) {
                b.v(-129273423);
                f5 = 1.0f / ((jzn) b.e(jdr.e)).ec();
                ((hfm) b).Z();
            } else {
                b.v(-129206866);
                ((hfm) b).Z();
                f5 = f4;
            }
            d = ebs.d(hviVar.a(hveVar), 1.0f);
            a = dee.a(ebs.e(d, f5), f3, idb.a);
            dyc.b(a, b, 0);
            f2 = f4;
            j2 = f3;
        } else {
            b.s();
            j2 = j;
            f2 = f;
        }
        hvi hviVar2 = hviVar;
        hio L = b.L();
        if (L != null) {
            L.d = new fjo(hviVar2, j2, f2, i, i2);
        }
    }
}
