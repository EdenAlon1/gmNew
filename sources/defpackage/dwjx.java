package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwjx {
    public static final void a(final gul gulVar, final hvi hviVar, final grs grsVar, hfd hfdVar, final int i) {
        int i2;
        gulVar.getClass();
        hfd b = hfdVar.b(-898063705);
        if ((i & 6) == 0) {
            i2 = (true != b.F(gulVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hviVar = hvi.e;
                grsVar = dwju.a(b);
            } else {
                b.s();
            }
            b.l();
            guj.y(gulVar, hviVar, grsVar, b, i3 & 126);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwjw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gul gulVar2 = gul.this;
                    hvi hviVar2 = hviVar;
                    int i4 = i;
                    dwjx.a(gulVar2, hviVar2, grsVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final gul gulVar, hvi hviVar, grs grsVar, final int i, hfd hfdVar, final int i2) {
        int i3;
        final hvi hviVar2;
        final grs grsVar2;
        gulVar.getClass();
        hfd b = hfdVar.b(434161398);
        if ((i2 & 6) == 0) {
            i3 = (true != b.F(gulVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 = i3 | 176;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != b.B(i) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            grsVar2 = grsVar;
        } else {
            b.t();
            if ((i2 & 1) == 0 || b.G()) {
                hviVar = hvi.e;
                grsVar = dwju.a(b);
            } else {
                b.s();
            }
            hvi hviVar3 = hviVar;
            grs grsVar3 = grsVar;
            b.l();
            guj.z(gulVar, hviVar3, grsVar3, i, b, i4 & 7294);
            hviVar2 = hviVar3;
            grsVar2 = grsVar3;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwjv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gul gulVar2 = gul.this;
                    hvi hviVar4 = hviVar2;
                    grs grsVar4 = grsVar2;
                    dwjx.b(gulVar2, hviVar4, grsVar4, i, (hfd) obj, hip.a(i2 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
