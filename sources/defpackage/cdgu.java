package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgu extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/BackupNowIncrementalWorkHandler");
    public final Context b;
    public final babm c;
    public final cqoh d;
    public final axkm e;
    private final ffsk f;
    private final ccjn g;

    /* compiled from: PG */
    public interface a {
        cdhe bN();
    }

    public cdgu(ffsk ffskVar, Context context, babm babmVar, ccjn ccjnVar, cqoh cqohVar, axkm axkmVar) {
        ffskVar.getClass();
        context.getClass();
        babmVar.getClass();
        cqohVar.getClass();
        axkmVar.getClass();
        this.f = ffskVar;
        this.b = context;
        this.c = babmVar;
        this.g = ccjnVar;
        this.d = cqohVar;
        this.e = axkmVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.FOREGROUND_SERVICE);
        l.e(true);
        ceti cetiVar = (ceti) l;
        cetiVar.e = Optional.of(1);
        cetiVar.b = this.g.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        ekzz f = eleg.f("BackupNowIncrementalWorkHandler");
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
        c = axol.c(this.f, ffhe.a, ffsm.a, new cdgv(this, cdvxVar, null));
        return c;
    }
}
