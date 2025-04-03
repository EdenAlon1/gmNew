package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class olg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ olh b;
    final /* synthetic */ ffji c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olg(olh olhVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = olhVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((olg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r7.a.a(r1, r6) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r7.invoke(r6) != r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ffud] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ffud] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ole] */
    /* JADX WARN: Type inference failed for: r7v15, types: [ole] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L14
            defpackage.ffci.b(r7)
            goto L8b
        L14:
            java.lang.Object r0 = r6.d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.ffci.b(r7)
            goto L8a
        L1d:
            java.lang.Object r1 = r6.d
            ffud r1 = (defpackage.ffud) r1
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L25
            goto L69
        L25:
            r7 = move-exception
            goto L79
        L27:
            java.lang.Object r1 = r6.d
            ffud r1 = (defpackage.ffud) r1
            defpackage.ffci.b(r7)
            goto L55
        L2f:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.d
            ffsk r7 = (defpackage.ffsk) r7
            ffhd r7 = r7.hT()
            ffuc r1 = defpackage.ffud.c
            ffha r7 = r7.get(r1)
            if (r7 == 0) goto L8f
            olh r1 = r6.b
            ffud r7 = (defpackage.ffud) r7
            r6.d = r7
            r6.a = r4
            ole r1 = r1.a
            java.lang.Object r1 = r1.b(r7, r6)
            if (r1 == r0) goto L8e
            r5 = r1
            r1 = r7
            r7 = r5
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8b
            ffji r7 = r6.c     // Catch: java.lang.Throwable -> L25
            r6.d = r1     // Catch: java.lang.Throwable -> L25
            r6.a = r3     // Catch: java.lang.Throwable -> L25
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L25
            if (r7 == r0) goto L8e
        L69:
            olh r7 = r6.b
            r3 = 0
            r6.d = r3
            r6.a = r2
            ole r7 = r7.a
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L8b
            goto L8e
        L79:
            olh r2 = r6.b
            r6.d = r7
            r3 = 4
            r6.a = r3
            ole r2 = r2.a
            java.lang.Object r1 = r2.a(r1, r6)
            if (r1 != r0) goto L89
            goto L8e
        L89:
            r0 = r7
        L8a:
            throw r0
        L8b:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L8e:
            return r0
        L8f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.olg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        olg olgVar = new olg(this.b, this.c, ffguVar);
        olgVar.d = obj;
        return olgVar;
    }
}
