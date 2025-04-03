package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doiu {
    public static final void a(final dokm dokmVar, hfd hfdVar, final int i) {
        int i2;
        dokmVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1792095837);
        if (i3 == 0) {
            i2 = (true != b.D(dokmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else if (dokmVar instanceof dokx) {
            b.v(-1090053753);
            dojg.e((dokx) dokmVar, null, b, 0, 2);
            ((hfm) b).Z();
        } else {
            if (!(dokmVar instanceof doip)) {
                b.v(-1090055146);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(-1090052050);
            doim.a((doip) dokmVar, null, b, 0, 2);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doiq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    doiu.a(dokm.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dojh dojhVar, final hvi hviVar, hfd hfdVar, final int i) {
        hvi c;
        hfd b = hfdVar.b(-1069537837);
        int i2 = (i & 6) == 0 ? (true != b.D(dojhVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(true) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            boolean z = false;
            c = dix.c(hviVar, dix.a(0, b, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            hvi i3 = eba.i(c, 0.0f, 12.0f, 1);
            dxn dxnVar = new dxn(0.0f, true, dxr.a);
            int i4 = huo.a;
            ipn a = dyo.a(dxnVar, hum.l, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i3);
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
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dys dysVar = dys.a;
            b.v(319193846);
            int i6 = 0;
            for (Object obj : dojhVar.a) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    ffdx.l();
                }
                dokm dokmVar = (dokm) obj;
                b.v(1864728511);
                b.v(-1602414710);
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new czq(Boolean.valueOf(z));
                    hfmVar.ad(R);
                }
                czq czqVar = (czq) R;
                hfmVar.Z();
                czqVar.d(true);
                int i8 = i7 * 100;
                hfm hfmVar2 = hfmVar;
                cru.j(dysVar, czqVar, null, ctt.e(cxu.c(500, i8, null, 4), new ffji() { // from class: doir
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(((Integer) obj2).intValue() / 2);
                    }
                }).a(ctt.l(cxu.c(500, i8, null, 4), 2)), null, null, hpx.d(1306208913, new doit(dokmVar), b), b, 1572870);
                hfmVar2.Z();
                hfmVar = hfmVar2;
                i6 = i7;
                z = false;
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dois
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dojh dojhVar2 = dojh.this;
                    int i9 = i;
                    doiu.b(dojhVar2, hviVar, (hfd) obj2, hip.a(i9 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
