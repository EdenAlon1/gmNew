package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajcj implements ajce {
    private static final enru a = enru.c("com/google/android/apps/messaging/penpal/conversation/WelcomeMessageGeneratorImpl");
    private static final ffmj b = new ffmj(BasePaymentResult.ERROR_REQUEST_FAILED, 267);
    private final Context c;
    private final ajca d;
    private final ffbr e;
    private final cqoh f;
    private final ffbr g;
    private final amhs h;
    private final azcn i;

    public ajcj(ffsk ffskVar, Context context, ajca ajcaVar, ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2, amhs amhsVar, azcn azcnVar) {
        ffskVar.getClass();
        context.getClass();
        ajcaVar.getClass();
        ffbrVar.getClass();
        cqohVar.getClass();
        ffbrVar2.getClass();
        amhsVar.getClass();
        azcnVar.getClass();
        this.c = context;
        this.d = ajcaVar;
        this.e = ffbrVar;
        this.f = cqohVar;
        this.g = ffbrVar2;
        this.h = amhsVar;
        this.i = azcnVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(2:20|(1:22))|12|13)|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        ((defpackage.enrr) ((defpackage.enrr) defpackage.ajcj.a.i()).g(r5).h("com/google/android/apps/messaging/penpal/conversation/WelcomeMessageGeneratorImpl", "insertMessageIfEmptyConversation", 76, "WelcomeMessageGeneratorImpl.kt")).q("Failed to insert Gemini welcome message");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.ajce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5, defpackage.aqux r6, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ajcg
            if (r0 == 0) goto L13
            r0 = r8
            ajcg r0 = (defpackage.ajcg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajcg r0 = new ajcg
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L27
            goto L71
        L27:
            r5 = move-exception
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r8)
            emyl r8 = defpackage.ctjd.ak
            java.lang.Object r8 = r8.get()
            cfup r8 = (defpackage.cfup) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L49
            goto L71
        L49:
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r4.c(r5, r6, r7, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L71
            return r1
        L52:
            enru r6 = defpackage.ajcj.a
            ensk r6 = r6.i()
            enrr r6 = (defpackage.enrr) r6
            ensk r5 = r6.g(r5)
            java.lang.String r6 = "insertMessageIfEmptyConversation"
            r7 = 76
            java.lang.String r8 = "com/google/android/apps/messaging/penpal/conversation/WelcomeMessageGeneratorImpl"
            java.lang.String r0 = "WelcomeMessageGeneratorImpl.kt"
            ensk r5 = r5.h(r8, r6, r7, r0)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "Failed to insert Gemini welcome message"
            r5.q(r6)
        L71:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcj.a(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, aqux, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, long r8, defpackage.aqux r10, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r11, defpackage.ffgu r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof defpackage.ajcf
            if (r0 == 0) goto L13
            r0 = r12
            ajcf r0 = (defpackage.ajcf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajcf r0 = new ajcf
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            ckay r7 = r0.d
            defpackage.ffci.b(r12)
            goto Lb5
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.ffci.b(r12)
            ckeo r12 = defpackage.ckep.C()
            r2 = 0
            bdhg r2 = defpackage.bdhg.a(r2)
            r4 = r12
            ckay r4 = (defpackage.ckay) r4
            r4.a = r2
            j$.util.Optional r10 = r10.m()
            java.lang.Object r10 = r10.get()
            aoku r10 = (defpackage.aoku) r10
            j$.util.Optional r10 = r10.e()
            java.lang.Object r10 = r10.get()
            awui r10 = (defpackage.awui) r10
            r12.m(r10)
            aoku r10 = r11.g()
            java.lang.String r10 = r10.p(r3)
            r12.l(r10)
            aoku r10 = r11.g()
            j$.util.Optional r10 = r10.e()
            java.lang.Object r10 = r10.get()
            awui r10 = (defpackage.awui) r10
            r12.k(r10)
            r4.b = r7
            r12.o(r8)
            r12.j(r8)
            java.lang.String r7 = "text/plain"
            r4.f = r7
            r12.i()
            r7 = 0
            r12.q(r7)
            r12.e(r7)
            r12.f(r7)
            r12.c(r7)
            r12.d(r7)
            r12.g(r7)
            aoku r7 = r11.g()
            j$.util.Optional r7 = r7.e()
            java.lang.Object r7 = r7.get()
            awui r7 = (defpackage.awui) r7
            r0.d = r4
            r0.c = r3
            azcn r8 = r6.i
            java.lang.Object r7 = r8.b(r7, r0)
            if (r7 == r1) goto Lbf
            r5 = r12
            r12 = r7
            r7 = r5
        Lb5:
            azcr r12 = (defpackage.azcr) r12
            r7.n(r12)
            ckep r7 = r7.r()
            return r7
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcj.b(java.lang.String, long, aqux, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0163, code lost:
    
        if (r0 == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r12v0, types: [dtsu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r14, defpackage.aqux r15, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r16, defpackage.ffgu r17) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcj.c(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, aqux, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|(1:13)|14|15))|26|6|7|(0)(0)|11|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0029, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        ((defpackage.enrr) ((defpackage.enrr) defpackage.ajcj.a.j()).g(r9).h("com/google/android/apps/messaging/penpal/conversation/WelcomeMessageGeneratorImpl", "nudgeMessage", 198, "WelcomeMessageGeneratorImpl.kt")).q("Failed to add nudge classification");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ajci
            if (r0 == 0) goto L13
            r0 = r10
            ajci r0 = (defpackage.ajci) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajci r0 = new ajci
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            defpackage.ffci.b(r10)     // Catch: java.lang.IllegalStateException -> L29
            goto Laf
        L29:
            r9 = move-exception
            goto Lbc
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.ffci.b(r10)
            amhs r10 = r8.h     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r9.z()     // Catch: java.lang.IllegalStateException -> L29
            r2.<init>(r5)     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r10 = r10.H(r2, r3)     // Catch: java.lang.IllegalStateException -> L29
            alye r10 = r10.c()     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9 = r9.B()     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId r2 = new com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId     // Catch: java.lang.IllegalStateException -> L29
            r5 = -1
            r2.<init>(r9, r5)     // Catch: java.lang.IllegalStateException -> L29
            fbwv r9 = defpackage.fbwv.a     // Catch: java.lang.IllegalStateException -> L29
            eyfq r9 = r9.createBuilder()     // Catch: java.lang.IllegalStateException -> L29
            fbwu r9 = (defpackage.fbwu) r9     // Catch: java.lang.IllegalStateException -> L29
            r9.getClass()     // Catch: java.lang.IllegalStateException -> L29
            fbuy r5 = defpackage.fbuy.a     // Catch: java.lang.IllegalStateException -> L29
            eyfq r5 = r5.createBuilder()     // Catch: java.lang.IllegalStateException -> L29
            fbux r5 = (defpackage.fbux) r5     // Catch: java.lang.IllegalStateException -> L29
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L29
            r5.copyOnWrite()     // Catch: java.lang.IllegalStateException -> L29
            MessageType extends eyfy<MessageType, BuilderType> r6 = r5.instance     // Catch: java.lang.IllegalStateException -> L29
            fbuy r6 = (defpackage.fbuy) r6     // Catch: java.lang.IllegalStateException -> L29
            r7 = 4
            int r7 = defpackage.fbqv.a(r7)     // Catch: java.lang.IllegalStateException -> L29
            r6.b = r7     // Catch: java.lang.IllegalStateException -> L29
            eyfy r5 = r5.build()     // Catch: java.lang.IllegalStateException -> L29
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L29
            fbuy r5 = (defpackage.fbuy) r5     // Catch: java.lang.IllegalStateException -> L29
            r9.copyOnWrite()     // Catch: java.lang.IllegalStateException -> L29
            MessageType extends eyfy<MessageType, BuilderType> r6 = r9.instance     // Catch: java.lang.IllegalStateException -> L29
            fbwv r6 = (defpackage.fbwv) r6     // Catch: java.lang.IllegalStateException -> L29
            r6.c = r5     // Catch: java.lang.IllegalStateException -> L29
            r5 = 3
            r6.b = r5     // Catch: java.lang.IllegalStateException -> L29
            fbrc r5 = defpackage.fbrc.NUDGE_CLASSIFICATION     // Catch: java.lang.IllegalStateException -> L29
            defpackage.fbqk.b(r5, r9)     // Catch: java.lang.IllegalStateException -> L29
            fbwv r9 = defpackage.fbqk.a(r9)     // Catch: java.lang.IllegalStateException -> L29
            java.util.List r9 = defpackage.ffdx.b(r9)     // Catch: java.lang.IllegalStateException -> L29
            engw r9 = defpackage.engq.a(r9)     // Catch: java.lang.IllegalStateException -> L29
            elfl r9 = r10.l(r2, r9)     // Catch: java.lang.IllegalStateException -> L29
            r9.getClass()     // Catch: java.lang.IllegalStateException -> L29
            r0.c = r4     // Catch: java.lang.IllegalStateException -> L29
            java.lang.Object r10 = defpackage.fgfz.c(r9, r0)     // Catch: java.lang.IllegalStateException -> L29
            if (r10 != r1) goto Laf
            return r1
        Laf:
            r10.getClass()     // Catch: java.lang.IllegalStateException -> L29
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.IllegalStateException -> L29
            boolean r9 = r10.booleanValue()     // Catch: java.lang.IllegalStateException -> L29
            if (r9 == 0) goto Ldb
            r3 = r4
            goto Ldb
        Lbc:
            enru r10 = defpackage.ajcj.a
            ensk r10 = r10.j()
            enrr r10 = (defpackage.enrr) r10
            ensk r9 = r10.g(r9)
            java.lang.String r10 = "nudgeMessage"
            r0 = 198(0xc6, float:2.77E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/penpal/conversation/WelcomeMessageGeneratorImpl"
            java.lang.String r2 = "WelcomeMessageGeneratorImpl.kt"
            ensk r9 = r9.h(r1, r10, r0, r2)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Failed to add nudge classification"
            r9.q(r10)
        Ldb:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcj.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }
}
