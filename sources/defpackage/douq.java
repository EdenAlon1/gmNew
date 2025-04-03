package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class douq {
    public static final void a(final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        ffjmVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1861542867);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hfz.a(jdr.j.c(kah.a), hpx.d(88819859, new doup(ffjmVar), b), b, 56);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: douo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    douq.a(ffjm.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
