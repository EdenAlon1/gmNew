package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyh extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cvyj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvyh(cvyj cvyjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cvyjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvyh) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (r9.fQ(r1, r8) != r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            if (r1 == r2) goto L13
            java.lang.Object r0 = r8.d
            engw r0 = (defpackage.engw) r0
            defpackage.ffci.b(r9)
            goto L7d
        L13:
            java.lang.Object r1 = r8.a
            java.lang.Object r2 = r8.d
            ffxy r2 = (defpackage.ffxy) r2
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L1d
            goto L5b
        L1d:
            r9 = move-exception
            goto L81
        L1f:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.d
            ffxy r9 = (defpackage.ffxy) r9
            cfva r1 = defpackage.cvqt.j
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L39
            int r1 = defpackage.engw.d
            engw r1 = defpackage.enou.a
            goto L6c
        L39:
            cvyj r1 = r8.c
            ecrj r1 = r1.c
            ecri r1 = r1.d()
            cvyj r4 = r8.c     // Catch: java.lang.Throwable -> L1d
            amav r4 = r4.b     // Catch: java.lang.Throwable -> L1d
            elfl r4 = r4.e()     // Catch: java.lang.Throwable -> L1d
            r4.getClass()     // Catch: java.lang.Throwable -> L1d
            r8.d = r9     // Catch: java.lang.Throwable -> L1d
            r8.a = r1     // Catch: java.lang.Throwable -> L1d
            r8.b = r2     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = defpackage.fgfz.c(r4, r8)     // Catch: java.lang.Throwable -> L1d
            if (r2 == r0) goto L80
            r7 = r2
            r2 = r9
            r9 = r7
        L5b:
            engw r9 = (defpackage.engw) r9     // Catch: java.lang.Throwable -> L1d
            cvyj r4 = r8.c
            ecrj r4 = r4.c
            ecda r5 = defpackage.csra.g
            ecrh r6 = defpackage.ecrh.SUCCESS
            ecri r1 = (defpackage.ecri) r1
            r4.f(r1, r5, r3, r6)
            r1 = r9
            r9 = r2
        L6c:
            r1.getClass()
            r8.d = r1
            r8.a = r3
            r2 = 2
            r8.b = r2
            java.lang.Object r9 = r9.fQ(r1, r8)
            if (r9 != r0) goto L7d
            goto L80
        L7d:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L80:
            return r0
        L81:
            cvyj r0 = r8.c
            ecrj r0 = r0.c
            ecda r2 = defpackage.csra.g
            ecrh r4 = defpackage.ecrh.SUCCESS
            ecri r1 = (defpackage.ecri) r1
            r0.f(r1, r2, r3, r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvyh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvyh cvyhVar = new cvyh(this.c, ffguVar);
        cvyhVar.d = obj;
        return cvyhVar;
    }
}
