package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cypm {
    public static final void a(final cyph cyphVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(102138216);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(cyphVar) : b.F(cyphVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            if (cyphVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cypi
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            cypm.a(null, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dwfo.a(null, null, dwfk.b(gft.a(b).D, 0L, b, 14), null, null, hpx.d(789582262, new cypl(cyphVar), b), b, 196608, 27);
            b = b;
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cypj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cypm.a(cyph.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
