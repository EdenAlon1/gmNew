package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkv {
    public static final /* synthetic */ int a = 0;
    private static final hvi b = ebs.k(hvi.e, 24.0f);

    public static final void a(igq igqVar, hvi hviVar, long j, hfd hfdVar, int i) {
        int i2;
        hvi c;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1142959010);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != b2.F(igqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D("account") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.C(j) ? 1024 : 2048;
        }
        if (b2.J((i2 & 1171) != 1170, i2 & 1)) {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            if ((((i2 & 7168) ^ 3072) <= 2048 || !b2.C(j)) && (i2 & 3072) != 2048) {
                z = false;
            }
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (z || R == hfc.a) {
                R = ffcp.a(j, ibw.h) ? null : new ibl(j, 5);
                hfmVar.ad(R);
            }
            ibx ibxVar = (ibx) R;
            b2.v(980491077);
            int i4 = i2 & 112;
            hve hveVar = hvi.e;
            Object R2 = hfmVar.R();
            if (i4 == 32 || R2 == hfc.a) {
                R2 = new fku();
                hfmVar.ad(R2);
            }
            c = jjs.c(hveVar, false, (ffji) R2);
            hfmVar.Z();
            if (!iar.f(igqVar.a(), 9205357640488583168L)) {
                long a2 = igqVar.a();
                if (!Float.isInfinite(iar.c(a2)) || !Float.isInfinite(iar.a(a2))) {
                    hviVar2 = hvi.e;
                    hvi a3 = hviVar.a(hviVar2);
                    int i5 = inp.a;
                    dyc.b(hxw.a(a3, igqVar, null, ino.b, 0.0f, ibxVar, 22).a(c), b2, 0);
                }
            }
            hviVar2 = b;
            hvi a32 = hviVar.a(hviVar2);
            int i52 = inp.a;
            dyc.b(hxw.a(a32, igqVar, null, ino.b, 0.0f, ibxVar, 22).a(c), b2, 0);
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fkt(igqVar, hviVar, j, i);
        }
    }
}
