package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwaz {
    public static final void a(final fgdj fgdjVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1175084648);
        if (i3 == 0) {
            i2 = (true != b.F(fgdjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hkx a = hkf.a(fgdjVar, b);
            if (b(a) != null) {
                dmyg b2 = b(a);
                b2.getClass();
                dmyf.c(b2, hviVar, b, i2 & 112);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cway
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fgdj fgdjVar2 = fgdj.this;
                    int i4 = i;
                    cwaz.a(fgdjVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final dmyg b(hkx hkxVar) {
        return (dmyg) hkxVar.a();
    }
}
