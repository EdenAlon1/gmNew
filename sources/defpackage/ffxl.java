package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffxl implements ffxx {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ffxk
            if (r0 == 0) goto L13
            r0 = r7
            ffxk r0 = (defpackage.ffxk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ffxk r0 = new ffxk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fgfi r6 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L4a
        L29:
            r7 = move-exception
            goto L55
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            fgfi r7 = new fgfi
            ffhd r2 = r0.u()
            r7.<init>(r6, r2)
            r0.d = r7     // Catch: java.lang.Throwable -> L51
            r0.c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L51
            if (r6 == r1) goto L50
            r6 = r7
        L4a:
            r6.g()
            ffcu r6 = defpackage.ffcu.a
            return r6
        L50:
            return r1
        L51:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L55:
            r6.g()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffxl.a(ffxy, ffgu):java.lang.Object");
    }

    public abstract Object b(ffxy ffxyVar, ffgu ffguVar);
}
