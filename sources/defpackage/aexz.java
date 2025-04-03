package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aexz implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_SUPER_SORT_EVENT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new BiConsumer() { // from class: aexx
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eolu eoluVar = (eolu) obj;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eqhc eqhcVar = (eqhc) ((eqhb) obj2).build();
                eolv eolvVar2 = eolv.a;
                eqhcVar.getClass();
                eolvVar.aC = eqhcVar;
                eolvVar.d |= 16777216;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: aexy
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eqhb) eqhc.a.createBuilder();
            }
        };
    }
}
