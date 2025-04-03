package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzkf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eiyc b;
    final /* synthetic */ bzka c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzkf(eiyc eiycVar, bzka bzkaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eiycVar;
        this.c = bzkaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzkf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
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
            java.lang.String r2 = "Bugle.Gaia.Pairing.Disabled.When.Removing.Account.Failure.Count"
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 == r3) goto Lf
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            goto L4a
        Lf:
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            goto L34
        L13:
            r8 = move-exception
            goto L84
        L15:
            r8 = move-exception
            goto L8a
        L17:
            defpackage.ffci.b(r8)
            bzku r8 = defpackage.bzkv.a     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            eiyc r1 = r7.b     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            eizj r1 = (defpackage.eizj) r1     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            eisx r1 = r1.a     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            bzke r4 = new bzke     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            bzka r5 = r7.c     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r6 = 0
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r7.a = r3     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r3 = 4
            java.lang.Object r8 = r8.a(r1, r3, r4, r7)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            if (r8 != r0) goto L34
            goto L49
        L34:
            bzka$a r8 = (bzka.a) r8     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            bzic r8 = r8.aI()     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            eiyc r1 = r7.b     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            elfl r8 = r8.l(r1)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            r1 = 2
            r7.a = r1     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            if (r8 != r0) goto L4a
        L49:
            return r0
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            if (r8 == 0) goto L8f
            bzka r8 = r7.c     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            ffbr r8 = r8.c     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            akzt r8 = (defpackage.akzt) r8     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.String r0 = "Bugle.Gaia.Pairing.Disabled.When.Removing.Account.Success.Count"
            r8.c(r0)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            bzka r8 = r7.c     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            enru r8 = r8.e     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            ensk r8 = r8.h()     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            ensn r0 = defpackage.ente.a     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.String r1 = "BugleGDitto"
            r8.Y(r0, r1)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingOptOutManagerImpl$optOutFromGaiaPairing$3"
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r3 = "GaiaDevicePairingOptOutManagerImpl.kt"
            r4 = 145(0x91, float:2.03E-43)
            ensk r8 = r8.h(r0, r1, r4, r3)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            enrr r8 = (defpackage.enrr) r8     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            java.lang.String r0 = "Successfully disabled Gaia device pairing"
            r8.q(r0)     // Catch: java.lang.Throwable -> L13 defpackage.bzkv -> L15
            goto L8f
        L84:
            bzka r0 = r7.c
            r0.h(r2, r8)
            goto L8f
        L8a:
            bzka r0 = r7.c
            r0.g(r2, r8)
        L8f:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzkf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzkf(this.b, this.c, ffguVar);
    }
}
