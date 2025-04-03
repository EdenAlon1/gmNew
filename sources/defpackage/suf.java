package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class suf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suf(sui suiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = suiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((suf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r5 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        return r0;
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
            if (r1 == r2) goto L33
            goto L54
        Ld:
            sui r5 = r4.b
            r4.a = r2
            sup r5 = r5.h
            ffbr r1 = r5.b
            java.lang.Object r1 = r1.b()
            bczm r1 = (defpackage.bczm) r1
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r5.d
            java.lang.String r5 = r5.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.bdgq.b(r5)
            axcl r2 = defpackage.axcl.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY
            java.lang.Object r5 = r1.c(r5, r2, r4)
            ffhh r1 = defpackage.ffhh.a
            if (r5 == r1) goto L31
            ffcu r5 = defpackage.ffcu.a
        L31:
            if (r5 == r0) goto L57
        L33:
            sui r5 = r4.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r5.d
            java.lang.String r1 = r1.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.bdgq.b(r1)
            axcl r2 = defpackage.axcl.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY
            r3 = 2
            r4.a = r3
            stz r5 = r5.e
            r3 = 5
            java.lang.Object r5 = r5.c(r1, r3, r2, r4)
            ffhh r1 = defpackage.ffhh.a
            if (r5 == r1) goto L51
            ffcu r5 = defpackage.ffcu.a
        L51:
            if (r5 != r0) goto L54
            goto L57
        L54:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new suf(this.b, ffguVar);
    }
}
