package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cktb extends ffhv implements ffji {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ cktd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cktb(cktd cktdVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.e = cktdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r10 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008a -> B:5:0x008d). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.d
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBatchWorker$upgradeEligibleMmsGroups$2"
            java.lang.String r4 = "MmsGroupUpgradeBatchWorker.kt"
            java.lang.String r5 = "BugleGroupManagement"
            r6 = 1
            if (r1 == 0) goto L20
            if (r1 == r6) goto L1c
            int r1 = r9.c
            java.lang.Object r6 = r9.b
            java.lang.Object r7 = r9.a
            defpackage.ffci.b(r10)
            goto L8d
        L1c:
            defpackage.ffci.b(r10)
            goto L36
        L20:
            defpackage.ffci.b(r10)
            cktd r10 = r9.e
            alxl r10 = r10.c
            elfl r10 = r10.j()
            r10.getClass()
            r9.d = r6
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 == r0) goto Lc3
        L36:
            engw r10 = (defpackage.engw) r10
            enru r1 = defpackage.cktd.a
            ensk r1 = r1.h()
            ensn r6 = defpackage.ente.a
            r1.Y(r6, r5)
            r6 = 28
            ensk r1 = r1.h(r3, r2, r6, r4)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r6 = "Upgradable candidate groups: %s"
            r1.t(r6, r10)
            r10.getClass()
            cktd r1 = r9.e
            boolean r6 = r10.isEmpty()
            r7 = 0
            if (r6 == 0) goto L5d
            goto La1
        L5d:
            java.util.Iterator r10 = r10.iterator()
            r6 = r7
            r7 = r1
            r1 = r6
            r6 = r10
        L65:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto La0
            java.lang.Object r10 = r6.next()
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r10 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r10
            r8 = r7
            cktd r8 = (defpackage.cktd) r8
            alxl r8 = r8.c
            elfl r10 = r8.B(r10)
            r10.getClass()
            r9.a = r7
            r9.b = r6
            r9.c = r1
            r8 = 2
            r9.d = r8
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 != r0) goto L8d
            goto Lc3
        L8d:
            r10.getClass()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L65
            int r1 = r1 + 1
            if (r1 >= 0) goto L65
            defpackage.ffdx.k()
            goto L65
        La0:
            r7 = r1
        La1:
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r7)
            int r0 = r10.intValue()
            enru r1 = defpackage.cktd.a
            ensk r1 = r1.h()
            ensn r6 = defpackage.ente.a
            r1.Y(r6, r5)
            r5 = 33
            ensk r1 = r1.h(r3, r2, r5, r4)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "%d groups attempted to upgrade."
            r1.r(r2, r0)
            return r10
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cktb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cktb(this.e, (ffgu) obj).b(ffcu.a);
    }
}
