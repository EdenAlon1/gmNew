package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnak {
    public static final boolean a(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x014d, code lost:
    
        if (r15 == defpackage.hfc.a) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.dnaw r19, defpackage.hvi r20, defpackage.qgk r21, defpackage.ffjm r22, boolean r23, int r24, defpackage.hfd r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnak.b(dnaw, hvi, qgk, ffjm, boolean, int, hfd, int, int):void");
    }

    public static final void c(final boolean z, final ffjm ffjmVar, final ffjm ffjmVar2, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1533221143);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            if (z) {
                b.v(1998596059);
                ffjmVar.a(b, Integer.valueOf((i2 >> 3) & 14));
            } else {
                b.v(1826966439);
                if (ffjmVar2 != null) {
                    ffjmVar2.a(b, Integer.valueOf((i2 >> 6) & 14));
                }
            }
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnag
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    ffjm ffjmVar3 = ffjmVar;
                    int i4 = i;
                    dnak.c(z2, ffjmVar3, ffjmVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
