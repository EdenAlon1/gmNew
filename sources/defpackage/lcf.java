package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lcf extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ lcg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcf(lcg lcgVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = lcgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        if (r5 == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L12
            java.lang.Object r0 = r4.a
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L10
            goto L62
        L10:
            r5 = move-exception
            goto L69
        L12:
            java.lang.Object r1 = r4.a
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L18
            goto L35
        L18:
            r5 = move-exception
            goto L39
        L1a:
            defpackage.ffci.b(r5)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L3f
            lcg r5 = r4.c     // Catch: java.io.FileNotFoundException -> L3f
            java.io.File r5 = r5.a     // Catch: java.io.FileNotFoundException -> L3f
            r1.<init>(r5)     // Catch: java.io.FileNotFoundException -> L3f
            lcg r5 = r4.c     // Catch: java.io.FileNotFoundException -> L3f
            lcv r5 = r5.b     // Catch: java.lang.Throwable -> L18
            r4.a = r1     // Catch: java.lang.Throwable -> L18
            r4.b = r3     // Catch: java.lang.Throwable -> L18
            java.lang.Object r5 = r5.a(r1)     // Catch: java.lang.Throwable -> L18
            if (r5 != r0) goto L35
            goto L66
        L35:
            defpackage.ffig.a(r1, r2)     // Catch: java.io.FileNotFoundException -> L3f
            return r5
        L39:
            throw r5     // Catch: java.lang.Throwable -> L3a
        L3a:
            r3 = move-exception
            defpackage.ffig.a(r1, r5)     // Catch: java.io.FileNotFoundException -> L3f
            throw r3     // Catch: java.io.FileNotFoundException -> L3f
        L3f:
            lcg r5 = r4.c
            java.io.File r5 = r5.a
            boolean r5 = r5.exists()
            if (r5 == 0) goto L6f
            lcg r5 = r4.c
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r5 = r5.a
            r1.<init>(r5)
            lcg r5 = r4.c
            lcv r5 = r5.b     // Catch: java.lang.Throwable -> L67
            r4.a = r1     // Catch: java.lang.Throwable -> L67
            r3 = 2
            r4.b = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = r5.a(r1)     // Catch: java.lang.Throwable -> L67
            if (r5 == r0) goto L66
            r0 = r1
        L62:
            defpackage.ffig.a(r0, r2)
            goto L6f
        L66:
            return r0
        L67:
            r5 = move-exception
            r0 = r1
        L69:
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r1 = move-exception
            defpackage.ffig.a(r0, r5)
            throw r1
        L6f:
            lcg r5 = r4.c
            lcv r5 = r5.b
            eyhs r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new lcf(this.c, (ffgu) obj).b(ffcu.a);
    }
}
