package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocm implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ oco b;

    public ocm(ffxy ffxyVar, oco ocoVar) {
        this.b = ocoVar;
        this.a = ffxyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (r8.fQ(r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (defpackage.fgbj.d(r9, r5, r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ocl
            if (r0 == 0) goto L13
            r0 = r9
            ocl r0 = (defpackage.ocl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ocl r0 = new ocl
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.ffci.b(r9)
            goto L9f
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.e
            ffxy r8 = (defpackage.ffxy) r8
            java.lang.Object r2 = r0.d
            odk r2 = (defpackage.odk) r2
            defpackage.ffci.b(r9)
            goto L92
        L43:
            java.lang.Object r8 = r0.f
            java.lang.Object r2 = r0.e
            odk r2 = (defpackage.odk) r2
            java.lang.Object r5 = r0.d
            ocm r5 = (defpackage.ocm) r5
            defpackage.ffci.b(r9)
            goto L79
        L51:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            r2 = r8
            odk r2 = (defpackage.odk) r2
            oco r8 = r7.b
            fgcm r8 = r8.d
            java.lang.Object r8 = r8.c()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L91
            r0.d = r7
            r0.e = r2
            r0.f = r9
            r0.b = r5
            java.lang.Object r8 = defpackage.ffvt.a(r0)
            if (r8 == r1) goto L9e
            r5 = r7
            r8 = r9
        L79:
            oco r9 = r5.b
            fgcm r9 = r9.d
            och r5 = new och
            r5.<init>(r6)
            r0.d = r2
            r0.e = r8
            r0.f = r6
            r0.b = r4
            java.lang.Object r9 = defpackage.fgbj.d(r9, r5, r0)
            if (r9 == r1) goto L9e
            goto L92
        L91:
            r8 = r9
        L92:
            r0.d = r6
            r0.e = r6
            r0.b = r3
            java.lang.Object r8 = r8.fQ(r2, r0)
            if (r8 != r1) goto L9f
        L9e:
            return r1
        L9f:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocm.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
