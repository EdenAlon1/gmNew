package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwb {
    public static final void a(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1470871299);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            dwfj.e(ffixVar2, eba.j(hvi.e, 16.0f, 18.0f, 16.0f, 0.0f, 8), false, null, null, null, cvwd.a, b, (i2 & 14) | 805306368, 508);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvwa
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvwb.a(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
