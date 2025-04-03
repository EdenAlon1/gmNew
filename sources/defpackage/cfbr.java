package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfbr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfbs b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfbr(cfbs cfbsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cfbsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfbr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (defpackage.fgfz.c(r5, r4) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r5 != r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L13
            java.lang.Object r0 = r4.c
            ffsk r0 = (defpackage.ffsk) r0
            defpackage.ffci.b(r5)     // Catch: java.util.concurrent.CancellationException -> L11 java.lang.Exception -> L55
            goto L55
        L11:
            r5 = move-exception
            goto L52
        L13:
            java.lang.Object r1 = r4.c
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r5)     // Catch: java.util.concurrent.CancellationException -> L3c
            goto L31
        L1b:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            r1 = r5
            ffsk r1 = (defpackage.ffsk) r1
            cfbs r5 = r4.b     // Catch: java.util.concurrent.CancellationException -> L3c
            ffss r5 = r5.a     // Catch: java.util.concurrent.CancellationException -> L3c
            r4.c = r1     // Catch: java.util.concurrent.CancellationException -> L3c
            r4.a = r2     // Catch: java.util.concurrent.CancellationException -> L3c
            java.lang.Object r5 = r5.c(r4)     // Catch: java.util.concurrent.CancellationException -> L3c
            if (r5 == r0) goto L4f
        L31:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.util.concurrent.CancellationException -> L3c
            boolean r5 = r5.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L3c
            if (r5 == 0) goto L3a
            goto L55
        L3a:
            r2 = 0
            goto L55
        L3c:
            cfbs r5 = r4.b     // Catch: java.util.concurrent.CancellationException -> L50 java.lang.Exception -> L55
            elfl r5 = r5.c     // Catch: java.util.concurrent.CancellationException -> L50 java.lang.Exception -> L55
            r5.getClass()     // Catch: java.util.concurrent.CancellationException -> L50 java.lang.Exception -> L55
            r4.c = r1     // Catch: java.util.concurrent.CancellationException -> L50 java.lang.Exception -> L55
            r3 = 2
            r4.a = r3     // Catch: java.util.concurrent.CancellationException -> L50 java.lang.Exception -> L55
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)     // Catch: java.util.concurrent.CancellationException -> L50 java.lang.Exception -> L55
            if (r5 == r0) goto L4f
            goto L55
        L4f:
            return r0
        L50:
            r5 = move-exception
            r0 = r1
        L52:
            defpackage.ffsl.e(r0, r5)
        L55:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfbr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfbr cfbrVar = new cfbr(this.b, ffguVar);
        cfbrVar.c = obj;
        return cfbrVar;
    }
}
