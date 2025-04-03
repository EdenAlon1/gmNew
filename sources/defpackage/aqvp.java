package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqvp implements ffxy {
    final /* synthetic */ aqvs a;

    public aqvp(aqvs aqvsVar) {
        this.a = aqvsVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        this.a.f().set(aqvs.g((cnpk) obj));
        this.a.e().c(new Supplier() { // from class: aqvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SatelliteConnectionStateSupplier::Notify");
        return ffcu.a;
    }
}
