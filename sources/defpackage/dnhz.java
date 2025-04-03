package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnhz {
    /* JADX WARN: Removed duplicated region for block: B:15:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dnia r21, defpackage.hvi r22, defpackage.hfd r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnhz.a(dnia, hvi, hfd, int, int):void");
    }

    public static final void b(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(627231186);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).k, hfdVar2, i2 & 14, 0, 65530);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnhs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnhz.b(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1045151888);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).j, hfdVar2, i2 & 14, 0, 65534);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnhq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnhz.c(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final hvi hviVar, final dwn dwnVar, final ffix ffixVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1410972339);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dwnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            hvi e = eba.e(dfb.c(eba.i(d, 0.0f, 2.0f, 1), dwnVar, gkw.a(false, 0.0f, 0L, 7), false, null, null, ffixVar, 28), 16.0f, 6.0f);
            int i4 = huo.a;
            int i5 = (i2 & 7168) | 384;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
            int i6 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i5 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnht
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dwn dwnVar2 = dwnVar;
                    ffix ffixVar3 = ffixVar;
                    dnhz.d(hviVar2, dwnVar2, ffixVar3, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
