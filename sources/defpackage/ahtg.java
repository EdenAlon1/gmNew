package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahtg {
    public static final void a(final ffxx ffxxVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hfd b = hfdVar.b(298374602);
        if ((i & 6) == 0) {
            i2 = (true != b.F(ffxxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hio L = b.L();
            if (L != null) {
                L.d = new ffjm() { // from class: ahtf
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int i3 = i;
                        ahtg.a(ffxx.this, (hfd) obj, hip.a(i3 | 1));
                        return ffcu.a;
                    }
                };
                return;
            }
            return;
        }
        hkx b2 = hkt.b(ffxxVar, null, null, b, 2);
        if (b(b2) == null) {
            hio L2 = b.L();
            if (L2 != null) {
                L2.d = new ffjm() { // from class: ahtd
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int i3 = i;
                        ahtg.a(ffxx.this, (hfd) obj, hip.a(i3 | 1));
                        return ffcu.a;
                    }
                };
                return;
            }
            return;
        }
        b(b2).getClass();
        rvd.a(b);
        c = ebs.c(hvi.e, 1.0f);
        dee.a(c, ibw.g, idb.a);
        b.v(1191173066);
        hfm hfmVar = (hfm) b;
        if (hfmVar.R() != hfc.a) {
            throw null;
        }
        hfmVar.ad(new ffji() { // from class: ahte
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                jkv jkvVar = (jkv) obj;
                jkvVar.getClass();
                jks.a(jkvVar);
                return ffcu.a;
            }
        });
        throw null;
    }

    private static final ahtc b(hkx hkxVar) {
        return (ahtc) hkxVar.a();
    }
}
