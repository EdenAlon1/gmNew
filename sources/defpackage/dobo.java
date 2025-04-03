package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobo {
    public static final void a(final dobs dobsVar, final hvi hviVar, hfd hfdVar, final int i) {
        hvi c;
        hvi a;
        hvi b;
        long f;
        hvi a2;
        hfd b2 = hfdVar.b(-376240132);
        if (((((i & 6) == 0 ? (true != b2.D(dobsVar) ? 2 : 4) | i : i) | 48) & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            hviVar = hvi.e;
            dji a3 = dix.a(0, b2, 0, 1);
            dobr dobrVar = dobsVar.b;
            c = dix.c(hviVar, a3, false, true, false);
            hvi a4 = eao.a(c, 1);
            boolean z = dobsVar.c;
            b2.v(509840176);
            if (z) {
                hve hveVar = hvi.e;
                f = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.3f, ibw.f(gft.a(b2).a));
                a2 = dee.a(hveVar, f, idb.a);
                a4 = a4.a(a2);
            }
            hfm hfmVar = (hfm) b2;
            hfmVar.Z();
            String str = dobsVar.f;
            b2.v(-1816743994);
            a = dlsj.a(hvi.e, str, true);
            hvi a5 = a4.a(a);
            hfmVar.Z();
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            int i2 = huo.a;
            ipn a6 = ebm.a(dxnVar, hum.m, b2, 6);
            int a7 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, a5);
            int i3 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a6, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf = Integer.valueOf(a7);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            b2.v(530774122);
            for (dody dodyVar : dobsVar.a) {
                b = ebs.b(ebs.f(ebs.o(hvi.e, dobrVar.a), 112.0f, dobrVar.b), 1.0f);
                docn.k(dodyVar, b, b2, 0);
            }
            hfmVar.Z();
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dobn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dobs dobsVar2 = dobs.this;
                    int i4 = i;
                    dobo.a(dobsVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
