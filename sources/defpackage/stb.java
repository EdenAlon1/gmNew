package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stb {
    public static final void a(final ssy ssyVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(412152758);
        if (i3 == 0) {
            i2 = (true != b.D(ssyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dmds.o(ssyVar.a, hviVar, b, i2 & 112);
            dmdx dmdxVar = ssyVar.a;
            b.v(-1612631833);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new sta(ssyVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(dmdxVar.c, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ssz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ssy ssyVar2 = ssy.this;
                    int i5 = i;
                    stb.a(ssyVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
