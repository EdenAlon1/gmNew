package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoap extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aoax c;
    final /* synthetic */ aoaq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoap(aoax aoaxVar, aoaq aoaqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = aoaxVar;
        this.d = aoaqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoap) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r7 != r0) goto L16;
     */
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
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.ffci.b(r7)
            goto L72
        Le:
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L52
        L14:
            defpackage.ffci.b(r7)
            aoax r7 = r6.c
            java.lang.String r1 = r7.b()
            if (r1 != 0) goto L20
            return r3
        L20:
            aoav r7 = r7.a()
            aoav r4 = defpackage.aoav.f
            if (r7 != r4) goto L52
            aoaq r7 = r6.d
            ffbr r7 = r7.c
            java.lang.Object r7 = r7.b()
            j$.util.Optional r7 = (j$.util.Optional) r7
            boolean r7 = r7.isPresent()
            if (r7 == 0) goto L52
            aoaq r7 = r6.d
            ffbr r7 = r7.c
            java.lang.Object r7 = r7.b()
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.Object r7 = r7.get()
            ctjh r7 = (defpackage.ctjh) r7
            r6.a = r1
            r6.b = r2
            java.lang.Object r7 = r7.h(r1, r6)
            if (r7 == r0) goto L71
        L52:
            aoaq r7 = r6.d
            ffbr r7 = r7.b
            java.lang.Object r7 = r7.b()
            ctqh r7 = (defpackage.ctqh) r7
            aoaq r2 = r6.d
            fbre r4 = defpackage.fbre.CONSUMED
            r6.a = r3
            r5 = 2
            r6.b = r5
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = r2.d
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = r2.a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r7 = r7.h(r2, r1, r4, r6)
            if (r7 != r0) goto L72
        L71:
            return r0
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoap.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aoap(this.c, this.d, ffguVar);
    }
}
