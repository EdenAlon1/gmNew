package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class djzl implements Function {
    public final /* synthetic */ dkaw a;

    public /* synthetic */ djzl(dkaw dkawVar) {
        this.a = dkawVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        dkaq dkaqVar = (dkaq) obj;
        Optional ofNullable = Optional.ofNullable(dkaqVar.b());
        Optional a = dkaqVar.a();
        dkaw dkawVar = this.a;
        String str = (String) ofNullable.orElse(((dkpp) dkawVar.c.b()).l());
        ensk h = dkaw.a.h();
        h.Y(ente.a, "RcsProvisioningManager");
        ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "combineConfigurationWithAvailability", 651, "RcsProvisioningManager.java")).E("combineConfigurationWithAvailability, simId = %s, hasConfig = %s", dktx.SIM_ID.c(str), a.isPresent());
        Optional n = dkawVar.n(str);
        if (n.isEmpty()) {
            return new djzb(str, a);
        }
        djtc a2 = ((cmmu) n.get()).a(str);
        if (a2.c()) {
            if (a.isEmpty()) {
                ensk h2 = dkaw.a.h();
                h2.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "combineConfigurationWithAvailability", 664, "RcsProvisioningManager.java")).q("combineConfigurationWithAvailability, optionalConfiguration is not present, get config from ProvisioningEngineAdapter");
                a = ((cmmu) n.get()).b(str);
            }
            if (a.isPresent() && ((djtp) a.get()).Z()) {
                return new djzb(str, a);
            }
            ensk j = dkaw.a.j();
            j.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "combineConfigurationWithAvailability", 674, "RcsProvisioningManager.java")).q("combineConfigurationWithAvailability, RCS is available but configuration is not valid, return empty configuration");
        } else {
            ensk j2 = dkaw.a.j();
            j2.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) j2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "combineConfigurationWithAvailability", 678, "RcsProvisioningManager.java")).t("combineConfigurationWithAvailability, RCS is not available (%s), return empty configuration", a2);
        }
        return new djzb(str, Optional.empty());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
