package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cppa extends ceut {
    public final cpip a;
    public final ffbr b;
    private final ffsk c;
    private final ffbr d;

    public cppa(cpip cpipVar, ffbr ffbrVar, ffsk ffskVar, ffbr ffbrVar2) {
        cpipVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        this.a = cpipVar;
        this.b = ffbrVar;
        this.c = ffskVar;
        this.d = ffbrVar2;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c((int) ((Number) this.d.b()).longValue());
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.EXPONENTIAL);
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("SyncRcsGroupsWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cpoy.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cpoy cpoyVar = (cpoy) eyhsVar;
        cpoyVar.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new cpoz(this, cpoyVar, null));
        return c;
    }
}
