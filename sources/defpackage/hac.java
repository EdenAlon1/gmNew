package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hac extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ fgcm c;
    final /* synthetic */ gvi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hac(fgcm fgcmVar, gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fgcmVar;
        this.d = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hac) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (defpackage.ffyk.b(r6, r4, r5) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r6.a(r1, r5) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (defpackage.ffyk.b(r1, r4, r5) == r0) goto L27;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.ffci.b(r6)
            goto L50
        L11:
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r6)
            goto L71
        L17:
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L1b
            goto L36
        L1b:
            r6 = move-exception
            goto L53
        L1d:
            defpackage.ffci.b(r6)
            fgcm r6 = r5.c     // Catch: java.lang.Throwable -> L1b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1b
            r6.h(r1)     // Catch: java.lang.Throwable -> L1b
            gvi r6 = r5.d     // Catch: java.lang.Throwable -> L1b
            dhy r1 = defpackage.dhy.c     // Catch: java.lang.Throwable -> L1b
            r5.b = r4     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r6 = r6.a(r1, r5)     // Catch: java.lang.Throwable -> L1b
            if (r6 != r0) goto L36
            goto L6f
        L36:
            gvi r6 = r5.d
            boolean r6 = r6.c()
            if (r6 == 0) goto L50
            fgcm r6 = r5.c
            gvi r1 = r5.d
            hab r4 = new hab
            r4.<init>(r1, r2)
            r5.b = r3
            java.lang.Object r6 = defpackage.ffyk.b(r6, r4, r5)
            if (r6 != r0) goto L50
            goto L6f
        L50:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L53:
            gvi r1 = r5.d
            boolean r1 = r1.c()
            if (r1 == 0) goto L70
            fgcm r1 = r5.c
            gvi r3 = r5.d
            hab r4 = new hab
            r4.<init>(r3, r2)
            r5.a = r6
            r2 = 3
            r5.b = r2
            java.lang.Object r1 = defpackage.ffyk.b(r1, r4, r5)
            if (r1 != r0) goto L70
        L6f:
            return r0
        L70:
            r0 = r6
        L71:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hac.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new hac(this.c, this.d, ffguVar);
    }
}
