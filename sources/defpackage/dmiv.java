package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmiv {
    public static final void a(final dmiq dmiqVar, final long j, final long j2, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2128209296);
        if (i3 == 0) {
            i2 = (true != b.D(dmiqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.C(j2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            gpa.e(dmiqVar.b, null, false, gft.c(b).f, j, 0L, 0.0f, null, null, hpx.d(-1923936059, new dmiu(dmiqVar, j2), b), hfdVar2, 998);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmis
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmiq dmiqVar2 = dmiq.this;
                    long j3 = j;
                    dmiv.a(dmiqVar2, j3, j2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final long b(hfd hfdVar) {
        hfdVar.v(812498753);
        hfdVar.v(1995230045);
        long j = gft.a(hfdVar).p;
        hfdVar.o();
        hfdVar.o();
        return j;
    }

    public static final void c(final dmiy dmiyVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-1026500061);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmiyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            hvi d = eba.d(hviVar, 8.0f);
            eqd eqdVar = gft.c(b).f;
            long b2 = b(b);
            b.v(1592831209);
            der a = des.a(1.0f, gft.a(b).B);
            ((hfm) b).Z();
            gpa.c(d, eqdVar, b2, 0L, 0.0f, 0.0f, a, hpx.d(-15489346, new dmit(dmiyVar), b), b, 56);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmir
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmiy dmiyVar2 = dmiy.this;
                    int i3 = i;
                    dmiv.c(dmiyVar2, hviVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
