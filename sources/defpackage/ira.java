package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ira {
    public static final iqw a = new iqw();

    public static final void a(hvi hviVar, ffjm ffjmVar, hfd hfdVar, int i, int i2) {
        int i3;
        hfd b = hfdVar.b(-1298353104);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if (b.J((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                hviVar = hvi.e;
            }
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new irf(ipw.a);
                hfmVar.ad(R);
            }
            b((irf) R, hviVar, ffjmVar, b, (i3 << 3) & 1008);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new iqx(hviVar, ffjmVar, i, i2);
        }
    }

    public static final void b(irf irfVar, hvi hviVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-511989831);
        if (i3 == 0) {
            i2 = (true != b.F(irfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if (b.J((i2 & 147) != 146, i2 & 1)) {
            int a2 = hey.a(b);
            hfr b2 = hey.b(b);
            hvi b3 = huz.b(b, hviVar);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            ffix ffixVar = iui.b;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, irfVar, irfVar.c);
            hlc.b(b, b2, irfVar.d);
            hlc.b(b, ffjmVar, irfVar.e);
            hlc.b(b, ai, iss.d);
            hlc.b(b, b3, iss.c);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            b.n();
            if (b.I()) {
                b.v(-26185061);
                hfmVar.Z();
            } else {
                b.v(-26243682);
                boolean F = b.F(irfVar);
                Object R = hfmVar.R();
                if (F || R == hfc.a) {
                    R = new iqy(irfVar);
                    hfmVar.ad(R);
                }
                hgs.i((ffix) R, b);
                hfmVar.Z();
            }
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new iqz(irfVar, hviVar, ffjmVar, i);
        }
    }
}
