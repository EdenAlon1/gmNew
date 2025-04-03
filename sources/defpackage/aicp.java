package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aicp {
    public static final void a(final aicj aicjVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1750431852);
        if (i3 == 0) {
            i2 = (true != b.D(aicjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dmvi dmviVar = (dmvi) hkf.a(aicjVar.d, b).a();
            b.v(1250069622);
            if (!dmviVar.b.isEmpty()) {
                dmva.a(dmviVar, null, b, 0);
            }
            ((hfm) b).Z();
            gpa.c(null, null, 0L, 0L, 0.0f, 0.0f, null, hpx.d(-551607121, new aicn(aicjVar), b), b, 127);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aick
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aicp.a(aicj.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final aicj aicjVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi a;
        hvi c2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-426760287);
        if (i3 == 0) {
            i2 = (true != b.D(aicjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            rva a2 = rvd.a(b);
            b.v(-1727639978);
            long j = gft.a(b).F;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            cwni.b(a2, j, false, null, b, 0, 12);
            b.v(-1727623007);
            c = ebs.c(hvi.e, 1.0f);
            hvi b2 = ecm.b(c, new eat(ecv.f(b), true != aicjVar.f.a ? 47 : 15));
            a = dee.a(hvi.e, gft.a(b).p, idb.a);
            hvi a3 = b2.a(a);
            hfmVar.Z();
            b.v(-1727618306);
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: aicl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jks.a(jkvVar);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c2 = jjs.c(a3, false, (ffji) R);
            hfdVar2 = b;
            dwio.a(c2, null, null, null, null, 0, 0L, 0L, null, hpx.d(-564986960, new aico(aicjVar, a2), b), hfdVar2, 805306368, 510);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aicm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aicp.b(aicj.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
