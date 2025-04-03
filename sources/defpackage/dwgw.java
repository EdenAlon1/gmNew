package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgw {
    public static final void a(hvi hviVar, float f, long j, hfd hfdVar, final int i, final int i2) {
        int i3;
        final hvi hviVar2;
        final float f2;
        final long j2;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(964649005);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0 && b.C(j)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            j2 = j;
            f2 = f;
            hviVar2 = hviVar;
        } else {
            int i7 = i2 & 4;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                if (i4 != 0) {
                    hviVar = hvi.e;
                }
                if (i5 != 0) {
                    f = 1.0f;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    j = dwgt.a(b);
                }
            } else {
                b.s();
                if (i7 != 0) {
                    i3 &= -897;
                }
            }
            hvi hviVar3 = hviVar;
            float f3 = f;
            long j3 = j;
            b.l();
            gdo.a(hviVar3, f3, j3, b, i3 & 1022, 0);
            hviVar2 = hviVar3;
            f2 = f3;
            j2 = j3;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwgv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar4 = hvi.this;
                    float f4 = f2;
                    dwgw.a(hviVar4, f4, j2, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final hvi hviVar, final long j, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(634017535);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(1.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.C(j) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            gdo.b(hviVar, j, b, i2 & 1022);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwgu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dwgw.b(hviVar2, j, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
