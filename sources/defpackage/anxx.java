package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anxx extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ anye d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anxx(anye anyeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = anyeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anxx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r6 != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L50
        Ld:
            java.lang.Object r1 = r5.b
            java.lang.Object r3 = r5.a
            defpackage.ffci.b(r6)
            goto L3f
        L15:
            defpackage.ffci.b(r6)
            anye r6 = r5.d
            anxw r3 = new anxw
            r3.<init>(r6)
            cpfu r1 = r6.f
            if (r1 != 0) goto L25
            cpfi r1 = r6.b
        L25:
            ffbr r6 = r6.d
            java.lang.Object r6 = r6.b()
            ctrg r6 = (defpackage.ctrg) r6
            anye r4 = r5.d
            r5.a = r3
            r5.b = r1
            r5.c = r2
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r4 = r4.g
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = r4.a
            java.lang.Object r6 = defpackage.ctrg.b(r6, r4, r5)
            if (r6 == r0) goto L8b
        L3f:
            java.util.List r6 = (java.util.List) r6
            r4 = 0
            r5.a = r4
            r5.b = r4
            r4 = 2
            r5.c = r4
            java.lang.Object r6 = r1.b(r6, r3, r2, r5)
            if (r6 != r0) goto L50
            goto L8b
        L50:
            anye r0 = r5.d
            ffbr r0 = r0.e
            r1 = r6
            engw r1 = (defpackage.engw) r1
            java.lang.Object r0 = r0.b()
            ctqh r0 = (defpackage.ctqh) r0
            fbrd r2 = defpackage.fbrd.SHOWN
            r0.q(r1, r2)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ffdx.n(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L73:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r6.next()
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r1 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r1
            r1.getClass()
            r0.add(r1)
            goto L73
        L86:
            engw r6 = defpackage.engq.a(r0)
            return r6
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anxx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anxx(this.d, ffguVar);
    }
}
