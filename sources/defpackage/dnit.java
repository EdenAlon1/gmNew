package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnit {
    public static final void a(final dniu dniuVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1165177695);
        if (i3 == 0) {
            i2 = (true != b.D(dniuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) != 18 || !b.I()) {
            throw null;
        }
        b.s();
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnis
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dniu dniuVar2 = dniu.this;
                    int i4 = i;
                    dnit.a(dniuVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
