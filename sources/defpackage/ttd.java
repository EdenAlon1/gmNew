package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ttd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttd(tte tteVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tteVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ttd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a6, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a9, code lost:
    
        r9 = (defpackage.eyja) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
    
        if (r9.equals(defpackage.eykm.c) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:
    
        ((defpackage.axkm) r8.b.b.b()).X(r9);
        r0 = defpackage.tte.a.h();
        r0.Y(defpackage.ente.a, "BugleCms");
        r0 = (defpackage.enrr) r0;
        r0.Y(defpackage.csux.O, "CmsDailyTimestampObjectUpdateSyncletTask");
        ((defpackage.enrr) r0.h("com/google/android/apps/messaging/cloudstore/synclet/synclettasks/cmsdailytimestampobjectupdate/CmsDailyTimestampObjectUpdateSyncletTask$run$1", "invokeSuspend", 89, "CmsDailyTimestampObjectUpdateSyncletTask.kt")).t("Updated Cms Settings Data for dailyRetrievedCmsTimestamp with timestamp: %s.", defpackage.eykm.i(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e5, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0014, code lost:
    
        if (r1 != 1) goto L19;
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
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/cloudstore/synclet/synclettasks/cmsdailytimestampobjectupdate/CmsDailyTimestampObjectUpdateSyncletTask$run$1"
            java.lang.String r5 = "CmsDailyTimestampObjectUpdateSyncletTask.kt"
            java.lang.String r6 = "CmsDailyTimestampObjectUpdateSyncletTask"
            java.lang.String r7 = "BugleCms"
            defpackage.ffci.b(r9)
            if (r1 == 0) goto L18
            if (r1 == r2) goto L5a
            goto La9
        L18:
            tte r9 = r8.b
            asik r9 = r9.e
            boolean r9 = r9.a()
            if (r9 != 0) goto L44
            enru r9 = defpackage.tte.a
            ensk r9 = r9.h()
            ensn r0 = defpackage.ente.a
            r9.Y(r0, r7)
            enrr r9 = (defpackage.enrr) r9
            ensn r0 = defpackage.csux.O
            r9.Y(r0, r6)
            r0 = 67
            ensk r9 = r9.h(r4, r3, r0, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Skipping CmsDailyTimestampObjectUpdate run because delta sync flags are off."
            r9.q(r0)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L44:
            tte r9 = r8.b
            ffbr r9 = r9.b
            java.lang.Object r9 = r9.b()
            axkm r9 = (defpackage.axkm) r9
            elfl r9 = r9.k()
            r8.a = r2
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 == r0) goto Le6
        L5a:
            tte r1 = r8.b
            axez r9 = (defpackage.axez) r9
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            axmm r1 = (defpackage.axmm) r1
            r9.getClass()
            boolean r9 = defpackage.axmm.n(r9)
            if (r9 != 0) goto L91
            enru r9 = defpackage.tte.a
            ensk r9 = r9.h()
            ensn r0 = defpackage.ente.a
            r9.Y(r0, r7)
            enrr r9 = (defpackage.enrr) r9
            ensn r0 = defpackage.csux.O
            r9.Y(r0, r6)
            r0 = 79
            ensk r9 = r9.h(r4, r3, r0, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Skipping CmsDailyTimestampObjectUpdate run because initial sync is not complete."
            r9.q(r0)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L91:
            tte r9 = r8.b
            ffbr r9 = r9.c
            java.lang.Object r9 = r9.b()
            crty r9 = (defpackage.crty) r9
            elfl r9 = r9.l()
            r1 = 2
            r8.a = r1
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 != r0) goto La9
            goto Le6
        La9:
            eyja r9 = (defpackage.eyja) r9
            eyja r0 = defpackage.eykm.c
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Le3
            tte r0 = r8.b
            ffbr r0 = r0.b
            java.lang.Object r0 = r0.b()
            axkm r0 = (defpackage.axkm) r0
            r0.X(r9)
            enru r0 = defpackage.tte.a
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r7)
            enrr r0 = (defpackage.enrr) r0
            ensn r1 = defpackage.csux.O
            r0.Y(r1, r6)
            r1 = 89
            ensk r0 = r0.h(r4, r3, r1, r5)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r9 = defpackage.eykm.i(r9)
            java.lang.String r1 = "Updated Cms Settings Data for dailyRetrievedCmsTimestamp with timestamp: %s."
            r0.t(r1, r9)
        Le3:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ttd(this.b, ffguVar);
    }
}
