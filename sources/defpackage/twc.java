package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twc implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_CONTACT_PICKER;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new twj(twb.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: twa
            @Override // java.util.function.Supplier
            public final Object get() {
                return (epub) epuc.a.createBuilder();
            }
        };
    }
}
