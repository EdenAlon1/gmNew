package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fgaj {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ffxy r4, java.lang.Object r5, java.lang.Object r6, defpackage.ffgu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ffzx
            if (r0 == 0) goto L13
            r0 = r7
            ffzx r0 = (defpackage.ffzx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ffzx r0 = new ffzx
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)
            goto L3f
        L31:
            defpackage.ffci.b(r7)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.fQ(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            fgdu r4 = new fgdu
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgaj.a(ffxy, java.lang.Object, java.lang.Object, ffgu):java.lang.Object");
    }

    public static final ffxx b(ffxx ffxxVar, int i) {
        if (i > 0) {
            return new ffzz(ffxxVar, i);
        }
        throw new IllegalArgumentException(a.f(i, "Requested element count ", " should be positive"));
    }

    public static final ffxx c(ffxx ffxxVar, ffjn ffjnVar) {
        return new fgcp(new fgai(ffxxVar, ffjnVar, null));
    }
}
