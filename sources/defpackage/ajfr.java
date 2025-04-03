package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajfr implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BARD_EVENT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new ajgb(ajfq.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: ajfp
            @Override // java.util.function.Supplier
            public final Object get() {
                return (epox) epoy.a.createBuilder();
            }
        };
    }
}
