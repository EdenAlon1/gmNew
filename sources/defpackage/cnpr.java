package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpr implements cnpq {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorkManagerImpl");
    private final ejoc b;
    private final Duration c;

    public cnpr(ejoc ejocVar, Duration duration) {
        ejocVar.getClass();
        this.b = ejocVar;
        this.c = duration;
    }

    @Override // defpackage.cnpq
    public final void a() {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorkManagerImpl", "cancelWork", 53, "PeriodPullWorkManagerImpl.kt")).q("Cancel period pull work.");
        axnw.h(this.b.a("PeriodicPullWorker"));
    }

    @Override // defpackage.cnpq
    public final void b() {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorkManagerImpl", "scheduleWork", 28, "PeriodPullWorkManagerImpl.kt")).q("Schedule period pull work.");
        ejoe n = ejoi.n(cnpt.class);
        n.g(new ejnx("PeriodicPullWorker", poz.CANCEL_AND_REENQUEUE));
        ((ejnt) n).c = new ejnw(0L, TimeUnit.MILLISECONDS);
        n.e(new ejnv(new ejnw(this.c.toMinutes(), TimeUnit.MINUTES), emux.a));
        axnw.h(this.b.c(n.h()));
    }
}
