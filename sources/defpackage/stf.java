package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stf {
    public static final void a(final std stdVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 48;
        hfd b = hfdVar.b(168190276);
        if (i3 == 0) {
            i2 = i | (true != b.D(hviVar) ? 16 : 32);
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b("Not implemented", hviVar, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar2, (i2 & 112) | 6, 0, 131068);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ste
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    std stdVar2 = std.this;
                    int i4 = i;
                    stf.a(stdVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
