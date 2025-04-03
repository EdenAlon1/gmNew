package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzkb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ bzka c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzkb(bzka bzkaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = bzkaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzkb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r1.f(r5, r4) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            java.lang.String r2 = "Bugle.Gaia.Pairing.Disabled.When.Setting.Up.Qr.Failure.Count"
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            goto L58
        Lf:
            r5 = move-exception
            goto L7b
        L11:
            r5 = move-exception
            goto L81
        L14:
            java.lang.Object r1 = r4.a
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L1a
            goto L3e
        L1a:
            r5 = move-exception
            goto L74
        L1c:
            defpackage.ffci.b(r5)
            bzkv r1 = new bzkv     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            r5 = 6
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            bzka r5 = r4.c     // Catch: java.lang.Throwable -> L1a
            ffbr r5 = r5.a     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L1a
            bzgw r5 = (defpackage.bzgw) r5     // Catch: java.lang.Throwable -> L1a
            elfl r5 = r5.c()     // Catch: java.lang.Throwable -> L1a
            r4.a = r1     // Catch: java.lang.Throwable -> L1a
            r4.b = r3     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)     // Catch: java.lang.Throwable -> L1a
            if (r5 != r0) goto L3e
            goto L57
        L3e:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L68
            int r1 = r5.length()     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            if (r1 != 0) goto L49
            goto L68
        L49:
            bzka r1 = r4.c     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            r3 = 0
            r4.a = r3     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            r3 = 2
            r4.b = r3     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            java.lang.Object r5 = r1.f(r5, r4)     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            if (r5 != r0) goto L58
        L57:
            return r0
        L58:
            bzka r5 = r4.c     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            ffbr r5 = r5.c     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            akzt r5 = (defpackage.akzt) r5     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            java.lang.String r0 = "Bugle.Gaia.Pairing.Disabled.When.Setting.Up.Qr.Success.Count"
            r5.c(r0)     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            goto L86
        L68:
            bzka r5 = r4.c     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            cskc r5 = r5.d     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            java.lang.String r0 = "Gaia pairing already inactive"
            r5.p(r0)     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            ffcu r5 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            return r5
        L74:
            bzkv r1 = (defpackage.bzkv) r1     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            java.lang.Throwable r5 = r1.initCause(r5)     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
            throw r5     // Catch: java.lang.Throwable -> Lf defpackage.bzkv -> L11
        L7b:
            bzka r0 = r4.c
            r0.h(r2, r5)
            goto L86
        L81:
            bzka r0 = r4.c
            r0.g(r2, r5)
        L86:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzkb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzkb(this.c, ffguVar);
    }
}
