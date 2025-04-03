package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdhb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdia b;
    final /* synthetic */ cdhe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdhb(cdia cdiaVar, cdhe cdheVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdiaVar;
        this.c = cdheVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdhb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r6.a(r5) == r0) goto L20;
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L11
            goto L7d
        Ld:
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L11
            goto L4b
        L11:
            r6 = move-exception
            goto L57
        L13:
            defpackage.ffci.b(r6)
            cdia r6 = r5.b     // Catch: java.lang.Exception -> L11
            r5.a = r2     // Catch: java.lang.Exception -> L11
            cdif r1 = new cdif     // Catch: java.lang.Exception -> L11
            r2 = r6
            cdig r2 = (defpackage.cdig) r2     // Catch: java.lang.Exception -> L11
            cdrg r2 = r2.c     // Catch: java.lang.Exception -> L11
            r3 = r6
            cdig r3 = (defpackage.cdig) r3     // Catch: java.lang.Exception -> L11
            ffbr r3 = r3.d     // Catch: java.lang.Exception -> L11
            r4 = r6
            cdig r4 = (defpackage.cdig) r4     // Catch: java.lang.Exception -> L11
            ffbr r4 = r4.e     // Catch: java.lang.Exception -> L11
            cdig r6 = (defpackage.cdig) r6     // Catch: java.lang.Exception -> L11
            ffhd r6 = r6.f     // Catch: java.lang.Exception -> L11
            r1.<init>(r2, r3, r4, r6)     // Catch: java.lang.Exception -> L11
            ffhd r6 = r1.b     // Catch: java.lang.Exception -> L11
            cdid r2 = new cdid     // Catch: java.lang.Exception -> L11
            r3 = 0
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L11
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r5)     // Catch: java.lang.Exception -> L11
            ffhh r1 = defpackage.ffhh.a     // Catch: java.lang.Exception -> L11
            if (r6 == r1) goto L44
            ffcu r6 = defpackage.ffcu.a     // Catch: java.lang.Exception -> L11
        L44:
            if (r6 == r1) goto L48
            ffcu r6 = defpackage.ffcu.a     // Catch: java.lang.Exception -> L11
        L48:
            if (r6 != r0) goto L4b
            goto L56
        L4b:
            cdhe r6 = r5.c     // Catch: java.lang.Exception -> L11
            r1 = 2
            r5.a = r1     // Catch: java.lang.Exception -> L11
            java.lang.Object r6 = r6.a(r5)     // Catch: java.lang.Exception -> L11
            if (r6 != r0) goto L7d
        L56:
            return r0
        L57:
            enru r0 = defpackage.cdgz.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleCms"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r6 = r0.g(r6)
            java.lang.String r0 = "invokeSuspend"
            r1 = 118(0x76, float:1.65E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/DelayedIncrementalWorkHandler$processPendingWorkItemAsync$1$1"
            java.lang.String r3 = "DelayedIncrementalWorkHandler.kt"
            ensk r6 = r6.h(r2, r0, r1, r3)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r0 = "Delayed incremental delegate failed."
            r6.q(r0)
        L7d:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdhb(this.b, this.c, ffguVar);
    }
}
