package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmwg {
    public static final void a(final hvi hviVar, final dmvl dmvlVar, hfd hfdVar, final int i) {
        int i2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1053356268);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmvlVar) ? 16 : 32;
        }
        if ((i2 & 19) != 18 || !b.I()) {
            throw null;
        }
        b.s();
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmwf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dmwg.a(hviVar2, dmvlVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
