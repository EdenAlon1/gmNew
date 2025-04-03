package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abqo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abqp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abqo(abqp abqpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abqpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abqo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d7, code lost:
    
        if (r9.a(r2, r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0071, code lost:
    
        if (r9.a(r3, r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00d9, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            defpackage.ffci.b(r9)
            if (r1 == 0) goto Lc
            goto Lda
        Lc:
            abqp r9 = r8.b
            ffbr r9 = r9.d
            java.lang.Object r9 = r9.b()
            aspy r9 = (defpackage.aspy) r9
            boolean r9 = r9.a()
            r1 = 0
            if (r9 == 0) goto L74
            abqp r9 = r8.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r9 = r9.b
            alye r9 = r9.c()
            aqge r9 = r9.i()
            r9.getClass()
            ffxx r9 = defpackage.aqfu.a(r9)
            abqk r3 = new abqk
            r3.<init>(r9)
            abqp r9 = r8.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r9 = r9.b
            aqge r9 = r9.h()
            r9.getClass()
            abqp r4 = r8.b
            ffxx r9 = defpackage.aqfu.a(r9)
            com.google.android.apps.messaging.shared.api.messaging.Conversation r4 = r4.b
            aqge r4 = r4.i()
            r4.getClass()
            abqp r5 = r8.b
            ffxx r4 = defpackage.aqfu.a(r4)
            abqe r6 = new abqe
            r6.<init>(r1)
            ffxx r1 = r5.c
            ffxx r9 = defpackage.fgck.b(r3, r9, r4, r1, r6)
            ffxx r9 = defpackage.fgaj.b(r9, r2)
            abqp r1 = r8.b
            abqf r3 = new abqf
            r3.<init>(r1)
            r8.a = r2
            java.lang.Object r9 = r9.a(r3, r8)
            if (r9 != r0) goto Lda
            goto Ld9
        L74:
            abqp r9 = r8.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r9 = r9.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r3 = r9.d()
            boolean r4 = r3 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            if (r4 == 0) goto L83
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r3 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r3
            goto L84
        L83:
            r3 = r1
        L84:
            if (r3 == 0) goto Lda
            alye r9 = r9.c()
            aqge r9 = r9.i()
            r9.getClass()
            ffxx r9 = defpackage.aqfu.a(r9)
            abqn r4 = new abqn
            r4.<init>(r9)
            abqp r9 = r8.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r9 = r9.b
            aqge r9 = r9.h()
            r9.getClass()
            abqp r5 = r8.b
            ffxx r9 = defpackage.aqfu.a(r9)
            com.google.android.apps.messaging.shared.api.messaging.Conversation r5 = r5.b
            aqge r5 = r5.i()
            r5.getClass()
            abqp r6 = r8.b
            ffxx r5 = defpackage.aqfu.a(r5)
            abqg r7 = new abqg
            r7.<init>(r1)
            ffxx r1 = r6.c
            ffxx r9 = defpackage.fgck.b(r4, r9, r5, r1, r7)
            ffxx r9 = defpackage.fgaj.b(r9, r2)
            abqp r1 = r8.b
            abqh r2 = new abqh
            r2.<init>(r1, r3)
            r1 = 2
            r8.a = r1
            java.lang.Object r9 = r9.a(r2, r8)
            if (r9 != r0) goto Lda
        Ld9:
            return r0
        Lda:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abqo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abqo(this.b, ffguVar);
    }
}
