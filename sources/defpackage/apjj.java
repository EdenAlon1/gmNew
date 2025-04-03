package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apjj extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ apjp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apjj(apjp apjpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = apjpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apjj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        if (r6.a(null, r5) != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L12
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L10
            goto L4c
        L10:
            r6 = move-exception
            goto L58
        L12:
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.ffci.b(r6)
            r6 = r2
            goto L2e
        L1b:
            defpackage.ffci.b(r6)
            apjp r1 = r5.d
            fgjb r6 = r1.c
            r5.a = r6
            r5.b = r1
            r5.c = r2
            java.lang.Object r2 = r6.a(r3, r5)
            if (r2 == r0) goto L5c
        L2e:
            r2 = r1
            apjp r2 = (defpackage.apjp) r2     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.atomic.AtomicReference r2 = r2.e     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L54
            exdz r2 = (defpackage.exdz) r2     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L50
            r5.a = r6     // Catch: java.lang.Throwable -> L54
            r5.b = r3     // Catch: java.lang.Throwable -> L54
            r2 = 2
            r5.c = r2     // Catch: java.lang.Throwable -> L54
            apjp r1 = (defpackage.apjp) r1     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r1.d(r5)     // Catch: java.lang.Throwable -> L54
            if (r1 == r0) goto L5c
            r0 = r6
            r6 = r1
        L4c:
            r2 = r6
            exdz r2 = (defpackage.exdz) r2     // Catch: java.lang.Throwable -> L10
            r6 = r0
        L50:
            r6.b(r3)
            return r2
        L54:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L58:
            r0.b(r3)
            throw r6
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apjj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apjj(this.d, ffguVar);
    }
}
