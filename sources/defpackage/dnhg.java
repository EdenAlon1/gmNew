package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnhg {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dnhh r19, defpackage.hvi r20, defpackage.jpo r21, defpackage.hfd r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnhg.a(dnhh, hvi, jpo, hfd, int, int):void");
    }

    public static final void b(final dmzz dmzzVar, final boolean z, final Integer num, hfd hfdVar, final int i) {
        int i2;
        long j;
        int i3 = i & 6;
        hfd b = hfdVar.b(1057923624);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(num) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            igq a = dnaa.a(dmzzVar, b);
            if (z) {
                b.v(-1090539582);
                j = gft.a(b).w;
                ((hfm) b).Z();
            } else if (num != null) {
                b.v(-1090538484);
                ((hfm) b).Z();
                j = iby.c(num.intValue());
            } else {
                b.v(-1090536636);
                j = gft.a(b).a;
                ((hfm) b).Z();
            }
            dwho.a(a, null, null, j, b, 0, 4);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnhd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    boolean z2 = z;
                    int i4 = i;
                    dnhg.b(dmzzVar2, z2, num, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dlut dlutVar, final jpo jpoVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(752714083);
        if (i3 == 0) {
            i2 = (true != b.D(dlutVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(jpoVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-773488588);
            jpo jpoVar2 = jpoVar == null ? (jpo) b.e(grl.a) : jpoVar;
            ((hfm) b).Z();
            dlur.e(dlutVar, null, ((ibw) b.e(fzc.a)).i, jpoVar2, null, 0L, null, false, null, b, i2 & 14, 498);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnhb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlut dlutVar2 = dlut.this;
                    int i4 = i;
                    dnhg.c(dlutVar2, jpoVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
