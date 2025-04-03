package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkal implements dksm {
    public final Optional a;
    private final djru b;

    public dkal(djru djruVar, Optional optional) {
        this.b = djruVar;
        this.a = optional;
    }

    @Override // defpackage.dksm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dkam dkamVar = (dkam) obj;
        if (dkamVar != null) {
            this.b.a(dkamVar.b(), dkamVar.a());
            ensk h = dkaw.a.h();
            h.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$AvailabilityObserver", "onUpdate", 1332, "RcsProvisioningManager.java")).J("AvailabilityObserver.onUpdate : Notify RcsAvailabilityListener %s onRcsAvailabilityUpdate, SIM = %s, availability = %s", this.b, dktx.SIM_ID.c(dkamVar.b()), dkamVar.a().a);
        }
    }
}
