package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnns extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnnv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnns(ffgu ffguVar, cnnv cnnvVar) {
        super(2, ffguVar);
        this.b = cnnvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnns) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a2, code lost:
    
        if (defpackage.fgfz.c(r7, r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r7 != r0) goto L9;
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
            if (r1 == 0) goto L12
            if (r1 == r2) goto Le
            defpackage.ffci.b(r7)
            goto La5
        Le:
            defpackage.ffci.b(r7)
            goto L2e
        L12:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.c
            ffsk r7 = (defpackage.ffsk) r7
            cnnv r7 = r6.b
            ayif r7 = r7.b
            java.lang.String r1 = "EMERGENCY+SERVICE+PROVIDER+DEMO"
            elfl r7 = r7.f(r1)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto La8
        L2e:
            j$.util.Optional r7 = (j$.util.Optional) r7
            boolean r1 = r7.isPresent()
            if (r1 == 0) goto La5
            enru r1 = defpackage.cnnv.a
            ensk r1 = r1.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleSatellite"
            r1.Y(r2, r3)
            enrr r1 = (defpackage.enrr) r1
            ensn r2 = defpackage.csux.p
            java.lang.Object r3 = r7.get()
            bseh r3 = (defpackage.bseh) r3
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r3.C()
            r1.Y(r2, r3)
            java.lang.String r2 = "invokeSuspend"
            r3 = 157(0x9d, float:2.2E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations$deleteEmergencyConversationDemoIfPresent$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "EmergencyConversationOperations.kt"
            ensk r1 = r1.h(r4, r2, r3, r5)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "Deleting emergency conversation demo"
            r1.q(r2)
            cnnv r1 = r6.b
            aygb r2 = defpackage.aygc.f()
            java.lang.Object r7 = r7.get()
            bseh r7 = (defpackage.bseh) r7
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r7.C()
            r2.b(r7)
            cnnv r7 = r6.b
            cqoh r7 = r7.e
            j$.time.Instant r7 = r7.f()
            long r3 = r7.toEpochMilli()
            r2.c(r3)
            eoko r7 = defpackage.eoko.UNKNOWN_BUGLE_CONVERSATION_ORIGIN
            r2.f(r7)
            aygc r7 = r2.a()
            ayfy r1 = r1.d
            elfl r7 = r1.a(r7)
            r7.getClass()
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 != r0) goto La5
            goto La8
        La5:
            ffcu r7 = defpackage.ffcu.a
            return r7
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnns.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnns cnnsVar = new cnns(ffguVar, this.b);
        cnnsVar.c = obj;
        return cnnsVar;
    }
}
