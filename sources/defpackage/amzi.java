package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amzi extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ elfl c;
    final /* synthetic */ amzm d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amzi(elfl elflVar, amzm amzmVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = elflVar;
        this.d = amzmVar;
        this.e = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amzi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x001e, code lost:
    
        if (r5 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0078  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.ffci.b(r5)
            goto L6f
        Lf:
            defpackage.ffci.b(r5)
            goto L20
        L13:
            defpackage.ffci.b(r5)
            elfl r5 = r4.c
            r4.b = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto La0
        L20:
            j$.util.Optional r5 = (j$.util.Optional) r5
            amzg r1 = new amzg
            r1.<init>()
            amzh r2 = new amzh
            r2.<init>()
            j$.util.Optional r5 = r5.map(r2)
            amzm r1 = r4.d
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            auvu r1 = (defpackage.auvu) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L89
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L84
            boolean r1 = r5.isPresent()
            if (r1 == 0) goto L79
            boolean r1 = r4.e
            if (r1 == 0) goto L79
            amzm r1 = r4.d
            ffbr r1 = r1.e
            java.lang.Object r1 = r1.b()
            amoe r1 = (defpackage.amoe) r1
            java.lang.Object r2 = r5.get()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r2
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = r2.a
            r4.a = r5
            r3 = 2
            r4.b = r3
            java.lang.Object r1 = r1.c(r2, r4)
            if (r1 == r0) goto La0
            r0 = r5
            r5 = r1
        L6f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L78
            goto L84
        L78:
            r5 = r0
        L79:
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = r5.get()
            engw r5 = defpackage.engw.r(r5)
            goto L9c
        L84:
            int r5 = defpackage.engw.d
            engw r5 = defpackage.enou.a
            goto L9c
        L89:
            boolean r0 = r5.isPresent()
            if (r0 == 0) goto L98
            java.lang.Object r5 = r5.get()
            engw r5 = defpackage.engw.r(r5)
            goto L9c
        L98:
            int r5 = defpackage.engw.d
            engw r5 = defpackage.enou.a
        L9c:
            r5.getClass()
            return r5
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amzi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amzi(this.c, this.d, this.e, ffguVar);
    }
}
