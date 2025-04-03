package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffzn implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ fflb b;

    public ffzn(ffxy ffxyVar, fflb fflbVar) {
        this.a = ffxyVar;
        this.b = fflbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ffzm
            if (r0 == 0) goto L13
            r0 = r6
            ffzm r0 = (defpackage.ffzm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ffzm r0 = new ffzm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ffzn r5 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r6 = move-exception
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            ffxy r6 = r4.a     // Catch: java.lang.Throwable -> L46
            r0.d = r4     // Catch: java.lang.Throwable -> L46
            r0.c = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r6.fQ(r5, r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L46:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L49:
            fflb r5 = r5.b
            r5.a = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffzn.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
