package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czda {
    public static final void a(final czcw czcwVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1953543464);
        if (i3 == 0) {
            i2 = (true != b.D(czcwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            if (czcwVar == null || czcwVar.a.isEmpty()) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: czcx
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            czda.a(czcw.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dwfo.a(null, null, dwfk.b(gft.a(b).D, 0L, b, 14), null, null, hpx.d(1333674102, new czcz(czcwVar), b), b, 196608, 27);
            b = b;
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: czcy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    czda.a(czcw.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
