package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iol {
    public static final ffjm a(List list) {
        return new hpw(-1953651383, true, new iok(list));
    }

    @ffbs
    public static final void b(hvi hviVar, ffjm ffjmVar, ipn ipnVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1949933075);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(ipnVar) ? 128 : 256;
        }
        if (b.J((i2 & 147) != 146, i2 & 1)) {
            int a = hey.a(b);
            hvi b2 = huz.b(b, hviVar);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            int i4 = ((i2 << 3) & 896) | 6;
            ffix ffixVar = iui.b;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, ipnVar, iss.e);
            hlc.b(b, ai, iss.d);
            hlc.a(b, ioi.a);
            hlc.b(b, b2, iss.c);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            ffjmVar.a(b, Integer.valueOf((i4 >> 6) & 14));
            b.n();
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ioj(hviVar, ffjmVar, ipnVar, i);
        }
    }
}
