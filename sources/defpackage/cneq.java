package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cneq {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/reactions/transport/xms/receiver/workhandler/XmsReactionClassificationProcessor");
    private final cgoo b;
    private final ctkr c;
    private final cnef d;
    private final cbgf e;
    private final cmrq f;
    private final ffbr g;
    private final ecrj h;
    private final cmqm i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;

    public cneq(cgoo cgooVar, ctkr ctkrVar, cnef cnefVar, cbgf cbgfVar, cmrq cmrqVar, ffbr ffbrVar, ecrj ecrjVar, cmqm cmqmVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        cgooVar.getClass();
        ctkrVar.getClass();
        cbgfVar.getClass();
        cmrqVar.getClass();
        ecrjVar.getClass();
        cmqmVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = cgooVar;
        this.c = ctkrVar;
        this.d = cnefVar;
        this.e = cbgfVar;
        this.f = cmrqVar;
        this.g = ffbrVar;
        this.h = ecrjVar;
        this.i = cmqmVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.l = ffbrVar4;
        this.m = ffbrVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r24, java.lang.String r25, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r26, j$.time.Duration r27, defpackage.fbwv r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cneq.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, j$.time.Duration, fbwv, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r10, java.lang.String r11, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r12, j$.time.Duration r13, defpackage.fbwv r14, defpackage.ffgu r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof defpackage.cneo
            if (r0 == 0) goto L13
            r0 = r15
            cneo r0 = (defpackage.cneo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cneo r0 = new cneo
            r0.<init>(r9, r15)
        L18:
            r7 = r0
            java.lang.Object r15 = r7.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            ekzz r10 = r7.d
            defpackage.ffci.b(r15)     // Catch: java.lang.Throwable -> L2b
            goto L92
        L2b:
            r0 = move-exception
            r11 = r0
            goto Laf
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            defpackage.ffci.b(r15)
            java.lang.String r15 = "XmsReactionClassificationProcessor.persistAndLogReaction"
            ekzz r15 = defpackage.eleg.f(r15)
            ecrj r1 = r9.h     // Catch: java.lang.Throwable -> Lab
            ecri r1 = r1.d()     // Catch: java.lang.Throwable -> Lab
            r1.getClass()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "XmsReactionClassificationProcessor.persistClassification"
            ekzz r3 = defpackage.eleg.f(r3)     // Catch: java.lang.Throwable -> Lab
            cgoo r4 = r9.b     // Catch: java.lang.Throwable -> La2
            engw r5 = defpackage.engw.r(r14)     // Catch: java.lang.Throwable -> La2
            r5.getClass()     // Catch: java.lang.Throwable -> La2
            r4.e(r12, r5)     // Catch: java.lang.Throwable -> La2
            defpackage.ffig.a(r3, r8)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "XmsReactionClassificationProcessor.logClassification"
            ekzz r3 = defpackage.eleg.f(r3)     // Catch: java.lang.Throwable -> Lab
            ctkr r4 = r9.c     // Catch: java.lang.Throwable -> L99
            java.lang.String r5 = r12.b()     // Catch: java.lang.Throwable -> L99
            r5.getClass()     // Catch: java.lang.Throwable -> L99
            r4.h(r14)     // Catch: java.lang.Throwable -> L99
            defpackage.ffig.a(r3, r8)     // Catch: java.lang.Throwable -> Lab
            ecrj r3 = r9.h     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "XmsReactionClassificationProcessor.persistAndLogClassification"
            ecda r5 = new ecda     // Catch: java.lang.Throwable -> Lab
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lab
            ecrh r4 = defpackage.ecrh.SUCCESS     // Catch: java.lang.Throwable -> Lab
            r3.f(r1, r5, r8, r4)     // Catch: java.lang.Throwable -> Lab
            r7.d = r15     // Catch: java.lang.Throwable -> Lab
            r7.c = r2     // Catch: java.lang.Throwable -> Lab
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lab
            if (r10 == r0) goto L98
            r10 = r15
        L92:
            defpackage.ffig.a(r10, r8)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L98:
            return r0
        L99:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            r11 = r0
            defpackage.ffig.a(r3, r10)     // Catch: java.lang.Throwable -> Lab
            throw r11     // Catch: java.lang.Throwable -> Lab
        La2:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            r11 = r0
            defpackage.ffig.a(r3, r10)     // Catch: java.lang.Throwable -> Lab
            throw r11     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            r10 = r0
            r11 = r10
            r10 = r15
        Laf:
            throw r11     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            r12 = r0
            defpackage.ffig.a(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cneq.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, j$.time.Duration, fbwv, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, j$.time.Duration r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cnep
            if (r0 == 0) goto L13
            r0 = r7
            cnep r0 = (defpackage.cnep) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnep r0 = new cnep
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            j$.time.Duration r6 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r0.e
            cneq r0 = r0.d
            defpackage.ffci.b(r7)
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ffci.b(r7)
            ffbr r7 = r4.m
            java.lang.Object r7 = r7.b()
            asqe r7 = (defpackage.asqe) r7
            boolean r7 = r7.a()
            if (r7 != 0) goto L90
            ffbr r7 = r4.l
            java.lang.Object r7 = r7.b()
            amoe r7 = (defpackage.amoe) r7
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.c = r3
            java.lang.Object r7 = r7.c(r5, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r0 = r4
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L91
            enru r6 = defpackage.cneq.a
            ensk r6 = r6.h()
            java.lang.String r7 = "queueNotification"
            r1 = 191(0xbf, float:2.68E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/reactions/transport/xms/receiver/workhandler/XmsReactionClassificationProcessor"
            java.lang.String r3 = "XmsReactionClassificationProcessor.kt"
            ensk r6 = r6.h(r2, r7, r1, r3)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r7 = "Conversation is not allowed by parents. Posting unapproved notification."
            r6.q(r7)
            ffbr r6 = r0.k
            java.lang.Object r6 = r6.b()
            cjdh r6 = (defpackage.cjdh) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r7 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r7.<init>(r5)
            r6.a(r7)
            goto L9d
        L90:
            r0 = r4
        L91:
            ffbr r7 = r0.j
            java.lang.Object r7 = r7.b()
            cjbc r7 = (defpackage.cjbc) r7
            r0 = 0
            r7.b(r5, r6, r0)
        L9d:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cneq.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, j$.time.Duration, ffgu):java.lang.Object");
    }
}
