package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cisk extends ceuj {
    public final ffbr a;
    private final csxu b;
    private final errl c;

    public cisk(ffbr ffbrVar, csxu csxuVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = csxuVar;
        this.c = errlVar;
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ceti cetiVar = (ceti) l;
        cetiVar.c = eogt.REFRESH_STATEFUL_NOTIFICATIONS_ACTION;
        l.d(20);
        cetiVar.d = Duration.ofMillis(this.b.c("bugle_refresh_notification_backoff_duration_in_millis", 100L));
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RefreshMessageFailureNotificationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, engw engwVar) {
        return elfo.f(new Runnable() { // from class: cisi
            @Override // java.lang.Runnable
            public final void run() {
                ((cins) cisk.this.a.b()).C();
            }
        }, this.c).h(new emwl() { // from class: cisj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ceyt.i();
            }
        }, erpp.a);
    }
}
