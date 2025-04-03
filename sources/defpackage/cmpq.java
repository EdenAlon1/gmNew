package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmpq extends ceut {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/rcsprovisioning/tychogrpc/FiMultiSyncGrpcHandler");
    private final ffsk b;
    private final cmel c;
    private final ffbr d;
    private final ffbr e;
    private final cmpx f;

    public cmpq(ffsk ffskVar, cmpx cmpxVar, cmel cmelVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        cmelVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = ffskVar;
        this.f = cmpxVar;
        this.c = cmelVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
    }

    private final void l(String str, desq desqVar) {
        int ordinal = desqVar.ordinal();
        int i = 2;
        if (ordinal != 1) {
            int i2 = 3;
            if (ordinal != 2) {
                i = 4;
                if (ordinal != 3) {
                    i2 = 5;
                    if (ordinal != 4) {
                        i = ordinal != 5 ? 7 : 6;
                    }
                }
            }
            i = i2;
        }
        ((cmqb) this.d.b()).b(str, i);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.EXPONENTIAL);
        l.g(((Long) djai.t().a.ay.a()).longValue() * 1000);
        l.c(((Integer) djai.t().a.az.a()).intValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("FiMultiSyncGrpcHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cmps.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "fi_multi_sync_grpc_queue";
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cmps cmpsVar = (cmps) eyhsVar;
        cmpsVar.getClass();
        c = axol.c(this.b, ffhe.a, ffsm.a, new cmpp(this, cmpsVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.cmps r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpq.k(cmps, ffgu):java.lang.Object");
    }
}
