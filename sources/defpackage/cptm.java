package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cptm extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler");
    public final cpvp b;
    public final cqoh c;
    private final ffsk d;

    public cptm(ffsk ffskVar, cpvp cpvpVar, cqoh cqohVar) {
        ffskVar.getClass();
        cqohVar.getClass();
        this.d = ffskVar;
        this.b = cpvpVar;
        this.c = cqohVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.f(poa.LINEAR);
        ((ceti) l).a = new poj(true, 13);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IncrementalReverseSyncWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cpwe.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cpwe cpweVar = (cpwe) eyhsVar;
        cpweVar.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new cptl(this, cpweVar, null));
        return c;
    }
}
