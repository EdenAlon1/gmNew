package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lcz {
    private final fgjb a = new fgjf();
    public final ffrp c = new ffrq();

    protected abstract Object a(ffgu ffguVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:25:0x0064, B:27:0x006f, B:30:0x0075), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:25:0x0064, B:27:0x006f, B:30:0x0075), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lcy
            if (r0 == 0) goto L13
            r0 = r7
            lcy r0 = (defpackage.lcy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lcy r0 = new lcy
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            fgjf r1 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L2f
            goto L89
        L2f:
            r7 = move-exception
            goto L9e
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            fgjf r2 = r0.e
            java.lang.Object r4 = r0.a
            defpackage.ffci.b(r7)
            r7 = r2
            goto L64
        L43:
            defpackage.ffci.b(r7)
            ffrp r7 = r6.c
            boolean r7 = r7.y()
            if (r7 == 0) goto L51
            ffcu r7 = defpackage.ffcu.a
            return r7
        L51:
            fgjb r7 = r6.a
            r0.a = r6
            r2 = r7
            fgjf r2 = (defpackage.fgjf) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r7.a(r5, r0)
            if (r2 != r1) goto L63
            goto L9a
        L63:
            r4 = r6
        L64:
            r2 = r4
            lcz r2 = (defpackage.lcz) r2     // Catch: java.lang.Throwable -> L9b
            ffrp r2 = r2.c     // Catch: java.lang.Throwable -> L9b
            boolean r2 = r2.y()     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L75
            ffcu r0 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L9b
            r7.b(r5)
            return r0
        L75:
            r0.a = r4     // Catch: java.lang.Throwable -> L9b
            r2 = r7
            fgjf r2 = (defpackage.fgjf) r2     // Catch: java.lang.Throwable -> L9b
            r0.e = r2     // Catch: java.lang.Throwable -> L9b
            r0.d = r3     // Catch: java.lang.Throwable -> L9b
            r2 = r4
            lcz r2 = (defpackage.lcz) r2     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L9b
            if (r0 == r1) goto L9a
            r1 = r7
            r0 = r4
        L89:
            lcz r0 = (defpackage.lcz) r0     // Catch: java.lang.Throwable -> L2f
            ffrp r7 = r0.c     // Catch: java.lang.Throwable -> L2f
            ffcu r0 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L2f
            ffuq r7 = (defpackage.ffuq) r7     // Catch: java.lang.Throwable -> L2f
            r7.S(r0)     // Catch: java.lang.Throwable -> L2f
            r1.b(r5)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L9a:
            return r1
        L9b:
            r0 = move-exception
            r1 = r7
            r7 = r0
        L9e:
            r1.b(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcz.b(ffgu):java.lang.Object");
    }
}
