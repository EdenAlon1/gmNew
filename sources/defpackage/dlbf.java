package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbf {
    public final dlau a;
    private final dlas b;
    private final dlib c;

    public dlbf(dlas dlasVar, dlib dlibVar, dlau dlauVar) {
        dlibVar.getClass();
        this.b = dlasVar;
        this.c = dlibVar;
        this.a = dlauVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dlgb r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dlbd
            if (r0 == 0) goto L13
            r0 = r6
            dlbd r0 = (defpackage.dlbd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlbd r0 = new dlbd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            dlas r6 = r4.b
            boolean r6 = r6.d
            if (r6 != 0) goto L4c
            dlib r6 = r4.c
            dlia r5 = r6.a(r5)
            r0.c = r3
            java.lang.Object r6 = r5.d(r0)
            if (r6 == r1) goto L4b
        L46:
            if (r6 != 0) goto L49
            goto L4c
        L49:
            r3 = 0
            goto L4c
        L4b:
            return r1
        L4c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlbf.a(dlgb, ffgu):java.lang.Object");
    }

    public final Object b(dlgb dlgbVar, ffgu ffguVar) {
        Object a = ffsl.a(new dlbe(this, dlgbVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
