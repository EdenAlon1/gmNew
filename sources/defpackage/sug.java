package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sug extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sui b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sug(ffgu ffguVar, sui suiVar) {
        super(2, ffguVar);
        this.b = suiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sug) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if (r5 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5.f.c(r1, r4) != r0) goto L9;
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
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L4f
        Ld:
            defpackage.ffci.b(r5)
            goto L2e
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            ffsk r5 = (defpackage.ffsk) r5
            sui r5 = r4.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r5.d
            java.lang.String r1 = r1.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.bdgq.b(r1)
            r4.a = r2
            airu r5 = r5.f
            java.lang.Object r5 = r5.c(r1, r4)
            if (r5 == r0) goto L52
        L2e:
            sui r5 = r4.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r5.d
            java.lang.String r1 = r1.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.bdgq.b(r1)
            r2 = 2
            r4.a = r2
            stz r5 = r5.e
            r2 = 6
            axcl r3 = defpackage.axcl.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY
            java.lang.Object r5 = r5.c(r1, r2, r3, r4)
            ffhh r1 = defpackage.ffhh.a
            if (r5 == r1) goto L4c
            ffcu r5 = defpackage.ffcu.a
        L4c:
            if (r5 != r0) goto L4f
            goto L52
        L4f:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sug.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sug sugVar = new sug(ffguVar, this.b);
        sugVar.c = obj;
        return sugVar;
    }
}
