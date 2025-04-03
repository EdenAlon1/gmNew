package defpackage;

import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeog extends eeoi {
    final /* synthetic */ Map a;
    final /* synthetic */ eeos b;

    public eeog(eeos eeosVar, Map map) {
        this.a = map;
        this.b = eeosVar;
    }

    @Override // defpackage.eeon
    public final void a(eeoh eeohVar) {
        eeol eeolVar = eeohVar.a;
        Map map = this.a;
        eeop eeopVar = eeolVar.a;
        if (map.containsKey(eeopVar)) {
            eeop eeopVar2 = (eeop) this.a.get(eeopVar);
            if (this.b.b.a(eeopVar2)) {
                this.b.g((Throwable) eeohVar.a.b().orElseGet(new Supplier() { // from class: eeof
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new eeor();
                    }
                }));
            } else {
                this.b.h(eeopVar2);
            }
        }
    }
}
