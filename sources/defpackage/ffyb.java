package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffyb implements ffxx {
    final /* synthetic */ ffji a;

    public ffyb(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r6.fQ(r7, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ffya
            if (r0 == 0) goto L13
            r0 = r7
            ffya r0 = (defpackage.ffya) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ffya r0 = new ffya
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.d
            defpackage.ffci.b(r7)
            goto L47
        L38:
            defpackage.ffci.b(r7)
            ffji r7 = r5.a
            r0.d = r6
            r0.b = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 == r1) goto L56
        L47:
            r2 = 0
            r0.d = r2
            r0.b = r3
            java.lang.Object r6 = r6.fQ(r7, r0)
            if (r6 != r1) goto L53
            goto L56
        L53:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffyb.a(ffxy, ffgu):java.lang.Object");
    }
}
