package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgnm implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_MDD_LIB;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new cgnr(cgnl.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: cgnk
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eond) eong.a.createBuilder();
            }
        };
    }
}
