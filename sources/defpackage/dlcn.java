package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlcn implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ ffjm b;

    public dlcn(ffxy ffxyVar, ffjm ffjmVar) {
        this.a = ffxyVar;
        this.b = ffjmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r7.fQ(r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dlcm
            if (r0 == 0) goto L13
            r0 = r8
            dlcm r0 = (defpackage.dlcm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dlcm r0 = new dlcm
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L67
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.d
            java.lang.Object r2 = r0.c
            defpackage.ffci.b(r8)
            goto L51
        L3a:
            defpackage.ffci.b(r8)
            ffxy r8 = r6.a
            ffjm r2 = r6.b
            r0.c = r7
            r0.d = r8
            r0.b = r4
            java.lang.Object r2 = r2.a(r7, r0)
            if (r2 == r1) goto L6a
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L67
            r8 = 0
            r0.c = r8
            r0.d = r8
            r0.b = r3
            java.lang.Object r7 = r7.fQ(r2, r0)
            if (r7 != r1) goto L67
            goto L6a
        L67:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlcn.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
