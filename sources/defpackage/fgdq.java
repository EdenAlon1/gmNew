package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdq implements ffxy {
    private final ffxy a;
    private final ffjm b;

    public fgdq(ffxy ffxyVar, ffjm ffjmVar) {
        this.a = ffxyVar;
        this.b = ffjmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (((defpackage.fgdq) r7).b(r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fgfi] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fgdp
            if (r0 == 0) goto L13
            r0 = r7
            fgdp r0 = (defpackage.fgdp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fgdp r0 = new fgdp
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L72
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            fgfi r2 = r0.e
            fgdq r4 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L3a
            goto L59
        L3a:
            r7 = move-exception
            goto L76
        L3c:
            defpackage.ffci.b(r7)
            ffxy r7 = r6.a
            fgfi r2 = new fgfi
            ffhd r5 = r0.u()
            r2.<init>(r7, r5)
            ffjm r7 = r6.b     // Catch: java.lang.Throwable -> L3a
            r0.d = r6     // Catch: java.lang.Throwable -> L3a
            r0.e = r2     // Catch: java.lang.Throwable -> L3a
            r0.c = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r7 == r1) goto L75
            r4 = r6
        L59:
            r2.g()
            ffxy r7 = r4.a
            boolean r2 = r7 instanceof defpackage.fgdq
            if (r2 == 0) goto L72
            fgdq r7 = (defpackage.fgdq) r7
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L72
            goto L75
        L72:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L75:
            return r1
        L76:
            r2.g()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgdq.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        return this.a.fQ(obj, ffguVar);
    }
}
