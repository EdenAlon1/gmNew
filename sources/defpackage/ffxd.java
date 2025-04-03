package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffxd {
    public static final ffxg a(ffsk ffskVar, ffhd ffhdVar, int i, ffjm ffjmVar) {
        return c(ffskVar, ffhdVar, i, 1, ffsm.a, ffjmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ffxe r4, defpackage.ffix r5, defpackage.ffgu r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ffxb
            if (r0 == 0) goto L13
            r0 = r6
            ffxb r0 = (defpackage.ffxb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ffxb r0 = new ffxb
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r4 = move-exception
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ffci.b(r6)
            ffhd r6 = r0.u()
            ffuc r2 = defpackage.ffud.c
            ffha r6 = r6.get(r2)
            if (r6 != r4) goto L6d
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            ffrh r6 = new ffrh     // Catch: java.lang.Throwable -> L29
            ffgu r0 = defpackage.ffhi.c(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            r6.B()     // Catch: java.lang.Throwable -> L29
            ffxc r0 = new ffxc     // Catch: java.lang.Throwable -> L29
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L29
            ffwm r4 = r4.b     // Catch: java.lang.Throwable -> L29
            r4.d(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.m()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L63
            return r1
        L63:
            r5.invoke()
            ffcu r4 = defpackage.ffcu.a
            return r4
        L69:
            r5.invoke()
            throw r4
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffxd.b(ffxe, ffix, ffgu):java.lang.Object");
    }

    public static final ffxg c(ffsk ffskVar, ffhd ffhdVar, int i, int i2, ffsm ffsmVar, ffjm ffjmVar) {
        ffxe ffxeVar = new ffxe(ffsa.b(ffskVar, ffhdVar), ffwp.a(i, i2, 4));
        ffsmVar.a(ffjmVar, ffxeVar, ffxeVar);
        return ffxeVar;
    }
}
