package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgy implements cdgx {
    private static final cfup a = cfvl.l(cfvl.b, "cms_delayed_incremental_delay_in_hours", 2);
    private final cdhd b;
    private final cdgw c;

    public cdgy(cdhd cdhdVar, cdgw cdgwVar) {
        cdhdVar.getClass();
        cdgwVar.getClass();
        this.b = cdhdVar;
        this.c = cdgwVar;
    }

    private static final cfkl d() {
        cetp cetpVar = new cetp();
        cetpVar.b = "scheduled_worker";
        Object e = a.e();
        e.getClass();
        cetpVar.c = Duration.ofHours(((Number) e).longValue());
        return cetpVar.a();
    }

    @Override // defpackage.cdgx
    public final ceyt a(int i) {
        cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
        cdvwVar.getClass();
        cdvv.b(i, cdvwVar);
        return ceyt.j(engw.r(ceyr.h("delayed_incremental_work_handler", cdvv.a(cdvwVar), d())));
    }

    @Override // defpackage.cdgx
    public final void b(int i) {
        this.b.a();
        cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
        cdvwVar.getClass();
        cdvv.b(i, cdvwVar);
        cdvx a2 = cdvv.a(cdvwVar);
        cetp cetpVar = new cetp();
        cetpVar.b = "backup_now_worker";
        ((cevh) this.c.a.b()).a(ceyr.h("backup_now_incremental_work_handler", a2, cetpVar.a()));
    }

    @Override // defpackage.cdgx
    public final void c(int i) {
        cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
        cdvwVar.getClass();
        cdvv.b(i, cdvwVar);
        cdvx a2 = cdvv.a(cdvwVar);
        ((cevh) this.b.a.b()).a(ceyr.h("delayed_incremental_work_handler", a2, d()));
    }
}
