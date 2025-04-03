package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckur extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckut b;
    final /* synthetic */ ckuk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckur(ffgu ffguVar, ckut ckutVar, ckuk ckukVar) {
        super(2, ffguVar);
        this.b = ckutVar;
        this.c = ckukVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckur) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r6 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L80
        Ld:
            defpackage.ffci.b(r6)
            goto L35
        L11:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            ffsk r6 = (defpackage.ffsk) r6
            ckut r6 = r5.b
            ckuk r1 = r5.c
            akzt r6 = r6.c
            java.lang.String r3 = "Bugle.Rcs.Groups.MmsGroupUpgrade.SyncletResult.Counts"
            int r1 = r1.b
            r6.e(r3, r1)
            ckuk r6 = r5.c
            boolean r6 = r6 instanceof defpackage.ckue
            if (r6 == 0) goto L67
            ckut r6 = r5.b
            r5.a = r2
            java.lang.Object r6 = r6.d(r5)
            if (r6 == r0) goto L7f
        L35:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            enru r0 = defpackage.ckut.a
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleGroupManagement"
            r0.Y(r1, r2)
            java.lang.String r1 = "invokeSuspend"
            r2 = 179(0xb3, float:2.51E-43)
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeSynclet$logSyncResult$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "MmsGroupUpgradeSynclet.kt"
            ensk r0 = r0.h(r3, r1, r2, r4)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "Sync has been cancelled %d times in a row."
            r0.r(r1, r6)
            ckut r0 = r5.b
            akzt r0 = r0.c
            java.lang.String r1 = "Bugle.Rcs.Groups.MmsGroupUpgrade.ConsecutiveSyncletCancellations.Counts"
            r0.e(r1, r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L67:
            ckut r6 = r5.b
            r1 = 2
            r5.a = r1
            ckuc r1 = new ckuc
            r1.<init>()
            effy r6 = r6.e
            java.lang.Object r6 = defpackage.ctzl.b(r6, r1, r5)
            ffhh r1 = defpackage.ffhh.a
            if (r6 == r1) goto L7d
            ffcu r6 = defpackage.ffcu.a
        L7d:
            if (r6 != r0) goto L80
        L7f:
            return r0
        L80:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckur.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ckur ckurVar = new ckur(ffguVar, this.b, this.c);
        ckurVar.d = obj;
        return ckurVar;
    }
}
