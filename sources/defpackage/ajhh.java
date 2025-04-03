package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajhh extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler");
    public final aqkp b;
    public final aolr c;
    public final ffbr d;
    private final ffsk e;
    private final alxl f;

    public ajhh(ffsk ffskVar, aqkp aqkpVar, alxl alxlVar, aolr aolrVar, ffbr ffbrVar) {
        ffskVar.getClass();
        aqkpVar.getClass();
        alxlVar.getClass();
        aolrVar.getClass();
        this.e = ffskVar;
        this.b = aqkpVar;
        this.f = alxlVar;
        this.c = aolrVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        poh pohVar = new poh();
        pohVar.b = true;
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("PenpalBotRecipientRestoreHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = ajhj.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        ((ajhj) eyhsVar).getClass();
        if (((Optional) this.d.b()).isEmpty() || !((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            elfl e = elfo.e(ceyt.i());
            e.getClass();
            return e;
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleGemini");
        ((enrr) h.h("com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler", "processPendingWorkItemAsync", 77, "PenpalBotRecipientRestoreHandler.kt")).q("Start to process penpal bot recipient restore request.");
        c = axol.c(this.e, ffhe.a, ffsm.a, new ajhd(this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r12, defpackage.ffgu r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.ajhe
            if (r0 == 0) goto L13
            r0 = r13
            ajhe r0 = (defpackage.ajhe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajhe r0 = new ajhe
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r13)
            goto L81
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.ffci.b(r13)
            aqkp r13 = r11.b
            aqkv r12 = r12.F()
            ffbr r2 = r11.d
            cjvt r4 = new cjvt
            java.lang.Object r2 = r2.b()
            j$.util.Optional r2 = (j$.util.Optional) r2
            java.lang.Object r2 = r2.get()
            cjdk r2 = (defpackage.cjdk) r2
            java.lang.String r7 = r2.s()
            cjwi r8 = defpackage.cjwi.PROFILE_UNSPECIFIED_SOURCE
            r9 = 0
            r10 = 19
            r5 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            ffbr r2 = r11.d
            cjvu r5 = new cjvu
            java.lang.Object r2 = r2.b()
            j$.util.Optional r2 = (j$.util.Optional) r2
            java.lang.Object r2 = r2.get()
            cjdk r2 = (defpackage.cjdk) r2
            android.net.Uri r2 = r2.c()
            cjwi r6 = defpackage.cjwi.PROFILE_UNSPECIFIED_SOURCE
            r7 = 0
            r8 = 4
            r5.<init>(r2, r6, r7, r8)
            elfl r12 = r13.z(r12, r4, r5)
            r12.getClass()
            r0.c = r3
            java.lang.Object r13 = defpackage.fgfz.c(r12, r0)
            if (r13 != r1) goto L81
            return r1
        L81:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            enru r12 = defpackage.ajhh.a
            ensk r12 = r12.h()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleGemini"
            r12.Y(r0, r1)
            java.lang.String r0 = "restoreGeminiNameAndAvatar"
            r1 = 135(0x87, float:1.89E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler"
            java.lang.String r3 = "PenpalBotRecipientRestoreHandler.kt"
            ensk r12 = r12.h(r2, r0, r1, r3)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r0 = "Restore Gemini name and avatar result: %s"
            r12.t(r0, r13)
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhh.k(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if (r1 != r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r18, defpackage.ffgu r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.ajhf
            if (r2 == 0) goto L17
            r2 = r1
            ajhf r2 = (defpackage.ajhf) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            ajhf r2 = new ajhf
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            defpackage.ffci.b(r1)
            goto Lb3
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            ajhh r4 = r2.d
            defpackage.ffci.b(r1)
            goto L69
        L3d:
            defpackage.ffci.b(r1)
            alxl r1 = r0.f
            anvc r7 = new anvc
            engw r8 = defpackage.engw.r(r18)
            r8.getClass()
            r15 = 0
            r16 = 246(0xf6, float:3.45E-43)
            r9 = 0
            r10 = 0
            r11 = 3
            r12 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            elfl r1 = r1.g(r7)
            r1.getClass()
            r2.d = r0
            r2.c = r6
            java.lang.Object r1 = defpackage.fgfz.c(r1, r2)
            if (r1 == r3) goto Ld8
            r4 = r0
        L69:
            engw r1 = (defpackage.engw) r1
            r1.getClass()
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto Ld5
            alxl r6 = r4.f
            r7 = 0
            java.lang.Object r1 = r1.get(r7)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r1
            ffbr r7 = r4.d
            java.lang.Object r7 = r7.b()
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.Object r7 = r7.get()
            cjdk r7 = (defpackage.cjdk) r7
            java.lang.String r7 = r7.s()
            ffbr r4 = r4.d
            java.lang.Object r4 = r4.b()
            j$.util.Optional r4 = (j$.util.Optional) r4
            java.lang.Object r4 = r4.get()
            cjdk r4 = (defpackage.cjdk) r4
            android.net.Uri r4 = r4.c()
            elfl r1 = r6.v(r1, r7, r4)
            r1.getClass()
            r4 = 0
            r2.d = r4
            r2.c = r5
            java.lang.Object r1 = defpackage.fgfz.c(r1, r2)
            if (r1 == r3) goto Ld8
        Lb3:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            enru r2 = defpackage.ajhh.a
            ensk r2 = r2.h()
            ensn r3 = defpackage.ente.a
            java.lang.String r4 = "BugleGemini"
            r2.Y(r3, r4)
            java.lang.String r3 = "restorePenpalBotConversation"
            r4 = 174(0xae, float:2.44E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler"
            java.lang.String r6 = "PenpalBotRecipientRestoreHandler.kt"
            ensk r2 = r2.h(r5, r3, r4, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r3 = "Restore Gemini conversation info result: %s"
            r2.t(r3, r1)
        Ld5:
            ffcu r1 = defpackage.ffcu.a
            return r1
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhh.l(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(final com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ajhg
            if (r0 == 0) goto L13
            r0 = r7
            ajhg r0 = (defpackage.ajhg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajhg r0 = new ajhg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "restorePenpalBotParticipantType"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            defpackage.ffci.b(r7)
            goto L57
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            bvvr r7 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.f()
            r7.ap(r3)
            ajhc r2 = new ajhc
            r2.<init>()
            r7.V(r2)
            r6 = 3
            r7.I(r6)
            bvvq r6 = r7.b()
            elfl r6 = r6.i()
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L86
        L57:
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            enru r7 = defpackage.ajhh.a
            ensk r7 = r7.h()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleGemini"
            r7.Y(r0, r1)
            java.lang.String r0 = "com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler"
            r1 = 151(0x97, float:2.12E-43)
            java.lang.String r2 = "PenpalBotRecipientRestoreHandler.kt"
            ensk r7 = r7.h(r0, r3, r1, r2)
            enrr r7 = (defpackage.enrr) r7
            if (r6 <= 0) goto L79
            goto L7a
        L79:
            r4 = 0
        L7a:
            java.lang.String r6 = "Restore Gemini participant type result: %s"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r7.t(r6, r0)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhh.m(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ffgu):java.lang.Object");
    }
}
