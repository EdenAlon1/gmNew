package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajdl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdl(ajee ajeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajdl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
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
            if (r1 == r2) goto L4d
            return r7
        Ld:
            enru r7 = defpackage.ajee.a
            ensk r7 = r7.e()
            ensn r1 = defpackage.ente.a
            java.lang.String r3 = "BugleGemini"
            r7.Y(r1, r3)
            java.lang.String r1 = "invokeSuspend"
            r3 = 157(0x9d, float:2.2E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl$refreshInternal$2$1"
            java.lang.String r5 = "PenpalReauthenticateHandlerImpl.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r1 = "Refreshing OAuth2 token from conversation screen"
            r7.q(r1)
            ajee r7 = r6.b
            ffbr r7 = r7.m
            java.lang.Object r7 = r7.b()
            ejar r7 = (defpackage.ejar) r7
            ajee r1 = r6.b
            ffbr r1 = r1.i
            java.lang.Object r1 = r1.b()
            eisx r1 = (defpackage.eisx) r1
            com.google.common.util.concurrent.ListenableFuture r7 = r7.a(r1)
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto L70
        L4d:
            ajee r1 = r6.b
            android.accounts.Account r7 = (android.accounts.Account) r7
            ffbr r1 = r1.l
            java.lang.Object r1 = r1.b()
            dfad r1 = (defpackage.dfad) r1
            java.lang.String r2 = "oauth2:https://www.googleapis.com/auth/tachyon"
            android.os.Bundle r3 = defpackage.ajee.b
            dhre r7 = r1.c(r7, r2, r3)
            com.google.common.util.concurrent.ListenableFuture r7 = defpackage.duin.a(r7)
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 != r0) goto L6f
            goto L70
        L6f:
            return r7
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajdl(this.b, ffguVar);
    }
}
