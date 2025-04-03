package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aifg implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ aidv b;

    public aifg(ffxy ffxyVar, aidv aidvVar) {
        this.a = ffxyVar;
        this.b = aidvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aiff
            if (r0 == 0) goto L13
            r0 = r9
            aiff r0 = (defpackage.aiff) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aiff r0 = new aiff
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r9)
            goto L70
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            java.util.List r8 = (java.util.List) r8
            aidv r2 = r7.b
            boolean r4 = r8 instanceof java.util.Collection
            r5 = 0
            if (r4 == 0) goto L44
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L44
            goto L63
        L44:
            java.util.Iterator r8 = r8.iterator()
        L48:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L63
            java.lang.String r4 = r2.a
            java.lang.Object r6 = r8.next()
            eei r6 = (defpackage.eei) r6
            java.lang.Object r6 = r6.d
            java.lang.String r6 = r6.toString()
            boolean r4 = defpackage.ffkj.e(r6, r4)
            if (r4 == 0) goto L48
            r5 = r3
        L63:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r0.b = r3
            java.lang.Object r8 = r9.fQ(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aifg.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
