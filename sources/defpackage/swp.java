package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swp {
    public static final void a(final sxh sxhVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        hfd b = hfdVar.b(1308759374);
        if ((i & 6) == 0) {
            i2 = (true != b.D(sxhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(695381870);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new fnx();
                hfmVar.ad(R);
            }
            fnx fnxVar = (fnx) R;
            hfmVar.Z();
            hfdVar2 = b;
            fnd.a(null, fnd.d(fnxVar, b, 1), null, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, hpx.d(-444034992, new swo(sxhVar, fnxVar), b), hfdVar2, 0, 12582912, 131069);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: swm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    swp.a(sxh.this, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
