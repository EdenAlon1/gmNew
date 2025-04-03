package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dehq extends ceut {
    public static final entd a = entd.c("BugleWearable");
    public final dhzj b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;
    private final ffsk f;
    private final ffhd g;

    public dehq(ffbr ffbrVar, dhzj dhzjVar, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        dhzjVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        this.e = ffbrVar;
        this.b = dhzjVar;
        this.f = ffskVar;
        this.g = ffhdVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    public static final Object l(dhre dhreVar, ffgu ffguVar) {
        return fgfz.c(duin.a(dhreVar), ffguVar);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(10);
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.LINEAR);
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("SyncConversationDataToWearableHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = deht.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "wear_sync_queue";
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final /* bridge */ /* synthetic */ boolean h(eyhs eyhsVar) {
        ((deht) eyhsVar).getClass();
        ekzz f = eleg.f("SyncConversationDataToWearableHandler#preflight");
        try {
            if (((cvhr) this.e.b()).b()) {
                ffig.a(f, null);
                return true;
            }
            ensk o = a.o();
            o.Y(csux.O, "SyncConversationDataToWearableHandler");
            o.q("Skipping sync conversation data to wear devices.");
            ffig.a(f, null);
            return false;
        } finally {
        }
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        deht dehtVar = (deht) eyhsVar;
        dehtVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new dehp(dehtVar, this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dehn
            if (r0 == 0) goto L13
            r0 = r7
            dehn r0 = (defpackage.dehn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dehn r0 = new dehn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.g
            ffhd r7 = defpackage.ekxi.a(r7)
            dehm r2 = new dehm
            r4 = 0
            r2.<init>(r4, r6, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dehq.k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }
}
