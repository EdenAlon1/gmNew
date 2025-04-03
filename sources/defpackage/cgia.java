package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgia extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgie b;
    final /* synthetic */ ConversationIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgia(ffgu ffguVar, cgie cgieVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.b = cgieVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgia) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0037, code lost:
    
        if (r6 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1 A[LOOP:1: B:17:0x00bb->B:19:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6 A[LOOP:2: B:22:0x00e0->B:24:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0088  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            r3 = 10
            if (r1 == 0) goto L17
            if (r1 == r2) goto L13
            java.lang.Object r0 = r5.d
            java.util.List r0 = (java.util.List) r0
            defpackage.ffci.b(r6)
            goto L73
        L13:
            defpackage.ffci.b(r6)
            goto L39
        L17:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            ffsk r6 = (defpackage.ffsk) r6
            cgie r6 = r5.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r5.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r4 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r4.<init>(r1)
            aqkp r6 = r6.f
            aqge r6 = r6.d(r4)
            elfl r6 = r6.b()
            r5.a = r2
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto Lfe
        L39:
            engw r6 = (defpackage.engw) r6
            r6.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.ffdx.n(r6, r3)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L4b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            aoku r2 = r2.g()
            r1.add(r2)
            goto L4b
        L5f:
            cgie r6 = r5.b
            java.util.Set r2 = defpackage.ffdx.ar(r1)
            r5.d = r1
            r4 = 2
            r5.a = r4
            aqly r6 = r6.g
            java.lang.Object r6 = r6.c(r2, r5)
            if (r6 == r0) goto Lfe
            r0 = r1
        L73:
            java.util.Map r6 = (java.util.Map) r6
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L82:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L82
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r4, r2)
            goto L82
        La6:
            java.util.Set r6 = r1.keySet()
            java.util.List r0 = defpackage.ffdx.ab(r0, r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.ffdx.n(r6, r3)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        Lbb:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r6.next()
            aoku r2 = (defpackage.aoku) r2
            java.lang.String r2 = r2.o()
            r1.add(r2)
            goto Lbb
        Lcf:
            java.util.Set r6 = defpackage.ffdx.ar(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.ffdx.n(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Le0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf4
            java.lang.Object r2 = r0.next()
            aoku r2 = (defpackage.aoku) r2
            java.lang.String r2 = r2.o()
            r1.add(r2)
            goto Le0
        Lf4:
            java.util.Set r0 = defpackage.ffdx.ar(r1)
            cghz r1 = new cghz
            r1.<init>(r6, r0)
            return r1
        Lfe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgia.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cgia cgiaVar = new cgia(ffguVar, this.b, this.c);
        cgiaVar.d = obj;
        return cgiaVar;
    }
}
