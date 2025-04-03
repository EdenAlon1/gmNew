package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdc {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ffix r21, defpackage.keh r22, defpackage.ffjm r23, defpackage.hfd r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdc.a(ffix, keh, ffjm, hfd, int, int):void");
    }

    public static final /* synthetic */ void b(hvi hviVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1177876616);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if (b.J((i2 & 19) != 18, i2 & 1)) {
            kda kdaVar = kda.a;
            int a = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i4 = ist.a;
            int i5 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, kdaVar, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf((i5 >> 6) & 14));
            b.n();
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new kdb(hviVar, ffjmVar, i);
        }
    }
}
