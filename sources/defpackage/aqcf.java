package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqcf implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_STAR_EVENT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new BiConsumer() { // from class: aqce
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eolu eoluVar = (eolu) obj;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eqgq eqgqVar = (eqgq) ((eqgp) obj2).build();
                eolv eolvVar2 = eolv.a;
                eqgqVar.getClass();
                eolvVar.aW = eqgqVar;
                eolvVar.e |= 4194304;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: aqcd
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eqgp) eqgq.a.createBuilder();
            }
        };
    }
}
