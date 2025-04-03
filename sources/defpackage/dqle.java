package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqle {
    private static final enru a = enru.c("com/google/android/libraries/compose/core/mdd/MddUtil");
    private final dwub b;

    public dqle(dwub dwubVar) {
        dwubVar.getClass();
        this.b = dwubVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.dwqt r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dqlc
            if (r0 == 0) goto L13
            r0 = r8
            dqlc r0 = (defpackage.dqlc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqlc r0 = new dqlc
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            java.lang.String r6 = r0.f
            dqle r2 = r0.e
            defpackage.ffci.b(r8)
            goto L62
        L3c:
            defpackage.ffci.b(r8)
            dwub r8 = r5.b
            dwrp r2 = defpackage.dwrq.f()
            r2.b(r6)
            dwrq r2 = r2.a()
            com.google.common.util.concurrent.ListenableFuture r8 = r8.e(r2)
            r8.getClass()
            r0.e = r5
            r0.f = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto L78
            r2 = r5
        L62:
            dwns r8 = (defpackage.dwns) r8
            if (r8 != 0) goto L77
            r8 = 0
            r0.e = r8
            r0.f = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r6 = r2.b(r6, r7, r0)
            if (r6 != r1) goto L76
            goto L78
        L76:
            return r6
        L77:
            return r8
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqle.a(java.lang.String, dwqt, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, defpackage.dwqt r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.dqld
            if (r0 == 0) goto L13
            r0 = r9
            dqld r0 = (defpackage.dqld) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqld r0 = new dqld
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.a
            java.lang.String r7 = (java.lang.String) r7
            defpackage.ffci.b(r9)     // Catch: defpackage.dwqn -> L2f
            goto L7f
        L2f:
            r8 = move-exception
            goto L83
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.String r7 = r0.e
            java.lang.Object r8 = r0.a
            dqle r8 = (defpackage.dqle) r8
            defpackage.ffci.b(r9)     // Catch: defpackage.dwqn -> L2f
            goto L5d
        L43:
            defpackage.ffci.b(r9)
            dwub r9 = r6.b     // Catch: defpackage.dwqn -> L2f
            com.google.common.util.concurrent.ListenableFuture r8 = r8.a(r9)     // Catch: defpackage.dwqn -> L2f
            r8.getClass()     // Catch: defpackage.dwqn -> L2f
            r0.a = r6     // Catch: defpackage.dwqn -> L2f
            r0.e = r7     // Catch: defpackage.dwqn -> L2f
            r0.d = r4     // Catch: defpackage.dwqn -> L2f
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)     // Catch: defpackage.dwqn -> L2f
            if (r8 != r1) goto L5c
            goto L82
        L5c:
            r8 = r6
        L5d:
            r0.a = r7     // Catch: defpackage.dwqn -> L2f
            r0.e = r5     // Catch: defpackage.dwqn -> L2f
            r0.d = r3     // Catch: defpackage.dwqn -> L2f
            dwub r8 = r8.b     // Catch: defpackage.dwqn -> L2f
            dwqo r9 = defpackage.dwqp.n()     // Catch: defpackage.dwqn -> L2f
            r9.c(r7)     // Catch: defpackage.dwqn -> L2f
            emxc r2 = defpackage.dwou.a     // Catch: defpackage.dwqn -> L2f
            r9.b(r2)     // Catch: defpackage.dwqn -> L2f
            dwqp r9 = r9.a()     // Catch: defpackage.dwqn -> L2f
            com.google.common.util.concurrent.ListenableFuture r8 = r8.c(r9)     // Catch: defpackage.dwqn -> L2f
            java.lang.Object r9 = defpackage.fgfz.c(r8, r0)     // Catch: defpackage.dwqn -> L2f
            if (r9 == r1) goto L82
        L7f:
            dwns r9 = (defpackage.dwns) r9     // Catch: defpackage.dwqn -> L2f
            return r9
        L82:
            return r1
        L83:
            dwqm r9 = r8.a
            dwqm r0 = defpackage.dwqm.GROUP_NOT_FOUND_ERROR
            java.lang.String r1 = "tryDownloadFileGroup"
            java.lang.String r2 = "com/google/android/libraries/compose/core/mdd/MddUtil"
            java.lang.String r3 = "MddUtil.kt"
            if (r9 != r0) goto La9
            enru r9 = defpackage.dqle.a
            ensk r9 = r9.j()
            enrr r9 = (defpackage.enrr) r9
            ensk r8 = r9.g(r8)
            r9 = 34
            ensk r8 = r8.h(r2, r1, r9, r3)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "No such file group exists: %s."
            r8.t(r9, r7)
            goto Lc2
        La9:
            enru r9 = defpackage.dqle.a
            ensk r9 = r9.i()
            enrr r9 = (defpackage.enrr) r9
            ensk r8 = r9.g(r8)
            r9 = 40
            ensk r8 = r8.h(r2, r1, r9, r3)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "Download failed for file group: %s."
            r8.t(r9, r7)
        Lc2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqle.b(java.lang.String, dwqt, ffgu):java.lang.Object");
    }
}
