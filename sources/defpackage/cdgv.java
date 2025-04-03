package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdgv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdgu b;
    final /* synthetic */ cdvx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdgv(cdgu cdguVar, cdvx cdvxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdguVar;
        this.c = cdvxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdgv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        if (defpackage.fgfz.c(r9, r8) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r9.a(r8) != r0) goto L18;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/BackupNowIncrementalWorkHandler$processPendingWorkItemAsync$1"
            java.lang.String r4 = "BackupNowIncrementalWorkHandler.kt"
            java.lang.String r5 = "BugleCms"
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L23
            if (r1 == r7) goto L1d
            if (r1 == r6) goto L19
            defpackage.ffci.b(r9)     // Catch: java.lang.Exception -> L21
            goto Lab
        L19:
            defpackage.ffci.b(r9)     // Catch: java.lang.Exception -> L21
            goto L6d
        L1d:
            defpackage.ffci.b(r9)     // Catch: java.lang.Exception -> L21
            goto L53
        L21:
            r9 = move-exception
            goto L8d
        L23:
            defpackage.ffci.b(r9)
            enru r9 = defpackage.cdgu.a
            ensk r9 = r9.h()
            ensn r1 = defpackage.ente.a
            r9.Y(r1, r5)
            r1 = 67
            ensk r9 = r9.h(r3, r2, r1, r4)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r1 = "Running delayed incremental backup now worker."
            r9.q(r1)
            cdgu r9 = r8.b     // Catch: java.lang.Exception -> L21
            babm r9 = r9.c     // Catch: java.lang.Exception -> L21
            cdvx r1 = r8.c     // Catch: java.lang.Exception -> L21
            int r1 = r1.c     // Catch: java.lang.Exception -> L21
            elfl r9 = r9.b(r1)     // Catch: java.lang.Exception -> L21
            r8.a = r7     // Catch: java.lang.Exception -> L21
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)     // Catch: java.lang.Exception -> L21
            if (r9 != r0) goto L53
            goto L8c
        L53:
            eisx r9 = (defpackage.eisx) r9     // Catch: java.lang.Exception -> L21
            cdgu r1 = r8.b     // Catch: java.lang.Exception -> L21
            android.content.Context r1 = r1.b     // Catch: java.lang.Exception -> L21
            java.lang.Class<cdgu$a> r7 = cdgu.a.class
            java.lang.Object r9 = defpackage.ekhv.a(r1, r7, r9)     // Catch: java.lang.Exception -> L21
            cdgu$a r9 = (cdgu.a) r9     // Catch: java.lang.Exception -> L21
            cdhe r9 = r9.bN()     // Catch: java.lang.Exception -> L21
            r8.a = r6     // Catch: java.lang.Exception -> L21
            java.lang.Object r9 = r9.a(r8)     // Catch: java.lang.Exception -> L21
            if (r9 == r0) goto L8c
        L6d:
            cdgu r9 = r8.b     // Catch: java.lang.Exception -> L21
            axkm r1 = r9.e     // Catch: java.lang.Exception -> L21
            cqoh r9 = r9.d     // Catch: java.lang.Exception -> L21
            j$.time.Instant r9 = r9.f()     // Catch: java.lang.Exception -> L21
            long r6 = r9.toEpochMilli()     // Catch: java.lang.Exception -> L21
            eyja r9 = defpackage.eykm.d(r6)     // Catch: java.lang.Exception -> L21
            elfl r9 = r1.y(r9)     // Catch: java.lang.Exception -> L21
            r1 = 3
            r8.a = r1     // Catch: java.lang.Exception -> L21
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)     // Catch: java.lang.Exception -> L21
            if (r9 != r0) goto Lab
        L8c:
            return r0
        L8d:
            enru r0 = defpackage.cdgu.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r5)
            enrr r0 = (defpackage.enrr) r0
            ensk r9 = r0.g(r9)
            r0 = 92
            ensk r9 = r9.h(r3, r2, r0, r4)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Backup now failed."
            r9.q(r0)
        Lab:
            ceyt r9 = defpackage.ceyt.i()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdgv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdgv(this.b, this.c, ffguVar);
    }
}
