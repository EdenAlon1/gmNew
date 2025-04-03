package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmnn {
    public static final void a(final dmmm dmmmVar, final float f, hfd hfdVar, final int i) {
        int i2;
        long j;
        hvi d;
        hvi a;
        dmmmVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-2138478046);
        if (i3 == 0) {
            i2 = (true != b.D(dmmmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(f) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            if (dooy.a(b).m) {
                b.v(-94821790);
                j = dmmi.m(dmpg.a, f, b);
                ((hfm) b).Z();
            } else {
                b.v(-94628009);
                j = gft.a(b).G;
                ((hfm) b).Z();
            }
            d = ebs.d(dee.a(eba.f(dee.a(hveVar, j, eqm.d(24.0f, 24.0f, 0.0f, 0.0f, 12)), 8.0f, 8.0f, 8.0f, 0.0f), gft.a(b).n, eqm.c(16.0f, 16.0f, 8.0f, 8.0f)), 1.0f);
            hvi a2 = jfw.a(d, "Compose:Draft:Header:ReplySnippet");
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ipn a3 = ebm.a(dxiVar, hum.m, b, 0);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a2);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            a = ebr.a.a(eba.j(hvi.e, 12.0f, 12.0f, 0.0f, 12.0f, 4), 1.0f, true);
            hvi b3 = dlsj.b(a);
            ipn a5 = ebm.a(dxu.a, hum.m, b, 0);
            int a6 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b, b3);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b4, iss.c);
            doft.a(dmmmVar.a, false, b, 0, 2);
            b.n();
            b(dmmmVar.b, b, 0);
            b.n();
            b.v(-557213766);
            int i6 = i2 & 14;
            Object R = hfmVar.R();
            if (i6 == 4 || R == hfc.a) {
                R = new dmnm(dmmmVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(dmmmVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmnk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmmm dmmmVar2 = dmmm.this;
                    int i7 = i;
                    dmnn.a(dmmmVar2, f, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1182849633);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, null, false, null, null, dmkk.a, b, (i2 & 14) | 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmnl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmnn.b(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
