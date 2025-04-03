package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmwj {
    public static final void a(hvi hviVar, final dmvn dmvnVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1718024472);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmvnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hviVar;
            dmuy.d(hviVar2, true, dmvnVar.e, null, hpx.d(-1332743906, new dmwi(dmvnVar), b), b, (i2 & 14) | 24624, 8);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmwh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    int i4 = i;
                    dmwj.a(hviVar3, dmvnVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
