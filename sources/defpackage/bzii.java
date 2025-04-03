package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzii extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ bzid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzii(bzid bzidVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = bzidVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzii) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (r8 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r7.a
            defpackage.ffci.b(r8)
            goto L66
        Lf:
            defpackage.ffci.b(r8)
            goto L30
        L13:
            defpackage.ffci.b(r8)
            bzid r8 = r7.c
            ffbr r8 = r8.b
            java.lang.Object r8 = r8.b()
            eixo r8 = (defpackage.eixo) r8
            bzid r1 = r7.c
            eisx r1 = r1.a
            com.google.common.util.concurrent.ListenableFuture r8 = r8.c(r1)
            r7.b = r2
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 == r0) goto Led
        L30:
            eixn r8 = (defpackage.eixn) r8
            eixz r1 = r8.b()
            java.lang.String r1 = r1.k
            java.lang.String r2 = "pseudonymous"
            boolean r1 = defpackage.ffkj.e(r1, r2)
            if (r1 == 0) goto L42
            r8 = 0
            return r8
        L42:
            eixz r8 = r8.b()
            java.lang.String r8 = r8.g
            r8.getClass()
            bzid r1 = r7.c
            ffbr r1 = r1.c
            java.lang.Object r1 = r1.b()
            bzgw r1 = (defpackage.bzgw) r1
            elfl r1 = r1.c()
            r7.a = r8
            r2 = 2
            r7.b = r2
            java.lang.Object r1 = defpackage.fgfz.c(r1, r7)
            if (r1 == r0) goto Led
            r0 = r8
            r8 = r1
        L66:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$enablePairing$1"
            java.lang.String r3 = "GaiaDevicePairingManagerDelegateImpl.kt"
            java.lang.String r4 = "BugleGDitto"
            if (r8 == 0) goto Lc3
            int r5 = r8.length()
            if (r5 <= 0) goto Lc3
            boolean r5 = defpackage.ffkj.e(r8, r0)
            if (r5 == 0) goto La1
            bzid r0 = r7.c
            enru r0 = r0.l
            ensk r0 = r0.h()
            ensn r5 = defpackage.ente.a
            r0.Y(r5, r4)
            r4 = 452(0x1c4, float:6.33E-43)
            ensk r0 = r0.h(r2, r1, r4, r3)
            enrr r0 = (defpackage.enrr) r0
            bzid r1 = r7.c
            eisx r1 = r1.a
            java.lang.String r2 = "No need to enable the Gaia pairing, as it is already on, accountId = %s"
            java.lang.String r1 = r1.toString()
            r0.t(r2, r1)
            return r8
        La1:
            bzid r8 = r7.c
            enru r8 = r8.l
            ensk r8 = r8.j()
            ensn r5 = defpackage.ente.a
            r8.Y(r5, r4)
            r5 = 460(0x1cc, float:6.45E-43)
            ensk r8 = r8.h(r2, r1, r5, r3)
            enrr r8 = (defpackage.enrr) r8
            bzid r5 = r7.c
            eisx r5 = r5.a
            java.lang.String r6 = "Enable the Gaia pairing for another account, accountId = %s"
            java.lang.String r5 = r5.toString()
            r8.t(r6, r5)
        Lc3:
            bzid r8 = r7.c
            ffbr r8 = r8.c
            java.lang.Object r8 = r8.b()
            bzgw r8 = (defpackage.bzgw) r8
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r8.l(r5)
            bzid r8 = r7.c
            enru r8 = r8.l
            ensk r8 = r8.h()
            ensn r5 = defpackage.ente.a
            r8.Y(r5, r4)
            r4 = 467(0x1d3, float:6.54E-43)
            ensk r8 = r8.h(r2, r1, r4, r3)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r1 = "Gaia device pairing has been enabled"
            r8.q(r1)
        Led:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzii.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzii(this.c, ffguVar);
    }
}
