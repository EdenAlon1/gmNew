package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amqd b;
    final /* synthetic */ eiks c;
    final /* synthetic */ amqc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqb(amqd amqdVar, eiks eiksVar, amqc amqcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amqdVar;
        this.c = eiksVar;
        this.d = amqcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r5 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (defpackage.fgfz.c(r5, r4) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        return defpackage.ffcu.a;
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
            if (r1 == r2) goto L21
            goto L43
        Ld:
            amqd r5 = r4.b
            eiks r1 = r4.c
            aqkp r5 = r5.b
            aoku r1 = r1.c
            elfl r5 = r5.m(r1)
            r4.a = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L46
        L21:
            amqd r1 = r4.b
            eiks r2 = r4.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r3 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            java.lang.String r2 = r2.a
            r3.<init>(r2)
            amqc r2 = r4.d
            alxl r1 = r1.a
            elfl r5 = r1.n(r3, r2, r5)
            r5.getClass()
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 != r0) goto L43
            goto L46
        L43:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amqb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amqb(this.b, this.c, this.d, ffguVar);
    }
}
