package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczo implements aczk {
    private static final enru b = enru.c("com/google/android/apps/messaging/emergency/conversationprovider/EmergencyConversationProviderImpl");
    public final ffbr a;
    private final ffbr c;
    private final ffbr d;

    public aczo(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.a = ffbrVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.aczk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aczn
            if (r0 == 0) goto L13
            r0 = r6
            aczn r0 = (defpackage.aczn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aczn r0 = new aczn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aoks r5 = r0.d
            defpackage.ffci.b(r6)
            goto L68
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            if (r5 == 0) goto L43
            ffbr r5 = r4.c
            java.lang.Object r5 = r5.b()
            aolr r5 = (defpackage.aolr) r5
            aoku r5 = r5.m()
            goto L4f
        L43:
            ffbr r5 = r4.c
            java.lang.Object r5 = r5.b()
            aolr r5 = (defpackage.aolr) r5
            aoku r5 = r5.l()
        L4f:
            ffbr r6 = r4.d
            java.lang.Object r6 = r6.b()
            aqkp r6 = (defpackage.aqkp) r6
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r6 = r6.f(r5)
            r2 = r5
            aoks r2 = (defpackage.aoks) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r4.b(r6, r0)
            if (r6 == r1) goto L9f
        L68:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6
            enru r0 = defpackage.aczo.b
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleSatellite"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensn r1 = defpackage.csux.q
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r6.d()
            r0.Y(r1, r2)
            ensn r1 = defpackage.csux.C
            r0.Y(r1, r5)
            java.lang.String r5 = "getOrCreateEsosConversation"
            r1 = 52
            java.lang.String r2 = "com/google/android/apps/messaging/emergency/conversationprovider/EmergencyConversationProviderImpl"
            java.lang.String r3 = "EmergencyConversationProviderImpl.kt"
            ensk r5 = r0.h(r2, r5, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "Created or retrieved eSOS Conversation"
            r5.q(r0)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r6.d()
            return r5
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aczo.a(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aczl
            if (r0 == 0) goto L13
            r0 = r6
            aczl r0 = (defpackage.aczl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aczl r0 = new aczl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            aczm r6 = new aczm
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffsl.a(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aczo.b(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, ffgu):java.lang.Object");
    }
}
