package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdbl extends ceuj {
    private final cddx a;
    private final ccjn b;

    public cdbl(cddx cddxVar, ccjn ccjnVar) {
        this.a = cddxVar;
        this.b = ccjnVar;
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        Object e = cdce.a.e();
        e.getClass();
        l.d(((Number) e).intValue());
        l.b(cevc.FOREGROUND_SERVICE);
        l.f(poa.EXPONENTIAL);
        poh pohVar = new poh();
        pohVar.c(4);
        ceti cetiVar = (ceti) l;
        cetiVar.a = pohVar.a();
        Object e2 = cddx.b.e();
        e2.getClass();
        l.g(((Number) e2).longValue());
        l.e(true);
        cetiVar.e = Optional.of(1);
        cetiVar.b = this.b.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsBatchBackupForegroundServiceWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = ccce.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, engw engwVar) {
        engwVar.getClass();
        elfl d = this.a.d(engwVar, true);
        d.getClass();
        return d;
    }
}
