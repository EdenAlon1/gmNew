package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dosx {
    public static final void a(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1779493464);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            jpo jpoVar = dooy.d(b).f;
            b.v(1826593641);
            hfdVar2 = b;
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jpoVar, hfdVar2, i2 & 14, 3120, 55294);
            ((hfm) hfdVar2).Z();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dosw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dosx.a(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
