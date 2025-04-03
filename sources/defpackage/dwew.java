package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwew {
    public static final void a(hvi hviVar, long j, long j2, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        final long j3;
        final long j4;
        hfd b = hfdVar.b(-1012366174);
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
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            j4 = j2;
            j3 = j;
            hviVar2 = hviVar;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                b.v(-213021945);
                j = dwfv.c(2, b);
                ((hfm) b).Z();
                j2 = dwfv.a(j, b);
            } else {
                b.s();
            }
            long j5 = j;
            long j6 = j2;
            b.l();
            fug.a(hviVar, j5, j6, b, i3 & 7182);
            hviVar2 = hviVar;
            j3 = j5;
            j4 = j6;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwev
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    long j7 = j3;
                    dwew.a(hviVar3, j7, j4, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
