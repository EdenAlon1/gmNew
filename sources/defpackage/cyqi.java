package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqi {
    public static final void a(final cyqe cyqeVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(624206876);
        if (i3 == 0) {
            i2 = (true != b.D(cyqeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            if (cyqeVar == null || cyqeVar.a.isEmpty()) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cyqf
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            cyqi.a(cyqe.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dwfo.a(null, null, dwfk.b(gft.a(b).D, 0L, b, 14), null, null, hpx.d(-1215041394, new cyqh(cyqeVar), b), b, 196608, 27);
            b = b;
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cyqg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cyqi.a(cyqe.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
