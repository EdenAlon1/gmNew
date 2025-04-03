package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtih {
    public static final void a(final boolean z, boolean z2, final hvi hviVar, final dtii dtiiVar, final dteh dtehVar, hfd hfdVar, final int i) {
        int i2;
        final boolean z3;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1004109865);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i2 |= true != b.E(z3) ? 16 : 32;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            hviVar2 = hviVar;
            i2 |= true != b.D(hviVar2) ? 128 : 256;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(dtiiVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(dtehVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            int i4 = i2 >> 3;
            css.a(Boolean.valueOf(z3), hviVar2, null, null, hpx.d(1080009784, new dtie(dtiiVar, z, dtehVar), b), b, (i4 & 14) | 24576 | (i4 & 112), 12);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dtic
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    boolean z5 = z3;
                    hvi hviVar3 = hviVar;
                    dtii dtiiVar2 = dtiiVar;
                    dtih.a(z4, z5, hviVar3, dtiiVar2, dtehVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
