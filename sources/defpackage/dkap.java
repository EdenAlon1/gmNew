package defpackage;

import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkap implements dksm {
    public final djrx a;
    public final Optional b;
    private final Function c;

    public dkap(djrx djrxVar, Optional optional, Function function) {
        this.a = djrxVar;
        this.b = optional;
        this.c = function;
    }

    @Override // defpackage.dksm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object apply;
        dkaq dkaqVar = (dkaq) obj;
        if (dkaqVar != null) {
            if (this.b.isEmpty() || ((String) this.b.get()).equals(dkaqVar.b())) {
                if (dkaqVar.a().isPresent() && ((djtp) dkaqVar.a().get()).Z()) {
                    apply = this.c.apply(dkaqVar);
                    dkaqVar = (dkaq) apply;
                }
                this.a.gh(dkaqVar.b(), dkaqVar.a());
                ensk h = dkaw.a.h();
                h.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$ConfigurationObserver", "onUpdate", 1287, "RcsProvisioningManager.java")).J("Notify RcsConfigurationListener %s onRcsConfigurationUpdate, SIM = %s, hasConfiguration = %s", this.a, dktx.SIM_ID.c(dkaqVar.b()), Boolean.valueOf(dkaqVar.a().isPresent()));
            }
        }
    }
}
