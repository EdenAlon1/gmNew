package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttr implements alhi {
    private final eolt a;

    public ttr(eolt eoltVar) {
        eoltVar.getClass();
        this.a = eoltVar;
    }

    @Override // defpackage.alhi
    public final eolt a() {
        return this.a;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new ttu(ttq.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: ttp
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eokc) eokd.a.createBuilder();
            }
        };
    }
}
