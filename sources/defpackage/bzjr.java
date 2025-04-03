package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjr(bzjx bzjxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzjxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzjr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        r9 = r8.b.i.h();
        r9.Y(defpackage.ente.a, "BugleGDitto");
        ((defpackage.enrr) r9.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$handleClickSwitchToGaia$1", "invokeSuspend", 86, "GaiaDevicePairingManagerImpl.kt")).q("No GAIA account is signed in.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
    
        r9 = r8.b.i.h();
        r9.Y(defpackage.ente.a, "BugleGDitto");
        ((defpackage.enrr) r9.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$handleClickSwitchToGaia$1", "invokeSuspend", 89, "GaiaDevicePairingManagerImpl.kt")).q("GAIA account has signed in.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (defpackage.fgfz.c(r9, r8) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005f, code lost:
    
        if (r9 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        if (defpackage.ffkj.e(((defpackage.eixn) r9).b().k, "pseudonymous") == false) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 0
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$handleClickSwitchToGaia$1"
            java.lang.String r5 = "GaiaDevicePairingManagerImpl.kt"
            java.lang.String r6 = "BugleGDitto"
            r7 = 1
            defpackage.ffci.b(r9)
            if (r1 == 0) goto L16
            if (r1 == r7) goto L46
            goto L62
        L16:
            bzjx r9 = r8.b
            enru r9 = r9.i
            ensk r9 = r9.e()
            ensn r1 = defpackage.ente.a
            r9.Y(r1, r6)
            r1 = 81
            ensk r9 = r9.h(r4, r3, r1, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r1 = "re-enable auto-enable gaia pairing."
            r9.q(r1)
            bzjx r9 = r8.b
            ffbr r9 = r9.c
            java.lang.Object r9 = r9.b()
            bzgw r9 = (defpackage.bzgw) r9
            elfl r9 = r9.i(r2)
            r8.a = r7
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 == r0) goto Lb0
        L46:
            bzjx r9 = r8.b
            ffbr r9 = r9.b
            java.lang.Object r9 = r9.b()
            eixo r9 = (defpackage.eixo) r9
            bzjx r1 = r8.b
            eisx r1 = r1.a
            com.google.common.util.concurrent.ListenableFuture r9 = r9.c(r1)
            r1 = 2
            r8.a = r1
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 != r0) goto L62
            goto Lb0
        L62:
            eixn r9 = (defpackage.eixn) r9
            eixz r9 = r9.b()
            java.lang.String r9 = r9.k
            java.lang.String r0 = "pseudonymous"
            boolean r9 = defpackage.ffkj.e(r9, r0)
            if (r9 == 0) goto L91
            bzjx r9 = r8.b
            enru r9 = r9.i
            ensk r9 = r9.h()
            ensn r0 = defpackage.ente.a
            r9.Y(r0, r6)
            r0 = 86
            ensk r9 = r9.h(r4, r3, r0, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "No GAIA account is signed in."
            r9.q(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        L91:
            bzjx r9 = r8.b
            enru r9 = r9.i
            ensk r9 = r9.h()
            ensn r0 = defpackage.ente.a
            r9.Y(r0, r6)
            r0 = 89
            ensk r9 = r9.h(r4, r3, r0, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "GAIA account has signed in."
            r9.q(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzjr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzjr(this.b, ffguVar);
    }
}
