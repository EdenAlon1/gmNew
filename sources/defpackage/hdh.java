package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdh {
    public static final hvi a(hvi hviVar, boolean z, String str) {
        hvi c;
        if (!z) {
            return hviVar;
        }
        c = jjs.c(hviVar, false, new hdb(str));
        return c;
    }

    public static final hvi b(hvi hviVar, ffix ffixVar) {
        return iop.a(hviVar, new hdg(ffixVar));
    }

    public static final void c(long j, jpo jpoVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        long j2;
        jpo jpoVar2;
        ffjm ffjmVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1208685580);
        if (i3 == 0) {
            i2 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(jpoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            ffjmVar2 = ffjmVar;
            jpoVar2 = jpoVar;
            j2 = j;
        } else {
            hca.a(j, jpoVar, ffjmVar, b, i2 & 1022);
            j2 = j;
            jpoVar2 = jpoVar;
            ffjmVar2 = ffjmVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new hct(j2, jpoVar2, ffjmVar2, i);
        }
    }

    public static final void d(long j, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(660142980);
        if (i3 == 0) {
            i2 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hfz.a(fzc.a.c(new ibw(j)), ffjmVar, b, (i2 & 112) | 8);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new hcu(j, ffjmVar, i);
        }
    }

    public static final float e(hfd hfdVar) {
        long i = gft.d(hfdVar).l.i();
        jta jtaVar = heh.a;
        long j = heh.l;
        if (kak.b(i) != 4294967296L) {
            i = j;
        }
        return ((jzn) hfdVar.e(jdr.e)).ef(i) / 2.0f;
    }

    public static final float f(hfd hfdVar) {
        float f = ((jzq) hfdVar.e(gex.a)).a;
        if (true == Float.isNaN(f)) {
            f = 0.0f;
        }
        return ffmk.c((f - 24.0f) / 2.0f, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x026a, code lost:
    
        if (r6 == 2) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x029d, code lost:
    
        throw new defpackage.ffcd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0295, code lost:
    
        if (r3 == 2) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02ec, code lost:
    
        if (r0 == 2) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0312, code lost:
    
        if (r0 == 2) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0355, code lost:
    
        if (r3 == 2) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0383, code lost:
    
        throw new defpackage.ffcd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x037b, code lost:
    
        if (r3 == 2) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x031c, code lost:
    
        if (r28 != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x031b, code lost:
    
        throw new defpackage.ffcd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x02f0, code lost:
    
        if (r28 != false) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03c7  */
    /* JADX WARN: Type inference failed for: r18v1, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v2, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v3, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v4, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v5, types: [cyq, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.hdi r39, java.lang.CharSequence r40, defpackage.ffjm r41, defpackage.gqz r42, defpackage.ffjn r43, defpackage.ffjm r44, defpackage.ffjm r45, defpackage.ffjm r46, boolean r47, boolean r48, boolean r49, defpackage.dwn r50, defpackage.ebe r51, defpackage.gqr r52, defpackage.ffjm r53, defpackage.hfd r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdh.g(hdi, java.lang.CharSequence, ffjm, gqz, ffjn, ffjm, ffjm, ffjm, boolean, boolean, boolean, dwn, ebe, gqr, ffjm, hfd, int, int):void");
    }
}
