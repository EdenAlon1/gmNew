package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzkk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eisx b;
    final /* synthetic */ bzka c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzkk(eisx eisxVar, bzka bzkaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eisxVar;
        this.c = bzkaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzkk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (defpackage.fgfz.c(r7, r6) == r0) goto L16;
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L11
            goto L49
        Ld:
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L11
            goto L2c
        L11:
            r7 = move-exception
            goto L40
        L13:
            defpackage.ffci.b(r7)
            bzkp r7 = defpackage.bzkq.a     // Catch: java.lang.Throwable -> L11
            eisx r1 = r6.b     // Catch: java.lang.Throwable -> L11
            bzkj r3 = new bzkj     // Catch: java.lang.Throwable -> L11
            bzka r4 = r6.c     // Catch: java.lang.Throwable -> L11
            r5 = 0
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L11
            r6.a = r2     // Catch: java.lang.Throwable -> L11
            r2 = 3
            java.lang.Object r7 = r7.b(r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r0) goto L2c
            goto L3f
        L2c:
            bzka$a r7 = (bzka.a) r7     // Catch: java.lang.Throwable -> L11
            bzic r7 = r7.aI()     // Catch: java.lang.Throwable -> L11
            elfl r7 = r7.c()     // Catch: java.lang.Throwable -> L11
            r1 = 2
            r6.a = r1     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r0) goto L49
        L3f:
            return r0
        L40:
            bzka r0 = r6.c
            cskc r0 = r0.d
            java.lang.String r1 = "Error while switching Gaia device pairing"
            r0.s(r1, r7)
        L49:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzkk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzkk(this.b, this.c, ffguVar);
    }
}
