package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class debp implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_FEDERATED_LEARNING;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new debv(debo.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: debn
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eolw) eolx.a.createBuilder();
            }
        };
    }
}
