package defpackage;

import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkav implements dksm {
    private final Function a;
    private final Function b;
    private final cort c;
    private final clwo d;
    private final azle e;

    public dkav(azle azleVar, Function function, Function function2, cort cortVar, clwo clwoVar) {
        this.e = azleVar;
        this.a = function;
        this.b = function2;
        this.c = cortVar;
        this.d = clwoVar;
    }

    @Override // defpackage.dksm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object apply;
        dkam dkamVar = (dkam) obj;
        if (dkamVar == null) {
            return;
        }
        djtc a = dkamVar.a();
        if (!a.c()) {
            ensk h = dkaw.a.h();
            h.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$RcsVerifiedPhoneNumberListenerAvailabilityObserver", "onUpdate", 1412, "RcsProvisioningManager.java")).t("Cannot notify RcsVerifiedPhoneNumberListener because current availability is %s instead of AVAILABLE.", a.a.name());
            return;
        }
        djro djroVar = new djro(dkamVar.b());
        cosz coszVar = (cosz) this.c.j(djroVar).orElse(null);
        if (coszVar == null) {
            ensk j = dkaw.a.j();
            j.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$RcsVerifiedPhoneNumberListenerAvailabilityObserver", "onUpdate", 1424, "RcsProvisioningManager.java")).t("No SimSubscriptionInfo for sim with id: %s", dktx.SIM_ID.c(dkamVar.b()));
            this.d.b(djroVar);
            return;
        }
        apply = this.b.apply(dkamVar.b());
        Optional flatMap = ((Optional) apply).flatMap(this.a);
        if (flatMap.isEmpty()) {
            ensk j2 = dkaw.a.j();
            j2.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) j2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$RcsVerifiedPhoneNumberListenerAvailabilityObserver", "onUpdate", 1436, "RcsProvisioningManager.java")).t("No verified phone number for sim with id: %s", dktx.SIM_ID.c(dkamVar.b()));
            this.d.a(djroVar);
            return;
        }
        azle azleVar = this.e;
        djrj djrjVar = (djrj) flatMap.get();
        if (azleVar.b.a()) {
            azlv azlvVar = (azlv) azleVar.a.b();
            axol.k(azlvVar.d, null, new azlu(azlvVar, coszVar, djrjVar, null), 3);
        }
    }
}
