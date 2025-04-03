package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmwy {
    public static final void a(final eyld eyldVar, final cxj cxjVar, hfd hfdVar, final int i) {
        int i2;
        cxjVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-41620519);
        if (i3 == 0) {
            i2 = (true != b.D(eyldVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(cxjVar) : b.F(cxjVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-110460785);
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && b.F(cxjVar));
            boolean z2 = (i2 & 14) == 4;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z2 | z) || R == hfc.a) {
                R = new dmww(cxjVar, eyldVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.f(eyldVar, cxjVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmwu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eyld eyldVar2 = eyld.this;
                    int i4 = i;
                    dmwy.a(eyldVar2, cxjVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final eyld eyldVar, final cxj cxjVar, final long j, hfd hfdVar, final int i) {
        int i2;
        cxjVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-706631248);
        if (i3 == 0) {
            i2 = (true != b.D(eyldVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(cxjVar) : b.F(cxjVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.C(j) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.v(-110432157);
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && b.F(cxjVar));
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (i2 & 896) == 256;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z2 | z | z3) || R == hfc.a) {
                R = new dmwx(cxjVar, eyldVar, j, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(eyldVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmwv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eyld eyldVar2 = eyld.this;
                    cxj cxjVar2 = cxjVar;
                    dmwy.b(eyldVar2, cxjVar2, j, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
