package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdap extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ cdaq c;
    final /* synthetic */ ccvl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdap(Throwable th, cdaq cdaqVar, ccvl ccvlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = th;
        this.c = cdaqVar;
        this.d = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdap) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (defpackage.fgfz.c(r7, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (defpackage.fgfz.c(r7, r6) == r0) goto L31;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Lc
            goto L8e
        Lc:
            java.lang.Throwable r7 = r6.b
            boolean r1 = r7 instanceof defpackage.csgy
            java.lang.String r3 = "Error in CmsUpdaterOutcomeHandler"
            if (r1 != 0) goto L56
            entd r7 = defpackage.cdaq.a
            java.lang.Throwable r7 = r6.b
            boolean r1 = r7 instanceof defpackage.fedn
            if (r1 != 0) goto L8e
            boolean r1 = r7 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L24
            r1 = r7
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 != 0) goto L2c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r7)
        L2c:
            cdaq r7 = r6.c
            ccvl r4 = r6.d
            ccwu r5 = new ccwu
            java.lang.String r7 = r7.f
            r5.<init>(r7, r4, r1)
            cdaq r7 = r6.c
            asjt r7 = r7.d
            boolean r7 = r7.a()
            if (r7 != 0) goto L52
            cdaq r7 = r6.c
            cfyt r7 = r7.c
            elfl r7 = r7.b(r5)
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 != r0) goto L8e
            goto L88
        L52:
            defpackage.crze.c(r3, r5)
            goto L8e
        L56:
            csgy r7 = (defpackage.csgy) r7
            ccvl r1 = r6.d
            int r7 = r7.a()
            int r7 = r7 + (-1)
            r4 = 2
            if (r7 == r2) goto L66
            if (r7 == r4) goto L6c
            goto L8e
        L66:
            ccvt r7 = r1.b
            int r7 = r7.c
            if (r7 != 0) goto L8e
        L6c:
            cdaq r7 = r6.c
            asjt r7 = r7.d
            boolean r7 = r7.a()
            if (r7 != 0) goto L89
            cdaq r7 = r6.c
            java.lang.Throwable r1 = r6.b
            cfyt r7 = r7.c
            elfl r7 = r7.b(r1)
            r6.a = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 != r0) goto L8e
        L88:
            return r0
        L89:
            java.lang.Throwable r7 = r6.b
            defpackage.crze.c(r3, r7)
        L8e:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdap.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdap(this.b, this.c, this.d, ffguVar);
    }
}
