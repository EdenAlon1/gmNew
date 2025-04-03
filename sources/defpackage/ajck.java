package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajck extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajcl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajck(ajcl ajclVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajclVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajck) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00db, code lost:
    
        r14 = (java.lang.Void) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00df, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        if (r14 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r14 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00af, code lost:
    
        r14 = (defpackage.engw) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00b5, code lost:
    
        if (r14.isEmpty() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b7, code lost:
    
        r14 = ((defpackage.alxl) r13.b.d.b()).C((com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r14.get(0), defpackage.eoko.CONVERSATION_FROM_BG_STARTUP_TASK);
        r14.getClass();
        r13.a = 3;
        r14 = defpackage.fgfz.c(r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d8, code lost:
    
        if (r14 != r0) goto L24;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r13.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L11
            defpackage.ffci.b(r14)
            if (r1 == r3) goto L4e
            if (r1 == r2) goto Laf
            goto Ldb
        L11:
            defpackage.ffci.b(r14)
            emyl r14 = defpackage.ctjd.ak
            java.lang.Object r14 = r14.get()
            cfup r14 = (defpackage.cfup) r14
            java.lang.Object r14 = r14.e()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto Le1
            emyl r14 = defpackage.ctjd.aI
            java.lang.Object r14 = r14.get()
            cfup r14 = (defpackage.cfup) r14
            java.lang.Object r14 = r14.e()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Le1
            ajcl r14 = r13.b
            ffbr r14 = r14.a
            java.lang.Object r14 = r14.b()
            cjeo r14 = (defpackage.cjeo) r14
            r13.a = r3
            java.lang.Object r14 = r14.g(r13)
            if (r14 == r0) goto Le0
        L4e:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L58
            goto Le1
        L58:
            ajcl r14 = r13.b
            ffbr r14 = r14.a
            java.lang.Object r14 = r14.b()
            cjeo r14 = (defpackage.cjeo) r14
            r14.k()
            ajcl r14 = r13.b
            ffbr r14 = r14.b
            java.lang.Object r14 = r14.b()
            aolr r14 = (defpackage.aolr) r14
            aoku r14 = r14.v()
            ajcl r1 = r13.b
            ffbr r1 = r1.c
            java.lang.Object r1 = r1.b()
            aqkp r1 = (defpackage.aqkp) r1
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r14 = r1.f(r14)
            ajcl r1 = r13.b
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            alxl r1 = (defpackage.alxl) r1
            anvc r3 = new anvc
            engw r4 = defpackage.engw.r(r14)
            r4.getClass()
            r11 = 0
            r12 = 246(0xf6, float:3.45E-43)
            r5 = 0
            r6 = 0
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            elfl r14 = r1.g(r3)
            r14.getClass()
            r13.a = r2
            java.lang.Object r14 = defpackage.fgfz.c(r14, r13)
            if (r14 == r0) goto Le0
        Laf:
            engw r14 = (defpackage.engw) r14
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto Le1
            ajcl r1 = r13.b
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            alxl r1 = (defpackage.alxl) r1
            r2 = 0
            java.lang.Object r14 = r14.get(r2)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r14 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r14
            eoko r2 = defpackage.eoko.CONVERSATION_FROM_BG_STARTUP_TASK
            elfl r14 = r1.C(r14, r2)
            r14.getClass()
            r1 = 3
            r13.a = r1
            java.lang.Object r14 = defpackage.fgfz.c(r14, r13)
            if (r14 != r0) goto Ldb
            goto Le0
        Ldb:
            java.lang.Void r14 = (java.lang.Void) r14
            ffcu r14 = defpackage.ffcu.a
            return r14
        Le0:
            return r0
        Le1:
            ffcu r14 = defpackage.ffcu.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajck.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajck(this.b, ffguVar);
    }
}
