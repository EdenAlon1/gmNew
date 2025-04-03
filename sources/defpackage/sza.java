package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sza extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ szc c;
    final /* synthetic */ tad d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sza(szc szcVar, tad tadVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = szcVar;
        this.d = tadVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sza) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c8, code lost:
    
        if (r3.e.a(r1, null, true, r8, r18) == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ce, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r1 != r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r0 != r6) goto L14;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r18
            ffhh r6 = defpackage.ffhh.a
            int r0 = r5.b
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1c
            if (r0 == r1) goto L13
            defpackage.ffci.b(r19)
            goto Lcb
        L13:
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r19)
            r1 = r19
            goto L98
        L1c:
            defpackage.ffci.b(r19)
            r0 = r19
            goto L80
        L22:
            defpackage.ffci.b(r19)
            szc r0 = r5.c
            tad r3 = r5.d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            tad r4 = r5.d
            r5.b = r2
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r10 = r3.b
            java.lang.String r3 = r10.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9 = defpackage.bdgq.b(r3)
            java.lang.Boolean r3 = defpackage.cubs.a()
            boolean r3 = r3.booleanValue()
            int r14 = r4.f
            if (r3 == 0) goto L63
            ffbr r0 = r0.d
            java.lang.Object r0 = r0.b()
            crrt r0 = (defpackage.crrt) r0
            eoko r13 = defpackage.eoko.CONVERSATION_FROM_UNSPAM_ACTION
            r16 = 0
            r17 = 4268(0x10ac, float:5.981E-42)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r15 = 5
            crsd r3 = defpackage.crsc.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = r0.c(r3, r5)
            goto L7e
        L63:
            ffbr r0 = r0.d
            java.lang.Object r0 = r0.b()
            crrt r0 = (defpackage.crrt) r0
            eoko r13 = defpackage.eoko.CONVERSATION_FROM_UNSPAM_ACTION
            r16 = 0
            r17 = 4276(0x10b4, float:5.992E-42)
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 5
            crsd r3 = defpackage.crsc.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = r0.c(r3, r5)
        L7e:
            if (r0 == r6) goto Lce
        L80:
            crsn r0 = (defpackage.crsn) r0
            if (r0 == 0) goto Lcb
            szc r3 = r5.c
            ffbr r3 = r3.d
            java.lang.Object r3 = r3.b()
            crrt r3 = (defpackage.crrt) r3
            r5.a = r0
            r5.b = r1
            java.lang.Object r1 = r3.b(r0, r5)
            if (r1 == r6) goto Lce
        L98:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            if (r1 == 0) goto Lcb
            szc r3 = r5.c
            aoku r1 = r1.g()
            aokr r1 = r1.H(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            szc r4 = r5.c
            tad r7 = r5.d
            syz r8 = new syz
            crsn r0 = (defpackage.crsn) r0
            r8.<init>()
            r0 = 0
            r5.a = r0
            r0 = 3
            r5.b = r0
            sxq r0 = r3.e
            r3 = r2
            r2 = 0
            r4 = r8
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != r6) goto Lcb
            goto Lce
        Lcb:
            ffcu r0 = defpackage.ffcu.a
            return r0
        Lce:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sza.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sza(this.c, this.d, ffguVar);
    }
}
