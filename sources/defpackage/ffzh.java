package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzh implements ffxx {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffxx b;

    public ffzh(ffjm ffjmVar, ffxx ffxxVar) {
        this.a = ffjmVar;
        this.b = ffxxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r7.a(r2, r0) != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ffzg
            if (r0 == 0) goto L13
            r0 = r8
            ffzg r0 = (defpackage.ffzg) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ffzg r0 = new ffzg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L72
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            fgfi r7 = r0.f
            java.lang.Object r2 = r0.d
            ffzh r4 = r0.e
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5d
        L3c:
            r8 = move-exception
            goto L7a
        L3e:
            defpackage.ffci.b(r8)
            fgfi r8 = new fgfi
            ffhd r2 = r0.u()
            r8.<init>(r7, r2)
            ffjm r2 = r6.a     // Catch: java.lang.Throwable -> L76
            r0.e = r6     // Catch: java.lang.Throwable -> L76
            r0.d = r7     // Catch: java.lang.Throwable -> L76
            r0.f = r8     // Catch: java.lang.Throwable -> L76
            r0.b = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r2.a(r8, r0)     // Catch: java.lang.Throwable -> L76
            if (r2 == r1) goto L75
            r4 = r6
            r2 = r7
            r7 = r8
        L5d:
            r7.g()
            ffxx r7 = r4.b
            r8 = 0
            r0.e = r8
            r0.d = r8
            r0.f = r8
            r0.b = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L72
            goto L75
        L72:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L75:
            return r1
        L76:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L7a:
            r7.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffzh.a(ffxy, ffgu):java.lang.Object");
    }
}
