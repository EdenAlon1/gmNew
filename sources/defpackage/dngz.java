package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngz {
    public static final void a(final dnha dnhaVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1290128093);
        if (i3 == 0) {
            i2 = (true != b.D(dnhaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hviVar;
            dwgw.a(hviVar2, 1.0f, 0L, b, (i2 >> 3) & 14, 4);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dngy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnha dnhaVar2 = dnha.this;
                    int i4 = i;
                    dngz.a(dnhaVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
