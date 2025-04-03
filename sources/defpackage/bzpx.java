package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzpx implements bczl {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/E2eeConversationActiveIdentityChangedListener");
    public final ffbr a;
    private final amhs c;
    private final ffsk d;
    private final ffhd e;
    private final ffbr f;

    public bzpx(amhs amhsVar, ffbr ffbrVar, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar2) {
        amhsVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar2.getClass();
        this.c = amhsVar;
        this.a = ffbrVar;
        this.d = ffskVar;
        this.e = ffhdVar;
        this.f = ffbrVar2;
    }

    @Override // defpackage.bczl
    public final ekzz a() {
        return new cqoq("E2eeConversationActiveIdentityChangedListener::onActiveIdentityChanged").a();
    }

    @Override // defpackage.bczl
    public final elfl b(ConversationIdType conversationIdType, aqux aquxVar) {
        aquxVar.getClass();
        return axol.i(this.d, new bzpt(this, conversationIdType, aquxVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.alxj r5, defpackage.aqux r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bzps
            if (r0 == 0) goto L13
            r0 = r7
            bzps r0 = (defpackage.bzps) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bzps r0 = new bzps
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r5 = r0.a
            defpackage.ffci.b(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            boolean r5 = r5.o()
            aqge r6 = r6.f()
            elfl r6 = r6.b()
            r6.getClass()
            r0.a = r5
            r0.d = r3
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L5c
        L4d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = defpackage.ffkj.e(r5, r7)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzpx.c(alxj, aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0122, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, defpackage.aqux r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzpx.d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bzpw
            if (r0 == 0) goto L13
            r0 = r6
            bzpw r0 = (defpackage.bzpw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzpw r0 = new bzpw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            amhs r6 = r4.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r2.<init>(r5)
            r5 = 0
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5 = r6.H(r2, r5)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r5
            aqge r5 = r5.f
            elfl r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzpx.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }
}
