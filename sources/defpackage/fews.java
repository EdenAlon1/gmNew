package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fews {
    private final ffix a;
    private final ffwm b = ffwp.a(-1, 0, 6);

    public fews(ffix ffixVar) {
        this.a = ffixVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fewr
            if (r0 == 0) goto L13
            r0 = r5
            fewr r0 = (defpackage.fewr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fewr r0 = new fewr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fews r2 = r0.d
            defpackage.ffci.b(r5)
            goto L35
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            r2 = r4
        L35:
            ffix r5 = r2.a
            java.lang.Object r5 = r5.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L50
            ffwm r5 = r2.b
            r0.d = r2
            r0.c = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L35
            return r1
        L50:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fews.a(ffgu):java.lang.Object");
    }

    public final void b() {
        Object b = this.b.b(ffcu.a);
        if (b instanceof ffwr) {
            Throwable b2 = ffws.b(b);
            if (b2 != null) {
                throw b2;
            }
            throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }
}
