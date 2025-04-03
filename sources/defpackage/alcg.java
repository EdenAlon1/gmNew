package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alcg extends alhh {
    public alcg(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    protected static final eqlj e(int i, int i2, long j) {
        eqlh eqlhVar = (eqlh) eqlj.a.createBuilder();
        eqlhVar.copyOnWrite();
        eqlj eqljVar = (eqlj) eqlhVar.instance;
        eqljVar.c = i - 1;
        eqljVar.b |= 1;
        eqlhVar.copyOnWrite();
        eqlj eqljVar2 = (eqlj) eqlhVar.instance;
        eqljVar2.d = i2 - 1;
        eqljVar2.b |= 2;
        eqlhVar.copyOnWrite();
        eqlj eqljVar3 = (eqlj) eqlhVar.instance;
        eqljVar3.b |= 4;
        eqljVar3.e = (((int) j) / 10) * 10;
        return (eqlj) eqlhVar.build();
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alcd
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eqlj eqljVar = (eqlj) obj2;
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eqljVar.getClass();
                eojjVar.c = eqljVar;
                eojjVar.b = 12;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final int i, final long j) {
        o(new Supplier() { // from class: alcf
            @Override // java.util.function.Supplier
            public final Object get() {
                return alcg.e(3, i, j);
            }
        });
    }

    public final void c(final int i, final long j) {
        o(new Supplier() { // from class: alcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return alcg.e(2, i, j);
            }
        });
    }

    public final void d(final int i, final long j) {
        o(new Supplier() { // from class: alce
            @Override // java.util.function.Supplier
            public final Object get() {
                return alcg.e(4, i, j);
            }
        });
    }
}
