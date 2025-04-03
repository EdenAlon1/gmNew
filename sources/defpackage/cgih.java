package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgih extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cgii c;
    final /* synthetic */ ConversationIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgih(cgii cgiiVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cgiiVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgih) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r7 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r7 != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:10:0x0065). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L12
            defpackage.ffci.b(r7)
            goto L8e
        L12:
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L65
        L18:
            defpackage.ffci.b(r7)
            goto L3a
        L1c:
            defpackage.ffci.b(r7)
            cgii r7 = r6.c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r6.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r5 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r5.<init>(r1)
            aqkp r7 = r7.a
            aqge r7 = r7.d(r5)
            elfl r7 = r7.b()
            r6.b = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto Lac
        L3a:
            engw r7 = (defpackage.engw) r7
            r7.getClass()
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L46
            goto L6a
        L46:
            java.util.Iterator r7 = r7.iterator()
            r1 = r7
        L4b:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r1.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r7
            elfl r7 = r7.s()
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto Lac
        L65:
            aqlx r5 = defpackage.aqlx.b
            if (r7 != r5) goto L4b
            r4 = 0
        L6a:
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r7 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r6.d
            r7.<init>(r1)
            if (r4 == 0) goto L76
            amny r1 = defpackage.amny.b
            goto L78
        L76:
            amny r1 = defpackage.amny.c
        L78:
            cgii r3 = r6.c
            alxl r3 = r3.b
            elfl r7 = r3.w(r7, r1)
            r7.getClass()
            r6.a = r2
            r1 = 3
            r6.b = r1
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto Lac
        L8e:
            r0 = r7
            java.lang.Void r0 = (java.lang.Void) r0
            elfl r0 = defpackage.elfo.e(r2)
            ejui r1 = defpackage.cghk.a
            cgii r1 = r6.c
            ejvp r2 = r1.c
            ejui r3 = defpackage.cghk.a
            r2.a(r0, r3)
            ffbr r0 = r1.d
            java.lang.Object r0 = r0.b()
            cbgf r0 = (defpackage.cbgf) r0
            r0.c()
            return r7
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgih.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgih(this.c, this.d, ffguVar);
    }
}
