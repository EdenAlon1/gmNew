package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axmg implements axmc {
    private static final cskc a = cskc.g("BugleCmsFolsom", "CmsUserEncryptionEligibilityCheckerImpl");
    private final ffbr b;
    private final Optional c;
    private final axkm d;
    private final croi e;

    public axmg(ffsk ffskVar, crok crokVar, ffbr ffbrVar, Optional optional, axkm axkmVar) {
        ffskVar.getClass();
        crokVar.getClass();
        ffbrVar.getClass();
        axkmVar.getClass();
        this.b = ffbrVar;
        this.c = optional;
        this.d = axkmVar;
        this.e = crokVar.a(croj.c);
    }

    private final void d(axlc axlcVar) {
        csjb c = a.c();
        c.A("UserEncryptionEligibility", axlcVar.name());
        c.I(axlcVar == axlc.g ? "Device is eligible for user encrypted backup." : "Device is not eligible for user encrypted backup.");
        c.r();
        e(axlcVar);
    }

    private final void e(axlc axlcVar) {
        ((akzt) this.b.b()).e("Bugle.Cms.Folsom.KeyManager.Eligibility.Count", axlcVar.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.axmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.axmd
            if (r0 == 0) goto L13
            r0 = r5
            axmd r0 = (defpackage.axmd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axmd r0 = new axmd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            if (r2 == 0) goto L38
            r0 = 1
            if (r2 == r0) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r5)
            return r5
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            defpackage.ffci.b(r5)
            axlc r5 = (defpackage.axlc) r5
            return r5
        L38:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axmg.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ad, code lost:
    
        if (r11 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0095, code lost:
    
        if (r11 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0111, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd A[Catch: dfqu -> 0x0036, TryCatch #1 {dfqu -> 0x0036, blocks: (B:14:0x0031, B:15:0x00d0, B:33:0x0132, B:34:0x013b, B:35:0x0153, B:37:0x0170, B:40:0x017d, B:53:0x012a, B:57:0x0136, B:58:0x011e, B:61:0x0113, B:64:0x0107, B:67:0x0139, B:68:0x00fd, B:71:0x00ef, B:73:0x00f5, B:74:0x00e2, B:76:0x00e8, B:77:0x00d5, B:79:0x00db), top: B:13:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8 A[Catch: dfqu -> 0x0036, TryCatch #1 {dfqu -> 0x0036, blocks: (B:14:0x0031, B:15:0x00d0, B:33:0x0132, B:34:0x013b, B:35:0x0153, B:37:0x0170, B:40:0x017d, B:53:0x012a, B:57:0x0136, B:58:0x011e, B:61:0x0113, B:64:0x0107, B:67:0x0139, B:68:0x00fd, B:71:0x00ef, B:73:0x00f5, B:74:0x00e2, B:76:0x00e8, B:77:0x00d5, B:79:0x00db), top: B:13:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axmg.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.axmf
            if (r0 == 0) goto L13
            r0 = r5
            axmf r0 = (defpackage.axmf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axmf r0 = new axmf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            axkm r5 = r4.d
            elfl r5 = r5.q()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axmg.c(ffgu):java.lang.Object");
    }
}
