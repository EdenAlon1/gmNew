package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyou {
    public static final void a(final cyor cyorVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(743434759);
        if (i3 == 0) {
            i2 = (true != b.D(cyorVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else if (!cyorVar.a.isEmpty()) {
            dwfo.a(null, null, dwfk.b(gft.a(b).D, 0L, b, 14), null, null, hpx.d(230392026, new cyot(cyorVar), b), b, 196608, 27);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyos
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cyou.a(cyor.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
