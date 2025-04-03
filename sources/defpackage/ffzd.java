package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzd implements ffxx {
    final /* synthetic */ ffxx a;
    final /* synthetic */ ffjm b;

    public ffzd(ffxx ffxxVar, ffjm ffjmVar) {
        this.a = ffxxVar;
        this.b = ffjmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ffxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fgfi] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v7, types: [fgfi] */
    @Override // defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ffzc
            if (r0 == 0) goto L13
            r0 = r8
            ffzc r0 = (defpackage.ffzc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ffzc r0 = new ffzc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.d
            fgfi r7 = (defpackage.fgfi) r7
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L84
        L2e:
            r8 = move-exception
            goto L88
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            ffkx r7 = r0.f
            java.lang.Object r2 = r0.e
            java.lang.Object r4 = r0.d
            ffzd r4 = (defpackage.ffzd) r4
            defpackage.ffci.b(r8)
            goto L66
        L44:
            defpackage.ffci.b(r8)
            ffkx r8 = new ffkx
            r8.<init>()
            r8.a = r4
            ffxx r2 = r6.a
            ffzf r5 = new ffzf
            r5.<init>(r8, r7)
            r0.d = r6
            r0.e = r7
            r0.f = r8
            r0.b = r4
            java.lang.Object r2 = r2.a(r5, r0)
            if (r2 == r1) goto L8f
            r4 = r6
            r2 = r7
            r7 = r8
        L66:
            boolean r7 = r7.a
            if (r7 == 0) goto L8c
            fgfi r7 = new fgfi
            ffhd r8 = r0.u()
            r7.<init>(r2, r8)
            ffjm r8 = r4.b     // Catch: java.lang.Throwable -> L2e
            r0.d = r7     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            r0.e = r2     // Catch: java.lang.Throwable -> L2e
            r0.f = r2     // Catch: java.lang.Throwable -> L2e
            r0.b = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.a(r7, r0)     // Catch: java.lang.Throwable -> L2e
            if (r8 == r1) goto L8f
        L84:
            r7.g()
            goto L8c
        L88:
            r7.g()
            throw r8
        L8c:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffzd.a(ffxy, ffgu):java.lang.Object");
    }
}
