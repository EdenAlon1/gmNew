package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgz extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/DelayedIncrementalWorkHandler");
    public final Context b;
    public final babm c;
    public final cqoh d;
    public final axkm e;
    public final cdgx f;
    public ffud g;
    private final ffsk h;

    /* compiled from: PG */
    public interface a {
        cdhe bN();

        cdia bO();
    }

    static {
        cfvl.l(cfvl.b, "cms_delayed_incremental_invocation_period_minutes", 120L);
    }

    public cdgz(ffsk ffskVar, Context context, babm babmVar, cqoh cqohVar, axkm axkmVar, cdgx cdgxVar) {
        ffskVar.getClass();
        context.getClass();
        babmVar.getClass();
        cqohVar.getClass();
        axkmVar.getClass();
        cdgxVar.getClass();
        this.h = ffskVar;
        this.b = context;
        this.c = babmVar;
        this.d = cqohVar;
        this.e = axkmVar;
        this.f = cdgxVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        l.e(true);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        ekzz f = eleg.f("DelayedIncrementalWorkHandler");
        ffig.a(f, null);
        return f;
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cdvx.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "cms_delayed_incremental_sync_worker_queue";
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cdvx cdvxVar = (cdvx) eyhsVar;
        cdvxVar.getClass();
        c = axol.c(this.h, ffhe.a, ffsm.a, new cdhc(this, cdvxVar, null));
        return c;
    }
}
