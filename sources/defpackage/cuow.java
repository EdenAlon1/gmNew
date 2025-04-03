package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuow implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.HADES_SDK_EVENT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new cuoz(cuov.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: cuou
            @Override // java.util.function.Supplier
            public final Object get() {
                return (erdd) erde.a.createBuilder();
            }
        };
    }
}
