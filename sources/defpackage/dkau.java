package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkau implements dksm {
    public final dkao a;

    public dkau(dkao dkaoVar) {
        this.a = dkaoVar;
    }

    @Override // defpackage.dksm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final dkaq dkaqVar = (dkaq) obj;
        if (dkaqVar != null) {
            dkao dkaoVar = this.a;
            if (dkaoVar.a.t().contains(new djro(dkaqVar.b()))) {
                dkaqVar.a().filter(new Predicate() { // from class: dkas
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((djtp) obj2).Z();
                    }
                }).ifPresent(new Consumer() { // from class: dkat
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        dkau.this.a.a(new djro(dkaqVar.b()));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        ensk h = dkaw.a.h();
        h.Y(ente.a, "RcsProvisioningManager");
        ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$RcsProvisioningChangeListenerConfigurationObserver", "onUpdate", 1480, "RcsProvisioningManager.java")).q("Unable to notify rcs provisioning change listeners because update is null or sim is not rcs available.");
    }
}
