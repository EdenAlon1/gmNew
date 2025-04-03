package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzhv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eiyc b;
    final /* synthetic */ bzhw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzhv(eiyc eiycVar, bzhw bzhwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eiycVar;
        this.c = bzhwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzhv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r7 != r0) goto L8;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L4b
            return r7
        Ld:
            enru r7 = defpackage.bzhw.a
            ensk r7 = r7.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r3 = "BugleGDitto"
            r7.Y(r1, r3)
            java.lang.String r1 = "invokeSuspend"
            r3 = 33
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaAccountCleanupInterceptor$cleanUpAccount$1"
            java.lang.String r5 = "GaiaAccountCleanupInterceptor.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            eiyc r1 = r6.b
            eizj r1 = (defpackage.eizj) r1
            eisx r1 = r1.a
            java.lang.String r3 = "Gaia cleanup account: accountId=%s"
            r7.t(r3, r1)
            bzhw r7 = r6.c
            ffbr r7 = r7.b
            java.lang.Object r7 = r7.b()
            bzjz r7 = (defpackage.bzjz) r7
            eiyc r1 = r6.b
            elfl r7 = r7.c(r1)
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto L68
        L4b:
            ffcu r7 = (defpackage.ffcu) r7
            bzhw r7 = r6.c
            ffbr r7 = r7.c
            java.lang.Object r7 = r7.b()
            cgfd r7 = (defpackage.cgfd) r7
            cgdz r1 = defpackage.cgdz.GSOS_UNINTENTIONALLY_SIGNED_OUT
            elfl r7 = r7.d(r1)
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 != r0) goto L67
            goto L68
        L67:
            return r7
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzhv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzhv(this.b, this.c, ffguVar);
    }
}
