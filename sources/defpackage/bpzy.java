package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzy implements ffxy {
    final /* synthetic */ ffxy a;

    public bpzy(ffxy ffxyVar) {
        this.a = ffxyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r7.fQ(r2, r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bpzx
            if (r0 == 0) goto L13
            r0 = r8
            bpzx r0 = (defpackage.bpzx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bpzx r0 = new bpzx
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L71
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.c
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L38
            goto L55
        L38:
            r8 = move-exception
            goto L5c
        L3a:
            defpackage.ffci.b(r8)
            ffxy r8 = r6.a
            dtyq r7 = (defpackage.dtyq) r7
            elfl r7 = r7.w()     // Catch: java.lang.Throwable -> L58
            r7.getClass()     // Catch: java.lang.Throwable -> L58
            r0.c = r8     // Catch: java.lang.Throwable -> L58
            r0.b = r4     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)     // Catch: java.lang.Throwable -> L58
            if (r7 == r1) goto L70
            r5 = r8
            r8 = r7
            r7 = r5
        L55:
            engw r8 = (defpackage.engw) r8     // Catch: java.lang.Throwable -> L38
            goto L60
        L58:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L5c:
            java.lang.Object r8 = defpackage.ffci.a(r8)
        L60:
            ffch r2 = new ffch
            r2.<init>(r8)
            r8 = 0
            r0.c = r8
            r0.b = r3
            java.lang.Object r7 = r7.fQ(r2, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpzy.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
