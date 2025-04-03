package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqb {
    public static final void a(final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        ffjmVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1707938378);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dskb.a(true, null, hpx.d(825250781, new dsqa(ffjmVar), b), b, 390, 2);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsps
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dsqb.a(ffjm.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dspo dspoVar, final god godVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(426626035);
        if (i3 == 0) {
            i2 = (true != b.D(dspoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(godVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            cru.b(dspoVar != null, null, null, null, null, hpx.d(-1219322165, new dspz(dspoVar, godVar), b), b, 196608, 30);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dspr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dspo dspoVar2 = dspo.this;
                    int i4 = i;
                    dsqb.b(dspoVar2, godVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
