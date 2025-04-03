package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvdp b;
    final /* synthetic */ ResolvedRecipient c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdo(ffgu ffguVar, cvdp cvdpVar, ResolvedRecipient resolvedRecipient) {
        super(2, ffguVar);
        this.b = cvdpVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvdo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (r6.c == 1) goto L23;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> Lc
            goto L39
        Lc:
            r6 = move-exception
            goto L59
        Le:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            ffsk r6 = (defpackage.ffsk) r6
            com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest r6 = new com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest
            r6.<init>()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r5.c
            com.google.android.gms.duokit.DuoId r1 = defpackage.cvdp.i(r1)
            r6.a = r1
            cvfb r1 = defpackage.cvfb.a
            java.lang.String r1 = r1.d
            r6.b = r1
            cvdp r1 = r5.b     // Catch: java.lang.Exception -> Lc
            dgea r1 = r1.b     // Catch: java.lang.Exception -> Lc
            dhre r6 = r1.b(r6)     // Catch: java.lang.Exception -> Lc
            r5.a = r2     // Catch: java.lang.Exception -> Lc
            java.lang.Object r6 = defpackage.axpj.a(r6, r5)     // Catch: java.lang.Exception -> Lc
            if (r6 != r0) goto L39
            return r0
        L39:
            com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse r6 = (com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse) r6     // Catch: java.lang.Exception -> Lc
            com.google.android.gms.duokit.RemoteUserReachability r6 = r6.a     // Catch: java.lang.Exception -> Lc
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = r5.c     // Catch: java.lang.Exception -> Lc
            aqry r0 = r0.m()     // Catch: java.lang.Exception -> Lc
            r1 = r0
            aqrv r1 = (defpackage.aqrv) r1     // Catch: java.lang.Exception -> Lc
            boolean r1 = r1.a     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto L7f
            aqrv r0 = (defpackage.aqrv) r0     // Catch: java.lang.Exception -> Lc
            boolean r0 = r0.b     // Catch: java.lang.Exception -> Lc
            if (r0 != 0) goto L7f
            int r0 = r6.b     // Catch: java.lang.Exception -> Lc
            if (r0 != r2) goto L7f
            int r6 = r6.c     // Catch: java.lang.Exception -> Lc
            if (r6 != r2) goto L7f
            goto L80
        L59:
            enru r0 = defpackage.cvdp.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "Bugle"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r6 = r0.g(r6)
            java.lang.String r0 = "invokeSuspend"
            r1 = 142(0x8e, float:1.99E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/BugleVideoCalling2$shouldSendDuoInviteLink$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "BugleVideoCalling2.kt"
            ensk r6 = r6.h(r2, r0, r1, r4)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r0 = "lookupReachability failed"
            r6.q(r0)
        L7f:
            r2 = r3
        L80:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvdo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvdo cvdoVar = new cvdo(ffguVar, this.b, this.c);
        cvdoVar.d = obj;
        return cvdoVar;
    }
}
