package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqow implements azak {
    final /* synthetic */ aqox a;

    public aqow(aqox aqoxVar) {
        this.a = aqoxVar;
    }

    @Override // defpackage.azak
    public final void a(azan azanVar, Map map) {
        if (azanVar != azan.RCS) {
            return;
        }
        Optional e = this.a.e.e();
        if (e.isEmpty() || !map.containsKey(e.get())) {
            return;
        }
        ensz enszVar = (ensz) aqox.a.h();
        enszVar.Y(csux.D, this.a.d());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier$RcsChangeListener", "onBatchCapabilitiesUpdate", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities updated in batch update.");
        aqox aqoxVar = this.a;
        aqoxVar.b.c(new Supplier() { // from class: aqou
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ProviderRcsCapabilitiesSupplier::onBatchCapabilitiesUpdate");
    }

    @Override // defpackage.azak
    public final void b(azan azanVar, awui awuiVar) {
        if (azanVar == azan.RCS && awuiVar.equals((awui) this.a.e.e().orElse(null))) {
            ensz enszVar = (ensz) aqox.a.h();
            enszVar.Y(csux.D, this.a.d());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier$RcsChangeListener", "onCapabilitiesUpdate", 181, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities Updated.");
            aqox aqoxVar = this.a;
            aqoxVar.b.c(new Supplier() { // from class: aqov
                @Override // java.util.function.Supplier
                public final Object get() {
                    return null;
                }
            }, "ProviderRcsCapabilitiesSupplier::onRcsCapabilitiesUpdate");
        }
    }
}
