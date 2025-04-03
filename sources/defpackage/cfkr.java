package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfkr extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cfks d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfkr(cfks cfksVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cfksVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfkr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r8.c(r1, r2, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if (r8 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[SYNTHETIC] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            defpackage.ffci.b(r8)     // Catch: defpackage.cflh -> L11
            goto La3
        L11:
            r8 = move-exception
            goto L96
        L14:
            java.lang.Object r1 = r7.b
            java.lang.Object r3 = r7.a
            defpackage.ffci.b(r8)
            goto L4f
        L1c:
            defpackage.ffci.b(r8)
            goto L3a
        L20:
            defpackage.ffci.b(r8)
            cskc r8 = defpackage.cfks.a
            java.lang.String r1 = "Ending Heavy Work"
            r8.p(r1)
            cfks r8 = r7.d
            cfkw r8 = r8.c
            comc r8 = r8.a()
            r7.c = r3
            java.lang.Object r8 = r8.c(r7)
            if (r8 == r0) goto Lb0
        L3a:
            cflb r8 = (defpackage.cflb) r8
            eygr r8 = r8.d
            r8.getClass()
            cfks r1 = r7.d
            java.util.Set r3 = defpackage.ffdx.ar(r8)
            java.util.Set r8 = r1.b
            enpd r8 = (defpackage.enpd) r8
            enqu r1 = r8.listIterator()
        L4f:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r1.next()
            cflo r8 = (defpackage.cflo) r8
            cskc r4 = defpackage.cfks.a
            csjb r4 = r4.c()
            java.lang.String r5 = "Unpausing agent"
            r4.I(r5)
            java.lang.String r5 = r8.a()
            java.lang.String r6 = "agent"
            r4.A(r6, r5)
            r4.r()
            r7.a = r3
            r7.b = r1
            r7.c = r2
            java.lang.Object r8 = r8.c()
            if (r8 != r0) goto L4f
            goto Lb0
        L7f:
            cfks r8 = r7.d     // Catch: defpackage.cflh -> L11
            cflm r8 = r8.d     // Catch: defpackage.cflh -> L11
            cfla r1 = defpackage.cfla.STOPPING     // Catch: defpackage.cflh -> L11
            cfla r2 = defpackage.cfla.NONE     // Catch: defpackage.cflh -> L11
            r3 = 0
            r7.a = r3     // Catch: defpackage.cflh -> L11
            r7.b = r3     // Catch: defpackage.cflh -> L11
            r3 = 3
            r7.c = r3     // Catch: defpackage.cflh -> L11
            java.lang.Object r8 = r8.c(r1, r2, r7)     // Catch: defpackage.cflh -> L11
            if (r8 != r0) goto La3
            goto Lb0
        L96:
            cfla r0 = r8.a
            cfla r1 = defpackage.cfla.RESTARTING
            if (r0 != r1) goto Laf
            cskc r8 = defpackage.cfks.a
            java.lang.String r0 = "Not setting status to NONE; Heavy Work is restarting"
            r8.p(r0)
        La3:
            cskc r8 = defpackage.cfks.a
            java.lang.String r0 = "Ended Heavy Work"
            r8.p(r0)
            ceyt r8 = defpackage.ceyt.i()
            return r8
        Laf:
            throw r8
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfkr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfkr(this.d, ffguVar);
    }
}
