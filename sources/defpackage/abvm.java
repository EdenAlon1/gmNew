package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvm implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.CUSTODIAN_REPORT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new BiConsumer() { // from class: abvl
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eolu eoluVar = (eolu) obj;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                epwo epwoVar = (epwo) ((epwl) obj2).build();
                eolv eolvVar2 = eolv.a;
                epwoVar.getClass();
                eolvVar.aw = epwoVar;
                eolvVar.d |= 131072;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: abvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return (epwl) epwo.a.createBuilder();
            }
        };
    }
}
