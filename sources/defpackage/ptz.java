package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ptz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ pua b;
    final /* synthetic */ ppr c;
    final /* synthetic */ ppc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptz(pua puaVar, ppr pprVar, ppc ppcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = puaVar;
        this.c = pprVar;
        this.d = ppcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ptz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r10 != r0) goto L16;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            defpackage.ffci.b(r10)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L46
            return r10
        Ld:
            pua r10 = r9.b
            ppr r4 = r9.c
            ppc r6 = r9.d
            r9.a = r2
            java.lang.String r1 = defpackage.qau.a
            pyj r5 = r10.a
            boolean r1 = r5.s
            if (r1 == 0) goto L42
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L24
            goto L42
        L24:
            qbc r1 = r10.i
            android.content.Context r7 = r10.b
            java.util.concurrent.Executor r10 = r1.d
            r10.getClass()
            ffsd r10 = defpackage.fftu.b(r10)
            qat r3 = new qat
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r10 = defpackage.ffra.a(r10, r3, r9)
            ffhh r1 = defpackage.ffhh.a
            if (r10 == r1) goto L44
            ffcu r10 = defpackage.ffcu.a
            goto L44
        L42:
            ffcu r10 = defpackage.ffcu.a
        L44:
            if (r10 == r0) goto L75
        L46:
            pua r10 = r9.b
            java.lang.String r1 = defpackage.puc.a
            ppt r2 = defpackage.ppt.c()
            pyj r10 = r10.a
            java.lang.String r10 = r10.e
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r3 = "Starting work for "
            java.lang.String r10 = r3.concat(r10)
            r2.a(r1, r10)
            ppr r10 = r9.c
            com.google.common.util.concurrent.ListenableFuture r10 = r10.b()
            r10.getClass()
            ppr r1 = r9.c
            r2 = 2
            r9.a = r2
            java.lang.Object r10 = defpackage.puc.a(r10, r1, r9)
            if (r10 != r0) goto L74
            goto L75
        L74:
            return r10
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ptz(this.b, this.c, this.d, ffguVar);
    }
}
