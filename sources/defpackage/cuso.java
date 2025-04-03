package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuso extends ceut {
    public final ffbr a;
    private final ffsk b;

    public cuso(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffskVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        l.b(cevc.WORKMANAGER_ONLY);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("SpamReclassificationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cusr.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cusr cusrVar = (cusr) eyhsVar;
        cusrVar.getClass();
        c = axol.c(this.b, ffhe.a, ffsm.a, new cusn(this, cusrVar, null));
        return c;
    }
}
