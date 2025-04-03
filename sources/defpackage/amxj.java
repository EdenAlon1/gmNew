package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxj extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ ConversationId f;
    final /* synthetic */ amxk g;
    final /* synthetic */ aqux h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amxj(ConversationId conversationId, amxk amxkVar, aqux aquxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = conversationId;
        this.g = amxkVar;
        this.h = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amxj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        if (defpackage.fgfz.c(r2, r9) != r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00af: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:176), block:B:34:0x00af */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L18
            java.lang.Object r0 = r9.b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r1 = r9.a
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L15
            goto L9f
        L15:
            r10 = move-exception
            goto Lb0
        L18:
            java.lang.Object r1 = r9.d
            java.lang.Object r2 = r9.c
            java.lang.Object r4 = r9.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r4
            java.lang.Object r5 = r9.a
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> Lae
            r8 = r2
            r2 = r1
            r1 = r5
            r5 = r4
            r4 = r8
            goto L68
        L2b:
            defpackage.ffci.b(r10)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r9.f
            amxk r10 = r9.g
            aqux r1 = r9.h
            java.lang.String r5 = "RbmConversationRepository#setActiveSelfIdentity"
            ekzz r5 = defpackage.eleg.f(r5)
            boolean r6 = r4 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto La6
            ffbr r6 = r10.b     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> Lae
            amhs r6 = (defpackage.amhs) r6     // Catch: java.lang.Throwable -> Lae
            r7 = r4
            com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId r7 = (com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId) r7     // Catch: java.lang.Throwable -> Lae
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r7 = r7.b     // Catch: java.lang.Throwable -> Lae
            elfl r6 = r6.t(r7, r1)     // Catch: java.lang.Throwable -> Lae
            r6.getClass()     // Catch: java.lang.Throwable -> Lae
            r9.a = r5     // Catch: java.lang.Throwable -> Lae
            r9.b = r4     // Catch: java.lang.Throwable -> Lae
            r9.c = r10     // Catch: java.lang.Throwable -> Lae
            r9.d = r1     // Catch: java.lang.Throwable -> Lae
            r9.e = r2     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r2 = defpackage.fgfz.c(r6, r9)     // Catch: java.lang.Throwable -> Lae
            if (r2 == r0) goto La5
            r8 = r4
            r4 = r10
            r10 = r2
            r2 = r1
            r1 = r5
            r5 = r8
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L15
            boolean r6 = r10.booleanValue()     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L9e
            amxk r4 = (defpackage.amxk) r4     // Catch: java.lang.Throwable -> L15
            ffbr r4 = r4.d     // Catch: java.lang.Throwable -> L15
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L15
            cbuu r4 = (defpackage.cbuu) r4     // Catch: java.lang.Throwable -> L15
            com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId) r5     // Catch: java.lang.Throwable -> L15
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r5.a     // Catch: java.lang.Throwable -> L15
            r5.getClass()     // Catch: java.lang.Throwable -> L15
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r6 = r2.g()     // Catch: java.lang.Throwable -> L15
            j$.util.Optional r2 = j$.util.Optional.of(r2)     // Catch: java.lang.Throwable -> L15
            elfl r2 = r4.g(r5, r6, r2)     // Catch: java.lang.Throwable -> L15
            r9.a = r1     // Catch: java.lang.Throwable -> L15
            r9.b = r10     // Catch: java.lang.Throwable -> L15
            r9.c = r3     // Catch: java.lang.Throwable -> L15
            r9.d = r3     // Catch: java.lang.Throwable -> L15
            r4 = 2
            r9.e = r4     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = defpackage.fgfz.c(r2, r9)     // Catch: java.lang.Throwable -> L15
            if (r2 == r0) goto La5
        L9e:
            r0 = r10
        L9f:
            defpackage.ffig.a(r1, r3)
            r0.getClass()
        La5:
            return r0
        La6:
            java.lang.String r10 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Lae
            throw r0     // Catch: java.lang.Throwable -> Lae
        Lae:
            r10 = move-exception
            r1 = r5
        Lb0:
            throw r10     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            defpackage.ffig.a(r1, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amxj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amxj(this.f, this.g, this.h, ffguVar);
    }
}
