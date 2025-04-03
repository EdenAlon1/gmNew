package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmp implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_GROUP;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new BiConsumer() { // from class: ckmn
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eolu eoluVar = (eolu) obj;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eomn eomnVar = (eomn) ((eomj) obj2).build();
                eolv eolvVar2 = eolv.a;
                eomnVar.getClass();
                eolvVar.C = eomnVar;
                eolvVar.b |= 4194304;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: ckmo
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eomj) eomn.a.createBuilder();
            }
        };
    }
}
