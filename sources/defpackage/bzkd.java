package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzkd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eisx b;
    final /* synthetic */ bzka c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzkd(eisx eisxVar, bzka bzkaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eisxVar;
        this.c = bzkaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzkd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r8 == r0) goto L18;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            java.lang.String r2 = "Bugle.Gaia.Pairing.Disabled.When.Turning.On.Fi.Failure.Count"
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 == r3) goto Lf
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            goto L45
        Lf:
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            goto L30
        L13:
            r8 = move-exception
            goto L66
        L15:
            r8 = move-exception
            goto L6c
        L17:
            defpackage.ffci.b(r8)
            bzku r8 = defpackage.bzkv.a     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            eisx r1 = r7.b     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            bzkc r4 = new bzkc     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            bzka r5 = r7.c     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r6 = 0
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r7.a = r3     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r3 = 4
            java.lang.Object r8 = r8.a(r1, r3, r4, r7)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            if (r8 != r0) goto L30
            goto L44
        L30:
            bzka$a r8 = (bzka.a) r8     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            bzic r8 = r8.aI()     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r1 = 5
            elfl r8 = r8.i(r1)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r1 = 2
            r7.a = r1     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            if (r8 != r0) goto L45
        L44:
            return r0
        L45:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            if (r8 == 0) goto L71
            bzka r8 = r7.c     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            ffbr r8 = r8.c     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            akzt r8 = (defpackage.akzt) r8     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.String r0 = "Bugle.Gaia.Pairing.Disabled.When.Turning.On.Fi.Success.Count"
            r8.c(r0)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            bzka r8 = r7.c     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            cskc r8 = r8.d     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.String r0 = "Successfully disabled Gaia device pairing"
            r8.p(r0)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            goto L71
        L66:
            bzka r0 = r7.c
            r0.h(r2, r8)
            goto L71
        L6c:
            bzka r0 = r7.c
            r0.g(r2, r8)
        L71:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzkd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzkd(this.b, this.c, ffguVar);
    }
}
