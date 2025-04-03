package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqpu extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/ParticipantContactSyncHandler");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;

    public aqpu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.e = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(5);
        l.f(poa.EXPONENTIAL);
        l.g(1000L);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ContactRecipientDeletedSyncHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = aqpw.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        aqpw aqpwVar = (aqpw) eyhsVar;
        aqpwVar.getClass();
        Object b = this.e.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new aqpt(aqpwVar, this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aqpp
            if (r0 == 0) goto L13
            r0 = r7
            aqpp r0 = (defpackage.aqpp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqpp r0 = new aqpp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L4e
        L28:
            r6 = move-exception
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r7)
            ffbr r7 = r5.b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L28
            r7.getClass()     // Catch: java.lang.Throwable -> L28
            ffhd r7 = (defpackage.ffhd) r7     // Catch: java.lang.Throwable -> L28
            aqpr r2 = new aqpr     // Catch: java.lang.Throwable -> L28
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L28
            r0.c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L4e
            return r1
        L4e:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r7 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r7     // Catch: java.lang.Throwable -> L28
            return r7
        L51:
            enru r7 = defpackage.aqpu.a
            ensk r7 = r7.i()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleRecipientSync"
            r7.Y(r0, r1)
            enrr r7 = (defpackage.enrr) r7
            ensk r6 = r7.g(r6)
            java.lang.String r7 = "getParticipant"
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/api/messaging/recipient/sync/ParticipantContactSyncHandler"
            java.lang.String r2 = "ParticipantContactSyncHandler.kt"
            ensk r6 = r6.h(r1, r7, r0, r2)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r7 = "ParticipantContactSync: failed to read participant"
            r6.q(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqpu.k(java.lang.String, ffgu):java.lang.Object");
    }
}
