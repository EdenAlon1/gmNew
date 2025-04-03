package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsm implements egsk {
    private final ebwq a;

    public egsm(ebwq ebwqVar) {
        ebwqVar.getClass();
        this.a = ebwqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.egsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.egsl
            if (r0 == 0) goto L13
            r0 = r6
            egsl r0 = (defpackage.egsl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            egsl r0 = new egsl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.ffci.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ebwq r6 = r4.a
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b(r5)
            r6.getClass()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L89
        L47:
            ebwn r6 = (defpackage.ebwn) r6
            if (r6 == 0) goto L81
            java.lang.String r0 = r6.d()
            if (r0 == 0) goto L79
            java.lang.String r1 = r6.b()
            if (r1 != 0) goto L5b
            java.lang.String r1 = r6.c()
        L5b:
            if (r1 == 0) goto L71
            java.lang.String r6 = r6.b()
            if (r6 == 0) goto L6b
            boolean r6 = defpackage.ffpc.J(r6)
            if (r6 == 0) goto L6a
            goto L6b
        L6a:
            r3 = 0
        L6b:
            egsj r6 = new egsj
            r6.<init>(r5, r0, r1, r3)
            return r6
        L71:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "GoogleOwner missing avatar"
            r5.<init>(r6)
            throw r5
        L79:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "GoogleOwner missing name"
            r5.<init>(r6)
            throw r5
        L81:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "GoogleOwner not on device"
            r5.<init>(r6)
            throw r5
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egsm.a(java.lang.String, ffgu):java.lang.Object");
    }
}
