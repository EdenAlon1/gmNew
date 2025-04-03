package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmz implements cbmv {
    public final ffbr a;
    private final ffbr b;
    private final ffsk c;

    public cbmz(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.a = ffbrVar2;
        this.c = ffskVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cbmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r8, java.lang.String r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cbmy
            if (r0 == 0) goto L13
            r0 = r10
            cbmy r0 = (defpackage.cbmy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbmy r0 = new cbmy
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r10)
            goto L90
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            cbmz r8 = r0.d
            defpackage.ffci.b(r10)
            goto L6f
        L38:
            defpackage.ffci.b(r10)
            ffbr r10 = r7.b
            java.lang.Object r10 = r10.b()
            cbpg r10 = (defpackage.cbpg) r10
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$FreeTextSearchFilter r2 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$FreeTextSearchFilter
            r2.<init>(r9)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationSearchFilter r9 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationSearchFilter
            java.lang.String r8 = r8.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = defpackage.bdgq.b(r8)
            r9.<init>(r8)
            engw r8 = defpackage.engw.s(r2, r9)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery r8 = com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.d(r8)
            com.google.common.util.concurrent.ListenableFuture r8 = r10.a(r8)
            r8.getClass()
            r0.d = r7
            r0.c = r4
            java.lang.Object r10 = defpackage.fgfz.c(r8, r0)
            if (r10 == r1) goto L94
            r8 = r7
        L6f:
            cbne r10 = (defpackage.cbne) r10
            ffsk r9 = r8.c
            ffhe r2 = defpackage.ffhe.a
            ffsm r4 = defpackage.ffsm.a
            ffhd r2 = defpackage.ekxi.a(r2)
            cbmx r5 = new cbmx
            r6 = 0
            r5.<init>(r6, r8, r10)
            ffss r8 = defpackage.ffra.b(r9, r2, r4, r5)
            r0.d = r6
            r0.c = r3
            java.lang.Object r10 = r8.c(r0)
            if (r10 != r1) goto L90
            goto L94
        L90:
            r10.getClass()
            return r10
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbmz.a(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, java.lang.String, ffgu):java.lang.Object");
    }
}
