package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doay {
    public static final void a(final hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        hfd b = hfdVar.b(-1780171373);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && b.I()) {
            b.s();
        } else {
            if (i2 != 0) {
                hviVar = hvi.e;
            }
            hvi hviVar2 = hviVar;
            gpa.c(hviVar2, gft.c(b).d, ibw.g, 0L, 0.0f, 0.0f, des.a(1.0f, gft.a(b).A), doaw.a, b, 56);
            hviVar = hviVar2;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doax
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    doay.a(hvi.this, (hfd) obj, hip.a(i4 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }
}
