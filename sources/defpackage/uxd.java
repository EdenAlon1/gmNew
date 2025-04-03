package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uxd implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_SELECTED_MESSAGES_ACTION;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new uxh(uxc.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: uxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return (epiv) epiw.a.createBuilder();
            }
        };
    }
}
