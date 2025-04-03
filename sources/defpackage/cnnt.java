package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnnt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnnv b;
    final /* synthetic */ aoku c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnnt(ffgu ffguVar, cnnv cnnvVar, aoku aokuVar, int i) {
        super(2, ffguVar);
        this.b = cnnvVar;
        this.c = aokuVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnnt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            java.lang.Object r0 = r6.e
            bseh r0 = (defpackage.bseh) r0
            defpackage.ffci.b(r7)
            goto L5e
        L11:
            defpackage.ffci.b(r7)
            goto L3e
        L15:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.e
            ffsk r7 = (defpackage.ffsk) r7
            cnnv r7 = r6.b
            aoku r1 = r6.c
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r1 = r7.a(r1)
            java.lang.String r3 = r1.U()
            cnnu r4 = new cnnu
            r4.<init>(r1)
            ayif r7 = r7.b
            elfl r7 = r7.m(r3, r4)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto Leb
        L3e:
            int r1 = r6.d
            bseh r7 = (defpackage.bseh) r7
            r2 = 9
            if (r1 != r2) goto L74
            int r1 = r7.m()
            int r3 = r6.d
            if (r1 == r3) goto L74
            cnnv r1 = r6.b
            r6.e = r7
            r2 = 2
            r6.a = r2
            java.lang.Object r1 = r1.d(r6)
            if (r1 != r0) goto L5d
            goto Leb
        L5d:
            r0 = r7
        L5e:
            cnnv r7 = r6.b
            ffbr r7 = r7.c
            java.lang.Object r7 = r7.b()
            bczy r7 = (defpackage.bczy) r7
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r0.C()
            bseh r7 = r7.r(r0)
            r7.getClass()
            return r7
        L74:
            aoku r0 = r6.c
            boolean r0 = defpackage.cnnv.f(r0)
            if (r0 == 0) goto Le7
            int r0 = r6.d
            if (r0 != 0) goto Le7
            cnnv r0 = r6.b
            r7.getClass()
            int r1 = r7.m()
            if (r1 != r2) goto Le6
            enru r1 = defpackage.cnnv.a
            ensk r1 = r1.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleSatellite"
            r1.Y(r2, r3)
            enrr r1 = (defpackage.enrr) r1
            ensn r2 = defpackage.csux.p
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r7.C()
            r1.Y(r2, r3)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations"
            r3 = 218(0xda, float:3.05E-43)
            java.lang.String r4 = "resumeEmergencyConversationIfDisabled"
            java.lang.String r5 = "EmergencyConversationOperations.kt"
            ensk r1 = r1.h(r2, r4, r3, r5)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "Resuming disabled emergency conversation"
            r1.q(r2)
            ffbr r1 = r0.c
            java.lang.Object r1 = r1.b()
            bczy r1 = (defpackage.bczy) r1
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = r7.C()
            java.lang.String[] r3 = defpackage.bsom.a
            bsoe r3 = new bsoe
            r3.<init>()
            r3.ap(r4)
            r4 = 0
            r3.A(r4)
            r1.W(r2, r3)
            ffbr r0 = r0.c
            java.lang.Object r0 = r0.b()
            bczy r0 = (defpackage.bczy) r0
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r7.C()
            bseh r7 = r0.r(r7)
            r7.getClass()
        Le6:
            return r7
        Le7:
            r7.getClass()
            return r7
        Leb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnnt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnnt cnntVar = new cnnt(ffguVar, this.b, this.c, this.d);
        cnntVar.e = obj;
        return cnntVar;
    }
}
