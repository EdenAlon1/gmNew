package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlj {
    public static final ffji a = dkz.a;
    public static final ffji b = dlb.a;
    private static final cyj c = new cyj(new dlc());

    public static final dtt a(dly dlyVar, jzn jznVar, ffji ffjiVar, cxt cxtVar) {
        return new dvq(new dla(dlyVar, ffjiVar, new dld(jznVar)), c, cxtVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ffix r4, defpackage.ffjm r5, defpackage.ffgu r6) {
        /*
            boolean r0 = r6 instanceof defpackage.dle
            if (r0 == 0) goto L13
            r0 = r6
            dle r0 = (defpackage.dle) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dle r0 = new dle
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)     // Catch: defpackage.dkv -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ffci.b(r6)
            dli r6 = new dli     // Catch: defpackage.dkv -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: defpackage.dkv -> L41
            r0.b = r3     // Catch: defpackage.dkv -> L41
            java.lang.Object r4 = defpackage.ffsl.a(r6, r0)     // Catch: defpackage.dkv -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlj.b(ffix, ffjm, ffgu):java.lang.Object");
    }
}
