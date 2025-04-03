package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cyqp b;
    final /* synthetic */ DetailsPageE2eeInfoRequest c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyqo(ffgu ffguVar, cyqp cyqpVar, DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest) {
        super(2, ffguVar);
        this.b = cyqpVar;
        this.c = detailsPageE2eeInfoRequest;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyqo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r8 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ejuh] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto Le
            defpackage.ffci.b(r8)
            goto L95
        Le:
            java.lang.Object r1 = r7.d
            ejuh r1 = (defpackage.ejuh) r1
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L16
            goto L46
        L16:
            r8 = move-exception
            goto L49
        L18:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.d
            ffsk r8 = (defpackage.ffsk) r8
            cyqp r8 = r7.b
            ffbr r8 = r8.f
            java.lang.Object r8 = r8.b()
            capp r8 = (defpackage.capp) r8
            com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest r1 = r7.c
            ejuh r1 = r8.a(r1)
            cyqp r8 = r7.b     // Catch: java.lang.Exception -> L16
            ejvb r8 = r8.e     // Catch: java.lang.Exception -> L16
            ejwa r3 = defpackage.ejwa.DONT_CARE     // Catch: java.lang.Exception -> L16
            com.google.common.util.concurrent.ListenableFuture r8 = r8.b(r1, r3)     // Catch: java.lang.Exception -> L16
            r8.getClass()     // Catch: java.lang.Exception -> L16
            r7.d = r1     // Catch: java.lang.Exception -> L16
            r7.a = r2     // Catch: java.lang.Exception -> L16
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)     // Catch: java.lang.Exception -> L16
            if (r8 == r0) goto L94
        L46:
            capl r8 = (defpackage.capl) r8     // Catch: java.lang.Exception -> L16
            return r8
        L49:
            enru r2 = defpackage.cyqp.a
            ensk r2 = r2.j()
            ensn r3 = defpackage.ente.a
            java.lang.String r4 = "BugleCdp"
            r2.Y(r3, r4)
            enrr r2 = (defpackage.enrr) r2
            ensk r2 = r2.g(r8)
            java.lang.String r3 = "invokeSuspend"
            r4 = 221(0xdd, float:3.1E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/ui/conversation/details/encryption/e2eestatus/E2eeStatusUiAdapterImpl$getE2eeInfo$$inlined$asyncPropagatingLegacy$default$1"
            java.lang.String r6 = "E2eeStatusUiAdapterImpl.kt"
            ensk r2 = r2.h(r5, r3, r4, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r3 = "Failed to retrieve E2eeInfo as future"
            r2.q(r3)
            boolean r2 = r8 instanceof java.lang.IllegalStateException
            if (r2 != 0) goto L7d
            boolean r2 = r8 instanceof defpackage.capq
            if (r2 != 0) goto L7d
            boolean r2 = r8 instanceof java.util.concurrent.ExecutionException
            if (r2 == 0) goto L7c
            goto L7d
        L7c:
            throw r8
        L7d:
            erph r8 = r1.a()
            erqc r8 = r8.g()
            r8.getClass()
            r1 = 0
            r7.d = r1
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 != r0) goto L95
        L94:
            return r0
        L95:
            ejug r8 = (defpackage.ejug) r8
            java.lang.Object r8 = r8.e()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyqo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cyqo cyqoVar = new cyqo(ffguVar, this.b, this.c);
        cyqoVar.d = obj;
        return cyqoVar;
    }
}
