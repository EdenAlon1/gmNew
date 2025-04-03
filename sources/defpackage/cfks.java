package defpackage;

import androidx.car.app.model.Alert;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfks extends ceut {
    public static final cskc a = cskc.g("BugleDataModel", "EndHeavyWorkWorkHandler");
    public final Set b;
    public final cfkw c;
    public final cflm d;
    private final ffsk e;

    public cfks(ffsk ffskVar, Set set, cfkw cfkwVar, cflm cflmVar) {
        ffskVar.getClass();
        set.getClass();
        cfkwVar.getClass();
        cflmVar.getClass();
        this.e = ffskVar;
        this.b = set;
        this.c = cfkwVar;
        this.d = cflmVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.e(true);
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("EndHeavyWorkWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = eyex.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "heavy_work";
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new cfkr(this, null));
        return c;
    }
}
