package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojr {
    public static final void a(final dojh dojhVar, hvi hviVar, dji djiVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        final hvi hviVar2;
        final dji djiVar2;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(800002215);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dojhVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0 && b.D(djiVar)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            djiVar2 = djiVar;
        } else {
            int i7 = i2 & 4;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                if (i5 != 0) {
                    hviVar = hvi.e;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    djiVar = dix.a(0, b, 0, 1);
                }
            } else {
                b.s();
                if (i7 != 0) {
                    i3 &= -897;
                }
            }
            final hvi hviVar3 = hviVar;
            final dji djiVar3 = djiVar;
            b.l();
            b.v(-574839679);
            if ((dojhVar != null ? dojhVar.b : null) == null) {
                b(dojhVar, hviVar3, djiVar3, b, i3 & 1022);
                ((hfm) b).Z();
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dojj
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dojh dojhVar2 = dojh.this;
                            hvi hviVar4 = hviVar3;
                            dojr.a(dojhVar2, hviVar4, djiVar3, (hfd) obj, hip.a(i | 1), i2);
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            ((hfm) b).Z();
            dlth.a(dojhVar.a, dojhVar.b, ctt.k(cxu.c(350, 0, new cyh(0.2f, 0.0f, 0.0f, 1.0f), 2), null, 10), ctt.q(new dbu(250, 150, new cyh(0.2f, 0.0f, 0.0f, 1.0f)), null, 10), null, hpx.d(1796479362, new dojq(hviVar3, djiVar3, dojhVar), b), b, 196992, 16);
            hviVar2 = hviVar3;
            djiVar2 = djiVar3;
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dojk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dojh dojhVar2 = dojh.this;
                    hvi hviVar4 = hviVar2;
                    dojr.a(dojhVar2, hviVar4, djiVar2, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dojh dojhVar, final hvi hviVar, final dji djiVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2136604572);
        if (i3 == 0) {
            i2 = (true != b.D(dojhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(djiVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            dlth.a(dojhVar != null ? dojhVar.a : null, dojhVar != null ? dojhVar.b : null, ctt.k(cxu.c(350, 0, new cyh(0.2f, 0.0f, 0.0f, 1.0f), 2), null, 10), ctt.q(new dbu(250, 150, new cyh(0.2f, 0.0f, 0.0f, 1.0f)), null, 10), null, hpx.d(1373340897, new dojn(hviVar, djiVar, dojhVar), b), b, 196992, 16);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doji
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dojh dojhVar2 = dojh.this;
                    hvi hviVar2 = hviVar;
                    int i4 = i;
                    dojr.b(dojhVar2, hviVar2, djiVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
