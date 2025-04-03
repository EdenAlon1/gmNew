package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyp {
    public static final void a(final dmyy dmyyVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        dmyyVar.getClass();
        hfd b = hfdVar.b(-1919041619);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmyyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hvi.e;
            int i3 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar2);
            int i4 = ist.a;
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
            dyi dyiVar = dyi.a;
            gpa.e(dmyyVar.c, null, false, gft.c(b).a, ibw.g, 0L, 0.0f, null, null, hpx.d(898431806, new dmyo(dmyyVar), b), b, 998);
            dlsf dlsfVar = dmyyVar.d;
            b.v(1222142825);
            if (dlsfVar != null) {
                dmhc.a(dyiVar, new dmhd(dlsfVar), null, null, b, 6, 6);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmyn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmyy dmyyVar2 = dmyy.this;
                    int i5 = i;
                    dmyp.a(dmyyVar2, hviVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
