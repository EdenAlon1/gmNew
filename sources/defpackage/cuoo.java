package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuoo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dlfy b;
    Object c;
    final /* synthetic */ cupp d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuoo(ffgu ffguVar, cupp cuppVar, dlfy dlfyVar) {
        super(2, ffguVar);
        this.d = cuppVar;
        this.b = dlfyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuoo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r2.a(r5) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r6 != r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:8:0x006f, B:16:0x001a, B:17:0x0045, B:19:0x005d, B:23:0x002b, B:25:0x0037, B:27:0x003f), top: B:2:0x0006 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L16
            java.lang.Object r0 = r5.c
            java.lang.Object r1 = r5.e
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L14
            goto L6d
        L14:
            r6 = move-exception
            goto L7d
        L16:
            java.lang.Object r1 = r5.e
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L14
            goto L45
        L1e:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.e
            ffsk r6 = (defpackage.ffsk) r6
            java.lang.String r6 = "BugleMoiraiApiV2Impl#classify"
            ekzz r1 = defpackage.eleg.f(r6)
            cupp r6 = r5.d     // Catch: java.lang.Throwable -> L14
            dlfy r4 = r5.b     // Catch: java.lang.Throwable -> L14
            r5.e = r1     // Catch: java.lang.Throwable -> L14
            r5.a = r2     // Catch: java.lang.Throwable -> L14
            dkzs r6 = r6.a     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L42
            java.lang.Object r6 = r6.c(r4, r5)     // Catch: java.lang.Throwable -> L14
            ffhh r2 = defpackage.ffhh.a     // Catch: java.lang.Throwable -> L14
            if (r6 == r2) goto L43
            dlgu r6 = (defpackage.dlgu) r6     // Catch: java.lang.Throwable -> L14
            goto L43
        L42:
            r6 = r3
        L43:
            if (r6 == r0) goto L7c
        L45:
            dlgu r6 = (defpackage.dlgu) r6     // Catch: java.lang.Throwable -> L14
            cfup r2 = defpackage.cubs.a     // Catch: java.lang.Throwable -> L14
            emyl r2 = defpackage.cubs.K     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L14
            cfup r2 = (defpackage.cfup) r2     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Throwable -> L14
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L14
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L6c
            cupp r2 = r5.d     // Catch: java.lang.Throwable -> L14
            r5.e = r1     // Catch: java.lang.Throwable -> L14
            r5.c = r6     // Catch: java.lang.Throwable -> L14
            r4 = 2
            r5.a = r4     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L14
            if (r2 == r0) goto L7c
        L6c:
            r0 = r6
        L6d:
            if (r0 != 0) goto L79
            dlgu r6 = new dlgu     // Catch: java.lang.Throwable -> L14
            r0 = 7
            r6.<init>(r3, r3, r0)     // Catch: java.lang.Throwable -> L14
            defpackage.ffig.a(r1, r3)
            return r6
        L79:
            defpackage.ffig.a(r1, r3)
        L7c:
            return r0
        L7d:
            throw r6     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            defpackage.ffig.a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuoo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuoo cuooVar = new cuoo(ffguVar, this.d, this.b);
        cuooVar.e = obj;
        return cuooVar;
    }
}
