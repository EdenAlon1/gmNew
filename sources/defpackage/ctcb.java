package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctcb implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_TRANSCODING;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new BiConsumer() { // from class: ctca
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eolu eoluVar = (eolu) obj;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eplp eplpVar = (eplp) ((epll) obj2).build();
                eolv eolvVar2 = eolv.a;
                eplpVar.getClass();
                eolvVar.r = eplpVar;
                eolvVar.b |= 512;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: ctbz
            @Override // java.util.function.Supplier
            public final Object get() {
                return (epll) eplp.a.createBuilder();
            }
        };
    }
}
