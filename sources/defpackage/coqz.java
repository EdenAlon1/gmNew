package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqz implements coqy {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public coqz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar6.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar5;
        this.e = ffbrVar6;
    }

    private final void c(corq corqVar, long j, eraj erajVar) {
        ((enrr) a.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl", "scheduleWorkWithPwq", 67, "SimStateSchedulerImpl.kt")).J("Scheduling %s using PWQ. Delay Seconds: %s, UpdateTrigger: %s", corqVar.name(), Long.valueOf(j), erajVar);
        corg corgVar = (corg) this.d.b();
        core coreVar = (core) corf.a.createBuilder();
        coreVar.getClass();
        corqVar.getClass();
        coreVar.copyOnWrite();
        corf corfVar = (corf) coreVar.instance;
        corfVar.c = corqVar.a();
        corfVar.b |= 1;
        coreVar.copyOnWrite();
        corf corfVar2 = (corf) coreVar.instance;
        corfVar2.e = erajVar.a();
        corfVar2.b |= 2;
        eyfy build = coreVar.build();
        build.getClass();
        cetp cetpVar = new cetp();
        cetpVar.c = Duration.ofSeconds(j);
        cetpVar.b = "sim_state_update_deduplication_tag".concat(String.valueOf(corqVar.name()));
        cetpVar.a = corqVar.name();
        ((cevh) corgVar.a.b()).a(ceyr.h("sim_state_update", (corf) build, cetpVar.a()));
        cosh coshVar = (cosh) this.e.b();
        corqVar.getClass();
        ((akzt) coshVar.a.b()).e("Bugle.Dsdr.SimStateScheduler", corqVar.ordinal());
    }

    @Override // defpackage.coqy
    public final void a(eraj erajVar) {
        erajVar.getClass();
        ffbr ffbrVar = this.b;
        corq corqVar = corq.WORK_TYPE_VERIFY_SIM_REMOVAL;
        Object b = ffbrVar.b();
        b.getClass();
        c(corqVar, ((Number) b).longValue(), erajVar);
    }

    @Override // defpackage.coqy
    public final void b(eraj erajVar) {
        erajVar.getClass();
        enrr enrrVar = (enrr) a.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl", "scheduleUpdatePhoneSimsState", 40, "SimStateSchedulerImpl.kt");
        Object b = this.c.b();
        b.getClass();
        enrrVar.A("Scheduling UPDATE_PHONE_SIMS_STATE. Delay Seconds: %s, UpdateTrigger: %s", ((Number) b).longValue(), erajVar.name());
        ffbr ffbrVar = this.c;
        corq corqVar = corq.WORK_TYPE_UPDATE_PHONE_SIMS_STATE;
        Object b2 = ffbrVar.b();
        b2.getClass();
        c(corqVar, ((Number) b2).longValue(), erajVar);
    }
}
