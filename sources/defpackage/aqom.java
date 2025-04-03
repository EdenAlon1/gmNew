package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqom implements azak {
    final /* synthetic */ aqon a;

    public aqom(aqon aqonVar) {
        this.a = aqonVar;
    }

    @Override // defpackage.azak
    public final void a(azan azanVar, Map map) {
        if (azanVar != azan.RCS) {
            return;
        }
        engw g = enpw.c(map.keySet(), this.a.f).d().g();
        if (g.isEmpty()) {
            return;
        }
        ((ensz) ((ensz) aqon.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderBatchRcsCapabilitiesSupplier$RcsChangeListener", "onBatchCapabilitiesUpdate", 209, "ProviderBatchRcsCapabilitiesSupplier.java")).w("%d RCS Capabilities updated in batch update: %s", g.size(), aqny.a((Iterable) Collection.EL.stream(g).map(new Function() { // from class: aqoa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = aqon.a;
                return cskt.b(((awui) obj).d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a)));
        aqon aqonVar = this.a;
        aqonVar.d.c(new Supplier() { // from class: aqok
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ProviderBatchRcsCapabilitiesSupplier::onBatchCapabilitiesUpdate");
    }

    @Override // defpackage.azak
    public final void b(azan azanVar, awui awuiVar) {
        if (azanVar == azan.RCS && this.a.f.contains(awuiVar)) {
            ((ensz) ((ensz) aqon.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderBatchRcsCapabilitiesSupplier$RcsChangeListener", "onCapabilitiesUpdate", 186, "ProviderBatchRcsCapabilitiesSupplier.java")).t("RCS capabilities updated for destination: %s", cskt.b(awuiVar.d));
            aqon aqonVar = this.a;
            aqonVar.d.c(new Supplier() { // from class: aqol
                @Override // java.util.function.Supplier
                public final Object get() {
                    return null;
                }
            }, "ProviderBatchRcsCapabilitiesSupplier::onRcsCapabilitiesUpdate");
        }
    }
}
