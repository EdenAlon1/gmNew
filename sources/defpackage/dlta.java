package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlta {
    public static final void a(final hvi hviVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(2143130376);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            gpa.c(eba.j(d, 0.0f, 0.0f, 0.0f, 10.0f, 7), gft.c(b).c, gft.a(b).F, 0L, 0.0f, 0.0f, null, ffjmVar, b, 120);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlst
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dlta.a(hviVar2, ffjmVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final ffjm ffjmVar, final ffjm ffjmVar2, final ffjm ffjmVar3, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(1105820876);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar3) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            d = ebs.d(eba.e(hvi.e, 32.0f, 24.0f), 1.0f);
            int i4 = huo.a;
            ipn a = dyo.a(dxu.c, hum.k, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar4);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf(i2 & 14));
            ebv.a(ebs.e(hvi.e, 24.0f), b);
            ffjmVar2.a(b, Integer.valueOf((i2 >> 3) & 14));
            ebv.a(ebs.e(hvi.e, 36.0f), b);
            ffjmVar3.a(b, Integer.valueOf((i2 >> 6) & 14));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlsv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffjm ffjmVar5 = ffjm.this;
                    ffjm ffjmVar6 = ffjmVar2;
                    int i6 = i;
                    dlta.b(ffjmVar5, ffjmVar6, ffjmVar3, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dltb dltbVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(1763678507);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dltbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            a(hviVar, hpx.d(-1194708323, new dlsz(), b), b, ((i3 >> 3) & 14) | 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlsu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dltb dltbVar2 = dltb.this;
                    int i4 = i;
                    dlta.c(dltbVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
