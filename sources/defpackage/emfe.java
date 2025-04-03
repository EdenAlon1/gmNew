package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emfe {
    public static final void a(final ebq ebqVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1132790825);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            a = ebqVar.a(hvi.e, 1.0f, true);
            ebv.a(a, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emfd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    emfe.a(ebq.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
