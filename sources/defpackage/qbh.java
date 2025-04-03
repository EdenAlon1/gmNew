package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbh extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ppr d;
    final /* synthetic */ pvn e;
    final /* synthetic */ pyj f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbh(ppr pprVar, pvn pvnVar, pyj pyjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = pprVar;
        this.e = pvnVar;
        this.f = pyjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qbh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #2 {all -> 0x007b, blocks: (B:32:0x005a, B:33:0x007a, B:14:0x0082, B:17:0x00ae, B:18:0x00b7, B:20:0x00b8, B:6:0x0013, B:7:0x0053, B:23:0x0042), top: B:2:0x0008, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ffud] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ffud] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.c
            r2 = -256(0xffffffffffffff00, float:NaN)
            java.lang.String r3 = "Delegated worker "
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r10.b
            java.lang.Object r4 = r10.a
            java.lang.Object r0 = r10.g
            r5 = r0
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L1a
            goto L53
        L17:
            r0 = move-exception
            r11 = r0
            goto L5a
        L1a:
            r0 = move-exception
            r11 = r0
            goto L82
        L1d:
            defpackage.ffci.b(r11)
            java.lang.Object r11 = r10.g
            ffsk r11 = (defpackage.ffsk) r11
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            r7.<init>(r2)
            ppr r1 = r10.d
            com.google.common.util.concurrent.ListenableFuture r8 = r1.b()
            r8.getClass()
            pvn r5 = r10.e
            pyj r6 = r10.f
            qbg r4 = new qbg
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r1 = 3
            r5 = 0
            ffud r1 = defpackage.ffqy.d(r11, r5, r5, r4, r1)
            r10.g = r7     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L7e
            r10.a = r8     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L7e
            r10.b = r1     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L7e
            r11 = 1
            r10.c = r11     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L7e
            java.lang.Object r11 = defpackage.kfj.a(r8, r10)     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L7e
            if (r11 == r0) goto L59
            r5 = r7
            r4 = r8
        L53:
            ppq r11 = (defpackage.ppq) r11     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L1a
            defpackage.ffub.a(r1)
            return r11
        L59:
            return r0
        L5a:
            java.lang.String r0 = defpackage.qbp.a     // Catch: java.lang.Throwable -> L7b
            ppr r2 = r10.d     // Catch: java.lang.Throwable -> L7b
            ppt r4 = defpackage.ppt.c()     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L7b
            r5.append(r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = " threw exception in startWork."
            r5.append(r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L7b
            r4.b(r0, r2, r11)     // Catch: java.lang.Throwable -> L7b
            throw r11     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            r11 = r0
            goto Lb9
        L7e:
            r0 = move-exception
            r11 = r0
            r5 = r7
            r4 = r8
        L82:
            java.lang.String r0 = defpackage.qbp.a     // Catch: java.lang.Throwable -> L7b
            ppr r6 = r10.d     // Catch: java.lang.Throwable -> L7b
            ppt r7 = defpackage.ppt.c()     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L7b
            r8.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = " was cancelled"
            r8.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L7b
            r7.b(r0, r3, r11)     // Catch: java.lang.Throwable -> L7b
            int r0 = r5.get()     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r4.isCancelled()     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto Lb8
            if (r0 == r2) goto Lb8
            qbd r11 = new qbd     // Catch: java.lang.Throwable -> L7b
            int r0 = r5.get()     // Catch: java.lang.Throwable -> L7b
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L7b
            throw r11     // Catch: java.lang.Throwable -> L7b
        Lb8:
            throw r11     // Catch: java.lang.Throwable -> L7b
        Lb9:
            defpackage.ffub.a(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        qbh qbhVar = new qbh(this.d, this.e, this.f, ffguVar);
        qbhVar.g = obj;
        return qbhVar;
    }
}
