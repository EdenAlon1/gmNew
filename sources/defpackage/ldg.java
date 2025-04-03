package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldg implements lcs {
    private final fgjb a = new fgjf();
    private final lad b = new lad();
    private final ffxx c = new fgcp(new ldf(null));

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [ffji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.lcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffji r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ldd
            if (r0 == 0) goto L13
            r0 = r8
            ldd r0 = (defpackage.ldd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ldd r0 = new ldd
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.a
            fgjb r7 = (defpackage.fgjb) r7
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r8 = move-exception
            goto L6a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            fgjf r7 = r0.e
            java.lang.Object r2 = r0.a
            ffji r2 = (defpackage.ffji) r2
            defpackage.ffci.b(r8)
            goto L59
        L43:
            defpackage.ffci.b(r8)
            fgjb r8 = r6.a
            r0.a = r7
            r2 = r8
            fgjf r2 = (defpackage.fgjf) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r8.a(r5, r0)
            if (r2 == r1) goto L6e
            r2 = r7
            r7 = r8
        L59:
            r0.a = r7     // Catch: java.lang.Throwable -> L2f
            r0.e = r5     // Catch: java.lang.Throwable -> L2f
            r0.d = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L66
            goto L6e
        L66:
            r7.b(r5)
            return r8
        L6a:
            r7.b(r5)
            throw r8
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldg.a(ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.lcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffjm r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lde
            if (r0 == 0) goto L13
            r0 = r9
            lde r0 = (defpackage.lde) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lde r0 = new lde
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r8 = r0.a
            fgjf r0 = r0.e
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L55
        L2c:
            r9 = move-exception
            goto L60
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.ffci.b(r9)
            fgjb r9 = r7.a
            boolean r2 = r9.d(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L5c
            r6 = r9
            fgjf r6 = (defpackage.fgjf) r6     // Catch: java.lang.Throwable -> L5c
            r0.e = r6     // Catch: java.lang.Throwable -> L5c
            r0.a = r2     // Catch: java.lang.Throwable -> L5c
            r0.d = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r8 = r8.a(r5, r0)     // Catch: java.lang.Throwable -> L5c
            if (r8 == r1) goto L5b
            r0 = r9
            r9 = r8
            r8 = r2
        L55:
            if (r8 == 0) goto L5a
            r0.b(r4)
        L5a:
            return r9
        L5b:
            return r1
        L5c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r2
        L60:
            if (r8 == 0) goto L65
            r0.b(r4)
        L65:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldg.b(ffjm, ffgu):java.lang.Object");
    }

    @Override // defpackage.lcs
    public final ffxx c() {
        return this.c;
    }

    @Override // defpackage.lcs
    public final Object d() {
        return new Integer(this.b.a());
    }

    @Override // defpackage.lcs
    public final Object e() {
        return new Integer(this.b.a.incrementAndGet());
    }
}
