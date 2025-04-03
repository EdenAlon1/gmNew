package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dncx {
    public static final void a(final hvi hviVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        ffjmVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(66525670);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(0.62f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.v(834963932);
            int i4 = i2 & 112;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 32 || R == hfc.a) {
                R = new dncw();
                hfmVar.ad(R);
            }
            ipn ipnVar = (ipn) R;
            hfmVar.Z();
            int a = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i5 = ist.a;
            int i6 = (((((i2 << 3) & 112) | ((i2 >> 6) & 14)) << 6) & 896) | 6;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, ipnVar, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf((i6 >> 6) & 14));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i7 = i;
                    dncx.a(hviVar2, ffjmVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
