package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwji {
    public static final dwji a = new dwji();

    private dwji() {
    }

    public static final long a(hfd hfdVar) {
        hfdVar.v(291271527);
        long c = dwfv.c(35, hfdVar);
        hfdVar.o();
        return c;
    }

    public static final long b(hfd hfdVar) {
        hfdVar.v(1269314295);
        long c = dwfv.c(18, hfdVar);
        hfdVar.o();
        return c;
    }

    public static final hvi c(hvi hviVar, gpz gpzVar) {
        hviVar.getClass();
        gpzVar.getClass();
        return huz.g(hviVar, new gqb(gpzVar));
    }

    public final void d(final hvi hviVar, float f, long j, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a2;
        hfd b = hfdVar.b(1305604946);
        if ((i & 6) == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                int i3 = dwkp.a;
                j = dwfv.c(26, b);
                f = 3.0f;
            } else {
                b.s();
            }
            b.l();
            d = ebs.d(hviVar, 1.0f);
            a2 = dee.a(ebs.e(d, f), j, idb.a);
            dyc.b(a2, b, 0);
        }
        final float f2 = f;
        final long j2 = j;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwjh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dwji dwjiVar = dwji.this;
                    hvi hviVar2 = hviVar;
                    float f3 = f2;
                    dwjiVar.d(hviVar2, f3, j2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
