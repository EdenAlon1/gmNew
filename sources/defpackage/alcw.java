package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alcw extends alhh {
    public alcw(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alcv
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                epth epthVar = (epth) obj2;
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                epthVar.getClass();
                eojjVar.c = epthVar;
                eojjVar.b = 14;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final int i) {
        o(new Supplier() { // from class: alcu
            @Override // java.util.function.Supplier
            public final Object get() {
                eptf eptfVar = (eptf) epth.a.createBuilder();
                eptfVar.copyOnWrite();
                epth epthVar = (epth) eptfVar.instance;
                epthVar.c = i - 1;
                epthVar.b |= 1;
                return (epth) eptfVar.build();
            }
        });
    }
}
