package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgif extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgig b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgif(cgig cgigVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgigVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgif) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        if (r5 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (((java.lang.Boolean) r5).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r5 = (defpackage.cggo) r4.b.b.b();
        defpackage.cggo.c(r4.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        if (r5 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L28
            goto L64
        Ld:
            cgig r5 = r4.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r4.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r3 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r3.<init>(r1)
            aqkp r5 = r5.c
            aqge r5 = r5.d(r3)
            elfl r5 = r5.b()
            r4.a = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L7e
        L28:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L3c:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            aoku r2 = r2.g()
            r1.add(r2)
            goto L3c
        L50:
            cgig r5 = r4.b
            ffbr r5 = r5.a
            java.lang.Object r5 = r5.b()
            aqly r5 = (defpackage.aqly) r5
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r5.b(r1, r4)
            if (r5 != r0) goto L64
            goto L7e
        L64:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L7b
            cgig r5 = r4.b
            ffbr r5 = r5.b
            java.lang.Object r5 = r5.b()
            cggo r5 = (defpackage.cggo) r5
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r4.c
            defpackage.cggo.c(r5)
        L7b:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgif.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgif(this.b, this.c, ffguVar);
    }
}
