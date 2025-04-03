package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axva extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ axvh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axva(axvh axvhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = axvhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axva) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r3.e(r4) != r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
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
            int r1 = r4.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L14
            java.lang.Object r0 = r4.a
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L12
            goto L62
        L12:
            r5 = move-exception
            goto L69
        L14:
            java.lang.Object r1 = r4.b
            java.lang.Object r3 = r4.a
            axvh r3 = (defpackage.axvh) r3
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L1e
            goto L44
        L1e:
            r5 = move-exception
            r0 = r1
            goto L69
        L21:
            defpackage.ffci.b(r5)
            axvh r5 = r4.d
            ffhd r1 = r4.u()
            boolean r1 = defpackage.ekxi.b(r1)
            if (r1 == 0) goto L6f
            java.lang.String r1 = "ContactsSyncScheduler"
            ekzz r1 = defpackage.eleg.f(r1)
            r4.a = r5     // Catch: java.lang.Throwable -> L1e
            r4.b = r1     // Catch: java.lang.Throwable -> L1e
            r4.c = r3     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            java.lang.Object r3 = r5.c(r3, r4)     // Catch: java.lang.Throwable -> L1e
            if (r3 == r0) goto L68
            r3 = r5
        L44:
            entd r5 = defpackage.axvh.a     // Catch: java.lang.Throwable -> L1e
            ffbr r5 = r3.g     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L1e
            atfe r5 = (defpackage.atfe) r5     // Catch: java.lang.Throwable -> L1e
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L61
            r4.a = r1     // Catch: java.lang.Throwable -> L1e
            r4.b = r2     // Catch: java.lang.Throwable -> L1e
            r5 = 2
            r4.c = r5     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = r3.e(r4)     // Catch: java.lang.Throwable -> L1e
            if (r5 == r0) goto L68
        L61:
            r0 = r1
        L62:
            defpackage.ffig.a(r0, r2)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L68:
            return r0
        L69:
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r1 = move-exception
            defpackage.ffig.a(r0, r5)
            throw r1
        L6f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axva.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axva(this.d, ffguVar);
    }
}
