package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aifp implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.MULTI_SHARE_EVENT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new aifu(aifo.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: aifn
            @Override // java.util.function.Supplier
            public final Object get() {
                return (equk) equt.a.createBuilder();
            }
        };
    }
}
