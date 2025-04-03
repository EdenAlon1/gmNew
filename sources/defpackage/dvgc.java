package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvgc extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dvgf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvgc(dvgf dvgfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dvgfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvgc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r5 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r5 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 == r2) goto L13
            java.lang.Object r0 = r4.a
            defpackage.ffci.b(r5)
            goto L88
        L13:
            java.lang.Object r1 = r4.a
            defpackage.ffci.b(r5)
            goto L56
        L19:
            defpackage.ffci.b(r5)
            goto L35
        L1d:
            defpackage.ffci.b(r5)
            dvgf r5 = r4.c
            fazb r5 = r5.b
            java.lang.Object r5 = r5.b()
            r5.getClass()
            com.google.common.util.concurrent.ListenableFuture r5 = (com.google.common.util.concurrent.ListenableFuture) r5
            r4.b = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L8e
        L35:
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r1 = "GNP_JOBS_WERE_SCHEDULED"
            r3 = 0
            boolean r1 = r5.getBoolean(r1, r3)
            if (r1 == 0) goto L43
            ffcu r5 = defpackage.ffcu.a
            return r5
        L43:
            android.content.SharedPreferences$Editor r1 = r5.edit()
            dvgf r3 = r4.c
            r1.getClass()
            r4.a = r1
            r4.b = r2
            java.lang.Object r5 = r3.c(r5, r1, r4)
            if (r5 == r0) goto L8e
        L56:
            dvgf r5 = r4.c
            android.content.Context r5 = r5.c
            java.lang.String r2 = "jobscheduler"
            java.lang.Object r5 = r5.getSystemService(r2)
            r5.getClass()
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            r2 = 1573857706(0x5dcf29aa, float:1.86595617E18)
            r5.cancel(r2)
            r2 = 1573857705(0x5dcf29a9, float:1.86595603E18)
            r5.cancel(r2)
            r2 = 1573857707(0x5dcf29ab, float:1.86595631E18)
            r5.cancel(r2)
            dvgf r5 = r4.c
            r1.getClass()
            r4.a = r1
            r2 = 3
            r4.b = r2
            java.lang.Object r5 = r5.d(r1, r4)
            if (r5 == r0) goto L8e
            r0 = r1
        L88:
            r0.apply()
            ffcu r5 = defpackage.ffcu.a
            return r5
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvgc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvgc(this.c, ffguVar);
    }
}
