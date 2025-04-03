package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dqkf {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(defpackage.dqki r6, int r7, defpackage.ffgu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dqkg
            if (r0 == 0) goto L13
            r0 = r8
            dqkg r0 = (defpackage.dqkg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqkg r0 = new dqkg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r8)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.a
            dqki r6 = (defpackage.dqki) r6
            defpackage.ffci.b(r8)
            goto L49
        L3c:
            defpackage.ffci.b(r8)
            r0.a = r6
            r0.c = r4
            java.lang.Object r8 = r6.c(r7, r0)
            if (r8 == r1) goto L5d
        L49:
            r0.a = r8
            r0.c = r3
            java.lang.Object r6 = r6.h()
            if (r6 != r1) goto L54
            goto L5d
        L54:
            r5 = r8
            r8 = r6
            r6 = r5
        L57:
            ffcf r7 = new ffcf
            r7.<init>(r6, r8)
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqkf.a(dqki, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object b(defpackage.dqki r4, int r5, defpackage.ffgu r6) {
        /*
            boolean r0 = r6 instanceof defpackage.dqkh
            if (r0 == 0) goto L13
            r0 = r6
            dqkh r0 = (defpackage.dqkh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dqkh r0 = new dqkh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dqjz r4 = r0.c
            defpackage.ffci.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r6)
            r6 = r4
            dqjz r6 = (defpackage.dqjz) r6
            r0.c = r6
            r0.b = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            dqjz r4 = (defpackage.dqjz) r4
            fgcl r5 = r4.i
            fgcl r4 = r4.d()
            ffcl r0 = new ffcl
            r0.<init>(r6, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqkf.b(dqki, int, ffgu):java.lang.Object");
    }
}
