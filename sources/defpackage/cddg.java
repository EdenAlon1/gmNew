package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cddg extends ceuj {
    private final cddx a;

    public cddg(cddx cddxVar) {
        this.a = cddxVar;
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.d(((Integer) cdce.a.e()).intValue());
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.EXPONENTIAL);
        poh pohVar = new poh();
        pohVar.c(4);
        ((ceti) l).a = pohVar.a();
        l.g(((Long) cddx.b.e()).longValue());
        l.e(true);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsBatchBackupWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ccce.a.getParserForType();
    }

    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, engw engwVar) {
        return this.a.d(engwVar, false);
    }
}
