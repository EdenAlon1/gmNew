package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqbx implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.FORWARD_TELEPHONY_SYNC;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new BiConsumer() { // from class: cqbv
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eolu eoluVar = (eolu) obj;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eqqn eqqnVar = (eqqn) ((eqpl) obj2).build();
                eolv eolvVar2 = eolv.a;
                eqqnVar.getClass();
                eolvVar.aN = eqqnVar;
                eolvVar.e |= 1024;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: cqbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eqpl) eqqn.a.createBuilder();
            }
        };
    }
}
