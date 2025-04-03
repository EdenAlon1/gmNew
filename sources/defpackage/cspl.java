package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspl extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterHandler");
    public final cspj b;
    public final csjk c;
    private final ffsk d;

    public cspl(ffsk ffskVar, cspj cspjVar, csjk csjkVar) {
        ffskVar.getClass();
        csjkVar.getClass();
        this.d = ffskVar;
        this.b = cspjVar;
        this.c = csjkVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(5);
        l.b(cevc.WAKELOCK);
        l.f(poa.LINEAR);
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("SatelliteNetworkStateUpdaterHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cspo.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cspo cspoVar = (cspo) eyhsVar;
        cspoVar.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new cspk(cspoVar, this, ceuwVar, null));
        return c;
    }
}
